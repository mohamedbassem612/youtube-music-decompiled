package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nvl;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class MaterializationResult {
    private static final agp proxyMap = new agp(6);

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j, null);
        proxyMap.d(j, new WeakReference(cppProxy));
        return cppProxy;
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

    public abstract long getArenaHandle();

    public abstract byte[] getElement();

    public abstract long getNativeUpb();

    public abstract boolean isWasm();

    public abstract int materializationNumber();

    public abstract long size();

    public abstract String toString();

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends MaterializationResult {
        static final /* synthetic */ boolean $assertionsDisabled = false;
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

        public static native void nativeDestroy(long j);

        private native long native_getArenaHandle(long j);

        private native byte[] native_getElement(long j);

        private native long native_getNativeUpb(long j);

        private native boolean native_isWasm(long j);

        private native int native_materializationNumber(long j);

        private native long native_size(long j);

        private native String native_toString(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public long getArenaHandle() {
            return native_getArenaHandle(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public byte[] getElement() {
            return native_getElement(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public long getNativeUpb() {
            return native_getNativeUpb(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public boolean isWasm() {
            return native_isWasm(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public int materializationNumber() {
            return native_materializationNumber(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public long size() {
            return native_size(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.MaterializationResult
        public String toString() {
            return native_toString(this.nativeRef);
        }

        public /* synthetic */ CppProxy(long j, nvl nvlVar) {
            this(j);
        }
    }
}
