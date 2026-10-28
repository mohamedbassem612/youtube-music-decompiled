package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class txn extends tyn {
    @Override // defpackage.tyn
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add("video/3gpp");
        hashSet.add("video/mp4");
        hashSet.add("video/webm");
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
