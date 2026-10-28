package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class whc extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(wir.n());
        hashSet.addAll(wir.p());
        hashSet.addAll(wir.o());
        hashSet.addAll(wir.g());
        hashSet.addAll(wir.m());
        hashSet.addAll(wir.l());
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
