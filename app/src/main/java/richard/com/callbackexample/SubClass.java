package richard.com.callbackexample;

/**
 * Created by Craig_B on 13/05/2016.
 */
public class SubClass {

    interface MyCallbackClass{
        void callbackReturn();
        void callbackReturnAgain();
    }

    MyCallbackClass myCallbackClass;

    void registerCallback(MyCallbackClass callbackClass){
        myCallbackClass = callbackClass;
    }

    void doSomething(){
        //do something here

        //call callback method
        myCallbackClass.callbackReturn();
    }

    void doSomethingElse(){
        //do something here

        //call callback method
        myCallbackClass.callbackReturnAgain();
    }


}
