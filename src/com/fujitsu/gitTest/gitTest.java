package com.fujitsu.gitTest;

import java.io.ObjectStreamField;

/**
 * git test
 * @author yang.bo
 *
 */
public class gitTest {
	// test
	public static void main(String[] args) {
		System.out.println("Hello! git!");
		
		if (true) {
			
			System.out.println("test");
		}
	}
	
	/**
     * Class String is special cased within the Serialization Stream Protocol.
     *
     * A String instance is written initially into an ObjectOutputStream in the
     * following format:
     * <pre>
     *      <code>TC_STRING</code> (utf String)
     * </pre>
     * The String is written by method <code>DataOutput.writeUTF</code>.
     * A new handle is generated to  refer to all future references to the
     * string instance within the stream.
     */
    @SuppressWarnings("unused")
	private static final ObjectStreamField[] serialPersistentFields =
            new ObjectStreamField[0];
}
