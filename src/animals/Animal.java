package animals;

    public abstract class Animal {
        private final int id;
        private final String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Animal(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public abstract void say(String saySomething);
        public abstract void eat(String nameOfFood);
}
