<%-- 
    Document   : response
    Created on : Jun 21, 2021, 1:51:01 PM
    Author     : Saša Bistrović
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="sortbean" scope="session" class="sortclient.SortClient" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
 <script type="text/javascript">
 function hello5() {
        //var v1 = document.getElementById('humidity22').value; 
        //var v2 = document.getElementById('phase_count22').value; 
        //var v3 = document.getElementById('temperature22').value; 
        //var v4 = document.getElementById('phase_usage22').value; 
        //var v5 = document.getElementById('phase_power_W22').value; 
        //var v6 = document.getElementById('ID22').value; 
        //var v7 = document.getElementById('phase111').selectedIndex.toString(); 
        //var v8 = document.getElementById('phase111').value;
        //alert($v3);
        //
        document.getElementById('testa').value="Otvori";
        <jsp:setProperty name="sortbean" property="sasa111"/>;
        var myselect = document.getElementById("phase111");
        var v1 = myselect.options[myselect.selectedIndex].value; 
        var v2 = myselect.selectedIndex; 
        //alert(v2);
        if (myselect.selectedIndex>0) {
            document.getElementById('testb').value=v2;
            document.getElementById('testc').value=v1;
            <jsp:setProperty name="sortbean" property="selected22"/>;
            <jsp:setProperty name="sortbean" property="test22"/>;
            return true;
        } else
        {
            return false;
        }
        //if (document.getElementById("phase111").value  
    };
  function check() {
        //sortclient.SortClient.sasa111="sasa";
        //$('#sortclient.SortClient.sasa111').val("sasa");
        //var sasa =
        //alert(sasa);
        };  
  </script>
  <script type="text/javascript">
  function setOption(selectElement, value) {
    var options = selectElement.options;
    for (var i = 0, optionsLength = options.length; i < optionsLength; i++) {
        if (options[i].value == value) {
            selectElement.selectedIndex = i;
            return true;
        }
    }
    return false;
}    
      
  function codeAddress() {
            //alert("sasa");
                        //alert("sasa1 ");
            var v = "<jsp:getProperty name="sortbean" property="sasa111" />";
            
            var v1 = "<jsp:getProperty name="sortbean" property="selected22" />";
            
            var v2 = "<jsp:getProperty name="sortbean" property="test22" />";
            if (v=="Pocetno") {
            document.getElementById('phase111').selectedIndex = 0;
            document.getElementById('ID222').value="";
            document.getElementById('humidity22').value="";
            document.getElementById('phase_count22').value="";
            document.getElementById('temperature22').value="";
            document.getElementById('phase_usage22').value="";
            document.getElementById('phase_power_W22').value="";
            }
            if (v=="Aktiviraj") {
            document.getElementById('phase111').selectedIndex="<jsp:getProperty name="sortbean" property="selected22" />";    
            //document.getElementById('ID222').value="<jsp:getProperty name="sortbean" property="ID22" />";
            //document.getElementById('humidity22').value="<jsp:getProperty name="sortbean" property="humidity2" />";
            //document.getElementById('phase_count22').value="<jsp:getProperty name="sortbean" property="phase_count2" />";
            //document.getElementById('temperature22').value="<jsp:getProperty name="sortbean" property="temperature2" />";
            //document.getElementById('phase_usage22').value="<jsp:getProperty name="sortbean" property="phase_usage2" />";
            //document.getElementById('phase_power_W22').value="<jsp:getProperty name="sortbean" property="phase_power_W2" />";
            }
            if (v=="Otvori") {
            //alert("sasa1 "+v+" "+v1+" "+v2);
            document.getElementById('phase111').selectedIndex="<jsp:getProperty name="sortbean" property="selected22" />";
            //document.getElementById('ID222').value="<jsp:getProperty name="sortbean" property="ID22" />";
            //document.getElementById('humidity22').value="<jsp:getProperty name="sortbean" property="humidity2" />";
            //document.getElementById('phase_count22').value="<jsp:getProperty name="sortbean" property="phase_count2" />";
            //document.getElementById('temperature22').value="<jsp:getProperty name="sortbean" property="temperature2" />";
            //document.getElementById('phase_usage22').value="<jsp:getProperty name="sortbean" property="phase_usage2" />";
            //document.getElementById('phase_power_W22').value="<jsp:getProperty name="sortbean" property="phase_power_W2" />";
            //alert("sasa2");
            }
            if (v=="Ugasi") {
            document.getElementById('phase111').selectedIndex = 0;
            document.getElementById('ID222').value="";
            document.getElementById('humidity22').value="";
            document.getElementById('phase_count22').value="";
            document.getElementById('temperature22').value="";
            document.getElementById('phase_usage22').value="";
            document.getElementById('phase_power_W22').value="";
            }
            if (v=="Ispravi") {
            //alert("sasa1 "+v+" "+v1+" "+v2);
            document.getElementById('phase111').selectedIndex="<jsp:getProperty name="sortbean" property="selected22" />";
            //document.getElementById('ID222').value="<jsp:getProperty name="sortbean" property="ID22" />";
            //document.getElementById('humidity22').value="<jsp:getProperty name="sortbean" property="humidity2" />";
            //document.getElementById('phase_count22').value="<jsp:getProperty name="sortbean" property="phase_count2" />";
            //document.getElementById('temperature22').value="<jsp:getProperty name="sortbean" property="temperature2" />";
            //document.getElementById('phase_usage22').value="<jsp:getProperty name="sortbean" property="phase_usage2" />";
            //document.getElementById('phase_power_W22').value="<jsp:getProperty name="sortbean" property="phase_power_W2" />";
            //alert("sasa2");
            }
            };
            window.onload = codeAddress;
  </script>
  <script type="text/javascript">    
    function hello1() {
        var v3="Ispravi";
        document.getElementById('testa').value="Ispravi";
        <jsp:setProperty name="sortbean" property="sasa111"/>;
        var num = parseInt(document.getElementById("ID222").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
    
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("humidity22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("phase_count22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("temperature22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("phase_usage22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("phase_power_W22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var myselect = document.getElementById("phase111");
        var v1 = myselect.options[myselect.selectedIndex].value;  
        var v2 = myselect.selectedIndex; 
        if (myselect.selectedIndex>0) {
            document.getElementById('testb').value=v2;
            document.getElementById('testc').value=v1;
            if (v1=="ID1: empty") {
                alert("UREDAJ NIJE AKTIVAN");
                return false;
        } else
            if (v1=="ID2: empty") {
                alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID3: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID4: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID5: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID6: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID7: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID8: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else {
            return true;
        }//   return true;
        }else
        {
            return false;
        }
        };
            //hello5();
            //document.getElementById('phase111').onchange=onChange1;
            //document.getElementById('test2').innerHTML="
           /*
            document.getElementById('humidity2').value="";
            document.getElementById('temperature2').value="";
            document.getElementById('phase_count2').value="";
            document.getElementById('phase_usage2').value="";
            document.getElementById('phase_power_W2').value="";
           */  
        
        
        function hello2() {
        var v3="Ugasi";
        document.getElementById('testa').value="Ugasi";
        var myselect = document.getElementById("phase111");
        var v1 = myselect.options[myselect.selectedIndex].value;  
        var v2 = myselect.selectedIndex; 
        if (myselect.selectedIndex>0) {
            document.getElementById('testb').value=v2;
            document.getElementById('testc').value=v1;
            if (v1=="ID1: empty") {
                alert("UREDAJ NIJE AKTIVAN");
                return false;
        } else
            if (v1=="ID2: empty") {
                alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID3: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID4: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID5: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID6: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID7: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else
        if (v1=="ID8: empty") {
            alert("UREDAJ NIJE AKTIVAN");
            return false;
        } else {
            return true;
        } //return true;
        }else
        {
            return false;
        }
        };
        
        function hello3() {
        //sortclient.SortClient.sasa111="Aktiviraj";
        var v3="Aktiviraj";
        document.getElementById('testa').value="Aktiviraj";
        <jsp:setProperty name="sortbean" property="sasa111"/>;
        var num = parseInt(document.getElementById("ID222").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
    
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("humidity22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("phase_count22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("temperature22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("phase_usage22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var num = parseInt(document.getElementById("phase_power_W22").value,10);
        if (Number.isInteger(num)) { 
        //alert("Number is integer");
        }
        else {alert("Number is not integer");
        return false;
        }
        var myselect = document.getElementById("phase111");
        var v1 = myselect.options[myselect.selectedIndex].value;  
        var v2 = myselect.selectedIndex; 
        if (myselect.selectedIndex>0) {
            document.getElementById('testb').value=v2;
            document.getElementById('testc').value=v1;
            if (v1=="ID1: empty") {
                return true;
        } else
            if (v1=="ID2: empty") {
            return true;
        } else
        if (v1=="ID3: empty") {
            return true;
        } else
        if (v1=="ID4: empty") {
            return true;
        } else
        if (v1=="ID5: empty") {
            return true;
        } else
        if (v1=="ID6: empty") {
            return true;
        } else
        if (v1=="ID7: empty") {
            return true;
        } else
        if (v1=="ID8: empty") {
            return true;
        } else {
            alert("UREDAJ JE AKTIVAN");
            return false;
        }  // return true;
        }else
        {
            return false;
        }
        //yield;
        //alert("click3");
        //alert(document.getElementById('button3').value);
        };
  </script>
  <script type="text/javascript">      
        //window.onsubmit = codeAddress2;
        //window.onunload = codeAddress2;
        //document.getElementById('button3').onfocus=codeAddress2
      
        function hello4() {
        var v6 = document.getElementById('phase111').selectedIndex.toString(); 
        var v7 = document.getElementById('phase111').value; 
        <jsp:setProperty name="sortbean" property="phase11"/>;
        <jsp:setProperty name="sortbean" property="selected22"/>;
        var v1 = document.getElementById('humidity22').value; 
        var v2 = document.getElementById('phase_count22').value; 
        var v3 = document.getElementById('temperature22').value; 
        var v4 = document.getElementById('phase_usage22').value; 
        var v5 = document.getElementById('phase_power_W22').value; 
        var v6 = document.getElementById('ID22').value; 
        <jsp:setProperty name="sortbean" property="ID22"/>;
        <jsp:setProperty name="sortbean" property="humidity2"/>;
        <jsp:setProperty name="sortbean" property="phase_count2"/>;
        <jsp:setProperty name="sortbean" property="temperature2"/>;
        <jsp:setProperty name="sortbean" property="phase_usage2"/>;
        <jsp:setProperty name="sortbean" property="phase_power_W2"/>;
        //yield;
        //alert("click3");
        //alert(document.getElementById('button3').value);
        };

function MyFunction2() {
    var num = document.getElementById("id_device").value;
    if (num=="Novi") {
        document.getElementById("button1").disabled = true;
        document.getElementById("button2").disabled = true;
        document.getElementById("button3").disabled = false;
    } else
    if (num=="") {
        document.getElementById("button1").disabled = true;
        document.getElementById("button2").disabled = true;
        document.getElementById("button3").disabled = true;
    }
};
</script>
  <form name="InputForm" id="ftemp" method="post" onSubmit="" action="response.jsp">
    <p>
    <select id="phase111" name="phase11" onChange="" value="<jsp:setProperty name="sortbean" property="phase11" />">
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
    ID : <input name="ID22" id="ID222" value="<jsp:getProperty name="sortbean" property="ID22" />"></input></br>
    Vlaznost : <input name="humidity2" id="humidity22" value="<jsp:getProperty name="sortbean" property="humidity2" />"></input></br>
    Broj faza : <input name="phase_count2" id="phase_count22" value="<jsp:getProperty name="sortbean" property="phase_count2" />"></input></br>
    Temperatura : <input name="temperature2" id="temperature22" value="<jsp:getProperty name="sortbean" property="temperature2" />"></input></br>
    Zauzetost faze : <input name="phase_usage2" id="phase_usage22" value="<jsp:getProperty name="sortbean" property="phase_usage2" />"></input></br>
    W : <input name="phase_power_W2" id="phase_power_W22" value="<jsp:getProperty name="sortbean" property="phase_power_W2" />"></input></br>
    <input onclick="return hello5();" type="submit" name="button44" id="button4" value="Otvori">
        </input>
    <input onclick="return hello1();" type="submit" name="button11" id="button1" value="Ispravi">
        </input>
    <input onclick="return hello2();" type="submit" name="button22" id="button2" value="Ugasi">
        </input>
    <input onclick="return hello3();" type="submit" name="button33" id="button3" value="Aktiviraj">
        </input>
    <input onclick="check();" type="button" name="button55" id="button5" value="Check"></input>
    <input name="sasa111" id="testa" value="<jsp:getProperty name="sortbean" property="sasa111" />"></input>
    <input name="selected22" id="testb" value="<jsp:getProperty name="sortbean" property="selected22" />"></input>
    <input name="test22" id="testc" value="<jsp:getProperty name="sortbean" property="test22" />"></input>
  </form>
  
    </body>
</html>
