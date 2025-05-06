
package pkginterface;


public class Training extends BePracticals implements Jpracticals,TPracticals{
    @Override
    public void javaTraining()
    {
        System.out.println("Training students on java");
        
    }
    public void testingTraining()
    {
        System.out.println("Training students on manual & automation training");
    }
    public static void main(String[] args){
        Training t=new Training();
        t.javaTraining();
        t.testingTraining();
        t.training();
    }
}
