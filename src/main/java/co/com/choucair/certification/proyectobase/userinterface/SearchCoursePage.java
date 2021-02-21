package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    /** Al no tener permisos suficientes el usuario 1061726699
     * se cambia de la opción universidad a certificaciones
     * y en vez de buscar el curso solicitado se busca la certificación:
     * Foundation Express
     **/
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad Choucair")
            .located(By.id("certificaciones"));
            //.located(By.id("universidad"));
            //.located(By.xpath("//div[@id='universidad]//strong'"));
    public static final Target INPUT_COURSE = Target.the("Buscar curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class= 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Ingresa al curso")
            .located(By.xpath("//h4[contains(@class,'result-title')]"));
            //.located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//div[contains(text(),'Foundation Express')]"));
            //.located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}