package lesson17;

import lesson6.User;
import logger.TryLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 28.11.2016.
 */
public class TryAllurePage {
    private static Logger logger = LoggerFactory.getLogger(TryLogger.class);

    @Step("Reg user")
    public void step1(){

    }

    @Step
    public void ste2(){

    }

    @Step
    public void ste3(){}

    @Step("Login with name {0} and password {1}")
    public void login(String name, String password){}

    @Step("{this}")
    public void registration(User user){
        logger.info(user.toString());
    }

    @Override
    public String toString(){
        return "try Allure";
    }

}
