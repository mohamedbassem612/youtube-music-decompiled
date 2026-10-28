package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lft implements lfz {
    public final /* synthetic */ lfv a;

    public lft(lfv lfvVar) {
        this.a = lfvVar;
    }

    @Override // defpackage.lfz
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        lfv lfvVar = this.a;
        if (!zIsEmpty) {
            lfvVar.aU().j(new aew(this, str, str2, bundle, 18));
            return;
        }
        ldr ldrVar = lfvVar.j;
        if (ldrVar != null) {
            ldrVar.aT().c.b("AppId not known when logging event", str2);
        }
    }
}
