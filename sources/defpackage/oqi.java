package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqi implements ht {
    final /* synthetic */ oqj a;

    public oqi(oqj oqjVar) {
        this.a = oqjVar;
    }

    @Override // defpackage.ht
    public final void a(int i, int i2) {
        int i3 = 0;
        while (true) {
            oqj oqjVar = this.a;
            if (i3 >= i2) {
                oqjVar.l(i, i2);
                return;
            }
            int i4 = i + i3;
            oqjVar.a.add(i4, new zj(oqjVar.k.b(i4)));
            i3++;
        }
    }

    @Override // defpackage.ht
    public final void b(int i, int i2) {
        oqj oqjVar = this.a;
        List list = oqjVar.a;
        list.add(i2, (zj) list.remove(i));
        oqjVar.jY(i, i2);
    }

    @Override // defpackage.ht
    public final void c(int i, int i2) {
        int i3 = 0;
        while (true) {
            oqj oqjVar = this.a;
            if (i3 >= i2) {
                oqjVar.m(i, i2);
                return;
            } else {
                oqjVar.G((zj) oqjVar.a.remove(i), true);
                i3++;
            }
        }
    }

    @Override // defpackage.ht
    public final void d(int i, int i2) {
        int i3 = 0;
        while (true) {
            oqj oqjVar = this.a;
            if (i3 >= i2) {
                oqjVar.jZ(i, i2, null);
                return;
            }
            int i4 = i + i3;
            zj zjVar = (zj) oqjVar.a.get(i4);
            zjVar.b = oqjVar.k.b(i4);
            oqjVar.H(zjVar);
            i3++;
        }
    }
}
