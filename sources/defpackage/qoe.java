package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qoe {
    public final String a;
    private final List b;

    public qoe(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String[] a() {
        return (String[]) this.b.toArray(new String[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qoe) {
            qoe qoeVar = (qoe) obj;
            if (this.a.equals(qoeVar.a) && this.b.equals(qoeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SafeSql{query=" + this.a + ", queryArgs=" + this.b.toString() + '}';
    }

    public qoe() {
        throw null;
    }
}
