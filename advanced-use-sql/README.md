# Advanced - use sql
> 这个项目使用 `DataSource` 数据源提供用户信息, 需要自己写sql语句.
> 在 [Basic](../basic) 的基础上,仅修改`configureGlobal` 方法中的内容即可.
```java
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor(onConstructor = @__(@Autowired)) // 为所有构造器添加@Autowire注解, 加了onConstructor属性之后,不用为每个final类型的字段加@Autowired注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final javax.sql.DataSource dataSource;

    protected void configure(HttpSecurity http) throws Exception {
            // 此处配置不用改变, 保持Basic中的样子
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource) // 需要注入javax.sql.DataSource
                .usersByUsernameQuery("select username,password, enabled from users where username=?") // 指定查询用户信息的sql语句
                .authoritiesByUsernameQuery("select username, role from user_roles where username=?"); // 指定查询用户权限的sql语句
    }
}
```