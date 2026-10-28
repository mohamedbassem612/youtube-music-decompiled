package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ycp {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionManagerImpl");
    private final tce B;
    private final vxz C;
    private final abte D;
    private final wjr E;
    public final Set c;
    public final Set d;
    public volatile yco e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final aunn k;
    public final xmj l;
    public final vyo m;
    public final aunn n;
    private final aunn p;
    private final aunn q;
    private final agfp r;
    private final agfp s;
    private final aunn t;
    private final ybp u;
    private final aunn v;
    private final xpf w;
    private final yed x;
    private final xla y;
    private final xnp z;
    public int b = 2;
    private final AtomicReference A = new AtomicReference(amyv.MDX_SESSION_SOURCE_UNKNOWN);
    public final xrq o = new xrq(this);

    public ycp(aunn aunnVar, agfx agfxVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, xpf xpfVar, yed yedVar, aunn aunnVar10, Set set, xmj xmjVar, abte abteVar, xla xlaVar, wjr wjrVar, xnp xnpVar, tce tceVar, vxz vxzVar, vyo vyoVar, aunn aunnVar11) {
        aunnVar.getClass();
        this.p = aunnVar;
        this.c = new CopyOnWriteArraySet(set);
        this.e = null;
        this.r = new agfp(agfxVar);
        this.s = new agfp(agfxVar);
        this.q = aunnVar2;
        aunnVar3.getClass();
        this.f = aunnVar3;
        aunnVar4.getClass();
        this.t = aunnVar4;
        this.u = new ybp(this);
        this.g = aunnVar5;
        this.h = aunnVar6;
        this.i = aunnVar7;
        this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.v = aunnVar8;
        this.j = aunnVar9;
        this.w = xpfVar;
        this.x = yedVar;
        this.k = aunnVar10;
        this.l = xmjVar;
        this.D = abteVar;
        this.y = xlaVar;
        this.E = wjrVar;
        this.z = xnpVar;
        this.B = tceVar;
        this.C = vxzVar;
        this.m = vyoVar;
        this.n = aunnVar11;
    }

    private final yco m(xvr xvrVar, int i, String str, String str2, amyv amyvVar) {
        amyv amyvVar2;
        amyv amyvVar3;
        if (this.y.az()) {
            AtomicReference atomicReference = this.A;
            amyv amyvVar4 = amyv.MDX_SESSION_SOURCE_UNKNOWN;
            amyvVar2 = (amyv) atomicReference.getAndSet(amyvVar4);
            if (amyvVar2 == amyvVar4) {
                amyvVar2 = amyv.MDX_SESSION_SOURCE_OUTPUT_SWITCHER;
            }
        } else {
            boolean zL = this.C.l(197, 45733216L, false);
            AtomicReference atomicReference2 = this.A;
            amyvVar2 = zL ? (amyv) atomicReference2.getAndSet(amyv.MDX_SESSION_SOURCE_UNKNOWN) : (amyv) atomicReference2.get();
        }
        if (amyvVar != null && amyvVar != amyv.MDX_SESSION_SOURCE_UNKNOWN) {
            amyvVar3 = amyvVar;
        } else if (str2 != null) {
            amyvVar = amyv.MDX_SESSION_SOURCE_STREAM_TRANSFER;
            amyvVar3 = amyvVar;
        } else {
            amyvVar3 = amyvVar2;
        }
        ahgb ahgbVar = (ahgb) this.p.io();
        amyvVar3.getClass();
        Objects.checkIndex(0, 6);
        if (xvrVar instanceof xvi) {
            return ahgb.j(this, this, amyvVar3, str2, i, str, xvrVar, new yci(ahgbVar.c, 1, (byte[]) null));
        }
        if (xvrVar instanceof xvj) {
            return ahgb.j(this, this, amyvVar3, str2, i, str, xvrVar, new yci(ahgbVar.e, 0));
        }
        if (xvrVar instanceof xvk) {
            return ahgb.j(this, this, amyvVar3, str2, i, str, xvrVar, new yci(ahgbVar.d, 2, (char[]) null));
        }
        if (xvrVar instanceof xvn) {
            return ahgb.j(this, this, amyvVar3, str2, i, str, xvrVar, new yci(ahgbVar.b, 3, (short[]) null));
        }
        if (xvrVar instanceof xvp) {
            return ahgb.j(this, this, amyvVar3, str2, i, str, xvrVar, new yci(ahgbVar.a, 4, (int[]) null));
        }
        throw new IllegalArgumentException("Screen type " + ((Object) Integer.toString(xvrVar.i() - 1)) + " not supported");
    }

    public final void a(xzf xzfVar) {
        xzfVar.getClass();
        this.c.add(xzfVar);
    }

    public final void b(xzg xzgVar) {
        this.d.add(xzgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(xzc xzcVar) {
        amxg amxgVar;
        if (xzcVar == this.e) {
            int i = this.b;
            int iB = xzcVar.b();
            if (this.b == iB) {
                agrx agrxVar = agso.a;
                return;
            }
            this.b = iB;
            int i2 = 13;
            int i3 = 16;
            byte[] bArr = null;
            if (iB == 0) {
                agrx agrxVar2 = agso.a;
                xzcVar.j();
                agfp agfpVar = this.r;
                agfpVar.d();
                agfpVar.e();
                this.s.d();
                this.w.a = xzcVar;
                ych ychVar = (ych) this.q.io();
                int i4 = xzcVar.n().k;
                boolean zAv = xzcVar.av();
                String str = xzcVar.n().a;
                int i5 = xzcVar.n().e;
                amyv amyvVarS = xzcVar.s();
                aihf aihfVarCreateBuilder = amxs.a.createBuilder();
                boolean zAr = xzcVar.ar();
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar = (amxs) aihfVarCreateBuilder.instance;
                amxsVar.b |= 16;
                amxsVar.g = zAr;
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar2 = (amxs) aihfVarCreateBuilder.instance;
                amxsVar2.c = i4 - 1;
                amxsVar2.b |= 1;
                int iF = ych.f(i);
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar3 = (amxs) aihfVarCreateBuilder.instance;
                amxsVar3.d = iF - 1;
                amxsVar3.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar4 = (amxs) aihfVarCreateBuilder.instance;
                amxsVar4.b |= 4;
                amxsVar4.e = zAv;
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar5 = (amxs) aihfVarCreateBuilder.instance;
                amxsVar5.b |= SemanticState.Hidden;
                amxsVar5.j = str;
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar6 = (amxs) aihfVarCreateBuilder.instance;
                amxsVar6.b |= SemanticState.LiveRegion;
                amxsVar6.k = i5;
                aihfVarCreateBuilder.copyOnWrite();
                amxs amxsVar7 = (amxs) aihfVarCreateBuilder.instance;
                amxsVar7.h = amyvVarS.E;
                amxsVar7.b |= 64;
                ych.d(xzcVar, new vnm(aihfVarCreateBuilder, i2));
                amxg amxgVarC = ych.c(xzcVar.j());
                if (amxgVarC != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    amxs amxsVar8 = (amxs) aihfVarCreateBuilder.instance;
                    amxsVar8.i = amxgVarC;
                    amxsVar8.b |= SemanticState.Focused;
                }
                xvr xvrVarJ = xzcVar.j();
                if (xvrVarJ instanceof xvn) {
                    aihf aihfVarCreateBuilder2 = amxg.a.createBuilder();
                    Map mapO = ((xvn) xvrVarJ).o();
                    if (mapO != null) {
                        String str2 = (String) mapO.get("brand");
                        if (!TextUtils.isEmpty(str2)) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amxg amxgVar2 = (amxg) aihfVarCreateBuilder2.instance;
                            str2.getClass();
                            amxgVar2.b |= 4;
                            amxgVar2.e = str2;
                        }
                        String str3 = (String) mapO.get("model");
                        if (!TextUtils.isEmpty(str3)) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amxg amxgVar3 = (amxg) aihfVarCreateBuilder2.instance;
                            str3.getClass();
                            amxgVar3.b |= 2;
                            amxgVar3.d = str3;
                        }
                    }
                    amxgVar = (amxg) aihfVarCreateBuilder2.build();
                } else {
                    amxgVar = null;
                }
                if (amxgVar != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    amxs amxsVar9 = (amxs) aihfVarCreateBuilder.instance;
                    amxsVar9.l = amxgVar;
                    amxsVar9.b |= SemanticState.ReadOnly;
                }
                xeu xeuVar = ychVar.b;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MDX_SESSION_STARTED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    amxs amxsVar10 = (amxs) aihfVarCreateBuilder.build();
                    amxsVar10.getClass();
                    alouVar.d = amxsVar10;
                    alouVar.c = 25;
                    xeuVar.b((alou) alosVar.build());
                }
                ((xzj) this.v.io()).h(xzcVar);
                new Handler(Looper.getMainLooper()).post(new xoy(this, xzcVar, 7, null));
            } else if (iB != 1) {
                agrx agrxVar3 = agso.a;
                xzcVar.j();
                agfp agfpVar2 = this.r;
                if (agfpVar2.a) {
                    agfpVar2.f();
                }
                agfp agfpVar3 = this.s;
                if (agfpVar3.a) {
                    agfpVar3.f();
                }
                ((ych) this.q.io()).e(xzcVar, i, agfpVar2.c().toMillis(), agfpVar3.c().toMillis());
                if (i == 0) {
                    if (amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER.equals(xzcVar.r())) {
                        l(14);
                    } else {
                        l(13);
                    }
                    aunn aunnVar = this.f;
                    ((wjr) aunnVar.io()).w(191, "cx_cf");
                    if (this.e != null) {
                        wjr wjrVar = (wjr) aunnVar.io();
                        aihf aihfVarCreateBuilder3 = amiz.a.createBuilder();
                        yco ycoVar = this.e;
                        ycoVar.getClass();
                        amyu amyuVarR = ycoVar.r();
                        aihfVarCreateBuilder3.copyOnWrite();
                        amiz amizVar = (amiz) aihfVarCreateBuilder3.instance;
                        amizVar.m = amyuVarR.aa;
                        amizVar.b |= SemanticState.ReadOnly;
                        wjrVar.y((amiz) aihfVarCreateBuilder3.build());
                    }
                }
                this.w.a = null;
                ((xzj) this.v.io()).g(xzcVar);
                this.e = null;
                i();
                new Handler(Looper.getMainLooper()).post(new xoy(this, xzcVar, 5, bArr));
            } else {
                agrx agrxVar4 = agso.a;
                xzcVar.j();
                agfp agfpVar4 = this.s;
                agfpVar4.d();
                agfpVar4.e();
                ych ychVar2 = (ych) this.q.io();
                long millis = this.r.c().toMillis();
                int i6 = xzcVar.n().k;
                boolean zAv2 = xzcVar.av();
                String str4 = xzcVar.n().a;
                int i7 = xzcVar.n().e;
                amyv amyvVarS2 = xzcVar.s();
                aihf aihfVarCreateBuilder4 = amxm.a.createBuilder();
                boolean zAr2 = xzcVar.ar();
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar.b |= 32;
                amxmVar.h = zAr2;
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar2 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar2.c = i6 - 1;
                amxmVar2.b |= 1;
                int iF2 = ych.f(i);
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar3 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar3.d = iF2 - 1;
                amxmVar3.b |= 2;
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar4 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar4.b |= 4;
                amxmVar4.e = millis;
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar5 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar5.b |= 8;
                amxmVar5.f = zAv2;
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar6 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar6.b |= SemanticState.LiveRegion;
                amxmVar6.k = str4;
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar7 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar7.b |= SemanticState.ReadOnly;
                amxmVar7.l = i7;
                aihfVarCreateBuilder4.copyOnWrite();
                amxm amxmVar8 = (amxm) aihfVarCreateBuilder4.instance;
                amxmVar8.i = amyvVarS2.E;
                amxmVar8.b |= SemanticState.Focused;
                ych.d(xzcVar, new vnm(aihfVarCreateBuilder4, 12));
                amxg amxgVarC2 = ych.c(xzcVar.j());
                if (amxgVarC2 != null) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    amxm amxmVar9 = (amxm) aihfVarCreateBuilder4.instance;
                    amxmVar9.j = amxgVarC2;
                    amxmVar9.b |= SemanticState.Hidden;
                }
                String strB = xzcVar.B();
                String strC = xzcVar.C();
                if (strB != null && strC != null) {
                    aihf aihfVarCreateBuilder5 = amxg.a.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    amxg amxgVar4 = (amxg) aihfVarCreateBuilder5.instance;
                    amxgVar4.b |= 4;
                    amxgVar4.e = strB;
                    aihfVarCreateBuilder5.copyOnWrite();
                    amxg amxgVar5 = (amxg) aihfVarCreateBuilder5.instance;
                    amxgVar5.b |= 2;
                    amxgVar5.d = strC;
                    amxg amxgVar6 = (amxg) aihfVarCreateBuilder5.build();
                    aihfVarCreateBuilder4.copyOnWrite();
                    amxm amxmVar10 = (amxm) aihfVarCreateBuilder4.instance;
                    amxgVar6.getClass();
                    amxmVar10.m = amxgVar6;
                    amxmVar10.b |= SemanticState.Modal;
                }
                xeu xeuVar2 = ychVar2.b;
                if (xeuVar2.b) {
                    xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder4, alot.MDX_SESSION_CONNECTED);
                    ztf ztfVar2 = xffVarA2.k.e;
                    xffVarA2.l = ztfVar2.a();
                    ztfVar2.k(xffVarA2);
                } else {
                    alos alosVar2 = (alos) alou.a.createBuilder();
                    alosVar2.copyOnWrite();
                    alou alouVar2 = (alou) alosVar2.instance;
                    amxm amxmVar11 = (amxm) aihfVarCreateBuilder4.build();
                    amxmVar11.getClass();
                    alouVar2.d = amxmVar11;
                    alouVar2.c = 26;
                    xeuVar2.b((alou) alosVar2.build());
                }
                aunn aunnVar2 = this.f;
                ((wjr) aunnVar2.io()).w(16, "mdx_ls");
                ((wjr) aunnVar2.io()).w(191, "cx_cc");
                i();
                new Handler(Looper.getMainLooper()).post(new xoy(this, xzcVar, 6, null));
                l(12);
            }
            this.B.a(new xzh(this.e, xzcVar.o()));
            xnp xnpVar = this.z;
            if (xzcVar.n() != null) {
                String str5 = xzcVar.n().a;
                if (xzcVar.j() != null) {
                    taf.h(xnpVar.g.a(new tvm(xnpVar, xzcVar, 11), MoreExecutors.directExecutor()), MoreExecutors.directExecutor(), new tsq(i3));
                }
            }
        }
    }

    public final void d(xzf xzfVar) {
        xzfVar.getClass();
        this.c.remove(xzfVar);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    public final void e(xvr xvrVar, xyv xyvVar, Optional optional, amyv amyvVar) {
        Optional optionalEmpty;
        String str;
        int i;
        agrx agrxVar = agso.a;
        ((aczd) this.j.io()).i();
        this.z.d(xvrVar);
        yco ycoVar = this.e;
        if (ycoVar != null && ycoVar.b() == 1 && ycoVar.j().equals(xvrVar)) {
            if (xyvVar.e()) {
                ycoVar.U(xyvVar);
                return;
            }
            return;
        }
        aunn aunnVar = this.f;
        ((wjr) aunnVar.io()).v(16);
        amzd amzdVar = this.m.b().m;
        if (amzdVar == null) {
            amzdVar = amzd.a;
        }
        if (amzdVar.b) {
            ((wjr) aunnVar.io()).v(121);
        } else {
            ((wjr) aunnVar.io()).x();
        }
        ((wjr) aunnVar.io()).v(191);
        yat yatVar = (yat) this.g.io();
        xze xzeVar = yatVar.g;
        if (xzeVar == null) {
            optionalEmpty = Optional.empty();
        } else if (yatVar.h == null || yatVar.h.isEmpty() || !xsa.b(yatVar.h, xqz.f(xvrVar))) {
            ((agrc) ((agrc) yat.a.c().i(agso.a, "MDX.SessionRecoveryController")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultSessionRecoveryController", "findMatchingRecoveredSessionInfo", 171, "DefaultSessionRecoveryController.java")).t("recovered screen cannot be matched via selected route Id, fallback to sessionInfo");
            if (awrc.c(xzeVar.c, xqz.f(xvrVar))) {
                int i2 = xzeVar.k;
                Objects.checkIndex(0, 5);
                boolean z = xvrVar instanceof xvn;
                if (!z ? !(!(xvrVar instanceof xvk) ? !(!(xvrVar instanceof xvp) ? (xvrVar instanceof xvj) && i2 == 2 : i2 == 6) : i2 == 4) : i2 == 3) {
                    optionalEmpty = Optional.empty();
                } else {
                    int i3 = i2 - 1;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            if (z) {
                                xwc xwcVar = ((xvn) xvrVar).n;
                                xyj xyjVar = xzeVar.g;
                                if (awrc.c(xwcVar, xyjVar != null ? xyjVar.a : null)) {
                                }
                            }
                            optionalEmpty = Optional.empty();
                        } else if (i3 != 3 && i3 != 5) {
                            optionalEmpty = Optional.empty();
                        }
                    }
                    optionalEmpty = Optional.of(xzeVar);
                }
            } else {
                optionalEmpty = Optional.empty();
            }
        } else {
            optionalEmpty = Optional.of(xzeVar);
        }
        if (optionalEmpty.isPresent()) {
            int i4 = ((xze) optionalEmpty.get()).e + 1;
            str = ((xze) optionalEmpty.get()).a;
            i = i4;
        } else {
            str = null;
            i = 0;
        }
        yco ycoVarM = m(xvrVar, i, str, (String) optional.orElse(null), amyvVar);
        this.e = ycoVarM;
        if (this.y.az() && ycoVar != null) {
            int i5 = this.b;
            agfp agfpVar = this.r;
            if (agfpVar.a) {
                agfpVar.f();
            }
            agfp agfpVar2 = this.s;
            if (agfpVar2.a) {
                agfpVar2.f();
            }
            ycoVar.aQ(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER, null);
            if (i5 != 2) {
                ((ych) this.q.io()).e(ycoVar, i5, agfpVar.c().toMillis(), agfpVar2.c().toMillis());
            }
            this.b = 2;
        }
        l(i > 0 ? 15 : 2);
        ycoVarM.I(xyvVar);
    }

    public final void f(amyv amyvVar) {
        this.A.set(amyvVar);
    }

    public final void g() {
        yat yatVar = (yat) this.g.io();
        taq.d();
        ycs ycsVar = yatVar.e;
        xze xzeVar = yatVar.f;
        if (ycsVar != null && xzeVar != null) {
            yatVar.a(2);
        }
        ((yck) this.i.io()).b();
    }

    public final void h(xri xriVar, Optional optional) {
        amyu amyuVar;
        yco ycoVar = this.e;
        if (ycoVar != null) {
            if (xriVar.a) {
                amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
            } else {
                yed yedVar = this.x;
                if (!yedVar.c()) {
                    amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
                } else if (yedVar.d(ycoVar.n().k)) {
                    amyuVar = (!(ycoVar.j() instanceof xvn) || TextUtils.equals(((xvn) ycoVar.j()).d, yedVar.a())) ? amyu.MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED : amyu.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
                } else {
                    amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
                }
            }
            if (ycoVar.r() == amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN) {
                if (this.y.az() && xriVar.c) {
                    ycoVar.aa(true);
                }
                ycoVar.ad(xriVar.b);
            }
            ycoVar.aQ(amyuVar, (Integer) optional.orElse(null));
        }
    }

    public final void i() {
        boolean z = true;
        if (!j() && this.b != 1) {
            z = false;
        }
        ((acdo) this.t.io()).c = z ? this.u : null;
    }

    public final boolean j() {
        yat yatVar = (yat) this.g.io();
        ycs ycsVar = yatVar.e;
        return ycsVar != null && ycsVar.e() && yatVar.d.a == 1;
    }

    public final void k(xvj xvjVar, xze xzeVar) {
        int i;
        String str;
        if (this.y.al()) {
            ((aczd) this.j.io()).i();
            this.z.d(xvjVar);
        }
        if (xzeVar != null && xzeVar.k == 2 && xzeVar.c.equals(xqz.f(xvjVar))) {
            int i2 = xzeVar.e;
            str = xzeVar.a;
            i = i2 + 1;
        } else {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.MdxSessionManagerImpl")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionManagerImpl", "launchCastSession", 566, "MdxSessionManagerImpl.java")).t("Cannot retrieve a matching session info for the resumed SDK session. Proceeding with launching with a new session nonce.");
            i = 0;
            this.E.z(12, null, false);
            str = null;
        }
        yco ycoVarM = m(xvjVar, i, str, null, null);
        this.e = ycoVarM;
        l(i > 0 ? 15 : 2);
        ycoVarM.I(xyv.a);
    }

    public final void l(int i) {
        yco ycoVar = this.e;
        if (ycoVar == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.MdxSessionManagerImpl")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionManagerImpl", "onMdxConnectionFlowEvent", 292, "MdxSessionManagerImpl.java")).t("Reporting flow event with null session instance, ignore");
            return;
        }
        agrx agrxVar = agso.a;
        String str = ycoVar.n().a;
        xfh xfhVar = new xfh(i - 1, 9);
        aihf aihfVarCreateBuilder = amyd.a.createBuilder();
        boolean zAv = ycoVar.av();
        aihfVarCreateBuilder.copyOnWrite();
        amyd amydVar = (amyd) aihfVarCreateBuilder.instance;
        amydVar.b |= 1;
        amydVar.c = zAv;
        boolean zAr = ycoVar.ar();
        aihfVarCreateBuilder.copyOnWrite();
        amyd amydVar2 = (amyd) aihfVarCreateBuilder.instance;
        amydVar2.b |= 4;
        amydVar2.e = zAr;
        if (i == 13) {
            amyu amyuVarR = ycoVar.r();
            aihfVarCreateBuilder.copyOnWrite();
            amyd amydVar3 = (amyd) aihfVarCreateBuilder.instance;
            amydVar3.d = amyuVarR.aa;
            amydVar3.b |= 2;
        }
        abte abteVar = this.D;
        aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
        amyd amydVar4 = (amyd) aihfVarCreateBuilder.build();
        amydVar4.getClass();
        akzkVar.g = amydVar4;
        akzkVar.b |= 16;
        xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
        abteVar.e(xfhVar, alai.FLOW_TYPE_MDX_CONNECTION, ycoVar.n().a);
    }
}
