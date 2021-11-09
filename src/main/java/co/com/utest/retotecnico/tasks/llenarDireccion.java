package co.com.utest.retotecnico.tasks;


import kotlin.collections.AbstractList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.utest.retotecnico.userinterface.PaginaDireccion.CIUDAD;
import static co.com.utest.retotecnico.userinterface.PaginaDireccion.ZIP;

public class llenarDireccion implements Task {

    private AbstractList<Object> datos;

    public llenarDireccion() {
    }

     @Deprecated
     public <T> void performAs(T actor) {
     }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue((CharSequence) datos.get(8)). into(CIUDAD),
                Wit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Wit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Enter.theValue((CharSequence) datos.get(8)).into(ZIP));

    }
}
