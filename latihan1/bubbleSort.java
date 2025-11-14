/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Informatika
 */
public class bubbleSort {
    public static void main(String[] args) {
        
        int[] data = {30,20,50,16,71};
        
        for(int i = 0; i < data.length -1 ; i++){
            
            for(int j=0 ; j < data.length -i -1; j++ ){
                
                if(data[j] < data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        
        for(int d:data){
            System.out.println(d + " ");
        }
        
    }
}
