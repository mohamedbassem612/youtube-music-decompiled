package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wcm extends Exception {
    public final int a;
    public volatile boolean b;
    public final int c;
    public final int d;

    private wcm(Throwable th, int i, int i2, int i3) {
        super(th);
        this.b = false;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public static wcm a(Throwable th, int i, int i2, int i3) {
        return th instanceof wcm ? (wcm) th : new wcm(th, i, i2, i3);
    }
}
