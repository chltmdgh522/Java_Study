package test1;

public class ScanfStudent {

    public static void main(String[] args) {
        StudentInformation choi = new StudentInformation("최승호", 01);
        choi.setKorea("국어", 100);
        choi.setMath("수학", 100);
        choi.setEnglish("영어", 100);

        StudentInformation kim = new StudentInformation("김승호", 02);
        kim.setKorea("국어", 100);
        kim.setMath("수학", 100);
        kim.setEnglish("영어", 100);

        StudentInformation park = new StudentInformation("박승호", 03);
        park.setKorea("국어", 100);
        park.setMath("수학", 100);
        park.setEnglish("영어", 100);


        choi.show();
        kim.show();
        park.show();

    }

}
