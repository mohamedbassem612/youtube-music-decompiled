package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfa implements yxe {
    public volatile acip a;
    private final avlh c;
    private final avmm d = new avmm();
    public final AtomicReference b = new AtomicReference(abfk.a.j);

    public abfa(avlh avlhVar) {
        this.c = avlhVar;
    }

    @Override // defpackage.yxe
    public final yxd a(long j) {
        return (yxd) this.b.get();
    }

    @Override // defpackage.yxe
    public final void b() {
        this.d.b();
        this.a = null;
        this.b.set(abfk.a.j);
    }

    @Override // defpackage.yxe
    public final void c() {
        abwr abwrVar = new abwr(1);
        avlh avlhVar = this.c;
        avmn avmnVarAk = avlhVar.i(abwrVar).ak(new abae(this, 8));
        avmm avmmVar = this.d;
        avmmVar.c(avmnVarAk);
        avmmVar.c(aawb.w(avlhVar, new aakt(17)).i(new abwr(1)).ak(new abae(this, 9)));
    }
}
