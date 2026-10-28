package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achh implements achv {
    private final avlh a;
    private avmn b;
    private final boolean c;
    private final awkx d;

    public achh(abmt abmtVar, avlh avlhVar) {
        abmtVar.getClass();
        avlhVar.getClass();
        this.a = avlhVar;
        this.c = abmtVar.g.l(255, 45717339L, false);
        this.d = new awkx();
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        this.d.kk(Optional.ofNullable(achuVar.i));
        return 5;
    }

    @Override // defpackage.achv
    public final int c(achu achuVar) {
        this.d.kk(Optional.ofNullable(achuVar.i));
        return 5;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe d(alvl alvlVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe e(wno wnoVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ achs f() {
        return null;
    }

    @Override // defpackage.achv
    public final void g() {
        if (this.c) {
            avmn avmnVar = this.b;
            if (avmnVar == null || avmnVar.f()) {
                this.b = avlh.f(this.d, this.a.H(new abqe(new hho((Object) this, 16, (int[][][]) null), 8)), new vnc(achg.a, 6)).x(new wsh(new achf(0), 15)).al(new aceb(new achf(2), 18), new aceb(new achf(3), 19));
            }
        }
    }

    @Override // defpackage.achv
    public final void l() {
        Object obj = this.b;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        return this.c;
    }

    @Override // defpackage.achv
    public final /* synthetic */ void i(aazj aazjVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void j(aazk aazkVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void k(aazn aaznVar) {
    }
}
