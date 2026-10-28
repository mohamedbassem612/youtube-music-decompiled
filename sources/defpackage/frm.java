package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frm extends RecyclerView {
    public mhc ae;
    public hhb af;

    public frm(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hhb hhbVar = this.af;
        if (hhbVar != null) {
            ((fsy) hhbVar.a).C();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mhc mhcVar = this.ae;
        if (mhcVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (mhcVar.a == null) {
            mhcVar.a = new mhe(this, mhcVar.b, mhcVar.c, mhcVar.d);
        }
        mhcVar.a.m(this, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
