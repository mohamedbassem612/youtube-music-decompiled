package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aehc extends aedi {
    final /* synthetic */ aehd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehc(aehd aehdVar) {
        super(null);
        this.a = aehdVar;
    }

    @Override // defpackage.aedi
    public final void J(aami aamiVar, Uri uri) {
        String strC;
        aehi aehiVar;
        String string = uri.toString();
        aehd aehdVar = this.a;
        if (!aeho.f(string, aehdVar.r) || (strC = aamiVar.c()) == null || (aehiVar = aehdVar.s) == null) {
            return;
        }
        aehiVar.g(strC);
    }
}
