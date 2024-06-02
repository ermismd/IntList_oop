import java.util.Arrays;

import java.util.stream.IntStream;


/**
 * @invar|getLength()==getSequence().length
 * @invar|getSequence()!=null
 */

public class IntList {
/**
 * @represantationObject
 * @invar|sequence!=null
 */
private int[] sequence;


/**
 * 
 * @pre|sequence!=null
 * @inspects|sequence
 * @post|Arrays.equals(this.getSequence(),sequence)
 * 
 */
public IntList(int[] sequence) {
	this.sequence=sequence.clone();
	
}
	
public int getLength() {
	return sequence.length;
}

/*
 * @creates|result
 */
public int[] getSequence() {
	return sequence.clone();
}

/**
 * @mutates| this
 * @post|getSequence().length==old(getSequence().length+1)
 * @post|IntStream.range(0,old(getSequence().length)).allMatch(i->getSequence()[i]==old(getSequence())[i])
 * @post|getSequence()[getSequence().length-1]==newValue
 * 
 */
public void addValue(int newValue) {
	int index=getLength();
	sequence=Arrays.copyOf(sequence, index+1);
	sequence[sequence.length-1]=newValue;
}
/**
 * @mutates|this
 * @throws IllegalArgumentException|getSequence().length==0
 * @post|getSequence().length==old(getSequence().length)-1
 * @post|Arrays.equals(getSequence(),0,getSequence().length,old(getSequence()),0,getSequence().length)
 */
public void removeValue() {	
	
	sequence=Arrays.copyOf(sequence, getLength()-1);
	if (sequence.length==0) {throw new IllegalArgumentException("Empty Array");}
}
	
}
