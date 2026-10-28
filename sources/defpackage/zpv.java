package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpv implements zpu {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/metadataeditor/elements/suggest/SocialSuggestControllerImpl");
    public final aepb a;
    adwg b;
    private final Context d;
    private final advb e;
    private final advn f;
    private final xgm g;
    private final ttm h;
    private final vyo i;
    private final avlh j;
    private final String k;
    private final tbt l;
    private final adxi m;
    private final xeu n;
    private RecyclerView o;
    private String p;
    private String q;
    private boolean r;
    private zpr s;
    private final vxz t;
    private final vxz u;
    private final abte v;
    private final ahek w;
    private final ahub x;
    private final dov y;

    /* JADX WARN: Type inference failed for: r3v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public zpv(ahek ahekVar, advb advbVar, advn advnVar, tbt tbtVar, jaz jazVar, xgm xgmVar, ttm ttmVar, vyo vyoVar, avlh avlhVar, ahtv ahtvVar, xeu xeuVar, abte abteVar, dov dovVar, vxz vxzVar, vxz vxzVar2, Context context, ahub ahubVar, aepd aepdVar, String str) {
        this.d = context;
        this.w = ahekVar;
        this.e = advbVar;
        this.f = advnVar;
        this.l = tbtVar;
        this.m = jazVar.a(wnf.q, xgmVar.hB());
        this.g = xgmVar;
        this.h = ttmVar;
        this.i = vyoVar;
        this.j = avlhVar;
        this.n = xeuVar;
        this.v = abteVar;
        this.y = dovVar;
        this.t = vxzVar;
        Executor executor = (Executor) ahtvVar.b.io();
        executor.getClass();
        Executor executor2 = (Executor) ahtvVar.a.io();
        executor2.getClass();
        this.a = new aepb(aepdVar, executor, executor2);
        this.x = ahubVar;
        this.k = str;
        this.s = null;
        this.o = null;
        this.q = "";
        this.u = vxzVar2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    private final void k(int i, int i2) {
        int i3;
        xfh xfhVar = new xfh(i - 1, 20);
        aihf aihfVarCreateBuilder = aqat.a.createBuilder();
        String str = this.k;
        int iHashCode = str.hashCode();
        if (iHashCode != 35) {
            if (iHashCode == 64 && str.equals("@")) {
                i3 = 3;
            } else {
                i3 = 1;
            }
        } else if (str.equals("#")) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aqat aqatVar = (aqat) aihfVarCreateBuilder.instance;
        aqatVar.c = i3 - 1;
        aqatVar.b |= 1;
        if (i2 != -1) {
            aihfVarCreateBuilder.copyOnWrite();
            aqat aqatVar2 = (aqat) aihfVarCreateBuilder.instance;
            aqatVar2.b |= 2;
            aqatVar2.d = i2;
        }
        aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
        aqat aqatVar3 = (aqat) aihfVarCreateBuilder.build();
        aqatVar3.getClass();
        akzkVar.i = aqatVar3;
        akzkVar.b |= SemanticState.Obscured;
        xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
        this.v.e(xfhVar, alai.FLOW_TYPE_SOCIAL_SUGGESTIONS, this.q);
    }

    private final void l(int i) {
        aihf aihfVarN = n(i);
        if (aihfVarN != null) {
            m(aihfVarN);
        }
    }

    private final void m(aihf aihfVar) {
        xeu xeuVar = this.n;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVar, alot.USER_MENTION_AUTO_COMPLETE_BOX_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arbf arbfVar = (arbf) aihfVar.build();
        arbfVar.getClass();
        alouVar.d = arbfVar;
        alouVar.c = 227;
        xeuVar.b((alou) alosVar.build());
    }

    private final aihf n(int i) {
        if (this.p == null) {
            return null;
        }
        aihf aihfVarCreateBuilder = arbf.a.createBuilder();
        String str = this.p;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar = (arbf) aihfVarCreateBuilder.instance;
        str.getClass();
        arbfVar.b |= 1;
        arbfVar.e = str;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar2 = (arbf) aihfVarCreateBuilder.instance;
        arbfVar2.f = i - 1;
        arbfVar2.b |= 2;
        return aihfVarCreateBuilder;
    }

    private static boolean o(aciz acizVar) {
        if (acizVar == null || acizVar.s() == null) {
            return true;
        }
        wgd wgdVarS = acizVar.s();
        if (wgdVarS.b().isEmpty()) {
            return true;
        }
        if (wgdVarS.b().size() != 1 || !(wgdVarS.b().get(0) instanceof wga)) {
            return false;
        }
        wga wgaVar = (wga) wgdVarS.b().get(0);
        if (wgaVar.b == null) {
            amgg amggVar = wgaVar.a;
            wgaVar.b = new ArrayList(amggVar.e.size());
            for (amgj amgjVar : amggVar.e) {
                if ((amgjVar.d & 2) != 0) {
                    apun apunVar = amgjVar.aD;
                    if (apunVar == null) {
                        apunVar = apun.a;
                    }
                    if ((apunVar.b & 16777216) != 0) {
                        apup apupVar = apunVar.l;
                        if (apupVar == null) {
                            apupVar = apup.a;
                        }
                        if ((apupVar.b & 4) != 0) {
                            wgaVar.b.add(new wfz(apunVar));
                        } else {
                            apup apupVar2 = apunVar.l;
                            if (apupVar2 == null) {
                                apupVar2 = apup.a;
                            }
                            if ((apupVar2.b & 8) != 0) {
                                wgaVar.b.add(new wgh(apunVar));
                            }
                        }
                    }
                } else {
                    MessageLite messageLiteEu = yno.eu(amgjVar);
                    if (messageLiteEu != null) {
                        wgaVar.b.add(messageLiteEu);
                    }
                }
            }
        }
        return wgaVar.b.isEmpty();
    }

    @Override // defpackage.zpu
    public final zpx a(int i) {
        adwg adwgVar = this.b;
        if (adwgVar != null && i >= 0) {
            adlq adlqVar = adwgVar.j;
            if (i < adlqVar.a()) {
                return new zpy(((acxm) adlqVar.d(i)).a, 1);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.zpu
    public final void c(String str) {
        aepb aepbVar = this.a;
        aepbVar.c.execute(new aead(aepbVar, str, 18));
        l(6);
        k(6, -1);
    }

    @Override // defpackage.zpu
    public final void d(int i) {
        aihf aihfVarN = n(4);
        if (aihfVarN != null) {
            aihf aihfVarCreateBuilder = arbe.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            arbe arbeVar = (arbe) aihfVarCreateBuilder.instance;
            arbeVar.b |= 1;
            arbeVar.c = i;
            if (this.t.m(5, 45617552L)) {
                boolean z = this.r;
                aihfVarCreateBuilder.copyOnWrite();
                arbe arbeVar2 = (arbe) aihfVarCreateBuilder.instance;
                arbeVar2.b |= 2;
                arbeVar2.d = z;
            }
            aihfVarN.copyOnWrite();
            arbf arbfVar = (arbf) aihfVarN.instance;
            arbe arbeVar3 = (arbe) aihfVarCreateBuilder.build();
            arbf arbfVar2 = arbf.a;
            arbeVar3.getClass();
            arbfVar.d = arbeVar3;
            arbfVar.c = 3;
            m(aihfVarN);
        }
        k(4, i);
    }

    @Override // defpackage.zpu
    public final void e() {
        if (this.k.equals("@")) {
            this.p = this.y.af(16);
        }
        this.q = this.y.af(16);
        l(2);
        k(2, -1);
        try {
            aciz acizVar = (aciz) ahng.v(this.x.q(""));
            if (o(acizVar)) {
                return;
            }
            j(acizVar);
        } catch (ExecutionException e) {
            ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/metadataeditor/elements/suggest/SocialSuggestControllerImpl", "startSuggestionsFlow", (char) 214, "SocialSuggestControllerImpl.java")).t("Error getting zero-prefix");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.zpu
    public final void f() {
        aepb aepbVar = this.a;
        ?? r1 = aepbVar.d;
        if (r1 != 0 && !r1.isCancelled() && !aepbVar.d.isDone()) {
            aepbVar.d.cancel(true);
        }
        l(3);
        k(3, -1);
    }

    @Override // defpackage.zpu
    public final boolean g() {
        String str = this.k;
        if (str.equals("#")) {
            return true;
        }
        return str.equals("@") && this.t.m(5, 45617552L);
    }

    @Override // defpackage.zpu
    public final boolean h() {
        return this.k.equals("@");
    }

    @Override // defpackage.zpu
    public final void i(zpr zprVar, RecyclerView recyclerView) {
        this.s = zprVar;
        this.o = recyclerView;
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top);
        RecyclerView recyclerView2 = this.o;
        if (recyclerView2 != null) {
            recyclerView2.setPadding(0, dimensionPixelSize, 0, 0);
            this.o.setClipToPadding(false);
            this.o.af(null);
            this.o.setMotionEventSplittingEnabled(false);
        }
        adss adssVar = new adss();
        advb advbVar = this.e;
        adssVar.c((admh) advbVar.io());
        adst adstVar = new adst();
        adstVar.n(this.o);
        ahek ahekVar = this.w;
        admh admhVar = (admh) advbVar.io();
        admhVar.getClass();
        adstVar.g(ahekVar.d(admhVar));
        adstVar.f(this.f);
        adstVar.c(this.l);
        adstVar.l(this.m);
        adstVar.b(this.h);
        adstVar.e(this.g.hB());
        adstVar.d(this.i);
        adstVar.i(this.j);
        adstVar.m(this.u);
        adssVar.b(adstVar.a());
        this.b = new adwg(adssVar.a());
    }

    public final void j(aciz acizVar) {
        adwg adwgVar = this.b;
        if (adwgVar != null) {
            boolean zIsEmpty = adwgVar.j.isEmpty();
            boolean zO = o(acizVar);
            RecyclerView recyclerView = this.o;
            if (zO) {
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                adwgVar.M(false);
                this.r = false;
            } else {
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                adwgVar.as(acizVar.s());
                this.r = ((String) acizVar.b).isEmpty();
            }
            zpr zprVar = this.s;
            if (zprVar != null) {
                zprVar.f(zO);
            }
            if (zIsEmpty && !zO) {
                l(5);
                k(5, -1);
            }
            l(7);
            k(7, -1);
        }
    }

    @Override // defpackage.zpu
    public final void b() {
    }
}
