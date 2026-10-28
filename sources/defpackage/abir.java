package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abir extends tal {
    private final abvk d;
    private final abvn e;
    private acfw f;
    private abiq g;
    private final avmm h = new avmm();
    private final aoow i;

    public abir(abvk abvkVar, abvn abvnVar, aoow aoowVar) {
        abvkVar.getClass();
        this.d = abvkVar;
        this.e = abvnVar;
        this.i = aoowVar;
    }

    @Override // defpackage.tal
    public final void b() {
        acga acgaVarG;
        this.h.b();
        acfw acfwVar = this.f;
        if (acfwVar == null || this.g == null || (acgaVarG = acfwVar.g()) == null) {
            return;
        }
        acgaVarG.n(this.g);
    }

    public final void c() {
        abvn abvnVar = this.e;
        this.h.e(((avlh) abvnVar.r().a).i(aawb.y(abvnVar.X(), 67108864L)).i(new abwr(1)).al(new aawl(new abid(this, 13), "PPPC", 1), new xuk(14)));
        abvk abvkVar = this.d;
        if (!abvkVar.Z() || abvkVar.h() == null) {
            return;
        }
        d(abvkVar.h());
    }

    public final void d(acfw acfwVar) {
        if (this.g == null) {
            this.f = acfwVar;
            acga acgaVarG = acfwVar != null ? acfwVar.g() : null;
            if (acgaVarG != null) {
                long jA = acfz.a(this.d.h());
                if (jA > 0) {
                    aoow aoowVar = this.i;
                    abiq abiqVar = new abiq(this, aoowVar.c >= 0 ? Math.min(TimeUnit.MILLISECONDS.convert(aoowVar.c, TimeUnit.SECONDS), jA) : Math.max(TimeUnit.MILLISECONDS.convert(aoowVar.c, TimeUnit.SECONDS) + jA, 0L), jA);
                    this.g = abiqVar;
                    acgaVarG.g(abiqVar);
                }
            }
        }
    }
}
