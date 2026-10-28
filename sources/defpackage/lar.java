package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lar extends laq {
    final /* synthetic */ Bundle a;
    final /* synthetic */ kzv b;
    final /* synthetic */ afjp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lar(afjp afjpVar, Bundle bundle, kzv kzvVar) {
        super((lay) afjpVar.a, true);
        this.a = bundle;
        this.b = kzvVar;
        this.c = afjpVar;
    }

    @Override // defpackage.laq
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        kzj kzjVar = ((lay) this.c.a).e;
        if (kzjVar == null) {
            throw new NullPointerException("null reference");
        }
        kzjVar.onActivityCreatedByScionActivityInfo(this.b, bundle, this.g);
    }
}
