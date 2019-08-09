package co.topc.iems.controller;

import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Room;
import co.topc.iems.service.IRoomService;
import co.topc.iems.validate.RoomValidateGroup;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.constants.TopcWebResponseEnum;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
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
@RequestMapping("room")
@Api(value = "room的操作类")
public class RoomController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IRoomService roomService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public TopcWebResponse getRoomList(@Validated Room listRoomReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getRoomList param{}", JSON.toJSONString(listRoomReq));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Page<Room> roomPage = roomService.getRoomList(listRoomReq);

        topcWebResponse.setData(PageUtil.getData(roomPage));
        return topcWebResponse;
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.GET)
    public TopcWebResponse getRoomDetail(@RequestParam("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("getRoomDetail param{}", JSON.toJSONString(pkId));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Room roomDetail = roomService.getRoomDetail(pkId);

        topcWebResponse.setData(roomDetail);
        return topcWebResponse;
    }

    @RequestMapping(method = RequestMethod.POST)
    public TopcWebResponse addRoom(@RequestBody @Validated(RoomValidateGroup.Insert.class) Room addRoomReq) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("addRoom param{}", JSON.toJSONString(addRoomReq));
        }
        if (null == addRoomReq) {
            // 此处应该可以自定义错误原因
            return TopcWebResponseUtil.getFaile();
        }
        try {
            roomService.addRoom(addRoomReq);
        } catch (Exception e) {
            logger.error("addRoom exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TopcWebResponse updateRoom(@RequestBody @Validated(RoomValidateGroup.Update.class) Room updateRoomReq) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("updateRoom param{}", JSON.toJSONString(updateRoomReq));
        }
        try {
            roomService.updateRoom(updateRoomReq);
        } catch (Exception e) {
            logger.error("updateRoom exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }

    @RequestMapping(value = "/{pkId}", method = RequestMethod.DELETE)
    public TopcWebResponse deleteRoom(@RequestParam("pkId") String pkId) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("deleteRoom param{}", JSON.toJSONString(pkId));
        }
        try {
            roomService.deleteRoom(pkId);
        } catch (Exception e) {
            logger.error("deleteRoom exception", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getMessage());
        }
        return topcWebResponse;
    }
}
