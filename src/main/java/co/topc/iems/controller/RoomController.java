package co.topc.iems.controller;

import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Room;
import co.topc.iems.entity.req.AddRoomReq;
import co.topc.iems.entity.req.ListRoomReq;
import co.topc.iems.entity.req.UpdateRoomReq;
import co.topc.iems.service.IRoomService;
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
@RequestMapping("room")
public class RoomController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private String message;

    @Autowired
    private IRoomService roomService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public TopcWebResponse getRoomList(ListRoomReq listRoomReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getRoomList param{}", JSON.toJSONString(listRoomReq));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Page<Room> roomPage = roomService.getRoomList(listRoomReq);

        topcWebResponse.setData(PageUtil.getData(roomPage));
        return topcWebResponse;
    }

    @GetMapping("/{pkId}")
    public TopcWebResponse getRoomDetail(@RequestParam("pkId") String pkId) {
        if (logger.isInfoEnabled()) {
            logger.info("getRoomDetail param{}", JSON.toJSONString(pkId));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Room roomDetail = roomService.getRoomDetail(pkId);

        topcWebResponse.setData(roomDetail);
        return topcWebResponse;
    }

    @PostMapping
    public TopcWebResponse addRoom(@RequestBody AddRoomReq addRoomReq) {
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
            message = "addRoom exception";
            logger.error(message, e);
            topcWebResponse.setCode(TopcWebResponseEnum.INSERT_ERROR.getCode());
            topcWebResponse.setMessage(message);
        }
        return topcWebResponse;
    }

    @PutMapping
    public TopcWebResponse updateRoom(@RequestBody UpdateRoomReq updateRoomReq) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("updateRoom param{}", JSON.toJSONString(updateRoomReq));
        }
        try {
            roomService.updateRoom(updateRoomReq);
        } catch (Exception e) {
            message = "updateRoom exception";
            logger.error(message, e);
            topcWebResponse.setCode(TopcWebResponseEnum.UPDATE_ERROR.getCode());
            topcWebResponse.setMessage(message);
        }
        return topcWebResponse;
    }

    @DeleteMapping("/{pkId}")
    public TopcWebResponse deleteRoom(@RequestParam("pkId") String pkId) {
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        if (logger.isInfoEnabled()) {
            logger.info("deleteRoom param{}", JSON.toJSONString(pkId));
        }
        try {
            roomService.deleteRoom(pkId);
        } catch (Exception e) {
            message = "deleteRoom exception";
            logger.error(message, e);
            topcWebResponse.setCode(TopcWebResponseEnum.DELETE_ERROR.getCode());
            topcWebResponse.setMessage(message);
        }
        return topcWebResponse;
    }
}
