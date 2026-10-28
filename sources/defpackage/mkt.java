package defpackage;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkt implements GestureDetector.OnGestureListener {
    private final mkr a;
    private final boolean b;

    public mkt(mkr mkrVar, boolean z) {
        this.a = mkrVar;
        this.b = z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        mkr mkrVar = this.a;
        View view = (View) mkrVar.a.get();
        List list = mkrVar.k;
        if (list == null || view == null) {
            return false;
        }
        nxg nxgVar = motionEvent != null ? new nxg(motionEvent.getX(), motionEvent.getY()) : null;
        nxg nxgVar2 = new nxg(motionEvent2.getX(), motionEvent2.getY());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ntk) it.next()).a(view, nxgVar, nxgVar2, f, f2);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        mkr mkrVar = this.a;
        if (mkrVar.l(this.b)) {
            mkrVar.a(motionEvent);
        } else if (mkrVar.c()) {
            mkrVar.a(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, nru] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawX;
        float rawY;
        mkr mkrVar = this.a;
        View view = (View) mkrVar.a.get();
        nxg nxgVar = mkrVar.q;
        List<aclc> list = mkrVar.i;
        char c = 0;
        if (list == null || view == null) {
            return false;
        }
        if (nxgVar != null) {
            rawX = motionEvent2.getRawX() - nxgVar.a;
            rawY = motionEvent2.getRawY() - nxgVar.b;
        } else {
            rawX = 0.0f;
            rawY = 0.0f;
        }
        nxg nxgVar2 = motionEvent != null ? new nxg(motionEvent.getX(), motionEvent.getY()) : null;
        nxg nxgVar3 = new nxg(motionEvent2.getX(), motionEvent2.getY());
        for (aclc aclcVar : list) {
            if (nxgVar2 != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                aslp aslpVarG = mpo.g(view);
                aslo asloVarF = mpo.f(view, nxgVar2, iArr[c], iArr[1]);
                aslo asloVarF2 = mpo.f(view, nxgVar3, iArr[c], iArr[1]);
                DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
                aihf aihfVarCreateBuilder = aslq.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aslq aslqVar = (aslq) aihfVarCreateBuilder.instance;
                asloVarF.getClass();
                aslqVar.d = asloVarF;
                aslqVar.c |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                aslq aslqVar2 = (aslq) aihfVarCreateBuilder.instance;
                asloVarF2.getClass();
                aslqVar2.e = asloVarF2;
                aslqVar2.c |= 2;
                aihf aihfVarCreateBuilder2 = asob.a.createBuilder();
                float fB = mpo.b(displayMetrics, rawX);
                aihfVarCreateBuilder2.copyOnWrite();
                asob asobVar = (asob) aihfVarCreateBuilder2.instance;
                asobVar.b |= 1;
                asobVar.c = fB;
                float fB2 = mpo.b(displayMetrics, rawY);
                aihfVarCreateBuilder2.copyOnWrite();
                asob asobVar2 = (asob) aihfVarCreateBuilder2.instance;
                asobVar2.b |= 2;
                asobVar2.d = fB2;
                asob asobVar3 = (asob) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                aslq aslqVar3 = (aslq) aihfVarCreateBuilder.instance;
                asobVar3.getClass();
                aslqVar3.f = asobVar3;
                aslqVar3.c |= 4;
                aslq aslqVar4 = (aslq) aihfVarCreateBuilder.build();
                aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                aihhVar.e(aslq.b, aslqVar4);
                aihhVar.e(aslp.b, aslpVarG);
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
                mpo mpoVar = (mpo) aclcVar.e;
                nry nryVar = mpoVar.b;
                CommandOuterClass$Command commandOuterClass$CommandX = ((omj) aclcVar.c).x();
                ?? r6 = aclcVar.a;
                ?? r7 = aclcVar.b;
                nsl nslVar = (nsl) aclcVar.d;
                mpoVar.i(nryVar.a(commandOuterClass$CommandX, mpo.j(view, null, 5, nxgVar2, senderStateOuterClass$SenderState, r6, r7, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
                c = c;
                rawX = rawX;
            }
        }
        boolean z = c;
        mkrVar.q = new nxg(motionEvent2.getRawX(), motionEvent2.getRawY());
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mkr mkrVar = this.a;
        if (!mkrVar.l(this.b) || mkrVar.c()) {
            return false;
        }
        mkrVar.b(motionEvent);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
