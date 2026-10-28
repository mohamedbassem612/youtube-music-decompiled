package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xto implements xtl {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/MdxDeviceManagerImpl");
    public final dij a;
    public final xsj b;
    xtn c = null;
    xzf d = null;
    private final xru f;
    private final did g;
    private final xsa h;
    private final xzs i;
    private final ycp j;
    private final ycp k;
    private final yar l;
    private final vxz m;
    private final wjr n;

    public xto(dij dijVar, did didVar, xru xruVar, xsa xsaVar, xsj xsjVar, ycp ycpVar, ycp ycpVar2, vxz vxzVar, yar yarVar, xzs xzsVar, wjr wjrVar) {
        this.a = dijVar;
        this.g = didVar;
        this.f = xruVar;
        this.h = xsaVar;
        this.b = xsjVar;
        this.j = ycpVar;
        this.k = ycpVar2;
        this.m = vxzVar;
        this.l = yarVar;
        this.i = xzsVar;
        this.n = wjrVar;
    }

    private final void o() {
        this.n.w(191, "cx_cui");
    }

    private final boolean p(xvq xvqVar) {
        xvq xvqVar2 = this.b.q;
        return xvqVar2 != null && xvqVar2.c().equals(xvqVar.c());
    }

    private final boolean q() {
        ycp ycpVar = this.j;
        if (ycpVar.e == null) {
            return false;
        }
        ycpVar.e.getClass();
        return ycpVar.e.b() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    private final void r(xvq xvqVar, int i) {
        String str;
        xvz xvzVar;
        String str2;
        Bundle bundle = xvqVar.a.s;
        if (bundle != null) {
            xvr xvrVarC = this.l.c(bundle);
            String str3 = "";
            boolean z = false;
            if (!(xvrVarC instanceof xvk)) {
                if (xvrVarC instanceof xvp) {
                    xvp xvpVar = (xvp) xvrVarC;
                    String str4 = xvpVar.i;
                    xvzVar = str4 != null ? new xvz(str4) : null;
                    str3 = xvpVar.g;
                    z = xvpVar.e;
                } else {
                    str = "";
                    xvzVar = null;
                }
                if (xvzVar != null) {
                    str2 = xvzVar.b;
                    if (!str2.isEmpty() || ahno.aa(str)) {
                    }
                    xyh xyhVar = new xyh();
                    xyhVar.c(z);
                    xzt xztVarA = xyhVar.a();
                    xzs xzsVar = this.i;
                    taf.g(xzsVar.f(xzsVar.b(i, null, str2, str, xztVarA).toBuilder(), xztVarA), taf.c);
                    return;
                }
            }
            xvk xvkVar = (xvk) xvrVarC;
            xvzVar = xvkVar.b();
            xvh xvhVarA = xvkVar.a.a();
            if (xvhVarA != null) {
                str3 = xvhVarA.b;
            }
            str = str3;
            if (xvzVar != null) {
                str2 = xvzVar.b;
                if (str2.isEmpty()) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[EDGE_INSN: B:38:0x0097->B:39:0x0098 BREAK  A[LOOP:0: B:33:0x0082->B:56:?]] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:7:0x0016, B:9:0x001c, B:11:0x0029, B:13:0x002d, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:23:0x0057, B:25:0x005f, B:28:0x0065, B:30:0x006d, B:32:0x007a, B:33:0x0082, B:35:0x0088, B:39:0x0098, B:41:0x009e, B:44:0x00a7), top: B:53:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:54:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00af, please report this as an issue */
    @Override // defpackage.xtl, defpackage.xre
    public final synchronized boolean a(dii diiVar) {
        xsj xsjVar;
        dii diiVar2;
        Iterator it;
        xsj xsjVar2;
        xvq xvqVar;
        vxz vxzVar = this.m;
        if (vxzVar.l(53, 45391510L, false) && q()) {
            ycp ycpVar = this.j;
            if (ycpVar.e != null) {
                ycpVar.e.getClass();
                if (ycpVar.e.aq()) {
                    if (vxzVar.l(164, 45673420L, false)) {
                        xsjVar2 = this.b;
                        if (xsjVar2.r()) {
                            xsjVar = this.b;
                            if (xsjVar.r()) {
                                return false;
                            }
                            this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                            if (!xsa.g(diiVar)) {
                                it = k().iterator();
                                do {
                                    if (!it.hasNext()) {
                                        diiVar2 = diiVar;
                                        break;
                                    }
                                    diiVar2 = ((xvq) it.next()).a;
                                } while (!xrx.d(diiVar, diiVar2));
                            } else {
                                diiVar2 = diiVar;
                                break;
                            }
                            xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                            diiVar2.i(true);
                        } else {
                            xsjVar = this.b;
                            if (xsjVar.r()) {
                                return false;
                            }
                            this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                            if (!xsa.g(diiVar)) {
                                diiVar2 = diiVar;
                                break;
                            }
                            it = k().iterator();
                            do {
                                if (!it.hasNext()) {
                                    diiVar2 = diiVar;
                                    break;
                                }
                                diiVar2 = ((xvq) it.next()).a;
                            } while (!xrx.d(diiVar, diiVar2));
                            xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                            diiVar2.i(true);
                        }
                    } else {
                        xsjVar = this.b;
                        if (xsjVar.r()) {
                            return false;
                        }
                        this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                        if (!xsa.g(diiVar)) {
                            diiVar2 = diiVar;
                            break;
                        }
                        it = k().iterator();
                        do {
                            if (!it.hasNext()) {
                                diiVar2 = diiVar;
                                break;
                            }
                            diiVar2 = ((xvq) it.next()).a;
                        } while (!xrx.d(diiVar, diiVar2));
                        xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                        diiVar2.i(true);
                    }
                } else if (ycpVar.e != null) {
                    yco ycoVar = ycpVar.e;
                    ycoVar.aa(false);
                    this.k.f(amyv.MDX_SESSION_SOURCE_STREAM_TRANSFER);
                    ycoVar.ai(diiVar.d);
                } else if (vxzVar.l(164, 45673420L, false)) {
                    xsjVar2 = this.b;
                    if (xsjVar2.r()) {
                        xsjVar = this.b;
                        if (xsjVar.r()) {
                            return false;
                        }
                        this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                        if (!xsa.g(diiVar)) {
                            diiVar2 = diiVar;
                            break;
                        }
                        it = k().iterator();
                        do {
                            if (!it.hasNext()) {
                                diiVar2 = diiVar;
                                break;
                            }
                            diiVar2 = ((xvq) it.next()).a;
                        } while (!xrx.d(diiVar, diiVar2));
                        xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                        diiVar2.i(true);
                    } else {
                        xsjVar = this.b;
                        if (xsjVar.r()) {
                            return false;
                        }
                        this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                        if (!xsa.g(diiVar)) {
                            diiVar2 = diiVar;
                            break;
                        }
                        it = k().iterator();
                        do {
                            if (!it.hasNext()) {
                                diiVar2 = diiVar;
                                break;
                            }
                            diiVar2 = ((xvq) it.next()).a;
                        } while (!xrx.d(diiVar, diiVar2));
                        xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                        diiVar2.i(true);
                    }
                } else {
                    xsjVar = this.b;
                    if (xsjVar.r()) {
                        return false;
                    }
                    this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                    if (!xsa.g(diiVar)) {
                        diiVar2 = diiVar;
                        break;
                    }
                    it = k().iterator();
                    do {
                        if (!it.hasNext()) {
                            diiVar2 = diiVar;
                            break;
                        }
                        diiVar2 = ((xvq) it.next()).a;
                    } while (!xrx.d(diiVar, diiVar2));
                    xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                    diiVar2.i(true);
                }
            } else if (ycpVar.e != null) {
                yco ycoVar2 = ycpVar.e;
                ycoVar2.aa(false);
                this.k.f(amyv.MDX_SESSION_SOURCE_STREAM_TRANSFER);
                ycoVar2.ai(diiVar.d);
            } else if (vxzVar.l(164, 45673420L, false)) {
                xsjVar2 = this.b;
                if (xsjVar2.r()) {
                    xsjVar = this.b;
                    if (xsjVar.r()) {
                        return false;
                    }
                    this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                    if (!xsa.g(diiVar)) {
                        diiVar2 = diiVar;
                        break;
                    }
                    it = k().iterator();
                    do {
                        if (!it.hasNext()) {
                            diiVar2 = diiVar;
                            break;
                        }
                        diiVar2 = ((xvq) it.next()).a;
                    } while (!xrx.d(diiVar, diiVar2));
                    xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                    diiVar2.i(true);
                } else {
                    xsjVar = this.b;
                    if (xsjVar.r()) {
                        return false;
                    }
                    this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                    if (!xsa.g(diiVar)) {
                        diiVar2 = diiVar;
                        break;
                    }
                    it = k().iterator();
                    do {
                        if (!it.hasNext()) {
                            diiVar2 = diiVar;
                            break;
                        }
                        diiVar2 = ((xvq) it.next()).a;
                    } while (!xrx.d(diiVar, diiVar2));
                    xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                    diiVar2.i(true);
                }
            } else {
                xsjVar = this.b;
                if (xsjVar.r()) {
                    return false;
                }
                this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                if (!xsa.g(diiVar)) {
                    diiVar2 = diiVar;
                    break;
                }
                it = k().iterator();
                do {
                    if (!it.hasNext()) {
                        diiVar2 = diiVar;
                        break;
                    }
                    diiVar2 = ((xvq) it.next()).a;
                } while (!xrx.d(diiVar, diiVar2));
                xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                diiVar2.i(true);
            }
        } else if (vxzVar.l(164, 45673420L, false)) {
            xsjVar2 = this.b;
            if (xsjVar2.r() || (xvqVar = xsjVar2.r) == null || !xvqVar.a.equals(diiVar)) {
                xsjVar = this.b;
                if (xsjVar.r()) {
                    return false;
                }
                this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
                if (!xsa.g(diiVar)) {
                    diiVar2 = diiVar;
                    break;
                }
                it = k().iterator();
                do {
                    if (!it.hasNext()) {
                        diiVar2 = diiVar;
                        break;
                    }
                    diiVar2 = ((xvq) it.next()).a;
                } while (!xrx.d(diiVar, diiVar2));
                xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
                diiVar2.i(true);
            } else {
                h(false);
            }
        } else {
            xsjVar = this.b;
            if (xsjVar.r()) {
                return false;
            }
            this.k.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
            if (!xsa.g(diiVar)) {
                diiVar2 = diiVar;
                break;
            }
            it = k().iterator();
            do {
                if (!it.hasNext()) {
                    diiVar2 = diiVar;
                    break;
                }
                diiVar2 = ((xvq) it.next()).a;
            } while (!xrx.d(diiVar, diiVar2));
            xsjVar.l(vxzVar.l(164, 45673420L, false) || !this.h.f(diiVar));
            diiVar2.i(true);
        }
        return true;
    }

    @Override // defpackage.xtl
    public final void b() {
        yco ycoVar = this.j.e;
        if (ycoVar == null) {
            ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/MdxDeviceManagerImpl", "disconnectRoute", 271, "MdxDeviceManagerImpl.java")).t("Tried to disconnect from route but session is null.");
            return;
        }
        if (this.m.l(164, 45673420L, false)) {
            ycoVar.aa(true);
        }
        taf.i(ycoVar.q(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER_PLAY_ON_PHONE, Optional.empty()), MoreExecutors.directExecutor(), new tsq(18), new uqk(2), null);
    }

    @Override // defpackage.xtl
    public final void c() {
        if (this.m.l(42, 45383916L, false)) {
            xtn xtnVar = new xtn(this);
            this.c = xtnVar;
            this.a.p(this.g, xtnVar, 0);
        }
        xtm xtmVar = new xtm(this, 0);
        this.d = xtmVar;
        this.j.a(xtmVar);
    }

    @Override // defpackage.xtl
    public final void d() {
        xtn xtnVar = this.c;
        if (xtnVar != null) {
            this.a.q(xtnVar);
            this.c = null;
        }
        xzf xzfVar = this.d;
        if (xzfVar != null) {
            this.j.d(xzfVar);
            this.d = null;
        }
    }

    @Override // defpackage.xtl
    public final void e() {
        f();
        this.l.j();
    }

    @Override // defpackage.xtl
    public final void f() {
        this.f.N(this);
        n(true);
    }

    @Override // defpackage.xtl
    public final void g() {
        this.f.I(this);
        yar yarVar = this.l;
        if (yarVar.x.l(165, 45676577L, false)) {
            yarVar.h();
        }
    }

    @Override // defpackage.xtl
    public final void h(boolean z) {
        yco ycoVar = this.j.e;
        if (ycoVar != null) {
            ycoVar.aa(z);
        }
        if (!this.m.l(164, 45673420L, false) || ycoVar == null) {
            this.f.P();
        } else {
            ycoVar.J();
        }
    }

    @Override // defpackage.xtl
    public final void i(xvq xvqVar) {
        if (!q() || !p(xvqVar)) {
            r(xvqVar, 3);
            return;
        }
        yco ycoVar = this.j.e;
        if (ycoVar != null) {
            ycoVar.S();
        }
    }

    @Override // defpackage.xtl
    public final void j(xvq xvqVar) {
        if (!q() || !p(xvqVar)) {
            r(xvqVar, 2);
            return;
        }
        yco ycoVar = this.j.e;
        if (ycoVar != null) {
            ycoVar.T();
        }
    }

    public final List k() {
        List<dii> listL = this.h.l(true, true);
        ArrayList arrayList = new ArrayList();
        for (dii diiVar : listL) {
            afha afhaVarO = xvq.o();
            afhaVarO.g(diiVar);
            arrayList.add(afhaVarO.d());
        }
        return arrayList;
    }

    public final void m(dii diiVar) {
        afha afhaVarO = xvq.o();
        afhaVarO.g(diiVar);
        xvq xvqVarD = afhaVarO.d();
        if (xvqVarD.l() || this.j.b == 1) {
            this.b.j(null);
        } else {
            this.b.j(xvqVarD);
        }
    }

    protected final void n(boolean z) {
        xsj xsjVar = this.b;
        xvq xvqVar = xsjVar.q;
        dii diiVarJ = dij.j();
        m(diiVarJ);
        if ((z || !xvqVar.c().equals(xrx.a(diiVarJ))) && !xsjVar.t()) {
            xvq xvqVarBW = zik.bW();
            if (xvqVarBW.j() || xvqVarBW.l() || q()) {
                xsjVar.i(xvqVarBW);
                xsjVar.m(k());
                if (xvqVarBW.l()) {
                    return;
                }
                o();
                return;
            }
            for (xvq xvqVar2 : k()) {
                if (xvqVar2.j()) {
                    xsjVar.i(xvqVar2);
                    xsjVar.m(k());
                    o();
                    return;
                }
            }
            xsjVar.i(zik.bV());
            xsjVar.m(k());
        }
    }
}
