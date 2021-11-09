package co.com.utest.retotecnico.tasks;

import co.com.utest.retotecnico.userinterface.PaginaInfoPersonal;
import model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.utest.retotecnico.userinterface.PaginaInfoPersonal.*;
public class Llenar implements Task {

    private List<UtestDatos> datos;

    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Llenar laPagina(Object datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(8).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(8).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(8).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(8).getStrMesNacimiento()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(8).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(8).getStrAnoNcimiento()).from(ANO_NACIMIENTO),
                Click.on(BOTON)

        );

    }
}
