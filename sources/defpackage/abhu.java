package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abhu {
    public final abhs a;
    public final abht[] b;

    public abhu(abhs abhsVar, List list) {
        this.a = abhsVar;
        this.b = new abht[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.b[i] = (abht) list.get(i);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abhu)) {
            return false;
        }
        abhu abhuVar = (abhu) obj;
        return this.a == abhuVar.a && Arrays.equals(this.b, abhuVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Arrays.hashCode(this.b);
    }
}
