package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.NetworkRequest;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qa {
    public static volatile elr t;
    public static volatile elq u;

    public qa(short[] sArr) {
        new HashMap();
    }

    public static int B(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500 || (i > 480 && i2 > 640)) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public static void C(Context context) {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static int D(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float fM = m(((i >> 16) & 255) / 255.0f);
        float fM2 = m(((i >> 8) & 255) / 255.0f);
        float fM3 = m((i & 255) / 255.0f);
        float fM4 = fM + ((m(((i2 >> 16) & 255) / 255.0f) - fM) * f);
        float fM5 = fM2 + ((m(((i2 >> 8) & 255) / 255.0f) - fM2) * f);
        float fM6 = fM3 + (f * (m((i2 & 255) / 255.0f) - fM3));
        return (Math.round((f2 + f3) * 255.0f) << 24) | (Math.round(o(fM4) * 255.0f) << 16) | (Math.round(o(fM5) * 255.0f) << 8) | Math.round(o(fM6) * 255.0f);
    }

    public static ejz E(emz emzVar, egy egyVar) {
        return new ejz(emi.a(emzVar, egyVar, 1.0f, ema.b, false));
    }

    public static eka F(emz emzVar, egy egyVar, boolean z) {
        float f;
        if (z) {
            ThreadLocal threadLocal = enm.a;
            f = Resources.getSystem().getDisplayMetrics().density;
        } else {
            f = 1.0f;
        }
        return new eka(emi.a(emzVar, egyVar, f, ema.a, false));
    }

    public static ekb G(emz emzVar, egy egyVar, int i) {
        return new ekb(emi.a(emzVar, egyVar, 1.0f, new emd(i), false));
    }

    public static ekc H(emz emzVar, egy egyVar) {
        return new ekc(emi.a(emzVar, egyVar, 1.0f, ema.c, false));
    }

    public static eke I(emz emzVar, egy egyVar) {
        ThreadLocal threadLocal = enm.a;
        return new eke(emi.a(emzVar, egyVar, Resources.getSystem().getDisplayMetrics().density, ema.e, true));
    }

    public static Paint.Join J(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? Paint.Join.BEVEL : Paint.Join.ROUND;
        }
        return Paint.Join.MITER;
    }

    public static Paint.Cap K(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    public static int[] L() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    }

    public static int[] M(NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            int[] capabilities = networkRequest.getCapabilities();
            capabilities.getClass();
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            int[] iArr2 = efn.a;
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return atqq.az(arrayList);
    }

    private static float m(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float o(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int x(oe oeVar, nd ndVar, View view, View view2, np npVar, boolean z) {
        if (npVar.getChildCount() == 0 || oeVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(npVar.getPosition(view) - npVar.getPosition(view2)) + 1;
        }
        return Math.min(ndVar.k(), ndVar.a(view2) - ndVar.d(view));
    }

    public static int y(oe oeVar, nd ndVar, View view, View view2, np npVar, boolean z, boolean z2) {
        if (npVar.getChildCount() == 0 || oeVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (oeVar.a() - Math.max(npVar.getPosition(view), npVar.getPosition(view2))) - 1) : Math.max(0, Math.min(npVar.getPosition(view), npVar.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(ndVar.a(view2) - ndVar.d(view)) / (Math.abs(npVar.getPosition(view) - npVar.getPosition(view2)) + 1))) + (ndVar.j() - ndVar.d(view)));
        }
        return iMax;
    }

    public static int z(oe oeVar, nd ndVar, View view, View view2, np npVar, boolean z) {
        if (npVar.getChildCount() == 0 || oeVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return oeVar.a();
        }
        return (int) (((ndVar.a(view2) - ndVar.d(view)) / (Math.abs(npVar.getPosition(view) - npVar.getPosition(view2)) + 1)) * oeVar.a());
    }

    public void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        ((nq) view.getLayoutParams()).gL();
        rect.set(0, 0, 0, 0);
    }

    public EdgeEffect fP(RecyclerView recyclerView) {
        throw null;
    }

    public void fR(int i, int i2, Object obj) {
        A(i, i2);
    }

    public void fV(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) lj.d(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }

    public boolean fW(TextView textView) {
        return ((Boolean) lj.d(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }

    public qa(byte[] bArr) {
    }

    public qa() {
    }

    public void fQ() {
    }

    public void A(int i, int i2) {
    }

    public void d(Canvas canvas, RecyclerView recyclerView) {
    }

    public void fO(RecyclerView recyclerView, int i) {
    }

    public void fS(int i, int i2) {
    }

    public void fT(int i, int i2) {
    }

    public void fU(int i, int i2) {
    }

    public void n(Canvas canvas, RecyclerView recyclerView) {
    }

    public void e(RecyclerView recyclerView, int i, int i2) {
    }
}
