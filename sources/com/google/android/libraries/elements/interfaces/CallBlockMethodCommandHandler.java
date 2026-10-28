package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.blocks.Container;
import defpackage.agp;
import defpackage.nrb;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class CallBlockMethodCommandHandler {
    private static final agp proxyMap = new agp(6);

    public static CallBlockMethodCommandHandler create(Container container) {
        return CppProxy.create(container);
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

    public abstract CommandHandler handler();

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends CallBlockMethodCommandHandler {
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

        public static native CallBlockMethodCommandHandler create(Container container);

        public static native void nativeDestroy(long j);

        private native CommandHandler native_handler(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.CallBlockMethodCommandHandler
        public CommandHandler handler() {
            return native_handler(this.nativeRef);
        }

        public /* synthetic */ CppProxy(long j, nrb nrbVar) {
            this(j);
        }
    }
}
