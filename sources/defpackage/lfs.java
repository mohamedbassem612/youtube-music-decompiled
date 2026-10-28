package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lfs extends lbw {
    final /* synthetic */ lfv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfs(lfv lfvVar, leb lebVar) {
        super(lebVar);
        this.b = lfvVar;
    }

    @Override // defpackage.lbw
    public final void b() {
        lfv lfvVar = this.b;
        lfvVar.A();
        List listAi = lfvVar.v().ai(null, lfm.a(lho.SGTM_CLIENT), 1);
        if (!listAi.isEmpty()) {
            String str = ((lfw) listAi.get(0)).b;
            lfvVar.aT().k.b("[sgtm] Processing next sGTM batch for app", str);
            lfvVar.aV();
            lfvVar.u = SystemClock.elapsedRealtime();
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            intent.setPackage(str);
            rpi.D(lfvVar.aS(), intent);
        }
        lfvVar.P();
    }
}
