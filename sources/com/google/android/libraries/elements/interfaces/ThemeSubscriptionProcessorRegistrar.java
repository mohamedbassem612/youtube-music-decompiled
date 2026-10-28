package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nxf;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ThemeSubscriptionProcessorRegistrar {
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

    public static void registerProcessor(SubscriptionProcessorResolver subscriptionProcessorResolver, ThemeStore themeStore, SubscriptionObserverConfig subscriptionObserverConfig) {
        CppProxy.registerProcessor(subscriptionProcessorResolver, themeStore, subscriptionObserverConfig);
    }

    public static void registerProcessorUpb(SubscriptionProcessorResolver subscriptionProcessorResolver, ThemeStore themeStore) {
        CppProxy.registerProcessorUpb(subscriptionProcessorResolver, themeStore);
    }

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ThemeSubscriptionProcessorRegistrar {
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

        public static native void registerProcessor(SubscriptionProcessorResolver subscriptionProcessorResolver, ThemeStore themeStore, SubscriptionObserverConfig subscriptionObserverConfig);

        public static native void registerProcessorUpb(SubscriptionProcessorResolver subscriptionProcessorResolver, ThemeStore themeStore);

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

        public /* synthetic */ CppProxy(long j, nxf nxfVar) {
            this(j);
        }
    }
}
