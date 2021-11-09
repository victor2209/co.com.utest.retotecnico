package co.com.utest.retotecnico.stepdenfinitions;

import co.com.utest.retotecnico.tasks.Abrir;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestDatos;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class UtestRetotecnicoStepDefinitions

    @Given("^Victor desea registrarse en UTest$")
    public void victorDeseaRegistrarseEnUTest() throws Exception {
        OnStage.theActorCalled("Victor").wasAbleTo(Abrir.laPagina());
    }

    @When("^El usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo();
    }

    @Then("^El registro se completa al ver el boton de Complete Setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup() throws Exception{
    }

    }


