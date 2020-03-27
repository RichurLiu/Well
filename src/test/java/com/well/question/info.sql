1.通过mybatis-plus查询数据库返回timestamp为空
https://blog.csdn.net/puhaiyang/article/details/79183638

2.链截数据库连不上
mysql url加上:?serverTimezone=UTC

3.Runner org.junit.internal.runners.ErrorReportingRunner (used on class cn.star.MybatisTest)
将import org.junit.jupiter.api.Test; 替换为 import org.junit.Test;