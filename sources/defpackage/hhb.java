package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.ContextObserver;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.NamespacedStoreConfig;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import internal.org.jni_zero.JniZero;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhb {
    public final /* synthetic */ Object a;

    public hhb(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J(affv affvVar, affx affxVar) {
        int iIntValue;
        Class<?> cls;
        Object objA;
        Object obj = this.a;
        affs affsVar = (affs) obj;
        if (!affsVar.g) {
            if (affvVar.i) {
                affsVar.f.b();
                return;
            } else {
                affsVar.e.e(affxVar);
                return;
            }
        }
        aguu aguuVar = affs.k;
        afuv afuvVarH = afwt.h(((afvh) afty.d.get()).c, aguuVar, aftg.b);
        if (afuvVarH.b()) {
            Object objA2 = afuvVarH.a();
            objA2.getClass();
            iIntValue = ((Number) objA2).intValue();
        } else {
            iIntValue = 0;
        }
        int i = iIntValue + 1;
        if (i > 10) {
            agev agevVar = affsVar.d;
            if (agevVar.g()) {
                cls = agevVar.c().getClass();
            } else {
                aunr aunrVar = affsVar.b;
                int iD = aunrVar.d() - 1;
                if (iD != 0) {
                    objA = iD != 1 ? aunrVar.b() : aunrVar.e();
                } else {
                    objA = aunrVar.a();
                }
                cls = objA.getClass();
            }
            ((agrc) affs.a.b().k("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "fallbackOrSetErrorDetectingInfiniteLoop", 1232, "AccountControllerImpl.kt")).w("A highly probable infinite loop detected in host: %s", new qdv(cls));
            throw new IllegalStateException("Account error triggered too many times in the same call chain, the app is likely trapped in an infinite loop. This is likely an app bug where the onNoAccountAvailable method is triggering the account error again. Please check the preceding log in logcat to see which host is causing the problem.", afwq.a());
        }
        afuw afuwVarB = afuy.b();
        afuwVarB.a(aguuVar, Integer.valueOf(i));
        afuu afuuVarD = afwt.d(97, "AccountController account error", ((afuy) afuwVarB).f(), true);
        try {
            if (affvVar.i) {
                ((affs) obj).f.b();
            } else {
                ((affs) obj).e.e(affxVar);
            }
            JniZero.l(afuuVarD, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afuuVarD, th);
                throw th2;
            }
        }
    }

    public final int A() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int B(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View C(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void D(View view) {
        oh ohVarK = RecyclerView.k(view);
        if (ohVarK != null) {
            ((RecyclerView) this.a).ay(ohVarK, ohVarK.o);
            ohVarK.o = 0;
        }
    }

    public final void E(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.E(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void F(oh ohVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.n.removeAndRecycleView(ohVar.a, recyclerView.e);
    }

    public final void G() {
        ((is) this.a).j.B();
    }

    public final void H(oh ohVar, cwp cwpVar, cwp cwpVar2) {
        ohVar.n(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.E.p(ohVar, cwpVar, cwpVar2)) {
            recyclerView.V();
        }
    }

    public final void I(oh ohVar, cwp cwpVar, cwp cwpVar2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.e.l(ohVar);
        recyclerView.u(ohVar);
        ohVar.n(false);
        if (recyclerView.E.r(ohVar, cwpVar, cwpVar2)) {
            recyclerView.V();
        }
    }

    public final void a(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, Throwable th) {
        affp affpVar;
        MessageLite messageLiteA = protoParsers$InternalDontUse.a(affv.a, ExtensionRegistryLite.getGeneratedRegistry());
        messageLiteA.getClass();
        affv affvVar = (affv) messageLiteA;
        affs.m(affvVar);
        Object obj = this.a;
        affs affsVar = (affs) obj;
        affp affpVar2 = affsVar.i;
        if (affpVar2 == null) {
            awrc.b("viewModel");
            affpVar2 = null;
        }
        if (awrc.c(affvVar, affpVar2.a())) {
            affsVar.h();
            if (th instanceof afkp) {
                int i = affvVar.h;
                if (i < 4) {
                    int iBt = a.bt(affvVar.e);
                    if (iBt == 0) {
                        iBt = 1;
                    }
                    ((agrc) ((agrc) affs.a.c()).j(th).k("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1083, "AccountControllerImpl.kt")).E("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %s, time(s) attempted: %s, exit reason code: %s", new qdu(iBt - 1), new qdq(i), new qdq(((Number) ((afkp) th).a.e(-1)).intValue()));
                    int iBt2 = a.bt(affvVar.e);
                    if (iBt2 == 0) {
                        iBt2 = 1;
                    }
                    agjz agjzVar = new agjz(4);
                    if (iBt2 == 2 || iBt2 == 3 || iBt2 == 6) {
                        aiie aiieVar = affvVar.f;
                        aiieVar.getClass();
                        Iterator it = aiieVar.iterator();
                        while (it.hasNext()) {
                            try {
                                agjzVar.h(Class.forName((String) it.next()).asSubclass(afgq.class));
                            } catch (ClassNotFoundException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    agev agevVarH = agdf.a;
                    if (iBt2 == 6) {
                        if ((affvVar.b & 64) == 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        agevVarH = agev.h(Integer.valueOf(affvVar.j));
                    }
                    int i2 = affvVar.h;
                    int i3 = iBt2 - 1;
                    if (i3 == 1) {
                        Object obj2 = this.a;
                        agke agkeVarG = agjzVar.g();
                        agkeVarG.getClass();
                        ((affs) obj2).l(agkeVarG, i2);
                        return;
                    }
                    if (i3 == 2) {
                        afuu afuuVarC = afwt.c(98, "Retry Switch Account Interactive with Specified Selectors");
                        try {
                            agke agkeVarG2 = agjzVar.g();
                            agkeVarG2.getClass();
                            ((affs) obj).j(agkeVarG2, i2);
                            JniZero.l(afuuVarC, null);
                            return;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                JniZero.l(afuuVarC, th2);
                                throw th3;
                            }
                        }
                    }
                    if (i3 == 3) {
                        int i4 = affvVar.d;
                        if (i4 < 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        affsVar.k(affd.a(i4), affvVar.g, i2);
                        return;
                    }
                    if (i3 == 4) {
                        affp affpVar3 = affsVar.i;
                        if (affpVar3 == null) {
                            awrc.b("viewModel");
                            affpVar = null;
                        } else {
                            affpVar = affpVar3;
                        }
                        affpVar.c = true;
                        affsVar.f(i2);
                        return;
                    }
                    if (i3 != 5) {
                        throw new IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                    }
                    Object obj3 = this.a;
                    agke agkeVarG3 = agjzVar.g();
                    agkeVarG3.getClass();
                    int iIntValue = ((Number) agevVarH.c()).intValue();
                    affs affsVar2 = (affs) obj3;
                    afhk afhkVar = affsVar2.f;
                    afkh afkhVar = afhkVar.a;
                    afhj afhjVar = (afhj) afkhVar.b(iIntValue);
                    affsVar2.g();
                    if (agkeVarG3.isEmpty()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    affp affpVar4 = affsVar2.i;
                    if (affpVar4 == null) {
                        awrc.b("viewModel");
                        affpVar4 = null;
                    }
                    affp affpVar5 = affsVar2.i;
                    if (affpVar5 == null) {
                        awrc.b("viewModel");
                        affpVar5 = null;
                    }
                    affpVar4.c = affpVar5.b;
                    qpj.c();
                    afhkVar.a();
                    afhkVar.b = new afgu(afkhVar.a(afhjVar), 0);
                    afuu afuuVarC2 = afwt.c(104, "Switch Account With Custom Selectors Keep State");
                    try {
                        ListenableFuture listenableFutureD = ((affs) obj3).d(agkeVarG3, new afff(), true);
                        if (listenableFutureD.isDone()) {
                            ProtoParsers$InternalDontUse protoParsers$InternalDontUse2 = new ProtoParsers$InternalDontUse(null, ((affs) obj3).o(6, null, agev.h(agkeVarG3), agdf.a, true, agev.h(afhjVar), i2));
                            try {
                                hhb hhbVar = ((affs) obj3).j;
                                Object objV = ahng.v(listenableFutureD);
                                objV.getClass();
                                hhbVar.b(protoParsers$InternalDontUse2, (affg) objV);
                            } catch (ExecutionException e2) {
                                e = e2;
                                hhb hhbVar2 = ((affs) obj3).j;
                                Throwable cause = e.getCause();
                                if (cause != null) {
                                    e = cause;
                                }
                                hhbVar2.a(protoParsers$InternalDontUse2, e);
                            }
                        } else {
                            qpj.c();
                            afgu afguVar = afhkVar.b;
                            afguVar.getClass();
                            if (afguVar.b != 1) {
                                afguVar.b = 1;
                                ((afhj) afkhVar.b(afguVar.a)).b();
                            }
                            ((affs) obj3).p(6, null, agev.h(agkeVarG3), agdf.a, true, agev.h(afhjVar), listenableFutureD, i2);
                        }
                        JniZero.l(afuuVarC2, null);
                        return;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            JniZero.l(afuuVarC2, th4);
                            throw th5;
                        }
                    }
                }
                J(affvVar, new affz(th));
            } else {
                J(affvVar, th instanceof affx ? (affx) th : new afgc(th));
            }
            if ((affvVar.b & 2) != 0) {
                affd affdVarA = affd.a(affvVar.d);
                if (!(th instanceof affx)) {
                    ((agrc) ((agrc) affs.a.b()).j(th).k("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1111, "AccountControllerImpl.kt")).w("Failed to use %s.", affdVarA);
                }
            }
            ((affs) this.a).i();
        }
    }

    public final void b(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, affg affgVar) {
        affd affdVarA;
        MessageLite messageLiteA = protoParsers$InternalDontUse.a(affv.a, ExtensionRegistryLite.getGeneratedRegistry());
        messageLiteA.getClass();
        affv affvVar = (affv) messageLiteA;
        affs.m(affvVar);
        affs affsVar = (affs) this.a;
        affp affpVar = affsVar.i;
        if (affpVar == null) {
            awrc.b("viewModel");
            affpVar = null;
        }
        if (awrc.c(affvVar, affpVar.a())) {
            if ((affvVar.b & 2) != 0) {
                affd affdVar = affgVar.a;
                affdVar.getClass();
                int i = affvVar.d;
                if (affdVar.a != i) {
                    throw new IllegalStateException("Check failed.");
                }
                affdVarA = affd.a(i);
            } else {
                if (affgVar.d != null) {
                    affs affsVar2 = (affs) this.a;
                    afgw afgwVar = affsVar2.e;
                    if (!afgwVar.g()) {
                        afgwVar.f();
                    }
                    Intent intent = affgVar.d;
                    intent.getClass();
                    if (afgwVar.g()) {
                        afgf.a(intent, affd.a(afgwVar.a()));
                    }
                    affsVar2.c.c().b(intent, null);
                    affsVar2.f.a();
                    return;
                }
                if (affgVar.c == null) {
                    J(affvVar, new afgd());
                    affs affsVar3 = (affs) this.a;
                    affsVar3.h();
                    affsVar3.i();
                    return;
                }
                affdVarA = affgVar.a;
            }
            afhm afhmVar = affgVar.c;
            if (afhmVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            afff afffVar = affgVar.e;
            if (afhmVar.a) {
                afgw afgwVar2 = affsVar.e;
                affd affdVar2 = affgVar.a;
                affdVar2.getClass();
                afhq afhqVar = affgVar.b;
                afhqVar.getClass();
                afffVar.getClass();
                if (afgwVar2.h(new afhe(affdVar2.a, afhqVar))) {
                    jij jijVar = afgwVar2.d;
                    jijVar.Q();
                    if (afhqVar.equals(afhq.a)) {
                        throw new IllegalStateException();
                    }
                    if ((afhqVar.b & SemanticState.Hidden) == 0) {
                        throw new IllegalStateException();
                    }
                    afuu afuuVarD = afwt.d(111, "onAccountReady", afux.a, true);
                    try {
                        ahud ahudVar = new ahud(new ahud(affdVar2, (byte[]) null), (byte[]) null);
                        agqr agqrVarK = ((agpr) jijVar.c).iterator();
                        while (agqrVarK.hasNext()) {
                            ((afgr) agqrVarK.next()).F(ahudVar);
                        }
                        Iterator it = ((ArrayList) jijVar.b).iterator();
                        while (it.hasNext()) {
                            ((afgr) it.next()).F(ahudVar);
                        }
                        afuuVarD.close();
                        afgwVar2.d();
                        afgwVar2.d.P(afhqVar);
                    } catch (Throwable th) {
                        try {
                            afuuVarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                ((affs) this.a).h();
            } else {
                affs affsVar4 = (affs) this.a;
                affq affqVar = affsVar4.c;
                if (!affqVar.e()) {
                    affsVar4.h();
                    J(affvVar, new afgb());
                    affsVar4.i();
                    return;
                }
                if (afhmVar.b) {
                    affsVar4.e.f();
                }
                Intent intent2 = afhmVar.c;
                intent2.getClass();
                afgf.a(intent2, affdVarA);
                intent2.putExtra("$tiktok$for_requirement_activity", true);
                afhb afhbVar = affsVar4.h;
                if (afhbVar == null) {
                    awrc.b("config");
                    afhbVar = null;
                }
                intent2.putExtra("$tiktok$canRestartAccountSelector", afhbVar.b);
                intent2.addFlags(65536);
                affqVar.b().b(intent2, null);
            }
            ((affs) this.a).i();
        }
    }

    public final hvw c(YouTubeButton youTubeButton) {
        git gitVar = (git) this.a;
        ghj ghjVar = gitVar.b;
        Context context = (Context) ghjVar.b.io();
        vxe vxeVar = (vxe) ghjVar.k.io();
        ght ghtVar = gitVar.a;
        return new hvw(context, vxeVar, (xgn) ghtVar.Ac.io(), (abvn) ghtVar.cH.io(), youTubeButton, (ibs) ghtVar.FV.io());
    }

    public final xeo d() {
        ght ghtVar = ((ghs) this.a).a;
        return new xeo((zus) ghtVar.cj.io(), (Executor) ghtVar.u.io(), (ztf) ghtVar.cg.io(), (xet) ghtVar.qE.io(), (xfg) ghtVar.qD.io());
    }

    public final wbx e(ContextObserver contextObserver, FaultObserver faultObserver, wjr wjrVar) {
        ByteStore byteStoreCreateWithQueues;
        ght ghtVar = ((ghs) this.a).a;
        tqj tqjVar = (tqj) ghtVar.q.io();
        aupr auprVar = ghtVar.u;
        aupr auprVar2 = ghtVar.T;
        aupr auprVar3 = ghtVar.z;
        vxz vxzVar = (vxz) ghtVar.dP.io();
        int i = adba.a;
        agfa agfaVar = new agfa(Boolean.valueOf(vxzVar.l(79, 45399750L, false)));
        agev agevVar = (agev) ghtVar.ef.io();
        meg.a();
        int i2 = tqr.a;
        if (tqjVar.k(1073815013)) {
            boolean zK = tqjVar.k(1073815107);
            boolean zK2 = tqjVar.k(1073830516);
            boolean zK3 = tqjVar.k(1073815220);
            boolean zK4 = tqjVar.k(1073815222);
            boolean zK5 = tqjVar.k(1073815221);
            boolean zK6 = tqjVar.k(1073815223);
            byteStoreCreateWithQueues = ByteStore.createWithQueues(new ByteStoreConfig(true, new NamespacedStoreConfig(zK, zK2, zK5, zK6), false, false), new npm((Executor) (zK3 ? auprVar2.io() : auprVar.io())), new npm((Executor) (zK4 ? auprVar3.io() : auprVar.io())), new npm((Executor) auprVar.io()));
        } else {
            boolean zBooleanValue = ((Boolean) agfaVar.e(Boolean.FALSE)).booleanValue();
            if (zBooleanValue && !agevVar.g()) {
                throw new IllegalArgumentException("Expected an executor if namespaces or async notifications are enabled.");
            }
            byteStoreCreateWithQueues = ByteStore.create(new ByteStoreConfig(false, NamespacedStoreConfig.EMPTY_CONFIG, zBooleanValue, false), (ExecutorRegistry) agevVar.f());
        }
        byteStoreCreateWithQueues.getClass();
        wfl wflVar = (wfl) ghtVar.eh.io();
        Map mapCT = ghtVar.cT();
        aijp aijpVar = wey.a;
        aupr auprVar4 = ghtVar.dE;
        return new wbx(byteStoreCreateWithQueues, wflVar, mapCT, auprVar4, (vxz) ghtVar.aL.io(), contextObserver, faultObserver, wjrVar);
    }

    public final /* synthetic */ zyw f(agfr agfrVar) {
        agfrVar.getClass();
        return new zyw((zyx) ((ghs) this.a).a.qv.io(), new awmp(new yhn(agfrVar, 4)));
    }

    public final tqf g(File file) {
        ght ghtVar = ((ghs) this.a).a;
        tqf tqfVar = new tqf((twh) ghtVar.o.io(), ghtVar.u, ghtVar.w, file);
        tqfVar.i();
        return tqfVar;
    }

    public final abdi h(abvn abvnVar) {
        ght ghtVar = ((ghs) this.a).a;
        abjf abjfVar = (abjf) ghtVar.kl.io();
        vxz vxzVar = (vxz) ghtVar.ba.io();
        abdw abdvVar = new abdv(ghtVar.v);
        if (!((vxz) ghtVar.km.io()).l(127, 45834322L, false)) {
            abdvVar = new gkp();
        }
        return new abdi(abjfVar, vxzVar, abdvVar, new abxv((awmd) ghtVar.jS, (awmd) ghtVar.kn, (awmd) ghtVar.eW, (awmd) ghtVar.bP, (short[]) null), ghtVar.kk, abvnVar);
    }

    @tcc
    void handleLikeVideoActionEvent(gsg gsgVar) {
        amlh amlhVar;
        hhd hhdVar = (hhd) this.a;
        hgz hgzVar = hhdVar.e;
        if (hgzVar == null || !hgzVar.b || (amlhVar = hgzVar.c) == null || !TextUtils.equals(gsgVar.a, amlhVar.c)) {
            return;
        }
        hgz hgzVar2 = hhdVar.e;
        hgzVar2.a = gsgVar.b;
        hhdVar.f = hgzVar2;
        Iterator it = hhdVar.c.iterator();
        while (it.hasNext()) {
            ((hha) it.next()).a(hhdVar.e);
        }
    }

    public final xge i(boolean z, boolean z2) {
        ght ghtVar = ((ghs) this.a).a;
        dov dovVar = (dov) ghtVar.aR.io();
        txp txpVar = (txp) ghtVar.aS.io();
        tbt tbtVar = (tbt) ghtVar.I.io();
        xgo xgoVar = (xgo) ghtVar.jS.io();
        xgp xgpVar = (xgp) ghtVar.jT.io();
        vxz vxzVar = (vxz) ghtVar.ce.io();
        aupr auprVar = ghtVar.eW;
        Executor executor = (Executor) ghtVar.bP.io();
        return new xge(dovVar, txpVar, tbtVar, xgoVar, xgpVar, vxzVar, auprVar, executor, (tqj) ghtVar.q.io(), ghtVar.aV, z, z2);
    }

    public final wdf j(zwa zwaVar) {
        ght ghtVar = ((ghs) this.a).a;
        Executor executor = (Executor) ghtVar.z.io();
        hhb hhbVar = (hhb) ghtVar.jj.io();
        hhb hhbVar2 = (hhb) ghtVar.js.io();
        ghtVar.ag();
        return new wdf(executor, hhbVar, hhbVar2, ghtVar.eo, (wfl) ghtVar.eh.io(), (wcl) ghtVar.jt.io(), new zik(), zwaVar, (vxz) ghtVar.aL.io());
    }

    public final /* synthetic */ cah k(CronetEngine cronetEngine, Executor executor, agex agexVar, int i, int i2, boolean z, boolean z2) {
        return new yot(cronetEngine, executor, agexVar, i, i2, z, z2, (vxz) ((ghs) this.a).a.aL.io());
    }

    public final jhh l(SwipeRefreshLayout swipeRefreshLayout) {
        return new jhh(swipeRefreshLayout, (jlh) ((ghi) this.a).a.xP.io());
    }

    public final joa m(ViewGroup viewGroup, mav mavVar) {
        ghi ghiVar = (ghi) this.a;
        xgn xgnVar = (xgn) ghiVar.a.Ac.io();
        ghj ghjVar = ghiVar.b;
        return new joa(viewGroup, mavVar, xgnVar, aupm.b(ghjVar.cf), (acyx) ghjVar.bf.io());
    }

    public final void n() {
        ((agrc) ((agrc) get.a.c()).k("com/google/android/apps/youtube/music/activities/MusicActivityPeer$WatchWhileListener", "onWatchWhileDismissed", 2746, "MusicActivityPeer.java")).t("onWatchWhileDismissed");
        get getVar = (get) this.a;
        getVar.d();
        ((idk) getVar.al.io()).i();
        getVar.t(hww.a);
        getVar.bd.c(0.0f);
        aunn aunnVar = getVar.G;
        ((tth) aunnVar.io()).e();
        ((tth) aunnVar.io()).g(1);
        hkl hklVar = getVar.bV;
        hklVar.i();
        hklVar.j();
        getVar.o();
        getVar.u.set(false);
        getVar.r();
    }

    public final void o() {
        get getVar = (get) this.a;
        getVar.o();
        getVar.l.setVisibility(8);
    }

    public final void p(hww hwwVar) {
        get getVar = (get) this.a;
        getVar.t(hwwVar);
        getVar.bd.c(1.0f);
        ((dov) getVar.aM.io()).v();
        aunn aunnVar = getVar.G;
        ((tth) aunnVar.io()).e();
        ((tth) aunnVar.io()).g(1);
        getVar.bV.a();
        ViewGroup viewGroup = ((jhl) getVar.bC.io()).d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        getVar.o();
        qr qrVar = getVar.e;
        qrVar.f();
        MusicActivity musicActivity = getVar.bh;
        musicActivity.getOnBackPressedDispatcher().c(musicActivity, qrVar);
        qrVar.g(true);
        getVar.d.g(false);
    }

    public final float q(fmp fmpVar) {
        flr flrVar = (flr) ((flu) this.a).k.K(fmpVar.a);
        Map map = flrVar.a;
        fmh fmhVar = fmpVar.b;
        tge tgeVar = (tge) map.get(fmhVar);
        if (tgeVar != null) {
            return ((fnp) tgeVar.c).c;
        }
        fkm fkmVar = flrVar.c == 0 ? flrVar.e : flrVar.d;
        if (fkmVar != null) {
            return fmhVar.e((fjh) fkmVar.d());
        }
        throw new RuntimeException("Both LayoutOutputs were null!");
    }

    public final fmi r(fmp fmpVar) {
        return (fmi) ((tge) ((flr) ((flu) this.a).k.K(fmpVar.a)).a.get(fmpVar.b)).c;
    }

    public final void s(int i, int i2) {
        dgr dgrVar = (dgr) this.a;
        dii diiVarD = dgrVar.d();
        if (dgrVar.f() != diiVarD) {
            dgrVar.n(diiVarD, i, i2, true);
        }
    }

    public final void t(ccr ccrVar) {
        Object obj = this.a;
        ((ccm) obj).e.d(new blq(obj, ccrVar, 16, (short[]) null));
    }

    public final oh u(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        oh ohVar = null;
        for (int i2 = 0; i2 < iB; i2++) {
            View viewE = recyclerView.h.e(i2);
            oh ohVar2 = viewE == null ? null : ((nq) viewE.getLayoutParams()).c;
            if (ohVar2 != null && !ohVar2.v() && ohVar2.c == i) {
                if (!recyclerView.h.k(ohVar2.a)) {
                    ohVar = ohVar2;
                    break;
                }
                ohVar = ohVar2;
            }
        }
        if (ohVar == null || recyclerView.h.k(ohVar.a)) {
            return null;
        }
        return ohVar;
    }

    public final void v(kc kcVar) {
        int i = kcVar.a;
        if (i == 1) {
            RecyclerView recyclerView = (RecyclerView) this.a;
            recyclerView.n.onItemsAdded(recyclerView, kcVar.b, kcVar.d);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView2 = (RecyclerView) this.a;
            recyclerView2.n.onItemsRemoved(recyclerView2, kcVar.b, kcVar.d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = (RecyclerView) this.a;
            recyclerView3.n.onItemsUpdated(recyclerView3, kcVar.b, kcVar.d, kcVar.c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = (RecyclerView) this.a;
            recyclerView4.n.onItemsMoved(recyclerView4, kcVar.b, kcVar.d, 1);
        }
    }

    public final void w(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iB) {
                break;
            }
            View viewE = recyclerView.h.e(i6);
            oh ohVar = viewE == null ? null : ((nq) viewE.getLayoutParams()).c;
            if (ohVar != null && !ohVar.A() && (i5 = ohVar.c) >= i && i5 < i3) {
                ohVar.f(2);
                ohVar.e(obj);
                ((nq) viewE.getLayoutParams()).e = true;
            }
            i6++;
        }
        nv nvVar = recyclerView.e;
        ArrayList arrayList = nvVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.Q = true;
                return;
            }
            oh ohVar2 = (oh) arrayList.get(size);
            if (ohVar2 != null && (i4 = ohVar2.c) >= i && i4 < i3) {
                ohVar2.f(2);
                nvVar.h(size);
            }
        }
    }

    public final void x(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        for (int i3 = 0; i3 < iB; i3++) {
            View viewE = recyclerView.h.e(i3);
            oh ohVar = viewE == null ? null : ((nq) viewE.getLayoutParams()).c;
            if (ohVar != null && !ohVar.A() && ohVar.c >= i) {
                ohVar.k(i2, false);
                recyclerView.O.f = true;
            }
        }
        ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            oh ohVar2 = (oh) arrayList.get(i4);
            if (ohVar2 != null && ohVar2.c >= i) {
                ohVar2.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.P = true;
    }

    public final void y(int i, int i2) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            if (i6 >= iB) {
                break;
            }
            oh ohVarK = RecyclerView.k(recyclerView.h.e(i6));
            if (ohVarK != null) {
                int i7 = i < i2 ? i : i2;
                int i8 = ohVarK.c;
                if (i8 >= i7) {
                    if (i8 <= (i < i2 ? i2 : i)) {
                        if (i8 == i) {
                            ohVarK.k(i2 - i, false);
                        } else {
                            ohVarK.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.O.f = true;
                    }
                }
            }
            i6++;
        }
        nv nvVar = recyclerView.e;
        if (i < i2) {
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        ArrayList arrayList = nvVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            oh ohVar = (oh) arrayList.get(i9);
            if (ohVar != null && (i5 = ohVar.c) >= i4 && i5 <= i3) {
                if (i5 == i) {
                    ohVar.k(i2 - i, false);
                } else {
                    ohVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.P = true;
    }

    public final void z(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.S(i, i2, true);
        recyclerView.P = true;
        recyclerView.O.c += i2;
    }

    public /* synthetic */ hhb(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
