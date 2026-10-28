package defpackage;

import android.content.pm.ProviderInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afld extends afky {
    public afld(ProviderInfo providerInfo, Throwable th) {
        super("Provider exists, but could not be obtained: ".concat(providerInfo.toString()), th);
    }
}
