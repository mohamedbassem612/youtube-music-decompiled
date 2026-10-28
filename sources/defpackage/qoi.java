package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qoi extends qom {
    final /* synthetic */ String a = "com.google.android.gms";

    @Override // defpackage.qom
    protected final int a(Context context, tld tldVar, boolean z) {
        ProviderInfo providerInfo = (ProviderInfo) tldVar.a;
        if (context.getPackageName().equals(providerInfo.packageName)) {
            if (!z) {
                return 2;
            }
        } else {
            if (z) {
                return 2;
            }
            if (!this.a.equals(providerInfo.packageName)) {
                return 3;
            }
        }
        return 1;
    }
}
