// TestImageRepartoCorazonValGUI.java

import basicGUI.BaseAppGUI;
import basicGUI.ImagePanel;
import basicGUI.InternalButton;
import basicGUI.FlowPanel;
import java.awt.TextArea;

public class TestImageRepartoCorazonValGUI extends BaseAppGUI {

        private class DataButton extends InternalButton{
                public void pushAction(){
                        showReparto();       
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

                photograph.setImage("c:/ProyectoCineTeK/imagenes/BraveHeart.jpg", 300, 375);

                dataButton.setLabel("show film");

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

        public void showReparto(){
        		RepartoCorazonVal reparto;
				dataArea.append(
					(reparto = new RepartoCorazonVal()).toString()
					+ "\n"
				);                 
        }

        public static void main(String [] args){
                TestImageRepartoCorazonValGUI tst = new TestImageRepartoCorazonValGUI();
                tst.startApplication();
        }

}
