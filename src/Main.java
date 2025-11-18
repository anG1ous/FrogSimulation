public class Main {
    public static void main(String[] args){
        FrogSimulation sim  = new FrogSimulation(40,100);
        System.out.println(sim.simulate());
        System.out.println(sim.runSimulations(1000));
    }
}