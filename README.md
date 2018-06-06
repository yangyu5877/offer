# offer
###fsdf
    防守打法

    fsdfsdf 
    sdfsdf
    *****
    sdfsdf
    -df
    -sdfdsf
    -sfsd
    1.fsf
>这是一段引用  
**顺丰到付**

```java
sdfdf
fsdfsdf
public static int JumpFloor(int target) {
        //需要初始化次数，弯弯需要绕明白
        int kinds = 0;
        if(target == 1){
            kinds = 1;
        }
        else if(target == 2){
            kinds = 2;
        }
        else{   
            kinds += JumpFloor(target-1)+JumpFloor(target-2); 
        }
        return kinds;
    }
```