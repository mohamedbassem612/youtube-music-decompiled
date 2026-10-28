package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.material.tabs.TabLayout;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkl implements afdg, hkt {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/navigation/DefaultPivotBarController");
    private final vxz A;
    private final vxz B;
    private final syn C;
    public final aduv b;
    public final hlv c;
    public final Executor d;
    public TabLayout g;
    public hkv h;
    public wqe i;
    public xgn j;
    public final vxe k;
    public final Context l;
    public final cf m;
    public final Executor n;
    public final hkq o;
    public final hke q;
    public final vxz r;
    public final aapw s;
    public final hfn t;
    public final ci u;
    private final Resources v;
    private final tbt w;
    private final jki x;
    private final zwb y;
    private final tfq z;
    public int p = 0;
    public List f = new ArrayList();
    public final Map e = new HashMap();

    public hkl(Context context, aapw aapwVar, tbt tbtVar, hke hkeVar, aduv aduvVar, jki jkiVar, hlv hlvVar, Executor executor, ci ciVar, zwb zwbVar, hfn hfnVar, vxe vxeVar, cf cfVar, syn synVar, Executor executor2, hkq hkqVar, tfq tfqVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        this.l = context;
        this.v = context.getResources();
        this.s = aapwVar;
        this.w = tbtVar;
        this.b = aduvVar;
        this.q = hkeVar;
        this.x = jkiVar;
        this.c = hlvVar;
        this.d = executor;
        this.u = ciVar;
        this.y = zwbVar;
        this.t = hfnVar;
        this.k = vxeVar;
        this.m = cfVar;
        this.C = synVar;
        this.n = executor2;
        this.o = hkqVar;
        this.z = tfqVar;
        this.r = vxzVar;
        this.A = vxzVar2;
        this.B = vxzVar3;
        hkeVar.a(this);
        tbtVar.f(this);
    }

    private static aonl n(String str, String str2, aliz alizVar) {
        aihf aihfVarCreateBuilder = aonl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aonl aonlVar = (aonl) aihfVarCreateBuilder.instance;
        aonlVar.b |= 1;
        aonlVar.e = str;
        aihf aihfVarCreateBuilder2 = ajmf.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ajmf ajmfVar = (ajmf) aihfVarCreateBuilder2.instance;
        ajmfVar.b |= 1;
        ajmfVar.c = str;
        ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder2.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajmj.a, ajmfVar2);
        aihfVarCreateBuilder.copyOnWrite();
        aonl aonlVar2 = (aonl) aihfVarCreateBuilder.instance;
        ajwo ajwoVar = (ajwo) aihhVar.build();
        ajwoVar.getClass();
        aonlVar2.g = ajwoVar;
        aonlVar2.b |= 4;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aonl aonlVar3 = (aonl) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        aonlVar3.d = aljaVar2;
        aonlVar3.c = 5;
        alay alayVarC = ackj.c(str2);
        aihfVarCreateBuilder.copyOnWrite();
        aonl aonlVar4 = (aonl) aihfVarCreateBuilder.instance;
        alayVarC.getClass();
        aonlVar4.i = alayVarC;
        aonlVar4.b |= 32;
        return (aonl) aihfVarCreateBuilder.build();
    }

    private final void o(afdk afdkVar) {
        aonl aonlVar = (aonl) this.f.get(afdkVar.c);
        xgn xgnVar = this.j;
        if (xgnVar != null && (aonlVar.b & SemanticState.ReadOnly) != 0) {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aonlVar.j, (amud) null), null);
        }
        if ((aonlVar.b & 8) != 0) {
            vxe vxeVar = this.k;
            ajwo ajwoVar = aonlVar.h;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
        if (aonlVar.e.equals("FEmusic_library_landing")) {
            if (!this.z.i()) {
                this.q.c(aonlVar.e, kro.ai("FEmusic_offline"));
                return;
            } else {
                cf cfVar = this.m;
                taf.g(taf.a(cfVar, afxd.f(taf.a(cfVar, afxd.f(this.C.n(this.y.e())), new gmv(this, 19))).h(new gpr(3), this.d), new hdn(7)), new gov(this, aonlVar, 12));
                return;
            }
        }
        ajwo ajwoVar2 = aonlVar.g;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar2.c(aihlVarCheckIsLite);
        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
            hke hkeVar = this.q;
            String str = aonlVar.e;
            ajwo ajwoVar3 = aonlVar.g;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            hkeVar.c(str, ajwoVar3);
            return;
        }
        String str2 = aonlVar.e;
        if ("FEsearch".equals(str2)) {
            b(str2);
        }
        vxe vxeVar2 = this.k;
        ajwo ajwoVar4 = aonlVar.g;
        if (ajwoVar4 == null) {
            ajwoVar4 = ajwo.a;
        }
        vxeVar2.a(ajwoVar4);
    }

    public final void a() {
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            tabLayout.setVisibility(8);
        }
    }

    public final void b(String str) {
        Optional optionalEmpty = TextUtils.isEmpty(str) ? Optional.empty() : Collection.EL.stream(this.f).filter(new hkn(str, 0)).findFirst();
        hkp hkpVar = new hkp(this, 1);
        if (true == optionalEmpty.isPresent()) {
            aonl aonlVar = (aonl) optionalEmpty.get();
            hkl hklVar = (hkl) hkpVar.a;
            if (hklVar.g != null) {
                for (aonl aonlVar2 : hklVar.f) {
                    afdk afdkVar = (afdk) hklVar.e.get(aonlVar2.e);
                    if (afdkVar != null && afdkVar.d != null) {
                        boolean zEquals = aonlVar2.e.equals(aonlVar.e);
                        ImageView imageView = (ImageView) afdkVar.d.findViewById(R.id.icon);
                        izf izfVar = (izf) hklVar.b;
                        aliz alizVarA = aliz.a((aonlVar2.c == 5 ? (alja) aonlVar2.d : alja.a).c);
                        if (alizVarA == null) {
                            alizVarA = aliz.UNKNOWN;
                        }
                        int iB = izfVar.d.b((zEquals && izfVar.c.containsKey(alizVarA)) ? (arqz) izfVar.f.get(alizVarA) : (arqz) izfVar.e.get(alizVarA));
                        if (iB == 0) {
                            Integer num = (zEquals && izfVar.c.containsKey(alizVarA)) ? (Integer) izfVar.c.get(alizVarA) : (Integer) izfVar.b.get(alizVarA);
                            iB = num != null ? num.intValue() : 0;
                        }
                        imageView.setImageResource(iB);
                    }
                }
            }
        }
    }

    public final void c(xgn xgnVar) {
        alrc alrcVar;
        ajnf ajnfVar;
        wqe wqeVar = this.i;
        if (wqeVar == null || (alrcVar = wqeVar.a) == null || (alrcVar.b & 16) == 0) {
            return;
        }
        this.j = xgnVar;
        xgnVar.d(new xgj(alrcVar.e.G()));
        if (alrcVar.d.size() != 0) {
            for (alrd alrdVar : alrcVar.d) {
                int i = alrdVar.b;
                if (i == 117866661) {
                    for (aonn aonnVar : ((aonm) alrdVar.c).b) {
                        aonl aonlVar = aonnVar.b == 117501096 ? (aonl) aonnVar.c : aonl.a;
                        if ((aonlVar.b & SemanticState.ReadOnly) != 0) {
                            xgnVar.w(new xgj(aonlVar.j, (amud) null), null);
                        }
                    }
                } else if (i == 123267149) {
                    for (anis anisVar : ((anit) alrdVar.c).b) {
                        ajnf ajnfVar2 = ajnf.a;
                        int i2 = anisVar.b;
                        if (i2 == 65153809) {
                            ajnfVar = (ajnf) anisVar.c;
                        } else if (i2 == 322055134) {
                            apji apjiVar = ((aqoh) anisVar.c).c;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                            apjiVar.c(aihlVarCheckIsLite);
                            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                            ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                        }
                        if ((ajnfVar.b & 2097152) != 0) {
                            xgnVar.w(new xgj(ajnfVar.y, (amud) null), null);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.hkt
    public final void d(String str) {
        k(str);
        b(str);
    }

    @Override // defpackage.afdf
    public final void e(afdk afdkVar) {
        xgt xgtVarA;
        aonl aonlVar = (aonl) this.f.get(afdkVar.c);
        if (!aonlVar.e.equals("FEsearch") || !goa.SEARCH_LANDING_PAGE.j.equals(this.x.e()) || this.B.l(4, 45733117L, false)) {
            if (!aonlVar.e.equals("FEsearch")) {
                o(afdkVar);
                return;
            } else {
                this.m.getSupportFragmentManager().ae(null, -1, 1);
                o(afdkVar);
                return;
            }
        }
        xgn xgnVar = this.j;
        if (xgnVar != null && (aonlVar.b & SemanticState.ReadOnly) != 0) {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_DOUBLE_CLICK, new xgj(aonlVar.j, (amud) null), null);
        }
        apng apngVar = apng.a;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apni.a, apngVar);
        xgn xgnVar2 = this.j;
        if (xgnVar2 != null && (xgtVarA = xgnVar2.a()) != null) {
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            String strI = this.j.i();
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            strI.getClass();
            aoarVar.b |= 1;
            aoarVar.c = strI;
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar2.b |= 2;
            aoarVar2.d = xgtVarA.f;
            aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        }
        this.k.a((ajwo) aihhVar.build());
    }

    @Override // defpackage.afdf
    public final void f(afdk afdkVar) {
        o(afdkVar);
    }

    public final void h() {
        int i = 1;
        avye avyeVar = new avye(new hkh(this, i));
        avnn avnnVar = atqp.n;
        avye avyeVar2 = new avye(new hkh(this, 0));
        avnn avnnVar2 = atqp.n;
        ArrayList arrayList = new ArrayList();
        Resources resources = this.v;
        arrayList.add(n("FEmusic_home", resources.getString(R.string.pivot_home), aliz.TAB_HOME));
        if (this.B.l(0, 45712947L, false)) {
            arrayList.add(n("FEsearch", resources.getString(R.string.search), aliz.SEARCH));
        } else {
            arrayList.add(n("FEmusic_explore", resources.getString(R.string.pivot_explore), aliz.TAB_EXPLORE));
        }
        arrayList.add(n("FEmusic_library_landing", resources.getString(R.string.pivot_library), this.A.l(197, 45714728L, false) ? aliz.TAB_BOOKMARK : aliz.LIBRARY_MUSIC));
        agke agkeVarR = agke.r(avyeVar.h(new hkk(arrayList)), avyeVar2);
        int i2 = avlh.a;
        avue avueVar = new avue(agkeVarR);
        avnn avnnVar3 = atqp.j;
        avueVar.j(awae.INSTANCE).i(new abwr(i)).al(new avni() { // from class: hki
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v35 */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
            @Override // defpackage.avni
            public final void a(Object obj) {
                alrc alrcVar;
                alay alayVar;
                afdm afdmVar;
                alrc alrcVar2;
                hkk hkkVar = (hkk) obj;
                Object obj2 = hkkVar.b;
                final hkl hklVar = this.a;
                hklVar.i = (wqe) obj2;
                if (hkkVar.a && hklVar.i != null && (!hklVar.r.l(46, 45824499L, false) || ((alrcVar2 = hklVar.i.a) != null && alrcVar2.d.size() > 0))) {
                    hlv hlvVar = hklVar.c;
                    wqe wqeVar = hklVar.i;
                    wqeVar.getClass();
                    hlvVar.a().e(wqeVar);
                }
                Object obj3 = hkkVar.c;
                ?? arrayList2 = obj3;
                if (obj3 == null) {
                    arrayList2 = new ArrayList();
                }
                hklVar.f = arrayList2;
                hke hkeVar = hklVar.q;
                hklVar.k(hkeVar.c);
                TabLayout tabLayout = hklVar.g;
                if (tabLayout != null) {
                    tabLayout.j();
                    Map map = hklVar.e;
                    map.clear();
                    for (final aonl aonlVar : hklVar.f) {
                        TabLayout tabLayout2 = hklVar.g;
                        if (tabLayout2 != null) {
                            View viewInflate = LayoutInflater.from(tabLayout2.getContext()).inflate(R.layout.image_with_text_tab, (ViewGroup) hklVar.g, false);
                            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
                            TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
                            int i3 = aonlVar.c;
                            if (i3 == 5) {
                                aduv aduvVar = hklVar.b;
                                aliz alizVarA = aliz.a((i3 == 5 ? (alja) aonlVar.d : alja.a).c);
                                if (alizVarA == null) {
                                    alizVarA = aliz.UNKNOWN;
                                }
                                imageView.setImageResource(aduvVar.a(alizVarA));
                            }
                            if ((aonlVar.b & 32) != 0) {
                                alayVar = aonlVar.i;
                                if (alayVar == null) {
                                    alayVar = alay.a;
                                }
                            } else {
                                alayVar = null;
                            }
                            textView.setText(ackj.k(null, alayVar, null, false));
                            afdk afdkVarD = hklVar.g.d();
                            afdkVarD.d(viewInflate);
                            if ((aonlVar.b & 16384) != 0 && (afdmVar = afdkVarD.g) != null) {
                                afdmVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: hkf
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        ajwo ajwoVar = aonlVar.k;
                                        if (ajwoVar == null) {
                                            ajwoVar = ajwo.a;
                                        }
                                        hklVar.k.a(ajwoVar);
                                        return true;
                                    }
                                });
                            }
                            boolean z = hklVar.r.l(18, 45687381L, false) && aonlVar.e.equals(hkeVar.c);
                            TabLayout tabLayout3 = hklVar.g;
                            tabLayout3.g(afdkVarD, tabLayout3.b(), z);
                            map.put(aonlVar.e, afdkVarD);
                            hkeVar.b(aonlVar.e);
                            afdm afdmVar2 = afdkVarD.g;
                            if (afdmVar2 != null && afdmVar2.getVisibility() == 0) {
                                hklVar.u.af(aonlVar, afdkVarD.g);
                            }
                        }
                    }
                    hklVar.b(hkeVar.c);
                    hklVar.l();
                    hkv hkvVar = hklVar.h;
                    if (hkvVar != null) {
                        ((MusicActivity) hkvVar).e().o();
                    }
                }
                xgn xgnVar = hklVar.j;
                if (xgnVar != null && xgnVar.a() != null) {
                    hklVar.c(hklVar.j);
                }
                hkq hkqVar = hklVar.o;
                Object obj4 = hkkVar.b;
                if (obj4 == null || (alrcVar = ((wqe) obj4).a) == null) {
                    return;
                }
                tqj tqjVar = hkqVar.c;
                int i4 = tqr.a;
                if (tqjVar.k(1073829886) && (alrcVar.b & 16384) != 0) {
                    arbj arbjVar = alrcVar.h;
                    if (arbjVar == null) {
                        arbjVar = arbj.a;
                    }
                    rmw rmwVar = (rmw) hkqVar.b.io();
                    String str = arbjVar.c;
                    String str2 = arbjVar.b;
                    aqmh aqmhVar = arbjVar.d;
                    if (aqmhVar == null) {
                        aqmhVar = aqmh.a;
                    }
                    rmwVar.s(new rmv(str, str2, aqmhVar, arbjVar.e, arbjVar.f));
                }
                Optional optionalFindFirst = Collection.EL.stream(alrcVar.d).filter(new gqn(2)).findFirst();
                if (true == optionalFindFirst.isPresent()) {
                    alrd alrdVar = (alrd) optionalFindFirst.get();
                    optionalFindFirst = Optional.ofNullable(alrdVar.b == 123267149 ? (anit) alrdVar.c : anit.a);
                }
                hkp hkpVar = new hkp(hkqVar, 0);
                if (true == optionalFindFirst.isPresent()) {
                    Object obj5 = optionalFindFirst.get();
                    hkq hkqVar2 = (hkq) hkpVar.a;
                    hkqVar2.d = (anit) obj5;
                    hkqVar2.a.invalidateOptionsMenu();
                }
            }
        }, new gfh(18));
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        h();
    }

    public final void i() {
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            tabLayout.setTranslationY(0.0f);
        }
    }

    public final void j() {
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            tabLayout.setVisibility(0);
        }
    }

    public final void k(String str) {
        boolean z = true;
        if (this.B.l(1, 45715026L, false) && "FEmusic_library_landing".equals(str)) {
            z = false;
        } else {
            for (int i = 0; i < this.f.size(); i++) {
                if (!((aonl) this.f.get(i)).e.equals("FEsearch")) {
                }
            }
            z = false;
        }
        this.w.c(new ino(z));
    }

    public final void l() {
        FrameLayout.LayoutParams layoutParams;
        List list;
        String strE;
        TabLayout tabLayout = this.g;
        if (tabLayout == null || (layoutParams = (FrameLayout.LayoutParams) tabLayout.getLayoutParams()) == null) {
            return;
        }
        if (!this.y.u() || (list = this.f) == null || list.isEmpty() || ((strE = this.x.e()) != null && (strE.equals("TAGmusic_onboarding_genre_selection") || strE.equals("TAGmusic_language_selection") || strE.equals("FEmusic_radio_builder")))) {
            layoutParams.height = this.t.J();
            TabLayout tabLayout2 = this.g;
            tabLayout2.setBackgroundColor(tabLayout2.getContext().getColor(R.color.ytm_color_black));
            this.g.setImportantForAccessibility(4);
        } else {
            layoutParams.height = -2;
            TabLayout tabLayout3 = this.g;
            tabLayout3.setBackgroundColor(tabLayout3.getContext().getColor(R.color.ytm_color_grey_12));
            this.g.setImportantForAccessibility(1);
        }
        this.g.setLayoutParams(layoutParams);
    }

    public final boolean m() {
        TabLayout tabLayout = this.g;
        return tabLayout != null && tabLayout.getVisibility() == 0;
    }

    @Override // defpackage.afdf
    public final void g(afdk afdkVar) {
    }
}
