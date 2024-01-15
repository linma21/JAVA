package ch15.sec02.exam01;
//642
public class Board {
	private String subject;
	private String content;
	private String winter;
	public Board(String subject, String content, String winter) {
		this.subject = subject;
		this.content = content;
		this.winter = winter;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWinter() {
		return winter;
	}
	public void setWinter(String winter) {
		this.winter = winter;
	}
}
