package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class why extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_OPUS_ULTRALOW_LQ.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_OPUS_LOW.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_OPUS_MED.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_OPUS_HIGH.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_OPUS_ULTRAHIGH.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
