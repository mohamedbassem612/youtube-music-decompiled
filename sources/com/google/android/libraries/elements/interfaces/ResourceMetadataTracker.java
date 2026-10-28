package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nwb;
import java.lang.ref.WeakReference;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceMetadataTracker {
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

    public abstract void addMetadata(ResourceMetadata resourceMetadata);

    public abstract StatusOr getResourceMetadata(String str);

    public abstract TreeSet getTransitiveDeps(TreeSet treeSet);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ResourceMetadataTracker {
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

        private native void native_addMetadata(long j, ResourceMetadata resourceMetadata);

        private native StatusOr native_getResourceMetadata(long j, String str);

        private native TreeSet native_getTransitiveDeps(long j, TreeSet treeSet);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public void addMetadata(ResourceMetadata resourceMetadata) {
            native_addMetadata(this.nativeRef, resourceMetadata);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public StatusOr getResourceMetadata(String str) {
            return native_getResourceMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public TreeSet getTransitiveDeps(TreeSet treeSet) {
            return native_getTransitiveDeps(this.nativeRef, treeSet);
        }

        public /* synthetic */ CppProxy(long j, nwb nwbVar) {
            this(j);
        }
    }
}
