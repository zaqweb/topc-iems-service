package co.topc.iems.controller;

import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Renter;
import co.topc.iems.entity.req.AddRenterReq;
import co.topc.iems.entity.req.ListRenterReq;
import co.topc.iems.entity.req.UpdateRenterReq;
import co.topc.iems.service.IRenterService;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.constants.TopcWebResponseEnum;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fantao
 * @date 2019/7/30 12:17
 */
@RestController
@RequestMapping("renter")
public class RenterController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IRenterService renterService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public TopcWebResponse getRenterList(ListRenterReq listRenterReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getRenterList param{}", JSON.toJSONString(listRenterReq));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Page<Renter> renterPage = renterService.getRenterList(listRenterReq);

        topcWebResponse.setData(PageUtil.getData(renterPage));
        return topcWebResponse;
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.GET)
    public TopcWebResponse getRenterDetail(@RequestParam("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("getRenterDetail param{}", JSON.toJSONString(pkId));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Renter RenterDetail = renterService.getRenterDetail(pkId);

        topcWebResponse.setData(RenterDetail);
        return topcWebResponse;
    }

    @RequestMapping(method = RequestMethod.POST)
    public TopcWebResponse addRenter(@RequestBody AddRenterReq addRenterReq) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("addRenter param{}", JSON.toJSONString(addRenterReq));
        }
        if (null == addRenterReq) {
            // 此处应该可以自定义错误原因
            return TopcWebResponseUtil.getFaile();
        }
        try {
            renterService.addRenter(addRenterReq);
        } catch (Exception e) {
            logger.error("addRenter exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TopcWebResponse updateRenter(@RequestBody UpdateRenterReq updateRenterReq) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("updateRenter param{}", JSON.toJSONString(updateRenterReq));
        }
        try {
            renterService.updateRenter(updateRenterReq);
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
