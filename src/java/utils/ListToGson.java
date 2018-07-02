package utils;
import com.google.gson.Gson;
import json.data.Main;
import models.UserModel;


public class ListToGson {
    Util utils=new Util();
    public String toJson() throws Exception
    {

     Gson myGson=new Gson();
     
     Main mn=new Main();
    
     StringBuilder stBuild=new StringBuilder();
     for(UserModel a:mn.start()){
         stBuild.append(myGson.toJson(a));
     }
     /*String jSonList = myGson.toJson(myUtil.getUserList());
     return jSonList;*/
     return stBuild.toString();
    }
    
}
