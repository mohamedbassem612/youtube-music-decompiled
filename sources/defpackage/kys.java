package defpackage;

import android.util.LongSparseArray;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kys {
    public long a;
    public final Object b;

    public kys(byte[] bArr) {
        this.b = new TreeSet(new awv(2));
    }

    public final void a(bzk bzkVar, long j) {
        while (this.a + j > 52428800) {
            TreeSet treeSet = (TreeSet) this.b;
            if (treeSet.isEmpty()) {
                return;
            } else {
                bzkVar.f((bzr) treeSet.first());
            }
        }
    }

    public final void b(bzk bzkVar, bzr bzrVar) {
        ((TreeSet) this.b).add(bzrVar);
        this.a += bzrVar.c;
        a(bzkVar, 0L);
    }

    public final void c(bzk bzkVar, bzr bzrVar, bzr bzrVar2) {
        d(bzrVar);
        b(bzkVar, bzrVar2);
    }

    public final void d(bzr bzrVar) {
        ((TreeSet) this.b).remove(bzrVar);
        this.a -= bzrVar.c;
    }

    public kys() {
        this.a = 0L;
        this.b = new LongSparseArray(2000);
    }
}
