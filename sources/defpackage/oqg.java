package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqg implements ht {
    final /* synthetic */ oon a;
    final /* synthetic */ hp b;
    final /* synthetic */ oqj c;

    public oqg(oqj oqjVar, oon oonVar, hp hpVar) {
        this.a = oonVar;
        this.b = hpVar;
        this.c = oqjVar;
    }

    @Override // defpackage.ht
    public final void a(int i, int i2) {
        int i3 = 0;
        while (true) {
            oqj oqjVar = this.c;
            if (i3 >= i2) {
                oqjVar.l(i, i2);
                return;
            }
            int i4 = i + i3;
            List list = oqjVar.a;
            if (i4 <= list.size()) {
                list.add(i4, new zj(this.a.b(i4)));
            }
            i3++;
        }
    }

    @Override // defpackage.ht
    public final void b(int i, int i2) {
        oqj oqjVar = this.c;
        List list = oqjVar.a;
        if (i < list.size() && i2 < list.size()) {
            list.add(i2, (zj) list.remove(i));
        } else if (i < list.size()) {
            oqjVar.G((zj) list.remove(i), true);
        } else if (i2 < list.size()) {
            list.add(i2, new zj(this.a.b(i2)));
        }
        oqjVar.jY(i, i2);
    }

    @Override // defpackage.ht
    public final void c(int i, int i2) {
        int i3 = 0;
        while (true) {
            oqj oqjVar = this.c;
            if (i3 >= i2) {
                oqjVar.m(i, i2);
                return;
            }
            List list = oqjVar.a;
            if (i < list.size()) {
                oqjVar.G((zj) list.remove(i), true);
            }
            i3++;
        }
    }

    @Override // defpackage.ht
    public final void d(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            hp hpVar = this.b;
            if (i4 < 0 || i4 >= hpVar.b) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i4 + ", old list size = " + hpVar.b);
            }
            int i5 = hpVar.a[i4];
            int i6 = (i5 & 15) == 0 ? -1 : i5 >> 4;
            if (i6 != -1) {
                oqj oqjVar = this.c;
                List list = oqjVar.a;
                if (i4 < list.size()) {
                    zj zjVar = (zj) list.get(i4);
                    zjVar.b = this.a.b(i6);
                    oqjVar.H(zjVar);
                }
            }
        }
        this.c.jZ(i, i2, new Object());
    }
}
