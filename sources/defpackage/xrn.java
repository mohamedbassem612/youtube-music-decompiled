package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton;
import j$.util.function.Consumer$CC;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xrn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteButtonController");
    private final dgg A;
    private final vxz B;
    public final cf b;
    public final tbt c;
    public final awmd d;
    public final xrm e;
    public final Set f;
    public final xsh g;
    public final awmd h;
    public final avmb i;
    public xgm j;
    public List k;
    public boolean l;
    public avmn m;
    public final avmr n;
    public final Map o;
    public xuo p;
    public boolean q;
    public final avmm r;
    public final ycp s;
    public final xkw t;
    public final vxz u;
    private final Set v;
    private final Consumer w;
    private final awli x;
    private boolean y;
    private final vxu z;

    public xrn(cf cfVar, tbt tbtVar, awmd awmdVar, dgg dggVar, final hed hedVar, final ycp ycpVar, final xmi xmiVar, final xmj xmjVar, vxu vxuVar, xkw xkwVar, final adul adulVar, final xsh xshVar, final vxz vxzVar, vxz vxzVar2, awmd awmdVar2, avmb avmbVar, final xqm xqmVar, final aunn aunnVar, final aunn aunnVar2, final aunn aunnVar3) {
        Boolean bool = Boolean.FALSE;
        awli awliVar = new awli(bool);
        this.x = awliVar;
        awliVar.H();
        this.m = null;
        this.n = new avmr();
        this.p = xuo.a;
        this.r = new avmm();
        this.b = cfVar;
        this.c = tbtVar;
        this.d = awmdVar;
        this.A = dggVar;
        this.s = ycpVar;
        this.e = new xrm(this);
        this.v = Collections.newSetFromMap(new WeakHashMap());
        this.z = vxuVar;
        HashMap map = new HashMap();
        this.o = map;
        map.put(xhb.b(11208), bool);
        this.t = xkwVar;
        this.g = xshVar;
        this.u = vxzVar;
        this.B = vxzVar2;
        this.h = awmdVar2;
        this.f = Collections.newSetFromMap(new WeakHashMap());
        this.i = avmbVar;
        this.w = new Consumer() { // from class: xrk
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                MdxMediaRouteButton mdxMediaRouteButton = (MdxMediaRouteButton) obj;
                mdxMediaRouteButton.t = new xrq(this.a);
                mdxMediaRouteButton.v = hedVar;
                mdxMediaRouteButton.r = ycpVar;
                mdxMediaRouteButton.l = aunnVar3;
                mdxMediaRouteButton.j = aunnVar;
                mdxMediaRouteButton.k = aunnVar2;
                mdxMediaRouteButton.m = xmiVar;
                mdxMediaRouteButton.n = xmjVar;
                mdxMediaRouteButton.u = adulVar;
                mdxMediaRouteButton.o = xshVar;
                mdxMediaRouteButton.s = vxzVar;
                mdxMediaRouteButton.p = xqmVar;
                mdxMediaRouteButton.q = true;
                mdxMediaRouteButton.i.kn();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        };
        if (vxzVar.l(SemanticState.Hidden, 45837986L, false)) {
            return;
        }
        f(xkwVar, avmbVar);
    }

    private final void g(xgn xgnVar, xhc xhcVar) {
        List list;
        int i;
        if (xhcVar != null) {
            xgt xgtVarA = xgnVar.a();
            xhc xhcVarA = (xgtVarA == null || (i = xgtVarA.f) == 0) ? null : xhb.a(i);
            boolean z = true;
            if ((!this.y || (this.v.isEmpty() && this.f.isEmpty())) && (!this.u.l(249, 45826964L, false) || !this.y || ((awlh[]) this.x.d.get()).length == 0)) {
                z = false;
            }
            xhc xhcVarB = xhb.b(11208);
            int i2 = xgtVarA != null ? xgtVarA.f : 0;
            if (this.B.l(312, 45761303L, false) && xhcVar.equals(xhcVarB) && i2 == 3854) {
                z = false;
                i2 = 3854;
            }
            if (this.u.l(164, 45673420L, false) && e() && xhcVar.equals(xhcVarB) && (i2 == 0 || i2 != 3832)) {
                z = this.q;
            }
            if (z) {
                Map map = this.o;
                if (!map.containsKey(xhcVar) || ((Boolean) map.get(xhcVar)).booleanValue() || (list = this.k) == null || !list.contains(xhcVarA)) {
                    return;
                }
                xgnVar.w(new xgj(xhcVar), null);
                map.put(xhcVar, Boolean.TRUE);
            }
        }
    }

    private final boolean h() {
        amya amyaVar = this.z.c().m;
        if (amyaVar == null) {
            amyaVar = amya.a;
        }
        return amyaVar.d;
    }

    private final void i() {
        for (dfo dfoVar : this.v) {
        }
    }

    public final xgn a() {
        xgm xgmVar = this.j;
        return (xgmVar == null || xgmVar.hB() == null) ? xgn.l : this.j.hB();
    }

    public final void b(dfo dfoVar) {
        if (!this.l) {
            this.y = false;
        } else if (h()) {
            this.y = true;
        }
        did didVar = (did) this.d.io();
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!dfoVar.d.equals(didVar)) {
            if (dfoVar.f) {
                if (!dfoVar.d.d()) {
                    dfoVar.b.q(dfoVar.c);
                }
                if (!didVar.d()) {
                    dfoVar.b.p(didVar, dfoVar.c, 0);
                }
            }
            dfoVar.d = didVar;
            dfoVar.a();
        }
        dfoVar.e = this.A;
        this.v.add(dfoVar);
        if (dfoVar instanceof MdxMediaRouteButton) {
            this.w.r((MdxMediaRouteButton) dfoVar);
        }
        a().d(new xgj(xhb.b(11208)));
        Boolean bool = (Boolean) this.x.au();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        dfoVar.setVisibility(true != zBooleanValue ? 8 : 0);
        dfoVar.setEnabled(zBooleanValue);
    }

    public final void c() {
        boolean zK;
        if (!this.l) {
            i();
            zK = false;
        } else if (h()) {
            i();
            zK = true;
        } else {
            dij.b(this.b);
            zK = dij.k((did) this.d.io(), 1);
        }
        if (this.y != zK) {
            this.y = zK;
            agrx agrxVar = agso.a;
            boolean z = this.y;
            tbt tbtVar = this.c;
            if (z) {
                tbtVar.f(this);
            } else {
                tbtVar.l(this);
            }
            this.x.kk(Boolean.valueOf(this.y));
            boolean z2 = this.y;
            Iterator it = this.v.iterator();
            while (true) {
                int i = 8;
                if (!it.hasNext()) {
                    break;
                }
                if (true == z2) {
                    i = 0;
                }
                dfo dfoVar = (dfo) it.next();
                dfoVar.setVisibility(i);
                dfoVar.setEnabled(z2);
            }
            for (xuj xujVar : this.f) {
                int i2 = true != z2 ? 8 : 0;
                xujVar.setVisibility(i2);
                xujVar.setEnabled(z2);
            }
            g(a(), xhb.b(11208));
        }
    }

    public final void d() {
        if (this.u.l(SemanticState.Hidden, 45837986L, false)) {
            this.n.a(null);
            return;
        }
        avmn avmnVar = this.m;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
    }

    public final boolean e() {
        vxz vxzVar = this.u;
        return vxzVar.l(171, 45690090L, false) || vxzVar.l(172, 45690091L, false);
    }

    public final void f(xkw xkwVar, avmb avmbVar) {
        xkwVar.e.O(avmbVar).ak(new xrl(this));
    }

    @tcc
    void handleInteractionLoggingNewScreenEvent(xhj xhjVar) {
        for (Map.Entry entry : this.o.entrySet()) {
            entry.setValue(Boolean.FALSE);
            xgn xgnVar = xhjVar.a;
            xhc xhcVar = (xhc) entry.getKey();
            if (xhcVar != null) {
                xgnVar.d(new xgj(xhcVar));
            }
            g(xgnVar, (xhc) entry.getKey());
        }
    }
}
