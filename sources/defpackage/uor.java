package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uor implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uor(hdj hdjVar, boolean z, agke agkeVar, aldp aldpVar, int i) {
        this.$cid = i;
        this.d = hdjVar;
        this.a = z;
        this.c = agkeVar;
        this.b = aldpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uoi] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        if (this.$cid == 0) {
            uoj uojVar = (uoj) obj;
            upd updVar = (upd) this.c;
            if (updVar.a.get() || uojVar == null) {
                return;
            }
            boolean z = this.a;
            ?? r1 = this.d;
            ((upg) this.b).o(r1, uojVar, updVar, Optional.empty(), z);
            return;
        }
        alwg alwgVar = (alwg) obj;
        if (alwgVar != null) {
            Object obj2 = this.d;
            if (!hdj.E(alwgVar)) {
                hdj hdjVar = (hdj) obj2;
                hdjVar.t(new Throwable(), Optional.of(this.b));
                return;
            }
            boolean z2 = this.a;
            if (z2) {
                hdj hdjVar2 = (hdj) obj2;
                ytf ytfVar = hdjVar2.L;
                if (ytfVar != null) {
                    Object obj3 = this.c;
                    ((lqa) ytfVar.g).N(0);
                    hdjVar2.L.b.clear();
                    hdjVar2.L.b.addAll(obj3);
                }
            } else {
                ytf ytfVar2 = ((hdj) obj2).L;
                if (ytfVar2 != null) {
                    ((lqa) ytfVar2.g).N(0);
                    ytfVar2.d = Optional.empty();
                    ytfVar2.e.clear();
                    ytfVar2.c.clear();
                    ytfVar2.a.clear();
                    ytfVar2.b.clear();
                    ytfVar2.f.clear();
                }
            }
            hdj hdjVar3 = (hdj) obj2;
            hdjVar3.A(alwgVar);
            hdjVar3.q(alwgVar);
            hdjVar3.x();
            hdjVar3.y();
            hdjVar3.u();
            if (z2) {
                return;
            }
            hdjVar3.v();
            hdjVar3.w();
            ggd ggdVar = hdjVar3.v;
            if (ggdVar != null) {
                ggdVar.b();
            }
        }
    }

    public /* synthetic */ uor(upg upgVar, upd updVar, uoi uoiVar, boolean z, int i) {
        this.$cid = i;
        this.b = upgVar;
        this.c = updVar;
        this.d = uoiVar;
        this.a = z;
    }
}
