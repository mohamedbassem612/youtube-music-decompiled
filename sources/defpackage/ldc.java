package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ldc implements Runnable {
    private final ldb a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map f;

    public ldc(String str, ldb ldbVar, int i, Throwable th, byte[] bArr, Map map) {
        this.a = ldbVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
