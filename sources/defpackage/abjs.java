package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abjs implements abjh {
    public final Set a = new CopyOnWriteArraySet();
    private final int b;

    public abjs(int i) {
        this.b = i;
    }

    @Override // defpackage.abjh
    public final void a(int i, int i2, int i3) {
        if (this.b == i) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((tbj) it.next()).d(i2, i3);
            }
        }
    }

    @Override // defpackage.abjh
    public final void b(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        boolean z = i5 == i3;
        boolean z2 = i5 == i;
        if (!z2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (!z2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((tbj) it.next()).d(i4, 1);
            }
            return;
        }
        Set set = this.a;
        if (z) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((tbj) it2.next()).k(i2, i4);
            }
        } else {
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                ((tbj) it3.next()).jU(i2, 1);
            }
        }
    }

    @Override // defpackage.abjh
    public final void c(int i, int i2, int i3) {
        if (this.b == i) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((tbj) it.next()).jU(i2, i3);
            }
        }
    }
}
