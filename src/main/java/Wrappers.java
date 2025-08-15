
public class Wrappers {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorMyRunnableImpl implements Runnable {

        private Runnable runnable;

        public DecoratorMyRunnableImpl(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override
        public void run() {
            System.out.println("DecoratorMyRunnableImpl body");
            runnable.run();
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorRunnableImpl body");
            component.run();
        }
    }
}
