package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qkt extends RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public qkt(int i, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            strValueOf = i + ": " + str;
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }
}
