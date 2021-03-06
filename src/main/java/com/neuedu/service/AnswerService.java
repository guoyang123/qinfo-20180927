package com.neuedu.service;

import com.neuedu.entity.QAnswer;
import com.neuedu.entity.Question;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;


public interface AnswerService {
    /**保存问卷信息*/
    void saveBatch(List<QAnswer> qAnswerList);
    /**查询问卷信息*/
    List<QAnswer> findAllByQno(String qno,HttpServletResponse response);
    /**将java数据写入到excel*/
    String writeObject2Excel(List<QAnswer> qAnswerList,HttpServletResponse response);
     String downloadFile( HttpServletResponse response,File file);

}
