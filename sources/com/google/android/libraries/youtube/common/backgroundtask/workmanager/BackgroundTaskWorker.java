package com.google.android.libraries.youtube.common.backgroundtask.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.afty;
import defpackage.afwl;
import defpackage.ahcz;
import defpackage.aher;
import defpackage.ahex;
import defpackage.awmd;
import defpackage.dzb;
import defpackage.dze;
import defpackage.rru;
import defpackage.vxz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BackgroundTaskWorker extends dze {
    public static final String d = "com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker";
    public final awmd e;
    public final awmd f;
    private final awmd g;

    public BackgroundTaskWorker(Context context, WorkerParameters workerParameters, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        super(context, workerParameters);
        awmdVar.getClass();
        this.e = awmdVar;
        this.g = awmdVar2;
        this.f = awmdVar3;
    }

    @Override // defpackage.dze
    public final ListenableFuture b() {
        long jC = ((vxz) this.f.io()).c(4, 45386311L, 0L);
        if (jC > 0 && d() > jC) {
            return new aher(new dzb());
        }
        ahex ahexVar = (ahex) this.g.io();
        rru rruVar = new rru(this, 3);
        long j = afwl.a;
        return ahexVar.submit(new ahcz(afty.c(false), rruVar, 1));
    }
}
