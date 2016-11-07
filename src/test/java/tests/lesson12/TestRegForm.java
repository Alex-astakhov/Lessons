package tests.lesson12;

import lesson12.IRegForm;
import lesson12.RegForm1;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class TestRegForm {

    @Test
    public void testRegForm(){
        IRegForm reg = new IRegForm() {
            @Override
            public void typeName(String name) {

            }

            @Override
            public void typeEmail(String email) {

            }

            @Override
            public void typePassword(String password) {

            }

            @Override
            public void clickSubmit() {

            }
        };

        IRegForm reg1 = new RegForm1();
        reg.typeName("fvdv");
        reg1.typeEmail("vsvbdf");
        reg1.typeEmail("bdvd@dfvg");
        reg1.typePassword("fffff");
        reg1.clickSubmit();

    }
}
