package com.sg.foundations.day.excersise1;
/**
 *
 * @author Paul van Sittert
 */
public class EggCount {
    private int eggs;
    private int dozenEggs;
    private int grossEggs;

    public EggCount(int eggs) {
        this.eggs = eggs;
        sortEggs();
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
        sortEggs();
    }

    public int getDozenEggs() {
        return dozenEggs;
    }

    public void setDozenEggs(int dozenEggs) {
        this.dozenEggs = dozenEggs;
        sortEggs();
    }

    public int getGrossEggs() {
        return grossEggs;
    }

    public void setGrossEggs(int grossEggs) {
        this.grossEggs = grossEggs;
        sortEggs();
    }
    
    private void sortEggs(){
        while(eggs > 143){
            this.grossEggs +=1;
            this.eggs -= 144;
        }
        
        while(eggs > 11){
            this.dozenEggs +=1;
            this.eggs -= 12;
        }
    }
    
}
