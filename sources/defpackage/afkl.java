package defpackage;

import android.os.Handler;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afkl extends afki implements bnu {
    public static final agrf a = agrf.h("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private afkm b;
    private final awmd c;
    private final bpp d;
    private final boc e;
    private final afkk f = new afkk();
    private boolean g = false;
    private boolean h = false;
    private final Set i = new HashSet();

    public afkl(awmd awmdVar, bpp bppVar, boc bocVar) {
        this.c = awmdVar;
        this.d = bppVar;
        bocVar.b(this);
        this.e = bocVar;
    }

    private final void f() {
        this.h = true;
        Handler handlerA = qpj.a();
        afkk afkkVar = this.f;
        handlerA.removeCallbacks(afkkVar);
        afkkVar.a.clear();
        afkkVar.b = null;
        this.g = true;
        afkm afkmVar = this.b;
        afkmVar.e = true;
        afkh afkhVar = afkmVar.b;
        qpj.c();
        for (Map.Entry entry : afkhVar.b.entrySet()) {
            ahno.R(afkhVar.a.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
        for (afko afkoVar : afkmVar.c) {
            if (afkoVar.b) {
                try {
                    afkhVar.b(afkoVar.a);
                } catch (NullPointerException e) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(afkoVar))), e);
                }
            } else {
                afkm.a((afkj) afkhVar.b(afkoVar.a), afkoVar);
            }
            afkoVar.c(afkmVar);
        }
    }

    @Override // defpackage.afki
    protected final void a(ListenableFuture listenableFuture, Object obj, afkj afkjVar) {
        qpj.c();
        ahno.P(!((dd) this.c.io()).ad(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        afuy afuyVar = afvf.a;
        afvl afvlVarB = afty.b();
        if (afvlVarB != null) {
            afuv afuvVarK = afvlVarB.k(afvf.b);
            if (afuvVarK.b() && ((Boolean) afuvVarK.a()).booleanValue()) {
                StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
            }
        }
        this.b.b(listenableFuture, obj, afkjVar);
        if (this.g) {
            return;
        }
        Throwable th = new Throwable();
        th.fillInStackTrace();
        ((agrc) ((agrc) ((agrc) a.c()).j(th)).k("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", (char) 216, "FuturesMixinImpl.java")).t("listen() called outside listening window");
        afkk afkkVar = this.f;
        afkkVar.a.add(afkjVar);
        afkkVar.b = afwl.i(new aeia(7));
        qpj.f(afkkVar);
        qpj.e(afkkVar);
    }

    @Override // defpackage.afki
    public final void b(afkj afkjVar) {
        qpj.c();
        ahno.P(!this.h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        ahno.P(!this.e.a().a(bob.d), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        ahno.P(!this.g, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        afkm afkmVar = this.b;
        if (afkmVar != null) {
            afkmVar.c(afkjVar);
        } else {
            this.i.add(afkjVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.afki
    public final void e(ahub ahubVar, ahub ahubVar2, afkj afkjVar) {
        qpj.c();
        ahno.P(!((dd) this.c.io()).ad(), "Listen called outside safe window. State loss is possible.");
        this.b.b(ahubVar.a, ahubVar2.a, afkjVar);
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        this.b = (afkm) new bpn(this.d).a(afkm.class);
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.c((afkj) it.next());
        }
        set.clear();
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        afkm afkmVar = this.b;
        ahno.P(!afkmVar.e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        afkh afkhVar = afkmVar.b;
        qpj.c();
        afkhVar.a.clear();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        if (this.g) {
            return;
        }
        f();
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        ahno.P(!this.g, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        f();
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        if (this.g) {
            afkm afkmVar = this.b;
            afkmVar.e = false;
            Iterator it = afkmVar.c.iterator();
            while (it.hasNext()) {
                ((afko) it.next()).c(null);
            }
            this.g = false;
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }
}
