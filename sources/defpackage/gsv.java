package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gsv implements xnu {
    final /* synthetic */ String a;
    final /* synthetic */ ajih b;
    final /* synthetic */ gsw c;

    public gsv(gsw gswVar, String str, ajih ajihVar) {
        this.a = str;
        this.b = ajihVar;
        this.c = gswVar;
    }

    @Override // defpackage.xnu
    public final void a(xvn xvnVar) {
        String str = xvnVar.l() == null ? "" : xvnVar.l().b;
        String str2 = xvnVar.c;
        if (str.equals(this.a)) {
            gsw gswVar = this.c;
            ajih ajihVar = this.b;
            algt algtVar = ajihVar.e;
            if (algtVar == null) {
                algtVar = algt.a;
            }
            amyv amyvVarA = amyv.a(ajihVar.f);
            if (amyvVarA == null) {
                amyvVarA = amyv.MDX_SESSION_SOURCE_UNKNOWN;
            }
            gswVar.h(algtVar, amyvVarA);
            gswVar.d.h(this);
        }
    }

    @Override // defpackage.xnu
    public final void b() {
        boolean z = this.b.c;
        this.c.d.h(this);
    }
}
