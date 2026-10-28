package com.google.android.libraries.youtube.composition.logging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CompositionRuntimeLifecycleListener {
    public abstract void onCompositionRuntimeCreated(long j);

    public abstract void onCompositionRuntimeDestroyed(long j);

    public abstract void onServiceCreated(long j, long j2, CompositionRuntimeServiceType compositionRuntimeServiceType);

    public abstract void onServiceDestroyed(long j, long j2);
}
