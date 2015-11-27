import java.util.ArrayList;

public class MainMemory {
	int startAddress, endAddress, slotSize, slotNum, tempSlotSize, tempStartIndex;
	public MainMemory(int address, int endAddress, int memorySlotNum) {
		this.startAddress = address;
		this.endAddress = endAddress;
		this.slotNum = memorySlotNum;
		slotSize = endAddress - startAddress;
		tempSlotSize = slotSize;
		tempStartIndex = startAddress;
		
	}

	public int getSlotSize() {
		return tempSlotSize;
	}
	//Method to reduce the slot size when process fits within its size parameters
	public void reduceSlotSize(int processSize) {
		tempSlotSize = tempSlotSize - processSize;
	}
	
	public void resetSlotSize(){
		tempSlotSize = slotSize;
	}
	public void setTempStartAddress(int newStart){
		tempStartIndex = newStart;
	}
	
	public int getStartAddress(){
		return tempStartIndex;
	}
	
	
}
