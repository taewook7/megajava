package 정리문제;

public interface DAOinterface {
	void create(String id, String pw);
	void read(String id);
	void update(String id,String pw);
	void delete(String id);
}

//문제
//DAO interface
//1) create(String id, String pw)
//2) read(String id)
//3) update(String id,String pw)
//4) delete(String pw)
//
//
//익명클래스 
//1) create: root,1234로 가입완료!
//2) read: root 의 정보는 비밀번호가 1234 입니다.
//3) update: root의 비밀번호가 9999로 변경되었습니다.
//4) delete: root 가 삭제되었습니다.
