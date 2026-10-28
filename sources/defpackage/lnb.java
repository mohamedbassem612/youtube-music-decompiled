package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lnb extends kqs {
    public lnb(Context context, Looper looper, int i, kqd kqdVar, kof kofVar, kpb kpbVar, lob lobVar) {
        super(context, looper, i, kqdVar, kofVar, kpbVar);
        if (lobVar != null) {
            throw null;
        }
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    @Override // defpackage.kpz
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("ComponentName", null);
        return bundle;
    }
}
