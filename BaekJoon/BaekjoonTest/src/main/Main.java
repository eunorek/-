package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    
//    static final int MAX_ARRAY_SIZE = 10001;
//    private int[] stack;
//    private int pointer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main m = new Main();
        String answer = m.solution(br);
        bw.write(answer);
        bw.flush();
        br.close();
        bw.close();
    }

    // 백준 채점용: 
    public String solution(BufferedReader br) throws IOException {
        // init
//        this.stack = new int[MAX_ARRAY_SIZE];
//        this.pointer = 0; 

        StringBuilder sb = new StringBuilder("");
        return sb.toString().trim();
    }

    // 테스트용: String 형태로 input을 받아와 BufferedReader에 집어넣어야 함
    public String solution(String val) throws IOException {
        Reader inputString = new StringReader(val);
        BufferedReader br = new BufferedReader(inputString);
        return this.solution(br);
    }
    
    // 주어진 String line을 파싱해 명령 처리
    // 백준에서는 "\s" 제대로 파싱 못함!!
     public String parser(String line) {
        return null;
    }   
    
}
