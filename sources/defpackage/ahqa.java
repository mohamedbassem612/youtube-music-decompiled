package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ahqa extends ahqc {
    private final ahrs a;
    private final kjc b;

    public ahqa(ahrs ahrsVar, kjc kjcVar) {
        this.a = ahrsVar;
        this.b = kjcVar;
    }

    @Override // defpackage.ahqc
    public final void b(Status status, ahpv ahpvVar) {
        Bundle bundle;
        ahoa ahoaVar;
        kro.z(status, ahpvVar == null ? null : new ahub(ahpvVar), this.b);
        if (ahpvVar == null || (bundle = ahpvVar.a().getBundle("scionData")) == null || bundle.keySet() == null || (ahoaVar = (ahoa) this.a.a()) == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            ahoaVar.a("fdl", str, bundle.getBundle(str));
        }
    }
}
