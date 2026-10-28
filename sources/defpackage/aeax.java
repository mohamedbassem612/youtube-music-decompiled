package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeax implements nt {
    boolean a = false;
    public boolean b = false;
    private final View c;
    private final int d;
    private boolean e;
    private int f;
    private float g;
    private float h;
    private final qcb i;

    public aeax(View view, int i, qcb qcbVar) {
        this.c = view;
        this.d = i;
        this.i = qcbVar;
    }

    private final float a() {
        return Math.abs(this.h);
    }

    private final void b(int i) {
        View view = this.c;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        tym.h(view, new tyl(i, 1), ViewGroup.LayoutParams.class);
    }

    @Override // defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (!this.b && !this.a) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.e = !recyclerView.canScrollVertically(-1);
                int pointerId = motionEvent.getPointerId(0);
                this.f = pointerId;
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex2 >= 0) {
                    this.g = motionEvent.getY(iFindPointerIndex2);
                }
            } else if (actionMasked == 1) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f);
                if (iFindPointerIndex3 >= 0) {
                    float y = this.g - motionEvent.getY(iFindPointerIndex3);
                    this.h = y;
                    if (this.e && y < 0.0f) {
                        if (a() >= this.d) {
                            this.a = true;
                            grf grfVar = (grf) this.i.a;
                            jbw jbwVar = grfVar.as;
                            if (jbwVar != null) {
                                jbwVar.g();
                            }
                            grfVar.U();
                        } else {
                            b(0);
                        }
                    }
                }
            } else if (actionMasked == 2 && (iFindPointerIndex = motionEvent.findPointerIndex(this.f)) >= 0) {
                float y2 = this.g - motionEvent.getY(iFindPointerIndex);
                this.h = y2;
                if (this.e && y2 < 0.0f && Math.abs(y2) > ViewConfiguration.get(this.c.getContext()).getScaledTouchSlop()) {
                    int iMin = (int) Math.min(a(), this.d);
                    b(iMin);
                    this.g -= iMin;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nt
    public final void f(boolean z) {
    }

    @Override // defpackage.nt
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
