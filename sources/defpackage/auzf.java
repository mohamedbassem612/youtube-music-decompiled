package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class auzf {
    static final auzg a;

    static {
        auzg avckVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            avckVar = (auzg) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(auzg.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            avckVar = new avck();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = avckVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            auzh.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
