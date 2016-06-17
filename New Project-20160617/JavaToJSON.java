import org.json.simple.JSONObject;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class JavaToJSON {
@SuppressWarnings("unchecked")
   public static void main(String[] args){
      JSONObject obj = new JSONObject();
      Map<String,String> map=new<String,String> HashMap();
      map.put("1","test");
      map.put("2","test1");
      map.put("3","test2");
      List <String> list=new <String>ArrayList();
      list.add("foo");
      list.add("bar");
      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));
      obj.put("map", map);
      obj.put("list", list);
      String jsonString=obj.toString();
      System.out.println(jsonString);
   }
}