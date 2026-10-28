package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nvj;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSSubscriptionProcessors {
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

    public static void registerProcessors(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str, BlockRegistryProvider blockRegistryProvider) {
        CppProxy.registerProcessors(jSController, subscriptionProcessorResolver, jSCommandResolver, jSBlocksContainerProvider, str, blockRegistryProvider);
    }

    public static void registerProcessorsUpb(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider) {
        CppProxy.registerProcessorsUpb(jSController, subscriptionProcessorResolver, jSCommandResolver, jSBlocksContainerProvider);
    }

    public static void registerProcessorsWithControllerLifecycleDispatcher(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str, BlockRegistryProvider blockRegistryProvider, JSControllerLifecycleDispatcher jSControllerLifecycleDispatcher) {
        CppProxy.registerProcessorsWithControllerLifecycleDispatcher(jSController, subscriptionProcessorResolver, jSCommandResolver, jSBlocksContainerProvider, str, blockRegistryProvider, jSControllerLifecycleDispatcher);
    }

    public static void registerProcessorsWithControllerLifecycleDispatcherUpb(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, JSControllerLifecycleDispatcher jSControllerLifecycleDispatcher) {
        CppProxy.registerProcessorsWithControllerLifecycleDispatcherUpb(jSController, subscriptionProcessorResolver, jSCommandResolver, jSBlocksContainerProvider, jSControllerLifecycleDispatcher);
    }

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends JSSubscriptionProcessors {
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

        public static native void registerProcessors(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str, BlockRegistryProvider blockRegistryProvider);

        public static native void registerProcessorsUpb(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider);

        public static native void registerProcessorsWithControllerLifecycleDispatcher(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str, BlockRegistryProvider blockRegistryProvider, JSControllerLifecycleDispatcher jSControllerLifecycleDispatcher);

        public static native void registerProcessorsWithControllerLifecycleDispatcherUpb(JSController jSController, SubscriptionProcessorResolver subscriptionProcessorResolver, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, JSControllerLifecycleDispatcher jSControllerLifecycleDispatcher);

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

        public /* synthetic */ CppProxy(long j, nvj nvjVar) {
            this(j);
        }
    }
}
