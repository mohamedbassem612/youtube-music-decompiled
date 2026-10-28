package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.blocks.Container;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nvw;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class QueriesSubscriptionProcessorRegistrar {
    private static final agp proxyMap = new agp(6);

    public static StatusOr create(Container container, byte[] bArr) {
        return CppProxy.create(container, bArr);
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

    public abstract void registerProcessors(SubscriptionProcessorResolver subscriptionProcessorResolver);

    public abstract void registerUpbProcessors(SubscriptionProcessorResolver subscriptionProcessorResolver);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends QueriesSubscriptionProcessorRegistrar {
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

        public static native StatusOr create(Container container, byte[] bArr);

        public static native void nativeDestroy(long j);

        private native void native_registerProcessors(long j, SubscriptionProcessorResolver subscriptionProcessorResolver);

        private native void native_registerUpbProcessors(long j, SubscriptionProcessorResolver subscriptionProcessorResolver);

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

        @Override // com.google.android.libraries.elements.interfaces.QueriesSubscriptionProcessorRegistrar
        public void registerProcessors(SubscriptionProcessorResolver subscriptionProcessorResolver) {
            native_registerProcessors(this.nativeRef, subscriptionProcessorResolver);
        }

        @Override // com.google.android.libraries.elements.interfaces.QueriesSubscriptionProcessorRegistrar
        public void registerUpbProcessors(SubscriptionProcessorResolver subscriptionProcessorResolver) {
            native_registerUpbProcessors(this.nativeRef, subscriptionProcessorResolver);
        }

        public /* synthetic */ CppProxy(long j, nvw nvwVar) {
            this(j);
        }
    }
}
