package de.exxcellent.challenge.model;

import java.util.Objects;

public class Weather {
    private String day;
    private int mxt;
    private int mnt;
    private int avt;
    private double avdp;
    private double oneHrPTpcpn;
    private String pDir;
    private double avSp;
    private String dir;
    private int mxS;
    private double skyC;
    private double mxR;
    private double mn;
    private double rAvSLP;

    public Weather(String day, int mxt, int mnt, int avt, double avdp, double oneHrPTpcpn, String pDir, double avSp, String dir, int mxS, double skyC, double mxR, double mn, double rAvSLP) {
        this.day = day;
        this.mxt = mxt;
        this.mnt = mnt;
        this.avt = avt;
        this.avdp = avdp;
        this.oneHrPTpcpn = oneHrPTpcpn;
        this.pDir = pDir;
        this.avSp = avSp;
        this.dir = dir;
        this.mxS = mxS;
        this.skyC = skyC;
        this.mxR = mxR;
        this.mn = mn;
        this.rAvSLP = rAvSLP;
    }

    public Weather() {}

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getMxt() {
        return mxt;
    }

    public void setMxt(int mxt) {
        this.mxt = mxt;
    }

    public int getMnt() {
        return mnt;
    }

    public void setMnt(int mnt) {
        this.mnt = mnt;
    }

    public int getAvt() {
        return avt;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }

    public double getAvdp() {
        return avdp;
    }

    public void setAvdp(double avdp) {
        this.avdp = avdp;
    }

    public double getOneHrPTpcpn() {
        return oneHrPTpcpn;
    }

    public void setOneHrPTpcpn(double oneHrPTpcpn) {
        this.oneHrPTpcpn = oneHrPTpcpn;
    }

    public String getpDir() {
        return pDir;
    }

    public void setpDir(String pDir) {
        this.pDir = pDir;
    }

    public double getAvSp() {
        return avSp;
    }

    public void setAvSp(double avSp) {
        this.avSp = avSp;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getMxS() {
        return mxS;
    }

    public void setMxS(int mxS) {
        this.mxS = mxS;
    }

    public double getSkyC() {
        return skyC;
    }

    public void setSkyC(double skyC) {
        this.skyC = skyC;
    }

    public double getMxR() {
        return mxR;
    }

    public void setMxR(double mxR) {
        this.mxR = mxR;
    }

    public double getMn() {
        return mn;
    }

    public void setMn(double mn) {
        this.mn = mn;
    }

    public double getrAvSLP() {
        return rAvSLP;
    }

    public void setrAvSLP(double rAvSLP) {
        this.rAvSLP = rAvSLP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return mxt == weather.mxt && mnt == weather.mnt && avt == weather.avt && Double.compare(avdp, weather.avdp) == 0 && Double.compare(oneHrPTpcpn, weather.oneHrPTpcpn) == 0 && Double.compare(avSp, weather.avSp) == 0 && mxS == weather.mxS && Double.compare(skyC, weather.skyC) == 0 && Double.compare(mxR, weather.mxR) == 0 && Double.compare(mn, weather.mn) == 0 && Double.compare(rAvSLP, weather.rAvSLP) == 0 && Objects.equals(day, weather.day) && Objects.equals(pDir, weather.pDir) && Objects.equals(dir, weather.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, mxt, mnt, avt, avdp, oneHrPTpcpn, pDir, avSp, dir, mxS, skyC, mxR, mn, rAvSLP);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "day='" + day + '\'' +
                ", mxt=" + mxt +
                ", mnt=" + mnt +
                ", avt=" + avt +
                ", avdp=" + avdp +
                ", oneHrPTpcpn=" + oneHrPTpcpn +
                ", pDir='" + pDir + '\'' +
                ", avSp=" + avSp +
                ", dir='" + dir + '\'' +
                ", mxS=" + mxS +
                ", skyC=" + skyC +
                ", mxR=" + mxR +
                ", mn=" + mn +
                ", rAvSLP=" + rAvSLP +
                '}';
    }
}
