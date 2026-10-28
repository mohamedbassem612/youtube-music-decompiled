package defpackage;

import android.app.Activity;
import android.os.CountDownTimer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tcz extends CountDownTimer {
    final /* synthetic */ Activity a;
    final /* synthetic */ tdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcz(tdc tdcVar, long j, long j2, Activity activity) {
        super(j, j2);
        this.a = activity;
        this.b = tdcVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.b.c(false, this.a);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
