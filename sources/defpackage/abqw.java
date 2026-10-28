package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqw extends LruCache implements tdz {
    private final tqj a;
    private final awmd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abqw(tqj tqjVar, awmd awmdVar) {
        super(16);
        awmdVar.getClass();
        this.a = tqjVar;
        this.b = awmdVar;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074092410, 16)) {
                ((tes) awmdVar.io()).b(this, tew.d, tew.e);
            }
        }
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        trimToSize(2);
    }
}
