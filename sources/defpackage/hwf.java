package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwf {
    public final /* synthetic */ Object a;

    public hwf(Object obj) {
        this.a = obj;
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        int i = aboeVar.j;
        if (aawb.B(i)) {
            Object obj = this.a;
            if (i != 15) {
                hwc hwcVar = ((hwg) obj).a;
                hwcVar.j = new abgi(abgh.d, false);
                hwcVar.i.a(aboeVar);
                hwcVar.C();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0299  */
    /* JADX WARN: Code duplicated, block: B:102:0x029d  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02be  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x018c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x021c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0227  */
    /* JADX WARN: Code duplicated, block: B:86:0x0262  */
    /* JADX WARN: Code duplicated, block: B:88:0x026a  */
    /* JADX WARN: Code duplicated, block: B:89:0x026d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x0280  */
    /* JADX WARN: Code duplicated, block: B:96:0x0284  */
    /* JADX WARN: Code duplicated, block: B:97:0x0287  */
    @tcc
    public void handleSequencerStageEvent(aayw aaywVar) {
        int i;
        ajnf ajnfVar;
        hwc hwcVar;
        ViewGroup viewGroup;
        aunn aunnVar;
        ViewGroup viewGroup2;
        amks amksVar;
        aqof aqofVar;
        alvl alvlVarT;
        aony aonyVarA;
        amsm amsmVarL;
        jnj jnjVar;
        alay alayVar;
        alay alayVar2;
        aqmh aqmhVar;
        aefv aefvVar;
        aorw aorwVar;
        apji apjiVar;
        aihl aihlVarCheckIsLite;
        apji apjiVar2;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        aorw aorwVar2;
        apji apjiVar3;
        aihl aihlVarCheckIsLite3;
        apji apjiVar4;
        aihl aihlVarCheckIsLite4;
        Object objK2;
        Object objC2;
        abnw abnwVar = abnw.a;
        abnw abnwVar2 = aaywVar.b;
        int i2 = 1;
        if (abnwVar2 == abnwVar) {
            hwg hwgVar = (hwg) this.a;
            if (((hfn) hwgVar.e.io()).x().b(hww.c)) {
                hwgVar.v = false;
                hwgVar.a.D();
            } else {
                hwgVar.v = true;
            }
        }
        wjf wjfVar = aaywVar.c;
        if (!abnwVar2.b(abnw.d) || wjfVar == null) {
            i = 8;
        } else {
            wgi wgiVar = aaywVar.d;
            Object obj = this.a;
            hwg hwgVar2 = (hwg) obj;
            hwgVar2.r = (aqof) fhz.ad(wgiVar, "music-watch-page-player-mode").orElse(null);
            if (wgiVar == null) {
                hwgVar2.c.h(null, false);
            } else {
                hfk hfkVar = hwgVar2.c;
                aorw aorwVar3 = wgiVar.g;
                hfkVar.h(null, false);
                if (aorwVar3 != null) {
                    aihf builder = aorwVar3.toBuilder();
                    builder.copyOnWrite();
                    ((aorw) builder.instance).d = aorw.emptyProtobufList();
                    for (int i3 = 0; i3 < aorwVar3.d.size(); i3++) {
                        aorn aornVar = (aorn) aorwVar3.d.get(i3);
                        if ((aornVar.b & 4) != 0) {
                            amks amksVar2 = aornVar.d;
                            if (amksVar2 == null) {
                                amksVar2 = amks.a;
                            }
                            aihh aihhVar = (aihh) amksVar2.toBuilder();
                            hfkVar.h(aihhVar, false);
                            aihf builder2 = aornVar.toBuilder();
                            builder2.copyOnWrite();
                            aorn aornVar2 = (aorn) builder2.instance;
                            amks amksVar3 = (amks) aihhVar.build();
                            amksVar3.getClass();
                            aornVar2.d = amksVar3;
                            aornVar2.b |= 4;
                            builder.cb(builder2);
                        } else {
                            builder.copyOnWrite();
                            aorw aorwVar4 = (aorw) builder.instance;
                            aornVar.getClass();
                            aorwVar4.a();
                            aorwVar4.d.add(aornVar);
                        }
                    }
                    i = 8;
                    wgiVar.g = (aorw) builder.build();
                }
                hwcVar = hwgVar2.a;
                viewGroup = (ViewGroup) hwcVar.findViewById(R.id.info_panel_overview_element_container);
                aunnVar = hwgVar2.f;
                kro.X(viewGroup, ((jer) aunnVar.io()).a);
                if (wgiVar != null && (aorwVar2 = wgiVar.g) != null && (aorwVar2.c & 262144) != 0) {
                    apjiVar3 = aorwVar2.j;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                        apjiVar4 = wgiVar.g.j;
                        if (apjiVar4 == null) {
                            apjiVar4 = apji.a;
                        }
                        aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                        apjiVar4.c(aihlVarCheckIsLite4);
                        objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                        if (objK2 == null) {
                            objC2 = aihlVarCheckIsLite4.b;
                        } else {
                            objC2 = aihlVarCheckIsLite4.c(objK2);
                        }
                        kro.Q(hwgVar2.i.a((akrn) objC2), viewGroup, ((jer) aunnVar.io()).a, hwgVar2.m);
                    }
                }
                viewGroup2 = (ViewGroup) hwcVar.findViewById(R.id.paid_content_overlay_element_container);
                kro.X(viewGroup2, ((jer) aunnVar.io()).a);
                if (wgiVar != null && (aorwVar = wgiVar.g) != null && (aorwVar.c & 16384) != 0) {
                    apjiVar = aorwVar.g;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        apjiVar2 = wgiVar.g.g;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite2.b;
                        } else {
                            objC = aihlVarCheckIsLite2.c(objK);
                        }
                        kro.Q(hwgVar2.i.a((akrn) objC), viewGroup2, ((jer) aunnVar.io()).a, hwgVar2.m);
                    }
                }
                hwgVar2.u = fhz.W(wgiVar);
                amksVar = hwgVar2.u;
                if (!Objects.equals(hwcVar.z, amksVar)) {
                    hwcVar.z = amksVar;
                }
                aqofVar = hwgVar2.r;
                if (aqofVar != null && hwgVar2.w.l(95, 45762151L, false) && hwgVar2.r != null && ((hfn) hwgVar2.e.io()).x().b(hww.c)) {
                    aefvVar = hwgVar2.d;
                    aefk aefkVarM = aefvVar.m(aqofVar);
                    aefkVarM.a = hwgVar2.c();
                    hwgVar2.s = aefkVarM.c();
                    if (aefvVar.k(hwgVar2.s)) {
                        aefvVar.c(hwgVar2.s);
                    }
                }
                if (hwgVar2.i()) {
                    cf cfVar = hwgVar2.h;
                    iqv iqvVar = hwgVar2.n;
                    afxd afxdVarF = afxd.f(iqvVar.c());
                    gpr gprVar = new gpr(11);
                    Executor executor = iqvVar.c;
                    taf.k(cfVar, afxdVarF.h(gprVar, executor).b(Throwable.class, new iqj(12), executor), new igt(i2), new glm(obj, 17));
                }
                alvlVarT = wjfVar.t();
                if (alvlVarT != null) {
                    aonyVarA = aony.a(alvlVarT.c);
                    if (aonyVarA == null) {
                        aonyVarA = aony.OK;
                    }
                } else {
                    aonyVarA = null;
                }
                hwcVar.k = aonyVarA;
                amsmVarL = aaje.l(alvlVarT);
                if (amsmVarL != null) {
                    jnjVar = hwcVar.W;
                    Object obj2 = jnjVar.b;
                    if ((amsmVarL.b & 4) != 0) {
                        alayVar = amsmVarL.c;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    tuk.u((TextView) obj2, ackj.k(null, alayVar, null, false));
                    Object obj3 = jnjVar.a;
                    if ((amsmVarL.b & 8) != 0) {
                        alayVar2 = amsmVarL.d;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                    } else {
                        alayVar2 = null;
                    }
                    tuk.u((TextView) obj3, ackj.k(null, alayVar2, null, false));
                    if ((amsmVarL.b & 16) != 0) {
                        Object obj4 = jnjVar.f;
                        aqmhVar = amsmVarL.e;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                        ((adia) obj4).f(aqmhVar, null);
                    } else {
                        ((adia) jnjVar.f).a();
                        tuk.l((View) jnjVar.e, false);
                    }
                }
                hwcVar.K();
            }
            i = 8;
            hwcVar = hwgVar2.a;
            viewGroup = (ViewGroup) hwcVar.findViewById(R.id.info_panel_overview_element_container);
            aunnVar = hwgVar2.f;
            kro.X(viewGroup, ((jer) aunnVar.io()).a);
            if (wgiVar != null) {
                apjiVar3 = aorwVar2.j;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    apjiVar4 = wgiVar.g.j;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                    apjiVar4.c(aihlVarCheckIsLite4);
                    objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                    if (objK2 == null) {
                        objC2 = aihlVarCheckIsLite4.b;
                    } else {
                        objC2 = aihlVarCheckIsLite4.c(objK2);
                    }
                    kro.Q(hwgVar2.i.a((akrn) objC2), viewGroup, ((jer) aunnVar.io()).a, hwgVar2.m);
                }
            }
            viewGroup2 = (ViewGroup) hwcVar.findViewById(R.id.paid_content_overlay_element_container);
            kro.X(viewGroup2, ((jer) aunnVar.io()).a);
            if (wgiVar != null) {
                apjiVar = aorwVar.g;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apjiVar2 = wgiVar.g.g;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite2.b;
                    } else {
                        objC = aihlVarCheckIsLite2.c(objK);
                    }
                    kro.Q(hwgVar2.i.a((akrn) objC), viewGroup2, ((jer) aunnVar.io()).a, hwgVar2.m);
                }
            }
            hwgVar2.u = fhz.W(wgiVar);
            amksVar = hwgVar2.u;
            if (!Objects.equals(hwcVar.z, amksVar)) {
                hwcVar.z = amksVar;
            }
            aqofVar = hwgVar2.r;
            if (aqofVar != null) {
                aefvVar = hwgVar2.d;
                aefk aefkVarM2 = aefvVar.m(aqofVar);
                aefkVarM2.a = hwgVar2.c();
                hwgVar2.s = aefkVarM2.c();
                if (aefvVar.k(hwgVar2.s)) {
                    aefvVar.c(hwgVar2.s);
                }
            }
            if (hwgVar2.i()) {
                cf cfVar2 = hwgVar2.h;
                iqv iqvVar2 = hwgVar2.n;
                afxd afxdVarF2 = afxd.f(iqvVar2.c());
                gpr gprVar2 = new gpr(11);
                Executor executor2 = iqvVar2.c;
                taf.k(cfVar2, afxdVarF2.h(gprVar2, executor2).b(Throwable.class, new iqj(12), executor2), new igt(i2), new glm(obj, 17));
            }
            alvlVarT = wjfVar.t();
            if (alvlVarT != null) {
                aonyVarA = aony.a(alvlVarT.c);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
            } else {
                aonyVarA = null;
            }
            hwcVar.k = aonyVarA;
            amsmVarL = aaje.l(alvlVarT);
            if (amsmVarL != null) {
                jnjVar = hwcVar.W;
                Object obj5 = jnjVar.b;
                if ((amsmVarL.b & 4) != 0) {
                    alayVar = amsmVarL.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                tuk.u((TextView) obj5, ackj.k(null, alayVar, null, false));
                Object obj6 = jnjVar.a;
                if ((amsmVarL.b & 8) != 0) {
                    alayVar2 = amsmVarL.d;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                tuk.u((TextView) obj6, ackj.k(null, alayVar2, null, false));
                if ((amsmVarL.b & 16) != 0) {
                    Object obj7 = jnjVar.f;
                    aqmhVar = amsmVarL.e;
                    if (aqmhVar == null) {
                        aqmhVar = aqmh.a;
                    }
                    ((adia) obj7).f(aqmhVar, null);
                } else {
                    ((adia) jnjVar.f).a();
                    tuk.l((View) jnjVar.e, false);
                }
            }
            hwcVar.K();
        }
        wgi wgiVar2 = aaywVar.d;
        Object obj8 = this.a;
        aorw aorwVarZ = fhz.Z(wgiVar2);
        if (aorwVarZ != null) {
            Iterator it = aorwVarZ.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    aorn aornVar3 = (aorn) it.next();
                    ajnf ajnfVar2 = aornVar3.c;
                    if (ajnfVar2 == null) {
                        ajnfVar2 = ajnf.a;
                    }
                    ajwo ajwoVar = ajnfVar2.s;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apte.b);
                    ajwoVar.c(aihlVarCheckIsLite5);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                        ajnf ajnfVar3 = aornVar3.c;
                        if (ajnfVar3 == null) {
                            ajnfVar3 = ajnf.a;
                        }
                        ajwo ajwoVar2 = ajnfVar3.r;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apte.b);
                        ajwoVar2.c(aihlVarCheckIsLite6);
                        if (!ajwoVar2.j.n(aihlVarCheckIsLite6.d)) {
                            ajnf ajnfVar4 = aornVar3.c;
                            if (ajnfVar4 == null) {
                                ajnfVar4 = ajnf.a;
                            }
                            ajwo ajwoVar3 = ajnfVar4.s;
                            if (ajwoVar3 == null) {
                                ajwoVar3 = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ajwm.b);
                            ajwoVar3.c(aihlVarCheckIsLite7);
                            if (ajwoVar3.j.n(aihlVarCheckIsLite7.d)) {
                                ajnf ajnfVar5 = aornVar3.c;
                                if (ajnfVar5 == null) {
                                    ajnfVar5 = ajnf.a;
                                }
                                ajwo ajwoVar4 = ajnfVar5.s;
                                if (ajwoVar4 == null) {
                                    ajwoVar4 = ajwo.a;
                                }
                                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ajwm.b);
                                ajwoVar4.c(aihlVarCheckIsLite8);
                                Object objK3 = ajwoVar4.j.k(aihlVarCheckIsLite8.d);
                                if (Collection.EL.stream(((ajwm) (objK3 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK3))).c).anyMatch(new gqk(2))) {
                                }
                            }
                        }
                    }
                    ajnfVar = aornVar3.c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                } else {
                    ajnfVar = null;
                }
            }
        } else {
            ajnfVar = null;
        }
        hwg hwgVar3 = (hwg) obj8;
        hwgVar3.t = ajnfVar;
        hwgVar3.e();
        jbm jbmVar = hwgVar3.p;
        jbmVar.b(null);
        ajnf ajnfVarS = fhz.S(wgiVar2);
        if (ajnfVarS == null) {
            hwgVar3.o.setVisibility(i);
        } else {
            jbmVar.hU(hwgVar3.m, ajnfVarS);
            hwgVar3.o.setVisibility(0);
        }
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        if (aazjVar.a == abob.a) {
            hwg hwgVar = (hwg) this.a;
            if (((ycp) hwgVar.b.io()).e == null) {
                hwgVar.a.m();
            }
        }
    }

    public /* synthetic */ hwf(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
