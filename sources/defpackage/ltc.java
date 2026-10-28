package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltc extends Exception {
    public ltc(Throwable th) {
        super("ContentProvider query failed", th);
    }

    public ltc(String str) {
        super(str);
    }
}
