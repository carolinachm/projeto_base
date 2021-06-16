package br.com.treinamentoautomacao.tests;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import br.com.treinamentoautomacao.utils.Browser;
import br.com.treinamentoautomacao.utils.Utils;

public class SetupTest extends BaseTests{

    @Test
    public void testOpenBrowserAndLoadPage() throws MalformedURLException{
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador");
    }
    
}
