package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfz {
    public static final tfz a = new tfz(Collections.EMPTY_LIST);
    public final Collection b;

    public tfz(Collection collection) {
        this.b = collection;
    }

    public final String a(String str) {
        for (Map.Entry entry : this.b) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public final Map b() {
        Collection<Map.Entry> collection = this.b;
        tfy tfyVar = new tfy(collection.size());
        for (Map.Entry entry : collection) {
            tfyVar.put((String) entry.getKey(), (String) entry.getValue());
        }
        return DesugarCollections.unmodifiableMap(tfyVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tfz) {
            return this.b.equals(((tfz) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
