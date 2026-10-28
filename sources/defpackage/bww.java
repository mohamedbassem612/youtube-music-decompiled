package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bww extends bwy {
    public final long a;
    public final List b;
    public final List c;

    public bww(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final bww a(int i) {
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bww bwwVar = (bww) list.get(i2);
            if (bwwVar.d == i) {
                return bwwVar;
            }
        }
        return null;
    }

    public final bwx b(int i) {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bwx bwxVar = (bwx) list.get(i2);
            if (bwxVar.d == i) {
                return bwxVar;
            }
        }
        return null;
    }

    public final void c(bww bwwVar) {
        this.c.add(bwwVar);
    }

    public final void d(bwx bwxVar) {
        this.b.add(bwxVar);
    }

    @Override // defpackage.bwy
    public final String toString() {
        return rpi.H(this.d) + " leaves: " + Arrays.toString(this.b.toArray()) + " containers: " + Arrays.toString(this.c.toArray());
    }
}
