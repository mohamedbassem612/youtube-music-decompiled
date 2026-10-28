package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.bbl;
import defpackage.bnz;
import defpackage.dzd;
import defpackage.dzf;
import defpackage.ebm;
import defpackage.eeh;
import defpackage.eel;
import defpackage.eet;
import defpackage.eff;
import defpackage.ego;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final bbl c() {
        ebm ebmVarJ = ebm.j(this.a);
        WorkDatabase workDatabase = ebmVarJ.d;
        workDatabase.getClass();
        eet eetVarC = workDatabase.C();
        eel eelVarA = workDatabase.A();
        eff effVarD = workDatabase.D();
        eeh eehVarZ = workDatabase.z();
        bnz bnzVar = ebmVarJ.c.k;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        List listF = eetVarC.f(jCurrentTimeMillis - 86400000);
        List listG = eetVarC.g();
        List listU = eetVarC.u();
        if (!listF.isEmpty()) {
            dzf.b();
            int i = ego.a;
            dzf.b();
            ego.a(eelVarA, effVarD, eehVarZ, listF);
        }
        if (!listG.isEmpty()) {
            dzf.b();
            int i2 = ego.a;
            dzf.b();
            ego.a(eelVarA, effVarD, eehVarZ, listG);
        }
        if (!listU.isEmpty()) {
            dzf.b();
            int i3 = ego.a;
            dzf.b();
            ego.a(eelVarA, effVarD, eehVarZ, listU);
        }
        return new dzd();
    }
}
