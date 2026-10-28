package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mqk implements View.OnTouchListener {
    final /* synthetic */ View a;
    final /* synthetic */ mqm b;

    public mqk(mqm mqmVar, View view) {
        this.a = view;
        this.b = mqmVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.b.g();
        this.a.setOnTouchListener(null);
        return false;
    }
}
