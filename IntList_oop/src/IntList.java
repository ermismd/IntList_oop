
public class IntList {

private int[] sequence;

public IntList(int[] sequence) {
	this.sequence=sequence.clone();
	
}
	
public int getLength() {
	return sequence.length;
}
public int[] getSequence() {
	return sequence.clone();
}


public void addValue(int newValue) {
	int index=getLength();
	sequence[index+1]=newValue;
}

	
	
}
