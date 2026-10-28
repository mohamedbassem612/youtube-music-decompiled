package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjr implements cjy {
    public cju a;
    public boolean b;
    public final /* synthetic */ cjs c;
    public final aae d;

    public cjr(cjs cjsVar, aae aaeVar) {
        this.c = cjsVar;
        this.d = aaeVar;
    }

    @Override // defpackage.cjy
    public final void a() {
        Handler handler = this.c.i;
        handler.getClass();
        bwp.aq(handler, new bkn(this, 16));
    }
}
