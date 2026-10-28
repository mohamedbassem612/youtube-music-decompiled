package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhc {
    public final int a;
    private final Map b;
    private final boolean c;

    public xhc(boolean z, Map map, int i, String str) {
        this.c = z;
        this.b = map;
        this.a = i;
        if (!z || map.containsKey(Integer.valueOf(i))) {
            return;
        }
        throw new IllegalArgumentException("Invalid VeType: " + i + ". Please use a valid veType defined in class " + str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && (obj instanceof xhc) && this.a == ((xhc) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.c ? (String) this.b.get(Integer.valueOf(this.a)) : String.valueOf(this.a);
    }
}
