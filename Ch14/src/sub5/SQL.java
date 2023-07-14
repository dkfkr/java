package sub5;

public class SQL {

	public static final String INSERT_USER = "insert into User3 values (?,?,?,?)";
	public static final String SELECT_USERS = "SELECT * FROM User3";
	public static final String SELECT_USER = "SELECT * FROM User3 where `uid`=?";
	public static final String UPDATE_USER = "UPDATE User3 SET "
										   +"name =?,"
										   +"hp =?,"
										   +"age =?,"
										   +" where uid =?";
	public static final String DELETE_USER = "DELETE FROM User3 where uid =?";
	
}
