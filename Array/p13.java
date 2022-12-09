import java.util.Scanner;

public class p13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)){
                    
            }
        }
        sc.close();
        

    }
}

/**
 * function isLowerCase(s){
    return s >= 'a';
}
 
function isUpperCase(s){
    return s<'a';
}
 
function equalChar(s1,s2){
    return s1.toLowerCase()===s2.toLowerCase();
}
 
function greatString(s){
 
    let n=s.length;
 
    let stack=[];
 
    for(let i=0;i<n;i++){
 
        if(!stack.length){
            stack.push(s[i]);
            continue;
        }
 
        let currentElement=s[i];
        let prevElement=stack[stack.length-1];
 
        if(equalChar(currentElement,prevElement)){
               let condition1=isLowerCase(currentElement) && isUpperCase(prevElement);
               let condition2=isLowerCase(prevElement) && isUpperCase(currentElement);
 
               if(condition1 || condition2){
                   stack.pop();
               }else{
                 stack.push(s[i]);
               }
        }else{
            stack.push(s[i]);
        }
    }
 
    let output="";
 
    while(stack.length){
        output+=stack[stack.length-1];
        stack.pop();
    }
 
    return output.split('').reverse().join('');
 
 
}
const ans=greatString("s")
console.log(ans);
 
 
 
 
 
 
Question 2 
 
 
 
 
 
function countRev (s)
{
    let n=s.length;
 
    if(n%2){
        return -1;
    }
 
    let stack=[];
 
    let ans=0;
 
    for(let i=0;i<n;i++){
 
        if(s[i]==='('){
            stack.push('(');
            continue;
        }
 
        //closed bracket 
 
        if(!stack.length){
            ans++;
          stack.push('(');
        }else{
            stack.pop();
        }
    }
 
    let open=stack.length;
 
    ans+=Math.floor(open/2);
 
    return ans;
 
}
 
s
console.log(countRev(")()))((()("));
 
 
 
 */