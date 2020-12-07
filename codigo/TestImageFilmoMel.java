// TestImageFilmoMel.java

import basicGUI.BaseAppGUI;
import basicGUI.ImagePanel;
import basicGUI.InternalButton;
import basicGUI.FlowPanel;
import java.awt.TextArea;

public class TestImageFilmoMel extends BaseAppGUI {

        private class DataButton extends InternalButton{
        		int index = 0;
                public void pushAction(){
                        showReparto(++index);
                        if(index == 3) index = 0;      
                }
        }

        private TextArea        dataArea;
        private ImagePanel      photograph;
        private FlowPanel       controlPanel;
        private DataButton      dataButton;

        public void createComponents(){

                super.createComponents();
                dataArea = new TextArea(10, 40);
                photograph = new ImagePanel();
                controlPanel = new FlowPanel();
                dataButton = new DataButton();
        }

        public void distributeComponents(){

                super.distributeComponents();

                dataButton.setLabel("show films");

                controlPanel.add(dataButton);

                frameGUI.addNorth(controlPanel);
                frameGUI.addCenter(photograph);
                frameGUI.addWest(dataArea);                

        }

        public void startApplication(){

                super.startApplication();

                frameGUI.setTitle("SysCinema Application");
                frameGUI.setSize(650,500);
                frameGUI.setResizable(false);
                frameGUI.setVisible(true);

        }

        public void showReparto(int index){
        		FilmoMel filmo;
				dataArea.append(
						(filmo = new FilmoMel()).toString()
						+ "\n"
				);   
				if(index == 1){
					photograph.setImage("c:/ProyectoCineTeK/imagenes/SiempreJoven.jpg", 300, 380); 
				}else if(index == 2){
					photograph.setImage("c:/ProyectoCineTeK/imagenes/Maverick.jpg", 300, 380);
				}else if(index == 3){
					photograph.setImage("c:/ProyectoCineTeK/imagenes/Patriota.jpg", 300, 380);					
				}   
				photograph.repaint();   
        }

        public static void main(String [] args){
                TestImageFilmoMel tst = new TestImageFilmoMel();
                tst.startApplication();
        }

}
