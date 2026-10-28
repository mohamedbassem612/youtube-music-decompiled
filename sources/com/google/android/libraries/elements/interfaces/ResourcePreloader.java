package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nwc;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResourcePreloader {
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

    public abstract Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

    public abstract Status ensureResourceLoaded(byte[] bArr, ProcessState processState, ErrorPolicy errorPolicy, Long l);

    public abstract Status loadAll();

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ResourcePreloader {
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

        private native Status native_ensureLoaded(long j, HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

        private native Status native_ensureResourceLoaded(long j, byte[] bArr, ProcessState processState, ErrorPolicy errorPolicy, Long l);

        private native Status native_loadAll(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l) {
            return native_ensureLoaded(this.nativeRef, hashSet, processState, errorPolicy, l);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status ensureResourceLoaded(byte[] bArr, ProcessState processState, ErrorPolicy errorPolicy, Long l) {
            return native_ensureResourceLoaded(this.nativeRef, bArr, processState, errorPolicy, l);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status loadAll() {
            return native_loadAll(this.nativeRef);
        }

        public /* synthetic */ CppProxy(long j, nwc nwcVar) {
            this(j);
        }
    }
}
