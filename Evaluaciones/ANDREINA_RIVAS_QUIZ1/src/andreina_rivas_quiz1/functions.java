/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class functions {
    
    public static String make_readable_show(String string){
        String[] array = string.split("(?=\\p{Upper})");
        String title = "";
        for (int i =0; i<array.length-1;i++){
            title+=array[i]+" ";
        }
        title +=array[array.length-1];
        return title;
    }
    

    
    public static String fix_input(String input){
       
        return input.toLowerCase();
    }
            
    public static String make_readable(String longString){
        String[] array = longString.split(" ");
        String readable="";
        for(int i =0; i<array.length;i++){
            readable+= array[i]+" ";
            if(i%10==0){
                readable+="\n";
            }
        }
        return readable;       
    }
    
    
    public static void read_file(File path, ShowList ShowList){ 
        String read = "";
        String line;
        File f = path;
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            else{
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                while((line=br.readLine())!=null){
                    if(!line.isEmpty()){
                        read+=line+"\n";}
                }
            if(!"".equals(read)){
                String[] text_lines = read.split("\n");
                NodoS newShow=null;
                for (int i=0; i<text_lines.length; i++){
                   
                    if (text_lines[i].contains("%")){

                        if(newShow!=null){

                            ShowList.insert(newShow);
                        }
                        String[] show_info = text_lines[i].split("/");
                        String showName = make_readable_show(show_info[0].replace("%","").replace(" ", ""));
                        String showType= show_info[2].replace("%","").replace(" ","");
                        newShow = new NodoS(showName, show_info[1], showType);

                    }
                    else{
                        
                        String[] ep_info = text_lines[i].split("/");
                        String epN = ep_info[0];
                        NodoEp newEp = new NodoEp(epN, ep_info[1]);
                        newShow.getEpisodes().addAtEnd(newEp);
                    }
                }
                ShowList.insert(newShow);
            }
            
            br.close();
            JOptionPane.showMessageDialog(null, "Cargada Exitosa");
            }
            }
            
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR CARGANDO");
        }
        
    }
    
}
