package com.android.dev.data.db;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DaoGenerator {

    public static void main (String[] args) {
        String pkg = DaoGenerator.class.getPackage().getName();
        Schema schema = new Schema(1000, pkg);
        createLocationTable(schema);
        createPostTable(schema);
        try {
            new de.greenrobot.daogenerator.DaoGenerator().generateAll(schema,
                    "/Users/mahuiyang/DevTools/StudioProjects/Android_Dev/dev_data/src/main/java-gen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *  创建帖子信息表
     * @param schema
     */
    private static void createPostTable (Schema schema) {
        Entity entity = schema.addEntity("PostInfo");
        entity.addIdProperty();
        entity.addStringProperty("content");//描述内容
        entity.addIntProperty("rate");//评价级别
        entity.addLongProperty("locationId");//场地位置ID
        entity.addLongProperty("createTime");//创建时间
        entity.addLongProperty("updateTime");//更新时间
    }

    /**
     *  创建场地/位置表
     * @param schema
     */
    private static void createLocationTable (Schema schema) {
        Entity entity = schema.addEntity("LocationInfo");
        entity.addIdProperty();//ID
        entity.addLongProperty("longitude");//经度
        entity.addLongProperty("latitude");//纬度
        entity.addStringProperty("name");//场所名称
        entity.addLongProperty("createTime");//创建时间
        entity.addLongProperty("updateTime");//更新时间
    }


}
