package com.service;

import com.domain.En_Inv;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface EnterService {
    /**
     * ???????????????????????????????????????????????????????
     */
    boolean selectOrgcode(String orgcode);
    /**
     * ??????????????????????????????????
     */
    boolean SaveEnterandInv(HttpServletRequest request, Object obj, List<En_Inv> list);

    /**
     * ????????????
     */
    void dynamicSelectEnter(HttpServletRequest request, Map<String, Object> map, int pageSize, int pageNo);
}
