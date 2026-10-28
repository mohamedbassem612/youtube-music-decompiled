package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zua implements Iterable {
    public final zsz[] a;
    public final zsz b;
    private final agke c;

    public zua(Set set) {
        agjz agjzVar = new agjz(4);
        Iterator it = set.iterator();
        zsz zszVar = null;
        while (it.hasNext()) {
            zsz zszVar2 = (zsz) it.next();
            if ((zszVar2.jc() & 2) != 0) {
                agjzVar.h(zszVar2);
                if (zszVar2.c().equals("must_log_events")) {
                    zszVar = zszVar2;
                }
            }
        }
        this.b = zszVar;
        agke agkeVarG = agjzVar.g();
        this.c = agkeVarG;
        int i = ((agpi) agkeVarG).d;
        this.a = new zsz[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            zsz zszVar3 = (zsz) agkeVarG.get(i2);
            this.a[i3] = zszVar3;
            zszVar3.i = i3;
            i2++;
            i3++;
        }
    }

    final zsz a(int i) {
        return this.a[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.c.listIterator(0);
    }
}
