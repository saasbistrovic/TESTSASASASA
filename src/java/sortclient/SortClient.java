/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortclient;

/**
 *
 * @author Saša Bistrović
 */

//import com.sun.org.apache.bcel.internal.generic.Select;
//import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SortClient {
    public static Integer Sasa=0;
    public String temp;
    public String conv1;
    public String conv2;
    public Double result;
    public static String MachineID;
    public static String phase11;
    public static String selected22;
    public static String pocetno;
    public static String ispravi;
    public static String ugasi;
    public static String aktiviraj;
    public static String sasa111;
    public static String test22;
    public static String ID1;
    public static String ID2;
    public static String ID22;
    public static String ID3;
    public static String ID4;
    public static String ID5;
    public static String ID6;
    public static String ID7;
    public static String ID8;
    public static String sel1;
    public static String sel2;
    public static String sel3;
    public static String sel4;
    public static String sel5;
    public static String sel6;
    public static String sel7;
    public static String sel8;
    public static String humidity2;
    public static String phase_count2;
    public static String temperature2;
    public static String phase_usage2;
    public static String phase_power_W2;
    public static FileWriter file;
    JSONParser parser = new JSONParser();
         
    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getConv1() {
        return conv1;
    }

    public void setConv1(String conv1) {
        this.conv1 = conv1;
    }

    public String getConv2() {
        return conv2;
    }
    
    public String getphase11() {
        return phase11;
    }

    public void setphase11(String phase11) {
        if (!phase11.equals("")) {
        if (phase11!=null) {
        if (!phase11.equals("null")) {
        this.phase11 = phase11;
        }
        }
        }
    }
    
    public String getpocetno() {
        return pocetno;
    }

    public void setpocetno(String pocetno) {
        this.pocetno = "empty";
    }
    
    public String gethumidity2() {
        return humidity2;
    }

    public void sethumidity2(String humidity2) {
        if (!humidity2.equals("")) {
        if (!humidity2.equals("null")) {
        this.humidity2 = humidity2;
        }
        }
    }
    
    public String getphase_count2() {
        return phase_count2;
    }

    public void setphase_count2(String phase_count2) {
        if (!phase_count2.equals("")) {
        if (!phase_count2.equals("null")) {
        this.phase_count2 = phase_count2;
        }
        }
    }
    
    public String gettemperature2() {
        return temperature2;
    }

    public void settemperature2(String temperature2) {
        if (!temperature2.equals("")) {
        if (!temperature2.equals("null")) {
        this.temperature2 = temperature2;
        }
        }
    }
    
    public String getphase_usage2() {
        return phase_usage2;
    }

    public void setphase_usage2(String phase_usage2) {
        if (!phase_usage2.equals("")) {
        if (!phase_usage2.equals("null")) {
        this.phase_usage2 = phase_usage2;
        }
        }
    }
    
    public String getphase_power_W2() {
        return phase_power_W2;
    }
    
    public void setID1(String ID1) {
        if (!ID1.equals("")) {
        if (!ID1.equals("null")) {
        this.ID1 = ID1;
        //sasa111();
        }
        }
    }
    
    public String getID1() {
        return ID1;
    }
    
    public void setID2(String ID2) {
        if (!ID2.equals("")) {
        if (!ID2.equals("null")) {
        this.ID2 = ID2;
        //sasa111();
        }
        }
    }
    
    public String getID2() {
        return ID2;
    }
    
    public void setID22(String ID22) {
        if (sasa111!="Otvori"){
        if (ID22!="") {
        if (ID22!="null") {
        this.ID22 = ID22;
        //sasa111();
        }
        }
        }
    }
    
    public String getID22() {
        return ID22;
    }
    
    public void setID3(String ID3) {
        if (!ID3.equals("")) {
        if (!ID3.equals("null")) {
        this.ID3 = ID3;
        //sasa111();
        }
        }
    }
    
    public String getID3() {
        return ID3;
    }
    
    public void setID4(String ID4) {
        if (!ID4.equals("")) {
        if (!ID4.equals("null")) {
        this.ID4 = ID4;
        //sasa111();
        }
        }
    }
    
    public String getID4() {
        return ID4;
    }
    
    public void setID5(String ID5) {
        if (!ID5.equals("")) {
        if (!ID5.equals("null")) {
        this.ID5 = ID5;
        //sasa111();
        }
        }
    }
    
    public String getID5() {
        return ID5;
    }
    
    public void setID6(String ID6) {
        if (!ID6.equals("")) {
        if (!ID6.equals("null")) {
        this.ID6 = ID6;
        //sasa111();
        }
        }
    }
    
    public String getID6() {
        return ID6;
    }
    
    public void setID7(String ID7) {
        if (!ID7.equals("")) {
        if (!ID7.equals("null")) {
        this.ID7 = ID7;
        //sasa111();
        }
        }
    }
    
    public String getID7() {
        return ID7;
    }
    
    public void setID8(String ID8) {
        if (!ID8.equals("")) {
        if (!ID8.equals("null")) {
        this.ID8 = ID8;
        //sasa111();
        }
        }
    }
    
    public String getID8() {
        return ID8;
    }
    /*
    public void setsel1(String sel1) {
        this.sel1 = sel1;
    }
    
    public String getsel1() {
        return sel1;
    }
    
    public void setsel2(String sel2) {
        this.sel2 = sel2;
    }
    
    public String getsel2() {
        return sel2;
    }
    
    public void setsel3(String sel3) {
        this.sel3 = sel3;
    }
    
    public String getsel3() {
        return sel3;
    }
    
    public void setsel4(String sel4) {
        this.sel4 = sel4;
    }
    
    public String getsel4() {
        return sel4;
    }
    
    public void setsel5(String sel5) {
        this.sel5 = sel5;
    }
    
    public String getsel5() {
        return sel5;
    }
    
    public void setsel6(String sel6) {
        this.sel6 = sel6;
    }
    
    public String getsel6() {
        return sel6;
    }
    
    public void setsel7(String sel7) {
        this.sel7 = sel7;
    }
    
    public String getsel7() {
        return sel7;
    }
    
    public void setsel8(String sel8) {
        this.sel8 = sel8;
    }
    
    public String getsel8() {
        return sel8;
    }
    */
    public void setselected22(String selected22) {
        if (!selected22.equals("")) {
        if (!selected22.equals("null")) {
        this.selected22 = selected22;
        //sasa111();
        }
    }
    }
    
    public void setsasa111(String sasa111) {
        if (!sasa111.equals("")) {
        if (!sasa111.equals("null")) {
        this.sasa111 = sasa111;
        }
        }
    }
    
    public String getsasa111() {
        return sasa111;
    }
    
    public String getselected22() {
        return selected22;
    }
    
    public void setispravi(String ispravi) {
        this.ispravi = ispravi;
    }
    
    public String getispravi() {
        return ispravi;
    }
    
    public void setugasi(String ugasi) {
        this.ugasi = ugasi;
    }
    
    public String getugasi() {
        return ugasi;
    }
    
    public void setaktiviraj(String aktiviraj) {
        this.aktiviraj = aktiviraj;
    }
    
    public String getaktiviraj() {
        return aktiviraj;
    }
    
    public String gettest22() {
        return test22;
    }
    
    public void settest22(String test22) throws IOException {
        if (!test22.equals("")) {
        if (!test22.equals("null")) {
        this.test22 = test22;
        }
        }
        
        String command = "wmic csproduct get UUID";
    StringBuffer output = new StringBuffer();

    Process SerNumProcess = Runtime.getRuntime().exec(command);
    BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

    String line = "";
    while ((line = sNumReader.readLine()) != null) {
        output.append(line + "\n");
    }
        MachineID=output.toString().substring(output.indexOf("\n"), output.length()).trim();;
    
    this.conv2 = MachineID;
              JSONParser jsonParser = new JSONParser();
        for (int i=1; i<=8; i++) { 
            Sasa=i;
        try (FileReader reader = new FileReader("C://ZADATAK_TESTWEBAPP//TEXT"+i+".txt"))
        {
            //Read JSON file
            Object jsonObject2 = jsonParser.parse(reader);
 
            JSONArray jsonObject1 = (JSONArray) jsonObject2;
            
        sel1="";
        sel2="";
        sel3="";
        sel4="";
        sel5="";
        sel6="";
        sel7="";
        sel8="";
        
        ispravi="Ispravi";
        ugasi="Ugasi";
        aktiviraj="Aktiviraj";
        System.out.println("sasa "+sasa111);  
        //test22=test22;
        //pocetno="";
            if (sasa111=="null") {
            jsonObject1.forEach(emp -> parseEmployeeObject2( (JSONObject) emp ) );    
            } else
            if (sasa111=="") {
            jsonObject1.forEach(emp -> parseEmployeeObject2( (JSONObject) emp ) );    
            } else
            if (sasa111=="Pocetno") {
            jsonObject1.forEach(emp -> parseEmployeeObject2( (JSONObject) emp ) );
            } else
            if (sasa111.equals("Otvori")) {
            jsonObject1.forEach(emp -> parseEmployeeObject1( (JSONObject) emp ) );
            } else
            if (sasa111=="Aktiviraj")
            {
            jsonObject1.forEach(emp -> parseEmployeeObject( (JSONObject) emp ) );    
            }else
            if (sasa111.equals("Ispravi"))
            {
            jsonObject1.forEach(emp -> parseEmployeeObject( (JSONObject) emp ) );    
            }else
            if (sasa111.equals("Ugasi"))
            {
            jsonObject1.forEach(emp -> parseEmployeeObject1( (JSONObject) emp ) );    
            }
            
    		} catch (Exception e) {
			e.printStackTrace();
                TESTsasa();

		}
        }
    }
    
    public void setphase_power_W2(String phase_power_W2) throws IOException {
        if (!phase_power_W2.equals("")) {
        if (!phase_power_W2.equals("null")) {
        this.phase_power_W2 = phase_power_W2;
        }
        }
                
        String command = "wmic csproduct get UUID";
    StringBuffer output = new StringBuffer();

    Process SerNumProcess = Runtime.getRuntime().exec(command);
    BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

    String line = "";
    while ((line = sNumReader.readLine()) != null) {
        output.append(line + "\n");
    }
        MachineID=output.toString().substring(output.indexOf("\n"), output.length()).trim();;
    
    this.conv2 = MachineID;
              JSONParser jsonParser = new JSONParser();
        for (int i=1; i<=8; i++) { 
            Sasa=i;
        try (FileReader reader = new FileReader("C://ZADATAK_TESTWEBAPP//TEXT"+i+".txt"))
        {
            //Read JSON file
            Object jsonObject2 = jsonParser.parse(reader);
 
            JSONArray jsonObject1 = (JSONArray) jsonObject2;
            
        sel1="";
        sel2="";
        sel3="";
        sel4="";
        sel5="";
        sel6="";
        sel7="";
        sel8="";
        
        ispravi="Ispravi";
        ugasi="Ugasi";
        aktiviraj="Aktiviraj";
        System.out.println("sasa "+sasa111);  
        //test22=test22;
        //pocetno="";
            if (sasa111=="null") {
            jsonObject1.forEach(emp -> parseEmployeeObject2( (JSONObject) emp ) );    
            } else
            if (sasa111=="") {
            jsonObject1.forEach(emp -> parseEmployeeObject2( (JSONObject) emp ) );    
            } else
            if (sasa111.equals("Pocetno")) {
            jsonObject1.forEach(emp -> parseEmployeeObject2( (JSONObject) emp ) );
            } else
            if (sasa111.equals("Otvori")) {
            jsonObject1.forEach(emp -> parseEmployeeObject1( (JSONObject) emp ) );
            } else
            if (sasa111.equals("Aktiviraj"))
            {
            jsonObject1.forEach(emp -> parseEmployeeObject( (JSONObject) emp ) );    
            } else
            if (sasa111.equals("Ispravi"))
            {
            jsonObject1.forEach(emp -> parseEmployeeObject( (JSONObject) emp ) );    
            }else
            if (sasa111.equals("Ugasi"))
            {
            jsonObject1.forEach(emp -> parseEmployeeObject1( (JSONObject) emp ) );    
            }
            
    		} catch (Exception e) {
			e.printStackTrace();
                TESTsasa();

		}
        }
    }

    public void setConv2(String conv2) throws IOException {
        this.conv2 = conv2;
    }

    public Double getResult() {
        result = Double.parseDouble(temp);
        if (conv1.equalsIgnoreCase(conv2)) {
            return result;
        } else if (conv2.equalsIgnoreCase("Celsius")) {
            return toCelsius(result);
        } else if (conv2.equalsIgnoreCase("Fahrenheit")) {
            return toFahrenheit(result);
        }
        return 0.0;
    }

    public double toCelsius(double tempFahrenheit )
    {
        return ((5.0 / 9.0) * ( tempFahrenheit - 32 ));

    }

    public double toFahrenheit( double tempCelsius )
    {
        return (tempCelsius * 9.0 / 5.0) + 32;

    }
    
    static public void CrunchifyLog(String str) {
        System.out.println("str");
    }
    
    private static void parseEmployeeObject(JSONObject employee) 
    {
        JSONArray List1 = new JSONArray();
        String phase = (String) employee.get("phase");
        String ID = (String) employee.get("ID");
        JSONObject sensors1 = (JSONObject) employee.get("sensors");
        String phase_count = (String) sensors1.get("phase_count");
        String humidity = (String) sensors1.get("humidity");
        String temperature = (String) sensors1.get("temperature");
        String phase_usage = (String) sensors1.get("phase_usage");
        String phase_power_W = (String) sensors1.get("phase_power_W");
        
        if (ID.equals("ID"+Sasa+": empty")){
            ID=new String("ID"+Sasa+": empty");
        }
        
        if (Integer.parseInt(selected22)==Sasa){
        phase11=new String(test22);
        } else
        {
        phase11=new String("");    
        }
        
          if (Integer.parseInt(selected22)==Sasa){
          //selected22=Sasa.toString();
          ID=new String(ID22);
          phase_count=new String(phase_count2);
          humidity=new String(humidity2);
          temperature=new String(temperature2);
          phase_usage=new String(phase_usage2);
          phase_power_W=new String(phase_power_W2);
          /*
        if (Sasa==1) {
            sel1 = "selected=\"selected\"";
        } else
        if (Sasa==2) {
            sel2 = "selected=\"selected\"";
        } else
        if (Sasa==3) {
            sel3 = "selected=\"selected\"";
        } else
        if (Sasa==4) {
            sel4 = "selected=\"selected\"";
        } else
        if (Sasa==5) {
            sel5 = "selected=\"selected\"";
        } else
        if (Sasa==6) {
            sel6 = "selected=\"selected\"";
        }  else
        if (Sasa==7) {
            sel7 = "selected=\"selected\"";
        } else
        if (Sasa==8) {
            sel8 = "selected=\"selected\"";
        }
*/
        }
          //}
        if (Sasa==1) {
            ID1 = new String(ID);
        } else
        if (Sasa==2) {
            ID2 = new String(ID);
        } else
        if (Sasa==3) {
            ID3 = new String(ID);
        } else
        if (Sasa==4) {
            ID4 = new String(ID);
        } else
        if (Sasa==5) {
            ID5 = new String(ID);
        } else
        if (Sasa==6) {
            ID6 = new String(ID);
        }  else
        if (Sasa==7) {
            ID7 = new String(ID);
        } else
        if (Sasa==8) {
            ID8 = new String(ID);
        } 
    
        
        JSONObject obj = new JSONObject();
        if (phase.equals("empty")) {
        obj.put("phase", "empty");
        } else
        {
        obj.put("phase", phase);
        }

        if (ID.equals("ID"+Sasa+": empty")) {
        obj.put("ID", "ID"+Sasa+": empty");
        } else
        {
        obj.put("ID", ID);    
        }
    
        JSONObject sensors = new JSONObject();
        if (phase_count.equals("empty")) {
        sensors.put("phase_count", "empty");
        } else
        {
        sensors.put("phase_count", phase_count);    
        }
        if (humidity.equals("empty")) {
        sensors.put("humidity", "empty");
        } else
        {
        sensors.put("humidity", humidity);    
        }
        if (temperature.equals("empty")) {
        sensors.put("temperature", "empty");
        } else
        {
        sensors.put("temperature", temperature);    
        }
        if (phase_usage.equals("empty")) {
        sensors.put("phase_usage", "empty");
        } else
        {
        sensors.put("phase_usage", phase_usage);    
        }
        if (phase_power_W.equals("empty")) {
        sensors.put("phase_power_W", "empty");
        } else
        {
        sensors.put("phase_power_W", phase_power_W);    
        }
        obj.put("sensors", sensors);
        
        List1.add(obj);
        try {
            file = new FileWriter("C://ZADATAK_TESTWEBAPP//TEXT"+Sasa+".txt");
            file.write(List1.toJSONString());
            } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
 
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    private static void parseEmployeeObject2(JSONObject employee) 
    {
        JSONArray List1 = new JSONArray();
        String phase = (String) employee.get("phase");
        String ID = (String) employee.get("ID");
        JSONObject sensors1 = (JSONObject) employee.get("sensors");
        String phase_count = (String) sensors1.get("phase_count");
        String humidity = (String) sensors1.get("humidity");
        String temperature = (String) sensors1.get("temperature");
        String phase_usage = (String) sensors1.get("phase_usage");
        String phase_power_W = (String) sensors1.get("phase_power_W");
        
        //if (ID.equals("ID"+Sasa+": empty")){
        //    ID=new String("ID"+Sasa+": empty");
        //}
        
        System.out.println("12 "+ID);  
        
        System.out.println("100 "+test22);
        
        System.out.println("1000 "+selected22);
        
        
          //}
        if (Sasa==1) {
            ID1 = new String(ID);
        } else
        if (Sasa==2) {
            ID2 = new String(ID);
        } else
        if (Sasa==3) {
            ID3 = new String(ID);
        } else
        if (Sasa==4) {
            ID4 = new String(ID);
        } else
        if (Sasa==5) {
            ID5 = new String(ID);
        } else
        if (Sasa==6) {
            ID6 = new String(ID);
        }  else
        if (Sasa==7) {
            ID7 = new String(ID);
        } else
        if (Sasa==8) {
            ID8 = new String(ID);
        }  
    
        
        JSONObject obj = new JSONObject();
        obj.put("phase", phase);
        
        obj.put("ID", ID);    
        
        JSONObject sensors = new JSONObject();
        sensors.put("phase_count", phase_count);    
        sensors.put("humidity", humidity);    
        sensors.put("temperature", temperature);    
        sensors.put("phase_usage", phase_usage);    
        sensors.put("phase_power_W", phase_power_W);    
        obj.put("sensors", sensors);
        
        List1.add(obj);
        try {
            file = new FileWriter("C://ZADATAK_TESTWEBAPP//TEXT"+Sasa+".txt");
            file.write(List1.toJSONString());
            } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
 
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    private static void parseEmployeeObject1(JSONObject employee) 
    {
        JSONArray List1 = new JSONArray();
        String phase = (String) employee.get("phase");
        String ID = (String) employee.get("ID");
        JSONObject sensors1 = (JSONObject) employee.get("sensors");
        String phase_count = (String) sensors1.get("phase_count");
        String humidity = (String) sensors1.get("humidity");
        String temperature = (String) sensors1.get("temperature");
        String phase_usage = (String) sensors1.get("phase_usage");
        String phase_power_W = (String) sensors1.get("phase_power_W");
        
        if (ID.equals("ID"+Sasa+": empty")){
            ID=new String("ID"+Sasa+": empty");
        }
        
        if (Integer.parseInt(selected22)==Sasa){
        phase11=new String(test22);
        } else
        {
        phase11=new String("");    
        }
        
        System.out.println("12 "+ID);  
        
        System.out.println("100 "+test22);
        
        System.out.println("1000 "+selected22);
        
          if (test22.equals(ID)){
          //selected22=Sasa.toString(
          ID22=new String(ID);
          phase_count2=new String(phase_count);
          humidity2=new String(humidity);
          temperature2=new String(temperature);
          phase_usage2=new String(phase_usage);
          phase_power_W2=new String(phase_power_W);
          
          if (sasa111.equals("Ugasi")) {
          ID=new String("ID"+Sasa+": empty");;
          phase_count=new String("empty");
          humidity=new String("empty");
          temperature=new String("empty");;
          phase_usage=new String("empty");
          phase_power_W=new String("empty");
          ID22=new String(ID);
          phase_count2=new String(phase_count);
          humidity2=new String(humidity);
          temperature2=new String(temperature);
          phase_usage2=new String(phase_usage);
          phase_power_W2=new String(phase_power_W);    
          }
          System.out.println("yess "+ID22);
        //System.out.println("11 "+phase_power_W2);  
        //System.out.println("12 "+phase_usage2);  
          }
          
        if (Sasa==1) {
            ID1 = new String(ID);
        } else
        if (Sasa==2) {
            ID2 = new String(ID);
        } else
        if (Sasa==3) {
            ID3 = new String(ID);
        } else
        if (Sasa==4) {
            ID4 = new String(ID);
        } else
        if (Sasa==5) {
            ID5 = new String(ID);
        } else
        if (Sasa==6) {
            ID6 = new String(ID);
        }  else
        if (Sasa==7) {
            ID7 = new String(ID);
        } else
        if (Sasa==8) {
            ID8 = new String(ID);
        } 
    
        //ID22=ID;
        
        JSONObject obj = new JSONObject();
        if (phase.equals("empty")) {
        obj.put("phase", "empty");
        } else
        {
        obj.put("phase", phase);
        }

        if (ID.equals("ID"+Sasa+": empty")) {
        obj.put("ID", "ID"+Sasa+": empty");
        } else
        {
        obj.put("ID", ID);    
        }
    
        JSONObject sensors = new JSONObject();
        if (phase_count.equals("empty")) {
        sensors.put("phase_count", "empty");
        } else
        {
        sensors.put("phase_count", phase_count);    
        }
        if (humidity.equals("empty")) {
        sensors.put("humidity", "empty");
        } else
        {
        sensors.put("humidity", humidity);    
        }
        if (temperature.equals("empty")) {
        sensors.put("temperature", "empty");
        } else
        {
        sensors.put("temperature", temperature);    
        }
        if (phase_usage.equals("empty")) {
        sensors.put("phase_usage", "empty");
        } else
        {
        sensors.put("phase_usage", phase_usage);    
        }
        if (phase_power_W.equals("empty")) {
        sensors.put("phase_power_W", "empty");
        } else
        {
        sensors.put("phase_power_W", phase_power_W);    
        }
        obj.put("sensors", sensors);
        
        List1.add(obj);
        try {
            file = new FileWriter("C://ZADATAK_TESTWEBAPP//TEXT"+Sasa+".txt");
            file.write(List1.toJSONString());
            } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
 
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
    private static void TESTsasa() {
        File theDir = new File("C://ZADATAK_TESTWEBAPP//");
        if (!theDir.exists()){
        theDir.mkdirs();
        }
        JSONArray List1 = new JSONArray();
        JSONObject obj = new JSONObject();
        
        String ID="ID"+Sasa+": empty";
        
        obj.put("phase", "empty");
        
  //      JSONObject obj1 = new JSONObject();
        if (Sasa==1) {
            ID1 = ID;
        } else
        if (Sasa==2) {
            ID2 = ID;
        } else
        if (Sasa==3) {
            ID3 = ID;
        } else
        if (Sasa==4) {
            ID4 = ID;
        } else
        if (Sasa==5) {
            ID5 = ID;
        } else
        if (Sasa==6) {
            ID6 = ID;
        }  else
        if (Sasa==7) {
            ID7 = ID;
        } else
        if (Sasa==8) {
            ID8 = ID;
        } 
  
        obj.put("ID", ID);
        
        //obj.put("status", obj1);
 
        JSONObject sensors = new JSONObject();
        sensors.put("phase_count", "empty");
        sensors.put("humidity", "empty");
        sensors.put("temperature", "empty");
        sensors.put("phase_usage", "empty");    
        sensors.put("phase_power_W", "empty");
        obj.put("sensors", sensors);
        List1.add(obj);
        //List1.add(obj1);
        //List1.add(sensors);
try {
            file = new FileWriter("C://ZADATAK_TESTWEBAPP//TEXT"+Sasa+".txt");
            file.write(List1.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
 
        } finally {
 
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        }

}
