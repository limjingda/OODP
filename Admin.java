import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Admin implements Serializable{

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    public String accessTime;
    public String course;
    public int courseIndex;
    public int vacancy;

    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getPassword(){
        return this.password;}
        
    public String getUserName(){
        return this.username;
    }

    
    public void addStudent(Object Admin) {
		return;
	}
	
	public String studentAccessTime() {
		return accessTime;
	}
	
	public String addCourse(){
        return course;
    }

    public int updateCourse(){
        return courseIndex;
    }

    public int checkVacancy(){
        return vacancy;
    }
   
   public static Admin getAdminbyUsername(String username, List<Admin> adminList) {
		for (int i = 0; i < adminList.size(); i++) {
			if (adminList.get(i).getUserName() == username) {
				return adminList.get(i);
			}
		}
		return null;
	}

    public static void main(String[] args) {
        Admin adminObj = new Admin("Admin", "Admin");
        

        DatabaseManager databaseManager = new DatabaseManager();
        ArrayList<Admin> adminList = databaseManager.DeserializeAdminList();

        adminList.add(adminObj);

        databaseManager.SerializeAdminList(adminList);
    }
   
}