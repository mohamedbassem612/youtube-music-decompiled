package defpackage;

import android.content.Context;
import android.os.Handler;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yae extends ycj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/CastSession");
    public final xmi b;
    public final String c;
    public final Handler d;
    public kbu e;
    public kfm f;
    public boolean g;
    public xvj h;
    public final AtomicReference i;
    public final afwv j;
    public final qcb k;
    private final tbt l;
    private yaa m;

    /* JADX WARN: Illegal instructions before constructor call */
    public yae(xvj xvjVar, qcb qcbVar, Context context, ycp ycpVar, ycp ycpVar2, ttm ttmVar, tbt tbtVar, wjr wjrVar, int i, String str, xmi xmiVar, xmr xmrVar, Handler handler, xla xlaVar, amyv amyvVar, afwv afwvVar, String str2, vxz vxzVar) {
        Optional optionalOfNullable = Optional.ofNullable(str2);
        xzd xzdVarCS = yno.cS(str);
        xzdVarCS.k(2);
        xzdVarCS.i(xvjVar.c());
        xzdVarCS.f(xqz.f(xvjVar));
        xzdVarCS.e(amyvVar);
        xzdVarCS.g(i);
        super(context, ycpVar, ycpVar2, wjrVar, ttmVar, xlaVar, amyvVar, optionalOfNullable, vxzVar, xzdVarCS.a());
        this.i = new AtomicReference(null);
        this.h = xvjVar;
        this.k = qcbVar;
        tbtVar.getClass();
        this.l = tbtVar;
        this.b = xmiVar;
        this.d = handler;
        this.j = afwvVar;
        this.c = xmrVar.d;
    }

    public static final amyu aH(int i, amyu amyuVar) {
        if (xmo.a.contains(Integer.valueOf(i))) {
            return amyu.MDX_SESSION_DISCONNECT_REASON_CAST_AUTHENTICATION_FAILURE;
        }
        if (i != 2002) {
            if (i != 2005) {
                if (i != 2152) {
                    if (i != 2271) {
                        if (i == 2473) {
                            return amyu.MDX_SESSION_DISCONNECT_REASON_APP_LAUNCH_CAST_INIT_TIMEOUT;
                        }
                        if (i != 2450) {
                            if (i != 2451) {
                                switch (i) {
                                    case 2050:
                                    case 2051:
                                    case 2052:
                                    case 2053:
                                    case 2054:
                                    case 2055:
                                        break;
                                    default:
                                        switch (i) {
                                            case 2154:
                                            case 2155:
                                            case 2156:
                                            case 2158:
                                            case 2161:
                                                break;
                                            case 2157:
                                            case 2159:
                                            case 2160:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 2251:
                                                    case 2253:
                                                        break;
                                                    case 2252:
                                                        return amyu.MDX_SESSION_DISCONNECT_REASON_CAST_DISCONNECT_TIMEOUT;
                                                    default:
                                                        switch (i) {
                                                            case 2259:
                                                                return amyu.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
                                                            case 2260:
                                                            case 2261:
                                                                return amyu.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
                                                            default:
                                                                return amyuVar;
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    return amyu.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_NETWORK_ERROR;
                }
                return amyu.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_CANCELLED;
            }
            return amyu.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED;
        }
        return amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
    }

    @Override // defpackage.ycj, defpackage.xzc
    public final void Q(xvj xvjVar) {
        this.g = false;
        this.h = xvjVar;
        xzd xzdVar = new xzd(this.z);
        xzdVar.i(xvjVar.c());
        xzdVar.f(xqz.f(this.h));
        this.z = xzdVar.a();
    }

    @Override // defpackage.yau, defpackage.xzc
    public final void S() {
        agrx agrxVar = agso.a;
        kfm kfmVar = this.f;
        if (kfmVar == null) {
            super.S();
            return;
        }
        kfmVar.w().f(new yac(new xfd(this, 16)));
        this.l.c(new xmy());
        this.F.w(121, "mdx_ccs");
    }

    @Override // defpackage.yau, defpackage.xzc
    public final void T() {
        agrx agrxVar = agso.a;
        kfm kfmVar = this.f;
        if (kfmVar == null) {
            super.T();
            return;
        }
        kfmVar.x().f(new yac(new xfd(this, 15)));
        this.l.c(new xmz());
        this.F.w(121, "mdx_ccp");
    }

    @Override // defpackage.yco
    public final void aA() {
        kbu kbuVar;
        this.E.l(6);
        this.F.w(16, "cc_c");
        if (ar() && (kbuVar = this.e) != null && kbuVar.q()) {
            aI().a(this.e);
        }
    }

    public final /* synthetic */ ListenableFuture aC(amyu amyuVar, Optional optional, Boolean bool) {
        if (bool.booleanValue()) {
            agrx agrxVar = agso.a;
            return super.q(amyuVar, optional);
        }
        agrx agrxVar2 = agso.a;
        return super.q(amyu.MDX_SESSION_DISCONNECT_REASON_RECEIVER_DEAD_AFTER_RECEIVER_PING, optional);
    }

    public final void aF() {
        int i;
        if (!this.x.aG() || (i = this.v) >= this.w || this.e == null) {
            return;
        }
        this.v = i + 1;
        wjr wjrVar = this.F;
        aihf aihfVarCreateBuilder = amiz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder.instance;
        amizVar.b |= SemanticState.Hidden;
        amizVar.k = true;
        wjrVar.y((amiz) aihfVarCreateBuilder.build());
        aI().a(this.e);
    }

    public final void aG(boolean z) {
        agrx agrxVar = agso.a;
        this.d.post(new csd(this, z, 10));
    }

    final synchronized yaa aI() {
        yaa yaaVar;
        yaaVar = this.m;
        if (yaaVar == null) {
            yaaVar = new yaa((Object) this);
            this.m = yaaVar;
        }
        return yaaVar;
    }

    @Override // defpackage.yau, defpackage.xzc
    public final void ag(int i) {
        agrx agrxVar = agso.a;
        kbu kbuVar = this.e;
        if (kbuVar == null || !kbuVar.q()) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.CastV3")).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSession", "setVolumePercent", 333, "CastSession.java")).t("Can't set volume: Cast session is either null or not connected.");
            return;
        }
        float f = i / 100.0f;
        try {
            kbu kbuVar2 = this.e;
            kro.f("Must be called from the main thread.");
            jzz jzzVar = kbuVar2.c;
            if (jzzVar == null || !jzzVar.e()) {
                return;
            }
            kbuVar2.c.j(f);
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.CastV3")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSession", "setVolumePercent", (char) 342, "CastSession.java")).t("Couldn't update remote volume");
        }
    }

    @Override // defpackage.yau, defpackage.xzc
    public final void ak(int i, int i2) {
        ag(i);
    }

    @Override // defpackage.ycj, defpackage.xzc
    public final boolean am() {
        CastDevice castDevice = this.h.a;
        return !castDevice.e(1) && castDevice.e(4);
    }

    @Override // defpackage.yau, defpackage.xzc
    public final int c() {
        kbu kbuVar = this.e;
        if (kbuVar == null || !kbuVar.q()) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.CastV3")).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSession", "getVolumePercent", 349, "CastSession.java")).t("Can't get volume: Cast session is either null or not connected.");
            return super.c();
        }
        kbu kbuVar2 = this.e;
        kro.f("Must be called from the main thread.");
        jzz jzzVar = kbuVar2.c;
        double d = 0.0d;
        if (jzzVar != null && jzzVar.e()) {
            kan kanVar = (kan) kbuVar2.c;
            kanVar.n();
            d = kanVar.i;
        }
        return (int) (d * 100.0d);
    }

    @Override // defpackage.xzc
    public final xvr j() {
        return this.h;
    }

    @Override // defpackage.ycj, defpackage.xzc
    public final ListenableFuture q(amyu amyuVar, Optional optional) {
        Integer num = (Integer) this.i.getAndSet(null);
        boolean z = num != null;
        if (z) {
            optional = Optional.ofNullable(num);
            amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_DISCONNECTED;
        }
        Optional optional2 = optional;
        if (optional2.isPresent() && (z || amyu.MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED.equals(amyuVar) || amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN.equals(amyuVar))) {
            amyuVar = aH(((Integer) optional2.get()).intValue(), amyuVar);
            agrx agrxVar = agso.a;
            optional2.get();
        }
        amyu amyuVar2 = amyuVar;
        if (b() == 1) {
            xla xlaVar = this.x;
            if (xlaVar.aC() && xlaVar.S().contains(Integer.valueOf(amyuVar2.aa))) {
                ListenableFuture listenableFutureAO = aO();
                if (listenableFutureAO == null) {
                    listenableFutureAO = ahng.n(Boolean.FALSE);
                }
                return afxd.f(listenableFutureAO).h(new qzc((Object) this, (Object) amyuVar2, (Object) optional2, 18, (byte[]) null), MoreExecutors.directExecutor());
            }
        }
        return super.q(amyuVar2, optional2);
    }

    @Override // defpackage.yco
    public final void aB(boolean z) {
    }
}
