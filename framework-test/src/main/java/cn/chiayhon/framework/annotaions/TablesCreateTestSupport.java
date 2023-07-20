package cn.chiayhon.framework.annotaions;

import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlMergeMode;

import java.lang.annotation.*;

/**
 * 建表语句sql脚本支持
 * 默认会加载位于类路径下sql文件夹中名字为drop_tables和create_tables的sql脚本
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Sql(scripts = {"classpath:./sql/drop_tables.sql", "classpath:./sql/create_tables.sql"})
@SqlMergeMode(SqlMergeMode.MergeMode.MERGE)
public @interface TablesCreateTestSupport {
}
