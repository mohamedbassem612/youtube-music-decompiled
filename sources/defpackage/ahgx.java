package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgx {
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final ConcurrentMap d = new ConcurrentHashMap();
    private static final Logger b = Logger.getLogger(ahgx.class.getName());
    public static final ahgx a = new ahgx();

    private final synchronized twp d(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.c;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException(a.bT(str, "No key manager found for key type ", ", see https://developers.google.com/tink/faq/registration_errors"));
        }
        return (twp) concurrentMap.get(str);
    }

    private final synchronized void e(twp twpVar, boolean z) {
        Object obj = twpVar.c;
        if (z) {
            ConcurrentMap concurrentMap = this.d;
            if (concurrentMap.containsKey(obj) && !((Boolean) concurrentMap.get(obj)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat((String) obj));
            }
        }
        ConcurrentMap concurrentMap2 = this.c;
        twp twpVar2 = (twp) concurrentMap2.get(obj);
        if (twpVar2 != null && !twpVar2.getClass().equals(twpVar.getClass())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat((String) obj));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", obj, twpVar2.getClass().getName(), twpVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(obj, twpVar);
        this.d.put(obj, Boolean.valueOf(z));
    }

    public final twp a(String str, Class cls) throws GeneralSecurityException {
        twp twpVarD = d(str);
        Object obj = twpVarD.b;
        if (obj.equals(cls)) {
            return twpVarD;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(twpVarD.getClass()) + ", which only supports: " + obj.toString());
    }

    public final synchronized void b(twp twpVar, boolean z) {
        c(twpVar, 1, z);
    }

    public final synchronized void c(twp twpVar, int i, boolean z) {
        if (!afyd.q(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(twpVar, z);
    }
}
