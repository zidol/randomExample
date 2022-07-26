import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Data {
    Integer newPoint;
    Integer oldPoint;
    String name;

    public int getNewPoint() {
        return newPoint;
    }

    public void setNewPoint(int newPoint) {
        this.newPoint = newPoint;
    }

    public int getOldPoint() {
        return oldPoint;
    }

    public void setOldPoint(int oldPoint) {
        this.oldPoint = oldPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class StreamTest {
    public static void main(String[] args) {
        List<Data> dataList = new ArrayList<>();
        Data data = new Data();
        data.setName("a");
        data.setNewPoint(10);
        data.setOldPoint(20);
        dataList.add(data);

        Data data2 = new Data();
        data2.setName("b");
        data2.setNewPoint(20);
        data2.setOldPoint(30);
        dataList.add(data2);

        int newSum = 0;
        int oldSum = 0;
        long beforeTime = System.nanoTime(); //코드 실행 전에 시간 받아오기
        for (Data data1 : dataList) {
            newSum += data1.getNewPoint();
            oldSum += data1.getOldPoint();
        }
        long afterTime = System.nanoTime(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);

        beforeTime = System.nanoTime();
        newSum = dataList.stream().mapToInt(Data::getNewPoint).sum();
        oldSum = dataList.stream().mapToInt(Data::getOldPoint).sum();
        afterTime = System.nanoTime();
        secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);

        //굳이 할 stream 할 필요가 없다...

    }
}
