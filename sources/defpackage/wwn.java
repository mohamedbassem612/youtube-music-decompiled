package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwn implements twn, wxi {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/livechat/controller/LiveChatController");
    private final wwc A;
    private final wxe B;
    private final wxc C;
    private final wwx D;
    private final tbt E;
    private final abvk F;
    private final abvn G;
    private final abmt H;
    private final wyv I;
    private final Handler J;
    private final avmb K;
    private final wyl L;
    private final Executor M;
    private final vxe N;
    private final aeba O;
    private final ahey P;
    private boolean Q;
    private long R;
    private boolean S;
    private tbv T;
    private avmn U;
    private avmn V;
    private String W;
    private String X;
    private wwp Y;
    private final wyx Z;
    private final vxz aa;
    private final aeiv ab;
    private final aaok ac;
    private final ahud ad;
    private final ahgb ae;
    public final aaaj b;
    public wvt c;
    public final wxq d;
    public wxr e;
    public List f;
    public final wxl g;
    public xcl h;
    public wwm i;
    public final wws j;
    public final wxa k;
    public final xgn l;
    public final wbz m;
    public final xit n;
    public wwy o;
    public amqm p;
    public String q;
    public final wwv r;
    public final wwk s;
    public final xdb t;
    public final vxz v;
    private final awmd x;
    private xcv y;
    private final wwc z;
    private int w = 0;
    public int u = 1;

    public wwn(wrb wrbVar, wqx wqxVar, aaci aaciVar, tbt tbtVar, abvk abvkVar, abvn abvnVar, abmt abmtVar, ttm ttmVar, Handler handler, aeiv aeivVar, wyv wyvVar, wwk wwkVar, wws wwsVar, wxq wxqVar, xdb xdbVar, acyx acyxVar, wbz wbzVar, vxz vxzVar, zs zsVar, wwf wwfVar, wwd wwdVar, wxl wxlVar, awmd awmdVar, avmb avmbVar, avmb avmbVar2, wyx wyxVar, wyl wylVar, ahud ahudVar, aaok aaokVar, ScheduledExecutorService scheduledExecutorService, mbc mbcVar, ahgb ahgbVar, xgn xgnVar, xgm xgmVar, Executor executor, ahey aheyVar, xit xitVar, zvl zvlVar, vxe vxeVar, aeba aebaVar, vxz vxzVar2) {
        this.E = tbtVar;
        this.F = abvkVar;
        this.G = abvnVar;
        this.H = abmtVar;
        this.ab = aeivVar;
        this.I = wyvVar;
        this.J = handler;
        this.ae = ahgbVar;
        this.s = wwkVar;
        this.j = wwsVar;
        this.t = xdbVar;
        xdbVar.h = this;
        this.z = wwfVar;
        this.A = wwdVar;
        this.g = wxlVar;
        wxlVar.v(this);
        this.x = awmdVar;
        this.aa = vxzVar;
        this.v = vxzVar2;
        this.l = xgnVar;
        this.m = wbzVar;
        this.K = avmbVar;
        this.Z = wyxVar;
        this.L = wylVar;
        this.ad = ahudVar;
        this.ac = aaokVar;
        this.M = executor;
        this.P = aheyVar;
        this.n = xitVar;
        this.N = vxeVar;
        this.O = aebaVar;
        this.c = new wvt(ahgbVar, this);
        this.r = new wwv(acyxVar, new oqe(wbzVar, 9), xgnVar, vxzVar2);
        wxe wxeVar = new wxe(wrbVar, tbtVar, ttmVar, this, xgmVar);
        this.B = wxeVar;
        wwx wwxVar = new wwx(mbcVar);
        this.D = wwxVar;
        this.C = new wxc(wrbVar, scheduledExecutorService, executor, avmbVar2, tbtVar, ttmVar, this, xgmVar, wwxVar, zvlVar, vxzVar2);
        this.o = wxeVar;
        this.k = new wxa(wqxVar, tbtVar, ttmVar, this, xgmVar, executor);
        if (vxzVar.m(26, 45629546L)) {
            this.d = wxqVar;
        } else {
            this.d = new wyq(handler, zsVar, acyxVar, avmbVar);
        }
        this.b = new aaaj(wxeVar, aaciVar, new xxj(this));
    }

    private final wwy G() {
        return (!this.aa.m(37, 45661615L) || this.D.b() || this.e == null) ? this.B : this.C;
    }

    private final void H(amqm amqmVar) {
        wwn wwnVar;
        boolean z = false;
        if (amqmVar.g.size() > 0) {
            ajwo ajwoVar = (ajwo) amqmVar.g.get(0);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammw.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            }
        }
        if (amqmVar.m || z) {
            wwnVar = this;
            wwnVar.c = new wvu(wwnVar.J, wwnVar.ae, wwnVar, wwnVar, wwnVar.P, wwnVar.v);
        } else if (this.aa.m(58, 45718569L) && G() == this.C) {
            ahgb ahgbVar = this.ae;
            ahey aheyVar = this.P;
            amqp amqpVar = amqmVar.u;
            if (amqpVar == null) {
                amqpVar = amqp.a;
            }
            long j = amqpVar.b;
            amqp amqpVar2 = amqmVar.u;
            if (amqpVar2 == null) {
                amqpVar2 = amqp.a;
            }
            long j2 = amqpVar2.c;
            aheyVar.getClass();
            wvw wvwVar = new wvw(ahgbVar, this, aheyVar, j, j2);
            wwnVar = this;
            wwnVar.c = wvwVar;
        } else {
            wwnVar = this;
            wwnVar.c = new wvv(wwnVar.J, wwnVar.ae, wwnVar, wwnVar.P, wwnVar.v);
        }
        wwnVar.c.d();
    }

    private final void I(amqm amqmVar, wek wekVar) {
        String str = this.q;
        if (str != null) {
            wer werVarE = wekVar.e();
            werVarE.j(str);
            werVarE.b().G();
        }
        this.q = amqmVar.q.isEmpty() ? null : amqmVar.q;
    }

    private final synchronized void J() {
        tbv tbvVar = this.T;
        if (tbvVar != null) {
            this.E.k(tbvVar);
            this.T = null;
        }
        Object obj = this.U;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.U = null;
        }
    }

    private final synchronized void K() {
        J();
        if (x() && this.o == this.k) {
            F();
        }
    }

    @Override // defpackage.wxi
    public final wwv A() {
        return this.r;
    }

    @Override // defpackage.wxi
    public final wws C() {
        return this.j;
    }

    @Override // defpackage.wxi
    public final xdb D() {
        return this.t;
    }

    public final synchronized void E(wwp wwpVar) {
        this.Y = wwpVar;
    }

    public final synchronized void F() {
        J();
        if (this.H.bB(512L)) {
            this.U = ((avlh) this.G.r().j).P().al(new vva(this, 15), new vqe(12));
        } else {
            this.T = this.E.a(this, aazk.class, new wlg(this, 2));
        }
    }

    public final long a(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amqo amqoVar = (amqo) it.next();
            int i2 = amqoVar.b;
            if ((i2 & 2) != 0) {
                aqmx aqmxVar = amqoVar.d;
                if (aqmxVar == null) {
                    aqmxVar = aqmx.a;
                }
                i = aqmxVar.c;
            } else if ((i2 & 4) != 0 && this.b != null) {
                amfj amfjVar = amqoVar.e;
                if (amfjVar == null) {
                    amfjVar = amfj.a;
                }
                i = amfjVar.d;
            }
            return i;
        }
        return 0L;
    }

    @Override // defpackage.wxi
    public final wwc b() {
        return f() != null ? this.z : this.A;
    }

    @Override // defpackage.wxi
    public final wxl c() {
        return this.g;
    }

    @Override // defpackage.wxi
    public final wxq e() {
        return this.d;
    }

    public final synchronized wxr f() {
        return this.e;
    }

    @Override // defpackage.wxi
    public final Object g(String str) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r12v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    public final synchronized void h(wxr wxrVar) {
        xdh xdhVar;
        xby xbyVarP;
        WrappedLinearLayoutManager wrappedLinearLayoutManager;
        wxr wxrVar2 = this.e;
        if (wxrVar != wxrVar2) {
            if (wxrVar == null) {
                w();
                return;
            }
            if (wxrVar2 != null) {
                CharSequence charSequence = ((xbn) wxrVar2).o;
                Runnable runnable = ((xbn) wxrVar2).p;
                ((xbn) wxrVar).o = charSequence;
                ((xbn) wxrVar).p = runnable;
                int i = ((xbn) wxrVar2).n;
                if (i == 0 || i == 1) {
                    ((xbn) wxrVar).o();
                } else if (i != 2) {
                    ((xbn) wxrVar).n(((xbn) wxrVar).o, ((xbn) wxrVar).p);
                } else {
                    ((xbn) wxrVar).m();
                }
            }
            w();
            this.e = wxrVar;
            ((xbn) wxrVar).u = this;
            if (!((xbn) wxrVar).m) {
                View viewS = ((xbn) wxrVar).s();
                if (viewS != null) {
                    viewS.setOnClickListener(new vhv(wxrVar, 17));
                    yno.dA(((xbn) wxrVar).a, viewS);
                }
                RecyclerView recyclerViewQ = ((xbn) wxrVar).q();
                recyclerViewQ.addOnLayoutChangeListener(((xbn) wxrVar).d);
                xbm xbmVar = ((xbn) wxrVar).e;
                recyclerViewQ.aC(xbmVar);
                if (((xbn) wxrVar).w.m(26, 45629546L)) {
                    xby xbyVarP2 = ((xbn) wxrVar).p();
                    if (xbyVarP2 != null && !xbyVarP2.c) {
                        RecyclerView recyclerViewI = xbyVarP2.i();
                        if (recyclerViewI != null) {
                            recyclerViewI.aC(xbyVarP2.k);
                        }
                        xbyVarP2.c = true;
                    }
                } else {
                    RecyclerView recyclerViewR = ((xbn) wxrVar).r();
                    if (recyclerViewR != null) {
                        recyclerViewR.aC(xbmVar);
                    }
                }
                ((xbn) wxrVar).m = true;
            }
            wxr wxrVar3 = this.e;
            if (((xce) wxrVar3).E.m(13, 45760176L)) {
                if (((xce) wxrVar3).D == null) {
                    View view = ((xce) wxrVar3).A;
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.live_ephemeral_widget_overlay);
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.live_persistent_widget_overlay);
                        if (viewGroup != null && viewGroup2 != null) {
                            xdi xdiVar = ((xce) wxrVar3).B;
                            xgn xgnVarHB = ((xce) wxrVar3).z.hB();
                            acyx acyxVar = (acyx) xdiVar.b.io();
                            acyxVar.getClass();
                            advb advbVar = (advb) xdiVar.a.io();
                            advbVar.getClass();
                            ((Optional) ((aupo) xdiVar.c).b).getClass();
                            ((Optional) ((aupo) xdiVar.d).b).getClass();
                            ((mbc) xdiVar.e.io()).getClass();
                            ((Optional) ((aupo) xdiVar.f).b).getClass();
                            cf cfVar = (cf) xdiVar.h.io();
                            cfVar.getClass();
                            ((xsc) xdiVar.i.io()).getClass();
                            ((avmb) xdiVar.j.io()).getClass();
                            ((aeda) xdiVar.k.io()).getClass();
                            xpl xplVar = (xpl) xdiVar.l.io();
                            xplVar.getClass();
                            vxe vxeVar = (vxe) xdiVar.m.io();
                            vxeVar.getClass();
                            ((Executor) xdiVar.n.io()).getClass();
                            xgnVarHB.getClass();
                            view.getClass();
                            ((xce) wxrVar3).D = new xdh(acyxVar, advbVar, cfVar, xplVar, vxeVar, xgnVarHB, viewGroup, viewGroup2, (ViewGroup) view);
                        }
                    }
                }
                xdhVar = ((xce) wxrVar3).D;
            } else {
                xdhVar = null;
            }
            if (xdhVar != null) {
                xdb xdbVar = this.t;
                xdbVar.g = xdhVar;
                xdbVar.g.d = xdbVar;
            }
            if (((xbn) wxrVar).q() != null) {
                wxr wxrVar4 = this.e;
                wwv wwvVar = this.r;
                adlz adlzVar = wwvVar.c;
                if (((xbn) wxrVar4).f != wwvVar) {
                    ((xbn) wxrVar4).f = wwvVar;
                    ahek ahekVar = ((xbn) wxrVar4).x;
                    admo admoVarD = ahekVar != null ? ahekVar.d((admh) ((xbn) wxrVar4).b.io()) : new admo((admh) ((xbn) wxrVar4).b.io(), tym.ap(((xbn) wxrVar4).s));
                    admoVarD.D(wwvVar, null);
                    admoVarD.jR(new adlk(((xbn) wxrVar4).c, 0));
                    if (adlzVar != null) {
                        admoVarD.jR(adlzVar);
                    }
                    RecyclerView recyclerViewQ2 = ((xbn) wxrVar4).q();
                    if (((amoo) ((xbn) wxrVar4).y.b).e && ((xbn) wxrVar4).t() != null) {
                        ((xbn) wxrVar4).q = ((aebi) ((xbn) wxrVar4).t()).a(recyclerViewQ2, admoVarD, null);
                    }
                    advy advyVar = ((xbn) wxrVar4).q;
                    if (advyVar != null) {
                        advyVar.a(recyclerViewQ2);
                    } else {
                        recyclerViewQ2.ad(admoVarD);
                    }
                    recyclerViewQ2.ah(new WrappedLinearLayoutManager(((xbn) wxrVar4).a));
                    recyclerViewQ2.af(null);
                    xch xchVar = ((xbn) wxrVar4).j;
                    if (xchVar != null) {
                        recyclerViewQ2.aH(xchVar);
                    }
                    ((xbn) wxrVar4).j = new xch(((xce) wxrVar4).b, (wwv) ((xce) wxrVar4).f, ((xce) wxrVar4).A);
                    xch xchVar2 = ((xbn) wxrVar4).j;
                    if (xchVar2 != null) {
                        recyclerViewQ2.aJ(xchVar2);
                    }
                }
                RecyclerView recyclerViewQ3 = ((xce) wxrVar4).q();
                if (recyclerViewQ3 != null && (wrappedLinearLayoutManager = (WrappedLinearLayoutManager) recyclerViewQ3.n) != null) {
                    wrappedLinearLayoutManager.setStackFromEnd(((xbn) wxrVar4).y());
                }
            }
            wxq wxqVar = this.d;
            if (wxqVar != null) {
                adkz adkzVarA = wxqVar.a();
                wxr wxrVar5 = this.e;
                vxz vxzVar = ((xbn) wxrVar5).w;
                adlz adlzVarB = wxqVar.b();
                if (!vxzVar.m(26, 45629546L) || (xbyVarP = ((xbn) wxrVar5).p()) == null) {
                    adkz adkzVar = ((xbn) wxrVar5).i;
                    if (adkzVar != adkzVarA) {
                        if (adkzVar != null) {
                            adkzVar.n(((xbn) wxrVar5).t);
                        }
                        ((xbn) wxrVar5).i = adkzVarA;
                        adkz adkzVar2 = ((xbn) wxrVar5).i;
                        if (adkzVar2 != null) {
                            adkzVar2.h(((xbn) wxrVar5).t);
                        }
                        RecyclerView recyclerViewR2 = ((xbn) wxrVar5).r();
                        if (recyclerViewR2 != null) {
                            Context context = ((xbn) wxrVar5).a;
                            WrappedLinearLayoutManager wrappedLinearLayoutManager2 = new WrappedLinearLayoutManager(context);
                            wrappedLinearLayoutManager2.setOrientation(0);
                            recyclerViewR2.ah(wrappedLinearLayoutManager2);
                            if (recyclerViewR2.getTag(R.id.live_chat_ticker_view_decorator_added_tag) == null) {
                                recyclerViewR2.aJ(new xcr(context.getResources().getDimensionPixelOffset(R.dimen.live_chat_ticker_header_width)));
                                recyclerViewR2.setTag(R.id.live_chat_ticker_view_decorator_added_tag, Boolean.TRUE);
                            }
                            admo admoVarD2 = ((xbn) wxrVar5).x.d((admh) ((xbn) wxrVar5).b.io());
                            admoVarD2.D(adkzVarA, null);
                            admoVarD2.jR(new adlk(((xbn) wxrVar5).c, 0));
                            if (adlzVarB != null) {
                                admoVarD2.jR(adlzVarB);
                            }
                            recyclerViewR2.ad(admoVarD2);
                        }
                    }
                } else {
                    adkz adkzVar3 = xbyVarP.b;
                    if (adkzVar3 != adkzVarA) {
                        if (adkzVar3 != null) {
                            adkzVar3.n(xbyVarP.m);
                        }
                        xbyVarP.b = adkzVarA;
                        adkz adkzVar4 = xbyVarP.b;
                        if (adkzVar4 != null) {
                            adkzVar4.h(xbyVarP.m);
                        }
                        RecyclerView recyclerViewI2 = xbyVarP.i();
                        if (recyclerViewI2 != null) {
                            Context context2 = xbyVarP.g;
                            WrappedLinearLayoutManager wrappedLinearLayoutManager3 = new WrappedLinearLayoutManager(context2);
                            wrappedLinearLayoutManager3.setOrientation(0);
                            recyclerViewI2.ah(wrappedLinearLayoutManager3);
                            if (recyclerViewI2.getTag(R.id.live_chat_ticker_view_decorator_added_tag) == null) {
                                recyclerViewI2.aJ(new xcr(context2.getResources().getDimensionPixelOffset(R.dimen.live_chat_ticker_header_width)));
                                recyclerViewI2.setTag(R.id.live_chat_ticker_view_decorator_added_tag, Boolean.TRUE);
                            }
                            nq nqVar = new nq(-2, -1);
                            ahek ahekVar2 = xbyVarP.n;
                            admh admhVar = (admh) xbyVarP.h.io();
                            ci ciVar = (ci) ahekVar2.b.io();
                            ciVar.getClass();
                            admhVar.getClass();
                            admo admoVar = new admo(ciVar, admhVar, nqVar, ahekVar2.a);
                            admoVar.D(adkzVarA, null);
                            admoVar.jR(new adlk(xbyVarP.i, 0));
                            if (adlzVarB != null) {
                                admoVar.jR(adlzVarB);
                            }
                            recyclerViewI2.ad(admoVar);
                        }
                    }
                }
                if (this.aa.m(26, 45629546L)) {
                    xby xbyVarP3 = this.e.p();
                    if (xbyVarP3 != null) {
                        wxqVar.p(xbyVarP3);
                    }
                    if (((xce) wxrVar).C == null) {
                        ((xce) wxrVar).C = ((xce) wxrVar).A.findViewById(R.id.creator_goal_animation_view);
                    }
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ((xce) wxrVar).C;
                    if (lottieAnimationView != null) {
                        wxqVar.d(lottieAnimationView);
                    }
                }
                adkzVarA.h(new wwl(this, adkzVarA));
            }
            this.e.a();
            RecyclerView recyclerViewQ4 = ((xbn) this.e).q();
            if (recyclerViewQ4 != null) {
                this.ad.ad(recyclerViewQ4, this.l);
            }
        }
    }

    @Override // defpackage.twn
    public final synchronized void i() {
        v();
        this.B.i();
        this.k.i();
        aaaj aaajVar = this.b;
        if (aaajVar != null) {
            aaajVar.b();
        }
    }

    public final void j(aazk aazkVar) {
        if (this.F.Y()) {
            return;
        }
        long j = aazkVar.a;
        this.R = j;
        wvt wvtVar = this.c;
        if (wvtVar instanceof wvu) {
            ((wvu) wvtVar).g(j);
        }
    }

    @Override // defpackage.wxi
    public final wxp jg() {
        return this.e;
    }

    public final synchronized void k() {
        if (this.w == 1) {
            this.w = 2;
            this.o.k();
            aaaj aaajVar = this.b;
            if (aaajVar != null) {
                aaajVar.b();
            }
            this.c.b();
            this.d.e();
            wxr wxrVar = this.e;
            if (wxrVar != null) {
                wxrVar.b();
            }
            xdh xdhVar = this.t.g;
            if (xdhVar != null) {
                xdhVar.d(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    final void l(List list) {
        aaaj aaajVar;
        boolean zContainsKey;
        if (list != null) {
            this.f = list;
            if (this.o.q()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    amqo amqoVar = (amqo) it.next();
                    int i = amqoVar.b;
                    if ((i & 2) != 0) {
                        aaaj aaajVar2 = this.b;
                        if (aaajVar2 != null) {
                            aaajVar2.b();
                        }
                        wwy wwyVar = this.o;
                        if (wwyVar instanceof wxe) {
                            aqmx aqmxVar = amqoVar.d;
                            if (aqmxVar == null) {
                                aqmxVar = aqmx.a;
                            }
                            wwyVar.hN(aawb.ae(aqmxVar), new Timer());
                        }
                    } else if ((i & 4) != 0 && (aaajVar = this.b) != null && this.o == this.B) {
                        amfj amfjVar = amqoVar.e;
                        if (amfjVar == null) {
                            amfjVar = amfj.a;
                        }
                        Map map = aaajVar.b;
                        acjx acjxVarAe = aawb.ae(amfjVar);
                        synchronized (map) {
                            amfj amfjVar2 = (amfj) aawb.ag(acjxVarAe, amfj.class);
                            amfjVar2.getClass();
                            amfl amflVar = amfjVar2.c;
                            if (amflVar == null) {
                                amflVar = amfl.a;
                            }
                            zContainsKey = map.containsKey(aaaj.a(amflVar));
                        }
                        if (!zContainsKey) {
                            aaajVar.b();
                        }
                        this.o.a();
                        amfj amfjVar3 = amqoVar.e;
                        if (amfjVar3 == null) {
                            amfjVar3 = amfj.a;
                        }
                        acjx acjxVarAe2 = aawb.ae(amfjVar3);
                        amfj amfjVar4 = (amfj) aawb.ag(acjxVarAe2, amfj.class);
                        amfjVar4.getClass();
                        amfl amflVar2 = amfjVar4.c;
                        if (amflVar2 == null) {
                            amflVar2 = amfl.a;
                        }
                        amfl amflVar3 = amflVar2;
                        String strA = aaaj.a(amflVar3);
                        synchronized (map) {
                            boolean zContainsKey2 = map.containsKey(strA);
                            if (zContainsKey2) {
                                aaajVar.a.az(strA);
                            }
                            map.put(strA, acjxVarAe2);
                            if (amfjVar4.d != 0) {
                                aaajVar.a.aG(strA, acjxVarAe2, new Timer());
                            }
                            if (!zContainsKey2) {
                                aaci aaciVar = aaajVar.d;
                                xxj xxjVar = aaajVar.e;
                                taq.d();
                                if (amflVar3 == null || xxjVar == null) {
                                    ((agrc) ((agrc) aaci.a.c()).k("com/google/android/libraries/youtube/notification/topic/GcmTopicNotificationInvalidationService", "subscribe", 117, "GcmTopicNotificationInvalidationService.java")).t("cannot subscribe, invalidationId or listener is null");
                                } else {
                                    String strA2 = aaci.a(amflVar3.e);
                                    if (!TextUtils.isEmpty(strA2)) {
                                        if (!aaciVar.f()) {
                                            aaciVar.d();
                                        }
                                        Map map2 = aaciVar.c;
                                        if (!map2.containsKey(strA2)) {
                                            zhg zhgVar = aaciVar.g;
                                            String str = aaciVar.e;
                                            int andIncrement = aaciVar.f.getAndIncrement();
                                            aeiy aeiyVar = (aeiy) zhgVar.b.io();
                                            aeiyVar.getClass();
                                            Executor executor = (Executor) zhgVar.a.io();
                                            executor.getClass();
                                            map2.put(strA2, new aach(aeiyVar, executor, str, amflVar3, aaciVar, andIncrement));
                                            aagu.g(aaciVar);
                                        }
                                        aach aachVar = (aach) map2.get(strA2);
                                        aachVar.c.add(xxjVar);
                                        int i2 = aachVar.g;
                                        if (i2 == 2) {
                                            xxjVar.a(aachVar.a, null);
                                        } else if (i2 == 4) {
                                            aachVar.a();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i3 = amqoVar.b;
                    if ((i3 & 1) != 0) {
                        apho aphoVar = amqoVar.c;
                        if (aphoVar == null) {
                            aphoVar = apho.a;
                        }
                        arrayList.add(aawb.ae(aphoVar));
                    } else if ((i3 & 2) != 0) {
                        aqmx aqmxVar2 = amqoVar.d;
                        if (aqmxVar2 == null) {
                            aqmxVar2 = aqmx.a;
                        }
                        arrayList.add(aawb.ae(aqmxVar2));
                    } else if ((i3 & 4) != 0) {
                        amfj amfjVar5 = amqoVar.e;
                        if (amfjVar5 == null) {
                            amfjVar5 = amfj.a;
                        }
                        arrayList.add(aawb.ae(amfjVar5));
                    } else if ((i3 & 8) != 0) {
                        amqr amqrVar = amqoVar.f;
                        if (amqrVar == null) {
                            amqrVar = amqr.a;
                        }
                        arrayList.add(aawb.ae(amqrVar));
                    } else if ((i3 & 16) != 0) {
                        aosj aosjVar = amqoVar.g;
                        if (aosjVar == null) {
                            aosjVar = aosj.a;
                        }
                        arrayList.add(aawb.ae(aosjVar));
                    }
                }
                this.o.j(arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:184:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:187:0x0303  */
    public final void m(amqm amqmVar) {
        int i;
        angn angnVar;
        alay alayVar;
        alay alayVar2;
        wxq wxqVar;
        if (amqmVar != null) {
            for (amqo amqoVar : amqmVar.d) {
                if ((amqoVar.b & 1) != 0) {
                    apho aphoVar = amqoVar.c;
                    if (aphoVar == null) {
                        aphoVar = apho.a;
                    }
                    r(aawb.ae(aphoVar));
                    break;
                }
            }
        }
        this.o.b = false;
        if (amqmVar == null) {
            this.t.i(false);
            return;
        }
        if ((amqmVar.c & 4194304) != 0) {
            int iY = agvp.Y(amqmVar.s);
            if (iY == 0) {
                iY = 1;
            }
            this.u = iY;
        }
        if (!this.Q) {
            H(amqmVar);
            this.I.a(amqmVar.l);
            wby wbyVarC = this.m.c();
            I(amqmVar, wbyVarC);
            if (this.aa.m(26, 45629546L) && (wxqVar = this.d) != null) {
                wxqVar.o(amqmVar.r, wbyVarC);
            }
        } else if (this.S) {
            this.c.d();
        }
        if (amqmVar.j.size() > 0) {
            this.ab.j(amqmVar.j, true);
        }
        wwp wwpVar = this.Y;
        if (wwpVar != null) {
            amql amqlVar = amqmVar.h;
            if (amqlVar == null) {
                amqlVar = amql.a;
            }
            apji apjiVar = (amqlVar.b == 130037640 ? (amot) amqlVar.c : amot.a).d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(angu.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                amql amqlVar2 = amqmVar.h;
                if (amqlVar2 == null) {
                    amqlVar2 = amql.a;
                }
                apji apjiVar2 = (amqlVar2.b == 130037640 ? (amot) amqlVar2.c : amot.a).d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(angu.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                angnVar = (angn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                angnVar = null;
            }
            if (angnVar != null && wwpVar.a != null) {
                abix abixVar = wwpVar.b;
                abixVar.a = false;
                Context context = ((View) abixVar.d).getContext();
                if ((angnVar.b & 1) != 0) {
                    alayVar = angnVar.e;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ackj.k(null, alayVar, null, false));
                for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
                    if (styleSpan.getStyle() == 1) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, ((wzb) abixVar.e).a(6)), spannableStringBuilder.getSpanStart(styleSpan), spannableStringBuilder.getSpanEnd(styleSpan), 33);
                    }
                }
                ((TextView) abixVar.c).setText(spannableStringBuilder);
                angq angqVar = angnVar.f;
                if (angqVar == null) {
                    angqVar = angq.a;
                }
                if ((angqVar.b & 1) != 0) {
                    abixVar.a = true;
                    Object obj = abixVar.b;
                    angq angqVar2 = angnVar.f;
                    if (angqVar2 == null) {
                        angqVar2 = angq.a;
                    }
                    angp angpVar = angqVar2.c;
                    if (angpVar == null) {
                        angpVar = angp.a;
                    }
                    if ((angpVar.b & 1) != 0) {
                        angq angqVar3 = angnVar.f;
                        if (angqVar3 == null) {
                            angqVar3 = angq.a;
                        }
                        angp angpVar2 = angqVar3.c;
                        if (angpVar2 == null) {
                            angpVar2 = angp.a;
                        }
                        alayVar2 = angpVar2.c;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                    } else {
                        alayVar2 = null;
                    }
                    ((TextView) obj).setText(ackj.k(null, alayVar2, null, false));
                }
                wwpVar.b.a(wwpVar.a.r.isEmpty());
            }
        }
        wwv wwvVar = this.r;
        amql amqlVar3 = amqmVar.h;
        if (amqlVar3 == null) {
            amqlVar3 = amql.a;
        }
        if (((amqlVar3.b == 130037640 ? (amot) amqlVar3.c : amot.a).b & 2) != 0) {
            amql amqlVar4 = amqmVar.h;
            if (amqlVar4 == null) {
                amqlVar4 = amql.a;
            }
            i = (amqlVar4.b == 130037640 ? (amot) amqlVar4.c : amot.a).c;
        } else {
            i = -1;
        }
        if (i > 0) {
            wwvVar.b = i;
        }
        this.Q = true;
        this.f = null;
        if (amqmVar.d.size() != 0) {
            l(amqmVar.d);
        }
        if ((amqmVar.c & 8388608) != 0) {
            apji apjiVar3 = amqmVar.t;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVar = amem.b;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            apjiVar3.c(aihlVarCheckIsLite3);
            if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                this.t.i(true);
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                apjiVar3.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
            }
        }
        wxl wxlVar = this.g;
        if ((amqmVar.c & 16) != 0) {
            amqj amqjVar = amqmVar.i;
            if (amqjVar == null) {
                amqjVar = amqj.a;
            }
            wxlVar.f(amqjVar);
        }
        xcl xclVar = this.h;
        if (xclVar != null && (amqmVar.c & 2) != 0) {
            amqk amqkVar = amqmVar.f;
            if (amqkVar == null) {
                amqkVar = amqk.a;
            }
            xclVar.an(amqkVar);
        }
        wxr wxrVarF = f();
        if ((amqmVar.c & 32768) != 0) {
            apji apjiVar4 = amqmVar.n;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
            apjiVar4.c(aihlVarCheckIsLite5);
            Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite5.d);
            akrn akrnVar = (akrn) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
            xcv xcvVar = this.y;
            if (xcvVar != null) {
                xcvVar.ah(akrnVar);
            }
        }
        if (wxrVarF != null) {
            wxrVarF.m();
        }
        if (amqmVar.g.size() > 0) {
            ajwo ajwoVar = (ajwo) amqmVar.g.get(amqmVar.g.size() - 1);
            if (this.S && (this.c instanceof wvu)) {
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ammw.b);
                ajwoVar.c(aihlVarCheckIsLite6);
                if (ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ammw.b);
                    ajwoVar.c(aihlVarCheckIsLite7);
                    Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
                    long j = ((ammw) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4))).d;
                    long j2 = this.R;
                    if (j < j2) {
                        ((wvu) this.c).f(j2);
                    } else if (this.S) {
                        this.M.execute(afwl.i(new wtg(this, amqmVar, 9)));
                    } else {
                        this.c.a(amqmVar.g, a(amqmVar.d));
                    }
                } else if (this.S) {
                    this.M.execute(afwl.i(new wtg(this, amqmVar, 9)));
                } else {
                    this.c.a(amqmVar.g, a(amqmVar.d));
                }
            } else if (this.S) {
                this.M.execute(afwl.i(new wtg(this, amqmVar, 9)));
            } else {
                this.c.a(amqmVar.g, a(amqmVar.d));
            }
        }
        vxz vxzVar = this.aa;
        if (vxzVar.m(57, 45717287L) && vxzVar.m(57, 45717287L) && (amqmVar.c & 1) != 0) {
            apji apjiVar5 = amqmVar.e;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ajwt.a);
            apjiVar5.c(aihlVarCheckIsLite8);
            if (apjiVar5.j.n(aihlVarCheckIsLite8.d)) {
                apji apjiVar6 = amqmVar.e;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(ajwt.a);
                apjiVar6.c(aihlVarCheckIsLite9);
                Object objK5 = apjiVar6.j.k(aihlVarCheckIsLite9.d);
                Object objC = objK5 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK5);
                aeba aebaVar = this.O;
                ajws ajwsVar = (ajws) objC;
                if (aebaVar.c(ajwsVar.f)) {
                    if ((ajwsVar.b & 1) != 0) {
                        vxe vxeVar = this.N;
                        ajwo ajwoVar2 = ajwsVar.c;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar.a(ajwoVar2);
                    }
                    if ((ajwsVar.b & 2) != 0) {
                        vxe vxeVar2 = this.N;
                        ajwo ajwoVar3 = ajwsVar.d;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        vxeVar2.a(ajwoVar3);
                        this.l.w(new xgj(ajwsVar.e, (amud) null), null);
                    }
                    aebaVar.a(ajwsVar.f);
                }
            }
        }
        wxr wxrVar = this.e;
        if (wxrVar != null && this.S && !(this.o instanceof wxa)) {
            Optional optionalB = this.n.g().b(309, String.valueOf(wxrVar.hashCode()));
            sda sdaVar = new sda(this, wxrVar, 17);
            if (true == optionalB.isPresent()) {
                Object obj2 = optionalB.get();
                Object obj3 = sdaVar.a;
                Object obj4 = sdaVar.b;
                ((xir) obj2).f(tau.LIVE_CHAT_FIRST_RESPONSE_RECEIVED);
                ((wwn) obj3).n.g().d(309, String.valueOf(obj4.hashCode()));
            }
        }
        this.S = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, wwa] */
    public final void n(boolean z) {
        this.f = null;
        this.o.k();
        this.o.b = false;
        aaaj aaajVar = this.b;
        if (aaajVar != null) {
            aaajVar.b();
        }
        this.c.e();
        this.r.p();
        this.d.l();
        wyx wyxVar = this.Z;
        wyxVar.a = null;
        wyxVar.d.clear();
        wyxVar.c.clear();
        wyxVar.b.clear();
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            wxrVar.e();
        }
        this.g.m();
        this.S = false;
        this.w = 0;
        aaok aaokVar = this.ac;
        ((wwb) aaokVar.d).c(aaokVar.c);
        ?? r1 = aaokVar.a;
        for (bp bpVar : r1) {
            if (bpVar.isAdded() && !bpVar.isRemoving()) {
                bpVar.iN();
            }
        }
        r1.clear();
        xdb xdbVar = this.t;
        xdbVar.h();
        xdbVar.i(false);
        this.j.a();
        if (!z) {
            this.R = 0L;
            this.Q = false;
            wxr wxrVar2 = this.e;
            if (wxrVar2 != null) {
                wxrVar2.k();
            }
            this.s.g();
            this.p = null;
        }
        K();
    }

    public final synchronized void o() {
        if (this.w != 2) {
            return;
        }
        this.c.c();
        this.d.k();
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            wxrVar.c();
        }
        this.w = 1;
        wwy wwyVar = this.o;
        wwyVar.b = true;
        wwyVar.h();
        boolean z = this.o instanceof wxc;
        List<amqo> list = this.f;
        if (z) {
            acjx acjxVarAe = null;
            if (list != null) {
                for (amqo amqoVar : list) {
                    int i = amqoVar.b;
                    if ((i & 2) != 0) {
                        aqmx aqmxVar = amqoVar.d;
                        if (aqmxVar == null) {
                            aqmxVar = aqmx.a;
                        }
                        acjxVarAe = aawb.ae(aqmxVar);
                        break;
                    }
                    if ((i & 4) != 0) {
                        amfj amfjVar = amqoVar.e;
                        if (amfjVar == null) {
                            amfjVar = amfj.a;
                        }
                        acjxVarAe = aawb.ae(amfjVar);
                        break;
                    }
                    if ((i & 1) != 0) {
                        apho aphoVar = amqoVar.c;
                        if (aphoVar == null) {
                            aphoVar = apho.a;
                        }
                        acjxVarAe = aawb.ae(aphoVar);
                        break;
                    }
                }
            }
            if (acjxVarAe != null) {
                this.o.iM(acjxVarAe);
            }
        } else {
            l(list);
        }
        wxr wxrVarF = f();
        if (wxrVarF != null) {
            wxrVarF.m();
        }
        xdb xdbVar = this.t;
        xdh xdhVar = xdbVar.g;
        if (xdhVar != null) {
            xdhVar.a.setVisibility(0);
        }
        xdh xdhVar2 = xdbVar.g;
        if (xdhVar2 != null) {
            xdhVar2.b.setVisibility(0);
        }
        xdbVar.j();
    }

    public final synchronized void p(xcl xclVar) {
        this.h = xclVar;
    }

    public final synchronized void q(xcv xcvVar) {
        this.y = xcvVar;
    }

    public final void r(acjx acjxVar) {
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            wxrVar.o();
        }
        n(true);
        t(acjxVar);
    }

    public final void s(CharSequence charSequence, Runnable runnable) {
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            wxrVar.n(charSequence, runnable);
        }
        wwp wwpVar = this.Y;
        if (wwpVar != null) {
            wwpVar.b();
        }
    }

    public final synchronized void t(acjx acjxVar) {
        if (!this.o.l() && (this.o instanceof wxe) && this.aa.m(37, 45661615L)) {
            this.o = G();
        }
        this.L.c(ahng.av(Instant.now()));
        this.o.j(Collections.singletonList(acjxVar));
        this.d.l();
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            wxrVar.d();
            this.e.o();
        }
        this.w = 1;
        this.o.h();
        this.o.iM(acjxVar);
        this.S = true;
        K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, wwa] */
    public final synchronized void u(amqm amqmVar) {
        wxq wxqVar;
        if (yno.dC(amqmVar)) {
            this.p = amqmVar;
            H(amqmVar);
            if (amqmVar.m) {
                this.g.m();
                this.o = this.k;
            } else {
                wwy wwyVarG = G();
                this.o = wwyVarG;
                aihf aihfVarCreateBuilder = alsg.a.createBuilder();
                wyl wylVar = this.L;
                Map mapA = wylVar.a();
                aihfVarCreateBuilder.copyOnWrite();
                alsg alsgVar = (alsg) aihfVarCreateBuilder.instance;
                aiip aiipVar = alsgVar.b;
                if (!aiipVar.b) {
                    alsgVar.b = aiipVar.a();
                }
                alsgVar.b.putAll(mapA);
                Map mapB = wylVar.b();
                aihfVarCreateBuilder.copyOnWrite();
                alsg alsgVar2 = (alsg) aihfVarCreateBuilder.instance;
                aiip aiipVar2 = alsgVar2.c;
                if (!aiipVar2.b) {
                    alsgVar2.c = aiipVar2.a();
                }
                alsgVar2.c.putAll(mapB);
                wwyVarG.d = (alsg) aihfVarCreateBuilder.build();
            }
            apho aphoVar = ((amqo) amqmVar.d.get(0)).c;
            if (aphoVar == null) {
                aphoVar = apho.a;
            }
            acjx acjxVarAe = aawb.ae(aphoVar);
            this.o.c = !acjxVarAe.c().equals(this.X);
            this.X = acjxVarAe.c();
            wwy wwyVar = this.o;
            wwyVar.a = true;
            wwyVar.b = false;
            t(acjxVarAe);
            wxr wxrVar = this.e;
            if (wxrVar != null && !(this.o instanceof wxa)) {
                xii xiiVarG = this.n.g();
                String strValueOf = String.valueOf(wxrVar.hashCode());
                xis xisVar = xis.a;
                xir xirVarA = xiiVarG.a(309, new xis(strValueOf, false));
                xirVarA.k();
                xirVarA.f(this.o instanceof wxc ? tau.LIVE_CHAT_STARTED_STREAMING : tau.LIVE_CHAT_STARTED_UNARY);
            }
            wby wbyVarC = this.m.c();
            String str = this.W;
            if (str != null) {
                wer werVarE = wbyVarC.e();
                werVarE.j(str);
                werVarE.b().G();
            }
            if (!amqmVar.p.isEmpty()) {
                this.W = amqmVar.p;
                Object obj = this.V;
                if (obj != null) {
                    avnr.b((AtomicReference) obj);
                }
                this.V = wbyVarC.j(amqmVar.p, true).O(this.K).af(new vva(this, 14));
            }
            I(amqmVar, wbyVarC);
            if (this.aa.m(26, 45629546L) && (wxqVar = this.d) != null) {
                wxqVar.o(amqmVar.r, wbyVarC);
            }
            if ((amqmVar.c & 4194304) != 0) {
                int iY = agvp.Y(amqmVar.s);
                this.u = iY != 0 ? iY : 1;
            }
            if (this.e != null) {
                aaok aaokVar = this.ac;
                ((wwb) aaokVar.d).a(aaokVar.c);
            }
        }
    }

    public final synchronized void v() {
        n(false);
        this.o.z();
        this.o = this.B;
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            wxrVar.k();
        }
        this.g.e();
        ((xbs) this.x.io()).d();
    }

    public final void w() {
        wyv wyvVar = this.I;
        wyvVar.a = null;
        wyvVar.b = null;
        wxr wxrVar = this.e;
        if (wxrVar != null) {
            this.ad.ae(((xbn) wxrVar).q());
            this.e.k();
            this.e = null;
        }
        this.g.s();
        xdb xdbVar = this.t;
        xdh xdhVar = xdbVar.g;
        if (xdhVar != null) {
            xdhVar.b();
            xdbVar.g = null;
        }
    }

    public final synchronized boolean x() {
        return this.w != 0;
    }

    public final boolean y() {
        List list = this.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if ((((amqo) it.next()).b & 8) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wxi
    public final wwk z() {
        return this.s;
    }

    @Override // defpackage.wxi
    public final wwn B() {
        return this;
    }
}
