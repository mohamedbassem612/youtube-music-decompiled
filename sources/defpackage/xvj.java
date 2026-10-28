package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvj extends xvr {
    public final CastDevice a;

    public xvj(CastDevice castDevice) {
        this.a = castDevice;
    }

    @Override // defpackage.xvr
    public final xvz b() {
        return null;
    }

    @Override // defpackage.xvr
    public final String c() {
        return this.a.d;
    }

    @Override // defpackage.xvr
    public final xwc d() {
        return new xwc(this.a.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xvj) {
            return this.a.equals(((xvj) obj).a);
        }
        return false;
    }

    @Override // defpackage.xvr
    public final String f() {
        return "Cast:".concat(this.a.e);
    }

    @Override // defpackage.xvr
    public final boolean g(xvr xvrVar) {
        if (xvrVar instanceof xvj) {
            return d().equals(xvrVar.d());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // defpackage.xvr
    public final int i() {
        return 2;
    }

    @Override // defpackage.xvr
    public final boolean j() {
        return false;
    }

    public final String toString() {
        return "MdxCastScreen{castDevice=" + this.a.toString() + '}';
    }

    @Override // defpackage.xvr
    public final List v() {
        ArrayList arrayList = new ArrayList();
        String str = this.a.n;
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, str));
        }
        return arrayList;
    }

    public xvj() {
        throw null;
    }
}
