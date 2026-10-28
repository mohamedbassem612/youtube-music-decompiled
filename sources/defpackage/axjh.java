package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjh extends RuntimeException {
    public axjh(String str, Throwable th) {
        super("Native stack trace:" + System.lineSeparator() + str, th);
    }
}
