package defpackage;

import android.content.Context;
import android.webkit.PermissionRequest;
import j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vso extends vsg {
    public static final String a = "vso";
    public Context b;
    public PermissionRequest c = null;
    public ahhp d = null;

    @Override // defpackage.cc
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 251) {
            if (this.c != null) {
                if (iArr.length <= 0 || !DesugarArrays.stream(iArr).allMatch(new vsn())) {
                    this.c.deny();
                } else {
                    PermissionRequest permissionRequest = this.c;
                    permissionRequest.grant(permissionRequest.getResources());
                }
            }
            ahhp ahhpVar = this.d;
            if (ahhpVar != null) {
                ahhpVar.e();
            }
        }
    }
}
