package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgp extends kgy {
    public final kht a;
    public qcb b;

    public kgp() {
        super("urn:x-cast:com.google.cast.customdata", "CustomDataChannel");
        kht khtVar = new kht(10000L, "getCustomData");
        this.a = khtVar;
        f(khtVar);
        g();
    }

    private final void g() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((kht) it.next()).d(2002);
        }
    }

    @Override // defpackage.kgy
    public final void a() {
        e();
        g();
    }
}
