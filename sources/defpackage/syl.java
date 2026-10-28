package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class syl extends dzv {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final ayq d;

    public syl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, ayq ayqVar) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = ayqVar;
    }

    @Override // defpackage.dzv
    public final dze a(Context context, String str, WorkerParameters workerParameters) {
        this.d.S(str, workerParameters.c);
        if (ahno.ag(str, BackgroundTaskWorker.d)) {
            return new BackgroundTaskWorker(context, workerParameters, this.a, this.b, this.c);
        }
        return null;
    }
}
