package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ota {
    public Rect a = null;
    public TouchDelegate b = null;
    public osv c = null;
    public GestureDetector d = null;
    public otb e = null;
    public ArrayList f = null;
    public float g;
    public float h;

    public final void a(View view) {
        if (this.b != null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (Build.VERSION.SDK_INT < 29 || view2.getTouchDelegate() == this.b) {
                    view2.setTouchDelegate(null);
                }
            }
            this.b = null;
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.d;
        if (gestureDetector != null) {
            return gestureDetector.onGenericMotionEvent(motionEvent);
        }
        return false;
    }

    public final boolean c(View view, MotionEvent motionEvent) {
        this.g = motionEvent.getX();
        this.h = motionEvent.getY();
        osv osvVar = this.c;
        if (osvVar != null) {
            osvVar.a(view, motionEvent);
        }
        boolean zA = motionEvent.getActionMasked() == 0 && this.e != null;
        GestureDetector gestureDetector = this.d;
        if (gestureDetector != null) {
            zA |= gestureDetector.onTouchEvent(motionEvent);
        }
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zA |= ((otc) arrayList.get(i)).a(view, motionEvent);
            }
        }
        return zA;
    }

    public final boolean d() {
        otb otbVar = this.e;
        if (otbVar != null) {
            orp orpVar = (orp) otbVar;
            if ((orpVar.b & 2) != 0) {
                orpVar.d.d(orpVar.c.aT(), orpVar.b(null, 2L));
                orpVar.a.aj(2);
                return true;
            }
        }
        return false;
    }
}
