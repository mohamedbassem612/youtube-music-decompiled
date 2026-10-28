package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import defpackage.agp;
import defpackage.nxi;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransactionCallback {
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

    public abstract void accept(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionRecord transactionRecord);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends TransactionCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;
        private final AtomicBoolean registeredWithNativeObjectManager;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            this.registeredWithNativeObjectManager = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native void nativeDestroy(long j);

        private native void native_accept(long j, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionRecord transactionRecord);

        public void _djinni_private_destroy() {
            if (this.registeredWithNativeObjectManager.get() || this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionCallback
        public void accept(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionRecord transactionRecord) {
            native_accept(this.nativeRef, transactionContextOuterClass$TransactionContext, transactionRecord);
        }

        protected void finalize() throws Throwable {
            if (this.registeredWithNativeObjectManager.get()) {
                return;
            }
            _djinni_private_destroy();
            super.finalize();
        }

        public /* synthetic */ CppProxy(long j, nxi nxiVar) {
            this(j);
        }
    }
}
