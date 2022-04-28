public class Computer {
    int ram;
    boolean hasSSD;
    int cpuCore;
    double cpuGHz;
    int vRam;

    public Computer(int ram, boolean hasSSD, int cpuCore, double cpuGHz, int vRam) {
        this.ram = ram;
        this.hasSSD = hasSSD;
        this.cpuCore = cpuCore;
        this.cpuGHz = cpuGHz;
        this.vRam = vRam;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public double getCpuGHz() {
        return cpuGHz;
    }

    public void setCpuGHz(double cpuGHz) {
        this.cpuGHz = cpuGHz;
    }

    public int getvRam() {
        return vRam;
    }

    public void setvRam(int vRam) {
        this.vRam = vRam;
    }
    //checks if computer is generally fast and is well rounded
    public boolean isFast() {
        return(getRam() > 16 &&  isHasSSD() == true && getCpuGHz() > 3.0 && getCpuCore() >= 4 && getvRam() >= 6);
    }
    //checks number of tabs before max ram usage.
    public int numChromeTabs() {
        return ((getRam() * 1000) / 95 );
    }
}
