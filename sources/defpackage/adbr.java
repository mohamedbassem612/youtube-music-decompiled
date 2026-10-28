package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbr implements bnu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/elements/activestate/ActiveStateLifecycleController");
    public final Executor b;
    public final ArrayList c;
    public final List d;
    public final cf e;
    public awlk f;
    private adbp g;
    private final wjr h = new wjr((tyz) new adbn(), (Collection) agpr.a);

    public adbr(Executor executor, cf cfVar) {
        executor.getClass();
        this.b = executor;
        this.e = cfVar;
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.c = new ArrayList();
        this.g = adbp.a;
    }

    public final void a(adbp adbpVar) {
        awlk awlkVar;
        adbp adbpVar2 = this.g;
        this.g = adbpVar;
        adbs adbsVar = new adbs(adbpVar2, adbpVar);
        wjr wjrVar = this.h;
        ((dov) wjrVar.a).ab(new rew(wjrVar, adbsVar, 7, null));
        if (adbpVar != adbp.b || (awlkVar = this.f) == null) {
            return;
        }
        awlkVar.kn();
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }

    public final void c(auor auorVar) {
        this.c.remove(auorVar);
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
    }
}
