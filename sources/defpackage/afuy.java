package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afuy {
    public static final aguu e = new aguu(null);
    private final afuy a;
    public final aha c;
    public boolean d = false;

    public afuy(afuy afuyVar, aha ahaVar) {
        if (afuyVar != null && !afuyVar.d) {
            throw new IllegalArgumentException();
        }
        this.a = afuyVar;
        this.c = ahaVar;
    }

    public static afuw b() {
        return afux.a.c();
    }

    public static afuy d(Set set) {
        if (set.isEmpty()) {
            return afux.a;
        }
        if (set.size() == 1) {
            return (afuy) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            afuy afuyVar = (afuy) it.next();
            do {
                i += afuyVar.c.d;
                afuyVar = afuyVar.a;
            } while (afuyVar != null);
        }
        if (i == 0) {
            return afux.a;
        }
        aha ahaVar = new aha(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            afuy afuyVar2 = (afuy) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    aha ahaVar2 = afuyVar2.c;
                    if (i2 >= ahaVar2.d) {
                        break;
                    }
                    ahno.K(ahaVar.put((aguu) ahaVar2.d(i2), ahaVar2.g(i2)) == null, "Duplicate bindings: %s", ahaVar2.d(i2));
                    i2++;
                }
                afuyVar2 = afuyVar2.a;
            } while (afuyVar2 != null);
        }
        return new afux(null, ahaVar).f();
    }

    public static afuy e(afuy afuyVar, afuy afuyVar2) {
        if (afuyVar.g()) {
            return afuyVar2;
        }
        return !afuyVar2.g() ? d(agkz.q(afuyVar, afuyVar2)) : afuyVar;
    }

    public static afuv j(aguu aguuVar, afuy afuyVar) {
        Object objH = afuyVar.h(aguuVar);
        if (objH == null) {
            return afuv.d(true != afuyVar.c.containsKey(e) ? 3 : 2);
        }
        return new afuv(1, objH, false);
    }

    public final afuw c() {
        return new afux(this, new aha(0));
    }

    public final afuy f() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        afuy afuyVar = this.a;
        return (afuyVar == null || !this.c.isEmpty()) ? this : afuyVar;
    }

    public final boolean g() {
        return this == afux.a;
    }

    final Object h(aguu aguuVar) {
        afuy afuyVar;
        ahno.O(this.d);
        Object obj = this.c.get(aguuVar);
        return (obj != null || (afuyVar = this.a) == null) ? obj : afuyVar.h(aguuVar);
    }

    final boolean i(aguu aguuVar) {
        if (this.c.containsKey(aguuVar)) {
            return true;
        }
        afuy afuyVar = this.a;
        return afuyVar != null && afuyVar.i(aguuVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (afuy afuyVar = this; afuyVar != null; afuyVar = afuyVar.a) {
            for (int i = 0; i < afuyVar.c.d; i++) {
                sb.append('[');
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append('>');
        return sb.toString();
    }
}
