package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.WindowInsets;
import android.widget.ImageView;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nsf {
    public nsf(byte[] bArr) {
        new WeakHashMap();
    }

    public static void a(Spannable spannable, float f, float f2, float f3, int i) {
        if (spannable.length() != 0) {
            for (vxj vxjVar : (vxj[]) spannable.getSpans(0, spannable.length(), vxj.class)) {
                ajwo ajwoVar = vxjVar.c;
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        String str = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
                        if (!str.isEmpty()) {
                            int spanStart = spannable.getSpanStart(vxjVar);
                            int spanEnd = spannable.getSpanEnd(vxjVar);
                            if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                                spannable.setSpan(new adta(str, f, f2, f3, i, false), spanStart, spanEnd, 33);
                            }
                        }
                    }
                }
            }
            for (Object obj : (vxj[]) spannable.getSpans(0, spannable.length(), vxj.class)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void b(ImageView imageView, Drawable drawable, aljj aljjVar) {
        if (imageView == null || drawable == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF(0.0f, 0.0f, imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        rectF.set(((float) aljjVar.c) * drawable.getIntrinsicWidth(), ((float) aljjVar.d) * drawable.getIntrinsicHeight(), ((float) aljjVar.e) * drawable.getIntrinsicWidth(), ((float) aljjVar.f) * drawable.getIntrinsicHeight());
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        imageView.setImageMatrix(matrix);
    }

    public static int c(WindowInsets windowInsets) {
        int i = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
        int i2 = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    public static final void d(Object obj, adkz adkzVar, adwk adwkVar, advj advjVar) {
        obj.getClass();
        if (adkzVar == null || advjVar == null) {
            return;
        }
        int iA = adkzVar.a();
        int iL = l(obj) - 1;
        ajka ajkaVar = null;
        int i = 0;
        for (int i2 = 0; i2 < iA; i2++) {
            Object objD = adkzVar.d(i2);
            if (objD instanceof ajzb) {
                i = -1;
            } else if (objD instanceof ajka) {
                ajkaVar = (ajka) objD;
            } else if (iL >= l(objD) - 1) {
                advjVar.u(obj, i2 + i);
                k(ajkaVar, adwkVar);
                return;
            }
        }
        advjVar.E(obj);
        k(ajkaVar, adwkVar);
    }

    public static int e(int i) {
        int i2;
        if (i >= 0) {
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            i2 = (int) (j / 1000);
        } else {
            i2 = -1;
        }
        if (i2 < 0) {
            return 5000;
        }
        return (int) TimeUnit.MILLISECONDS.convert(i2, TimeUnit.SECONDS);
    }

    public static int f(wiu wiuVar) {
        int i;
        aoqd aoqdVar = wiuVar.d;
        if ((aoqdVar.b & 8388608) != 0) {
            aivq aivqVar = aoqdVar.q;
            if (aivqVar == null) {
                aivqVar = aivq.a;
            }
            i = aivqVar.b;
        } else {
            i = -1;
        }
        return e(i);
    }

    public static boolean g(int i, long j, int i2) {
        return i > 7 && j >= ((long) i2);
    }

    public static boolean h(wja wjaVar) {
        if (wjaVar == null) {
            return false;
        }
        int i = 0;
        while (true) {
            List list = wjaVar.r;
            if (i >= list.size()) {
                return false;
            }
            wgs wgsVar = (wgs) list.get(i);
            if (wgsVar.d() > 0 && wgsVar.i() > 0) {
                float fI = wgsVar.i() / wgsVar.d();
                if (fI >= 0.99f && fI <= 1.01f) {
                    return true;
                }
            }
            i++;
        }
    }

    public static boolean i(wja wjaVar) {
        if (wjaVar == null) {
            return false;
        }
        int i = 0;
        while (true) {
            List list = wjaVar.r;
            if (i >= list.size()) {
                return false;
            }
            wgs wgsVar = (wgs) list.get(i);
            if (wgsVar.d() > 0 && wgsVar.i() > 0 && wgsVar.i() / wgsVar.d() < 0.99f) {
                return true;
            }
            i++;
        }
    }

    public static atqo j() {
        return new atqo();
    }

    private static final void k(ajka ajkaVar, adwk adwkVar) {
        if (ajkaVar == null || adwkVar == null) {
            return;
        }
        adwkVar.l(ajkaVar);
    }

    private static int l(Object obj) {
        if (obj instanceof ajza) {
            int iAr = afxw.ar(((ajza) obj).j);
            if (iAr != 0) {
                return iAr;
            }
        } else {
            if (obj instanceof acxm) {
                return m(((acxm) obj).a);
            }
            if (obj instanceof akrn) {
                return m((akrn) obj);
            }
        }
        return 1;
    }

    private static int m(akrn akrnVar) {
        akro akroVar = akrnVar.c;
        if (akroVar == null) {
            akroVar = akro.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrm.b);
        akroVar.c(aihlVarCheckIsLite);
        Object objK = akroVar.j.k(aihlVarCheckIsLite.d);
        int iAr = afxw.ar(((akrm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
        if (iAr == 0) {
            return 1;
        }
        return iAr;
    }

    public /* synthetic */ nsf() {
    }
}
