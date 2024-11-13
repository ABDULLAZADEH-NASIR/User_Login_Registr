public class Validation {

    public boolean validationUserName(User user){

        if(user.getUserName()==null || user.getUserName().length()>10){
            return false;

        }else {
            return true;
        }

    }
    public boolean validationPassword(User user){

        if(user.getPassword().length()>15){

            return  false;
        }
        else {
            return true;
        }

    }










}
