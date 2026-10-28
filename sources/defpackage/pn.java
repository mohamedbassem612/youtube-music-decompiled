package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pn implements nt {
    final /* synthetic */ pv a;

    public pn(pv pvVar) {
        this.a = pvVar;
    }

    @Override // defpackage.nt
    public final void f(boolean z) {
        if (z) {
            this.a.u(null, 0);
        }
    }

    @Override // defpackage.nt
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        pv pvVar = this.a;
        pvVar.q.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = pvVar.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (pvVar.i != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(pvVar.i);
            if (iFindPointerIndex >= 0) {
                pvVar.p(actionMasked, motionEvent, iFindPointerIndex);
            }
            oh ohVar = pvVar.b;
            if (ohVar != null) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (iFindPointerIndex >= 0) {
                            pvVar.w(motionEvent, pvVar.k, iFindPointerIndex);
                            pvVar.r(ohVar);
                            Runnable runnable = pvVar.n;
                            pvVar.m.removeCallbacks(runnable);
                            runnable.run();
                            pvVar.m.invalidate();
                            return;
                        }
                        return;
                    }
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == pvVar.i) {
                                pvVar.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                pvVar.w(motionEvent, pvVar.k, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = pvVar.o;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
                pvVar.u(null, 0);
                pvVar.i = -1;
            }
        }
    }

    @Override // defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        pv pvVar = this.a;
        pvVar.q.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        ps psVar = null;
        if (actionMasked == 0) {
            pvVar.i = motionEvent.getPointerId(0);
            pvVar.c = motionEvent.getX();
            pvVar.d = motionEvent.getY();
            pvVar.s();
            if (pvVar.b == null) {
                List list = pvVar.l;
                if (!list.isEmpty()) {
                    View viewM = pvVar.m(motionEvent);
                    for (int size = list.size() - 1; size >= 0; size--) {
                        ps psVar2 = (ps) list.get(size);
                        if (psVar2.h.a == viewM) {
                            psVar = psVar2;
                            break;
                        }
                    }
                }
                if (psVar != null) {
                    pvVar.c -= psVar.l;
                    pvVar.d -= psVar.m;
                    oh ohVar = psVar.h;
                    pvVar.q(ohVar, true);
                    if (pvVar.a.remove(ohVar.a)) {
                        pvVar.j.d(pvVar.m, ohVar);
                    }
                    pvVar.u(ohVar, psVar.i);
                    pvVar.w(motionEvent, pvVar.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            pvVar.i = -1;
            pvVar.u(null, 0);
        } else {
            int i = pvVar.i;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                pvVar.p(actionMasked, motionEvent, iFindPointerIndex);
            }
        }
        VelocityTracker velocityTracker = pvVar.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return pvVar.b != null;
    }
}
