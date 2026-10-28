package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ekl implements ekk {
    public final List a;

    public ekl(List list) {
        this.a = list;
    }

    @Override // defpackage.ekk
    public final List b() {
        return this.a;
    }

    @Override // defpackage.ekk
    public final boolean c() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((enn) list.get(0)).f();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
