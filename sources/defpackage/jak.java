package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jak extends admu {
    public tbk b;
    public Object d;
    private final tbj g = new jai(this);
    public int c = -1;
    public final List a = new ArrayList();

    public final void b(jaj jajVar) {
        this.a.add(jajVar);
    }

    @Override // defpackage.admu, defpackage.tbm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.tbk
    public final void clear() {
        super.clear();
        tbk tbkVar = this.b;
        if (tbkVar != null) {
            tbkVar.n(this.g);
            this.b = null;
        }
    }

    public final void g(Object obj) {
        int iIndexOf;
        if (obj == null || (iIndexOf = indexOf(obj)) == -1) {
            return;
        }
        this.d = remove(iIndexOf);
        this.c = iIndexOf;
        for (jaj jajVar : this.a) {
            if (this.d != null) {
                jajVar.a();
            }
        }
    }

    @Override // defpackage.admu, defpackage.adkz
    public final /* bridge */ /* synthetic */ void h(adky adkyVar) {
        super.hK(adkyVar);
    }

    public final void i(tbk tbkVar) {
        this.b = tbkVar;
        if (tbkVar != null) {
            tbkVar.hK(this.g);
            Iterator it = tbkVar.subList(0, tbkVar.size()).iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }
}
