package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fic extends fim {
    static final fic a = new fic();

    @Override // defpackage.fim
    public final void b(ComponentTree componentTree, Exception exc) {
        if (componentTree != null && componentTree.b() != null) {
            componentTree.b().c();
            if (exc instanceof fkp) {
                Exception exc2 = ((fkp) exc).a;
                exc = null;
            }
            if (exc instanceof fjn) {
                ArrayList arrayList = ((fjn) exc).b;
                if (!arrayList.isEmpty()) {
                }
            }
            gzj.br(2, exc.getMessage());
        }
        gzj.bx(exc);
    }
}
