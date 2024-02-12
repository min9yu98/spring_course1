package hello.hellospring.domain;

public class Hello {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hello() {
    }

    public Hello(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Hello.HelloBuilder builder() {
        return new Hello.HelloBuilder();
    }

    public static class HelloBuilder {
        private String name;
        private int age;

        HelloBuilder() {
        }

        public Hello.HelloBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Hello.HelloBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Hello build() {
            return new Hello(this.name, this.age);
        }

        public String toString() {
            return "Hello.HelloBuilder(name=" + this.name + ", age=" + this.age + ")";
        }
    }
}
