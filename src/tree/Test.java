package tree;
import java.io.*;

public class Test{

	public Test(){
	Temp t1 = new Temp();
	Temp t2 = new Temp();
	Label l1 = new Label();
	Label l2 = new Label();
	Label l3 = new Label();
	SEQ s = new SEQ(new CJUMP(CJUMP.EQ, new TEMP(t1), new CONST(0), l1, l2) , 
			new SEQ(new LABEL(l1), 
			new SEQ(new MOVE(new TEMP(t2), new CONST(5)), 
			new SEQ(new JUMP(l3),
			new SEQ(new LABEL(l2), 
			new SEQ(new MOVE(new TEMP(t2), new CONST(7)), new LABEL(l3)))))));
				
			System.out.printf(s.toString());

	}
}

