/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.square;

/**
 *
 * @author Isaac kissimba
 */
public class CountingRooms {
        private String flow, local;{
    
    }
    public String getflow (){
        return flow;
}
    public void setflow(String flow){
        this.flow=flow;
    }
    public String getlocal (){
        return local;
}
    public void setlocal(String local){
        this.local=local;
}
    @Override
    public String toString(){
        return "square{" + " flow=" +  flow + " , local=" + local + ')';
    }

    void setpool(String pool) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

    

