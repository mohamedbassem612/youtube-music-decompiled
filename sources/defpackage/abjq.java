package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abjq implements abjh {
    public final Set a = new CopyOnWriteArraySet();
    final /* synthetic */ abjr b;

    public abjq(abjr abjrVar) {
        this.b = abjrVar;
    }

    @Override // defpackage.abjh
    public final void a(int i, int i2, int i3) {
        abjr abjrVar = this.b;
        synchronized (abjrVar) {
            int iA = abjrVar.a(i, i2);
            abjrVar.d();
            d(iA, i3);
        }
    }

    @Override // defpackage.abjh
    public final void b(int i, int i2, int i3, int i4) {
        abjr abjrVar = this.b;
        synchronized (abjrVar) {
            int iA = abjrVar.a(i, i2);
            int iA2 = abjrVar.a(i3, i4);
            abjrVar.d();
            if (iA != iA2) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((tbj) it.next()).k(iA, iA2);
                }
            }
        }
    }

    @Override // defpackage.abjh
    public final void c(int i, int i2, int i3) {
        abjr abjrVar = this.b;
        synchronized (abjrVar) {
            int iA = abjrVar.a(i, i2);
            abjrVar.d();
            e(iA, i3);
        }
    }

    final void d(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).d(i, i2);
        }
    }

    final void e(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).jU(i, i2);
        }
    }
}
