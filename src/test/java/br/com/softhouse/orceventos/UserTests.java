//package br.com.softhouse.orceventos;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class UserTests extends SuperTest {
//
//    private Logger logger = LoggerFactory.getLogger(UserTests.class);
//
//    @Autowired
//    private UserRepository userRepository;
//
//
//
//    @Test//00859813118
//    public void passwordCrypt() {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        logger.info("Password Encrypted {}", bCryptPasswordEncoder.encode("4469solar"));
//        String hash = bCryptPasswordEncoder.encode("4469solar");
//        assertThat(hash).isEqualTo("lo");//.isNotNull();
//    }
//
//
//
//}
