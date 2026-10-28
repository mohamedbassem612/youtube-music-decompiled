package com.google.research.xeno.effect;

import defpackage.atvg;
import defpackage.atvh;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class CapabilitiesManifest implements atvg {
    private long a;
    private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public CapabilitiesManifest(long j) {
        this.a = j;
    }

    public static native long nativeLoadDefaultCapabilitiesManifest();

    private native void nativeRelease(long j);

    public final void b() {
        this.b.writeLock().lock();
        try {
            long j = this.a;
            if (j != 0) {
                nativeRelease(j);
            }
            this.a = 0L;
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // defpackage.atvg
    public final void iD(atvh atvhVar) {
        this.b.readLock().lock();
        try {
            atvhVar.a(this.a);
        } finally {
            this.b.readLock().unlock();
        }
    }
}
