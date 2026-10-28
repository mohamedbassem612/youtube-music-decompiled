package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nuu;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class HybridElement {
    private static final agp proxyMap = new agp(6);

    public static HybridElement copyFromNative(long j) {
        return CppProxy.copyFromNative(j);
    }

    public static HybridElement create(ByteBuffer byteBuffer) {
        return CppProxy.create(byteBuffer);
    }

    public static HybridElement createFromNative(long j, MaterializationResult materializationResult) {
        return CppProxy.createFromNative(j, materializationResult);
    }

    public static HybridElement createFromNativeUpb(long j, long j2) {
        return CppProxy.createFromNativeUpb(j, j2);
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j, null);
        proxyMap.d(j, new WeakReference(cppProxy));
        return cppProxy;
    }

    public static HybridElement createWeakFromNative(long j) {
        return CppProxy.createWeakFromNative(j);
    }

    private static CppProxy getExistingProxy(long j) {
        agp agpVar = proxyMap;
        WeakReference weakReference = (WeakReference) agpVar.a(j);
        if (weakReference == null) {
            return null;
        }
        CppProxy cppProxy = (CppProxy) weakReference.get();
        if (cppProxy != null) {
            return cppProxy;
        }
        agpVar.e(j);
        return null;
    }

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends HybridElement {
        private final AtomicBoolean destroyed;
        private final long nativeRef;
        private final AtomicBoolean registeredWithNativeObjectManager;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            this.registeredWithNativeObjectManager = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native HybridElement copyFromNative(long j);

        public static native HybridElement create(ByteBuffer byteBuffer);

        public static native HybridElement createFromNative(long j, MaterializationResult materializationResult);

        public static native HybridElement createFromNativeUpb(long j, long j2);

        public static native HybridElement createWeakFromNative(long j);

        public static native void nativeDestroy(long j);

        public void _djinni_private_destroy() {
            if (this.registeredWithNativeObjectManager.get() || this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            if (this.registeredWithNativeObjectManager.get()) {
                return;
            }
            _djinni_private_destroy();
            super.finalize();
        }

        public /* synthetic */ CppProxy(long j, nuu nuuVar) {
            this(j);
        }
    }
}
