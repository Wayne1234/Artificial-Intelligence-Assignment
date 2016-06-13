import core.ArcadeMachine;
import core.competition.CompetitionParameters;

import java.util.Random;


public class Test2 {

    public static void main(String[] args) throws Exception {
        for (int i=0;i<100;i++){
            run("controllers.learningmodel.Agent3_5","examples/gridphysics/aliens_lvl3.txt");
        }
    }
    public static void run(String model,String lvpath){
        int seed = new Random().nextInt(); // seed for random
        CompetitionParameters.ACTION_TIME = 1000; // set to the time that allows you to do the depth first search
        ArcadeMachine.runOneGame("examples/gridphysics/aliens.txt", lvpath,false, model, null, seed, false);
    }
}
