package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class len implements lfz {
    final /* synthetic */ ler a;

    public len(ler lerVar) {
        this.a = lerVar;
    }

    @Override // defpackage.lfz
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ler lerVar = this.a;
        if (zIsEmpty) {
            lerVar.E("auto", "_err", bundle);
        } else {
            lerVar.ag("_err", bundle, str);
        }
    }
}
