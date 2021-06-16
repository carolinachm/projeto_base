package br.com.treinamentoautomacao.tests;

import java.net.MalformedURLException;


import org.junit.After;
import org.junit.Before;

import br.com.treinamentoautomacao.utils.Browser;
import br.com.treinamentoautomacao.utils.Utils;

public class BaseTests {

    @Before
    public void setup() throws MalformedURLException{
        Browser.loadPage(Utils.getBaseUrl());
    }
    @After
    public void tearDown() throws MalformedURLException{
        Browser.close();
    }
    
}
