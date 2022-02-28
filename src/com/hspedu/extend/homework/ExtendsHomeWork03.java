package com.hspedu.extend.homework;

public class ExtendsHomeWork03 {

}

class Comouter {
    private String cpu;
    private String ram;
    private String hardDisk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void printInfo(String cpu,String ram,String hardDisk){
        System.out.println("信息如下：");
        System.out.println("cpu："+cpu);
        System.out.println("内存："+ram);
        System.out.println("硬盘："+hardDisk);
    }
}

class Pc extends Comouter {
    public String brand;

    public void printBrandInfo(String brand){
        System.out.println("品牌："+brand);
    }
}

class NotePad extends Pc {
    public String color;
    public void printColorInfo(String color){
        System.out.println("颜色："+color);
    }
}



class Test{
    public static void main(String[] args) {
        Pc pc = new Pc();
        pc.setCpu("intel i9 9999");
        pc.setRam("64G");
        pc.setHardDisk("1000T");
        pc.brand = "华硕";
        pc.printInfo(pc.getCpu(), pc.getRam(),pc.getHardDisk());
        pc.printBrandInfo(pc.brand);

        System.out.println("==================================");

        NotePad notePad = new NotePad();
        notePad.setCpu("AMD R7 5950X");
        notePad.setRam("128G");
        notePad.setHardDisk("9999T");
        notePad.color = "红色";
        notePad.printInfo(notePad.getCpu(), notePad.getRam(),notePad.getHardDisk());
        notePad.printColorInfo(notePad.color);

    }


}

