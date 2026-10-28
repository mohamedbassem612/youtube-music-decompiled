package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kgn extends azs {
    final /* synthetic */ kgo a;

    public kgn(kgo kgoVar) {
        this.a = kgoVar;
    }

    @Override // defpackage.azs
    public final void x(dii diiVar) {
        kgo kgoVar = kgo.a;
        khn.e();
        this.a.b(diiVar.s);
    }

    @Override // defpackage.azs
    public final void y(dii diiVar) {
        kgo kgoVar = kgo.a;
        khn.e();
        this.a.b(diiVar.s);
    }

    @Override // defpackage.azs
    public final void z(dii diiVar) {
        CastDevice castDeviceC;
        kgo kgoVar = kgo.a;
        khn.e();
        Bundle bundle = diiVar.s;
        if (bundle == null || (castDeviceC = CastDevice.c(bundle)) == null) {
            return;
        }
        String string = bundle.getString("com.google.android.gms.cast.EXTRA_RUNNING_RECEIVER_APP_ID");
        kgo kgoVar2 = this.a;
        kgj kgjVar = (kgj) kgoVar2.f.get(castDeviceC.a);
        boolean z = false;
        if (kgjVar != null && string != null && ((String) kgjVar.d.a).equals(string)) {
            z = true;
        }
        if (!z) {
            kgo.i(kgjVar);
        }
        if (kgjVar != null && kgjVar.f() == 4 && z) {
            return;
        }
        kgoVar2.d(castDeviceC);
    }
}
