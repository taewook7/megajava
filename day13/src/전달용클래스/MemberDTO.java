package 전달용클래스;

//전달 가방역할!
//data transfer object(DTO) 데이터전달용 클래스 DTO 라고 부른다
//값만들어가는 오브젝트라고해서 value object(VO) 라 한다.
public class MemberDTO {
	String id;
	String pw;
	String name;
	String tel;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	

	
	
	
}
