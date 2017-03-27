package com.company;


public class Operations {

        Boolean x;
        Boolean y;
        Boolean result;
    //true = 1;
    //false = 0;

        public boolean and(boolean x, boolean y) { return result =  x&&y; }
        public boolean or(boolean x, boolean y)
    {
        return result = x||y;
    }
        public boolean notX(boolean x) { return result = (!x);}
        public boolean notY(boolean y) { return result = (!y);}
        public boolean xor(boolean x, boolean y)
        {
            return result = (x||y)&&(!x||!y);
        }
        public boolean constOne(boolean x, boolean y) { return result = true;}
        public boolean constZero(boolean x, boolean y) { return result = false;}
        public boolean shtShef(boolean x, boolean y) { return result = !x||!y; }
        public boolean impl(boolean x, boolean y) { return result = (!x)||y; }
        public boolean nimpl(boolean x, boolean y) { return result = x&&(!y); }
        public boolean firstArg(boolean x) { return result = x;}
        public boolean secondArg(boolean y) { return result = y;}
        public boolean strPirs(boolean x, boolean y) { return result = !x&&!y;}
        public boolean equiv(boolean x, boolean y) { return result = (x&&y)||(!x&&!y);}
        public boolean convAplic(boolean x, boolean y) { return result = x||!y;}
        public boolean nconvAplic(boolean x, boolean y) { return result = y&&!x;}

        /*boolean aplik(boolean x,boolean y)
        {
            return  !(!x||y);
        }



*/

}
