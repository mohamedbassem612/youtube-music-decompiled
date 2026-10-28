package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wgu extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(wir.p());
        hashSet.addAll(wir.k());
        hashSet.addAll(wir.g());
        hashSet.addAll(wir.r());
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
