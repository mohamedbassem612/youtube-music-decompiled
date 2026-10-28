package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nss;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class DebugCounters {
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

    public static int djinniProxyCacheSize() {
        return CppProxy.djinniProxyCacheSize();
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

    public static int jsControllerCreateCount() {
        return CppProxy.jsControllerCreateCount();
    }

    public static int jsControllerCreateDisposeCount() {
        return CppProxy.jsControllerCreateDisposeCount();
    }

    public static int jsControllerDisposeCount() {
        return CppProxy.jsControllerDisposeCount();
    }

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends DebugCounters {
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native int djinniProxyCacheSize();

        public static native int jsControllerCreateCount();

        public static native int jsControllerCreateDisposeCount();

        public static native int jsControllerDisposeCount();

        public static native void nativeDestroy(long j);

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

        public /* synthetic */ CppProxy(long j, nss nssVar) {
            this(j);
        }
    }
}
