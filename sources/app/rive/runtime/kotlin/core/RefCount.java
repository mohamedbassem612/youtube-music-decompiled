package app.rive.runtime.kotlin.core;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface RefCount {

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.RefCount$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
    }

    int acquire();

    int getRefCount();

    AtomicInteger getRefs();

    int release();

    void setRefs(AtomicInteger atomicInteger);
}
