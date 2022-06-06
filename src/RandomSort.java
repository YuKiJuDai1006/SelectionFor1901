import java.util.Random;

public class RandomSort {

    private Student[] nums;
    private Random random;

    public RandomSort(Student[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public Student[] reset() {
        return nums;
    }

    public Student[] shuffle() {
        if (nums == null) {
            return null;
        }
        int len = nums.length;
        Student[] clone = nums.clone();
        Student[] newArray = new Student[len];
        for (int i = len; i > 0; i--) {
            int index = random.nextInt(i);
            newArray[i - 1] = clone[index];
            Student temp;
            temp = clone[i - 1];
            clone[i - 1] = clone[index];
            clone[index] = temp;
        }
        return newArray;
    }

}
