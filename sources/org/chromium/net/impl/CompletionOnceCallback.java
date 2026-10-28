package org.chromium.net.impl;

import internal.J.N;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class CompletionOnceCallback implements AutoCloseable {
    private final long a;
    private boolean b;

    CompletionOnceCallback(long j) {
        this.a = j;
    }

    public final void a(int i) {
        if (this.b) {
            throw new IllegalStateException("This callback can only be run once");
        }
        N.MGR2x4WJ(this.a, i);
        this.b = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.b) {
            throw new AssertionError("run should always be called prior to close");
        }
    }
}
