import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.util.Map;
import java.util.List;

class JSONToJava {

   public static void main(String[] args){
	
      JSONParser parser = new JSONParser();
	  String jSONString="{\"key\":\"value\",\"key1\":\"value1\",\"key2\":[1,2,3,4]}";
      try{
         JSONObject jSONObj = (JSONObject)parser.parse(jSONString);
         System.out.println(jSONObj.toString());
         System.out.println(((Map)jSONObj).get("key"));
         System.out.println(jSONObj.get("key1").toString());
         JSONArray jSONArr=(JSONArray)jSONObj.get("key2");
         System.out.println(((List)jSONArr).get(1));
         System.out.println(jSONArr.get(1));
    }catch(ParseException pe){
		
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
   }
}