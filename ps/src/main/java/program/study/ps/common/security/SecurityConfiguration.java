package program.study.ps.common.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
	
	// プロパティファイルより取得
	@Value("${security.config:true}") 
    private boolean secure;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception{
    	if(secure) {
    		// 認証オン
    		super.configure(http);
    	}else {
    		// 認証オフ
    		http.authorizeRequests().antMatchers("/").permitAll();
    	}
    }
}