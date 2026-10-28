package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wii extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(wir.C());
        hashSet.addAll(wir.s());
        hashSet.addAll(wir.d());
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
