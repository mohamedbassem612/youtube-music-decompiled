package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpq implements syk {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/services/config/ConfigFetcherTaskRunner");
    private final awmd b;

    public wpq(awmd awmdVar) {
        this.b = awmdVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        try {
            ((wps) this.b.io()).a();
            return 0;
        } catch (wno e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/services/config/ConfigFetcherTaskRunner", "runTask", '$', "ConfigFetcherTaskRunner.java")).t("Scheduled config refresh failed.");
            return 2;
        }
    }
}
