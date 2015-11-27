
public class Process {
	int processID;
	int processSize;
	int memoryStartIndex;
	int memoryEndIndex;
	public Process(int id, int size) {
		this.processID = id;
		this.processSize = size;
	}

	public int getProcessID() {
		return processID;
	}

	public int getProcessSize() {
		return processSize;
	}
	public void setMemoryStart(int memoryStart){
		memoryStartIndex = memoryStart;
	}
	public void setMemoryEnd(){
		memoryEndIndex = memoryStartIndex + processSize; 
	}
}
