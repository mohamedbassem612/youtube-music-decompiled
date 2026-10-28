package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ood implements qqn {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ ooe b;
    private final String c;

    public ood(ooe ooeVar, String str) {
        this.b = ooeVar;
        this.c = str;
    }

    @Override // defpackage.qqn
    public final void a(long j) {
        AtomicLong atomicLong = this.a;
        atomicLong.getAndAdd(j);
        atomicLong.get();
        int i = onb.a;
    }

    @Override // defpackage.qqn
    public final void b() {
        synchronized (ooe.class) {
            ooe ooeVar = this.b;
            if (ooeVar.c.containsKey(this.c)) {
                ooeVar.a.execute(new ooz(this, 1));
            }
        }
    }
}
