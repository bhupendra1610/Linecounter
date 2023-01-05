 import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;
    
    
    public class TextCounterApplet extends Applet implements ActionListener {
    
       TextArea textInput;    
       
       Label lineCountLabel;  
      
    
    
       public void init() {
          
          setBackground(Color.darkGray);
          
          textInput = new TextArea();
          textInput.setBackground(Color.white);
          
          Panel south = new Panel();
          south.setLayout( new GridLayout(4,1,2,2) );
          
          
          Button countButton = new Button("Process the Text");
          countButton.setBackground(Color.lightGray);
          countButton.addActionListener(this);
          south.add(countButton);
          
          lineCountLabel = new Label("  Number of lines:");
          lineCountLabel.setBackground(Color.white);
          lineCountLabel.setForeground(Color.blue);
          south.add(lineCountLabel);
     
          
          setLayout( new BorderLayout(2,2) );
          add(textInput, BorderLayout.CENTER);
          add(south, BorderLayout.SOUTH);
          
       }        
       
       public Insets getInsets() {
          
          return new Insets(2,2,2,2);
       }
       
    
       public void actionPerformed(ActionEvent evt) {
                      
           String text; 
           int charCt, lineCt; 
           
           text = textInput.getText();
           
           charCt = text.length();  
           lineCt = 1;
           for (int i = 0; i < charCt; i++) {
              if (text.charAt(i) == '\n')
                 lineCt++;
           }
           lineCountLabel.setText("  Number of Lines:  " + lineCt);
         
       } 
    
     
       
    } 

//html file name = "tt.txt"
//applet code = "TextCounterApplet.class width = 500 height  =400"
