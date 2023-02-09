package com.natalia.Planets;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Persona alessandro_juliani = new Persona("Alessandro", "Juliani", "666666666G", 1974, "Canada", 'm');
        Persona paul_mcgann = new Persona("Paul", "McGann", "55555555L", 1966, "Canada", 'm');

    alessandro_juliani.render();
    paul_mcgann.render();
}
    }

