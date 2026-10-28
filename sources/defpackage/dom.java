package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dom {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public dom(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dom) {
            dom domVar = (dom) obj;
            if (this.b == domVar.b && awrc.c(this.c, domVar.c) && awrc.c(this.d, domVar.d)) {
                String str = this.a;
                return str.startsWith("index_") ? domVar.a.startsWith("index_") : awrc.c(str, domVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return awrc.B(awrc.H("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + api.k(this.c) + "\n            |   orders = {" + api.j(this.d) + "\n            |}\n        "));
    }
}
