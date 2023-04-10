package br.com.tinnovaTest.steps;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;

import br.com.tinnovaTest.aplicacao.Aplicacao;
import br.com.tinnovaTest.apoio.DataFormater;
import br.com.tinnovaTest.apoio.FrameSelenium;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends FrameSelenium {

	Aplicacao aplicacao;
	Scenario scenario;

	final static Log log = LogFactory.getLog(Aplicacao.class);

	@Before
	public void inicializarTeste(Scenario scenario) {
		try {
			System.setProperty("userName", System.getProperty("user.name"));
			String ct = scenario.toString() + DataFormater.data();
			System.setProperty("log4jFileName", ct);
			PropertyConfigurator.configure("log4j.properties");
			aplicacao = new Aplicacao();
			String os = System.getProperty("os.name");
			if (os.equals("Linux")) {
				aplicacao.iniciarAplicacaoTinnova();
			} else {
				aplicacao.iniciarAplicacaoTinnovaWindows();
			}

		} catch (Exception e) {
			log.error("Erro ao iniciar a aplicação.");
		}
	}

	@After
	public void finalizarTeste(Scenario scenario) {
		try {
			aplicacao = new Aplicacao();
			aplicacao.fecharAplicacao();

		} catch (Exception e) {
			log.error("Erro ao encerrar a aplicação.");
		}
	}

}
