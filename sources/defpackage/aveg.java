package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aveg {
    private ArrayList a = new ArrayList();
    private volatile auzd b = auzd.d;

    final void a(auzd auzdVar) {
        if (this.b == auzdVar || this.b == auzd.e) {
            return;
        }
        this.b = auzdVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() > 0) {
            throw null;
        }
    }
}
