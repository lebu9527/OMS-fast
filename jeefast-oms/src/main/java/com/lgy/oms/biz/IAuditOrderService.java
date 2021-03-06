package com.lgy.oms.biz;

import com.lgy.common.core.domain.CommonResponse;
import com.lgy.oms.disruptor.audit.AuditOrderEvent;
import com.lgy.oms.domain.dto.AuditParamDTO;
import com.lgy.oms.domain.order.OrderMain;


/**
 * @Description 审核订单服务接口
 * @Author LGy
 * @Date 2020/1/7
 */
public interface IAuditOrderService {

    /**
     * 审核订单动作
     *
     * @param orderId 订单号
     * @param param   其它参数
     * @return
     */
    CommonResponse<String> auditOrder(String orderId, AuditParamDTO param);

    /**
     * 完成审单逻辑,更新订单数据
     *
     * @param event 审单事件
     * @return
     */
    CommonResponse<String> afterAuditOrder(AuditOrderEvent event);

    /**
     * 开始审核订单
     * @param orderMain
     * @param param
     * @return
     */
    CommonResponse<String> start(OrderMain orderMain, AuditParamDTO param);
}
