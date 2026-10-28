package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgg implements khr {
    public final /* synthetic */ kgj a;
    private final AtomicLong b = new AtomicLong((khe.a() & 65535) * 10000);

    public kgg(kgj kgjVar) {
        this.a = kgjVar;
    }

    @Override // defpackage.khr
    public final long a() {
        return this.b.getAndIncrement();
    }

    @Override // defpackage.khr
    public final void b(String str, String str2, long j) {
        jzz jzzVarA = this.a.a();
        if (jzzVarA == null) {
            throw new IllegalStateException("Device is not connected");
        }
        khn.e();
        jzzVarA.d(str, str2).p(new kfe(this, j, 2));
    }
}
