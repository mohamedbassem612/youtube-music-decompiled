package com.google.android.libraries.multiplatform.elements.runtime;

import dalvik.annotation.optimization.CriticalNative;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NodeTreeImpl implements AutoCloseable {
    public final long a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public NodeTreeImpl(long j) {
        this.a = j;
    }

    private static native long jniCloneNodeTreeRef(long j);

    private static native long jniCreateEmptyNodeTree();

    private static native void jniDeleteNodeTree(long j);

    private static native long jniGetInstanceCount();

    private static native long jniSnapshotVersion(long j);

    @CriticalNative
    private static native long jniSnapshotVersionCritical(long j);

    public final /* bridge */ /* synthetic */ Object clone() {
        return new NodeTreeImpl(jniCloneNodeTreeRef(this.a));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        jniDeleteNodeTree(this.a);
    }
}
