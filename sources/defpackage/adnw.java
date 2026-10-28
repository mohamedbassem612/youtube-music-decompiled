package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adnw implements View.OnTouchListener {
    final /* synthetic */ adny a;

    public adnw(adny adnyVar) {
        this.a = adnyVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        tuk.i(this.a.getCurrentFocus());
        return false;
    }
}
