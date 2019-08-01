package co.topc.iems.common.util;

import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * 分页工具类
 *
 * @author fantao
 * @date 2019/7/31 12:37
 */
public class PageUtil {

    public static Map<String, Object> getData(Page<?> pageInfo) {
        Map<String, Object> resultMap = new HashMap<>(2);
        resultMap.put("rows", pageInfo.getResult());
        resultMap.put("totalRecord", pageInfo.getTotal());

        return resultMap;
    }
}
