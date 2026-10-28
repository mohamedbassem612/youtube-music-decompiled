package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class whu extends twv {
    @Override // defpackage.twv
    public final /* bridge */ /* synthetic */ Object b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(wgq.DASH_FMP4_AAC_HIGH.ep));
        hashSet.add(Integer.valueOf(wgq.DASH_WEBM_OPUS_ULTRAHIGH.ep));
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
