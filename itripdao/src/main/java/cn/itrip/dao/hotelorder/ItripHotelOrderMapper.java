package cn.itrip.dao.hotelorder;

import cn.itrip.beans.pojo.ItripHotelOrder;

import java.util.List;
import java.util.Map;

public interface ItripHotelOrderMapper {
    //通过条件查询【爱旅行项目的酒店订单列表】
    public List<ItripHotelOrder> getItripHotelOrderListByMap(Map<String, Object> param)throws Exception;
    //更新爱旅行项目的酒店订单
    public Integer updateItripHotelOrder(ItripHotelOrder itripHotelOrder)throws Exception;

}
