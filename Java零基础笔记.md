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

### 数组定义

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

// 数组默认是引用传递（地址传递），赋值是地址，赋值方式是引用赋值
// 是一个地址，arr2会影响到arr1,arr2改变，arr1也会改变
int arr1[] = { 1, 2, 3 };
int arr2[] =arr1;
arr2[2] = 10;
System.out.println("arr1的元素是：");
for (int i = 0; i < arr1.length; i++) {
    System.out.println(arr1[i]);// 1.2.10
}
```

### 数组拷贝

```java
// 将arr1拷贝到arr2
int arr1[] = { 10, 20, 30 };

// 创建一个新数组arr2 开辟一个新的数据空间
// 长度为arr1.length

int arr2[] = new int[arr1.length];
for (int i = 0; i < arr2.length; i++) {
    arr2[i] = arr1[i];
}

arr2[0] = 100;

for (int i = 0; i < arr1.length; i++) {
    System.out.println(arr1[i]);
}//arr1

for (int i = 0; i < arr2.length; i++) {
    System.out.println(arr2[i]);
}//arr2
// 改变arr2后 并未影响到arr1
```

1. 数组拷贝需要新开辟一个空数组（arr2），长度与原先数组(arr1)一样。
2. 然后将原数组遍历写入新数组(arr2)中
3. arr2改变元素，不会影响arr1

### 数组反转（倒序排列）

```java
// 数组反转
int arr[] = { 11, 22, 33, 44, 55, 66 };
//建一个空数组
int arrR[] = new int[arr.length];
// 新数组按原数组倒叙写入新数组
for (int i = 0; i < arrR.length; i++) {
    arrR[arrR.length - 1 - i] = arr[i];
}

for (int i = 0; i < arrR.length; i++) {
    System.out.println(arrR[i]);
}//  66 55 44 33 22 11
```



### 数组添加

```java
// 数组添加元素
int arr[] = { 1, 2, 3 };
// arr[3]=4; 报错 下标越界
int arrNew[] = new int[arr.length + 1];
// 遍历arr 拷贝到 arrNew
for (int i = 0; i < arr.length; i++) {
    arrNew[i] = arr[i];
}
//添加新元素
arrNew[arrNew.length - 1] = 4;

arr = arrNew;

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

```

```java
// 接收用户输入的值，动态添加数组

Scanner myScanner = new Scanner(System.in);

// 数组添加元素
int arr[] = { 1, 2, 3 };

do{
    // arr[3]=4; 报错 下标越界
    int arrNew[] = new int[arr.length + 1];
    // 遍历arr 拷贝到 arrNew
    for (int i = 0; i < arr.length; i++) {
        arrNew[i] = arr[i];
    }
    System.out.println("请输入要添加的元素：");
    int addNum = myScanner.nextInt();

    arrNew[arrNew.length - 1] = addNum;

    arr = arrNew;

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

    System.out.println("是否继续添加？ y/n");
    char isAdd = myScanner.next().charAt(0);
    if (isAdd != 'y') {
        break;
    }

}while(true);
```

### 数组缩减

```java
// 缩减数组元素 剩余一个元素时提示不能再缩减
Scanner myScanner = new Scanner(System.in);
int arr[] = { 1, 2, 3, 4, 5 };
do {
    System.out.println("是否缩减数组元素？ y/n");
    char isReduce = myScanner.next().charAt(0);
    if (isReduce == 'y' && (arr.length - 2) >= 0) {

        int arrNew[] = new int[arr.length - 1];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = arr[i];
        }
        arr = arrNew;
        System.out.println("arr剩余元素个数：" + arr.length);
    } else {
        if (arr.length == 1) {
            System.out.println("只剩余一个元素不能再缩减了");
        }
        break;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
} while (true);
```



### 冒泡排序

```java
// [24,69,80,57,13]
// 第一轮把最大数放在最后
// 24 69 80 57 13
// 24 69 80 57 13
// 24 69 57 80 13
// 24 69 57 13 80//最大数在最后
// 第二轮把第二大的数放在倒数第二
// 24 69 57 13 80
// 24 57 69 13 80
// 24 57 13 69 80
// 第三轮把第三大的数放在倒数第三
// 24 57 13 69 80
// 24 13 57 69 80
// 第4轮把第4大的数放在倒数第4
// 13 24 57 69 80

// 冒泡排序

int[] arr = { 69, 24, 80, 57, 13 };
// 循环出每轮更换的次数
int len = arr.length-1;
for (int i = 0; i < len; i++) {//需要4轮   数组长度-1
    // 循环把大的值放在后面
    for (int j = 0; j < len-i; j++) {//每轮调换的次数递减 len-1
        int temp;
        if (arr[j] > arr[j + 1]) {
            temp = arr[j];//24
            arr[j] = arr[j+1];//69
            arr[j+1] = temp;//24
        }
    }
}

for (int j = 0; j < arr.length; j++) {
    System.out.println(arr[j]);
}


int[] arr = { 69, 24, 80, 57, 13 };
// 循环出每轮更换的次数
int len = arr.length-1;
for (int i = 0; i < len; i++) {//需要4轮   数组长度-1
    // 循环把大的值放在后面
    for (int j = len; j > i; j--) {//每轮调换的次数递减
        int temp;
        if (arr[len - j] > arr[len - j + 1]) {
            temp = arr[len - j + 1];//24
            arr[len - j + 1] = arr[len - j];//69
            arr[len - j] = temp;//24
        }
    }
}

for (int j = 0; j < arr.length; j++) {
    System.out.println(arr[j]);
}
```

### 顺序查找

```java
// 查找数组中是否有你要的元素

// 定义一个字符串数组
String[] names = { "一", "二", "三", "四" };
Scanner myScanner = new Scanner(System.in);
System.out.println("请输入如名字：");
String inputName = myScanner.next();
int index = -1;
for (int i = 0; i < names.length; i++) {
    if (inputName.equals(names[i])) {
        System.out.println("数组中有您查找的元素，下标是：" + i);
        index = i;
        break;
    }
}

if (index == -1) {// 如果值没有改变 说明没有进入到for循环，就没有找到一样的值
    System.out.println("没有您查找的元素");
}
```

### 二维数组

``` java
// 二维数组
int[][] arr = {
    { 0, 0, 0, 0, 0, 0 },
    { 0, 0, 1, 0, 0, 0 },
    { 0, 2, 0, 3, 0, 0 },
    { 0, 0, 0, 0, 0, 0 }
};

for (int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素（一维数组）
    //遍历二维数组中的每个元素（一维数组）
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]+"\t");
    }
    System.out.println();
}

// 数组访问  arr[i][j]
System.out.println(arr[2][3]);//
```

1. 二维数组中的每个元素是一个一维数组

#### 二维数组动态初始化

```java
// 二维数组动态初始化1
int[][] arr = new int[2][3];// 2行 3列
// 二维数组动态初始化2
int[][] arr;
arr = new int[2][3];

arr[1][1]  = 8;//改变第二个一维数组的第二个
// 遍历
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

// 0 0 0
// 0 8 0
```

##### 列数不确定数组

```java
// 列数不确定数组
int[][] arr = new int[5][];//创建一个二维数组，但是只能确定一维数组的个数

for (int i = 0; i < arr.length; i++) {//遍历Arr每个一维数组
    // 给每个一维数组开空间
    // 如果没给一位数组new ,那么arr[i]就是null
    arr[i] = new int[i + 1];
    // 遍历一维数组，并给一位数组每个元素赋值
    for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = i + 1;
    }
}

// 遍历
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5 
```

#### 二维数组静态初始化

```java
int[][] = {
    {1,2,3},
    {2},
    {1,2}
};
```

##### 杨辉三角

```java
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 6 4 1
// 1 5 10 10 5 1

int[][] yangHui = new int[10][];
for (int i = 0; i < yangHui.length; i++) {//遍历杨辉的每个元素
    yangHui[i] = new int[i + 1];//给每行开空间
    // 给每一行赋值
    for (int j = 0; j < yangHui[i].length; j++) {
        //每一行的第一个元素和最后一个都是1
        if (j == 0 || j == yangHui[i].length - 1) {
            yangHui[i][j] = 1;

        } else {//中间元素等于上面一个元素+上面元素-1
            yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
        }
    }
}

for (int i = 0; i < yangHui.length; i++) {
    for (int j = 0; j < yangHui[i].length; j++) {
        System.out.print(yangHui[i][j]+" ");
    }
    System.out.println();
}
```



## 类和对象（面向对象）

```java
public class Object01 {
    public static void main(String[] args) {
        // 类 对象
        // OOP面向对象
        // 实例化一个猫
        // 穿件一直买赋值给cat1
        // cat1 cat2就是对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        
        // 怎么使用 访问对象的属性
        System.out.println("第1只猫的信息:" + " " + cat1.name + " "
                           + cat1.age + " " + cat1.color);
        System.out.println("第2只猫的信息:" + " " + cat2.name + " "
                           + cat2.age + " " + cat2.color);
    }
}

// 定义一个猫类
class Cat {
    String name;
    int age;
    String color;
}
```

注意事项：

1. 属性的定义语法同变量 示例：访问修饰符 属性类型 属性名

   ——public  proctected 默认 private

2. 属性类型：包含基本类型和引用类型

3. 

```java
public class Object03 {
    public static void main(String[] args) {
        // P1是对象名（对象引用）
        // new Person()这才是真正的对象
        Person p1 = new Person();

        // 对象的默认值

        System.out.println("当前这个人的信息：");
        System.out.println(p1.name + " " + p1.age + " "
                + p1.sal + " " + p1.isPass);
                // null 0 0.0 false
    }
}

class Person {
    // 四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}
```

### 如何创建

 1. 先声明再创建

    ```java
    Cat cat;
    cat = new Cat();
    ```

 2. 如何访问属性

    ```java
    cat.name;
    cat,age;
    cat.color;
    ```

### 类和对象的内存分配机制

```java
Person p1 = new Person();
p1.age = 10;
p1.name = "小明";
Person p2 = p1;//把p1赋值给p2
System.out.println(p2.age);
//10 p2引用的p1,p2会跟随p1变化
//互相影响
```

### 成员方法

```java
//定义
//访问修饰符 返回数据类型 方法名（形参列表）{
	//语句；
	//return 返回值；
//}
```

#### 注意事项和细节

1. 访问修饰符（作用是控制 方法使用的范围）

   如果不写 是默认

2. 返回数据类型

   1. 一个方法最多有一个返回值 （多个返回值用数组返回 int[] ）

   2. 如果有返回值类型, 方法中必须有return返回值（具体的值）

      ——返回类型必须一致，或可以自动转换的类型

      ```java
      public int[] getArr(int a, int b){
          return a;
      }
      ```

   3. 如果是void ，方法体中不能有return语句，或者只写return;

   4. 方法名：驼峰法    getArr，实际工作中方法名要有一定含义，最好见名知意

3. 形参列表

   1. 一个方法可以没有参数，也可以是多个参数
   2. 参数可以是多个类型（基本类型或引用类型）
   3. 调用方法时，参数类型（实际参数）需要和类定义的参数（形式参数）类型一致
   4. 类中方法定义了几个形式参数，调用时就需要传入对应的实际参数个数

4. 方法体

   1. 类下面的方法体中不能再定义方法体

5. 方法调用细节说明

   1. 同类中的方法调用可以直接调用

   2. 跨类的方法调用，需要先实例化对象，再调用方法

      ```java
      public class Method03 {
          public static void main(String[] args) {
              C c = new C();// 跨类需要创建B对象
              int e = c.m3(1);// 再调用方法
              System.out.println(e);//结果输出1
          }
      }
      
      class B {
          public int m1(int a) {
              return a;
          }
      
          public int m2(int a) {
              int b = m1(1);// 同一个类中方法直接调用
              return b;
          }
      }
      
      class C {
          public int m3(int c) {
              B b = new B();// 跨类需要创建B对象
              int d=b.m2(c);// 再调用方法
              return d;
          }
      }
      ```

      

      

#### 实例

```java

public class Method01 {
    public static void main(String[] args) {
        // 方法使用
        // 1.如果不去调用不会输出
        // 2.先创建对象，再调用方法
        Persons p = new Persons();
        p.speak();
        p.cal01();// 调用cal01方法
        p.cal02(1111);// 调用cal02方法
        p.getSum(1,2);
    }
}

//☆
class Persons {
    String name;
    int age;
    
    // 方法（成员方法）
    // 1.public表示公开的
    // 2.void表示没有返回值
    // speak() 是方法名 （）形参列表
    // {}方法体
    public void speak() {
        System.out.println("我是一个好人");
    }

    // 添加cal01 成员方法 可以计算从1+2+...+1000的结果）
    public void cal01() {
        // 循环
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("结果为：" + sum);
    }
    
    // 添加cal02 接收一个数n 计算1+2+...+n的结果
    public void cal02(int n) {
        // 循环
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("结果为：" + sum);
    }
    
    // 添加getSum成员方法，计算两个值的和
    public void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(a + "+" + b + "的和为" + sum);
    }
}
```

### 成员方法的传参机制

1. 基础数据类型的变量 形参不会影响实参

```java
public class MethodParam01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        A1 obj = new A1();
        obj.swap(a, b);
        System.out.println("a=" + a + " b=" + b);//10 20
    }
}

class A1 {//下面的值不会影响上面的基础数据类型的变量的值，用完之后 a b 还是原来的数
    public void swap(int a, int b) {
        System.out.println("a和b交换前的值" + a + " " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a和b交换后的值" + a + " " + b);
    }
}
```

2. 引用类型的变量， 形参的改变 实参也会改变

```java
public class MethodParam02 {
    public static void main(String[] args) {
        // 引用类型的变量， 形参的改变 实参也会改变
        B1 b = new B1();
        int[] arr = { 1, 2, 3 };
        System.out.println("main");
        b.test1000(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}

class B1 {
    public void test1000(int[] arr) {
        arr[0] = 200;//引用数据类型的值改变了。使用的是同一个地址。所以arr改变了
        System.out.println("test100");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}
```

### 克隆对象

```java
//编写一个copyPerson,可以赋值Person对象,返回赋值的对象。克隆对象。注意得到的新对象和原来的对象是两个独立的对象，只是他们属性相同

public class MethodCopy02 {
    public static void main(String[] args) {
        // 先实例化Dog对象
        Dog dog = new Dog();
        // 克隆Dog对象
        DogClone dog2 = new DogClone();

        //  创建d2用来调用
        Dog d2 = dog2.dogClone(dog);
        d2.name = "大黄";
        d2.age = 3;
        System.out.println("dogclone "+d2.age);
    }
}

class Dog {
    int age;
    String name;
    public void eat() {
        System.out.println("狗在吃饭！");
    }
}

// 克隆Dog类

class DogClone {
    public Dog dogClone(Dog d) {
        // 创建对象
        Dog dog2 = new Dog();
        // 赋值赋值
        dog2.age = d.age;
        dog2.name = d.name;
        // 返回
        return dog2;
    }
}
```



### 递归调用

1. 只要方法中有执行方法就会开辟一个新的受保护的空间（栈空间）
2. 方法局部变量互不影响
3. 如果方法中使用的引用类型变量（数组 对象），就会影响其他栈空间的变量
4. 栈递归必须向退出递归的条件靠近 否则会无限递归
5. 放一个方法执行完毕 或者遇到return 就会返回，遵守谁调用就讲结果返回给谁 。同时当方法执行完毕或者返回时，该方法也就执行完毕

```java
public class Recursion01 {
    public static void main(String[] args) {
        T1 t = new T1();
        t.test(4);
        // n = 2
        // n = 3
        // n = 4
    }

}

class T1 {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);//这里又运行了test()方法
        }
        System.out.println("n = " + n);
    }
}
```



![](C:\Users\marri_9\Desktop\JavaBase\笔记图片\Snipaste_2022-02-21_22-48-55.png)



```java
public class Recursion02 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        int res= t2.factorial(5);
        System.out.println("res = "+ res);
    }
}

class T2 {
    // 阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}//120
```

![](C:\Users\marri_9\Desktop\JavaBase\笔记图片\Snipaste_2022-02-21_23-02-22.png)

#### 实例

```java
public class Recursion03Test {
    public static void main(String[] args) {
        T3 t = new T3();
        int fbl = t.Fib(7);
        System.out.println("菲波拉契数是" + fbl);
    }
}

class T3 {
    /**
     * 使用递归求出斐波那契数 1.1.2.3.5.8.13....
     * 给一个整数N 求出值
     */
    public int Fib(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fib(n - 1) + Fib(n - 2);
            }
        } else {
            System.out.println("要求输入的数>1的整数");
            return -1;
        }
    }
}

```

```java
public class Recursion04Test {
    public static void main(String[] args) {
        T4 t = new T4();
        int day = 1;
        int peachNum = t.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}

class T4 {
    public int peach(int day) {
        /**
         * 有一堆桃子，第一天吃了其中的一半，并再多吃一个。
         * 以后每一天都吃其中一半，再多吃一个。
         * 当到第10天时，发现只有一个桃子。
         * 问最初有多少个桃子

         * 第10天 1
         * 第9天 (day9+1)*2 = 4
         * 第8天 (day8+1)*2 = 20
         */
        // n/2-1 =1
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day要在1-10");
            return -1;
        }
    }
}
```



### 方法重载

```java
public class OverLoad01 {
    public static void main(String[] args) {
        //方法重载
        MyCalc calc = new MyCalc();
        int a = calc.calcSum(1, 1);
        double b = calc.calcSum(1, 1.1);
        double c = calc.calcSum(1.1, 1);
        int d = calc.calcSum(1, 1, 1);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

class MyCalc {
    // 形参不一样  方法名相同
    public int calcSum(int a, int b) {
        return a + b;
    }//两个整数的和
    
    public double calcSum(int a, Double b) {
        return a + b;
    }//一个整数一个double的和

    public double calcSum(double a, int b) {
        return a + b;
    }

    public int calcSum(int a, int b, int c) {
        return a + b + c;
    }//三个整数的和
}
```

1. 方法名必须相同
2. 形参列表：必须不同，或有一个不同，或个数不同，或顺序不同
3. 返回类型无要求

#### 实例

```java
public class OverLoad02 {
    public static void main(String[] args) {
        Methods01 calc = new Methods01();
        System.out.println(calc.calc02(2) + " " + calc.calc02(2, 3)
                + " " + calc.calc02("啊啊啊啊"));
        System.out.println(calc.toMax(9, 10, 11));
    }
}

// 1.编写程序，类 Methods 中定义三个重载方法并调用。方法名为 m。
// 三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
// 分别执行平方运算并输出结果， 相乘并输出结果，输出字符串信息。
// 在主类的 main ()方法中分别用参数区别调用三个方法

// 2.定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值，
// 第二个方法，返回两个 double 值中的最大值，第三个方法

class Methods01 {
    public int calc02(int a) {
        return a * a;
    }

    public int calc02(int a, int b) {
        return a * b;
    }

    public String calc02(String a) {
        return a;
    }

    public int toMax(int a, int b) {// 判断两个整数中最大值
        if (a > b) {
            return a;
        } else {
            return b;
        }
        //return a>b?a:b;
    }

    public double toMax(double a, double b) {// 判断两个double中最大值
        if (a > b) {
            return a;
        } else {
            return b;
        }
        
        //return a>b?a:b;
    }

    public double toMax(double a, double b, double c) {// 判断两个double中最大值
        double max1 = a > b ? a : b;
        max1 = max1 > c ? max1 : c;
        return max1;
        // if (a > b) {
        // if (a > c) {
        // return a;
        // } else {
        // return c;
        // }
        // } else {
        // return b;
        // }
    }
}
```



### 可变参数

```java
//访问修饰符 返回类型 方法名（数据类型... 变量名）{
	//语句
//}
```

```java
public class VarParam {
    public static void main(String[] args) {
        CalcSums calc = new CalcSums();
        System.out.println(calc.sum(1, 2, 3));
    }
}

class CalcSums {
    // public int sums(int n1, int n2) {
    // 		return n1 + n2;
    // }

    // public int sums(int n1, int n2, int n3) {
    // 		return n1 + n2 + n3;
    // }

    // public int sums(int n1, int n2, int n3, int n4) {
    // 		return n1 + n2 + n3 + n4;
    // }
    // 以上三个方法相同 参数不同

    public int sum(int... nums) {
        int res = 0;
        // 把接收到参数看成是一个一维数组
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
```



```java
public class VarParam02 {
    public static void main(String[] args) {
        RecRes res = new RecRes();

        System.out.println(res.calcRes("小明", 99, 86.5, 100));
    }
}

class RecRes {
    public String calcRes(String name, double... Scores) {
        double scoreSum = 0.0;
        for (int i = 0; i < Scores.length; i++) {
            scoreSum += Scores[i];
        }

        return name + "的" + Scores.length + "门课成绩总分为：" + scoreSum;
    }
}

/*有三个方法，分别实现返回姓名和两门课成绩(总分)， 
返回姓名和三门课成绩(总分)，
返回姓名和五门课成绩（总分）。 
封装成一个可变参数的方法 */
```



### 变量作用域

```java
public class VarScope01 {
    public static void main(String[] args) {
        Cat02 c = new Cat02();
        c.cry();

        // 调用Cat03,输出age
        Cat03 c1 = new Cat03();
        c1.test();// 10

        // 调用Cat04,输出age
        Cat04 c2 = new Cat04();
        c2.test(c);// 10
    }
}

class Cat02 {
    // 全局变量（属性） 作用域是整个类体中
    public int age = 10;// 可直接在 say cry方法中使用
    // 全局变量是可以加修饰符的
    private double weight;// 全局变量可以不赋值有默认值

    public void say() {
        // 1.局部变量一般指在成员方法中定义的变量
        // 2.局部变量必须赋值才能使用，局部变量没有默认值

        // a和name只能在say方法中使用
        int a = 100;
        String name = "moco";
        System.out.println(a);// 局部变量
        System.out.println(name);// 局部变量
        System.out.println(age);// 全局变量
    }

    public void cry() {
        int age = 100;
        System.out.println(age);// 全局变量和局部变量重名，就近原则100
        System.out.println(weight);// 全局变量,有默认值0.0
    }
}

class Cat03 {
    public void test() {
        // 创建对象然后调用另一个类中的全局变量
        Cat02 c = new Cat02();
        System.out.println(c.age);
    }
}

class Cat04 {
    // 直接把Cat02对象传入本方法，然后直接调用cat02中的全局变量
    public void test(Cat02 c) {
        System.out.println(c.age);
    }
}
```

1. 全局变量和局部变量可以重名的，使用就近原则
2. 成员方法中的局部变量不能重名

![image-20220223221503926](C:\Users\marri_9\Desktop\JavaBase\笔记图片\image-20220223221503926.png)

4. 作用域范围不同
   1. 全局变量（属性）可以倍本类使用或者被其他类使用（通过对象调用）
   2. 局部变量只能在本类中使用
5. 修饰符不同
   1. 全局变量/属性前面可以加修饰符
   2. 局部变量前面不可以加修饰符



### 构造方法/构造器

```java
//修饰符 方法名（形参列表）{
	//方法体;
//}

// 构造方法又叫构造器，是类的一种特殊的方法,它的主要作用是完成对新对象的初始化
//特点
	//1.方法名和类名相同
	//2.没有返回值
	//3.在创建对象时系统会自动调用该类的构造器来初始化

public class Constractor01 {
    public static void main(String[] args) {

        // Cperson cp = new Cperson("jack");
        // System.out.println(cp.name+" "+cp.age);

        Cperson cp = new Cperson("大黄",10);
        System.out.println(cp.name+" "+cp.age);
    }
}

class Cperson {
    String name;
    int age;

    // 构造器
    public Cperson(String pNmae, int pAge) {
        System.out.println("构造器1被调用");
        name = pNmae;
        age = pAge;
    }

    // 构造器重载
    public Cperson(String pNmae) {
        System.out.println("构造器2被调用");
        name = pNmae;
    }
}
```

1. 构造器的修饰符可以使默认的 public protected pravate
2. 构造器没有返回值
3. 方法名和类目必须一致
4. 参数列表和成员方法一样的规则
5. 构造器的调用，由系统完成

注意事项

1. 一个类可以定义多个不同的构造器（构造器重载）
2. 构造器名和类名要一致
3. 构造器没有返回值i
4. 构造器是对对象的初始化，不是创建对象
5. 在创建对象时，系统自动调用该类的构造器方法
6. 如没有定义构造器，系统会生成一个默认构造器
7. 如果定义了自己的构造器，就不能再使用无参构造器

```java
class Dog{
    int a;
    //构造器
    public dog(string da){
        a =da;
    }
}
```



