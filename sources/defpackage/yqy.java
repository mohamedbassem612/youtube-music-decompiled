package defpackage;

import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yqy implements yfb, tdz {
    public final LruCache a = new yqx();
    private final zjr b;

    public yqy(zjr zjrVar, tqj tqjVar, awmd awmdVar) {
        this.b = zjrVar;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074092410, 1)) {
                ((tes) awmdVar.io()).b(this, tew.b, tew.c, tew.d, tew.e);
            }
        }
    }

    @Override // defpackage.yfb
    public final boolean b(String str, String str2) {
        yqi yqiVarD = d(str);
        if (yqiVarD == null) {
            return false;
        }
        return yqiVarD.c();
    }

    public final yqi d(String str) {
        yqt yqtVarE = e(str);
        if (yqtVarE instanceof yqi) {
            return (yqi) yqtVarE;
        }
        return null;
    }

    public final yqt e(String str) {
        yqt yqtVar = (yqt) this.a.get(str);
        if (yqtVar == null || !yqtVar.i()) {
            return null;
        }
        return yqtVar;
    }

    public final void f(String str) {
        this.a.remove(str);
    }

    public final void g(String str, yqt yqtVar) {
        int i = this.b.Y().o;
        if (i > 0) {
            this.a.resize(i);
        }
        this.a.put(str, yqtVar);
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        this.a.evictAll();
    }
}
