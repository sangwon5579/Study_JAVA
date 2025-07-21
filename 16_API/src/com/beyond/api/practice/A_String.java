package com.beyond.api.practice;

import java.util.Arrays;
import java.util.StringTokenizer;

public class A_String {
    /*
    1. String 클래스
        - 불변의 클래스이다(문자열 생성하면 변경 불가)
        - 변경이 작고 읽기가 많은 경우에 사용하는 것이 좋다

    2. StringBuilder & StringBuffer 클래스
        - 가변의 클래스이다 ( 문자열 생성하면 변경 가능)
        - 16개의 문자를 저장할 수 있는 버퍼가 미리 생성되고 문자가 저장됨에 따라서 자동으로 증가한다.
        - StringBuilder와 StringBuffer의 차이점은 동기화에 있다
            - StringBuilder는 단일스레드 환경 사용 권장
            - StringBuffer는 멀티스레드 환경 사용 권장

   3. SpringTokenizer
        - 생성자로 전달받은 문자열을 구분자를 이용해서 분리한다
        - 분리된 최소 단위를 토큰이라고 부른다
        - StringTokenizer 클래스에서 제공하는 메소드
            - countTokens() 메소드는 남아있는 토큰의 수를 리턴한다
            - hashMoreTokens() 메소드는 남은 토큰이 있는지 확인한다. (true, false 리턴한다)
            - nextToken() 메소드는 토큰을 하나 꺼내온다
     */
    //String class에서 제공하는 메소드 사용
    public void method1(){
        String str = "Hello World";

        // 1. charAt(index) 메소드는 전달받은 index 위치의 문자만 추출해서 리턴한다.
        char ch = str.charAt(4);
        System.out.println(ch); //o
        System.out.println();

        // 2. concat(str) 메소드는 전달받은 문자열과 원본 문자열을 하나로 합친 새로운 문자열을 리턴한다
        String concat = str.concat("!!!!");
        System.out.println(concat); //Hello World!!!!
        System.out.println(System.identityHashCode(concat));    //793589513
        System.out.println(str);    //Hello World
        System.out.println(System.identityHashCode(str));       //1313922862

        // 3. substring(beginIndex) 메소드는 매개값으로 전달된 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴
        //    substring(beginIndex, endIndex) 메소드는 매개값의 beginIndex 위치에서부터 endIndex -1 까지의 새로운 문자열을 생성해서 리턴
        String substring1 = str.substring(6);
        System.out.println(substring1); //World
        System.out.println(str);        //Hello World

        String substring2 = str.substring(2, 6);
        System.out.println(substring2); //llo
        System.out.println(str);        //Hello World
        System.out.println();

        // 4. indexOf() 메소드는 전달받은 문자열의 시작 인덱스를 리턴한다
        //    indexOf(ch) 메소드는 전달받는 문자의 시작 인덱스를 리턴한다
        int index = str.indexOf("World");   //6 (6번 인덱스부터 시작하니깐)
        System.out.println(index);
        int index2 = str.indexOf('o');
        System.out.println(index2);         //4 (o가 두개 나옴. 그중 먼저 나오는거)
        int index3 = str.indexOf("World", 7);   //주어진 문자열이 포함되어 있지 않으면 -1 리턴
        System.out.println(index3);         //-1 (7번 인덱스부터 World를 찾는건데 없으므로 -1 리턴)
        int index4 = str.indexOf('o', 6);
        System.out.println(index4);         //7 (6번부터 찾으니깐)
        int index5 = str.indexOf('o', 8);
        System.out.println(index5);         //-1 (주어진 문자가 포함되어 있지 않으면 -1 리턴)
        System.out.println();

        // 5. replace(oldChar, newChar) 메소드는 문자열에서 oldChar가 newChar로 변경된 새로운 문자열을 생성해서 리턴한다
        String replace = str.replace('l','c');
        System.out.println(replace);    //Hecco Worcd
        String replace2 = str.replace("World","Java");
        System.out.println(replace2);   //Hello Java

        // 6. trim() 메소드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성해서 리턴
        str = "   Java  ";
        System.out.println(str.trim()); //Java
        System.out.println(str);        //   Java

        // 7. split(regex) 메소드는 입력받은 구분자로 문자열을 분리하고 배열에 담아서 리턴한다
        str = "Java,MariaDB,Spring,HTML5,CSS3,Vue.js,Docker,Kubernetes";
        String[] strings = str.split(",");
        System.out.println(strings.length);             //8
        System.out.println(Arrays.toString(strings));   //[Java, MariaDB, Spring, HTML5, CSS3, Vue.js, Docker, Kubernetes]
        System.out.println(str);                        //Java,MariaDB,Spring,HTML5,CSS3,Vue.js,Docker,Kubernetes

        // 8. ## toCharArray() 메소드는 문자열의 문자들을 배열에 담아서 리턴한다
        char[] charArray = str.toCharArray();
        System.out.println(charArray.length);           //55
        System.out.println(Arrays.toString(charArray)); //[J, a, v, a, ,, M, a, r, i, a, D, B, ,, S, p, r, i, n, g, ,, H, T, M, L, 5, ,, C, S, S, 3, ,, V, u, e, ., j, s, ,, D, o, c, k, e, r, ,, K, u, b, e, r, n, e, t, e, s]

        // 9. String.valueOf( ... )  정적 메소드는 매개값으로 전달받은 값들을 문자열로 변경해서 리턴한다
        String value = String.valueOf(1234);
        System.out.println(value);                      //1234
        String value2 = String.valueOf(3.141592F);
        System.out.println(value2);                     //3.141592
        String value3 = String.valueOf('A');
        System.out.println(value3);                     //A
        System.out.println(String.valueOf(charArray, 6, 7));    //ariaDB,
    }

    public void method2() {
        // 1. StringBuilder 객체 생성
        //기본 생성자를통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());    //0
        System.out.println(sb.capacity());  //16    내부 버퍼

        //생성자에 정수값을 전달해주면 해당 크기만큼의 내부 버퍼가 생성된다.
        StringBuilder sb2 = new StringBuilder(30);
        System.out.println(sb2.length());    //0
        System.out.println(sb2.capacity());  //30

        //생성자의 문자열을 전달해 주면 문자열 크기 + 16 만큼의 내부 버퍼가 생성된다
        StringBuilder sb3 = new StringBuilder("안녕하세요");
        System.out.println(sb3.length());    //5
        System.out.println(sb3.capacity());  //21

        // 2. StringBuilder 클래스에서 제공하는 메소드 사용
        // 1) append() 메소드는 기존 문자열 뒤에 전달한 값을 추가한다
        sb3.append("저는 홍길동입니다");
        System.out.println(sb3);            //안녕하세요저는 홍길동입니다
        System.out.println(sb3.length());   //14
        System.out.println(sb3.capacity()); //21

        // 2) insert(offset, str) 메소드는 문자열 offset 위치부터 전달받은 문자열을 추가한다.
        sb3.insert(6, "ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ");

        System.out.println(sb3);                //안녕하세요저ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ는 홍길동입니다
        System.out.println(sb3.length());       //26
        System.out.println(sb3.capacity());     //44

        // 3) delete(start, end) 메소드는 start 에서 end-1까지의 인덱스에 해당하는 문자열을 삭제한다.
        sb3.delete(6, 18);
        System.out.println(sb3);            //안녕하세요저는 홍길동입니다
        System.out.println(sb3.length());   //14
        System.out.println(sb3.capacity()); //44 (버퍼의 크기는 다시 줄어들지 않는다)

        // 4) reverse() 메소드는 문자열의 순서를 역으로 바꾼다
        sb3.reverse();
        System.out.println(sb3);            //다니입동길홍 는저요세하녕안
        System.out.println(sb3.length());   //14
        System.out.println(sb3.capacity()); //44

        // 3.  메소드 체이닝
        sb = new StringBuilder("Java Programming");

        //메소드 수행 결과 해당 객체의 참조를 반환하기 때문에 아래와 같이 메소드를 이어서 사용가능
        //이렇게 메소드를 이어서 사용할 수 있는 것을 메소드 체이닝이라고 한다.
        sb.append("API").delete(5, 16).reverse();
        System.out.println(sb);     //IPA avaJ
    }

    public void method3(){
        String str = "Java,MariaDB,Spring,HTML5,CSS3,Vue.js,Docker,Kubernetes";
        StringTokenizer st = new StringTokenizer(str, ",");
        System.out.println(st.countTokens());       //8
        System.out.println();

        // for 문을 통한 출력 방법
        int length  = st.countTokens();

        /*
        for(int i = 0; i < length; i++){
            System.out.println(st.nextToken());
            System.out.println(st.countTokens());
        }
        System.out.println();
*/
        //while문을 통한 출력 방법
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
