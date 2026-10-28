package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rv {
    public final Map a;
    public final Map b;

    public rv(Map map, Map map2, Map map3) {
        azs.l(map);
        this.a = map;
        azs.l(map2);
        this.b = map2;
        azs.l(map3);
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final String toString() {
        return "{\n  successes: " + this.a + "\n  failures: " + this.b + "\n}";
    }
}
