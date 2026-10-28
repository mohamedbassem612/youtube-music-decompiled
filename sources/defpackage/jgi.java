package defpackage;

import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgi extends jbi {
    @Override // defpackage.jbi, defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        super.d(adlyVar, (apnx) obj);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apnx) obj).f.G();
    }

    @Override // defpackage.jbi
    public final /* bridge */ /* synthetic */ Spanned f(Object obj) {
        alay alayVar;
        apnx apnxVar = (apnx) obj;
        if ((apnxVar.b & 1) != 0) {
            alayVar = apnxVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    @Override // defpackage.jbi
    protected final /* synthetic */ alja g(Object obj) {
        alja aljaVar = ((apnx) obj).e;
        return aljaVar == null ? alja.a : aljaVar;
    }
}
