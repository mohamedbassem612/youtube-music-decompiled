package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyp implements eym {
    public final Map b;
    public volatile Map c;

    public eyp(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eyp) {
            return this.b.equals(((eyp) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.b) + '}';
    }
}
