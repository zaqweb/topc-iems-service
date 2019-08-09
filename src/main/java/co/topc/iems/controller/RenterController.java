package co.topc.iems.controller;

import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Renter;
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
@Api(value = "renter的操作类")
public class RenterController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IRenterService renterService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @JsonView(Renter.ShowList.class)
    @ApiOperation(value = "查询renter列表", notes = "参数需要指定pageSize和pageNum")
    public TopcWebResponse getRenterList(@Validated Renter renter) {
        if (logger.isInfoEnabled()) {
            logger.info("getRenterList param{}", JSON.toJSONString(renter));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Page<Renter> renterPage = renterService.getRenterList(renter);

        topcWebResponse.setData(PageUtil.getData(renterPage));
        return topcWebResponse;
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.GET)
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
