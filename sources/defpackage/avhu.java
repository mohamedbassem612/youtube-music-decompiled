package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhu implements avbj {
    private final List a;
    private final avbi b;

    public avhu(List list, avbi avbiVar) {
        this.a = agke.n(list);
        this.b = avbiVar;
    }

    @Override // defpackage.avbj
    public final void a(avby avbyVar, List list, List list2) {
        List list3 = avbyVar.c;
        int size = list3.size();
        int i = ((agpi) list).d;
        ahno.I(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        List list4 = avbyVar.d;
        int size2 = list4.size();
        int i2 = ((agpi) list2).d;
        ahno.I(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (avbk avbkVar : this.a) {
            if (avbkVar.a() <= avbyVar.a) {
                this.b.c();
                avbkVar.d();
            }
            avbkVar.b();
        }
    }

    @Override // defpackage.avbj
    public final void b(avby avbyVar, List list, List list2) {
        List list3 = avbyVar.c;
        int size = list3.size();
        int i = ((agpi) list).d;
        ahno.I(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        List list4 = avbyVar.d;
        int size2 = list4.size();
        int i2 = ((agpi) list2).d;
        ahno.I(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (avbk avbkVar : this.a) {
            if (avbkVar.a() <= avbyVar.a) {
                this.b.c();
                avbkVar.d();
            }
            avbkVar.c();
        }
    }
}
