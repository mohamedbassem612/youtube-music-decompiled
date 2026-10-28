package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class owx extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ owy a;

    public owx(owy owyVar) {
        this.a = owyVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        owy owyVar = this.a;
        View view = owyVar.k;
        if (owyVar.g != null || !owyVar.j || view == null) {
            return false;
        }
        oxe oxeVarH = owyVar.h();
        owy owyVar2 = oxeVarH.d;
        if (owyVar2.j) {
            oxeVarH.A = 5;
            oxeVarH.A(true);
            int iR = oxeVarH.r((motionEvent.getX() - owyVar2.s) - owyVar2.a(), (motionEvent.getY() - owyVar2.t) - owyVar2.d(), -1);
            if (iR >= 0) {
                oxeVarH.m = iR;
                int[] iArrF = oxeVarH.C.f(owyVar2.k(), iR);
                oxeVarH.D(iArrF[0], iArrF[1]);
                oxeVarH.w(view);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        owy owyVar = this.a;
        View view = owyVar.k;
        if (owyVar.g == null && owyVar.j && view != null) {
            oxe oxeVarH = owyVar.h();
            owy owyVar2 = oxeVarH.d;
            if (owyVar2.j) {
                oxeVarH.A = 2;
                oxeVarH.A(true);
                int iR = oxeVarH.r((motionEvent.getX() - owyVar2.s) - owyVar2.a(), (motionEvent.getY() - owyVar2.t) - owyVar2.d(), -1);
                if (iR >= 0) {
                    oxeVarH.m = iR;
                    int[] iArrF = oxeVarH.C.f(owyVar2.k(), iR);
                    oxeVarH.D(iArrF[0], iArrF[1]);
                    oxeVarH.w(view);
                }
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        owy owyVar = this.a;
        if (owyVar.g != null || !owyVar.j) {
            return false;
        }
        owyVar.h().b();
        return true;
    }
}
