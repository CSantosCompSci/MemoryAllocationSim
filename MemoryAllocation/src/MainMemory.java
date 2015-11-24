
public class MainMemory {
	int startAddress, endAddress, slotSize, slotNum;

	public MainMemory(int address, int endAddress, int memorySlotNum) {
		this.startAddress = address;
		this.endAddress = endAddress;
		this.slotNum = memorySlotNum:
		slotSize = endAddress - startAddress;
	}

	public int getSlotSize(int slotNum) {
		return slotSize;
	}

	public int reduceSlotSize(int processSize, int slotNum) {

	}

	public void insertProcess(int processSize) {

	}
}
