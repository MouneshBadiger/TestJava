
package core.collection.enumtest;

import java.io.Closeable;
import java.io.IOException;

/**
 * This Enum example shows all the things we can do with Enum types
 *Enum class will always be public
 */
public enum S3ThreadStatesEnum  implements Closeable{
	//Note: Compiler create .class files for all 4 anonymous inner classes
	START(1){
		@Override
		public String toString(){
			return "START implementation. Priority="+getPriority();
		}

		@Override
		public String getDetail() {
			return "START";
		}
		
	},
	RUNNING(2){
		@Override
		public String getDetail() {
			return "RUNNING";
		}
	},
	WAITING(3){
		@Override
		public String getDetail() {
			return "WAITING";
		}
	},
	DEAD(4){
		@Override
		public String getDetail() {
			return "DEAD";
		}
	};
	
	private int priority;
	
	//Enum constructors should always be private.
	//public ThreadStatesEnum(int i){//Illegal modifier for the enum constructor; only private is permitted.
	private S3ThreadStatesEnum(int i){
		priority = i;
	}
	public abstract String getDetail();
	//Enum can have methods
	public int getPriority(){
		return this.priority;
	}
	
	public void setPriority(int p){
		this.priority = p;
	}
	
	//Enum can override functions
	/*@Override
	public String toString(){
		return "Default ThreadStatesConstructors implementation. Priority="+this.getPriority();
	}
*/
	@Override
	public void close() throws IOException {
		System.out.println("Close of Enum");
	}
}
