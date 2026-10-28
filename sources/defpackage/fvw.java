package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvw {
    public final int a;
    public final Rect b;
    public boolean c = false;
    private Rect d;
    private final fvw e;

    public fvw(int i, Rect rect, fvw fvwVar) {
        this.a = i;
        this.b = new Rect(rect);
        this.e = fvwVar;
        if (fvwVar != null) {
            a(this, fvwVar);
        }
    }

    private static void a(fvw fvwVar, fvw fvwVar2) {
        boolean z;
        if (fvwVar2 != null) {
            Rect rect = fvwVar.b;
            boolean z2 = true;
            if (fvwVar.c) {
                fvwVar2.c = true;
            }
            Rect rect2 = fvwVar2.b;
            if (rect.top < rect2.top) {
                b(fvwVar2);
                rect2.top = rect.top;
                z = true;
            } else {
                z = false;
            }
            if (rect.bottom > rect2.bottom) {
                b(fvwVar2);
                rect2.bottom = rect.bottom;
                z = true;
            }
            if (rect.left < rect2.left) {
                b(fvwVar2);
                rect2.left = rect.left;
            } else {
                z2 = z;
            }
            if (rect.right > rect2.right) {
                b(fvwVar2);
                rect2.right = rect.right;
            } else if (!z2) {
                return;
            }
            a(fvwVar2, fvwVar2.e);
        }
    }

    private static void b(fvw fvwVar) {
        if (fvwVar.d == null) {
            fvwVar.d = new Rect(fvwVar.b);
        }
    }
}
