package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bcv {
    public final View a;
    public final ArrayList b = new ArrayList();
    public avw c;
    public avw d;
    public int e;

    public bcv(ViewGroup viewGroup) {
        View childAt;
        avw avwVar = avw.a;
        this.c = avwVar;
        this.d = avwVar;
        Drawable background = viewGroup.getBackground();
        int i = 0;
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        bct bctVar = new bct(this, viewGroup.getContext(), viewGroup);
        this.a = bctVar;
        bctVar.setVisibility(8);
        bctVar.setWillNotDraw(true);
        bcs bcsVar = new bcs(this, i);
        int i2 = bac.a;
        azs.c(bctVar, bcsVar);
        ci.m(bctVar, new bcu(this));
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
        } while (childAt.isAttachedToWindow() == viewGroup.isAttachedToWindow());
        if (childAt == null) {
            viewGroup.addView(bctVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new mgj(viewGroup, bctVar, 1));
        }
    }

    public static final avw a(bbn bbnVar) {
        return avw.c(bbnVar.f(519), bbnVar.f(64));
    }
}
