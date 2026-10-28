package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmg {
    public static final fmh a = new fmf(7);
    public static final fmh b = new fmf(8);
    public static final fmh c = new fmf(6);
    public static final fmh d = new fmf(0);
    public static final fmh e = new fmf(1);
    public static final fmh f = new fmf(3);
    public static final fmh g = new fmf(2);
    public static final fmh h = new fmf(4);
    public static final fmh i = new fmf(5);

    public static float a(View view, boolean z) {
        float x = 0.0f;
        while (view != null && (view.getParent() instanceof View) && (!(view instanceof fvf) || !(view instanceof fvs))) {
            x += z ? view.getX() : view.getY();
            view = (View) view.getParent();
        }
        return x;
    }

    public static View b(Object obj, fmh fmhVar) {
        if (obj instanceof View) {
            return (View) obj;
        }
        throw new RuntimeException("Animating '" + fmhVar.b() + "' is only supported on Views (got " + String.valueOf(obj) + ')');
    }

    public static View c(Drawable drawable) {
        Object callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }

    public static List d(fvf fvfVar) {
        int iA = fvfVar.a();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < iA; i2++) {
            fvi fviVarB = fvfVar.b(i2);
            Object obj = fviVarB.a;
            if ((obj instanceof Drawable) && (((fjr) fviVarB.d.b).b.d & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) obj);
            }
        }
        return arrayList;
    }
}
