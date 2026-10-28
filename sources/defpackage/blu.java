package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class blu extends blj {
    public blu(Context context, awy awyVar) {
        super(new bls(context, awyVar));
    }

    public final void c(blt bltVar) {
        bls blsVar = this.f;
        synchronized (blsVar.a) {
            blsVar.d = bltVar;
        }
    }
}
