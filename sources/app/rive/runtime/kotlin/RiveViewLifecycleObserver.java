package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.RefCount;
import defpackage.bnu;
import defpackage.bog;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RiveViewLifecycleObserver implements bnu {
    public static final int $stable = 0;
    private final List dependencies;

    public RiveViewLifecycleObserver(List list) {
        list.getClass();
        this.dependencies = list;
    }

    protected final List getDependencies() {
        return this.dependencies;
    }

    public final void insert(RefCount refCount) {
        refCount.getClass();
        this.dependencies.add(refCount);
    }

    @Override // defpackage.bnu
    public /* synthetic */ void onCreate(bog bogVar) {
        bogVar.getClass();
    }

    @Override // defpackage.bnu
    public void onDestroy(bog bogVar) {
        bogVar.getClass();
        Iterator it = this.dependencies.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        bogVar.getLifecycle().c(this);
    }

    @Override // defpackage.bnu
    public /* synthetic */ void onPause(bog bogVar) {
        bogVar.getClass();
    }

    @Override // defpackage.bnu
    public /* synthetic */ void onResume(bog bogVar) {
        bogVar.getClass();
    }

    @Override // defpackage.bnu
    public /* synthetic */ void onStart(bog bogVar) {
        bogVar.getClass();
    }

    @Override // defpackage.bnu
    public /* synthetic */ void onStop(bog bogVar) {
        bogVar.getClass();
    }

    public final boolean remove(RefCount refCount) {
        refCount.getClass();
        return this.dependencies.remove(refCount);
    }
}
