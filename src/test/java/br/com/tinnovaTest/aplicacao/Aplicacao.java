package br.com.tinnovaTest.aplicacao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import br.com.tinnovaTest.apoio.FrameSelenium;

public class Aplicacao extends FrameSelenium {

	static WebDriver driver;

	final static Log log = LogFactory.getLog(Aplicacao.class);

	public void iniciarAplicacaoTinnova() throws Exception {
		try {
			String endereco = "https://tinnova-teste-qa.vercel.app";
			String user = System.getProperty("user.name");
			System.setProperty("webdriver.chrome.driver", "/home/"+user+"/Documentos/chromedriver/chromedriver");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("--disable-notifications");
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.get(endereco);
			this.registrarDriver(driver);
			log.info("Navegador iniciado: " + endereco);
		} catch (Exception e) {
			log.error("Erro ao iniciar o navegador");
			throw new Exception("Erro ao iniciar o navegador");
		}
	}
	
	public void iniciarAplicacaoTinnovaWindows() throws Exception {
		try {
			String endereco = "https://tinnova-teste-qa.vercel.app";
			String user = System.getProperty("user.name");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\"+user+"\\Documentos\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("--disable-notifications");
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.get(endereco);
			this.registrarDriver(driver);
			log.info("Navegador iniciado: " + endereco);
		} catch (Exception e) {
			log.error("Erro ao iniciar o navegador");
			throw new Exception("Erro ao iniciar o navegador");
		}
	}
	
	public void fecharAplicacao(){
		driver.close();
	}
}
