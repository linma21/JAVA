package ch20.sec09;

import java.util.Date;

import lombok.Data;

@Data //Getter, Setter, hashcode(), equal(), toString() 자동 생성

public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private Date bdate;
}
