package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agey implements Serializable, agex {
    private static final long serialVersionUID = 0;
    private final List a;

    public agey(List list) {
        this.a = list;
    }

    @Override // defpackage.agex
    public final boolean a(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((agex) list.get(i)).a(obj)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.agex
    public final boolean equals(Object obj) {
        if (obj instanceof agey) {
            return this.a.equals(((agey) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
