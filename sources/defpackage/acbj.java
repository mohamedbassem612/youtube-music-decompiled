package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbj {
    private double a;
    private double b;
    private double c;
    private double d;
    private byte e;

    public final acbk a() {
        if (this.e == 15) {
            return new acbk(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" containerTopLeftCornerXRatio");
        }
        if ((this.e & 2) == 0) {
            sb.append(" containerTopLeftCornerYRatio");
        }
        if ((this.e & 4) == 0) {
            sb.append(" containerWidthRatio");
        }
        if ((this.e & 8) == 0) {
            sb.append(" containerHeightRatio");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(double d) {
        this.d = d;
        this.e = (byte) (this.e | 8);
    }

    public final void c(double d) {
        this.a = d;
        this.e = (byte) (this.e | 1);
    }

    public final void d(double d) {
        this.b = d;
        this.e = (byte) (this.e | 2);
    }

    public final void e(double d) {
        this.c = d;
        this.e = (byte) (this.e | 4);
    }
}
