package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xxk {
    private final awmd a;
    private final awmd b;
    private abvk c;
    protected final tbt d;
    public final xxm e;
    final xxi f;
    public final xxj g;
    public final boolean h;
    public boolean i;
    public final ycp j;
    protected final vxz k;
    private abvc l;

    public xxk(tbt tbtVar, xxm xxmVar, awmd awmdVar, awmd awmdVar2, xmr xmrVar, vxz vxzVar, ycp ycpVar) {
        xxj xxjVar = new xxj(this);
        this.g = xxjVar;
        this.d = tbtVar;
        this.e = xxmVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.j = ycpVar;
        this.h = xmrVar.a.equals("m");
        this.k = vxzVar;
        xxi xxiVar = new xxi(xxjVar);
        this.f = xxiVar;
        ycpVar.a(xxiVar);
    }

    protected abstract void b(xyv xyvVar);

    protected abstract void c();

    protected abstract void d(xyv xyvVar);

    protected abstract void e(abjx abjxVar, amyu amyuVar, boolean z);

    protected final abvc f() {
        abvc abvcVar = this.l;
        if (abvcVar != null) {
            return abvcVar;
        }
        abvc abvcVar2 = (abvc) this.b.io();
        this.l = abvcVar2;
        return abvcVar2;
    }

    public final abvk g() {
        abvk abvkVar = this.c;
        if (abvkVar != null) {
            return abvkVar;
        }
        abvk abvkVar2 = (abvk) this.a.io();
        this.c = abvkVar2;
        return abvkVar2;
    }
}
