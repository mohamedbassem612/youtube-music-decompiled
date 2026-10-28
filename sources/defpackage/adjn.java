package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjn implements eyv {
    private final eyv a;

    public adjn(eyv eyvVar) {
        this.a = eyvVar;
    }

    @Override // defpackage.eyv
    public final /* synthetic */ boolean a(Object obj) {
        return aawb.O((aqmh) obj);
    }

    @Override // defpackage.eyv
    public final /* bridge */ /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        Uri uriG = aawb.G((aqmh) obj, i, i2);
        if (uriG == null) {
            return null;
        }
        return this.a.b(uriG, i, i2, etyVar);
    }
}
