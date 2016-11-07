package lesson12.homework.login;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public abstract class AbstractLogin {

    protected abstract void getUrl();
    protected abstract void typeEmail();
    protected abstract void typePassword();
    protected abstract void clickSubmit();

    public void login(){
        getUrl();
        typeEmail();
        typePassword();
        clickSubmit();
    }
}
