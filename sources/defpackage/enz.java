package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class enz implements epi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ enu a;

    public /* synthetic */ enz(enu enuVar, int i) {
        this.$cid = i;
        this.a = enuVar;
    }

    @Override // defpackage.epi
    public final Object a(epg epgVar) {
        if (this.$cid != 0) {
            enu enuVar = this.a;
            enuVar.p(new env(enuVar, epgVar), 1);
            return "reconnectIfNeeded";
        }
        enu enuVar2 = this.a;
        try {
            ((eoa) enuVar2).q.getClass();
            gdo gdoVar = ((eoa) enuVar2).q;
            String packageName = ((eoa) enuVar2).o.getPackageName();
            kkn kknVar = new kkn(epgVar, 1);
            Parcel parcelC = gdoVar.c();
            parcelC.writeString(packageName);
            parcelC.writeString("LAUNCH_BILLING_FLOW");
            gdc.e(parcelC, kknVar);
            gdoVar.f(1, parcelC);
        } catch (Exception e) {
            ((eoa) enuVar2).y(107, 28, eoi.n);
            eov.f("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            epgVar.a(0);
        }
        return "billingOverrideService.getBillingOverride";
    }
}
