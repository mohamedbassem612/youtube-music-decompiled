package defpackage;

import android.os.Looper;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afqf extends bpi implements bnu {
    public final Map a = new afv(2);
    public boolean b = false;
    public bog c = null;
    public final Map d = new afv();
    public boolean e = false;

    private final void a(bog bogVar) {
        ahno.O(Looper.getMainLooper().getThread() == Thread.currentThread());
        Set set = (Set) this.a.remove(bogVar);
        ahno.P(set != null, "A LifecycleOwner was destroyed that was never observed, or was destroyed twice.");
        this.e = true;
        if (bogVar == this.c) {
            this.c = null;
        }
        Set setKeySet = this.d.keySet();
        setKeySet.getClass();
        set.getClass();
        agqd agqdVar = new agqd(setKeySet, set);
        ahno.R(agqdVar.isEmpty(), "This lifecycle didn't call getOrCreate() for the following IDs: %s Each value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", agqdVar);
    }

    @Override // defpackage.bpi
    public final void d() {
        for (aciz acizVar : this.d.values()) {
            Object obj = acizVar.b;
            Object obj2 = acizVar.a;
        }
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        a(bogVar);
        bogVar.getLifecycle().c(this);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        a(bogVar);
        bogVar.getLifecycle().c(this);
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
