package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xmw {
    public final awmd a;
    public final awmd b;
    public final aunn c;
    public final awmd d;
    public final awmd e;
    public final aunn f;
    public final awmd g;
    public final aunn h;
    public final xmv j;
    public xzf k;
    private final Executor n;
    public final avmr i = new avmr();
    public amyf l = amyf.a;
    public final AtomicBoolean m = new AtomicBoolean();

    public xmw(awmd awmdVar, awmd awmdVar2, aunn aunnVar, awmd awmdVar3, Executor executor, awmd awmdVar4, aunn aunnVar2, awmd awmdVar5, aunn aunnVar3, aunn aunnVar4) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = aunnVar;
        this.d = awmdVar3;
        this.n = executor;
        this.e = awmdVar4;
        this.f = aunnVar2;
        this.g = awmdVar5;
        this.h = aunnVar4;
        this.j = new xmv(this, aunnVar3);
    }

    public static void b(aihf aihfVar, xzc xzcVar) {
        xvh xvhVarA;
        if (aihfVar == null || xzcVar == null) {
            return;
        }
        String strW = xzcVar.w();
        if (!TextUtils.isEmpty(strW)) {
            aihf aihfVarCreateBuilder = amyk.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amyk amykVar = (amyk) aihfVarCreateBuilder.instance;
            amykVar.b |= 1;
            amykVar.c = strW;
            amyk amykVar2 = (amyk) aihfVarCreateBuilder.build();
            aihfVar.copyOnWrite();
            amyf amyfVar = (amyf) aihfVar.instance;
            amyf amyfVar2 = amyf.a;
            amykVar2.getClass();
            amyfVar.j = amykVar2;
            amyfVar.b |= 16;
        }
        xve xveVarI = xzcVar.i();
        if (xveVarI == null || (xvhVarA = xveVarI.a()) == null) {
            return;
        }
        String str = xvhVarA.b;
        if (str.isEmpty()) {
            return;
        }
        aihfVar.copyOnWrite();
        amyf amyfVar3 = (amyf) aihfVar.instance;
        amyf amyfVar4 = amyf.a;
        amyfVar3.b |= 8;
        amyfVar3.i = str;
    }

    public final void a() {
        if (this.m.compareAndSet(false, true)) {
            this.n.execute(afwl.i(new Runnable() { // from class: xmt
                /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
                @Override // java.lang.Runnable
                public final void run() {
                    xvr xvrVarJ;
                    String strC;
                    xvr xvrVarC;
                    String str;
                    xvr xvrVarC2;
                    String str2;
                    xvr xvrVarC3;
                    yco ycoVar;
                    yco ycoVar2;
                    xmw xmwVar = this.a;
                    xmwVar.m.set(false);
                    List<dii> listL = ((abxv) xmwVar.d.io()).l(true);
                    taq.d();
                    ydu yduVar = (ydu) xmwVar.g.io();
                    dij.c();
                    dii diiVarF = dij.a().f();
                    aihf aihfVarCreateBuilder = amyf.a.createBuilder();
                    for (dii diiVar : listL) {
                        String strA = xrx.a(diiVar);
                        aihf aihfVarCreateBuilder2 = amyl.a.createBuilder();
                        String str3 = diiVar.e;
                        aihfVarCreateBuilder2.copyOnWrite();
                        amyl amylVar = (amyl) aihfVarCreateBuilder2.instance;
                        str3.getClass();
                        amylVar.b |= 1;
                        amylVar.c = str3;
                        aihfVarCreateBuilder2.copyOnWrite();
                        amyl amylVar2 = (amyl) aihfVarCreateBuilder2.instance;
                        strA.getClass();
                        amylVar2.b |= 8;
                        amylVar2.f = strA;
                        String strB = null;
                        if (!diiVar.o() || (ycoVar2 = ((ycp) xmwVar.e.io()).e) == null || ycoVar2.C() == null) {
                            Bundle bundle = diiVar.s;
                            if (bundle == null || (xvrVarC = ((yar) xmwVar.a.io()).c(bundle)) == null) {
                                strC = null;
                            } else if ((xvrVarC instanceof xvn) && (str = ((xvn) xvrVarC).f) != null) {
                                strC = str;
                            } else if (xvrVarC instanceof xvj) {
                                strC = ((xvj) xvrVarC).a.e;
                            } else {
                                strC = null;
                            }
                        } else {
                            strC = ycoVar2.C();
                        }
                        if (strC != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amyl amylVar3 = (amyl) aihfVarCreateBuilder2.instance;
                            amylVar3.b |= 2;
                            amylVar3.d = strC;
                        }
                        if (!diiVar.o() || (ycoVar = ((ycp) xmwVar.e.io()).e) == null || ycoVar.B() == null) {
                            Bundle bundle2 = diiVar.s;
                            if (bundle2 != null && (xvrVarC2 = ((yar) xmwVar.a.io()).c(bundle2)) != null && (xvrVarC2 instanceof xvn) && (str2 = ((xvn) xvrVarC2).e) != null) {
                                strB = str2;
                            }
                        } else {
                            strB = ycoVar.B();
                        }
                        if (strB != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amyl amylVar4 = (amyl) aihfVarCreateBuilder2.instance;
                            amylVar4.b |= 4;
                            amylVar4.e = strB;
                        }
                        aunn aunnVar = xmwVar.f;
                        if (xrx.k(diiVar) == null && (xvrVarC3 = ((yar) xmwVar.a.io()).c(diiVar.s)) != null) {
                            if (xvrVarC3 instanceof xvk) {
                                String str4 = xvrVarC3.b().b;
                                aihfVarCreateBuilder2.copyOnWrite();
                                amyl amylVar5 = (amyl) aihfVarCreateBuilder2.instance;
                                amylVar5.b |= 16;
                                amylVar5.g = str4;
                            } else if ((xvrVarC3 instanceof xvn) && xvrVarC3.b() != null) {
                                String str5 = xvrVarC3.b().b;
                                aihfVarCreateBuilder2.copyOnWrite();
                                amyl amylVar6 = (amyl) aihfVarCreateBuilder2.instance;
                                amylVar6.b |= 16;
                                amylVar6.g = str5;
                            }
                        }
                        boolean zM = xrx.m(diiVar);
                        aihfVarCreateBuilder2.copyOnWrite();
                        amyl amylVar7 = (amyl) aihfVarCreateBuilder2.instance;
                        amylVar7.b |= 32;
                        amylVar7.h = zM;
                        int iA = yduVar.a(strA);
                        if (iA > 0) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amyl amylVar8 = (amyl) aihfVarCreateBuilder2.instance;
                            amylVar8.b |= 64;
                            amylVar8.i = iA;
                        }
                        yco ycoVar3 = ((ycp) xmwVar.e.io()).e;
                        boolean zD = xrx.d(diiVar, diiVarF);
                        if (ycoVar3 != null && (zD || diiVar.o())) {
                            if (ycoVar3.k() != null) {
                                String str6 = ycoVar3.k().b;
                                aihfVarCreateBuilder2.copyOnWrite();
                                amyl amylVar9 = (amyl) aihfVarCreateBuilder2.instance;
                                amylVar9.b |= 16;
                                amylVar9.g = str6;
                            }
                            amyl amylVar10 = (amyl) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            amyf amyfVar = (amyf) aihfVarCreateBuilder.instance;
                            amylVar10.getClass();
                            amyfVar.d = amylVar10;
                            amyfVar.b |= 1;
                            xmw.b(aihfVarCreateBuilder, ycoVar3);
                        }
                        amyl amylVar11 = (amyl) aihfVarCreateBuilder2.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        amyf amyfVar2 = (amyf) aihfVarCreateBuilder.instance;
                        amylVar11.getClass();
                        aiie aiieVar = amyfVar2.c;
                        if (!aiieVar.c()) {
                            amyfVar2.c = aihn.mutableCopy(aiieVar);
                        }
                        amyfVar2.c.add(amylVar11);
                    }
                    awmd awmdVar = xmwVar.e;
                    yco ycoVar4 = ((ycp) awmdVar.io()).e;
                    aunn aunnVar2 = xmwVar.h;
                    if (((vxz) aunnVar2.io()).l(241, 45819521L, false) && ycoVar4 != null && (((amyf) aihfVarCreateBuilder.instance).b & 1) == 0 && (xvrVarJ = ycoVar4.j()) != null) {
                        aihf aihfVarCreateBuilder3 = amyl.a.createBuilder();
                        if (xvrVarJ.c() != null) {
                            String strC2 = xvrVarJ.c();
                            aihfVarCreateBuilder3.copyOnWrite();
                            amyl amylVar12 = (amyl) aihfVarCreateBuilder3.instance;
                            strC2.getClass();
                            amylVar12.b |= 1;
                            amylVar12.c = strC2;
                        }
                        if (ycoVar4.k() != null) {
                            String str7 = ycoVar4.k().b;
                            aihfVarCreateBuilder3.copyOnWrite();
                            amyl amylVar13 = (amyl) aihfVarCreateBuilder3.instance;
                            amylVar13.b |= 16;
                            amylVar13.g = str7;
                        }
                        String strC3 = ycoVar4.C();
                        if (strC3 != null) {
                            aihfVarCreateBuilder3.copyOnWrite();
                            amyl amylVar14 = (amyl) aihfVarCreateBuilder3.instance;
                            amylVar14.b |= 2;
                            amylVar14.d = strC3;
                        }
                        String strB2 = ycoVar4.B();
                        if (strB2 != null) {
                            aihfVarCreateBuilder3.copyOnWrite();
                            amyl amylVar15 = (amyl) aihfVarCreateBuilder3.instance;
                            amylVar15.b |= 4;
                            amylVar15.e = strB2;
                        }
                        amyl amylVar16 = (amyl) aihfVarCreateBuilder3.build();
                        aihfVarCreateBuilder.copyOnWrite();
                        amyf amyfVar3 = (amyf) aihfVarCreateBuilder.instance;
                        amylVar16.getClass();
                        amyfVar3.d = amylVar16;
                        amyfVar3.b |= 1;
                        xmw.b(aihfVarCreateBuilder, ycoVar4);
                    }
                    if (((vxz) aunnVar2.io()).l(218, 45779078L, false)) {
                        xmw.b(aihfVarCreateBuilder, ((ycp) awmdVar.io()).e);
                    }
                    if (((vxz) aunnVar2.io()).l(98, 45461552L, false)) {
                        yco ycoVar5 = ((ycp) awmdVar.io()).e;
                        if (aihfVarCreateBuilder != null && ycoVar5 != null) {
                            String strA2 = ycoVar5.A();
                            if (!TextUtils.isEmpty(strA2)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                amyf amyfVar4 = (amyf) aihfVarCreateBuilder.instance;
                                amyfVar4.b |= 32;
                                amyfVar4.k = strA2;
                            }
                        }
                    }
                    int iB = yduVar.b();
                    if (iB > 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        amyf amyfVar5 = (amyf) aihfVarCreateBuilder.instance;
                        amyfVar5.b |= 4;
                        amyfVar5.f = iB;
                    }
                    long jD = yduVar.d();
                    if (jD > 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        amyf amyfVar6 = (amyf) aihfVarCreateBuilder.instance;
                        amyfVar6.b |= 2;
                        amyfVar6.e = (int) (jD / 1000);
                    }
                    List listF = yduVar.f();
                    if (!listF.isEmpty()) {
                        aihfVarCreateBuilder.bB(listF);
                    }
                    aihfVarCreateBuilder.bA(yduVar.e());
                    xmwVar.l = (amyf) aihfVarCreateBuilder.build();
                }
            }));
        }
    }
}
