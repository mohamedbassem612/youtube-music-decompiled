package defpackage;

import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ely implements emw {
    public static final ely a = new ely();
    private static final boy b = boy.s("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.emw
    public final /* synthetic */ Object a(emz emzVar, float f) {
        emzVar.h();
        String strF = null;
        String strF2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        boolean zO = true;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            int i = 3;
            while (emzVar.n()) {
                switch (emzVar.q(b)) {
                    case 0:
                        strF = emzVar.f();
                        break;
                    case 1:
                        strF2 = emzVar.f();
                        break;
                    case 2:
                        fA = (float) emzVar.a();
                        break;
                    case 3:
                        int iB4 = emzVar.b();
                        if (iB4 <= 2 && iB4 >= 0) {
                            i = afxw.p()[iB4];
                        }
                        break;
                    case 4:
                        iB = emzVar.b();
                        break;
                    case 5:
                        fA2 = (float) emzVar.a();
                        break;
                    case 6:
                        fA3 = (float) emzVar.a();
                        break;
                    case 7:
                        iB2 = emg.b(emzVar);
                        break;
                    case 8:
                        iB3 = emg.b(emzVar);
                        break;
                    case 9:
                        fA4 = (float) emzVar.a();
                        break;
                    case 10:
                        zO = emzVar.o();
                        break;
                    case 11:
                        emzVar.g();
                        PointF pointF3 = new PointF(((float) emzVar.a()) * f, ((float) emzVar.a()) * f);
                        emzVar.i();
                        pointF = pointF3;
                        break;
                    case 12:
                        emzVar.g();
                        PointF pointF4 = new PointF(((float) emzVar.a()) * f, ((float) emzVar.a()) * f);
                        emzVar.i();
                        pointF2 = pointF4;
                        break;
                    default:
                        emzVar.l();
                        emzVar.m();
                        break;
                }
            }
            emzVar.j();
            return new ejs(strF, strF2, fA, i, iB, fA2, fA3, iB2, iB3, fA4, zO, pointF, pointF2);
        }
    }
}
