package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nwh;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ScopedTransaction {
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

    public abstract void cancel();

    public abstract void clear();

    public abstract byte[] get(String str);

    public abstract byte[] getLocal(String str);

    public abstract byte[] getLocalMetadata(String str);

    public abstract byte[] getMetadata(String str);

    public abstract void remove(String str);

    public abstract void set(String str, byte[] bArr);

    public abstract void setMetadata(String str, byte[] bArr);

    public abstract void setWithMetadata(String str, byte[] bArr, byte[] bArr2);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ScopedTransaction {
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

        public static native void nativeDestroy(long j);

        private native void native_cancel(long j);

        private native void native_clear(long j);

        private native byte[] native_get(long j, String str);

        private native byte[] native_getLocal(long j, String str);

        private native byte[] native_getLocalMetadata(long j, String str);

        private native byte[] native_getMetadata(long j, String str);

        private native void native_remove(long j, String str);

        private native void native_set(long j, String str, byte[] bArr);

        private native void native_setMetadata(long j, String str, byte[] bArr);

        private native void native_setWithMetadata(long j, String str, byte[] bArr, byte[] bArr2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public void cancel() {
            native_cancel(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public void clear() {
            native_clear(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public byte[] get(String str) {
            return native_get(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public byte[] getLocal(String str) {
            return native_getLocal(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public byte[] getLocalMetadata(String str) {
            return native_getLocalMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public byte[] getMetadata(String str) {
            return native_getMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public void remove(String str) {
            native_remove(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public void set(String str, byte[] bArr) {
            native_set(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public void setMetadata(String str, byte[] bArr) {
            native_setMetadata(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScopedTransaction
        public void setWithMetadata(String str, byte[] bArr, byte[] bArr2) {
            native_setWithMetadata(this.nativeRef, str, bArr, bArr2);
        }

        public /* synthetic */ CppProxy(long j, nwh nwhVar) {
            this(j);
        }
    }
}
