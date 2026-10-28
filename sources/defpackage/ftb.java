package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ftb implements ht {
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final elr g;
    public final elr h;

    public ftb(List list, List list2, elr elrVar, elr elrVar2) {
        this.b = list;
        this.a = list != null ? list.size() : 0;
        this.c = list2;
        this.h = elrVar;
        this.g = elrVar2;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        for (int i = 0; i < this.a; i++) {
            this.e.add(new fsz((ftg) null, false));
            this.f.add(new fif(this.b.get(i), null));
        }
    }

    public static void e(Object obj) {
        if (obj != null) {
            if (obj instanceof fql) {
                ((fql) obj).a();
            } else {
                obj.getClass().getSimpleName();
            }
        }
    }

    @Override // defpackage.ht
    public final void a(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            fsz fszVar = new fsz((ftg) null, true);
            this.e.add(i4, fszVar);
            arrayList.add(fszVar);
            fif fifVar = new fif(null, null);
            this.f.add(i4, fifVar);
            arrayList2.add(fifVar);
        }
        this.d.add(new fta(0, i, -1, arrayList, arrayList2));
    }

    @Override // defpackage.ht
    public final void b(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        List list = this.e;
        list.add(i2, (fsz) list.remove(i));
        List list2 = this.f;
        fif fifVar = (fif) list2.remove(i);
        arrayList.add(fifVar);
        list2.add(i2, fifVar);
        this.d.add(new fta(3, i, i2, null, arrayList));
    }

    @Override // defpackage.ht
    public final void c(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.e.remove(i);
            arrayList.add((fif) this.f.remove(i));
        }
        this.d.add(new fta(2, i, i2, null, arrayList));
    }

    @Override // defpackage.ht
    public final void d(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            fsz fszVar = (fsz) this.e.get(i4);
            fszVar.a = true;
            arrayList.add(fszVar);
            arrayList2.add((fif) this.f.get(i4));
        }
        this.d.add(new fta(1, i, -1, arrayList, arrayList2));
    }
}
