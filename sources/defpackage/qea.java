package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qea extends qdw {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.qdw
    public final void g(qci qciVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qdy) it.next()).g(qciVar);
        }
    }

    @Override // defpackage.qdw
    public final void j(qci qciVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qdy) it.next()).j(qciVar);
        }
    }
}
