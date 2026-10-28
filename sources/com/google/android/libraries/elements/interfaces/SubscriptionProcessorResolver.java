package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nwu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class SubscriptionProcessorResolver {
    private static final agp proxyMap = new agp(6);

    public static StatusOr create(ByteStore byteStore, EnvironmentDataSource environmentDataSource, ClientDataObservable clientDataObservable, SubscriptionObserverConfig subscriptionObserverConfig) {
        return CppProxy.create(byteStore, environmentDataSource, clientDataObservable, subscriptionObserverConfig);
    }

    public static SubscriptionProcessorResolver createEmpty() {
        return CppProxy.createEmpty();
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

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends SubscriptionProcessorResolver {
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native StatusOr create(ByteStore byteStore, EnvironmentDataSource environmentDataSource, ClientDataObservable clientDataObservable, SubscriptionObserverConfig subscriptionObserverConfig);

        public static native SubscriptionProcessorResolver createEmpty();

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

        public /* synthetic */ CppProxy(long j, nwu nwuVar) {
            this(j);
        }
    }
}
