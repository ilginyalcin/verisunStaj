package json.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.rowset.CachedRowSet;
import models.UserModel;
import utils.ListToGson;
import utils.Util;


public class Main {

    
    DbOperations dbOp; 
    Statement statement;
    public CachedRowSet resWanted;
    Util myUtil;
    ListToGson gson=new ListToGson();
    String result;
    
    
    
    public List<UserModel> start() throws Exception {
        ResultSet myRs;
        dbOp=new DbOperations();
        myUtil=new Util();
        
        statement = dbOp.baglantiAc();
        resWanted = dbOp.createStatement();
        myRs=queryWork();
        myUtil.addUser(myRs);
        return myUtil.getUserList();
        
        
    }

    
    public ResultSet queryWork() throws SQLException {
        String query;
        query = "select * from users";
        PreparedStatement pst = dbOp.getConnection().prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        return rs;
        
    }
}
