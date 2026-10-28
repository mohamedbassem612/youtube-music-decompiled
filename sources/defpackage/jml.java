package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.refresh.MusicSwipeRefreshLayout;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jml {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/voice/views/VoiceSearchSectionListController");
    public final jav b;
    public final jhh c;
    public final aunn d;
    public final RecyclerView e;
    public final aecp f;
    public final Executor g;
    public twi h;
    public acjx i;
    public boolean j;
    public boolean k;
    public int l;
    public final vxz m;
    public final vxz n;
    private final adww o;
    private final aunn p;
    private final Executor q;
    private String r;

    /* JADX WARN: Type inference failed for: r13v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awmd, java.lang.Object] */
    public jml(jax jaxVar, jaz jazVar, wrp wrpVar, kyr kyrVar, xgn xgnVar, jer jerVar, hhb hhbVar, aeod aeodVar, aunn aunnVar, vxz vxzVar, vxz vxzVar2, advn advnVar, Executor executor, Executor executor2, aunn aunnVar2, ahrn ahrnVar, FrameLayout frameLayout, vwt vwtVar, twi twiVar) {
        wnf wnfVarA;
        jhh jhhVarL;
        gos gosVar = new gos(this, 2);
        this.o = gosVar;
        this.l = 0;
        this.p = aunnVar;
        this.m = vxzVar;
        this.n = vxzVar2;
        this.d = aunnVar2;
        this.h = twiVar;
        this.g = executor;
        this.q = executor2;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.content_overlay);
        if (frameLayout2 != null) {
            aecp aecpVarF = ahrnVar.f(xgnVar, null);
            this.f = aecpVarF;
            if (aecpVarF != null) {
                aecpVarF.b(frameLayout2);
            }
        } else {
            this.f = null;
        }
        if (vxzVar.m(270, 45835641L)) {
            jlz jlzVar = new jlz(this, 7);
            aend aendVar = (aend) kyrVar.b.io();
            Executor executor3 = (Executor) kyrVar.a.io();
            executor3.getClass();
            wnfVarA = new jlw(aendVar, executor3, jlzVar);
        } else {
            wnfVarA = wrpVar.a(false);
        }
        jay jayVarA = jazVar.a(wnfVarA, xgnVar);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.section_list_content);
        this.e = recyclerView;
        if (vxzVar.m(270, 45835641L)) {
            SwipeRefreshLayout jmkVar = new jmk(frameLayout.getContext());
            jmkVar.setNestedScrollingEnabled(false);
            jhhVarL = hhbVar.l(jmkVar);
            this.c = jhhVarL;
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(recyclerView);
            }
            jmkVar.addView(recyclerView);
            frameLayout.addView(jmkVar, 0);
        } else {
            jhhVarL = hhbVar.l(new MusicSwipeRefreshLayout(frameLayout.getContext()));
            this.c = jhhVarL;
        }
        jaf jafVar = new jaf();
        jafVar.o(recyclerView);
        jafVar.f(new LinearScrollToItemLayoutManager(frameLayout.getContext()));
        jafVar.g(advnVar);
        jafVar.j(wnfVarA);
        jafVar.l(jayVarA);
        jafVar.m(jerVar.a);
        jafVar.e(xgnVar);
        jafVar.i(gosVar);
        jafVar.h(jhhVarL);
        jafVar.p(aeodVar);
        jafVar.q(vwtVar);
        jav javVarA = jaxVar.a(jafVar.a());
        this.b = javVarA;
        if (vxzVar.m(270, 45835641L)) {
            jhhVarL.a = javVarA;
            javVarA.an = new vsz(this, 1);
            e();
        }
    }

    public static acjx a(apoq apoqVar) {
        agke agkeVarA = new wgd(apoqVar).a();
        int size = agkeVarA.size();
        int i = 0;
        while (i < size) {
            acjx acjxVar = (acjx) agkeVarA.get(i);
            i++;
            if (acjxVar.a() == acjw.c) {
                return acjxVar;
            }
        }
        return null;
    }

    public final void b(apok apokVar, boolean z) {
        jav javVar = this.b;
        if (javVar == null || apokVar == null) {
            return;
        }
        if (!javVar.Q) {
            d(apoq.a);
        }
        adxz adxzVarL = this.m.l(240, 45794845L, false) ? javVar.F : ((aciz) this.p.io()).l(javVar);
        if (adxzVarL == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/voice/views/VoiceSearchSectionListController", "applyMutationOperations", 374, "VoiceSearchSectionListController.java")).t("VoiceSearchFragment section list mutation operations processor is null.");
            return;
        }
        if (g(apokVar)) {
            aihf builder = apokVar.toBuilder();
            builder.copyOnWrite();
            apok apokVar2 = (apok) builder.instance;
            apokVar2.d = null;
            apokVar2.b &= -2;
            apokVar = (apok) builder.build();
        } else if (z && (apokVar.b & 1) == 0) {
            aihf aihfVarCreateBuilder = apou.a.createBuilder();
            if (this.r != null) {
                aihf aihfVarCreateBuilder2 = apov.a.createBuilder();
                aihf aihfVarCreateBuilder3 = apoh.a.createBuilder();
                String str = this.r;
                aihfVarCreateBuilder3.copyOnWrite();
                apoh apohVar = (apoh) aihfVarCreateBuilder3.instance;
                str.getClass();
                apohVar.b = 1;
                apohVar.c = str;
                apoh apohVar2 = (apoh) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                apov apovVar = (apov) aihfVarCreateBuilder2.instance;
                apohVar2.getClass();
                apovVar.c = apohVar2;
                apovVar.b |= 1;
                apov apovVar2 = (apov) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                apou apouVar = (apou) aihfVarCreateBuilder.instance;
                apovVar2.getClass();
                apouVar.d = apovVar2;
                apouVar.c = 1;
            } else {
                aihf aihfVarCreateBuilder4 = apow.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                apow apowVar = (apow) aihfVarCreateBuilder4.instance;
                apowVar.c = 2;
                apowVar.b |= 1;
                apow apowVar2 = (apow) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder.copyOnWrite();
                apou apouVar2 = (apou) aihfVarCreateBuilder.instance;
                apowVar2.getClass();
                apouVar2.d = apowVar2;
                apouVar2.c = 2;
            }
            aihf builder2 = apokVar.toBuilder();
            apou apouVar3 = (apou) aihfVarCreateBuilder.build();
            builder2.copyOnWrite();
            apok apokVar3 = (apok) builder2.instance;
            apouVar3.getClass();
            apokVar3.d = apouVar3;
            apokVar3.b |= 1;
            apokVar = (apok) builder2.build();
        }
        adxzVarL.a(apokVar, new adxo(this, 1));
    }

    public final void c(final String str) {
        aecp aecpVar = this.f;
        if (aecpVar != null) {
            aecpVar.d(Boolean.FALSE);
        }
        String string = UUID.randomUUID().toString();
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(string);
        boolean zIsEmpty = str.isEmpty();
        final String strConcat = strValueOf.concat(strValueOf2);
        if (!zIsEmpty) {
            this.r = strConcat;
        }
        aihf aihfVarCreateBuilder = asev.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asev asevVar = (asev) aihfVarCreateBuilder.instance;
        str.getClass();
        asevVar.b |= 1;
        asevVar.c = str;
        final asev asevVar2 = (asev) aihfVarCreateBuilder.build();
        this.q.execute(afwl.i(new Runnable() { // from class: jmh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                jml jmlVar = this.a;
                afzs afzsVar = (afzs) jmlVar.d.io();
                agke agkeVarR = agke.r("suggestions_section", "zero_state_section");
                agjz agjzVar = new agjz(4);
                asev asevVar3 = asevVar2;
                if (!str.isEmpty()) {
                    String str2 = strConcat;
                    afzsVar.i();
                    asmv asmvVar = asmv.a;
                    agjzVar.h(new axq((asmv) afzsVar.f(1362735572, asevVar3, aihn.getParserForClass(asmv.class)), str2));
                }
                afzsVar.i();
                asmv asmvVar2 = asmv.a;
                agjzVar.h(new axq((asmv) afzsVar.f(362409398, asevVar3, aihn.getParserForClass(asmv.class)), "loading"));
                agke agkeVarG = agjzVar.g();
                aihf aihfVarCreateBuilder2 = apok.a.createBuilder();
                agqs agqsVarListIterator = agkeVarR.listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    String str3 = (String) agqsVarListIterator.next();
                    if (str3 != null && !str3.isEmpty()) {
                        aihf aihfVarCreateBuilder3 = apoj.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = apjf.a.createBuilder();
                        aihf aihfVarCreateBuilder5 = apja.a.createBuilder();
                        aihfVarCreateBuilder5.copyOnWrite();
                        apja apjaVar = (apja) aihfVarCreateBuilder5.instance;
                        aiie aiieVar = apjaVar.c;
                        if (!aiieVar.c()) {
                            apjaVar.c = aihn.mutableCopy(aiieVar);
                        }
                        apjaVar.c.add(str3);
                        aihfVarCreateBuilder5.copyOnWrite();
                        apja apjaVar2 = (apja) aihfVarCreateBuilder5.instance;
                        apjaVar2.b |= 2;
                        apjaVar2.d = true;
                        apja apjaVar3 = (apja) aihfVarCreateBuilder5.build();
                        aihfVarCreateBuilder4.copyOnWrite();
                        apjf apjfVar = (apjf) aihfVarCreateBuilder4.instance;
                        apjaVar3.getClass();
                        apjfVar.c = apjaVar3;
                        apjfVar.b = 2;
                        apjf apjfVar2 = (apjf) aihfVarCreateBuilder4.build();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apoj apojVar = (apoj) aihfVarCreateBuilder3.instance;
                        apjfVar2.getClass();
                        apojVar.c = apjfVar2;
                        apojVar.b = 4;
                        aihfVarCreateBuilder2.cg((apoj) aihfVarCreateBuilder3.build());
                    }
                }
                agqs agqsVarListIterator2 = agkeVarG.listIterator(0);
                while (agqsVarListIterator2.hasNext()) {
                    axq axqVar = (axq) agqsVarListIterator2.next();
                    asmv asmvVar3 = (asmv) axqVar.a;
                    String str4 = (String) axqVar.b;
                    aihh aihhVar = (aihh) akrn.a.createBuilder();
                    acxu.b(aihhVar, asmvVar3);
                    if (str4 != null && !str4.isEmpty()) {
                        aihh aihhVar2 = (aihh) akro.a.createBuilder();
                        aihhVar2.copyOnWrite();
                        akro akroVar = (akro) aihhVar2.instance;
                        akroVar.b |= 16777216;
                        akroVar.i = str4;
                        akro akroVar2 = (akro) aihhVar2.build();
                        aihhVar.copyOnWrite();
                        akrn akrnVar = (akrn) aihhVar.instance;
                        akroVar2.getClass();
                        akrnVar.c = akroVar2;
                        akrnVar.b |= 2;
                    }
                    aihh aihhVar3 = (aihh) amgg.a.createBuilder();
                    aihf aihfVarCreateBuilder6 = amgj.a.createBuilder();
                    akrn akrnVar2 = (akrn) aihhVar.build();
                    aihfVarCreateBuilder6.copyOnWrite();
                    amgj amgjVar = (amgj) aihfVarCreateBuilder6.instance;
                    akrnVar2.getClass();
                    amgjVar.dP = akrnVar2;
                    amgjVar.i |= SemanticState.LiveRegion;
                    aihhVar3.j((amgj) aihfVarCreateBuilder6.build());
                    if (str4 != null && !str4.isEmpty()) {
                        aihhVar3.copyOnWrite();
                        amgg amggVar = (amgg) aihhVar3.instance;
                        amggVar.c |= 4;
                        amggVar.g = str4;
                        aihhVar3.copyOnWrite();
                        amgg amggVar2 = (amgg) aihhVar3.instance;
                        amggVar2.c |= 32;
                        amggVar2.i = str4;
                    }
                    aihf aihfVarCreateBuilder7 = apoj.a.createBuilder();
                    aihf aihfVarCreateBuilder8 = ambj.a.createBuilder();
                    aihf aihfVarCreateBuilder9 = apox.a.createBuilder();
                    amgg amggVar3 = (amgg) aihhVar3.build();
                    aihfVarCreateBuilder9.copyOnWrite();
                    apox apoxVar = (apox) aihfVarCreateBuilder9.instance;
                    amggVar3.getClass();
                    apoxVar.m = amggVar3;
                    apoxVar.b |= 32;
                    aihfVarCreateBuilder8.bv((apox) aihfVarCreateBuilder9.build());
                    aihf aihfVarCreateBuilder10 = ambd.a.createBuilder();
                    aihfVarCreateBuilder10.copyOnWrite();
                    ambd ambdVar = (ambd) aihfVarCreateBuilder10.instance;
                    ambdVar.c = 2;
                    ambdVar.b |= 1;
                    ambd ambdVar2 = (ambd) aihfVarCreateBuilder10.build();
                    aihfVarCreateBuilder8.copyOnWrite();
                    ambj ambjVar = (ambj) aihfVarCreateBuilder8.instance;
                    ambdVar2.getClass();
                    ambjVar.c = ambdVar2;
                    ambjVar.b = 3;
                    ambj ambjVar2 = (ambj) aihfVarCreateBuilder8.build();
                    aihfVarCreateBuilder7.copyOnWrite();
                    apoj apojVar2 = (apoj) aihfVarCreateBuilder7.instance;
                    ambjVar2.getClass();
                    apojVar2.c = ambjVar2;
                    apojVar2.b = 6;
                    aihfVarCreateBuilder2.cg((apoj) aihfVarCreateBuilder7.build());
                }
                jmlVar.g.execute(afwl.i(new jmi(jmlVar, (apok) aihfVarCreateBuilder2.build(), 0)));
            }
        }));
    }

    public final void d(apoq apoqVar) {
        jav javVar = this.b;
        if (javVar == null || apoqVar == null) {
            return;
        }
        javVar.as(new wgd(apoqVar));
        if (this.m.m(270, 45835641L)) {
            javVar.z();
            if (apoqVar.g.size() > 0) {
                this.i = a(apoqVar);
                this.j = true;
            }
        }
        e();
    }

    public final void e() {
        if (this.m.m(270, 45835641L)) {
            this.c.b(true != f() ? 3 : 1);
        }
    }

    public final boolean f() {
        return this.i != null;
    }

    public final boolean g(apok apokVar) {
        if (!this.m.m(270, 45835641L)) {
            return false;
        }
        for (apoj apojVar : apokVar.c) {
            int i = apojVar.b;
            if (i == 6) {
                ambj ambjVar = i == 6 ? (ambj) apojVar.c : ambj.a;
                int iAS = a.aS((ambjVar.b == 3 ? (ambd) ambjVar.c : ambd.a).c);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
