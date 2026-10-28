package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fer implements fev {
    private final int a;
    private final boolean b;

    public fer(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.fev
    public final /* bridge */ /* synthetic */ boolean a(Object obj, feu feuVar) {
        Drawable drawable = (Drawable) obj;
        Drawable drawableJ = feuVar.j();
        if (drawableJ == null) {
            drawableJ = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableJ, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        feuVar.n(transitionDrawable);
        return true;
    }
}
