package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dug extends azw {
    public final List a;

    public dug() {
        super(null);
        this.a = new ArrayList(3);
    }

    private static final void z(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.azw
    public final void u(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((azw) it.next()).u(i);
            }
        } catch (ConcurrentModificationException e) {
            z(e);
        }
    }

    @Override // defpackage.azw
    public final void v(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((azw) it.next()).v(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            z(e);
        }
    }

    @Override // defpackage.azw
    public final void w(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((azw) it.next()).w(i);
            }
        } catch (ConcurrentModificationException e) {
            z(e);
        }
    }

    public final void y(azw azwVar) {
        this.a.add(azwVar);
    }
}
