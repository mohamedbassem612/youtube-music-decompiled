package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agrh extends agrx {
    public agrh(Class cls) {
        super("group_by", cls, true, true);
    }

    @Override // defpackage.agrx
    public final void a(Iterator it, agrw agrwVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                agrwVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            agrwVar.a(str, sb.toString());
        }
    }
}
