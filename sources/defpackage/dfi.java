package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dfi extends View {
    private final List a;
    private final List b;
    private final float c;

    public dfi(Context context) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        float f = this.c;
        if ((f == -3.4028235E38f ? -3.4028235E38f : f * (paddingBottom - paddingTop)) <= 0.0f || list.size() <= 0) {
            return;
        }
        bus busVarA = (bus) list.get(0);
        if (busVarA.J != Integer.MIN_VALUE) {
            bur burVar = new bur(busVarA);
            burVar.e = -3.4028235E38f;
            burVar.f = Integer.MIN_VALUE;
            burVar.b = null;
            if (busVarA.z == 0) {
                burVar.c(1.0f - busVarA.y, 0);
            } else {
                burVar.c((-busVarA.y) - 1.0f, 1);
            }
            int i = busVarA.A;
            if (i == 0) {
                burVar.d = 2;
            } else if (i == 2) {
                burVar.d = 0;
            }
            busVarA = burVar.a();
        }
        int i2 = busVarA.H;
        float f2 = busVarA.I;
        throw null;
    }
}
