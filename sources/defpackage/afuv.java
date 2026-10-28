package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afuv {
    private static final afuv a = new afuv(3, null, true);
    private static final afuv b = new afuv(2, null, true);
    private final Object c;
    private boolean d;
    private final int e;

    public afuv(int i, Object obj, boolean z) {
        this.e = i;
        this.c = obj;
        this.d = z;
    }

    public static afuv d(int i) {
        return i + (-1) != 1 ? a : b;
    }

    public final Object a() {
        if (this.d && this.e == 1) {
            return this.c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    public final boolean b() {
        this.d = true;
        return this.e == 1;
    }

    public final int c() {
        this.d = true;
        return this.e;
    }
}
