package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class whl extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AAC_51_LOW.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AAC_51_HIGH.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
