package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xzz extends azs {
    final /* synthetic */ yab a;

    public xzz(yab yabVar) {
        this.a = yabVar;
    }

    @Override // defpackage.azs
    public final void x(dii diiVar) {
        yab yabVar = this.a;
        if (yabVar.f == 1) {
            Handler handler = yabVar.c;
            handler.sendMessage(handler.obtainMessage(2, diiVar));
        }
    }
}
