package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jay extends adxi {
    private final wnf a;
    private final jan c;
    private final jnm d;
    private final joo e;
    private final jan f;
    private final jnj g;
    private final isi h;
    private final isi i;
    private final hfn j;
    private final hfn k;
    private final hfn l;
    private final hfn m;

    public jay(wnf wnfVar, xgn xgnVar, tbt tbtVar, advb advbVar, ttm ttmVar, jnm jnmVar, joo jooVar, hfn hfnVar, hfn hfnVar2, hfn hfnVar3, jnj jnjVar, isi isiVar, hfn hfnVar4, jan janVar, isi isiVar2, jan janVar2, vxz vxzVar, vxz vxzVar2) {
        super(wnfVar, tbtVar, advbVar, ttmVar, xgnVar, vxzVar, vxzVar2);
        this.a = wnfVar;
        this.d = jnmVar;
        this.e = jooVar;
        this.k = hfnVar;
        this.j = hfnVar2;
        this.l = hfnVar3;
        this.g = jnjVar;
        this.h = isiVar;
        this.m = hfnVar4;
        this.c = janVar;
        this.i = isiVar2;
        this.f = janVar2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.adxi, defpackage.advd
    public final advc a(Object obj, adxd adxdVar, adwr adwrVar) {
        advc iwuVar;
        advc iylVar;
        if (obj instanceof anwt) {
            return this.d.b((anwt) obj, adxdVar, this.a, this.b);
        }
        if (obj instanceof anuz) {
            anuz anuzVar = (anuz) obj;
            joo jooVar = this.e;
            wnf wnfVar = this.a;
            xgn xgnVar = this.b;
            anuzVar.getClass();
            tbt tbtVar = (tbt) jooVar.g.io();
            tbtVar.getClass();
            ttm ttmVar = (ttm) jooVar.c.io();
            ttmVar.getClass();
            Executor executor = (Executor) jooVar.j.io();
            executor.getClass();
            avmb avmbVar = (avmb) jooVar.l.io();
            avmbVar.getClass();
            vxz vxzVar = (vxz) jooVar.k.io();
            vxzVar.getClass();
            Context context = (Context) jooVar.b.io();
            context.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) jooVar.i.io();
            accessibilityManager.getClass();
            wbz wbzVar = (wbz) jooVar.d.io();
            wbzVar.getClass();
            zwb zwbVar = (zwb) jooVar.e.io();
            zwbVar.getClass();
            vxz vxzVar2 = (vxz) jooVar.a.io();
            vxzVar2.getClass();
            return new ikn(anuzVar, wnfVar, xgnVar, adxdVar, adwrVar, jooVar.f, tbtVar, ttmVar, executor, avmbVar, vxzVar, jooVar.h, context, accessibilityManager, wbzVar, zwbVar, vxzVar2);
        }
        if (obj instanceof anss) {
            return this.k.I((anss) obj);
        }
        if (!(obj instanceof anxe)) {
            if (obj instanceof anyb) {
                return kro.N((anyb) obj);
            }
            if (obj instanceof annb) {
                annb annbVar = (annb) obj;
                annbVar.getClass();
                iylVar = new ixm(annbVar);
            } else if (obj instanceof anxs) {
                anxs anxsVar = (anxs) obj;
                anxsVar.getClass();
                iylVar = new iyq(anxsVar);
            } else if (obj instanceof anoh) {
                anoh anohVar = (anoh) obj;
                tbt tbtVar2 = (tbt) this.l.a.io();
                tbtVar2.getClass();
                anohVar.getClass();
                iwuVar = new ixo(tbtVar2, anohVar);
            } else {
                if (obj instanceof alfr) {
                    alfr alfrVar = (alfr) obj;
                    jnj jnjVar = this.g;
                    wnf wnfVar2 = this.a;
                    xgn xgnVar2 = this.b;
                    Context context2 = (Context) jnjVar.c.io();
                    context2.getClass();
                    tbt tbtVar3 = (tbt) jnjVar.a.io();
                    tbtVar3.getClass();
                    ttm ttmVar2 = (ttm) jnjVar.b.io();
                    ttmVar2.getClass();
                    acxn acxnVar = (acxn) jnjVar.e.io();
                    acxnVar.getClass();
                    ((jnj) jnjVar.d.io()).getClass();
                    vxz vxzVar3 = (vxz) jnjVar.f.io();
                    vxzVar3.getClass();
                    alfrVar.getClass();
                    return new ixs(context2, tbtVar3, ttmVar2, acxnVar, vxzVar3, alfrVar, wnfVar2, xgnVar2);
                }
                if (obj instanceof akfy) {
                    return kro.ag((akfy) obj);
                }
                if (obj instanceof anlm) {
                    return this.h.q(adxdVar, (anlm) obj);
                }
                if (obj instanceof anpq) {
                    anpq anpqVar = (anpq) obj;
                    tbt tbtVar4 = (tbt) this.m.a.io();
                    tbtVar4.getClass();
                    anpqVar.getClass();
                    iwuVar = new iwz(adxdVar, tbtVar4, anpqVar);
                } else {
                    if (obj instanceof wga) {
                        wga wgaVar = (wga) obj;
                        jan janVar = this.c;
                        wnf wnfVar3 = this.a;
                        xgn xgnVar3 = this.b;
                        advb advbVar = (advb) janVar.a.io();
                        advbVar.getClass();
                        tbt tbtVar5 = (tbt) janVar.b.io();
                        tbtVar5.getClass();
                        ttm ttmVar3 = (ttm) janVar.c.io();
                        ttmVar3.getClass();
                        acyx acyxVar = (acyx) janVar.d.io();
                        acyxVar.getClass();
                        vxz vxzVar4 = (vxz) janVar.e.io();
                        vxzVar4.getClass();
                        vxz vxzVar5 = (vxz) janVar.f.io();
                        vxzVar5.getClass();
                        dov dovVar = (dov) janVar.g.io();
                        dovVar.getClass();
                        avmb avmbVar2 = (avmb) janVar.h.io();
                        avmbVar2.getClass();
                        jam jamVar = new jam(advbVar, tbtVar5, ttmVar3, acyxVar, vxzVar4, vxzVar5, dovVar, avmbVar2, wnfVar3, xgnVar3, adxdVar);
                        if (adxdVar != null) {
                            return jamVar;
                        }
                        jamVar.e(wgaVar);
                        return jamVar;
                    }
                    if (obj instanceof ajta) {
                        ajta ajtaVar = (ajta) obj;
                        ajtaVar.getClass();
                        iylVar = new ixl(ajtaVar);
                    } else if (obj instanceof angn) {
                        angn angnVar = (angn) obj;
                        angnVar.getClass();
                        iylVar = new iyl(angnVar);
                    } else {
                        if (!(obj instanceof anlj)) {
                            if (!(obj instanceof anto)) {
                                return super.a(obj, adxdVar, adwrVar);
                            }
                            anto antoVar = (anto) obj;
                            jan janVar2 = this.f;
                            Context context3 = (Context) janVar2.c.io();
                            context3.getClass();
                            tbt tbtVar6 = (tbt) janVar2.f.io();
                            tbtVar6.getClass();
                            kwq kwqVar = (kwq) janVar2.h.io();
                            kwqVar.getClass();
                            Executor executor2 = (Executor) janVar2.a.io();
                            executor2.getClass();
                            Executor executor3 = (Executor) janVar2.g.io();
                            executor3.getClass();
                            mbc mbcVar = (mbc) janVar2.d.io();
                            mbcVar.getClass();
                            hpy hpyVar = (hpy) janVar2.e.io();
                            hpyVar.getClass();
                            hpb hpbVar = (hpb) janVar2.b.io();
                            hpbVar.getClass();
                            antoVar.getClass();
                            return new ixd(context3, tbtVar6, kwqVar, executor2, executor3, mbcVar, adxdVar, hpyVar, hpbVar, antoVar);
                        }
                        anlj anljVar = (anlj) obj;
                        isi isiVar = this.i;
                        anljVar.getClass();
                        ((Context) isiVar.c.io()).getClass();
                        ((ttm) isiVar.b.io()).getClass();
                        ((vxe) isiVar.a.io()).getClass();
                        iwuVar = new iwu(anljVar);
                    }
                }
            }
            return iylVar;
        }
        anxe anxeVar = (anxe) obj;
        tbt tbtVar7 = (tbt) this.j.a.io();
        tbtVar7.getClass();
        anxeVar.getClass();
        iwuVar = new iyp(tbtVar7, anxeVar);
        return iwuVar;
    }
}
