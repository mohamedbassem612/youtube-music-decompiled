package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwn extends acdd implements acdg {
    public boolean a;
    public Animation b;
    public Animation c;

    @Override // defpackage.acdg
    public final /* synthetic */ ViewGroup.LayoutParams b() {
        return new acdh(-1, -1, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(acdg acdgVar) {
        acdgVar.getClass();
        if (acdgVar instanceof View) {
            addView((View) acdgVar, acdgVar.b());
        }
    }
}
