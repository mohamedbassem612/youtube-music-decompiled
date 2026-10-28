package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tn {
    public final Set a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final boolean h;
    public final int i;
    private final Set j;

    public tn(Set set, Set set2, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, boolean z) {
        this.j = set;
        azs.l(set2);
        this.a = set2;
        azs.l(map);
        this.b = map;
        azs.l(map2);
        this.c = map2;
        azs.l(map3);
        this.d = map3;
        azs.l(map4);
        this.e = map4;
        azs.l(map5);
        this.f = map5;
        azs.l(map6);
        this.g = map6;
        this.h = z;
        this.i = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static afv a(Map map) {
        afv afvVar = new afv(((aha) map).d);
        for (Map.Entry entry : map.entrySet()) {
            afx afxVar = new afx(0);
            Iterator it = ((Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                afxVar.add(new afx((Set) it.next()));
            }
            afvVar.put((String) entry.getKey(), afxVar);
        }
        return afvVar;
    }

    public final Set b() {
        return DesugarCollections.unmodifiableSet(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tn) {
            tn tnVar = (tn) obj;
            if (this.j.equals(tnVar.j) && this.a.equals(tnVar.a) && this.b.equals(tnVar.b) && this.c.equals(tnVar.c) && this.d.equals(tnVar.d) && this.e.equals(tnVar.e) && this.g.equals(tnVar.g) && this.h == tnVar.h) {
                int i = tnVar.i;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.j, this.a, this.b, this.c, this.d, this.e, this.g, Boolean.valueOf(this.h), 1);
    }
}
