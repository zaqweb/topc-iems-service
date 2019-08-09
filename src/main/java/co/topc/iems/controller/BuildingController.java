package co.topc.iems.controller;

import co.topc.iems.common.util.Constant;
import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Building;
import co.topc.iems.entity.req.ListBuildingReq;
import co.topc.iems.service.IBuildingService;
import co.topc.iems.validate.BuildingValidateGroup;
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
 * @date 2019/8/1 0:21
 */
@RestController
@RequestMapping("building")
@Api(value = "Building的操作类")
public class BuildingController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IBuildingService buildingService;

    @JsonView(Building.ShowList.class)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询楼宇列表", notes = "参数需要指定pageSize")
    public TopcWebResponse getBuildingList(@Validated ListBuildingReq buildingReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getBuildingList请求参数{}", JSON.toJSONString(buildingReq));
        }
        Page<Building> buildingPage = buildingService.getBuildingList(buildingReq);
        return TopcWebResponseUtil.getSuccess(PageUtil.getData(buildingPage));
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "新增楼宇")
    public TopcWebResponse insertBuilding(@RequestBody @Validated(BuildingValidateGroup.Insert.class) Building building) {
        if (logger.isInfoEnabled()) {
            logger.info("insertBuilding请求参数{}", JSON.toJSONString(building));
        }
        int result = buildingService.addBuilding(building);
        if (result > 0) {
            return TopcWebResponseUtil.getSuccess();
        } else {
            return TopcWebResponseUtil.getFaile();
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "修改楼宇属性")
    public TopcWebResponse updateBuilding(@RequestBody @Validated(BuildingValidateGroup.Update.class) Building building) {
        if (logger.isInfoEnabled()) {
            logger.info("updateBuilding请求参数{}", JSON.toJSONString(building));
        }
        TopcWebResponse webResponse = TopcWebResponseUtil.getSuccess();
        Building oldBuilding = buildingService.getBuildingDetail(building.getPkId());
        if (null == oldBuilding) {
            webResponse.setMessage("该记录不存在，无法修改");
            webResponse.setCode(TopcWebResponseEnum.FAILURE.getCode());
            return webResponse;
        }
        if (!oldBuilding.getPkId().equals(building.getPkId())) {
            webResponse.setMessage("id不能修改");
            webResponse.setCode(TopcWebResponseEnum.FAILURE.getCode());
            return webResponse;
        }
        keepOld(building, oldBuilding);
        int result = buildingService.updateBuilding(building);
        if (result > 0) {
            return TopcWebResponseUtil.getSuccess("修改成功");
        } else {
            return TopcWebResponseUtil.getFaile();
        }
    }

    private void keepOld(Building building, Building oldBuilding) {
        building.setLesseeId(oldBuilding.getLesseeId());
        building.setIsDeleted(oldBuilding.getIsDeleted());
        building.setUpdateTime(new Date());
        building.setCreateTime(oldBuilding.getCreateTime());
        building.setCreateBy(oldBuilding.getCreateBy());
        building.setUpdateBy("System");
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除指定楼宇")
    public TopcWebResponse deleteBuilding(@PathVariable("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("deleteBuilding请求参数{}", JSON.toJSONString(pkId));
        }
        Building oldBuilding = buildingService.getBuildingDetail(pkId);
        if (null == oldBuilding) {
            TopcWebResponse webResponse = TopcWebResponseUtil.getSuccess();
            webResponse.setMessage("该记录不存在，无法删除");
            webResponse.setCode(TopcWebResponseEnum.FAILURE.getCode());
            return webResponse;
        }
        oldBuilding.setIsDeleted(Constant.STIRNG_Y);
        int result = buildingService.updateBuilding(oldBuilding);
        if (result > 0) {
            return TopcWebResponseUtil.getSuccess("删除成功");
        } else {
            return TopcWebResponseUtil.getFaile();
        }
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.GET)
    @ApiOperation(value = "查询楼宇详情")
    public TopcWebResponse getBuildingDetail(@PathVariable("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("getBuildingDetail请求参数{}", JSON.toJSONString(pkId));
        }
        Building result = buildingService.getBuildingDetail(pkId);
        return TopcWebResponseUtil.getSuccess(result);
    }
}
