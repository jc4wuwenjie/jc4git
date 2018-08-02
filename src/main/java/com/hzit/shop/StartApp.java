package com.hzit.shop;

import com.hzit.shop.controller.GoosInfoController;
import com.hzit.shop.dao.GoodinfoDao;
import com.hzit.shop.services.GoodsInfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/8/2-9:19
 * @Description
 */
public class StartApp {

    public static void main(String[] args) {
        while(true) {
            //根据指定的spring配置文件，创建了一个容器对象。
            ApplicationContext shijie = new ClassPathXmlApplicationContext("applicationContext.xml");
            //通过bean的id属性值去容器中找对象
            GoosInfoController kong = shijie.getBean("controller", GoosInfoController.class);
            kong.find();
            kong.save();

            //让当前线程休息2000毫秒
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //通过bean的class属性值去容器中找对象
        /*GoodinfoDao dao=shijie.getBean(GoodinfoDao.class);
        dao.getTotalCount();*/

        //通过bean的class属性值和id属性去容器中找对象
     /*   GoodinfoDao dao2=shijie.getBean("dao2",GoodinfoDao.class);
        dao2.getTotalCount();*/




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
