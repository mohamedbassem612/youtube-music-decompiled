package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfw extends Exception {
    public pfw(String str, Throwable th) {
        super("Column not found:".concat(str), th);
    }
}
