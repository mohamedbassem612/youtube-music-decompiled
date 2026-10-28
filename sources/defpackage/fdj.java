package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fdj implements fcr {
    final /* synthetic */ fdl a;

    public fdj(fdl fdlVar) {
        this.a = fdlVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.fcr
    public final void a(boolean z) {
        ArrayList arrayList;
        ffs.g();
        fdl fdlVar = this.a;
        synchronized (fdlVar) {
            arrayList = new ArrayList((Collection) fdlVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fcr) arrayList.get(i)).a(z);
        }
    }
}
