package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jtt extends jtv {
    public final long a;
    public final List b;
    public final List c;

    public jtt(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final jtt a(int i) {
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jtt jttVar = (jtt) list.get(i2);
            if (jttVar.d == i) {
                return jttVar;
            }
        }
        return null;
    }

    public final jtu b(int i) {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jtu jtuVar = (jtu) list.get(i2);
            if (jtuVar.d == i) {
                return jtuVar;
            }
        }
        return null;
    }

    @Override // defpackage.jtv
    public final String toString() {
        return rpi.H(this.d) + " leaves: " + Arrays.toString(this.b.toArray()) + " containers: " + Arrays.toString(this.c.toArray());
    }
}
