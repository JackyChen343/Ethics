/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343089579
 */
public class Verdict {
    private String caseTitle;
    private String studentVerdict;
    private String reason;
    
    public Verdict(){
        this.caseTitle = "none";
        this.studentVerdict = "none";
        this.reason = "none";
    }
    public Verdict(String caseTitle, String verdict, String reason){
        this.caseTitle = caseTitle;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    public void setCase(String caseTitle){
        this.caseTitle = caseTitle;
    }
    public String getCase(){
        return caseTitle;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
    public String getReason(){
        return reason;
    }
    public void setStudentVerdict(String verdict){
        this.studentVerdict = verdict; 
    }
    public String getStudentVerdict(){
        return studentVerdict;
    }
    public String toString(){
        return "Case Title: " + caseTitle + " Student Verdict: " + studentVerdict + " Reason: " + reason;
    }
}
