package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.awoq;
import defpackage.awou;
import defpackage.awrc;
import defpackage.awuq;
import defpackage.awwf;
import defpackage.azx;
import defpackage.dnz;
import defpackage.dyo;
import defpackage.dze;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends dze {
    private final WorkerParameters d;
    private final awuq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.d = workerParameters;
        this.e = dyo.a;
    }

    @Override // defpackage.dze
    public final ListenableFuture a() {
        return azx.f(this.e.plus(new awwf(null)), new dnz(this, (awoq) null, 2));
    }

    @Override // defpackage.dze
    public final ListenableFuture b() {
        awou awouVar = this.e;
        if (awrc.c(awouVar, dyo.a)) {
            awouVar = this.d.f;
        }
        awouVar.getClass();
        return azx.f(awouVar.plus(new awwf(null)), new dnz(this, (awoq) null, 3, (byte[]) null));
    }

    public abstract Object c(awoq awoqVar);
}
