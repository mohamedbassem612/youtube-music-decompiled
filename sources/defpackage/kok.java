package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kok implements knw {
    final /* synthetic */ koq a;

    public kok(koq koqVar) {
        this.a = koqVar;
    }

    @Override // defpackage.knw
    public final void a(boolean z) {
        Handler handler = this.a.q;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
