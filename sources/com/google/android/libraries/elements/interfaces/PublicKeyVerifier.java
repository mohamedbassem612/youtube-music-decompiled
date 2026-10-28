package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nvt;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class PublicKeyVerifier {
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

    public abstract Status initialize(String str, byte[] bArr, byte[] bArr2);

    public abstract Status verify(byte[] bArr, byte[] bArr2);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends PublicKeyVerifier {
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

        private native Status native_initialize(long j, String str, byte[] bArr, byte[] bArr2);

        private native Status native_verify(long j, byte[] bArr, byte[] bArr2);

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

        @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
        public Status initialize(String str, byte[] bArr, byte[] bArr2) {
            return native_initialize(this.nativeRef, str, bArr, bArr2);
        }

        @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
        public Status verify(byte[] bArr, byte[] bArr2) {
            return native_verify(this.nativeRef, bArr, bArr2);
        }

        public /* synthetic */ CppProxy(long j, nvt nvtVar) {
            this(j);
        }
    }
}
