import java.util.Random;

import core.ArcadeMachine;
import core.competition.CompetitionParameters;


public class Test {

    public static void main(String[] args) throws Exception {
        for (int i=0;i<100;i++){
            int seed = new Random().nextInt(); // seed for random
            run("controllers.learningmodel.Agentvx","examples/gridphysics/aliens_lvl0.txt",seed);
            run("controllers.learningmodel.Agentvx","examples/gridphysics/aliens_lvl1.txt",seed);
            run("controllers.learningmodel.Agentvx","examples/gridphysics/aliens_lvl2.txt",seed);
            run("controllers.learningmodel.Agent3_5","examples/gridphysics/aliens_lvl3.txt",seed);
            run("controllers.learningmodel.Agent4","examples/gridphysics/aliens_lvl4.txt",seed);
        }
    }
    public static void run(String model,String lvpath,int seed){
        CompetitionParameters.ACTION_TIME = 1000; // set to the time that allows you to do the depth first search
        ArcadeMachine.runOneGame("examples/gridphysics/aliens.txt", lvpath,false, model, null, seed, false);
    }
}
