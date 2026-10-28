package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class acyp implements bkz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acyp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.bkz
    public final void a(boolean z, float f) {
        acyt acytVar;
        int i = this.$cid;
        if (i == 0) {
            acytVar = (acyt) this.a;
        } else {
            if (i == 1) {
                if (z) {
                    return;
                }
                Object obj = this.a;
                if (f < 1.0f) {
                    drw drwVar = (drw) obj;
                    long jH = drwVar.h();
                    dsa dsaVar = drwVar.g;
                    dsa dsaVarG = ((dsi) dsaVar).g(0);
                    dsa dsaVar2 = dsaVarG.m;
                    dsaVarG.m = null;
                    dsaVar.y(-1L, drwVar.a);
                    dsaVar.y(jH, -1L);
                    drwVar.a = jH;
                    Runnable runnable = drwVar.f;
                    if (runnable != null) {
                        runnable.run();
                    }
                    dsaVar.o.clear();
                    if (dsaVar2 != null) {
                        dsaVar2.s(dsaVar2, drz.b, true);
                    }
                    dsaVar.s(dsaVar, drz.b, true);
                } else {
                    dsa dsaVar3 = ((drw) obj).g;
                    dsaVar3.s(dsaVar3, drz.b, false);
                }
                ((drw) obj).g.v();
                return;
            }
            acytVar = (acyt) this.a;
            acytVar.d = null;
        }
        acytVar.c = null;
    }
}
