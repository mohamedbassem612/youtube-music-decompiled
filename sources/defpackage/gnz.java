package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.voice.views.NestedScrollListeningFrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnz implements gdx {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/browse/EntitiesFragmentPresenter");
    public final dd b;
    public final jki c;
    public final vxz d;
    private final tbt e;
    private final List f = new ArrayList();
    private final vxz g;

    public gnz(dd ddVar, jki jkiVar, tbt tbtVar, vxz vxzVar, vxz vxzVar2) {
        this.b = ddVar;
        this.c = jkiVar;
        this.e = tbtVar;
        this.d = vxzVar;
        this.g = vxzVar2;
    }

    public static boolean i(cc ccVar) {
        return (ccVar instanceof ioc) || (ccVar instanceof iog);
    }

    public static final String j(ajmf ajmfVar) {
        return String.format("%s%s%s", goa.ENTITY.j, ajmfVar.c, ajmfVar.d);
    }

    public static final boolean k(int i, cc ccVar) {
        return i == 2 && (ccVar instanceof gox);
    }

    @Override // defpackage.gdx
    public final void a() {
        List<axq> list = this.f;
        for (axq axqVar : list) {
            c((cc) axqVar.a, (String) axqVar.b);
        }
        list.clear();
    }

    public final jmg b() {
        cc ccVarG = this.b.g(goa.VOICE_SEARCH.j);
        if (ccVarG instanceof jmg) {
            return (jmg) ccVarG;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(cc ccVar, String str) {
        View view;
        ccVar.getClass();
        dd ddVar = this.b;
        if (!jku.e(ddVar)) {
            this.f.add(new axq(ccVar, str));
            return;
        }
        av avVar = new av(ddVar);
        if (this.g.l(31, 45757116L, false)) {
            ajwo ajwoVar = ccVar instanceof hku ? (ajwo) ((hku) ccVar).gS().orElse(null) : null;
            hkm hkmVarAd = kro.ad(ajwoVar, str.equals(goa.SEARCH_LANDING_PAGE.j));
            avVar.s(hkmVarAd.a, hkmVarAd.b, 0);
            for (cc ccVar2 : ddVar.k()) {
                if (ccVar2.getId() == R.id.fragment_container && (view = ccVar2.getView()) != null) {
                    int i = bac.a;
                    view.setTranslationZ(-1.0f);
                }
            }
        } else {
            avVar.s(R.anim.fragment_fade_in, R.anim.fragment_fade_out, 0);
        }
        avVar.q(R.id.fragment_container, ccVar, str);
        avVar.o(str);
        avVar.a(false, true);
        ddVar.ah();
    }

    public final void d(heh hehVar) {
        ajwo ajwoVar = hehVar.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            String strJ = j(ajmfVar);
            cc ccVarB = this.c.b();
            if (ccVarB != null) {
                int iBc = a.bc(ajmfVar.i);
                if (iBc == 0) {
                    iBc = 1;
                }
                if (k(iBc, ccVarB)) {
                    ((gox) ccVarB).hF(hehVar);
                    return;
                } else if (strJ.equals(ccVarB.getTag())) {
                    return;
                }
            }
            hehVar.k = strJ;
            gox goxVar = new gox();
            goxVar.u(hehVar);
            c(goxVar, strJ);
        }
    }

    public final void e(hel helVar) {
        irx.a(helVar, this.e);
        cc ccVarB = this.c.b();
        iog iogVar = ccVarB instanceof iog ? (iog) ccVarB : new iog();
        iogVar.j(helVar);
        if (iogVar.isAdded()) {
            return;
        }
        c(iogVar, goa.SEARCH_PRIMARY_RESULT.j);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:67:0x010a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    public final void f(ajwo ajwoVar) {
        int i;
        akrn akrnVar;
        akrn akrnVar2;
        boolean z;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        boolean z2;
        aecp aecpVar;
        jls jlsVar;
        FrameLayout frameLayout3;
        int iBc;
        jmg jmgVarB = b();
        if (jmgVarB == null) {
            jmgVarB = jmg.l(ajwoVar);
            jmgVarB.h(this.b, goa.VOICE_SEARCH.j);
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apym.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apym apymVar = (apym) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aoli aoliVar = apymVar.d;
        if (aoliVar == null) {
            aoliVar = aoli.a;
        }
        int i2 = aoliVar.c;
        if (i2 == 5) {
            try {
                aoll aollVar = (aoll) wjr.F((i2 == 5 ? (aigj) aoliVar.d : aigj.d).G(), aoll.a);
                if (aollVar != null) {
                    wru wruVar = new wru(aollVar);
                    aoli aoliVar2 = apymVar.d;
                    if (aoliVar2 == null) {
                        aoliVar2 = aoli.a;
                    }
                    if ((aoliVar2.b & 1) != 0) {
                        xgn xgnVar = jmgVarB.l;
                        aoli aoliVar3 = apymVar.d;
                        if (aoliVar3 == null) {
                            aoliVar3 = aoli.a;
                        }
                        xgnVar.b(xhb.a(aoliVar3.e), jmgVarB.aa, null);
                    }
                    NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = jmgVarB.Q;
                    if (nestedScrollListeningFrameLayout != null) {
                        kro.X(nestedScrollListeningFrameLayout, jmgVarB.r.a);
                    }
                    jmgVarB.z();
                    aoll aollVar2 = wruVar.a;
                    if (aollVar2 != null && (aollVar2.b & 8) != 0) {
                        vxe vxeVar = jmgVarB.k;
                        ajwo ajwoVar2 = aollVar2.f;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar.a(jmgVarB.n(ajwoVar2));
                    }
                    if (aollVar2 != null && (aollVar2.b & 2) != 0) {
                        aoln aolnVar = aollVar2.d;
                        if (aolnVar == null) {
                            aolnVar = aoln.a;
                        }
                        int i3 = aolnVar.b;
                        if (i3 != 441573002) {
                            i = aolnVar.b;
                            if (i == 153515154) {
                                akrnVar = null;
                            } else if (i == 153515154) {
                                akrnVar = (akrn) aolnVar.c;
                            } else {
                                akrnVar = akrn.a;
                            }
                        } else {
                            apji apjiVar = (i3 == 441573002 ? (aolg) aolnVar.c : aolg.a).d;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                            apjiVar.c(aihlVarCheckIsLite2);
                            if (apjiVar.j.n(aihlVarCheckIsLite2.d)) {
                                apji apjiVar2 = (aolnVar.b == 441573002 ? (aolg) aolnVar.c : aolg.a).d;
                                if (apjiVar2 == null) {
                                    apjiVar2 = apji.a;
                                }
                                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                                apjiVar2.c(aihlVarCheckIsLite3);
                                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite3.d);
                                akrnVar = (akrn) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                            } else {
                                i = aolnVar.b;
                                if (i == 153515154) {
                                    akrnVar = null;
                                } else if (i == 153515154) {
                                    akrnVar = (akrn) aolnVar.c;
                                } else {
                                    akrnVar = akrn.a;
                                }
                            }
                        }
                        int i4 = aolnVar.b;
                        if (i4 != 441573002) {
                            akrnVar2 = null;
                        } else {
                            apji apjiVar3 = (i4 == 441573002 ? (aolg) aolnVar.c : aolg.a).f;
                            if (apjiVar3 == null) {
                                apjiVar3 = apji.a;
                            }
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
                            apjiVar3.c(aihlVarCheckIsLite4);
                            if (apjiVar3.j.n(aihlVarCheckIsLite4.d)) {
                                apji apjiVar4 = (aolnVar.b == 441573002 ? (aolg) aolnVar.c : aolg.a).f;
                                if (apjiVar4 == null) {
                                    apjiVar4 = apji.a;
                                }
                                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
                                apjiVar4.c(aihlVarCheckIsLite5);
                                Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite5.d);
                                akrnVar2 = (akrn) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                            } else {
                                akrnVar2 = null;
                            }
                        }
                        int i5 = aolnVar.b;
                        if (i5 != 138681066) {
                            z = false;
                        } else {
                            akuh akuhVar = (i5 == 138681066 ? (akuj) aolnVar.c : akuj.b).h;
                            if (akuhVar == null) {
                                akuhVar = akuh.a;
                            }
                            if (akuhVar.b == 49399797) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            jml jmlVar = jmgVarB.H;
                            if (jmlVar != null) {
                                akuh akuhVar2 = (aolnVar.b == 138681066 ? (akuj) aolnVar.c : akuj.b).h;
                                if (akuhVar2 == null) {
                                    akuhVar2 = akuh.a;
                                }
                                apoq apoqVar = akuhVar2.b == 49399797 ? (apoq) akuhVar2.c : apoq.a;
                                if (apoqVar != null && (apoqVar.c & SemanticState.Hidden) != 0 && (aecpVar = jmlVar.f) != null) {
                                    apji apjiVar5 = apoqVar.k;
                                    if (apjiVar5 == null) {
                                        apjiVar5 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
                                    apjiVar5.c(aihlVarCheckIsLite6);
                                    if (apjiVar5.j.n(aihlVarCheckIsLite6.d)) {
                                        apji apjiVar6 = apoqVar.k;
                                        if (apjiVar6 == null) {
                                            apjiVar6 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(akrs.a);
                                        apjiVar6.c(aihlVarCheckIsLite7);
                                        Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite7.d);
                                        aecpVar.c((akrn) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4)));
                                    }
                                }
                                if (apoqVar != null) {
                                    if (apoqVar.f.size() > 0) {
                                        jmlVar.d(apoqVar);
                                    } else if ((apoqVar.c & 268435456) != 0) {
                                        apok apokVar = apoqVar.u;
                                        if (apokVar == null) {
                                            apokVar = apok.a;
                                        }
                                        if (jmlVar.b.Q) {
                                            if (!jmlVar.m.m(270, 45835641L) || (!jmlVar.g(apokVar) && (jmlVar.j || apoqVar.g.size() <= 0))) {
                                                z2 = true;
                                            } else {
                                                jmlVar.i = jml.a(apoqVar);
                                                z2 = true;
                                                jmlVar.j = true;
                                            }
                                            jmlVar.b(apokVar, z2);
                                        } else {
                                            jmlVar.d(apoqVar);
                                            jmlVar.b(apokVar, false);
                                        }
                                    }
                                }
                                if (!jmlVar.k) {
                                    jmlVar.e();
                                }
                            } else {
                                akrnVar2 = akrnVar2;
                                z = z;
                            }
                            akuh akuhVar3 = (aolnVar.b == 138681066 ? (akuj) aolnVar.c : akuj.b).h;
                            if (akuhVar3 == null) {
                                akuhVar3 = akuh.a;
                            }
                            apji apjiVar7 = (akuhVar3.b == 49399797 ? (apoq) akuhVar3.c : apoq.a).w;
                            if (apjiVar7 == null) {
                                apjiVar7 = apji.a;
                            }
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(akrs.a);
                            apjiVar7.c(aihlVarCheckIsLite8);
                            if (apjiVar7.j.n(aihlVarCheckIsLite8.d) && jmgVarB.at) {
                                akuh akuhVar4 = (aolnVar.b == 138681066 ? (akuj) aolnVar.c : akuj.b).h;
                                if (akuhVar4 == null) {
                                    akuhVar4 = akuh.a;
                                }
                                apji apjiVar8 = (akuhVar4.b == 49399797 ? (apoq) akuhVar4.c : apoq.a).w;
                                if (apjiVar8 == null) {
                                    apjiVar8 = apji.a;
                                }
                                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(akrs.a);
                                apjiVar8.c(aihlVarCheckIsLite9);
                                Object objK5 = apjiVar8.j.k(aihlVarCheckIsLite9.d);
                                akrnVar2 = (akrn) (objK5 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK5));
                            } else {
                                akrnVar2 = akrnVar2;
                            }
                            NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout2 = jmgVarB.aq;
                            if (nestedScrollListeningFrameLayout2 != null) {
                                nestedScrollListeningFrameLayout2.setVisibility(0);
                            }
                            if (akrnVar2 != null && (frameLayout2 = jmgVarB.S) != null && jmgVarB.at) {
                                frameLayout2.setVisibility(0);
                                jmgVarB.A(jmgVarB.s.a(akrnVar2), jmgVarB.S);
                            }
                        } else {
                            z = z;
                        }
                        if (akrnVar != null || z) {
                            jmgVarB.N = true;
                            jmgVarB.L = false;
                            FrameLayout frameLayout4 = jmgVarB.P;
                            if (frameLayout4 != null) {
                                frameLayout4.setVisibility(8);
                            }
                            TextView textView = jmgVarB.W;
                            if (textView != null) {
                                textView.setVisibility(4);
                            }
                            jls jlsVar2 = jmgVarB.au;
                            if (jlsVar2 != null) {
                                jlsVar2.i();
                            }
                            int iBc2 = a.bc(apymVar.i);
                            jmgVarB.an = iBc2 != 0 && iBc2 == 4;
                            if ((apymVar.c & SemanticState.LiveRegion) != 0) {
                                jmgVarB.ao = apymVar.m;
                            }
                        }
                        if (akrnVar != null) {
                            NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout3 = jmgVarB.Q;
                            if (nestedScrollListeningFrameLayout3 != null) {
                                nestedScrollListeningFrameLayout3.setVisibility(0);
                            }
                            acxm acxmVarA = jmgVarB.s.a(akrnVar);
                            NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout4 = jmgVarB.Q;
                            if (nestedScrollListeningFrameLayout4 != null) {
                                jmgVarB.A(acxmVarA, nestedScrollListeningFrameLayout4);
                            }
                            if (akrnVar2 != null && (frameLayout = jmgVarB.S) != null && !jmgVarB.at) {
                                frameLayout.setVisibility(0);
                                jmgVarB.A(jmgVarB.s.a(akrnVar2), jmgVarB.S);
                            }
                            jmgVarB.l.l(new xgj(aollVar2.g, (amud) null));
                            jmgVarB.n.c(new hap());
                            if (jmgVarB.p.r(48)) {
                                jmgVarB.p.v("voz_dr", 48);
                            }
                        }
                    }
                    if (jmgVarB.az == 3) {
                        jmgVarB.G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE);
                        jmgVarB.D();
                        if ((apymVar.c & 8) != 0) {
                            jmgVarB.ab = apymVar.g;
                            jmgVarB.v("");
                        } else if (jmgVarB.ab != null) {
                            jmgVarB.ab = null;
                            jmgVarB.v("");
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/apps/youtube/music/browse/EntitiesFragmentPresenter", "navigateToVoicePanel", (char) 234, "EntitiesFragmentPresenter.java")).t("Unable to parse panelLoadingStrategy.serialized_inline_response");
                return;
            }
        }
        if (!apymVar.e.isEmpty() || ((iBc = a.bc(apymVar.i)) != 0 && iBc == 5)) {
            jmgVarB.u();
            aihl aihlVarCheckIsLite10 = aihn.checkIsLite(apym.b);
            ajwoVar.c(aihlVarCheckIsLite10);
            Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
            String str = (String) aguu.J(agfm.b('\n').f(((apym) (objK6 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK6))).e), "");
            jmgVarB.r(false);
            jmgVarB.I(false);
            jmgVarB.G(anmt.MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING_FROM_SUGGESTION);
            if (jmgVarB.at && (frameLayout3 = jmgVarB.S) != null) {
                frameLayout3.setVisibility(8);
            }
            if (!str.isEmpty() && !jmgVarB.as && (jlsVar = jmgVarB.au) != null) {
                jlsVar.d(str);
            }
            jml jmlVar2 = jmgVarB.H;
            if (jmlVar2 != null && jmgVarB.ar) {
                jmlVar2.c(str);
                NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout5 = jmgVarB.aq;
                if (nestedScrollListeningFrameLayout5 != null && nestedScrollListeningFrameLayout5.getVisibility() != 0) {
                    jmgVarB.aq.setVisibility(0);
                }
            }
            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apym.b);
            ajwoVar.c(aihlVarCheckIsLite11);
            Object objK7 = ajwoVar.j.k(aihlVarCheckIsLite11.d);
            apym apymVar2 = (apym) (objK7 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK7));
            woc wocVarJ = jmgVarB.aG.j();
            wocVarJ.a = apymVar2.e;
            wocVarJ.b = (String) Objects.requireNonNullElse(jmgVarB.q.n(), "");
            wocVarJ.c = (String) Objects.requireNonNullElse(jmgVarB.q.m(), "");
            wocVarJ.e = jmgVarB.O;
            int iBc3 = a.bc(apymVar2.i);
            if (iBc3 == 0 || iBc3 != 5 || (apymVar2.c & 8) == 0) {
                aigj aigjVar = jmgVarB.ab;
                if (aigjVar != null) {
                    wocVarJ.d = aigjVar;
                } else if ((apymVar2.c & 8) != 0) {
                    wocVarJ.d = apymVar2.g;
                } else {
                    ajwo ajwoVar3 = jmgVarB.aa;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(apym.b);
                    ajwoVar3.c(aihlVarCheckIsLite12);
                    Object objK8 = ajwoVar3.j.k(aihlVarCheckIsLite12.d);
                    wocVarJ.d = ((apym) (objK8 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK8))).g;
                }
            } else {
                wocVarJ.d = apymVar2.g;
            }
            wocVarJ.n(ajwoVar.c);
            jmgVarB.E(wocVarJ, new jlz(jmgVarB, 3), new jlz(jmgVarB, 4));
        }
    }

    public final void g(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        alxr alxrVarA = alxr.a(((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d);
        if (alxrVarA == null) {
            alxrVarA = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
        }
        boolean zEquals = alxrVarA.equals(alxr.SEARCH_PAGE_TYPE_LANDING);
        jki jkiVar = this.c;
        vxz vxzVar = this.d;
        String strE = jkiVar.e();
        if (vxzVar.l(1, 45715026L, false) && !zEquals && strE != null) {
            agkh agkhVar = new agkh(4);
            agkhVar.i(map);
            agkhVar.e("search_launched_from_fragment", strE);
            map = agkhVar.d(true);
        }
        ioc iocVar = new ioc();
        iocVar.l(ajwoVar, map);
        if (zEquals) {
            c(iocVar, goa.SEARCH_LANDING_PAGE.j);
        } else {
            c(iocVar, goa.SEARCH.j);
        }
    }

    public final boolean h() {
        cc ccVarB = this.c.b();
        return i(ccVarB) || (ccVarB instanceof gms);
    }
}
