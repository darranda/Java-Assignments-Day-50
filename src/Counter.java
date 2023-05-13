public class Counter {
    public int number;

    public Counter (int startValue){
        this.number = startValue;
    }

    public Counter() {
        this.number = 0;
    }

    public int value() {
        return number;
    }
    public int getNumber () {
        return number;
    }

    public void increase (int increaseBy) {
        this.number += increaseBy;
    }
    public void decrease (int decreaseBy) {
        this.number -= decreaseBy;
    }

    public void increaseNum(int increaseBy) {
            this.number += increaseBy;
        }

    public void decreaseNum(int decreaseBy) {
            this.number -= decreaseBy;
        }


    @Override
    public String toString() {
        return String.valueOf(getNumber());

    }
}
