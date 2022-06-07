import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Select {
    //read students' information//
    public static Student[] readLength (String st){
        In in = new In(st);
        int length = in.readInt();
        Student[] res = new Student[length];
        for (int i = 0; i < length; i++){
            res[i] = new Student(in.readString(),in.readInt(),in.readInt(),
                    in.readInt());
        }
        return res;
    }


    public static void main(String[] args) throws FileNotFoundException {
        In in = new In("choice.txt");
        int length = in.readInt();
        Student[] students = readLength("choice.txt");

        // Randomly sort the array of students//
        RandomSort randomSort1 = new RandomSort(students);
        students = randomSort1.shuffle();

        // Output the result into "Test1.txt"//
        PrintStream ps1 = new PrintStream("Test1.txt");
        System.setOut(ps1);
        for (int i = 0; i < length; i ++) {
            System.out.println(students[i].name + " " + students[i].allocated);
        }
        int maxNum = 4;
        int place1Num = 0;
        int place2Num = 0;
        int place3Num = 0;
        int place4Num = 0;
        int place5Num = 0;
        int place6Num = 0;

        //first allocation//
        for (int i = 0; i < length; i++) {
            if (students[i].allocated == null) {
                if (students[i].firstChoice == 1 && place1Num < maxNum) {
                    place1Num++;
                    students[i].allocated = "浙江碧扬";
                    continue;
                }
                if (students[i].firstChoice == 2 && place2Num < maxNum) {
                    place2Num++;
                    students[i].allocated = "环科院土壤所";
                    continue;
                }
                if (students[i].firstChoice == 3 && place3Num < maxNum) {
                    place3Num++;
                    students[i].allocated = "环科院规划所";
                    continue;
                }
                if (students[i].firstChoice == 4 && place4Num < maxNum) {
                    place4Num++;
                    students[i].allocated = "监测中心";
                    continue;
                }
                if (students[i].firstChoice == 5 && place5Num < maxNum) {
                    place5Num++;
                    students[i].allocated = "绍兴深水";
                    continue;
                }
                if (students[i].firstChoice == 6 && place6Num < maxNum) {
                    place6Num++;
                    students[i].allocated = "桃花源";
                    continue;
                }
            }
        }

        RandomSort randomSort2 = new RandomSort(students);
        students = randomSort2.shuffle();

        PrintStream ps2 = new PrintStream("Test2.txt");
        System.setOut(ps2);
        for (int i = 0; i < length; i ++) {
            System.out.println(students[i].name + " " + students[i].allocated);
        }


        //second allocation//
        for (int i = 0; i < length; i++) {
            if (students[i].allocated == null) {
                if (students[i].secondChoice == 1 && place1Num < maxNum) {
                    place1Num++;
                    students[i].allocated = "浙江碧扬";
                    continue;
                }
                if (students[i].secondChoice == 2 && place2Num < maxNum) {
                    place2Num++;
                    students[i].allocated = "环科院土壤所";
                    continue;
                }
                if (students[i].secondChoice == 3 && place3Num < maxNum) {
                    place3Num++;
                    students[i].allocated = "环科院规划所";
                    continue;
                }
                if (students[i].secondChoice == 4 && place4Num < maxNum) {
                    place4Num++;
                    students[i].allocated = "监测中心";
                    continue;
                }
                if (students[i].secondChoice == 5 && place5Num < maxNum) {
                    place5Num++;
                    students[i].allocated = "绍兴深水";
                    continue;
                }
                if (students[i].secondChoice == 6 && place6Num < maxNum) {
                    place6Num++;
                    students[i].allocated = "桃花源";
                    continue;
                }
            }
        }

        RandomSort randomSort3 = new RandomSort(students);
        students = randomSort3.shuffle();

        PrintStream ps3 = new PrintStream("Test3.txt");
        System.setOut(ps3);
        for (int i = 0; i < length; i ++) {
            System.out.println(students[i].name + " " + students[i].allocated);
        }


        //third allocation//
        for (int i = 0; i < length; i++) {
            if (students[i].allocated == null) {
                if (students[i].thirdChoice == 1 && place1Num < maxNum) {
                    place1Num++;
                    students[i].allocated = "浙江碧扬";
                    continue;
                }
                if (students[i].thirdChoice == 2 && place2Num < maxNum) {
                    place2Num++;
                    students[i].allocated = "环科院土壤所";
                    continue;
                }
                if (students[i].thirdChoice == 3 && place3Num < maxNum) {
                    place3Num++;
                    students[i].allocated = "环科院规划所";
                    continue;
                }
                if (students[i].thirdChoice == 4 && place4Num < maxNum) {
                    place4Num++;
                    students[i].allocated = "监测中心";
                    continue;
                }
                if (students[i].thirdChoice == 5 && place5Num < maxNum) {
                    place5Num++;
                    students[i].allocated = "绍兴深水";
                    continue;
                }
                if (students[i].thirdChoice == 6 && place6Num < maxNum) {
                    place6Num++;
                    students[i].allocated = "桃花源";
                    continue;
                }
            }
        }

        PrintStream ps = new PrintStream("result.txt");
        System.setOut(ps);
        for (int i = 0; i < length; i ++) {
            System.out.println(students[i].name + " " + students[i].allocated);
        }
        System.out.println();
        System.out.println("浙江碧扬" + "： " + place1Num);
        System.out.println("环科院土壤所" + "： " + place2Num);
        System.out.println("浙江规划所" + "： " + place3Num);
        System.out.println("监测中心" + "： " + place4Num);
        System.out.println("绍兴深水" + "： " + place5Num);
        System.out.println("桃花源" + "： " + place6Num);
    }
}
