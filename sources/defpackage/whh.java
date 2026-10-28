package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class whh extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) wir.b.io());
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(wir.j());
        hashSet2.addAll(wir.k());
        hashSet2.addAll(wir.s());
        hashSet2.addAll(wir.r());
        hashSet2.addAll(wir.i());
        hashSet2.addAll(wir.h());
        hashSet.addAll(DesugarCollections.unmodifiableSet(hashSet2));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
