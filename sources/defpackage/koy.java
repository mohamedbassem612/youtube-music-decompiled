package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class koy extends kob {
    public kjc d;

    public koy(kou kouVar) {
        super(kouVar, klt.a);
        this.d = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        this.e.c("GmsAvailabilityHelper", this);
    }

    @Override // defpackage.kob
    protected final void f(klo kloVar, int i) {
        String str = kloVar.d;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.d.w(new kmu(new Status(kloVar, str, kloVar.c)));
    }

    @Override // defpackage.kob
    protected final void g() {
        Activity activityA = this.e.a();
        if (activityA == null) {
            this.d.w(new kmu(new Status(8, null, null, null)));
            return;
        }
        int iL = this.c.l(activityA);
        kjc kjcVar = this.d;
        if (iL == 0) {
            kjcVar.x(null);
        } else {
            if (((lpa) kjcVar.a).i()) {
                return;
            }
            a(new klo(1, iL, null, null, null, null), 0);
        }
    }

    @Override // defpackage.kot
    public final void n() {
        this.d.w(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
}
