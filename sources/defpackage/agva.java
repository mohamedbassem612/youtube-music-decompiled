package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agva {
    public static final Comparator a = new cru(14);
    public static final agva b = new agva(new aguy(Collections.EMPTY_LIST));
    public final aguy c;

    public agva(aguy aguyVar) {
        this.c = aguyVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof agva) && ((agva) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
