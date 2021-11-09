package co.com.utest.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {

    public static final Target NOMBRE = Target.the("Primer nombre")
            .located(By.id("firsName"));
    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("firstName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("firsName"));
    public static final Target MES_NACIMIENTO = Target.the("Mes de nacimiento")
            .located(By.xpath("//html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia de nacimiento")
            .located(By.xpath("///html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target ANO_NACIMIENTO = Target.the("Ano de nacimiento")
            .located(By.xpath("//html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/"));
    public static final Target BOTON = Target.the("Boton que lleva a la seccion de Direccion")
            .located(By.xpath("//a[@class'btn-btn-blue']"));
}