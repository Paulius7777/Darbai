package mooc.logic;

import mooc.ui.UserInterface;

/**
 * Created by Paulius on 2017.08.24.
 */
public class ApplicationLogic {

    private UserInterface ui1;

    public ApplicationLogic(UserInterface ui){
        this.ui1 = ui;
    }

    public void execute(int howManyTimes){
        for (int i = 0; i< howManyTimes; i++){
            System.out.println("The application logic works");
            ui1.update();
        }

    }
}
