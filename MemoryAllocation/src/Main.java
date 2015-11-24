import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<MainMemory> memory = new ArrayList<MainMemory>();
		ArrayList<Process> processes = new ArrayList<Process>();
		int memoryCounter = 0;
		try {
			Scanner reader = new Scanner(new File("“Minput.data”"));

			int numOfFreeSlots = reader.nextInt();
			while (reader.hasNext()) {
				int startAddress = reader.nextInt();
				int endAddress = reader.nextInt();

				MainMemory memorySlot = new MainMemory(startAddress, endAddress, memoryCounter);
				memoryCounter++;
				memory.add(memorySlot);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Scanner reader2 = new Scanner(new File("“Pinput.data”"));
			int numOfProcesses = reader2.nextInt();
			while (reader2.hasNext()) {
				int processID = reader2.nextInt();
				int processSize = reader2.nextInt();

				Process process = new Process(processID, processSize);
				processes.add(process);
			}
			reader2.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader2.close();
		startAllocating(memory, processes);
	}

	public static void startAllocating(ArrayList<MainMemory> mainMemory, ArrayList<Process> processes) {
		for (int processNum = 0; processNum < processes.size(); processNum++){
			for (int memSlot = 0; memSlot < mainMemory.size(); memSlot++){
				int processSize =  processes.get(processNum).getProcessSize();
				int slotSize = mainMemory.get(memSlot).getSlotSize();
				if()
			}
		}
	}
}
// first fit - finds the first hole that is big enough for the program

// Best fit - scan the entire list and find the smallest hole to place the
// program

// Worst Fit- scan the entire list and find the largest hole for the program