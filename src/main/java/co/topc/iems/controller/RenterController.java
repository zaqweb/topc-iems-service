package co.topc.iems.controller;

import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Renter;
import co.topc.iems.entity.req.ListRenterReq;
import co.topc.iems.service.IRenterService;
import co.topc.iems.validate.RenterValidateGroup;
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

/**
 * @author fantao
 * @date 2019/7/30 12:17
 */
@RestController
@RequestMapping("renter")
@Api(value = "Renter的操作类")
public class RenterController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IRenterService renterService;

    @JsonView(Renter.ShowList.class)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "查询租客列表", notes = "参数需要指定pageSize和pageNum")
    public TopcWebResponse getRenterList(@Validated ListRenterReq listRenterReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getRenterList param{}", JSON.toJSONString(listRenterReq));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Page<Renter> renterPage = renterService.getRenterList(listRenterReq);

        topcWebResponse.setData(PageUtil.getData(renterPage));
        return topcWebResponse;
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.GET)
    @ApiOperation(value = "查看租客详情")
    public TopcWebResponse getRenterDetail(@RequestParam("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("getRenterDetail param{}", JSON.toJSONString(pkId));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Renter renterDetail = renterService.getRenterDetail(pkId);

        topcWebResponse.setData(renterDetail);
        return topcWebResponse;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "新增租客")
    public TopcWebResponse addRenter(@RequestBody @Validated(RenterValidateGroup.Insert.class) Renter renter) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("addRenter param{}", JSON.toJSONString(renter));
        }
        if (null == renter) {
            // 此处应该可以自定义错误原因
            return TopcWebResponseUtil.getFaile();
        }
        try {
            renterService.addRenter(renter);
        } catch (Exception e) {
            logger.error("addRenter exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "修改租客")
    public TopcWebResponse updateRenter(@RequestBody @Validated(RenterValidateGroup.Update.class) Renter renter) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("updateRenter param{}", JSON.toJSONString(renter));
        }
        try {
            renterService.updateRenter(renter);
        } catch (Exception e) {
            logger.error("updateRenter exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除租客")
    public TopcWebResponse deleteRenter(@RequestParam("pkId") String pkId) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("deleteRenter param{}", JSON.toJSONString(pkId));
        }
        try {
            renterService.deleteRenter(pkId);
        } catch (Exception e) {
            logger.error("deleteRenter exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }
}
