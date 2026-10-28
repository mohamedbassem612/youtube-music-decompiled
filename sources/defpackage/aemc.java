package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aemc extends tud {
    final /* synthetic */ aemn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemc(aemn aemnVar, String str) {
        super(str);
        this.a = aemnVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        aemn aemnVar = this.a;
        Handler handler = aemnVar.A;
        Runnable runnable = aemnVar.w;
        handler.removeCallbacks(runnable);
        aemnVar.A.post(runnable);
    }
}
