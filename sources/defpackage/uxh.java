package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxh extends Handler {
    public final zwb a;
    public final Executor b;
    public final zvl c;
    public final awku d = new awku();
    public final awku e = new awku();
    public final awku f = new awku();
    public final awku g = new awku();
    public final awkv h;
    public final AtomicBoolean i;
    public final aaok j;
    public final xpl k;
    public final xsc l;

    public uxh(xpl xplVar, zwb zwbVar, Executor executor, xsc xscVar, aaok aaokVar, zvl zvlVar) {
        awkv awkvVarAI = new awku().aI();
        this.h = awkvVarAI;
        this.i = new AtomicBoolean(false);
        this.k = xplVar;
        this.a = zwbVar;
        this.b = executor;
        this.l = xscVar;
        this.j = aaokVar;
        this.c = zvlVar;
        awkvVarAI.H(new uxe(1)).x(new sqj(6)).H(new uxe(0)).ax().kq(1).ag();
    }

    public final void a(final qcb qcbVar, List list, final uxj uxjVar) {
        final aihf aihfVarCreateBuilder = alqq.b.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alqq alqqVar = (alqq) aihfVarCreateBuilder.instance;
        alqqVar.g = 0;
        alqqVar.c |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        alqq alqqVar2 = (alqq) aihfVarCreateBuilder.instance;
        aihv aihvVar = alqqVar2.f;
        if (!aihvVar.c()) {
            alqqVar2.f = aihn.mutableCopy(aihvVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alqqVar2.f.h(((arfs) it.next()).e);
        }
        final boolean zContains = list.contains(arfs.SHORTS_CREATION_PACKAGE_CAMERA);
        final boolean z = list.contains(arfs.SHORTS_CREATION_PACKAGE_EDIT) || list.contains(arfs.SHORTS_CREATION_PACKAGE_EDIT_THUMBNAIL);
        this.b.execute(afwl.i(new Runnable() { // from class: uxg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, zwh] */
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr;
                aihf aihfVarCreateBuilder2 = ardi.a.createBuilder();
                uyv uyvVar = (uyv) qcbVar.a;
                uxt uxtVarA = uyvVar.a();
                taq.c();
                uxtVarA.b();
                synchronized (uxtVarA.f) {
                    strArr = (String[]) uxtVarA.g.toArray(new String[0]);
                }
                List listAsList = Arrays.asList(strArr);
                aihfVarCreateBuilder2.copyOnWrite();
                ardi ardiVar = (ardi) aihfVarCreateBuilder2.instance;
                aiie aiieVar = ardiVar.c;
                if (!aiieVar.c()) {
                    ardiVar.c = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(listAsList, ardiVar.c);
                vbz vbzVarA = uyvVar.f.a();
                String strA = vbzVarA.a();
                String strC = vbzVarA.c();
                aihf aihfVarCreateBuilder3 = ardg.a.createBuilder();
                if (strA != null) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    ardg ardgVar = (ardg) aihfVarCreateBuilder3.instance;
                    ardgVar.b |= 1;
                    ardgVar.c = strA;
                }
                if (strC != null) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    ardg ardgVar2 = (ardg) aihfVarCreateBuilder3.instance;
                    ardgVar2.b |= 2;
                    ardgVar2.d = strC;
                }
                aihf aihfVarCreateBuilder4 = ardh.a.createBuilder();
                try {
                    String str = Build.DEVICE;
                    aihfVarCreateBuilder4.copyOnWrite();
                    ardh ardhVar = (ardh) aihfVarCreateBuilder4.instance;
                    str.getClass();
                    ardhVar.b |= 2;
                    ardhVar.d = str;
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) uyv.a.c()).j(e)).k("com/google/android/libraries/youtube/creation/effects/innertube/deprecated/KazooEffectsLoader", "getVideoEffectsContext", (char) 186, "KazooEffectsLoader.java")).t("Failed to set VideoEffectsContext.Device.device: ");
                }
                aihf aihfVar = aihfVarCreateBuilder;
                aihfVarCreateBuilder4.copyOnWrite();
                ardh ardhVar2 = (ardh) aihfVarCreateBuilder4.instance;
                ardg ardgVar3 = (ardg) aihfVarCreateBuilder3.build();
                ardgVar3.getClass();
                ardhVar2.c = ardgVar3;
                ardhVar2.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                ardi ardiVar2 = (ardi) aihfVarCreateBuilder2.instance;
                ardh ardhVar3 = (ardh) aihfVarCreateBuilder4.build();
                ardhVar3.getClass();
                ardiVar2.d = ardhVar3;
                ardiVar2.b |= 1;
                ardi ardiVar3 = (ardi) aihfVarCreateBuilder2.build();
                if (ardiVar3 != null) {
                    aihfVar.copyOnWrite();
                    alqq alqqVar3 = (alqq) aihfVar.instance;
                    aihw aihwVar = alqq.a;
                    alqqVar3.e = ardiVar3;
                    alqqVar3.c |= 2;
                } else {
                    aihfVar.copyOnWrite();
                    alqq alqqVar4 = (alqq) aihfVar.instance;
                    aihw aihwVar2 = alqq.a;
                    alqqVar4.e = null;
                    alqqVar4.c &= -3;
                }
                final uxh uxhVar = this.a;
                zwa zwaVarE = uxhVar.a.e();
                xpl xplVar = uxhVar.k;
                aapz aapzVarB = ((wub) aguu.aw((Context) xplVar.a, wub.class, ((syn) xplVar.b).m(zwaVarE))).B();
                aaok aaokVar = uxhVar.j;
                boolean z2 = !(aaokVar.E() && uxhVar.i.compareAndSet(true, false)) && (aaokVar.P() || aaokVar.R());
                wtz wtzVar = new wtz(aapzVarB.b, aapzVarB.d.hw(), aihfVar, vys.a((vxu) aapzVarB.e), z2);
                wtzVar.m();
                if (z2) {
                    wtzVar.A = 3;
                }
                final uxj uxjVar2 = uxjVar;
                final boolean z3 = z;
                final boolean z4 = zContains;
                taf.i(((wnh) aapzVarB.f).b(wtzVar, aapzVarB.c, null), uxhVar.b, new gou(uxhVar, uxjVar2, 18), new tae() { // from class: uxf
                    /* JADX WARN: Code duplicated, block: B:90:0x016e  */
                    @Override // defpackage.tae, defpackage.twi
                    public final void a(Object obj) {
                        int i;
                        agke agkeVar;
                        ardq ardqVar;
                        apwm apwmVar;
                        apji apjiVar;
                        akgx akgxVar;
                        aqhu aqhuVar;
                        akgs akgsVar;
                        apwr apwrVar;
                        apvw apvwVar;
                        aiie aiieVar2;
                        apji apjiVar2;
                        agke agkeVarN;
                        apwm apwmVar2;
                        akgs akgsVar2;
                        ardq ardqVar2;
                        akgx akgxVar2;
                        ardq ardqVar3;
                        akgs akgsVar3;
                        uxh uxhVar2 = uxhVar;
                        alqr alqrVar = (alqr) obj;
                        agke agkeVar2 = agpi.a;
                        if (alqrVar != null) {
                            if (!z4 || (alqrVar.b & 2) == 0) {
                                i = 8;
                                agkeVarN = agkeVar2;
                                aqhuVar = null;
                                apwmVar2 = null;
                                apwrVar = null;
                                apvwVar = null;
                                aiieVar2 = null;
                                apjiVar2 = null;
                            } else {
                                apji apjiVar3 = alqrVar.d;
                                if (apjiVar3 == null) {
                                    apjiVar3 = apji.a;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(apvp.a);
                                apjiVar3.c(aihlVarCheckIsLite);
                                Object objK = apjiVar3.j.k(aihlVarCheckIsLite.d);
                                apvo apvoVar = (apvo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                                if ((apvoVar.b & 1) != 0) {
                                    aqhuVar = apvoVar.c;
                                    if (aqhuVar == null) {
                                        aqhuVar = aqhu.a;
                                    }
                                } else {
                                    aqhuVar = null;
                                }
                                if ((apvoVar.b & 2) != 0) {
                                    apji apjiVar4 = apvoVar.d;
                                    if (apjiVar4 == null) {
                                        apjiVar4 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apwn.a);
                                    apjiVar4.c(aihlVarCheckIsLite2);
                                    Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite2.d);
                                    apwmVar2 = (apwm) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                                } else {
                                    apwmVar2 = null;
                                }
                                if ((apvoVar.b & 4) != 0) {
                                    apji apjiVar5 = apvoVar.e;
                                    if (apjiVar5 == null) {
                                        apjiVar5 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apws.a);
                                    apjiVar5.c(aihlVarCheckIsLite3);
                                    Object objK3 = apjiVar5.j.k(aihlVarCheckIsLite3.d);
                                    apwrVar = (apwr) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
                                } else {
                                    apwrVar = null;
                                }
                                if ((apvoVar.b & SemanticState.Focused) != 0) {
                                    awku awkuVar = uxhVar2.g;
                                    apji apjiVar6 = apvoVar.k;
                                    if (apjiVar6 == null) {
                                        apjiVar6 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                                    apjiVar6.c(aihlVarCheckIsLite4);
                                    Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite4.d);
                                    awkuVar.kk((ajnf) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4)));
                                }
                                if (uxhVar2.j.E() && (apvoVar.b & SemanticState.Hidden) != 0) {
                                    uxhVar2.i.set(true);
                                }
                                apji apjiVar7 = apvoVar.h;
                                if (apjiVar7 == null) {
                                    apjiVar7 = apji.a;
                                }
                                aihl aihlVar = apvw.b;
                                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
                                apjiVar7.c(aihlVarCheckIsLite5);
                                if (apjiVar7.j.n(aihlVarCheckIsLite5.d)) {
                                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
                                    apjiVar7.c(aihlVarCheckIsLite6);
                                    Object objK5 = apjiVar7.j.k(aihlVarCheckIsLite6.d);
                                    apvwVar = (apvw) (objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5));
                                } else {
                                    apvwVar = null;
                                }
                                agkeVarN = agke.n(apvoVar.f);
                                aiieVar2 = alqrVar.g;
                                int i2 = apvoVar.b;
                                if ((i2 & 8) != 0) {
                                    apjiVar2 = apvoVar.g;
                                    if (apjiVar2 == null) {
                                        apjiVar2 = apji.a;
                                    }
                                } else {
                                    apjiVar2 = null;
                                }
                                if ((i2 & 32) == 0) {
                                    i = 8;
                                } else {
                                    apji apjiVar8 = apvoVar.i;
                                    if (apjiVar8 == null) {
                                        apjiVar8 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(akrs.a);
                                    apjiVar8.c(aihlVarCheckIsLite7);
                                    if (apjiVar8.j.n(aihlVarCheckIsLite7.d)) {
                                        awku awkuVar2 = uxhVar2.e;
                                        apji apjiVar9 = apvoVar.i;
                                        if (apjiVar9 == null) {
                                            apjiVar9 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(akrs.a);
                                        apjiVar9.c(aihlVarCheckIsLite8);
                                        i = 8;
                                        Object objK6 = apjiVar9.j.k(aihlVarCheckIsLite8.d);
                                        awkuVar2.kk((akrn) (objK6 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK6)));
                                    } else {
                                        i = 8;
                                    }
                                }
                                if ((apvoVar.b & 64) != 0) {
                                    apji apjiVar10 = apvoVar.j;
                                    if (apjiVar10 == null) {
                                        apjiVar10 = apji.a;
                                    }
                                    aihl aihlVar2 = apwq.a;
                                    aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar2);
                                    apjiVar10.c(aihlVarCheckIsLite9);
                                    if (apjiVar10.j.n(aihlVarCheckIsLite9.d)) {
                                        awku awkuVar3 = uxhVar2.f;
                                        apji apjiVar11 = apvoVar.j;
                                        if (apjiVar11 == null) {
                                            apjiVar11 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar2);
                                        apjiVar11.c(aihlVarCheckIsLite10);
                                        Object objK7 = apjiVar11.j.k(aihlVarCheckIsLite10.d);
                                        awkuVar3.kk((apwp) (objK7 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK7)));
                                    }
                                }
                            }
                            if (!z3 || (alqrVar.b & 4) == 0) {
                                akgsVar2 = null;
                                ardqVar2 = null;
                                apjiVar = null;
                                akgxVar2 = null;
                            } else {
                                apji apjiVar12 = alqrVar.e;
                                if (apjiVar12 == null) {
                                    apjiVar12 = apji.a;
                                }
                                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apwl.a);
                                apjiVar12.c(aihlVarCheckIsLite11);
                                Object objK8 = apjiVar12.j.k(aihlVarCheckIsLite11.d);
                                apwk apwkVar = (apwk) (objK8 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK8));
                                if ((apwkVar.b & 1) != 0) {
                                    ardqVar3 = apwkVar.c;
                                    if (ardqVar3 == null) {
                                        ardqVar3 = ardq.a;
                                    }
                                } else {
                                    ardqVar3 = null;
                                }
                                agke agkeVarN2 = agke.n(apwkVar.d);
                                if ((apwkVar.b & 2) != 0) {
                                    apjiVar = apwkVar.e;
                                    if (apjiVar == null) {
                                        apjiVar = apji.a;
                                    }
                                } else {
                                    apjiVar = null;
                                }
                                aaok aaokVar2 = uxhVar2.j;
                                if (!aaokVar2.I() || (apwkVar.b & 4) == 0) {
                                    akgxVar2 = null;
                                } else {
                                    apji apjiVar13 = apwkVar.f;
                                    if (apjiVar13 == null) {
                                        apjiVar13 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(akgy.a);
                                    apjiVar13.c(aihlVarCheckIsLite12);
                                    Object objK9 = apjiVar13.j.k(aihlVarCheckIsLite12.d);
                                    akgxVar2 = (akgx) (objK9 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK9));
                                }
                                if (!aaokVar2.I() || (apwkVar.b & 8) == 0) {
                                    akgsVar3 = null;
                                } else {
                                    apji apjiVar14 = apwkVar.g;
                                    if (apjiVar14 == null) {
                                        apjiVar14 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite13 = aihn.checkIsLite(akgt.a);
                                    apjiVar14.c(aihlVarCheckIsLite13);
                                    Object objK10 = apjiVar14.j.k(aihlVarCheckIsLite13.d);
                                    akgsVar3 = (akgs) (objK10 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK10));
                                }
                                if (aaokVar2.O() && (apwkVar.b & 16) != 0) {
                                    apji apjiVar15 = apwkVar.h;
                                    if (apjiVar15 == null) {
                                        apjiVar15 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite14 = aihn.checkIsLite(akrs.a);
                                    apjiVar15.c(aihlVarCheckIsLite14);
                                    if (apjiVar15.j.n(aihlVarCheckIsLite14.d)) {
                                        apji apjiVar16 = apwkVar.h;
                                        if (apjiVar16 == null) {
                                            apjiVar16 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite15 = aihn.checkIsLite(akrs.a);
                                        apjiVar16.c(aihlVarCheckIsLite15);
                                        Object objK11 = apjiVar16.j.k(aihlVarCheckIsLite15.d);
                                    }
                                }
                                if ((apwkVar.b & 32) != 0 && apwkVar.i == null) {
                                    ajwo ajwoVar = ajwo.a;
                                }
                                akgsVar2 = akgsVar3;
                                agkeVar2 = agkeVarN2;
                                ardqVar2 = ardqVar3;
                            }
                            for (apji apjiVar17 : alqrVar.h) {
                                agke agkeVar3 = agkeVar2;
                                aihl aihlVarCheckIsLite16 = aihn.checkIsLite(aqog.a);
                                apjiVar17.c(aihlVarCheckIsLite16);
                                akgs akgsVar4 = akgsVar2;
                                if (apjiVar17.j.n(aihlVarCheckIsLite16.d)) {
                                    aihl aihlVarCheckIsLite17 = aihn.checkIsLite(aqog.a);
                                    apjiVar17.c(aihlVarCheckIsLite17);
                                    Object objK12 = apjiVar17.j.k(aihlVarCheckIsLite17.d);
                                }
                                aihl aihlVar3 = akhm.a;
                                aihl aihlVarCheckIsLite18 = aihn.checkIsLite(aihlVar3);
                                apjiVar17.c(aihlVarCheckIsLite18);
                                if (apjiVar17.j.n(aihlVarCheckIsLite18.d)) {
                                    awku awkuVar4 = uxhVar2.d;
                                    aihl aihlVarCheckIsLite19 = aihn.checkIsLite(aihlVar3);
                                    apjiVar17.c(aihlVarCheckIsLite19);
                                    Object objK13 = apjiVar17.j.k(aihlVarCheckIsLite19.d);
                                    awkuVar4.kk(Optional.of((akhl) (objK13 == null ? aihlVarCheckIsLite19.b : aihlVarCheckIsLite19.c(objK13))));
                                }
                                agkeVar2 = agkeVar3;
                                akgsVar2 = akgsVar4;
                                ardqVar2 = ardqVar2;
                            }
                            agke agkeVar4 = agkeVar2;
                            akgs akgsVar5 = akgsVar2;
                            ardq ardqVar4 = ardqVar2;
                            int i3 = alqrVar.b;
                            if ((i3 & 32) != 0 && (i3 & 64) != 0) {
                                if (alqrVar.i == null) {
                                    ajwo ajwoVar2 = ajwo.a;
                                }
                                if (alqrVar.j == null) {
                                    ajwo ajwoVar3 = ajwo.a;
                                }
                            }
                            if ((alqrVar.b & SemanticState.Focused) != 0) {
                                apji apjiVar18 = alqrVar.k;
                                if (apjiVar18 == null) {
                                    apjiVar18 = apji.a;
                                }
                                aihl aihlVarCheckIsLite20 = aihn.checkIsLite(akrs.a);
                                apjiVar18.c(aihlVarCheckIsLite20);
                                if (apjiVar18.j.n(aihlVarCheckIsLite20.d)) {
                                    apji apjiVar19 = alqrVar.k;
                                    if (apjiVar19 == null) {
                                        apjiVar19 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite21 = aihn.checkIsLite(akrs.a);
                                    apjiVar19.c(aihlVarCheckIsLite21);
                                    Object objK14 = apjiVar19.j.k(aihlVarCheckIsLite21.d);
                                }
                            }
                            uxhVar2.h.kk(alqrVar);
                            agkeVar = agkeVar4;
                            apwmVar = apwmVar2;
                            agkeVar2 = agkeVarN;
                            akgsVar = akgsVar5;
                            ardqVar = ardqVar4;
                            akgxVar = akgxVar2;
                        } else {
                            i = 8;
                            agkeVar = agkeVar2;
                            ardqVar = null;
                            apwmVar = null;
                            apjiVar = null;
                            akgxVar = null;
                            aqhuVar = null;
                            akgsVar = null;
                            apwrVar = null;
                            apvwVar = null;
                            aiieVar2 = null;
                            apjiVar2 = null;
                        }
                        apji apjiVar20 = apjiVar;
                        akgx akgxVar3 = akgxVar;
                        if (((vxz) uxhVar2.j.c).m(74, 45729767L) && apwmVar != null) {
                            apji apjiVar21 = apwmVar.b;
                            if (apjiVar21 == null) {
                                apjiVar21 = apji.a;
                            }
                            aihl aihlVarCheckIsLite22 = aihn.checkIsLite(ajnp.a);
                            apjiVar21.c(aihlVarCheckIsLite22);
                            if (apjiVar21.j.n(aihlVarCheckIsLite22.d)) {
                                apji apjiVar22 = apwmVar.b;
                                if (apjiVar22 == null) {
                                    apjiVar22 = apji.a;
                                }
                                aihl aihlVarCheckIsLite23 = aihn.checkIsLite(ajnp.a);
                                apjiVar22.c(aihlVarCheckIsLite23);
                                Object objK15 = apjiVar22.j.k(aihlVarCheckIsLite23.d);
                                Object objC = objK15 == null ? aihlVarCheckIsLite23.b : aihlVarCheckIsLite23.c(objK15);
                                xsc xscVar = uxhVar2.l;
                                ajwo ajwoVar4 = ((ajnf) objC).s;
                                if (ajwoVar4 == null) {
                                    ajwoVar4 = ajwo.a;
                                }
                                xscVar.L(ajwoVar4);
                            } else {
                                zvl zvlVar = uxhVar2.c;
                                zvj zvjVarA = zvk.a();
                                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                                zvjVarA.j = 23;
                                zvjVarA.d("[ShortsCreation][Android][GetShortsCreation]ShortsEffectPickerEntryRenderer does not have a ButtonRenderer extension.");
                                zvlVar.a(zvjVarA.a());
                            }
                        }
                        int size = agkeVar.size();
                        int i4 = 0;
                        while (i4 < size) {
                            apji apjiVar23 = (apji) agkeVar.get(i4);
                            aihl aihlVarCheckIsLite24 = aihn.checkIsLite(apxg.a);
                            apjiVar23.c(aihlVarCheckIsLite24);
                            int i5 = size;
                            if (apjiVar23.j.n(aihlVarCheckIsLite24.d)) {
                                aihl aihlVarCheckIsLite25 = aihn.checkIsLite(apxg.a);
                                apjiVar23.c(aihlVarCheckIsLite25);
                                Object objK16 = apjiVar23.j.k(aihlVarCheckIsLite25.d);
                                apxf apxfVar = (apxf) (objK16 == null ? aihlVarCheckIsLite25.b : aihlVarCheckIsLite25.c(objK16));
                                arft arftVarA = arft.a(apxfVar.c);
                                if (arftVarA == null) {
                                    arftVarA = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
                                }
                                if (arftVarA == arft.TOOLBELT_BUTTON_TYPE_EFFECT_PICKER) {
                                    apji apjiVar24 = apxfVar.d;
                                    if (apjiVar24 == null) {
                                        apjiVar24 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite26 = aihn.checkIsLite(ajnp.a);
                                    apjiVar24.c(aihlVarCheckIsLite26);
                                    if (apjiVar24.j.n(aihlVarCheckIsLite26.d)) {
                                        apji apjiVar25 = apxfVar.d;
                                        if (apjiVar25 == null) {
                                            apjiVar25 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite27 = aihn.checkIsLite(ajnp.a);
                                        apjiVar25.c(aihlVarCheckIsLite27);
                                        Object objK17 = apjiVar25.j.k(aihlVarCheckIsLite27.d);
                                        Object objC2 = objK17 == null ? aihlVarCheckIsLite27.b : aihlVarCheckIsLite27.c(objK17);
                                        xsc xscVar2 = uxhVar2.l;
                                        ajwo ajwoVar5 = ((ajnf) objC2).s;
                                        if (ajwoVar5 == null) {
                                            ajwoVar5 = ajwo.a;
                                        }
                                        xscVar2.L(ajwoVar5);
                                    } else {
                                        zvl zvlVar2 = uxhVar2.c;
                                        zvj zvjVarA2 = zvk.a();
                                        zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                                        zvjVarA2.j = 23;
                                        zvjVarA2.d("[ShortsCreation][Android][GetShortsCreation]ShortsToolbeltButtonRenderer of type EFFECT_PICKER does not have a ButtonRenderer extension.");
                                        zvlVar2.a(zvjVarA2.a());
                                    }
                                }
                            }
                            i4++;
                            size = i5;
                        }
                        uxj uxjVar3 = uxjVar2;
                        if (aqhuVar != null) {
                            uxjVar3.i = aqhuVar;
                            uxjVar3.a.d(uxjVar3.i);
                        }
                        uxjVar3.k = apwrVar;
                        uxjVar3.n = aiieVar2;
                        uxjVar3.d();
                        uxjVar3.f(ardqVar);
                        uxjVar3.e(agkeVar2, apjiVar2, agkeVar, apjiVar20);
                        if (apwmVar != null) {
                            uxjVar3.d.kk(apwmVar);
                        }
                        if (apvwVar != null) {
                            uxjVar3.e.kk(apvwVar);
                        } else if (((vxz) uxjVar3.o.b).m(446, 45735792L)) {
                            uxjVar3.e = new awli();
                        }
                        if (akgxVar3 != null) {
                            uxjVar3.g.kk(akgxVar3);
                        }
                        if (akgsVar != null) {
                            uxjVar3.h.kk(akgsVar);
                        }
                        if (uxjVar3.g()) {
                            uxjVar3.c();
                            return;
                        }
                        xpl xplVar2 = uxjVar3.p;
                        uze uzeVarA = uzf.a();
                        uzeVarA.b(agkeVar2);
                        uzeVarA.c(agkeVar);
                        uzeVarA.c = apjiVar2;
                        uzeVarA.d = apjiVar20;
                        taf.j(ahno.an(ahno.ar(((ayq) xplVar2.a).j(new uzg(uzeVarA.a(), 0)), new sdp(i), MoreExecutors.directExecutor()), IOException.class, new uzh(xplVar2, 0), MoreExecutors.directExecutor()), new tsq(3));
                    }
                }, null);
            }
        }));
    }
}
