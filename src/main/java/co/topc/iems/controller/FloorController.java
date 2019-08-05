package co.topc.iems.controller;

import co.topc.iems.common.util.Constant;
import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Floor;
import co.topc.iems.entity.req.ListFloorReq;
import co.topc.iems.service.IFloorService;
import co.topc.iems.validate.FloorValidateGroup;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.constants.TopcWebResponseEnum;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonView;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author RuntimeExcepti0n
 * @date 2019/8/3 19:48
 */
@RestController
@RequestMapping("floor")
@Api(value = "FLoor的操作类")
public class FloorController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IFloorService floorService;

    @JsonView(Floor.ShowList.class)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询楼层列表", notes = "参数需要指定pageSize")
    public TopcWebResponse getFloorList(@Validated ListFloorReq listFloorReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getFloorList请求参数{}", JSON.toJSONString(listFloorReq));
        }
        Page<Floor> floorPage = floorService.getFloorList(listFloorReq);
        return TopcWebResponseUtil.getSuccess(PageUtil.getData(floorPage));
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "新增楼层")
    public TopcWebResponse insertFloor(@RequestBody @Validated(FloorValidateGroup.Insert.class) Floor floor) {
        if (logger.isInfoEnabled()) {
            logger.info("insertFloor请求参数{}", JSON.toJSONString(floor));
        }
        int result = floorService.addFloor(floor);
        if (result > 0) {
            return TopcWebResponseUtil.getSuccess();
        } else {
            return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.FAILURE.getCode(), "新增楼层失败", "");
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "修改楼层属性")
    public TopcWebResponse updateFloor(@RequestBody @Validated(FloorValidateGroup.Update.class) Floor floor) {
        if (logger.isInfoEnabled()) {
            logger.info("updateFloor请求参数{}", JSON.toJSONString(floor));
        }
        TopcWebResponse webResponse = TopcWebResponseUtil.getSuccess();
        Floor oldFloor = floorService.getFloorDetail(floor.getPkId());
        if (null == oldFloor) {
            webResponse.setMessage("该记录不存在，无法修改");
            webResponse.setCode(TopcWebResponseEnum.FAILURE.getCode());
            return webResponse;
        }
        if (!oldFloor.getPkId().equals(floor.getPkId())) {
            webResponse.setMessage("id不能修改");
            webResponse.setCode(TopcWebResponseEnum.FAILURE.getCode());
            return webResponse;
        }
        keepOld(floor, oldFloor);
        int result = floorService.updateFloor(floor);
        if (result > 0) {
            return TopcWebResponseUtil.getSuccess("修改成功");
        } else {
            return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.FAILURE.getCode(), "修改楼层失败", "");

        }
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除指定楼层")
    public TopcWebResponse deleteFloor(@PathVariable("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("deleteFloor请求参数{}", JSON.toJSONString(pkId));
        }
        Floor oldFloor = floorService.getFloorDetail(pkId);
        if (null == oldFloor) {
            TopcWebResponse webResponse = TopcWebResponseUtil.getSuccess();
            webResponse.setMessage("该记录不存在，无法删除");
            webResponse.setCode(TopcWebResponseEnum.FAILURE.getCode());
            return webResponse;
        }
        oldFloor.setIsDeleted(Constant.STIRNG_Y);
        int result = floorService.updateFloor(oldFloor);
        if (result > 0) {
            return TopcWebResponseUtil.getSuccess("删除成功");
        } else {
            return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.FAILURE.getCode(), "删除楼层失败", "");
        }
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.GET)
    @ApiOperation(value = "查询楼层详情")
    public TopcWebResponse getFloorDetail(@PathVariable("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("getFloorDetail请求参数{}", JSON.toJSONString(pkId));
        }
        Floor result = floorService.getFloorDetail(pkId);
        return TopcWebResponseUtil.getSuccess(result);
    }

    private void keepOld(Floor floor, Floor oldFloor) {
        floor.setLesseeId(oldFloor.getLesseeId());
        floor.setIsDeleted(oldFloor.getIsDeleted());
        floor.setUpdateTime(new Date());
        floor.setCreateTime(oldFloor.getCreateTime());
        floor.setCreateBy(oldFloor.getCreateBy());
        floor.setUpdateBy("System");
    }
}
