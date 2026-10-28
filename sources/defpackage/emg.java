package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class emg {
    private static final boy a = boy.s("x", "y");

    static float a(emz emzVar) {
        int iP = emzVar.p();
        int i = iP - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) emzVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(a.aH(iP)));
        }
        emzVar.g();
        float fA = (float) emzVar.a();
        while (emzVar.n()) {
            emzVar.m();
        }
        emzVar.i();
        return fA;
    }

    static int b(emz emzVar) {
        emzVar.g();
        double dA = emzVar.a() * 255.0d;
        double dA2 = emzVar.a() * 255.0d;
        double dA3 = emzVar.a() * 255.0d;
        while (emzVar.n()) {
            emzVar.m();
        }
        int i = (int) dA2;
        int i2 = (int) dA;
        emzVar.i();
        return Color.argb(255, i2, i, (int) dA3);
    }

    static PointF c(emz emzVar, float f) {
        int iP = emzVar.p() - 1;
        if (iP == 0) {
            emzVar.g();
            float fA = (float) emzVar.a();
            float fA2 = (float) emzVar.a();
            while (emzVar.p() != 2) {
                emzVar.m();
            }
            emzVar.i();
            return new PointF(fA * f, fA2 * f);
        }
        if (iP != 2) {
            if (iP != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(a.aH(emzVar.p())));
            }
            float fA3 = (float) emzVar.a();
            float fA4 = (float) emzVar.a();
            while (emzVar.n()) {
                emzVar.m();
            }
            return new PointF(fA3 * f, fA4 * f);
        }
        emzVar.h();
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        while (emzVar.n()) {
            int iQ = emzVar.q(a);
            if (iQ == 0) {
                fA5 = a(emzVar);
            } else if (iQ != 1) {
                emzVar.l();
                emzVar.m();
            } else {
                fA6 = a(emzVar);
            }
        }
        emzVar.j();
        return new PointF(fA5 * f, fA6 * f);
    }

    static List d(emz emzVar, float f) {
        ArrayList arrayList = new ArrayList();
        emzVar.g();
        while (emzVar.p() == 1) {
            emzVar.g();
            arrayList.add(c(emzVar, f));
            emzVar.i();
        }
        emzVar.i();
        return arrayList;
    }
}
