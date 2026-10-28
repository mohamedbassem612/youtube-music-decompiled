package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enh {
    public static final /* synthetic */ int a = 0;
    private static final PointF b = new PointF();

    static int a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static PointF b(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void c(ekx ekxVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = ekxVar.b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = b;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            List list = ekxVar.a;
            if (i >= list.size()) {
                break;
            }
            ejr ejrVar = (ejr) list.get(i);
            PointF pointF3 = ejrVar.a;
            PointF pointF4 = ejrVar.b;
            PointF pointF5 = ejrVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (ekxVar.c) {
            path3.close();
        }
    }

    public static void d(ejv ejvVar, int i, List list, ejv ejvVar2, eii eiiVar) {
        if (ejvVar.d(eiiVar.g(), i)) {
            list.add(ejvVar2.b(eiiVar.g()).c(eiiVar));
        }
    }
}
