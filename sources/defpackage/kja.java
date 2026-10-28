package defpackage;

import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kja {
    public static final kja a = new kja(ahng.ac(EnumSet.allOf(kjb.class)));
    public static final kja b = new kja(agpr.a);
    public static final kja c = new kja(ahng.ad(kjb.ZWIEBACK, new kjb[0]));
    public final agkz d;

    public kja(agkz agkzVar) {
        this.d = agkzVar;
    }

    public final boolean a(kjb kjbVar) {
        return this.d.contains(kjbVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kja) && this.d.equals(((kja) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
