package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abpk extends LruCache implements tdz {
    public abpk(abmt abmtVar, tqj tqjVar, awmd awmdVar) {
        super(abmtVar.g.l(154, 45658566L, false) ? (int) abmtVar.g.c(24, 45657137L, 16L) : 16);
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074092410, 2)) {
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
        trimToSize(8);
    }
}
