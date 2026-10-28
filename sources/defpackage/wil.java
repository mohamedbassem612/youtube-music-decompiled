package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wil extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_ULTRALOW.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_LOW.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_MED.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_HIGH.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_720P.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_1080P.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_2K.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_VP9_HDR_4K.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
