package task_02.quackbehaviors;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Тишина >>");
    }
}