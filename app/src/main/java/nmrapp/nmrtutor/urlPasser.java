package nmrapp.nmrtutor;

/**
 * Created by Andyh on 1/12/2018.
 */

public class urlPasser {

    static String nmrUrl;
    static String irUrl;
    static String cnmrUrl;

    static String nmrProb;




    public void setUrl(int pos){

        switch(pos){

            case 0:
                nmrUrl = "https://i.imgur.com/kIdnrrF.png";


                break;

            case 1:


                nmrUrl = "https://i.imgur.com/MYOo6r7.png";

                irUrl = "https://i.imgur.com/4OptqOT.png";

                cnmrUrl = "https://i.imgur.com/OQApPhP.png";

                break;
            case 2:
                nmrUrl = "https://i.imgur.com/AfDQVNx.png";

                irUrl = "https://i.imgur.com/OyME2jQ.png";

                cnmrUrl = "https://i.imgur.com/wu95KFb.png";
                break;


        }



    }

    public String getnmrUrl(){

        return nmrUrl;

    }

    public String getIrUrl(){

        return irUrl;
    }

    public String getCnmrUrl(){

        return cnmrUrl;
    }





}
