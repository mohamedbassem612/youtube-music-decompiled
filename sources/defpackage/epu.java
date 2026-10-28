package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epu extends gdb implements IInterface {
    final enx a;
    final Boolean b;
    final int c;
    final /* synthetic */ enu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epu(enu enuVar, enx enxVar, Boolean bool, int i) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
        this.d = enuVar;
        this.a = enxVar;
        this.b = bool;
        this.c = i;
    }

    private final void b(enx enxVar, eoh eohVar, int i, boolean z, String str, int i2) {
        this.d.m(0);
        enxVar.e(eohVar, i, str, z, i2);
        enxVar.b(eohVar);
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
        gdc.b(parcel);
        if (bundle == null) {
            eov.e("BillingClient", "Response bundle is null.");
            b(this.a, eoi.e, 131, this.b.booleanValue(), null, this.c);
        } else if (!bundle.containsKey("RESPONSE_CODE")) {
            eov.e("BillingClient", "Response bundle doesn't contain a response code");
            b(this.a, eoi.e, 138, this.b.booleanValue(), null, this.c);
        } else if (bundle.getInt("RESPONSE_CODE") != 0) {
            enx enxVar = this.a;
            int i2 = bundle.getInt("RESPONSE_CODE");
            String string = bundle.getString("DEBUG_MESSAGE", "");
            eoh eohVar = eoi.a;
            b(enxVar, zi.j(i2, 0, string), 139, this.b.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"), this.c);
        } else if (bundle.containsKey("BILLING_API_VERSION_KEY")) {
            int i3 = bundle.getInt("BILLING_API_VERSION_KEY");
            enu enuVar = this.d;
            enuVar.l(i3);
            enuVar.f = i3 >= 3;
            Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
            if (bundle2 != null) {
                try {
                    bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
                    long j = eoj.a;
                } catch (Throwable th) {
                    eov.f("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
                }
                try {
                    eoj.a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
                } catch (Throwable th2) {
                    eov.f("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
                }
                try {
                    bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
                    long j2 = eoj.a;
                } catch (Throwable th3) {
                    eov.f("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
                }
                try {
                    bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
                    long j3 = eoj.a;
                } catch (Throwable th4) {
                    eov.f("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
                }
                try {
                    eoj.b = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
                } catch (Throwable th5) {
                    eov.f("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th5);
                }
                try {
                    eoj.c = bundle2.getBoolean("ENABLE_AWAIT_CONCURRENT_RECONNECTIONS_KEY");
                } catch (Throwable th6) {
                    eov.f("BillingClient", "Error reading EnableAwaitConcurrentReconnections experiment flag: ".concat(bundle2.toString()), th6);
                }
            }
            Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
            if (bundle3 != null) {
                agkx agkxVar = new agkx();
                for (eos eosVar : eos.values()) {
                    if (bundle3.getBoolean(eosVar.name(), false)) {
                        agkxVar.c(eosVar);
                    }
                }
                enu enuVar2 = this.d;
                agkxVar.g();
                if (enuVar2.m != null) {
                    aerq aerqVar = enuVar2.m;
                }
            }
            enu enuVar3 = this.d;
            if (enuVar3.g < 3) {
                eov.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                b(this.a, eoi.a, 36, this.b.booleanValue(), null, this.c);
            } else {
                enx enxVar2 = this.a;
                Boolean bool = this.b;
                int i4 = this.c;
                boolean zBooleanValue = bool.booleanValue();
                enuVar3.n(0);
                synchronized (enuVar3.a) {
                    if (enuVar3.b != 3) {
                        enxVar2.a(zBooleanValue, i4);
                        enxVar2.b(eoi.f);
                    }
                }
            }
        } else {
            eov.e("BillingClient", "Billing API version not found in response bundle.");
            b(this.a, eoi.e, 137, this.b.booleanValue(), null, this.c);
        }
        return true;
    }
}
