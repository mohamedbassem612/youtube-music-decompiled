package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import defpackage.agp;
import defpackage.nta;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class DirectUpdateProcessor {
    private static final agp proxyMap = new agp(6);

    public static DirectUpdateProcessor create(DirectUpdateExecutor directUpdateExecutor, ByteStore byteStore, DirectUpdateDataRelay directUpdateDataRelay, CommandHandlerResolver commandHandlerResolver) {
        return CppProxy.create(directUpdateExecutor, byteStore, directUpdateDataRelay, commandHandlerResolver);
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

    public abstract void dispose();

    public abstract void processProperties(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends DirectUpdateProcessor {
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

        public static native DirectUpdateProcessor create(DirectUpdateExecutor directUpdateExecutor, ByteStore byteStore, DirectUpdateDataRelay directUpdateDataRelay, CommandHandlerResolver commandHandlerResolver);

        public static native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native void native_processProperties(long j, DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateProcessor
        public void dispose() {
            native_dispose(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateProcessor
        public void processProperties(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties) {
            native_processProperties(this.nativeRef, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        }

        public /* synthetic */ CppProxy(long j, nta ntaVar) {
            this(j);
        }
    }
}
