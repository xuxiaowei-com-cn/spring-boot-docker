package cn.com.xuxiaowei.actuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户 {@link RestController}
 *
 * @author xuxiaowei
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

    /**
     * 用户信息
     *
     * @param request  请求
     * @param response 响应
     * @return 返回 用户信息
     */
    @RequestMapping("/info")
    public Map<String, Object> info(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>(8);
        map.put("username", "xuxiaowei");
        map.put("name", "徐晓伟");
        map.put("sex", "男");
        return map;
    }

}
