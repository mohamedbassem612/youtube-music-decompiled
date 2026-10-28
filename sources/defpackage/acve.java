package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acve {
    public final xgm c;
    public final int d;
    public boolean e;
    public boolean f;
    public final hno g;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    private final PointF h = new PointF();

    public acve(Context context, xgm xgmVar, hno hnoVar) {
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = xgmVar;
        this.g = hnoVar;
    }

    public static float a(PointF pointF, PointF pointF2) {
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        return (f * f) + (f2 * f2);
    }

    public static argn b(int i) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        return (argn) aihfVarCreateBuilder.build();
    }

    public final void c(float f, float f2) {
        if (this.e) {
            PointF pointF = this.h;
            pointF.set(f, f2);
            PointF pointF2 = this.a;
            PointF pointF3 = this.b;
            if (a(pointF2, pointF) > a(pointF2, pointF3)) {
                pointF3.set(pointF);
            }
        }
    }
}
