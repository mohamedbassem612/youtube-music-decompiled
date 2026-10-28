package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wib extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(wir.A());
        hashSet.addAll(wir.w());
        hashSet.addAll(wir.a());
        hashSet.addAll(wir.q());
        hashSet.addAll(wir.E());
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
