package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abez implements yxe {
    public volatile acip c;
    private final avlh d;
    private final avmm e = new avmm();
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b = new AtomicReference("");

    public abez(avlh avlhVar) {
        this.d = avlhVar;
    }

    @Override // defpackage.yxe
    public final yxd a(long j) {
        String str;
        int iHashCode;
        return ((!this.a.get() || ((iHashCode = (str = (String) this.b.get()).hashCode()) == 1572835 ? !str.equals("360p") : !(iHashCode == 1604548 && str.equals("480p")))) ? abfk.a : abfk.f).j;
    }

    @Override // defpackage.yxe
    public final void b() {
        this.e.b();
        this.a.set(false);
        this.c = null;
    }

    @Override // defpackage.yxe
    public final void c() {
        abwr abwrVar = new abwr(1);
        avlh avlhVar = this.d;
        avmn avmnVarAk = avlhVar.i(abwrVar).ak(new abae(this, 5));
        avmm avmmVar = this.e;
        avmmVar.c(avmnVarAk);
        avmmVar.c(aawb.w(avlhVar, new aakt(14)).i(new abwr(1)).ak(new abae(this, 6)));
        avmmVar.c(aawb.w(avlhVar, new aakt(15)).i(new abwr(1)).ak(new abae(this, 7)));
        avmmVar.c(aawb.w(avlhVar, new aakt(16)).i(new abwr(1)).ak(new abae(this, 7)));
    }
}
