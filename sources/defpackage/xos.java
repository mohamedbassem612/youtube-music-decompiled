package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xos implements xnu {
    public final awlx a = new awlx();
    public final awlx b = new awlx();
    public final /* synthetic */ xot c;
    private final String d;

    public xos(xot xotVar, String str) {
        this.c = xotVar;
        this.d = str;
    }

    @Override // defpackage.xnu
    public final void a(xvn xvnVar) {
        if (xvnVar == null || xvnVar.l() == null) {
            return;
        }
        xvg xvgVarL = xvnVar.l();
        xvgVarL.getClass();
        agrx agrxVar = agso.a;
        if (xvgVarL.b.equals(this.d)) {
            this.a.ki(Boolean.TRUE);
        }
    }

    @Override // defpackage.xnu
    public final void b() {
        agrx agrxVar = agso.a;
        this.a.ki(Boolean.FALSE);
        this.b.ki(Boolean.TRUE);
    }
}
