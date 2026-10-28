package defpackage;

import android.content.Context;
import android.webkit.PermissionRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsd extends vse {
    public Context a;
    public PermissionRequest b = null;
    public yhi c = null;

    @Override // defpackage.cc
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 0) {
            PermissionRequest permissionRequest = this.b;
            if (permissionRequest != null) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    permissionRequest.deny();
                } else {
                    permissionRequest.grant(permissionRequest.getResources());
                }
            }
            yhi yhiVar = this.c;
            if (yhiVar != null) {
                yhiVar.a();
            }
        }
    }
}
