package Systema;

import Component.Health;
import Manager.Systema;

public class CollideEffect extends Systema {
    public void iterate() {

        boolean collision = false;

        /* For each entity */
        for (var e : this.entityList) {
            /* Check collision of e with itself */
            CollideCheck collideCheck = new CollideCheck();
            collision = collideCheck.result(e, e);
                System.out.println("ECS.Systema check collision=" + collision);
            /* Do something else with HealthComponent */
            if (e.hasComponent(Health.class)) {
                if (collision) {
                    System.out.println("ECS.Systema calls reduceHealth with event=`collision`");
                    e.getComponent(Health.class).change(-7);
                }
            }
            /* Do something else with other components */
        }

    }
}
