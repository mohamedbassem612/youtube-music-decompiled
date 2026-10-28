package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmz implements wmg {
    private final ci a;

    public wmz(ci ciVar) {
        this.a = ciVar;
    }

    @Override // defpackage.wmg
    public final void a(alop alopVar) {
        throw null;
    }

    @Override // defpackage.wmg
    public final void c(wlu wluVar, alop alopVar, zwa zwaVar) {
        if (wluVar.u()) {
            return;
        }
        if ((wluVar.t.equals("visitor_id") && !zwaVar.m()) || (alopVar.b & 2) == 0 || alopVar.c.isEmpty()) {
            return;
        }
        String str = alopVar.c;
        ci ciVar = this.a;
        if (str.equals(ciVar.aD(zwaVar))) {
            return;
        }
        ciVar.aE(zwaVar, str);
    }

    @Override // defpackage.wmg
    public final /* synthetic */ void d() {
    }
}
