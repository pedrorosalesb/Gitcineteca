// TestRepartoCorazonValGUI.java

import basicGUI.FastTester;

public class TestRepartoCorazonValGUI extends FastTester{

   public void testAction(){
   	RepartoCorazonVal reparto;
	textAreaGUI.append(
			(reparto = new RepartoCorazonVal()).toString()
			+ "\n"
		);
   }

   public static void main(String [] args){
	TestRepartoCorazonValGUI tester = new TestRepartoCorazonValGUI();
	tester.startApplication();
   }
	
}