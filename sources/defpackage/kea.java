package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kea implements lov {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kea(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.lov
    public final void d(Exception exc) {
        klo kloVar;
        switch (this.$cid) {
            case 0:
                Status status = new Status(8, "unknown error", null, null);
                if (exc instanceof kmu) {
                    kmu kmuVar = (kmu) exc;
                    status = new Status(kmuVar.a(), kmuVar.getMessage(), null, null);
                }
                Object obj = this.a;
                int i = kbu.f;
                ((BasePendingResult) obj).l(status);
                break;
            case 1:
                ((kjc) this.a).x(null);
                break;
            case 2:
                int i2 = kec.a;
                khn.e();
                ((kjc) this.a).x(Boolean.FALSE);
                break;
            case 3:
                kgj kgjVar = ((kgf) this.a).a;
                khn khnVar = kgj.a;
                kyr kyrVar = kgjVar.d;
                khnVar.c(exc, "Failed to join application with ID %s running on device with ID %s.", kyrVar.a, ((CastDevice) kyrVar.b).a);
                kbp kbpVar = new kbp();
                kbpVar.b = 2426;
                kgjVar.i(kbpVar.a(), false, true);
                break;
            case 4:
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((kwi) this.a).c.e(2025, -1L, exc, null, null);
                break;
            case 5:
                if ((exc instanceof kmu) && (kloVar = ((kmu) exc).a.i) != null && kloVar.c == 24) {
                    ((lkx) this.a).c.set(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 6:
                boolean z = mdz.a;
                Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
                break;
            case 7:
                boolean z2 = mdz.a;
                Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
                break;
        }
    }
}
