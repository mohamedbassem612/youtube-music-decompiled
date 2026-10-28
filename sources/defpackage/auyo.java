package defpackage;

import j$.util.Objects;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auyo {
    public static final auyo a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new auyo(identityHashMap);
    }

    public auyo(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(auyn auynVar) {
        return this.b.get(auynVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdentityHashMap identityHashMap = this.b;
            IdentityHashMap identityHashMap2 = ((auyo) obj).b;
            if (identityHashMap.size() == identityHashMap2.size()) {
                for (Map.Entry entry : identityHashMap.entrySet()) {
                    if (!identityHashMap2.containsKey(entry.getKey()) || !Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHash = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            iHash += Objects.hash(entry.getKey(), entry.getValue());
        }
        return iHash;
    }

    public final String toString() {
        return this.b.toString();
    }
}
