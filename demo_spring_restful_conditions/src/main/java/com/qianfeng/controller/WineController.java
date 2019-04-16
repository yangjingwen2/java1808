package com.qianfeng.controller;

import com.qianfeng.bean.ConditionsVO;
import com.qianfeng.bean.JsonResultVO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/wine")
public class WineController {

    /**
     * z2（葡萄酒）
     * z2-a3 (葡萄酒、法国)
     * @param conditions
     * @param page
     * @return
     */
    @RequestMapping(value = "/{conditions}/{page}",method = RequestMethod.GET)
    public List<ConditionsVO> queryWineListByConditionsAndPage(@PathVariable("conditions") String conditions, @PathVariable("page") int page){

        //页面显示的内容 ：法国、德国

        ConditionsVO conditionsVO1 = new ConditionsVO("法国",conditions+"-a3");
        ConditionsVO conditionsVO2 = new ConditionsVO("德国",conditions+"-a4");

        ArrayList<ConditionsVO> conditionsList = new ArrayList<>();
        conditionsList.add(conditionsVO1);
        conditionsList.add(conditionsVO2);


        return conditionsList;
    }
}
