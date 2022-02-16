# Java 零基础笔记



## 扫描器Scanner

```java
import java.util.Scanner;//引入

public class Input {
    public static void main(String[] args) {
		//定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入名字：");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入收入:");
        double sal =myScanner.nextDouble();

        System.out.println("人的信息如下：");
        System.out.println("名字："+name+"\t年龄："+ age+"\t薪水："+sal);

    }
}
```



## 流程控制



### if...else...分支控制 

```java
if(条件表达式){
​	执行代码块；（可以多条语句）
}
```

```java
if(条件表达式){
	执行代码块；（可以多条语句）
}else{
	执行代码块；（可以多条语句）
}
```

```java
if(条件表达式){
	执行代码块；（可以多条语句）
}else if{
	执行代码块；（可以多条语句）
}else{//可以没有else
    执行代码块；
}
```



#### 实例

```java
import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        // 定义一个Scanner对象
        Scanner inputAge = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = inputAge.nextInt();

        if (age > 18) {
            System.out.println("您的年龄大于18岁，要对自己的行为负责，送入监狱！");
        } else {
            System.out.println("你的年龄不大，这次就放过你了");
        }
        //以下代码在if...else...外面，所以会执行
        System.out.printLn("这里还会执行！")
    }
}

```



```java
public class If03 {
    public static void main(String[] args) {
        double d1 = 33.5;
        double d2 = 2.6;

        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两个数的为：" + (d1 + d2));
        }

        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;

        // sum能被3和5整除
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("可以");
        } else {
            System.out.println("不行");
        }
    }
}

```

```java
public class If05 {
    public static void main(String[] args) {
        // 成绩大于8.0进入决赛，并分男女组 分别提示
        Scanner inputScore = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩：");
        double Score = inputScore.nextDouble();
        if (Score > 8.0) {
            System.out.println("请输入性别：");
            char gender = inputScore.next().charAt(0);
            System.out.println("恭喜您进入" + gender + "子组决赛！");
        } else {
            System.out.println("sorry,您被淘汰了");
        }
    }
}
```



### switch 分支结构

```java
switch(){
        case '1': //1
        //语句
        break;//如果没有break，会直接运行case2下的语句,
 		case '2'://2
        //语句
        break;
        default:
        //语句
        break;
}
```

1. 表达式数据类型应和case数据类型一致，或者可以自动转换的类型。
2. 表达式的返回值必须是下面的几种（byte,short,int,char,enom[枚举],String）
3. case字句中的值必须是常量
4. default可省略
5. 如果没有break，会直接运行case2下的语句,

#### 实例

```java
import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {
        // 输入字符a.bc... 对应输出星期一二。。。
        Scanner inputByte = new Scanner(System.in);
        System.out.println("请输入字符：");
        char txt = inputByte.next().charAt(0);
        switch (txt) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的信息有误，请重新输入！");
        }
        // 跳出switch继续执行
        System.out.println("我会显示出来！");
    }
}
```



```java
//switch穿透用法
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // 345春季 678夏季 9 10 11 秋季 12 1 2 冬季
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = inputMonth.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("春季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("春季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}

```

### switch / if else选择

1. 如果判断的数值不多，而且符合byte short int char enum String这6中类型  建议使用switch
2. 对于区间判断，对结果为boolean类型判断，使用if else更好



### for循环控制

```java
for(循环变量的初始化;循环条件;循环变量迭代){
	//循环操作（可以多条循环语句）
}
```



#### 实例

~~~java
// 打印10句 你好bug制造机
// 循环变量的初始化;循环条件;循环变量迭代
for (int i = 1;i<=10 ;i++) {
	System.out.println("你好bug制造机!");
}
~~~

```java
//i的作用域 可以在for循环之外使用i
int i = 1;
for (;i<=10 ;) {
	System.out.println("你好bug制造机!");
    i++;
}
```

```java
int count = 3;
for (int i = 0, j = 0; i < count; i++, j += 2) {
    System.out.println("i="+i+" "+"j="+j);
}
//i=0 j=0
//i=1 j=2
//i=2 j=4
```

```java
//打印1-100之间所有9的倍数的整数，统计个个数及总和
//化繁为简   先死后活
int count = 0;
int sum = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 9 == 0) {
        System.out.println(i);
        count++;
        sum += i;
    }
}
System.out.println("有" + count + "个9的倍数");
System.out.println("总和是"+sum);

```

```java
//将需求写成变量
int count = 0;
int sum = 0;
int start = 1;
int end = 100;
int t= 9;
for (int i = start; i <= end; i++) {
    if (i % t == 0) {
        System.out.println(i);
        count++;
        sum += i;
    }
}
System.out.println("有" + count + "个9的倍数");
System.out.println("总和是"+sum);
```

```java
//0+5=5
//1+4=5
//2+3=5
//3+2=5
//4+1=5
//5+0=5
for (int i = 0, j = 5; i <= 5; i++, j--) {
    System.out.println(i + "+" + j + "=" + (i + j));
}

//将需求写成变量
int n = 100;
for (int i = 0, j = n; i <= n; i++, j--) {
    System.out.println(i + "+" + j + "=" + (i + j));

}
```



### while循环

```java
while(循环条件){
    //循环体(语句)；
    //循环变量迭代
}
```

1. while循环条件是一个布尔值的表达式（true/false）
2. while循环是先判断后执行

#### 实例

```java
int i = 0;
while(i<10){
    System.out.println("你好，BUG机~！");
    i++;//需要变量迭代，不然是死循环
}
```

```java
//打印1-100所有能被3整除的数
int i = 1;
while (i <= 100) {
    if (i % 3 == 0) {
        System.out.println(i);
    }
    i++;
}
```

```java
//打印40-200之间所有的偶数
int i = 40;
while(i<=100){
    if(i%2==0){
        System.out.println(i);
    }
    i++;
}
```



### do...while循环

```java
do{
    //循环条件
    //循环变量迭代
}while(循环条件);
```

1. 先执行后判断

#### 实例

```java
// 输出10句 你好bug机
int i = 1;
do {
    System.out.println("你好bug机");
    i++;
} while (i <= 10);
```

```java
// 如果李三不还钱，老韩就一直使出五连鞭，直到还钱为止。
// 1.一直问换不换钱
Scanner myScanner = new Scanner(System.in);
char answer = ' ';
do {
    System.out.println("老韩使出五连鞭！！！！！");
    System.out.println("还不还钱？y/n");
    answer = myScanner.next().charAt(0);
    System.out.println("他的回答是：" + answer);
} while (answer !='y');
```

```java
Scanner inputYn = new Scanner(System.in);
char yn = ' ';
do {
    System.out.println("邪魅一笑！！！");
    System.out.println("这bug能不能改？y/n");
    yn = inputYn.next().charAt(0);
    if (yn == 'y') {
        System.out.println("他说能改了！");
    } else {
        System.out.println("他还是不改！！！"+yn);
    }
} while (yn == 'n');
```

```java
Scanner inputYn = new Scanner(System.in);
String yn = " ";
do {
    System.out.println("邪魅一笑！！！");
    System.out.println("这bug能不能改？y/n");
    yn = inputYn.next();
    if (yn.equals("y")) {//判断字符串相等不能用==，要用equals
        System.out.println("他说能改了！");
    } else {
        System.out.println("他还是不改！！！"+yn);
    }
} while (yn.equals("n"));//判断字符串相等不能用==，要用equals
```

```java
// 99乘法表
for (int i = 1; i <= 9; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + i * j + "\t");
    }
    System.out.println();
}

1*1=1
1*2=2   2*2=4
1*3=3   2*3=6   3*3=9
1*4=4   2*4=8   3*4=12  4*4=16
1*5=5   2*5=10  3*5=15  4*5=20  5*5=25
1*6=6   2*6=12  3*6=18  4*6=24  5*6=30  6*6=36
1*7=7   2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49
1*8=8   2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64
1*9=9   2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81 
```

```java
// 打印空心金字塔
// 先打印一个矩形
for (int i = 1; i <= 5; i++) {// i表示层数
    for (int k = 1; k <= 5 - i; k++) {
        System.out.print(" ");
    }

    // 控制打印每层的*的个数
    for (int j = 1; j <= i * 2 - 1; j++) {
        if (j == 1 || j == i * 2 - 1 || i == 5) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

    }
    // 每打完一层换行
    System.out.println();
}
```

```java
int total = 11;
for (int i = 1; i <= total; i++) {// i表示层数
    for (int k = 1; k <= total - i; k++) {
        System.out.print(" ");
    }

    // 控制打印每层的*的个数
    for (int j = 1; j <= i * 2 - 1; j++) {
        if (j == 1 || j == i * 2 - 1 || i == total) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

    }
    // 每打完一层换行
    System.out.println();
}
}
```



### break语句

```java
...
break;
...
```

1. 跳出循环

#### 实例

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        break;
    }
    System.out.println("i="+i);
}
```



### continue语句

```java
...
continue;
...
```

1. continue用于跳过本次循环，执行下一次循环
2. 循环体内continue下的语句不执行，直接跳过单次循环

#### 实例

```java
int i = 1;
while (i <= 4) {
    i++;
    if (i == 2) {
        continue;
    }
    System.out.println(i);
}
// 3 4 5
```

```java
label1:for (int j = 0; j < 4; j++) {
    label2: for (int i = 0; i < 10; i++) {
        if (i == 2) {
            continue label2;//会跳到lable2继续循环
        }
    }
}
```



### return语句

```java
...
return;
...
```

1. 跳出所在的方法！！！
2. 如果写在main方法中 表示推出程序



#### 实例

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        System.out.println("bug机");
        return;
        // break;
        // continue;
    }
    System.out.println("lallal");
}
System.out.println("go on");
```



## 数组

### 数组

```java
double[] hens = {3,5,1,3.4,2,50};
double hens[] = {3,5,1,3.4,2,50};
// 以上一样 
// hens[0]访问数组中的元素
// hens[0] 值 = 3 数组下标从0开始
```

1. 数组如果没有赋值，会默认赋值 

   int short byte long  == 0

   float double == 0.0   

   char == \u0000

   boolean ==false

   String == null

2. 数组使用步骤
   1. 声明数组
   2. 赋值
   3. 使用数组
   
3. 数组下标必须在指定范围内使用 

4. 数组属于引用类型，数组型数据是对象（object）

#### 动态初始化

```java 
int a[] = new int[5];//实例2

double a[]; // 实例3
a = new double[5];//先声明 再分配空间

```

#### 静态初始化

```java
int a[] = { 1, 2, 3, 4, 5};
```



##### 实例

```java
double[] hens = { 3, 5, 1, 3.4, 2, 50};
System.out.println("数组长度：" + hens.length);
// hens.length 数组的长度
// 遍历数组的所有元素的和
// 第一个元素 hens[0] 第一个元素从0开始
double sum = 0;
for (int i = 0; i < hens.length; i++) {
    sum += hens[i];
}
System.out.println("总体重" + sum + "avg" + sum / hens.length);
```

```java
// 数组动态初始化1
// 新建一个数组  输入数据  然后输出
double score[] = new double[5];
Scanner myScanner = new Scanner(System.in);
for (int i = 0; i < score.length; i++) {
    System.out.println("请输入第"+(i+1)+"个元素的值");
    score[i] = myScanner.nextDouble();
}
for (int i = 0; i < score.length; i++) {
    System.out.println(score[i]);
}
```

```java
// 求数组的最大值和下标
// int a[] = {4,-1,9,10,23}
int a[] = { 40, -1, -23, 9, 10 };
int max = a[0];// 假设第一个值是最大值
int n = 0;

for (int i = 0; i < a.length; i++) {
    if (a[i] > max) {
        max = a[i];// 如果获取的元素大于max 就把该元素设置成最大值
        n = i;// 并设置下标
    }
}
System.out.println(max + "---" + n);
```



### 数组赋值机制

```java
// 基础数据类型赋值
// 赋值方式为值拷贝,n2变化不会影响n1
int n1 = 10;
int n2 = n1;

n2 = 80;
System.out.println(n1);//10
System.out.println(n2);//80

// 数组默认是引用传递，赋值是地址，赋值方式是引用赋值
// 是一个地址，arr2会影响到arr1,arr2改变，arr1也会改变
int arr1[] = { 1, 2, 3 };
int arr2[] =arr1;
arr2[2] = 10;
System.out.println("arr1的元素是：");
for (int i = 0; i < arr1.length; i++) {
    System.out.println(arr1[i]);// 1.2.10
}
```

