package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.blocks.Container;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nvv;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class Queries {
    private static final agp proxyMap = new agp(6);

    public static StatusOr createByteStoreBlock(Container container, ByteStore byteStore) {
        return CppProxy.createByteStoreBlock(container, byteStore);
    }

    public static StatusOr createEnvironmentDataBlock(Container container, EnvironmentDataSource environmentDataSource) {
        return CppProxy.createEnvironmentDataBlock(container, environmentDataSource);
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

    public static Status registerProcessors(Container container, byte[] bArr, SubscriptionProcessorResolver subscriptionProcessorResolver) {
        return CppProxy.registerProcessors(container, bArr, subscriptionProcessorResolver);
    }

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends Queries {
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native StatusOr createByteStoreBlock(Container container, ByteStore byteStore);

        public static native StatusOr createEnvironmentDataBlock(Container container, EnvironmentDataSource environmentDataSource);

        public static native void nativeDestroy(long j);

        public static native Status registerProcessors(Container container, byte[] bArr, SubscriptionProcessorResolver subscriptionProcessorResolver);

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

        public /* synthetic */ CppProxy(long j, nvv nvvVar) {
            this(j);
        }
    }
}
