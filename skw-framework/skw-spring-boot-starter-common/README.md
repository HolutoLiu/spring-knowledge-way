# 内部工具包
## 基础公共包 : common-spring-boot-starter 

#### 工具类不在项目启动类的子目录下怎么办
common-spring-boot-starter 项目已经在 META-INF/spring.factories 进行引用了大部分的工具类

还有一些按需工具类，可以在使用的项目的 META-INF/spring.factories 进行引用加载

#### 按需主动加载项目如下：

- ExceptionHandlerAdvice : Controller统一异常处理
- FeignInterceptorConfig : feign拦截器：token传递、 traceid传递

```properties
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
ExceptionHandlerAdvice,\
FeignInterceptorConfig
```

#### common已经含有加载配置，通过配置文件按需开启与关闭的一些工具类

```yaml

```

#### 启动幂等拦截器：

在项目中添加@EnableApiIdempotent注解

```
@EnableApiIdempotent
```
