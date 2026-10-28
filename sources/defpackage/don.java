package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class don {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public don(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public static final don a(dpt dptVar, String str) {
        return new don(str, ape.h(dptVar, str), ape.i(dptVar, str), ape.j(dptVar, str));
    }

    public final boolean equals(Object obj) {
        return api.n(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return api.l(this);
    }
}
