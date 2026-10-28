package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nvh;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSStateHolder {
    private static final agp proxyMap = new agp(6);

    public static JSStateHolder create(byte[] bArr, byte[] bArr2) {
        return CppProxy.create(bArr, bArr2);
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

    public abstract byte[] getStateBytes();

    public abstract long getStateUpdateCount();

    public abstract boolean hasState();

    public abstract void registerStateUpdateHandler(JSStateUpdateHandler jSStateUpdateHandler);

    public abstract void setEnableDeadlockFix(boolean z);

    public abstract boolean setModel(byte[] bArr);

    public abstract void setStateBytes(byte[] bArr);

    public abstract void setStateUpdateHandler(JSStateUpdateHandler jSStateUpdateHandler);

    public abstract void unregisterStateUpdateHandler(JSStateUpdateHandler jSStateUpdateHandler);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends JSStateHolder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native JSStateHolder create(byte[] bArr, byte[] bArr2);

        public static native void nativeDestroy(long j);

        private native byte[] native_getStateBytes(long j);

        private native long native_getStateUpdateCount(long j);

        private native boolean native_hasState(long j);

        private native void native_registerStateUpdateHandler(long j, JSStateUpdateHandler jSStateUpdateHandler);

        private native void native_setEnableDeadlockFix(long j, boolean z);

        private native boolean native_setModel(long j, byte[] bArr);

        private native void native_setStateBytes(long j, byte[] bArr);

        private native void native_setStateUpdateHandler(long j, JSStateUpdateHandler jSStateUpdateHandler);

        private native void native_unregisterStateUpdateHandler(long j, JSStateUpdateHandler jSStateUpdateHandler);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public byte[] getStateBytes() {
            return native_getStateBytes(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public long getStateUpdateCount() {
            return native_getStateUpdateCount(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public boolean hasState() {
            return native_hasState(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public void registerStateUpdateHandler(JSStateUpdateHandler jSStateUpdateHandler) {
            native_registerStateUpdateHandler(this.nativeRef, jSStateUpdateHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public void setEnableDeadlockFix(boolean z) {
            native_setEnableDeadlockFix(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public boolean setModel(byte[] bArr) {
            return native_setModel(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public void setStateBytes(byte[] bArr) {
            native_setStateBytes(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public void setStateUpdateHandler(JSStateUpdateHandler jSStateUpdateHandler) {
            native_setStateUpdateHandler(this.nativeRef, jSStateUpdateHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateHolder
        public void unregisterStateUpdateHandler(JSStateUpdateHandler jSStateUpdateHandler) {
            native_unregisterStateUpdateHandler(this.nativeRef, jSStateUpdateHandler);
        }

        public /* synthetic */ CppProxy(long j, nvh nvhVar) {
            this(j);
        }
    }
}
