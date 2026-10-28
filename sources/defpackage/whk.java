package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class whk extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_HE_AAC_LOW_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AAC_MED_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AAC_HIGH_CENC.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
