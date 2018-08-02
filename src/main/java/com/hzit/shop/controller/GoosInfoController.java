package com.hzit.shop.controller;

import com.hzit.shop.services.GoodsInfoService;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/8/2-11:44
 * @Description
 */
public class GoosInfoController {

        //控制器依赖业务逻辑
    private GoodsInfoService goodsInfoService;

    public GoodsInfoService getGoodsInfoService() {
        return goodsInfoService;
    }

    public void setGoodsInfoService(GoodsInfoService goodsInfoService) {
        this.goodsInfoService = goodsInfoService;
    }

    public void save(){
        System.out.println("控制器调用增加的业务逻辑");
        goodsInfoService.saveGoodsinfo();
    }

    public void find(){
        System.out.println("控制器调用查询的查询逻辑");
        goodsInfoService.findGoodsinfo();
    }
}
/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
