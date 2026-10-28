package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ckt extends caq {
    public Bitmap a;
    final /* synthetic */ ckp b;

    public ckt(ckp ckpVar) {
        this.b = ckpVar;
    }

    @Override // defpackage.caq, defpackage.cai
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // defpackage.caq
    public final void release() {
        this.b.h(this);
    }

    public ckt() {
        throw null;
    }
}
