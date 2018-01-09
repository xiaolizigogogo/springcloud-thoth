package com.prometheus.thoth.ai.service.impl;

import com.prometheus.thoth.ai.service.CollectService;
import com.prometheus.thoth.common.model.JsonResult;
import com.prometheus.thoth.common.util.HttpClientUtils;
import org.apache.http.HttpResponse;

/**
 * 采集
 */
public class CollectServiceImpl implements CollectService {


    @Override
    public void test() {
        String url="http://zq.win007.com/jsData/matchResult/2017-2018/s36.js?version=2018010922";
        try{
            HttpClientUtils.postJsonDataMethod(url,null);
        }
      catch(Exception e){

      }
    }

    @Override
    public void test2() {

    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {

    }
    public static void main(String args []){
        String url="http://zq.win007.com/jsData/matchResult/2017-2018/s36.js?version=2018010922";
        try{
            HttpResponse response=HttpClientUtils.getRequestMethod(url);
            System.out.println(HttpClientUtils.getContent(response));
        }
        catch(Exception e){
    e.printStackTrace();
        }
    }
}
