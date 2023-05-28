$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pruebas.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "agrega producto",
  "description": "",
  "id": ";agrega-producto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "ingresa a la pagina Find Bugs",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "listamos por precios bajos",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Seleccionamos productos",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "se debe presentar la opcion \"View Cart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validaproductos.ingresaALaPaginaFindBugs()"
});
formatter.result({
  "duration": 7210063300,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.listamosPorPreciosBajos()"
});
formatter.result({
  "duration": 2158871300,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.seleccionamosProductos()"
});
formatter.result({
  "duration": 153637500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "View Cart",
      "offset": 29
    }
  ],
  "location": "validaproductos.seDebePresentarLaOpcion(String)"
});
formatter.result({
  "duration": 1134122400,
  "status": "passed"
});
formatter.after({
  "duration": 697781400,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "calcula sub total de suma precios",
  "description": "",
  "id": ";calcula-sub-total-de-suma-precios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "ingresa a la pagina Find Bugs",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "listamos por precios bajos",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Seleccionamos productos",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "entramos a la pagina View Cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "la suma de los precios debe dar el subtotal \"Correcto\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validaproductos.ingresaALaPaginaFindBugs()"
});
formatter.result({
  "duration": 5721993600,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.listamosPorPreciosBajos()"
});
formatter.result({
  "duration": 1283459000,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.seleccionamosProductos()"
});
formatter.result({
  "duration": 152813500,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.entramosALaPaginaViewCart()"
});
formatter.result({
  "duration": 2850782100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Correcto",
      "offset": 45
    }
  ],
  "location": "validaproductos.laSumaDeLosPreciosDebeDarElSubtotal(String)"
});
formatter.result({
  "duration": 1908717600,
  "status": "passed"
});
formatter.after({
  "duration": 704866300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "calcula total de suma subtotal mas impuesto",
  "description": "",
  "id": ";calcula-total-de-suma-subtotal-mas-impuesto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "ingresa a la pagina Find Bugs",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "listamos por precios bajos",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Seleccionamos productos",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "entramos a la pagina View Cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "la suma del subtotal mas impuesto debe ser \"Correcto\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validaproductos.ingresaALaPaginaFindBugs()"
});
formatter.result({
  "duration": 5724280200,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.listamosPorPreciosBajos()"
});
formatter.result({
  "duration": 1860371100,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.seleccionamosProductos()"
});
formatter.result({
  "duration": 174810400,
  "status": "passed"
});
formatter.match({
  "location": "validaproductos.entramosALaPaginaViewCart()"
});
formatter.result({
  "duration": 3988862000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Correcto",
      "offset": 44
    }
  ],
  "location": "validaproductos.laSumaDelSubtotalMasImpuestoDebeSer(String)"
});
formatter.result({
  "duration": 1245274400,
  "error_message": "java.lang.AssertionError: expected [Correcto] but found [Incorrecto]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat pruebasDefiniciones.validaproductos.laSumaDelSubtotalMasImpuestoDebeSer(validaproductos.java:61)\r\n\tat ✽.Then la suma del subtotal mas impuesto debe ser \"Correcto\"(pruebas.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 780538900,
  "status": "passed"
});
});