package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wgz extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_ULTRALOW_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_LOW_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_MED_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_HIGH_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_720P_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_1080P_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_2K_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_4K_HDR_CENC.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AV1_8K_HDR_CENC.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
