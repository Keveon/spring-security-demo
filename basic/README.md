# Basic
> 这个项目仅提供最简单的入门操作

```java
@Configuration          // 告诉Spring,这是一个配置类, 这个注解是必须的
@EnableWebSecurity      // 启用Security
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
        protected void configure(HttpSecurity http) throws Exception {        
            http.authorizeRequests()
                .antMatchers("/", "/home").permitAll().anyRequest().authenticated()     // 指定任意请求、任意用户、未登录也可以访问的地址
                .and().formLogin().loginPage("/login").permitAll()                      // 指定登录地址
                .and().logout().permitAll();                                            // 指定退出地址
        }
    
        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()       // 在内存中创建用户, 指定密码及权限．
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("USER", "ADMIN");
        }
}
```