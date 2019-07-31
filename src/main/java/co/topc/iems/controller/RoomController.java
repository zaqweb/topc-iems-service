package co.topc.iems.controller;

import co.topc.iems.common.util.PageUtil;
import co.topc.iems.entity.Room;
import co.topc.iems.entity.req.RoomListReq;
import co.topc.iems.service.IRoomService;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantao
 * @date 2019/7/30 12:17
 */
@RestController
@RequestMapping("room")
public class RoomController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IRoomService roomService;

    @GetMapping(value = "/list")
    public TopcWebResponse getRoomList(RoomListReq roomListReq) {
        if (logger.isInfoEnabled()) {
            logger.info("getRoomList请求参数{}", JSON.toJSONString(roomListReq));
        }
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        Page<Room> roomPage = roomService.getRoomList(roomListReq);

        topcWebResponse.setData(PageUtil.getData(roomPage));
        return topcWebResponse;
    }
}
