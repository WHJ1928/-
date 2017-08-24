package 封装;

public class Station {
	private String directorname;//主任
	private String managername;//各部门经理
	private String chairmanname;//董事长
	public String getDirectorname() {
		return directorname;
	}
	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getChairmanname() {
		return chairmanname;
	}
	public void setChairmanname(String chairmanname) {
		this.chairmanname = chairmanname;
	}
}
