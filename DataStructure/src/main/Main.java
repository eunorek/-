package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    
    static final int MAX_ARRAY_SIZE = 10001;
    private int[] stack;
    private int pointer;
    
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
        this.stack = new int[MAX_ARRAY_SIZE];
        this.pointer = 0; // [0]: the stack is empty 
        String line;
        String s;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null) {
            s = this.parser(line);
            if(s != null) {
               sb.append(s + "\r\n");               
            }            
        };
        return sb.toString().trim();
    }

    // 테스트용: String 형태로 input을 받아옴
    public String solution(String val) throws IOException {
        Reader inputString = new StringReader(val);
        BufferedReader br = new BufferedReader(inputString);
        return this.solution(br);
    }
    
    // 주어진 String line을 파싱해 명령 처리
    // 백준에서는 "\s" 제대로 파싱 못함!!
     public String parser(String line) {
        String[] parsed = line.split(" ");
        switch(parsed[0]) {
            case "size":
                return String.valueOf(this.size());
            case "empty":
                return String.valueOf(this.empty());
            case "push":
                this.push(Integer.valueOf(parsed[1]));
                return null;
            case "pop":
                return String.valueOf(this.pop());
            case "top":
                return String.valueOf(this.top());
        }
        return null;
    }   
    
    // 스택에 들어있는 정수의 개수 출력
    public int size() {
        return this.pointer;
    }
    
    // 스택이 비어있으면 1, 아니면 0 출력
    public int empty() {
        if(this.size() == 0) {
            return 1;
        }
        return 0;
    }    
    
    // 정수를 스택에 넣는 연산
    public void push(int i) {
        this.pointer++;
        this.stack[this.pointer] = i;        
        return;
    }
    
    // 스택에서 가장 위에 있는 정수를 빼고 그 수를 출력. 스택이 비어있을 경우 -1 출력.
    public int pop() {
        if(this.empty() == 1) {
            return -1;  
        }
        this.pointer--;
        return this.stack[this.pointer + 1];
        
    }
    
    // 스택의 가장 위에 있는 정수 출력. 스택에 들어있는 정수가 없는 경우에는 -1 출력.
    public int top() {
        if(this.empty() == 1) {
            return -1;
        }
        return this.stack[this.pointer];
    }
}
