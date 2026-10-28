package defpackage;

import java.util.TimerTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class keo extends TimerTask {
    final /* synthetic */ ker a;

    public keo(ker kerVar) {
        this.a = kerVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ker kerVar = this.a;
        kerVar.i = false;
        if (kerVar.j == null) {
            kerVar.d();
        }
    }
}
