package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.boa;
import defpackage.bob;
import defpackage.boc;
import defpackage.bof;
import defpackage.bog;
import defpackage.fcy;
import defpackage.fcz;
import defpackage.ffs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleLifecycle implements fcy, bof {
    private final Set a = new HashSet();
    private final boc b;

    public LifecycleLifecycle(boc bocVar) {
        this.b = bocVar;
        bocVar.b(this);
    }

    @Override // defpackage.fcy
    public final void a(fcz fczVar) {
        this.a.add(fczVar);
        boc bocVar = this.b;
        if (bocVar.a() == bob.a) {
            fczVar.k();
        } else if (bocVar.a().a(bob.d)) {
            fczVar.l();
        } else {
            fczVar.m();
        }
    }

    @Override // defpackage.fcy
    public final void b(fcz fczVar) {
        this.a.remove(fczVar);
    }

    @OnLifecycleEvent(a = boa.ON_DESTROY)
    public void onDestroy(bog bogVar) {
        Iterator it = ffs.e(this.a).iterator();
        while (it.hasNext()) {
            ((fcz) it.next()).k();
        }
        bogVar.getLifecycle().c(this);
    }

    @OnLifecycleEvent(a = boa.ON_START)
    public void onStart(bog bogVar) {
        Iterator it = ffs.e(this.a).iterator();
        while (it.hasNext()) {
            ((fcz) it.next()).l();
        }
    }

    @OnLifecycleEvent(a = boa.ON_STOP)
    public void onStop(bog bogVar) {
        Iterator it = ffs.e(this.a).iterator();
        while (it.hasNext()) {
            ((fcz) it.next()).m();
        }
    }
}
