package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abpt implements abrf {
    private final abnc a;
    private final aboi b;

    public abpt(abnc abncVar, aboi aboiVar) {
        abncVar.getClass();
        this.a = abncVar;
        aboiVar.getClass();
        this.b = aboiVar;
    }

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        abnc abncVar = this.a;
        if (abncVar.e() == abnr.REMOTE) {
            abriVar.W = 5;
            abriVar.X = 5;
        } else {
            abriVar.W = abncVar.q.a;
            abriVar.X = true != abncVar.s() ? 0 : 4;
        }
        abriVar.Y = abncVar.r.c;
        abriVar.G(abncVar.e().i);
        aboi aboiVar = this.b;
        synchronized (aboiVar) {
            if (aboiVar.m()) {
                abriVar.O = aboiVar.l();
                abriVar.N = aboiVar.a();
                abriVar.P = aboiVar.b().d;
                abriVar.R = aboiVar.n();
            }
        }
    }
}
