package pojo;

public class PojoClass1 {
	public String projectName;
	public String status;
	public int teamSize;
	public PojoClass1(String projectName, String status, int teamSize) {
		super();
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	

}
