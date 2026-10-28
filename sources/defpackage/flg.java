package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flg {
    public final View a;
    public final fvi b;
    public fvq c;
    public boolean d;

    public flg(View view, fvi fviVar) {
        this.a = view;
        this.b = fviVar;
    }

    public final Rect a() {
        Rect rectA;
        fvi fviVar = this.b;
        flz flzVar = fja.a(fviVar).b;
        if (flzVar == null || (rectA = flzVar.a()) == null) {
            return null;
        }
        Rect rect = fviVar.d.d;
        return new Rect(rect.left - rectA.left, rect.top - rectA.top, rect.right + rectA.right, rect.bottom + rectA.bottom);
    }
}
