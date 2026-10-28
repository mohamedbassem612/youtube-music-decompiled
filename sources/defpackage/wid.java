package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wid extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.RAW.ep));
        hashSet.add(Integer.valueOf(wgq.THREEGPP_MPEG4SP_AAC.ep));
        hashSet.add(Integer.valueOf(wgq.THREEGPP_MPEG4SP_AAC_HIGH.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
