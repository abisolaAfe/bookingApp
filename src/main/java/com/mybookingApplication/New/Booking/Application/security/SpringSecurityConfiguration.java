package com.mybookingApplication.New.Booking.Application.security;


//@Configuration
//@EnableWebSecurity
public class SpringSecurityConfiguration  {

//	 public void addViewControllers(ViewControllerRegistry registry) {
//	        registry.addViewController("/add-worker").setViewName("add-worker");
//	        registry.addViewController("/").setViewName("home");
//	        registry.addViewController("/hello").setViewName("hello");
//	        registry.addViewController("/login").setViewName("login");
//	    }

	
	
	
//	
//	@Bean
// SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//	 	http
//        .authorizeHttpRequests()
//        .requestMatchers("/add-worker", "/**").permitAll()
//        .anyRequest().authenticated()
//        .and()
//        .logout()
//        .permitAll () ;
//	 http.formLogin(Customizer.withDefaults());
//     return http.build();
		//.formLogin(withDefaults())
																		//	.formLogin(withDefaults())
																		    //csrf().disable();
																		//	.headers().frameOptions().sameOrigin()
																			
//}

//@Bean
//@Order(1)
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//	 http
//	 .authorizeHttpRequests(authorize -> authorize.requestMatchers("/add-worker").permitAll()
//								); //but it works perfectly for(("/**") likewise every other solution but not working for my URL
//							    http.formLogin(Customizer.withDefaults());
//							    http.csrf(csrf -> csrf.disable());
//							   http.headers(header -> header.frameOptions(frameOptions -> frameOptions.disable()));
// 
//    return http.build();
//}
//
//@Bean
//public SecurityFilterChain securityFilterChainDefault(HttpSecurity http) throws Exception {
//	 http.authorizeHttpRequests(
//	            auth -> auth.anyRequest().authenticated()
//	    );
//	  
//	    http.formLogin(Customizer.withDefaults());
//	    http.csrf(csrf -> csrf.disable());
//	    http.headers(header -> header.frameOptions(frameOptions -> frameOptions.disable()));
//	    return http.build();
//}

//@Bean
//public UserDetailsService userDetailsService() {
//	InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//	manager.createUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());
//	return manager;
//}



//@Bean
//public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//	http.authorizeHttpRequests()
//        .requestMatchers("/add-worker")
//        .permitAll()
//        .and()
//        .authorizeHttpRequests()
//        .requestMatchers("/customers/**")
//        .hasRole("ADMIN")
//        .anyRequest()
//        .authenticated()
//        .and()
//        .httpBasic();
//    return http.build();
//}

	
//	public SecurityFilterChain restSecurityFilterChain(HttpSecurity http) throws Exception {
//	    http.securityMatcher("/add-worker", "/actuator/*").authorizeHttpRequests().requestMatchers("/add-worker")
//	   . permitAll() .anyRequest().authenticated();
//	    http.csrf().disable();
//	    return http.build();
//	}


//@Bean
//public WebSecurityCustomizer webSecurityCustomizer() {
//    return (web) -> web.ignoring().requestMatchers("/add-worker/**");
//}
//	
//	@Bean
//	public  PasswordEncoder passwordEncorder() {
//	return new BCryptPasswordEncoder();	
//		
//	}



}
