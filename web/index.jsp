<%-- 
    Document   : index
    Created on : Jun 19, 2021, 8:00:37 PM
    Author     : Saša Bistrović
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <jsp:useBean id="sortbean" scope="session" class="sortclient.SortClient" />
    <jsp:setProperty name="sortbean" property="sasa111"/>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
        function hello1() {
        document.getElementById('test2').innerHTML="click1";
        }
        function hello2() {
        document.getElementById('test2').innerHTML="click2";
        }
        function hello3() {
        document.getElementById('test2').innerHTML="click3";
        }
</script>
<script type="text/javascript">
        //document.getElementById("button1").addEventListener("click", hello1);
        //document.getElementById("button2").addEventListener("click", hello2);
        //document.getElementById("button3").addEventListener("click", hello3);
         function warnUnload(){
            document.getElementById('phase111').selectedIndex = "0";
            document.getElementById('testa').value = "Pocetno";
            document.getElementById('testb').value = "0";
            document.getElementById('testc').value = "Empty";
            <jsp:setProperty name="sortbean" property="sasa111" value="Pocetno"/>
            <jsp:setProperty name="sortbean" property="test22" value="empty"/>
            <jsp:setProperty name="sortbean" property="selected22" value="0"/>
        }
        
        function codeAddress() {
            //alert("sasa1");
            document.getElementById('phase111').selectedIndex = "0";
            //var v1 = document.getElementById('phase111').selectedIndex.toString();
            //alert("sasa2");
            //alert("sasa3");
            document.getElementById('testa').value = "Pocetno";
            document.getElementById('testb').value = "0";
            document.getElementById('testc').value = "empty";
            <jsp:setProperty name="sortbean" property="selected22" value="0"/>
            <jsp:setProperty name="sortbean" property="test22" value="empty"/>
            <jsp:setProperty name="sortbean" property="humidity2" value="empty"/>
            <jsp:setProperty name="sortbean" property="phase_count2" value="empty"/>
            <jsp:setProperty name="sortbean" property="temperature2" value="empty"/>
            <jsp:setProperty name="sortbean" property="phase_usage2" value="empty"/>
            <jsp:setProperty name="sortbean" property="phase_power_W2" value="empty"/>
            <jsp:setProperty name="sortbean" property="phase11" value="empty"/>
            <jsp:setProperty name="sortbean" property="pocetno" value="empty"/>
            <jsp:setProperty name="sortbean" property="ispravi" value="empty"/>
            <jsp:setProperty name="sortbean" property="ugasi" value="empty"/>
            <jsp:setProperty name="sortbean" property="aktiviraj" value="empty"/>
            <jsp:setProperty name="sortbean" property="sasa111" value="Pocetno"/>
            <jsp:setProperty name="sortbean" property="test22" value="empty"/>
            <jsp:setProperty name="sortbean" property="selected22" value="0"/>

            //alert("sasa4");
            //alert("");
            //alert("sasa5");
            document.getElementById('ftemp').submit();
            //alert("sasa4");
        }
        window.onbeforeunload = warnUnload;
        window.onload = codeAddress;
</script>
</head>
<body>
  <form name="InputForm" id="ftemp" method="post" action="response.jsp">
    <p>
    <select id="phase111" name="phase11" onchange="">
    <option value=""></option>    
    <option name="ID1" id="id11" value="<jsp:getProperty name="sortbean" property="ID1" />"><jsp:getProperty name="sortbean" property="ID1" /></option>
    <option name="ID2" id="id22" value="<jsp:getProperty name="sortbean" property="ID2" />"><jsp:getProperty name="sortbean" property="ID2" /></option>
    <option name="ID3" id="id33" value="<jsp:getProperty name="sortbean" property="ID3" />"><jsp:getProperty name="sortbean" property="ID3" /></option>
    <option name="ID4" id="id44" value="<jsp:getProperty name="sortbean" property="ID4" />"><jsp:getProperty name="sortbean" property="ID4" /></option>
    <option name="ID5" id="id55" value="<jsp:getProperty name="sortbean" property="ID5" />"><jsp:getProperty name="sortbean" property="ID5" /></option>
    <option name="ID6" id="id66" value="<jsp:getProperty name="sortbean" property="ID6" />"><jsp:getProperty name="sortbean" property="ID6" /></option>
    <option name="ID7" id="id77" value="<jsp:getProperty name="sortbean" property="ID7" />"><jsp:getProperty name="sortbean" property="ID7" /></option>
    <option name="ID8" id="id88" value="<jsp:getProperty name="sortbean" property="ID8" />"><jsp:getProperty name="sortbean" property="ID8" /></option>
  </select>
      </br>
      Vlaznost : <input name="humidity2" id="humidity22" value="<jsp:getProperty name="sortbean" property="humidity2" />"></input></br>
    Broj faza : <input name="phase_count2" id="phase_count22" value="<jsp:getProperty name="sortbean" property="phase_count2" />"></input></br>
    Temperatura : <input name="temperature2" id="temperature22" value="<jsp:getProperty name="sortbean" property="temperature2" />"></input></br>
    Zauzetost faze : <input name="phase_usage2" id="phase_usage22" value="<jsp:getProperty name="sortbean" property="phase_usage2" />"></input></br>
    W : <input name="phase_power_W2" id="phase_power_W22" value="<jsp:getProperty name="sortbean" property="phase_power_W2" />"></input></br>
    <input type="button" name="test22" id="test2" value="<jsp:getProperty name="sortbean" property="test22" />"></input></br>
    <input onclick="hello1()" type="submit" name="button11" id="button1" value="Ispravi"></input>
    <input onclick="hello2()" type="submit" name="button22" id="button2" value="Ugasi"></input>
    <input onclick="hello3()" type="submit" name="button33" id="button3" value="Aktiviraj"></input>
    <input type="hidden" name="sasa111" id="testa" value="<jsp:getProperty name="sortbean" property="sasa111" />"></input>
    <input type="hidden" name="selected22" id="testb" value="<jsp:getProperty name="sortbean" property="selected22" />"></input>
    <input type="hidden" name="test22" id="testc" value="<jsp:getProperty name="sortbean" property="test22" />"></input>
  </form>
</body>
</html>
