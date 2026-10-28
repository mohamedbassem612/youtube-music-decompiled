package defpackage;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwj extends CountDownTimer {
    final /* synthetic */ Runnable a;
    final /* synthetic */ wwk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwj(wwk wwkVar, long j, Runnable runnable) {
        super(j, 500L);
        this.a = runnable;
        this.b = wwkVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.run();
        wwk wwkVar = this.b;
        wwkVar.c = 0L;
        wwkVar.d = null;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.b.c = j;
    }
}
