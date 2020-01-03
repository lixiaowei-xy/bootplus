package com.lxiaow.bootplus.generate;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MybatisPlusGenerate
 * @Description: TODO
 * @Author lxw
 * @Date 2020/1/3
 **/
public class MybatisPlusGenerate {

    /**
     * 代码生成作者
     */
    private static final String AUTHOR = "lXiaow";
    /**
     * 代码生成目录
     */
    private static final String OUTPUTDIR = "D:\\Project\\bootplus\\src\\main\\java";
    /**
     * 包名
     */
    private static final String PARENT = "com.lxiaow.bootplus.business.admin";
    /**
     * 需要生成的表名
     */
    private static final String TABLT_NAME = "M_ADMIN";
    /**
     * 生成的controller名字前缀
     */
    private static final String CONTROLLER_NAME = "admin";
    /**
     * 生成的entity名字前缀
     */
    private static final String ENTITY_NAME = "admin";
    /**
     * 生成的service名字前缀
     */
    private static final String SERVICE_NAME  = "admin";
    /**
     * 生成的Mapper名字前缀
     */
    private static final String MAPPER_NAME = "admin";
    /**
     * 数据库相关配置
     */
    private static final String URL = "jdbc:mysql://101.132.165.149:3306/bootTest?useUnicode=true&characterEncoding=utf8";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "dragon";

    public static void main(String[] args) {
        AutoGenerator generator  = new AutoGenerator();
        //选择 freemarker 引擎，默认模板为Veloctiy
        generator .setTemplateEngine(new FreemarkerTemplateEngine());
        //全局配置
        GlobalConfig globalConfig  = new GlobalConfig();
        globalConfig .setAuthor(AUTHOR);//作者
        globalConfig .setOutputDir(OUTPUTDIR);//输出地址
        globalConfig .setFileOverride(false);// 是否覆盖同名文件，默认是false
        globalConfig .setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        globalConfig .setEnableCache(false);// XML 二级缓存
        globalConfig .setBaseResultMap(true);// XML ResultMap
        globalConfig .setBaseColumnList(false);// XML columList
        globalConfig.setOpen(false);
        /* 自定义文件命名，注意 %s 会自动填充表实体属性！ */
        globalConfig .setMapperName(CONTROLLER_NAME + "Mapper");//mapper接口名字
        //globalConfig .setXmlName(ENTITY_NAME + "Mapper");//mapper映射xml名字
        globalConfig .setServiceName(SERVICE_NAME + "Service");//service文件
        globalConfig .setServiceImplName(SERVICE_NAME + "ServiceImpl");//serviceImpl名字
        globalConfig .setControllerName(CONTROLLER_NAME + "Controller");//controller名字
        generator .setGlobalConfig(globalConfig );

        //配置数据源
        DataSourceConfig dataSourceConfig  = new DataSourceConfig();
        dataSourceConfig .setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName(DRIVER);
        dataSourceConfig.setUrl(URL);
        dataSourceConfig.setUsername(USERNAME);
        dataSourceConfig.setPassword(PASSWORD);
        generator.setDataSource(dataSourceConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // 此处可以修改为您的表前缀
        //strategy.setTablePrefix(new String[] { "user_" });
        strategy.setNaming(NamingStrategy.nochange);// 表名生成策略
        strategy.setInclude(new String[] { TABLT_NAME }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);
        generator.setStrategy(strategy);

        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(PARENT);
        packageConfig.setController("controller");
        generator.setPackageInfo(packageConfig);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };
//
//        // 自定义 xxList.jsp 生成
       List<FileOutConfig> focList = new ArrayList<>();
//        focList.add(new FileOutConfig("/template/list.jsp.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D://my_" + tableInfo.getEntityName() + ".jsp";
//            }
//        });
//        cfg.setFileOutConfigList(focList);
//        generator.setCfg(cfg);
//
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return "src/main/resources/mappers/" + tableInfo.getMapperName() + ".xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        generator.setCfg(cfg);

        // 关闭默认 xml 生成，调整生成 至 根目录，不会再java下生成xml文件
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        generator.setTemplate(tc);

        // 执行生成
        generator.execute();
    }
}
