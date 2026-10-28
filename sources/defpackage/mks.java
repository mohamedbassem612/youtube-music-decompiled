package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mks implements GestureDetector.OnDoubleTapListener {
    private final mkr a;

    public mks(mkr mkrVar) {
        this.a = mkrVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, nru] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        mkr mkrVar;
        List<aclc> list;
        if (motionEvent.getActionMasked() != 1 || (list = (mkrVar = this.a).f) == null) {
            return false;
        }
        for (aclc aclcVar : list) {
            View view = (View) mkrVar.a.get();
            nxg nxgVar = new nxg(motionEvent.getX(), motionEvent.getY());
            mpo mpoVar = (mpo) aclcVar.e;
            nry nryVar = mpoVar.b;
            CommandOuterClass$Command commandOuterClass$CommandX = ((omj) aclcVar.c).x();
            ?? r7 = aclcVar.b;
            ?? r8 = aclcVar.d;
            nsl nslVar = (nsl) aclcVar.a;
            mpoVar.i(nryVar.a(commandOuterClass$CommandX, mpo.j(view, null, 2, nxgVar, null, r7, r8, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.b(motionEvent);
        return false;
    }
}
