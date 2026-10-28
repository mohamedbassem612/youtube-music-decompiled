package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class snq implements abrf {
    private final awmd a;

    public snq(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        sek sekVar = (sek) this.a.io();
        abriVar.Q = sekVar.a.d();
        abriVar.M = sekVar.f.a();
        abriVar.L = sekVar.a();
        tun tunVar = sekVar.c;
        if (tunVar != null) {
            long jB = tunVar.c.b();
            long j = tunVar.a;
            abriVar.K = j != -1 ? jB - j : -1L;
        }
    }
}
