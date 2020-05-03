/*
Nome dos integrantes
*/

package app;

public class App {
    public static void main(String[] args) throws Exception {
        ShotPut shotPut = new ShotPut();
        System.out.println(shotPut.ProjectileRangeCalculator(30, 25, 100));
    }
}