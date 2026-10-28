package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dam implements cwd {
    public final int a;
    public final ahbo b;

    public dam(int i, int[] iArr) {
        this.a = i;
        this.b = iArr != null ? ahbo.b(iArr) : ahbo.a;
    }

    public final String toString() {
        ahbo ahboVar = this.b;
        int i = ahboVar.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bwp.S(ahboVar.a(i2)));
        }
        return "UnsupportedBrands{major=" + bwp.S(this.a) + ", compatible=" + arrayList.toString() + '}';
    }
}
