package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aggx extends aggt implements Set {
    final /* synthetic */ aggz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggx(aggz aggzVar, Object obj, Set set) {
        super(aggzVar, obj, set, null);
        this.f = aggzVar;
    }

    @Override // defpackage.aggt, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAm = ahng.am((Set) this.b, collection);
        if (zAm) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zAm;
    }
}
