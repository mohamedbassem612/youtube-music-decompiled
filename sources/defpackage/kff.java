package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kff implements khr {
    public jzz a;
    final /* synthetic */ kfm b;
    private final AtomicLong c = new AtomicLong((khe.a() & 65535) * 10000);

    public kff(kfm kfmVar) {
        this.b = kfmVar;
    }

    @Override // defpackage.khr
    public final long a() {
        return this.c.getAndIncrement();
    }

    @Override // defpackage.khr
    public final void b(String str, String str2, long j) {
        jzz jzzVar = this.a;
        if (jzzVar == null) {
            throw new IllegalStateException("Device is not connected");
        }
        jzzVar.d(str, str2).p(new kfe(this, j, 0));
    }
}
