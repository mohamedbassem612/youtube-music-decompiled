package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ujm extends tud {
    final /* synthetic */ ujn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujm(ujn ujnVar, String str) {
        super(str);
        this.a = ujnVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        View view;
        ujn ujnVar = this.a;
        if (!ujnVar.e || (view = ujnVar.b) == null) {
            return;
        }
        Rect rect = ujnVar.c;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getRootView().getHeight();
        int i = rect.bottom;
        double dAbs = Math.abs(i - ujnVar.d);
        double d = height;
        int i2 = ujnVar.d;
        ujnVar.d = i;
        if (dAbs > d * 0.15d) {
            if (i > i2) {
                qcb qcbVar = ujnVar.f;
                qcbVar.getClass();
                qcbVar.c(false);
            } else if (i < i2) {
                qcb qcbVar2 = ujnVar.f;
                qcbVar2.getClass();
                qcbVar2.c(true);
            }
        }
    }
}
