package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rug implements rsq, abif {
    public final abzo a;
    private final awmd b;
    private final awmd c;
    private final vyo d;
    private final AtomicReference e = new AtomicReference();

    public rug(awmd awmdVar, abzo abzoVar, awmd awmdVar2, vyo vyoVar) {
        this.b = awmdVar;
        this.a = abzoVar;
        this.c = awmdVar2;
        this.d = vyoVar;
    }

    public final synchronized void a() {
        rsr rsrVar = (rsr) this.c.io();
        rsr rsrVar2 = (rsr) this.e.getAndSet(rsrVar);
        if (!Objects.equals(rsrVar2, rsrVar)) {
            if (rsrVar2 != null) {
                rsrVar2.h(this);
            }
            rsrVar.e(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v31, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.abif
    public final auzk b(String str, String str2) {
        boolean zEquals;
        boolean z;
        String strB;
        acjb acjbVarA;
        ruf rufVar;
        PowerManager powerManager;
        acjd acjdVarX;
        tld tldVarJ;
        tld tldVarJ2;
        if (TextUtils.isEmpty(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("fromCpn is empty");
            aihf aihfVarCreateBuilder = aosi.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar = (aosi) aihfVarCreateBuilder.instance;
            aosiVar.c = acfz.bu(104);
            aosiVar.b |= 1;
            String message = illegalArgumentException.getMessage() != null ? illegalArgumentException.getMessage() : "Unknown exception";
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar2 = (aosi) aihfVarCreateBuilder.instance;
            message.getClass();
            aosiVar2.b |= 2;
            aosiVar2.d = message;
            return aajc.i((aosi) aihfVarCreateBuilder.build());
        }
        vyo vyoVar = this.d;
        if (taq.ao(vyoVar) || taq.an(vyoVar)) {
            return ((abif) this.b.io()).b(str, str2);
        }
        abzo abzoVar = this.a;
        try {
            ?? r0 = abzoVar.g;
            String strD = ((rsr) r0.io()).d();
            String strK = abzoVar.k(str);
            if (strK == null) {
                strK = abzoVar.k(str2);
            }
            acfw acfwVarB = str2 != null ? ((rsr) r0.io()).b(str2) : null;
            if (acfwVarB == null && strK != null) {
                acfwVarB = ((rsr) r0.io()).b(strK);
            }
            if (acfwVarB == null && strD != null) {
                acfwVarB = ((rsr) r0.io()).b(strD);
            }
            if (acfwVarB != null && acfwVarB.e() != null) {
                strD = acfwVarB.e();
            } else if (strD == null) {
                strD = strK;
            }
            String str3 = strD != null ? strD : str2;
            String strM = abzoVar.m(str, str3);
            if (strM != null && acfwVarB != null) {
                ((xsc) abzoVar.e.io()).ab(acfwVarB, strM);
            }
            abzoVar.y(str, str3);
            boolean z2 = false;
            if (TextUtils.isEmpty(str2)) {
                zEquals = true;
            } else if (strD != null) {
                zEquals = TextUtils.equals(str2, strD);
            } else if (abzoVar.C(str2) || abzoVar.J(str3, str2) != null) {
                zEquals = false;
            } else {
                zEquals = true;
            }
            if (str2 != null && (abzoVar.C(str2) || ((tldVarJ2 = abzoVar.J(str3, str2)) != null && !tldVarJ2.b.contains(str2)))) {
                if (((acm) abzoVar.f.io()).f() || abzoVar.D(str3)) {
                    abzoVar.v(str2, str3);
                    abzoVar.r(str2);
                } else if (acfwVarB != null) {
                    abzoVar.A(acfwVarB, Collections.singletonList(str2), str3);
                } else {
                    abzoVar.r(str2);
                }
                return new auzk(true, (aosi) null);
            }
            if (((acm) abzoVar.f.io()).f() || abzoVar.D(str3)) {
                rtz rtzVar = (rtz) abzoVar.c.get(abzo.l(str3));
                List list = rtzVar != null ? rtzVar.h : null;
                if (str2 != null && list != null) {
                    for (int i = 0; i < ((agpi) list).d; i++) {
                        abic abicVar = (abic) list.get(i);
                        if (str2.equals(abicVar.b) && abicVar.a != null) {
                            abzoVar.u(list, i, new rtv(abzoVar, str3));
                            return new auzk(true, (aosi) null);
                        }
                    }
                }
                abzoVar.o(str3);
                abzoVar.x(str3);
                z = true;
            } else {
                if (zEquals) {
                    abzoVar.o(str3);
                }
                z = false;
            }
            if (acfwVarB != null) {
                acjb acjbVarD = acfwVarB.d();
                if (acjbVarD != null) {
                    acjd acjdVarC = acjbVarD.c(str);
                    if (acjdVarC != null || (tldVarJ = abzoVar.J(str3, str)) == null) {
                        strB = str;
                        break;
                    }
                    Iterator it = tldVarJ.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strB = str;
                            break;
                        }
                        strB = (String) it.next();
                        acjd acjdVarC2 = acjbVarD.c(strB);
                        if (acjdVarC2 != null) {
                            acjdVarC = acjdVarC2;
                            break;
                        }
                    }
                    if (acjdVarC == null && (acjdVarX = acjbVarD.x()) != null && acjdVarX.b() != null && !TextUtils.equals(acjdVarX.b(), str3) && (acfwVarB.e() == null || !TextUtils.equals(acjdVarX.b(), acfwVarB.e()))) {
                        strB = acjdVarX.b();
                        acjdVarC = acjdVarX;
                    }
                    if (acjdVarC == null && zEquals && str3 != null) {
                        acjd acjdVarC3 = acjbVarD.c(str3);
                        if (acjdVarC3 instanceof aciw) {
                            Iterator it2 = ((aciw) acjdVarC3).a.values().iterator();
                            while (it2.hasNext()) {
                                agqs agqsVarListIterator = ((acjb) it2.next()).E().listIterator(0);
                                while (agqsVarListIterator.hasNext()) {
                                    acjd acjdVar = (acjd) agqsVarListIterator.next();
                                    if (acjdVar instanceof aciw) {
                                        strB = acjdVar.b();
                                        acjdVarC = acjdVar;
                                        break;
                                    }
                                }
                                if (acjdVarC != null) {
                                    break;
                                }
                            }
                        }
                    }
                    if ((acjdVarC instanceof aciw) && ((aciw) acjdVarC).n && taq.bg((vxu) abzoVar.i)) {
                        z2 = true;
                    }
                    if (zEquals) {
                        ?? r15 = abzoVar.c;
                        rtz rtzVar2 = (rtz) r15.get(abzo.l(str3));
                        if (rtzVar2 != null) {
                            Map map = rtzVar2.d;
                            tld tldVar = (tld) map.get(str);
                            if (tldVar != null) {
                                Iterator it3 = tldVar.a.iterator();
                                while (it3.hasNext()) {
                                    map.remove((String) it3.next());
                                }
                            }
                        }
                        rtz rtzVar3 = (rtz) r15.get(abzo.l(str3));
                        if (rtzVar3 != null) {
                            rtzVar3.a.clear();
                        }
                        if (acjdVarC == null && z && (((rufVar = (ruf) abzoVar.a.io()) != null && taq.am(rufVar.d) && rufVar.f) || ((powerManager = (PowerManager) ((Context) abzoVar.h).getSystemService("power")) != null && !powerManager.isInteractive()))) {
                            return new auzk(true, (aosi) null);
                        }
                        if (!z2) {
                            List listAd = Collections.EMPTY_LIST;
                            if (acjdVarC != null && acjdVarC.a() != null) {
                                listAd = acjbVarD.ad(strB);
                            }
                            if (listAd.isEmpty()) {
                                acjbVarD.d(strB);
                                acjbVarD.K(strB);
                            } else {
                                Iterator it4 = listAd.iterator();
                                while (it4.hasNext()) {
                                    acjbVarD.K((String) it4.next());
                                }
                            }
                            acjbVarD.e(true, acjc.SKIP);
                        } else if (str3 != null) {
                            acjbVarD.O(str3, true, acjc.SKIP);
                        } else {
                            acjbVarD.e(true, acjc.SKIP);
                        }
                    } else {
                        acjd acjdVarC4 = acjbVarD.c(str2);
                        if (acjdVarC != null && (acjbVarA = acjdVarC.a()) != null && (acjdVarC4 instanceof aciw)) {
                            aciw aciwVar = (aciw) acjdVarC4;
                            if (acjdVarC4.a() == acjbVarA) {
                                acjbVarA.M(aciwVar);
                            }
                        }
                        if (!z2) {
                            acjbVarD.d(strB);
                            acjbVarD.K(strB);
                        }
                        acjbVarD.O(str2, true, acjc.SKIP);
                    }
                } else {
                    sdo.k(acfwVarB, true, false, true, str);
                }
            }
            if (!z && zEquals) {
                abzoVar.x(str3);
            }
            return new auzk(true, (aosi) null);
        } catch (Exception e) {
            return abzo.G(202, e);
        }
    }

    @Override // defpackage.abif
    public final auzk c(List list, wjj wjjVar, String str) {
        slm slmVar;
        acfw acfwVarB = ((rsr) this.c.io()).b(str);
        long jC = wjjVar.c();
        if (jC == 0) {
            slmVar = slm.PRE_ROLL;
        } else {
            slmVar = (acfwVarB == null || jC < acfwVarB.b()) ? slm.MID_ROLL : slm.POST_ROLL;
        }
        return s(list, wjjVar, str, slmVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) throws Throwable {
        if (str != null) {
            abzo abzoVar = this.a;
            if (abobVar.a(abob.c, abob.d, abob.g, abob.h)) {
                abzoVar.s(str, acfwVar);
                return;
            }
            if (abobVar == abob.j) {
                abzoVar.q(str);
                return;
            }
            if (abobVar == abob.a) {
                for (String str3 : new HashSet(abzoVar.c.keySet())) {
                    if (!str3.equals(str)) {
                        abzoVar.q(str3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    public final auzk s(List list, wjj wjjVar, String str, slm slmVar) {
        if (list.isEmpty()) {
            aihf aihfVarCreateBuilder = aosi.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar = (aosi) aihfVarCreateBuilder.instance;
            aosiVar.c = acfz.bu(104);
            aosiVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aosi aosiVar2 = (aosi) aihfVarCreateBuilder.instance;
            aosiVar2.b |= 2;
            aosiVar2.d = "Empty wrappers (adCpns not found) for CISA scheduling";
            return aajc.i((aosi) aihfVarCreateBuilder.build());
        }
        a();
        slm slmVar2 = slm.PRE_ROLL;
        boolean zEquals = slmVar.equals(slmVar2);
        slm slmVar3 = slm.MID_ROLL;
        boolean zEquals2 = slmVar.equals(slmVar3);
        if ((zEquals && taq.ao(this.d)) || (zEquals2 && taq.an(this.d))) {
            return ((abif) this.b.io()).c(list, wjjVar, str);
        }
        abzo abzoVar = this.a;
        try {
            ?? r6 = abzoVar.g;
            acfw acfwVarB = ((rsr) r6.io()).b(str);
            if (acfwVarB == null) {
                return abzo.H(103, "Null content video playback");
            }
            wjf wjfVarA = ((rsr) r6.io()).a(str);
            if (wjfVarA == null) {
                return abzo.H(103, "Null content player response");
            }
            boolean zV = wjfVarA.V();
            boolean zP = wjfVarA.P();
            boolean zEquals3 = slmVar.equals(slmVar2);
            boolean zEquals4 = slmVar.equals(slmVar3);
            boolean zEquals5 = slmVar.equals(slm.POST_ROLL);
            if (taq.at((vyo) abzoVar.d, zV, zP, zEquals3, zEquals4, zEquals5, ((agpi) list).d == 1)) {
                agqs agqsVarListIterator = ((agke) list).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    if (((abic) agqsVarListIterator.next()).a != null) {
                        if (abzo.E(acfwVarB) && (!abzoVar.D(str) || ((acm) abzoVar.f.io()).f())) {
                            break;
                            break;
                        }
                        abzoVar.j(str).c.add(new rua(list, wjjVar, zEquals3, zEquals5));
                        return new auzk(true, (aosi) null);
                    }
                }
                return abzoVar.I(list, wjjVar, acfwVarB, zEquals3, zEquals5, str);
            }
            if (zEquals3) {
                abzoVar.z(list, acfwVarB, str);
                return new auzk(true, (aosi) null);
            }
            long jC = wjjVar.c();
            long jB = wjjVar.b();
            if (true == zEquals5) {
                jC = 9223372036854775806L;
            }
            if (true == zEquals5) {
                jB = 9223372036854775806L;
            }
            String strConcat = "cisa_shim_interstitial_cue_range_".concat(((abic) list.get(0)).b);
            agqs agqsVarListIterator2 = ((agke) list).listIterator(0);
            while (agqsVarListIterator2.hasNext()) {
                abzoVar.w(((abic) agqsVarListIterator2.next()).b, strConcat, str);
            }
            ((xsc) abzoVar.e.io()).ac(new rtw(abzoVar, list, str, acfwVarB, strConcat, 0), acfwVarB, jC, jB, 2, 1, strConcat);
            return new auzk(true, (aosi) null);
        } catch (Exception e) {
            return abzo.G(2, e);
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
