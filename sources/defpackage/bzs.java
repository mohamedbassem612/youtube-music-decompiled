package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bzs {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public bzy e;

    public bzs(int i, String str, bzy bzyVar) {
        this.a = i;
        this.b = str;
        this.e = bzyVar;
    }

    public final boolean a(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            czo czoVar = (czo) arrayList.get(i);
            long j3 = czoVar.a;
            if (j3 != -1) {
                if (j2 != -1) {
                    long j4 = czoVar.b;
                    if (j4 <= j && j + j2 <= j4 + j3) {
                        return true;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (j >= czoVar.b) {
                    return true;
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bzs bzsVar = (bzs) obj;
            if (this.a == bzsVar.a && this.b.equals(bzsVar.b) && this.c.equals(bzsVar.c) && this.e.equals(bzsVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }
}
