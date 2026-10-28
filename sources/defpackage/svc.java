package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class svc implements vxc {
    protected final sum a;
    protected final ttm b;
    protected final vxe c;
    protected final wvi d;
    protected svf e;
    protected final vwt f;
    private final wjr g;

    public svc(sum sumVar, ttm ttmVar, vxe vxeVar, vwt vwtVar, wvi wviVar, wjr wjrVar) {
        this.a = sumVar;
        this.b = ttmVar;
        this.c = vxeVar;
        this.f = vwtVar;
        this.d = wviVar;
        this.g = wjrVar;
    }

    @Override // defpackage.vxc
    public /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        amaz amazVar;
        sul sulVar = (sul) tym.U(map, "OnYpcTransactionListener", sul.class);
        if (sulVar != null) {
            this.a.k = sulVar;
        }
        this.e = (svf) tym.U(map, "YpcTransactionListener", svf.class);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aros.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aros arosVar = (aros) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (this.e == null && (arosVar.c & 2) != 0) {
            this.e = new svb();
        }
        svf svfVar = this.e;
        if (svfVar != null) {
            this.a.n = new qcb(svfVar, null);
        }
        sum sumVar = this.a;
        sumVar.l = (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aros.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aros arosVar2 = (aros) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        if (arosVar2.k.size() > 0) {
            this.c.b(arosVar2.k);
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aros.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aros.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aros arosVar3 = (aros) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
            arot arotVar = arosVar3.j;
            if (arotVar == null) {
                arotVar = arot.a;
            }
            if (((arotVar.b == 95698847 ? (arou) arotVar.c : arou.a).b & 1) != 0) {
                wjr wjrVar = this.g;
                arot arotVar2 = arosVar3.j;
                if (arotVar2 == null) {
                    arotVar2 = arot.a;
                }
                amazVar = (amaz) wjrVar.D((arotVar2.b == 95698847 ? (arou) arotVar2.c : arou.a).c.G(), amaz.a);
            } else {
                amazVar = null;
            }
        } else {
            amazVar = null;
        }
        if (amazVar != null) {
            acb acbVar = new acb((char[]) null);
            acbVar.c = "Get cart with prefetch";
            if ((amazVar.b & 64) != 0) {
                acbVar.d = amazVar.l;
            }
            xeu xeuVar = sumVar.c;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(acbVar.o(), alot.PAYMENT_FLOW_STARTED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                xeuVar.b(acbVar.m());
            }
            sumVar.g = sumVar.f.n(185);
            sumVar.b(amazVar, ajwn.a);
            return;
        }
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aros.b);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aros.b);
                ajwoVar.c(aihlVarCheckIsLite6);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                aros arosVar4 = (aros) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4));
                if (!arosVar4.d.isEmpty()) {
                    String str = arosVar4.d;
                    aigj aigjVar = ajwoVar.c;
                    wvi wviVar = this.d;
                    String strJ = wvg.j(str);
                    wvg wvgVarB = wviVar.b();
                    wvgVarB.a = strJ;
                    wvgVarB.n(aigjVar);
                    ajwn ajwnVar = arosVar4.p;
                    if (ajwnVar == null) {
                        ajwnVar = ajwn.a;
                    }
                    sumVar.f(wvgVarB, ajwnVar);
                    return;
                }
                if ((arosVar4.c & 2) == 0 || arosVar4.e.d() <= 0) {
                    if (arosVar4.l.isEmpty()) {
                        if (arosVar4.o.isEmpty()) {
                            return;
                        }
                        String str2 = arosVar4.o;
                        aqoy aqoyVar = arosVar4.n;
                        if (aqoyVar == null) {
                            aqoyVar = aqoy.a;
                        }
                        aigj aigjVar2 = ajwoVar.c;
                        wvg wvgVarB2 = this.d.b();
                        wvgVarB2.F(str2);
                        wvgVarB2.d = aqoyVar;
                        wvgVarB2.n(aigjVar2);
                        ajwn ajwnVar2 = arosVar4.p;
                        if (ajwnVar2 == null) {
                            ajwnVar2 = ajwn.a;
                        }
                        sumVar.f(wvgVarB2, ajwnVar2);
                        return;
                    }
                    String str3 = arosVar4.l;
                    long j = arosVar4.m;
                    aqoy aqoyVar2 = arosVar4.n;
                    if (aqoyVar2 == null) {
                        aqoyVar2 = aqoy.a;
                    }
                    aigj aigjVar3 = ajwoVar.c;
                    wvi wviVar2 = this.d;
                    String strJ2 = wvg.j(str3);
                    wvg wvgVarB3 = wviVar2.b();
                    wvgVarB3.b = strJ2;
                    wvgVarB3.c = j;
                    wvgVarB3.d = aqoyVar2;
                    wvgVarB3.n(aigjVar3);
                    ajwn ajwnVar3 = arosVar4.p;
                    if (ajwnVar3 == null) {
                        ajwnVar3 = ajwn.a;
                    }
                    sumVar.f(wvgVarB3, ajwnVar3);
                    return;
                }
                if (!arosVar4.f.isEmpty()) {
                    String str4 = arosVar4.f;
                    byte[] bArrG = arosVar4.e.G();
                    aigj aigjVar4 = ajwoVar.c;
                    wvg wvgVarB4 = this.d.b();
                    wvgVarB4.e(bArrG);
                    if (wvgVarB4.e == null) {
                        wvgVarB4.e = ajnr.a.createBuilder();
                    }
                    aihf aihfVar = wvgVarB4.e;
                    aihfVar.copyOnWrite();
                    ajnr ajnrVar = (ajnr) aihfVar.instance;
                    ajnr ajnrVar2 = ajnr.a;
                    str4.getClass();
                    ajnrVar.c = 5;
                    ajnrVar.d = str4;
                    wvgVarB4.n(aigjVar4);
                    ajwn ajwnVar4 = arosVar4.p;
                    if (ajwnVar4 == null) {
                        ajwnVar4 = ajwn.a;
                    }
                    sumVar.f(wvgVarB4, ajwnVar4);
                    return;
                }
                byte[] bArrG2 = arosVar4.e.G();
                String str5 = arosVar4.o;
                long j2 = arosVar4.g;
                String str6 = arosVar4.h;
                amqw amqwVar = arosVar4.i;
                if (amqwVar == null) {
                    amqwVar = amqw.a;
                }
                aigj aigjVar5 = ajwoVar.c;
                wvg wvgVarB5 = this.d.b();
                wvgVarB5.e(bArrG2);
                if (wvgVarB5.e == null) {
                    wvgVarB5.e = ajnr.a.createBuilder();
                }
                aihf aihfVar2 = wvgVarB5.e;
                aihfVar2.copyOnWrite();
                ajnr ajnrVar3 = (ajnr) aihfVar2.instance;
                ajnr ajnrVar4 = ajnr.a;
                ajnrVar3.b |= 2;
                ajnrVar3.f = j2;
                if (amqwVar != null) {
                    if (wvgVarB5.e == null) {
                        wvgVarB5.e = ajnr.a.createBuilder();
                    }
                    aihf aihfVar3 = wvgVarB5.e;
                    aihfVar3.copyOnWrite();
                    ajnr ajnrVar5 = (ajnr) aihfVar3.instance;
                    ajnrVar5.d = amqwVar;
                    ajnrVar5.c = 4;
                } else {
                    if (wvgVarB5.e == null) {
                        wvgVarB5.e = ajnr.a.createBuilder();
                    }
                    aihf aihfVar4 = wvgVarB5.e;
                    aihfVar4.copyOnWrite();
                    ajnr ajnrVar6 = (ajnr) aihfVar4.instance;
                    str6.getClass();
                    ajnrVar6.c = 3;
                    ajnrVar6.d = str6;
                }
                if (!str5.isEmpty()) {
                    wvgVarB5.F(str5);
                }
                wvgVarB5.n(aigjVar5);
                ajwn ajwnVar5 = arosVar4.p;
                if (ajwnVar5 == null) {
                    ajwnVar5 = ajwn.a;
                }
                sumVar.f(wvgVarB5, ajwnVar5);
            }
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
