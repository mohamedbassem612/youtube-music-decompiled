package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uwe implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ uwf a;
    private final View b;
    private final View c;

    public uwe(uwf uwfVar, View view, View view2) {
        this.a = uwfVar;
        this.b = view;
        this.c = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.b;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Rect rect = new Rect();
        this.c.getGlobalVisibleRect(rect);
        uwf uwfVar = this.a;
        aefs aefsVar = uwfVar.e;
        if (aefsVar != null) {
            aefsVar.b.set(rect);
        }
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        float rotation = view.getRotation();
        double dSin = Math.sin(Math.toRadians(rotation));
        aefs aefsVar2 = uwfVar.e;
        if (aefsVar2 != null) {
            aefsVar2.c(rect2, 2, 2);
        }
        aefs aefsVar3 = uwfVar.e;
        boolean z = aefsVar3 != null && aefsVar3.g(2, rect2);
        aefs aefsVar4 = uwfVar.e;
        boolean z2 = aefsVar4 != null && aefsVar4.g(1, rect2);
        if (z || z2) {
            double dAbs = Math.abs((((double) view.getWidth()) / 2.0d) * dSin);
            double height = (((double) view.getHeight()) / 2.0d) * dSin;
            if (rotation > 90.0f || rotation < -90.0f) {
                if (z) {
                    i = (int) height;
                    i2 = (int) (-dAbs);
                } else {
                    i = (int) (-height);
                    i2 = (int) dAbs;
                }
                rect2.offset(i, i2);
            } else {
                if (z) {
                    i3 = (int) (-height);
                    i4 = (int) (-dAbs);
                } else {
                    i3 = (int) height;
                    i4 = (int) dAbs;
                }
                rect2.offset(i3, i4);
            }
        } else {
            rect2.offset(0, rect2.height() / 2);
        }
        aefs aefsVar5 = uwfVar.e;
        if (aefsVar5 != null) {
            aefsVar5.f(rect2);
        }
        uwfVar.d.kk(Boolean.TRUE);
    }
}
