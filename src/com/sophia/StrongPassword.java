package com.sophia;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int missingChars = 0;
        String special_characters = "!@#$%^&*()-+";
        boolean hasNumber = false;
        boolean hasLower= false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        for (int i = 0;i < password.length() && !hasNumber || !hasLower|| !hasUpper || !hasSpecial ; i++){
            if(!hasUpper){
                hasUpper = Character.isUpperCase(password.charAt(i));
                if(!hasLower){
                    hasLower = Character.isLowerCase(password.charAt(i));
                    if(!hasNumber){
                        hasNumber = Character.isDigit(password.charAt(i));
                        if(!hasSpecial){
                            hasSpecial = special_characters.indexOf(password.charAt(i)) != -1;
                            hasSpecial = true;
                        }
                        if(!hasNumber) missingChars++;
                        if(!hasUpper) missingChars++;
                        if(!hasLower) missingChars++;
                        if(!hasSpecial) missingChars++;
                        if(password.length() < 6){
                            if(6-password.length() > missingChars)
                                missingChars = 6 - password.length();

                        }
                    }
                }

            }
        }
        return missingChars;
    }
}
