package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class whz extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) wir.c.io());
        hashSet.addAll((Set) wir.d.io());
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
