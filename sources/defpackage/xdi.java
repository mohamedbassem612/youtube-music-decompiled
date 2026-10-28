package defpackage;

import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdi {
    public final awmd a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public xdi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14) {
        this.b = awmdVar;
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        this.g = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        awmdVar10.getClass();
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
        awmdVar12.getClass();
        this.l = awmdVar12;
        awmdVar13.getClass();
        this.m = awmdVar13;
        awmdVar14.getClass();
        this.n = awmdVar14;
    }

    public static Optional b(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apxs.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apxs apxsVar = (apxs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        return (apxsVar.c & 1) != 0 ? Optional.of(apxsVar) : Optional.empty();
    }

    public static final void e(vob vobVar, String str, aeja aejaVar) {
        if (vobVar instanceof vnb) {
            LoadingFrameLayout loadingFrameLayoutA = ((vnb) vobVar).a();
            loadingFrameLayoutA.b(str, aejaVar != null);
            if (aejaVar != null) {
                loadingFrameLayoutA.e(aejaVar);
            }
        }
    }

    public static final void f(vob vobVar, boolean z) {
        if (vobVar instanceof vnb) {
            if (z) {
                ((vnb) vobVar).a().c();
            } else {
                ((vnb) vobVar).a().g(2);
            }
        }
    }

    private final wrw g(apxs apxsVar, byte[] bArr, boolean z) {
        String strAb = tzk.ab(apxsVar);
        strAb.getClass();
        apxr apxrVar = apxsVar.f;
        if (apxrVar == null) {
            apxrVar = apxr.a;
        }
        wrw wrwVarA = a(strAb, apxrVar, bArr, z);
        if ((apxsVar.c & SemanticState.ReadOnly) != 0) {
            aoli aoliVar = apxsVar.o;
            if (aoliVar == null) {
                aoliVar = aoli.a;
            }
            ajgq ajgqVarA = ajgq.a(aoliVar.h);
            if (ajgqVarA == null) {
                ajgqVarA = ajgq.ENGAGEMENT_TYPE_UNKNOWN;
            }
            wrwVarA.b = ajgqVarA;
        }
        return wrwVarA;
    }

    public final wrw a(String str, apxr apxrVar, byte[] bArr, boolean z) {
        Object obj = this.l;
        wrw wrwVarB = z ? ((wrv) obj).b() : ((wrv) obj).a();
        wrwVarB.F(str);
        if ((apxrVar.b & 2) != 0) {
            wrwVarB.G(apxrVar.d);
        }
        wrwVarB.o(bArr);
        return wrwVarB;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vxe] */
    public final void c(aoll aollVar) {
        ajwo ajwoVar = aollVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        if (ajwoVar.equals(ajwo.a)) {
            return;
        }
        this.k.a(ajwoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bog, java.lang.Object] */
    public final void d(final String str, apxs apxsVar, vor vorVar, final vob vobVar, akuj akujVar, ajwo ajwoVar) {
        final xdi xdiVar;
        final apxs apxsVar2;
        final vor vorVar2;
        final vob vobVar2;
        final akuj akujVar2;
        final ajwo ajwoVar2;
        aeja aejaVar;
        ListenableFuture listenableFutureC;
        final xir xirVarN = this.f.n(318);
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiuVar.e |= 33554432;
        amiuVar.Z = str;
        xirVarN.h((amiu) aihfVarCreateBuilder.build());
        xirVarN.f(tau.GLOBAL_ENGAGEMENT_PANEL_REQUESTED);
        if (((vxz) ((aaok) this.g).c).m(70, 45713587L)) {
            apxsVar2 = apxsVar;
            vorVar2 = vorVar;
            akujVar2 = akujVar;
            ajwoVar2 = ajwoVar;
            aejaVar = new aeja() { // from class: vpv
                @Override // defpackage.aeja
                public final void a() {
                    vob vobVar3 = vobVar;
                    xdi.f(vobVar3, true);
                    this.g.d(str, apxsVar2, vorVar2, vobVar3, akujVar2, ajwoVar2);
                }
            };
            xdiVar = this;
            vobVar2 = vobVar;
        } else {
            xdiVar = this;
            apxsVar2 = apxsVar;
            vorVar2 = vorVar;
            vobVar2 = vobVar;
            akujVar2 = akujVar;
            ajwoVar2 = ajwoVar;
            aejaVar = null;
        }
        aeja aejaVar2 = aejaVar;
        aoli aoliVar = apxsVar2.o;
        if (aoliVar == null) {
            aoliVar = aoli.a;
        }
        boolean z = aoliVar.i;
        Object obj = xdiVar.l;
        if (z) {
            listenableFutureC = ((wrv) obj).d(xdiVar.g(apxsVar2, yno.F(ajwoVar2), true));
        } else {
            listenableFutureC = ((wrv) obj).c(xdiVar.g(apxsVar2, yno.F(ajwoVar2), false), xdiVar.n);
        }
        ListenableFuture listenableFuture = listenableFutureC;
        ?? r2 = xdiVar.h;
        hmo hmoVar = new hmo(xdiVar, vobVar2, aejaVar2, xirVarN, 13, null);
        final vor vorVar3 = vorVar2;
        final akuj akujVar3 = akujVar2;
        taf.k(r2, listenableFuture, hmoVar, new twi() { // from class: vpw
            /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, vob] */
            @Override // defpackage.twi
            public final void a(Object obj2) {
                akuj akujVar4;
                apji apjiVar;
                apji apjiVar2;
                aoll aollVar = ((wru) obj2).a;
                xdi xdiVar2 = this.e;
                xdiVar2.c(aollVar);
                vob vobVar3 = vobVar2;
                vobVar3.p().d(new xgj(aollVar.g, (amud) null));
                String strAa = tzk.aa(akujVar3);
                if (strAa != null) {
                    vor vorVar4 = vorVar3;
                    vov vovVar = vorVar4.a;
                    vot votVarA = vovVar.c(strAa) ? vovVar.a(strAa) : null;
                    if (votVarA != null) {
                        if (vorVar4.r.w()) {
                            aunn aunnVar = vorVar4.s;
                            aihf aihfVarCreateBuilder2 = akuj.b.createBuilder();
                            aihf aihfVarCreateBuilder3 = akud.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            akud akudVar = (akud) aihfVarCreateBuilder3.instance;
                            akudVar.b |= 2;
                            akudVar.d = strAa;
                            akud akudVar2 = (akud) aihfVarCreateBuilder3.build();
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar5 = (akuj) aihfVarCreateBuilder2.instance;
                            akudVar2.getClass();
                            akujVar5.f = akudVar2;
                            akujVar5.e = 18;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar6 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar6.p = 1;
                            akujVar6.c |= SemanticState.ReadOnly;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar7 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar7.n = 2;
                            akujVar7.c |= SemanticState.Hidden;
                            aihfVarCreateBuilder2.aU(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER);
                            aihfVarCreateBuilder2.aU(akua.ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED);
                            aktz aktzVar = aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar8 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar8.K = aktzVar.e;
                            akujVar8.d |= 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar9 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar9.o = 1;
                            akujVar9.c |= SemanticState.LiveRegion;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar10 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar10.C = 1;
                            akujVar10.c |= 8388608;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar11 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar11.M = 0;
                            akujVar11.d |= 4;
                            aihfVarCreateBuilder2.getClass();
                            aihfVarCreateBuilder2.copyOnWrite();
                            akuj akujVar12 = (akuj) aihfVarCreateBuilder2.instance;
                            akujVar12.n = 1;
                            akujVar12.c |= SemanticState.Hidden;
                            aoln aolnVar = aollVar.d;
                            if (aolnVar == null) {
                                aolnVar = aoln.a;
                            }
                            aolnVar.getClass();
                            int i = aolnVar.b;
                            if (i == 138681066) {
                                aihfVarCreateBuilder2.mergeFrom((aihn) aolnVar.c);
                            } else if (i == 153515154) {
                                akrn akrnVar = (akrn) aolnVar.c;
                                akrnVar.getClass();
                                akuh akuhVarEO = yno.eO(akrnVar);
                                aihfVarCreateBuilder2.copyOnWrite();
                                akuj akujVar13 = (akuj) aihfVarCreateBuilder2.instance;
                                akujVar13.h = akuhVarEO;
                                akujVar13.c |= 4;
                            } else {
                                if (i == 441573002) {
                                    aolg aolgVar = (aolg) aolnVar.c;
                                    aolgVar.getClass();
                                    if ((aolgVar.b & 1) != 0) {
                                        apjiVar = aolgVar.c;
                                        if (apjiVar == null) {
                                            apjiVar = apji.a;
                                        }
                                    } else {
                                        apjiVar = null;
                                    }
                                    if (apjiVar != null) {
                                        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                                        apjiVar.c(aihlVarCheckIsLite);
                                        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                                        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
                                        objC.getClass();
                                        aihf aihfVarCreateBuilder4 = akui.a.createBuilder();
                                        aihfVarCreateBuilder4.copyOnWrite();
                                        akui akuiVar = (akui) aihfVarCreateBuilder4.instance;
                                        akuiVar.c = (akrn) objC;
                                        akuiVar.b = 153515154;
                                        aihn aihnVarBuild = aihfVarCreateBuilder4.build();
                                        aihnVarBuild.getClass();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        akuj akujVar14 = (akuj) aihfVarCreateBuilder2.instance;
                                        akujVar14.g = (akui) aihnVarBuild;
                                        akujVar14.c |= 2;
                                    }
                                    if ((aolgVar.b & 2) != 0) {
                                        apji apjiVar3 = aolgVar.d;
                                        if (apjiVar3 == null) {
                                            apjiVar3 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                                        apjiVar3.c(aihlVarCheckIsLite2);
                                        Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite2.d);
                                        Object objC2 = objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2);
                                        objC2.getClass();
                                        akuh akuhVarEO2 = yno.eO((akrn) objC2);
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        akuj akujVar15 = (akuj) aihfVarCreateBuilder2.instance;
                                        akujVar15.h = akuhVarEO2;
                                        akujVar15.c |= 4;
                                    } else if (aolgVar.g.size() > 0) {
                                        aiie<apji> aiieVar = aolgVar.g;
                                        aiieVar.getClass();
                                        ArrayList<akrn> arrayList = new ArrayList(atqq.N(aiieVar, 10));
                                        for (apji apjiVar4 : aiieVar) {
                                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                                            apjiVar4.c(aihlVarCheckIsLite3);
                                            Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite3.d);
                                            arrayList.add((akrn) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3)));
                                        }
                                        ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                                        for (akrn akrnVar2 : arrayList) {
                                            aihf aihfVarCreateBuilder5 = amgj.a.createBuilder();
                                            aihfVarCreateBuilder5.copyOnWrite();
                                            amgj amgjVar = (amgj) aihfVarCreateBuilder5.instance;
                                            akrnVar2.getClass();
                                            amgjVar.dP = akrnVar2;
                                            amgjVar.i |= SemanticState.LiveRegion;
                                            arrayList2.add((amgj) aihfVarCreateBuilder5.build());
                                        }
                                        aihf aihfVarCreateBuilder6 = akuh.a.createBuilder();
                                        aihf aihfVarCreateBuilder7 = apoq.a.createBuilder();
                                        aihf aihfVarCreateBuilder8 = apox.a.createBuilder();
                                        aihh aihhVar = (aihh) amgg.a.createBuilder();
                                        aihhVar.i(arrayList2);
                                        amgg amggVar = (amgg) aihhVar.build();
                                        aihfVarCreateBuilder8.copyOnWrite();
                                        apox apoxVar = (apox) aihfVarCreateBuilder8.instance;
                                        amggVar.getClass();
                                        apoxVar.m = amggVar;
                                        apoxVar.b |= 32;
                                        aihfVarCreateBuilder7.ck(aihfVarCreateBuilder8);
                                        apoq apoqVar = (apoq) aihfVarCreateBuilder7.build();
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        akuh akuhVar = (akuh) aihfVarCreateBuilder6.instance;
                                        apoqVar.getClass();
                                        akuhVar.c = apoqVar;
                                        akuhVar.b = 49399797;
                                        aihn aihnVarBuild2 = aihfVarCreateBuilder6.build();
                                        aihnVarBuild2.getClass();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        akuj akujVar16 = (akuj) aihfVarCreateBuilder2.instance;
                                        akujVar16.h = (akuh) aihnVarBuild2;
                                        akujVar16.c |= 4;
                                    }
                                    if ((aolgVar.b & 4) != 0) {
                                        apjiVar2 = aolgVar.e;
                                        if (apjiVar2 == null) {
                                            apjiVar2 = apji.a;
                                        }
                                    } else {
                                        apjiVar2 = null;
                                    }
                                    if (apjiVar2 != null) {
                                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                                        apjiVar2.c(aihlVarCheckIsLite4);
                                        apji apjiVar5 = true != apjiVar2.j.n(aihlVarCheckIsLite4.d) ? null : apjiVar2;
                                        if (apjiVar5 != null) {
                                            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
                                            apjiVar5.c(aihlVarCheckIsLite5);
                                            Object objK4 = apjiVar5.j.k(aihlVarCheckIsLite5.d);
                                            Object objC3 = objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4);
                                            objC3.getClass();
                                            apji apjiVar6 = apji.a;
                                            aihh aihhVar2 = (aihh) apjiVar6.createBuilder();
                                            aihl aihlVar = aksl.a;
                                            aihf aihfVarCreateBuilder9 = aksk.a.createBuilder();
                                            aihh aihhVar3 = (aihh) apjiVar6.createBuilder();
                                            aihhVar3.e(akrs.a, (akrn) objC3);
                                            aihfVarCreateBuilder9.copyOnWrite();
                                            aksk akskVar = (aksk) aihfVarCreateBuilder9.instance;
                                            apji apjiVar7 = (apji) aihhVar3.build();
                                            apjiVar7.getClass();
                                            akskVar.c = apjiVar7;
                                            akskVar.b |= 1;
                                            aihhVar2.e(aihlVar, aihfVarCreateBuilder9.build());
                                            aihn aihnVarBuild3 = aihhVar2.build();
                                            aihnVarBuild3.getClass();
                                            apjiVar2 = (apji) aihnVarBuild3;
                                        }
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        akuj akujVar17 = (akuj) aihfVarCreateBuilder2.instance;
                                        akujVar17.i = apjiVar2;
                                        akujVar17.c |= 8;
                                    }
                                }
                                if ((((akuj) aihfVarCreateBuilder2.instance).c & 4) == 0) {
                                    aihf aihfVarCreateBuilder10 = akuh.a.createBuilder();
                                    akea akeaVar = akea.a;
                                    aihfVarCreateBuilder10.copyOnWrite();
                                    akuh akuhVar2 = (akuh) aihfVarCreateBuilder10.instance;
                                    akeaVar.getClass();
                                    akuhVar2.c = akeaVar;
                                    akuhVar2.b = 413221919;
                                    akuh akuhVar3 = (akuh) aihfVarCreateBuilder10.build();
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    akuj akujVar18 = (akuj) aihfVarCreateBuilder2.instance;
                                    akuhVar3.getClass();
                                    akujVar18.h = akuhVar3;
                                    akujVar18.c |= 4;
                                }
                            }
                            akujVar4 = (akuj) aihfVarCreateBuilder2.build();
                        } else {
                            aoln aolnVar2 = aollVar.d;
                            if (aolnVar2 == null) {
                                aolnVar2 = aoln.a;
                            }
                            akujVar4 = aolnVar2.b == 138681066 ? (akuj) aolnVar2.c : akuj.b;
                        }
                        vob vobVar4 = votVarA.b;
                        vobVar4.N(akujVar4, null, false);
                        vorVar4.E(vobVar4, vobVar4.T());
                        vorVar4.l(vobVar4);
                        Optional optionalC = vorVar4.f.c(votVarA);
                        sda sdaVar = new sda(vobVar4, votVarA, 15);
                        if (true == optionalC.isPresent()) {
                            Object obj3 = optionalC.get();
                            ?? r7 = sdaVar.a;
                            Object obj4 = sdaVar.b;
                            vpo.a((ViewGroup) obj3, r7.T());
                            ((vot) obj4).a();
                        }
                    }
                }
                if ((aollVar.b & 64) != 0) {
                    ((Optional) xdiVar2.j).isPresent();
                }
                xir xirVar = xirVarN;
                xdi.f(vobVar3, false);
                xirVar.f(tau.GLOBAL_ENGAGEMENT_PANEL_RESPONSE_RECEIVED);
            }
        });
    }

    public xdi(bog bogVar, hed hedVar, wrv wrvVar, Executor executor, ttm ttmVar, vsq vsqVar, vxe vxeVar, xit xitVar, aaok aaokVar, awmd awmdVar, vxz vxzVar, Optional optional, aunn aunnVar) {
        this.e = new vwt(bogVar.getLifecycle());
        this.h = bogVar;
        this.i = hedVar;
        this.l = wrvVar;
        this.n = executor;
        this.m = ttmVar;
        this.b = vsqVar;
        this.k = vxeVar;
        this.f = xitVar;
        this.j = optional;
        this.g = aaokVar;
        this.a = awmdVar;
        this.c = vxzVar;
        this.d = aunnVar;
    }
}
