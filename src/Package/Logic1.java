package Package;

public class Logic1 {

    //When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


    //If it is the weekend and there are more than or equal to 40 cigars then the  squirrels will party, but if it does not met these standards it will move to the 1st else if statement which says that if it is not the weekend and the cigars are less than 40 or more than 60 that there is no party. If either of those first two "if" statements do not apply it then will move to the last one which will check if it is the weekend and if there are less than 40 cigars that there is no party otherwise it will be true and the squirrels will party.


    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40 ){
          return true;
        } else if(!isWeekend && cigars < 40 || cigars > 60){
          return false;
        } else if (isWeekend && cigars < 40){
          return false;
        }
        return true;
      }
    
}