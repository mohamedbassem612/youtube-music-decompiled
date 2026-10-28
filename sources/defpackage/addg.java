package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class addg implements View.OnTouchListener {
    final /* synthetic */ aknp a;
    final /* synthetic */ nrv b;
    final /* synthetic */ addi c;

    public addg(addi addiVar, aknp aknpVar, nrv nrvVar) {
        this.a = aknpVar;
        this.b = nrvVar;
        this.c = addiVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        addi addiVar = this.c;
        if (!addiVar.b.hasMessages(1)) {
            return false;
        }
        addiVar.b.removeMessages(1);
        addiVar.d(this.a, this.b);
        return false;
    }
}
