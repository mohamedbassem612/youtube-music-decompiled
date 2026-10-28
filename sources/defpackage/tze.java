package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tze implements avlc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aqi a;

    public tze(aqi aqiVar, int i) {
        this.$cid = i;
        this.a = aqiVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (this.$cid == 0) {
            this.a.d(th);
            return;
        }
        boolean z = th instanceof CancellationException;
        aqi aqiVar = this.a;
        if (z) {
            aqiVar.c();
        } else {
            aqiVar.d(th);
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (this.$cid != 0) {
            avmnVar.getClass();
            this.a.a(new mbo(avmnVar, 20), MoreExecutors.directExecutor());
        } else {
            avmnVar.getClass();
            this.a.a(new syd(avmnVar, 13), MoreExecutors.directExecutor());
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        if (this.$cid == 0) {
            this.a.b(null);
            return;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles();
            aqi aqiVar = this.a;
            if (fileArrListFiles == null) {
                aqiVar.b(agpi.a);
            } else {
                aqiVar.b(rmp.v(fileArrListFiles));
            }
        } catch (RuntimeException unused) {
            this.a.b(agpi.a);
        }
    }
}
