package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xkc implements tbu {
    final /* synthetic */ xkd a;
    private final xjv b;

    public xkc(xkd xkdVar, xjv xjvVar) {
        this.a = xkdVar;
        this.b = xjvVar;
    }

    @Override // defpackage.tbu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tas tasVarA = this.b.a((tas) obj);
        if (tasVarA != null) {
            xkd xkdVar = this.a;
            List list = xkdVar.a;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((xjm) it.next()).c(tasVarA);
                }
            }
            List list2 = xkdVar.b;
            if (list2.isEmpty()) {
                return;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((xjm) it2.next()).c(tasVarA);
            }
        }
    }

    @Override // defpackage.tbu
    public final boolean b() {
        return true;
    }
}
