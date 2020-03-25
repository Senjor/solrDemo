/**
 * Copyright (C), 2009-2020
 * FileName: User
 * Author:   laosun
 * Date:     2020/3/25 1:38 下午
 * Description:
 */
package com.laosun.solrdemo.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

@Data
public class User implements Serializable {

    //必须实现可序列化接口，要在网络上传输
    @Field("id")//使用这个注释，里面的名字是根据你在solr数据库中配置的来决定
    private String id;
    @Field("item_name")
    private String name;
    @Field("item_sex")
    private String sex;
    @Field("item_address")
    private String address;
    @Field("item_host")
    private Integer host;

}
