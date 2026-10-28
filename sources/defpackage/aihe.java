package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aihe {
    public static ExtensionRegistryLite b(Class cls) {
        ClassLoader classLoader = aihe.class.getClassLoader();
        if (cls.equals(ExtensionRegistryLite.class)) {
            try {
                try {
                    return (ExtensionRegistryLite) cls.cast(((aihe) Class.forName("aify", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = Collections.singletonList(aikj.class.getDeclaredConstructor(null).newInstance(null)).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((ExtensionRegistryLite) cls.cast(((aihe) it.next()).a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(aigs.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (ExtensionRegistryLite) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    protected abstract ExtensionRegistryLite a();
}
