package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aoh;
import defpackage.bbl;
import defpackage.dze;
import defpackage.qf;
import defpackage.yp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Worker extends dze {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.dze
    public final ListenableFuture a() {
        return yp.c(h(), new aoh(8));
    }

    @Override // defpackage.dze
    public final ListenableFuture b() {
        return yp.c(h(), new qf(this, 13));
    }

    public abstract bbl c();
}
