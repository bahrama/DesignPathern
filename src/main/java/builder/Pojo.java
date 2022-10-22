package builder;

public class Pojo {
    private final int f1;
    private final int f2;
    private final int f3;
    private final int f4;
    private int f5;
    private int f6;
    private int f7;
    private int f8;
    private int f9;
    private int f10;
    private int f11;
    private int f12;

    public int getF1() {
        return f1;
    }

    public int getF2() {
        return f2;
    }

    public int getF3() {
        return f3;
    }

    public int getF4() {
        return f4;
    }

    public int getF5() {
        return f5;
    }

    public int getF6() {
        return f6;
    }

    public int getF7() {
        return f7;
    }

    public int getF8() {
        return f8;
    }

    public int getF9() {
        return f9;
    }

    public int getF10() {
        return f10;
    }

    public int getF11() {
        return f11;
    }

    public int getF12() {
        return f12;
    }

    private Pojo(int f1, int f2, int f3, int f4) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
    }


    @Override
    public String toString() {
        return "Pojo{" +
                "f1=" + f1 +
                ", f2=" + f2 +
                ", f3=" + f3 +
                ", f4=" + f4 +
                ", f5=" + f5 +
                ", f6=" + f6 +
                ", f7=" + f7 +
                ", f8=" + f8 +
                ", f9=" + f9 +
                ", f10=" + f10 +
                ", f11=" + f11 +
                ", f12=" + f12 +
                '}';
    }

    public static class PojoBuilder {

        private Pojo pojo;

        public PojoBuilder(int f1, int f2, int f3, int f4) {
            pojo = new Pojo(f1, f2, f3, f4);
        }

        public PojoBuilder f5(int f5) {
            pojo.f5 = f5;
            return this;
        }

        public PojoBuilder f6(int f6) {
            pojo.f6 = f6;
            return this;
        }

        public PojoBuilder f7(int f7) {
            pojo.f7 = f7;
            return this;
        }

        public PojoBuilder f8(int f8) {
            pojo.f8 = f8;
            return this;
        }

        public PojoBuilder f9(int f9) {
            pojo.f9 = f9;
            return this;
        }

        public PojoBuilder f10(int f10) {
            pojo.f10 = f10;
            return this;
        }

        public PojoBuilder f11(int f11) {
            pojo.f11 = f11;
            return this;
        }

        public PojoBuilder f12(int f12) {
            pojo.f12 = f12;
            return this;
        }


        public Pojo build() {
            return pojo;
        }
    }
}
