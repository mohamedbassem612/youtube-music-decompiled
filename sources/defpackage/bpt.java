package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bpt {
    public final Map b = new LinkedHashMap();

    public abstract Object a(bps bpsVar);

    public final boolean equals(Object obj) {
        return (obj instanceof bpt) && awrc.c(this.b, ((bpt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
