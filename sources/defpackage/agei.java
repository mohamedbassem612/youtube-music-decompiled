package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agei implements agef {
    private final /* synthetic */ int $cid;

    public agei(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agef
    public final Class a() {
        if (this.$cid == 0) {
            if (agej.b()) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                agej.a.logp(Level.INFO, "com.google.common.base.FinalizableReferenceQueue$SystemLoader", "loadFinalizer", "Not allowed to access system class loader.");
                return null;
            }
        }
        if (agej.b()) {
            return null;
        }
        try {
            URL resource = getClass().getClassLoader().getResource("com/google/common/base/internal/Finalizer.class");
            if (resource == null) {
                throw new FileNotFoundException("com/google/common/base/internal/Finalizer.class");
            }
            String string = resource.toString();
            if (string.endsWith("com/google/common/base/internal/Finalizer.class")) {
                return new URLClassLoader(new URL[]{new URL(resource, string.substring(0, string.length() - 47))}, null).loadClass("com.google.common.base.internal.Finalizer");
            }
            throw new IOException("Unsupported path style: ".concat(String.valueOf(string)));
        } catch (Exception e) {
            agej.a.logp(Level.WARNING, "com.google.common.base.FinalizableReferenceQueue$DecoupledLoader", "loadFinalizer", "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e);
            return null;
        }
    }
}
