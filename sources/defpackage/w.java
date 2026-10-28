package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class w implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    public final void a(v vVar) {
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = vVar.a;
            if (str.equals(((v) it.next()).a)) {
                throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(str)));
            }
        }
        list.add(vVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (v vVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(vVar);
        }
        return sb.toString();
    }
}
