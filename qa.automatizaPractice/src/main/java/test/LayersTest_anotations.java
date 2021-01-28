package test;

import driver.driver;
import logic.Landing_logic;
import logic.login_logic;
import logic.perfil_logic;
import logic.resultSearch_logic;
import logic.customizerProducts_logic;
import logic.shoppingSumary_logic;
import logic.shoppingAddress_logic;
import logic.shoppingShipping_logic;
import logic.shoppingPayment_logic;
import logic.perfilHistory_logic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LayersTest_anotations {

   driver Driver = null;
   Landing_logic ldlc = null;
   login_logic lplc = null;
   perfil_logic pl = null;
   resultSearch_logic rs = null;
   customizerProducts_logic cp = null;
   shoppingSumary_logic ss = null;
   shoppingAddress_logic sa = null;
   shoppingShipping_logic ssh = null;
   shoppingPayment_logic sp = null;
   perfilHistory_logic ph = null;

   @BeforeClass
   public void  setupEnv() {

       Driver = new driver();
       ldlc = new Landing_logic(Driver);
       lplc = new login_logic(Driver);
       pl = new perfil_logic(Driver);
       rs = new resultSearch_logic(Driver);
       cp = new customizerProducts_logic(Driver);

       ss = new shoppingSumary_logic(Driver);
       sa = new shoppingAddress_logic(Driver);
       sp = new shoppingPayment_logic(Driver);
       ssh = new shoppingShipping_logic(Driver);
       ph = new perfilHistory_logic(Driver);

   }


   @Test(priority = 1, testName = "Escenario1")
   public void testEscenario1() throws InterruptedException {

       String cadena = null;
       ArrayList<String> ordenes = null;

       Driver.goto_url("http://automationpractice.com");
       ldlc.SignIn();
       lplc.Login("a240971@a.com","a12345");
       pl.Search("Faded Short Sleeve T-shirts");
       rs.btnSelect();

       cp.seleccionProd("3", "M");
       cp.home();

       // Me voy al checkout
       pl.btnCart();

       // Siguiente en Summary
       ss.btnNext();

       // Siguiente en Address
       sa.btnNext();

       // Siguiente en Shipping
       ssh.chkTerm();
       ssh.btnNext();

       // Siguiente en payment
       sp.btnPayBank();
       sp.btnPayConfirm();

       cadena = sp.obtenerReferencia().substring(216);
       cadena = cadena.substring(0,9);

       //System.out.println("Info : " + cadena);

       // Voy al perfil del usuario
       pl.btnPerfilUser();

       // Selecciono History Details
       pl.btnHistory();

       // Verificar que la orden figura dentro de la lista de pendientes (on backorder)
       ordenes = ph.listaOrdenes();
       if (ordenes.contains(cadena))
           System.out.println("Orden " + cadena + " esta en on backover");
       else
           System.out.println("Orden NO EXISTE");

   }

   @AfterClass
    public void teardown() {
       Driver.teardown();
   }

}
