/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343089579
 */
public class MisinfomationCase extends EthicsCase{
    private String mediaType;
    public MisinfomationCase(String caseTitle, String description, String mediaType){
    super(caseTitle, description,"Misinformation");
    this.mediaType=mediaType;
    }
    
    public String getMediaType(){
        return mediaType;
    }
    public String toString(){
        return mediaType;
    }
    
    
}
