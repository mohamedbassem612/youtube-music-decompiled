package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnz extends adxi {
    private final wnf a;
    private final ikg c;
    private final jnm d;
    private final isi e;
    private final hfn f;

    public jnz(tbt tbtVar, ttm ttmVar, advb advbVar, wuo wuoVar, xgn xgnVar, jnm jnmVar, ikg ikgVar, hfn hfnVar, isi isiVar, vxz vxzVar, vxz vxzVar2) {
        super(wuoVar, tbtVar, advbVar, ttmVar, xgnVar, vxzVar, vxzVar2);
        this.a = wuoVar;
        this.d = jnmVar;
        this.c = ikgVar;
        this.f = hfnVar;
        this.e = isiVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.adxi, defpackage.advd
    public final advc a(Object obj, adxd adxdVar, adwr adwrVar) {
        if (obj instanceof anwt) {
            return this.d.b((anwt) obj, adxdVar, this.a, this.b);
        }
        if (!(obj instanceof aouj)) {
            if (obj instanceof anss) {
                return this.f.I((anss) obj);
            }
            if (obj instanceof anyb) {
                return kro.N((anyb) obj);
            }
            if (obj instanceof akfy) {
                return kro.ag((akfy) obj);
            }
            if (!(obj instanceof anlm)) {
                return super.a(obj, adxdVar, adwrVar);
            }
            return this.e.q(adxdVar, (anlm) obj);
        }
        aouj aoujVar = (aouj) obj;
        ikg ikgVar = this.c;
        wnf wnfVar = this.a;
        wnfVar.getClass();
        aoujVar.getClass();
        Context context = (Context) ikgVar.e.io();
        context.getClass();
        tbt tbtVar = (tbt) ikgVar.f.io();
        tbtVar.getClass();
        ttm ttmVar = (ttm) ikgVar.g.io();
        ttmVar.getClass();
        xgn xgnVar = (xgn) ikgVar.h.io();
        xgnVar.getClass();
        abjp abjpVar = (abjp) ikgVar.a.io();
        abjpVar.getClass();
        icj icjVar = (icj) ikgVar.b.io();
        icjVar.getClass();
        ico icoVar = (ico) ikgVar.c.io();
        icoVar.getClass();
        icl iclVar = (icl) ikgVar.i.io();
        iclVar.getClass();
        aesp aespVar = (aesp) ikgVar.j.io();
        aespVar.getClass();
        jkp jkpVar = (jkp) ikgVar.d.io();
        jkpVar.getClass();
        ycp ycpVar = (ycp) ikgVar.k.io();
        ycpVar.getClass();
        vxz vxzVar = (vxz) ikgVar.l.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) ikgVar.m.io();
        vxzVar2.getClass();
        awkx awkxVar = (awkx) ikgVar.n.io();
        awkxVar.getClass();
        return new ikf(wnfVar, aoujVar, context, tbtVar, ttmVar, xgnVar, abjpVar, icjVar, icoVar, iclVar, aespVar, jkpVar, ycpVar, vxzVar, vxzVar2, awkxVar);
    }
}
