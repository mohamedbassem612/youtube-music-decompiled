package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvk extends xvr {
    public final xve a;
    public final boolean b;

    public xvk(xve xveVar, boolean z) {
        this.a = xveVar;
        this.b = z;
    }

    @Override // defpackage.xvr
    public final xvz b() {
        return this.a.d;
    }

    @Override // defpackage.xvr
    public final String c() {
        return this.a.c;
    }

    @Override // defpackage.xvr
    public final xwc d() {
        return new xwc(this.a.e.b);
    }

    @Override // defpackage.xvr
    public final Bundle e() {
        Bundle bundleE = super.e();
        bundleE.putBoolean("displayInAvailableList", !this.b);
        if (!TextUtils.isEmpty(k().b)) {
            bundleE.putString("lounge_device_id", k().b);
        }
        return bundleE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xvk) {
            xvk xvkVar = (xvk) obj;
            if (xvkVar.b == this.b) {
                return this.a.equals(xvkVar.a);
            }
        }
        return false;
    }

    @Override // defpackage.xvr
    public final String f() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.xvr
    public final boolean g(xvr xvrVar) {
        if (!(xvrVar instanceof xvk)) {
            return false;
        }
        return awrc.c(((xvk) xvrVar).a.e, this.a.e);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xvr
    public final int i() {
        return 4;
    }

    @Override // defpackage.xvr
    public final boolean j() {
        return !b().b.isEmpty();
    }

    public final xvg k() {
        return this.a.e;
    }

    public final String l() {
        return this.a.c;
    }

    @Override // defpackage.xvr
    public final List v() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(k().b)) {
            arrayList.add(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, k().b));
        }
        return arrayList;
    }
}
