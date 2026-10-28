package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lpy extends lpu {
    @Override // defpackage.lpu
    public final void c(Status status) {
        if (status.c()) {
            return;
        }
        Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
    }
}
