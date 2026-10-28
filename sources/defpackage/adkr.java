package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adkr implements adlz {
    public final List a = new ArrayList();

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adlz) it.next()).a(adlyVar, adkzVar, i);
        }
    }

    public final void b(adlz adlzVar) {
        adlzVar.getClass();
        this.a.add(adlzVar);
    }
}
