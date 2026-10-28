package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hbq implements vqi {
    public final DisplayMetrics a;
    public final awmd b;
    public View.OnLayoutChangeListener c;
    public amvd d;
    public final vor e;
    public final hcb f;
    public final aihf g = amvd.a.createBuilder();
    private View h;

    public hbq(Context context, awmd awmdVar, hcb hcbVar, vor vorVar) {
        this.b = awmdVar;
        this.f = hcbVar;
        this.e = vorVar;
        this.a = context.getResources().getDisplayMetrics();
    }

    @Override // defpackage.vqi
    public final void a(vob vobVar) {
        View viewC;
        View.OnLayoutChangeListener onLayoutChangeListener = this.c;
        onLayoutChangeListener.getClass();
        View view = this.h;
        if (view != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (vobVar != null) {
            viewC = vobVar.c();
            if (viewC != null) {
                viewC.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        } else {
            viewC = null;
        }
        this.h = viewC;
    }
}
