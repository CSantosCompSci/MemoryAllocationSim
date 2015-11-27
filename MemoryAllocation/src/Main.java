import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Create arraylist to contain the memory slots read from Minput.data
		ArrayList<MainMemory> memory = new ArrayList<MainMemory>();
		//Create arraylist to contain the processes read from Pinput.data
		ArrayList<Process> processes = new ArrayList<Process>();
		//Variable to assign a number to each slot
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
	
		firstFit(memory, processes);
		worstFit(memory, processes);
		bestFit(memory, processes);


	}
	//method to allocate processes to memory slots based on the first slot that is large enough for the process
	public static void firstFit(ArrayList<MainMemory> mainMemory, ArrayList<Process> processes) {
		for (int processNum = 0; processNum < processes.size(); processNum++){
			for (int memSlot = 0; memSlot < mainMemory.size(); memSlot++){
				int processSize =  processes.get(processNum).getProcessSize();
				int slotSize = mainMemory.get(memSlot).getSlotSize();
				if(processSize <= slotSize){
					//set the starting index of memory slot chosen
					processes.get(processNum).setMemoryStart(mainMemory.get(memSlot).getStartAddress());
					//set the end address of the memory slot that the process was allocated to
					processes.get(processNum).setMemoryEnd();
					//reduce the slot size of the memory slot
					mainMemory.get(memSlot).reduceSlotSize(processSize);
				}
			}
		}
		PrintWriter writer = new PrintWriter("FFoutput.data", "UTF-8");
		for(int index = 0; index < scheduler.size(); index++)
		{
			writer.print(scheduler.get(index).getStartTime() + "  " + scheduler.get(index).getEndTime() + "  " + scheduler.get(index).getProcess());
			writer.println();
		}
		writer.close();
		}
	}
	public static void worstFit(ArrayList<MainMemory> mainMemory, ArrayList<Process> processes) {

	}
	public static void bestFit(ArrayList<MainMemory> mainMemory, ArrayList<Process> processes) {
	}
}
// first fit - finds the first hole that is big enough for the program

// Best fit - scan the entire list and find the smallest hole to place the
// program

// Worst Fit- scan the entire list and find the largest hole for the program