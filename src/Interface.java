

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;  
public class Interface extends JFrame {
  String color, season, lifecycle, soil, size, perfume;

    Interface(){
        String colors[]={"blue","purple","yellow","red","white","pink","orange","violet","pinkish-red"};  
        String seasons[]={"Autumn","Summer","Spring","Winter"};  
        String lifecycles[]={"One year","More than one year"};  
        String soils[]={"Acidic","Loose","Fertile","Rich","Well-drained"};  
        
        JComboBox colorscb = new JComboBox(colors);
        JComboBox seasoncb = new JComboBox(seasons);
        JComboBox lifecyclecb = new JComboBox(lifecycles);
        JComboBox soilcb = new JComboBox(soils);
        
        JTextField sizetf = new JTextField();
        
        JLabel answer = new JLabel("Your flower is ");
        
        JLabel sizelbl = new JLabel("Size");
        
        JCheckBox perfumechb = new JCheckBox("Perfume");
        
        JButton button = new JButton("What's my flower");
        
        button.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            color= (String)colorscb.getItemAt(colorscb.getSelectedIndex());
            season= (String)seasoncb.getItemAt(seasoncb.getSelectedIndex());
            lifecycle= (String)lifecyclecb.getItemAt(lifecyclecb.getSelectedIndex());
            soil= (String)soilcb.getItemAt(soilcb.getSelectedIndex());
            size= sizetf.getText();
            if(perfumechb.isSelected()){
                perfume = "true";
            }
            else{
                perfume = "false";
            }
            answer.setText(perfume);
            }
             });  
        
        
        add(colorscb);
        add(sizetf);
        add(seasoncb);
        add(perfumechb);
        add(lifecyclecb);
        add(soilcb);
        add(button);
        add(answer);
        
        setLayout(new GridLayout(4,4,10,10));
        setSize(500,500);  
        setVisible(true);  
    }
}
