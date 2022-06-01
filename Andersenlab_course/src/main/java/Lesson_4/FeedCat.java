package Lesson_4;

public class FeedCat {
        public void main(String[] args) {
            Cat[] cat = new Cat[3];
            cat[0] = new Cat("Barsik", 120);
            cat[1] = new Cat("Pushok", 150);
            cat[2] = new Cat("Dymok", 20);
            Plate plate = new Plate(100);
            System.out.println("У Вас есть три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + "показатель сытости у которых: " + cat[0].getSatiety() + ", " + cat[1].getSatiety() + " и " + cat[2].getSatiety());

            for (Cat i: cat) {
                if(i.getSatiety() == 0) { // cat is hungry
                    if(!plate.checkFood(i.getAppetite())) { // if there is no food in the plate for feeding cat, food will be added
                        System.out.println("Коту не хватает еды");
                    }

                    i.eat(plate); // cat eats
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite());
                }
                i.setSatiety(i.getSatiety() - 1); // reducing the satiety of the cat
            }
        }
    public class Plate {
        private int food;
        public Plate(int food) {
            this.food = food;
        }
        public void decreaseFood(int n) {
            food -= n;
        }

        public void increaseFood() {
            this.food += 100;
            System.out.println("В миску добавили 100 грамм корма");
        }

        boolean checkFood(int n) {
            return (food - n) >= 0;
        }
    }
    public class Cat {
        private String name;
        private int appetite;
        private int satiety;
        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = 0; //cat is hungry
        }

        String getName() {
            return name;
        }

        int getAppetite() {
            return appetite;
        }

        int getSatiety() {
            return satiety;
        }

        public void setSatiety(int satiety) {
            this.satiety = satiety;
        }

        public void eat(Plate p) {
            p.decreaseFood(appetite);
        }
    }

}


