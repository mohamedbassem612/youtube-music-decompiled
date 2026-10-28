package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ujo extends tud {
    final /* synthetic */ ujp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujo(ujp ujpVar, String str) {
        super(str);
        this.a = ujpVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        ujp ujpVar = this.a;
        View view = ujpVar.a;
        if (view == null || ujpVar.h) {
            return;
        }
        Rect rect = ujpVar.c;
        view.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        if (i != ujpVar.e) {
            boolean z = i == ujpVar.d;
            ujpVar.f = z;
            if (z) {
                if (ujpVar.g) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(ujpVar.b);
                } else {
                    vkl vklVar = ujpVar.j;
                    if (vklVar != null) {
                        vklVar.e();
                    }
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            tym.h(view, new tyl((ujpVar.i.isPresent() && ujpVar.f) ? ((Integer) ujpVar.i.get()).intValue() : i - iArr[1], 1), ViewGroup.LayoutParams.class);
            ujpVar.e = i;
        }
    }
}
