// TestFilmoMelGUI.java

import basicGUI.FastTester;

public class TestFilmoMelGUI extends FastTester{

   public void testAction(){
   	FilmoMel filmo;
	textAreaGUI.append(
			(filmo = new FilmoMel()).toString()
			+ "\n"
		);
   }

   public static void main(String [] args){
	TestFilmoMelGUI tester = new TestFilmoMelGUI();
	tester.startApplication();
   }
	
}