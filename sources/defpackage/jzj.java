package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzj extends jzg {
    final /* synthetic */ kjc a;

    public jzj(kjc kjcVar) {
        this.a = kjcVar;
    }

    @Override // defpackage.jzg
    public final void b(String str) {
        kro.z(str != null ? Status.a : new Status(3006, null, null, null), str, this.a);
    }
}
