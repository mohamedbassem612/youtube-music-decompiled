package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dol {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public dol(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dol) {
            dol dolVar = (dol) obj;
            if (awrc.c(this.a, dolVar.a) && awrc.c(this.b, dolVar.b) && awrc.c(this.c, dolVar.c) && awrc.c(this.d, dolVar.d)) {
                return awrc.c(this.e, dolVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return awrc.B(awrc.H("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + api.k(atqq.al(this.d)) + "\n            |   referenceColumnNames = {" + api.j(atqq.al(this.e)) + "\n            |}\n        "));
    }
}
