package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inspector.WindowInspector;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twm {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/util/DisplayUtil");
    static final Comparator b = Comparator$EL.thenComparing(Comparator$CC.comparingInt(new crt(2)), new rmm(5));
    public static int c;
    private static int d;

    public static float a(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return f * displayMetrics.density;
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return (f / displayMetrics.density) + 0.5f;
    }

    public static int c(DisplayMetrics displayMetrics, int i) {
        displayMetrics.getClass();
        return (int) (((double) (i * displayMetrics.density)) + 0.5d);
    }

    public static int d(Context context) {
        if (d == 0) {
            s(context);
        }
        return d;
    }

    public static int e(WindowManager windowManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int f(Context context) {
        context.getClass();
        return m(context.getResources().getDisplayMetrics(), g(context));
    }

    public static int g(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int h(Context context) {
        context.getClass();
        return m(context.getResources().getDisplayMetrics(), i(context));
    }

    public static int i(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int j() {
        Pair pairQ = q();
        if (pairQ == null) {
            return 0;
        }
        return Math.min(((Integer) pairQ.first).intValue(), ((Integer) pairQ.second).intValue());
    }

    public static int k(Context context) {
        if (taq.K(context)) {
            return 3;
        }
        return l(context.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp);
    }

    public static int l(int i) {
        if (i == 0) {
            return 0;
        }
        if (i < 480) {
            return 1;
        }
        if (i < 600) {
            return 2;
        }
        return i < 720 ? 3 : 4;
    }

    public static int m(DisplayMetrics displayMetrics, int i) {
        displayMetrics.getClass();
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public static Bitmap n(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.RGB_565, false);
        if (i == 0) {
            return bitmapCopy;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        while (((width * height) << 1) > i) {
            width /= 2;
            height /= 2;
        }
        return width != bitmapCopy.getWidth() ? Bitmap.createScaledBitmap(bitmapCopy, width, height, true) : bitmapCopy;
    }

    public static Pair o(Context context) {
        DisplayMetrics displayMetricsY = y(context);
        return Pair.create(Integer.valueOf(displayMetricsY.widthPixels), Integer.valueOf(displayMetricsY.heightPixels));
    }

    public static Pair p(Context context) {
        context.getClass();
        Pair pairQ = q();
        return pairQ == null ? o(context) : pairQ;
    }

    public static Pair q() {
        String strA = tyr.a("sys.display-size");
        if (strA != null) {
            String[] strArrSplit = strA.split("x");
            if (strArrSplit.length == 2) {
                try {
                    return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void r(Canvas canvas, View view, List list) {
        if (list.isEmpty()) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            View view2 = (View) agqsVarListIterator.next();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                if ((layoutParams2.flags & 2) != 0) {
                    canvas.drawColor(((int) (layoutParams2.dimAmount * 255.0f)) << 24);
                }
            }
            view2.getLocationOnScreen(iArr2);
            canvas.save();
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            view2.draw(canvas);
            canvas.restore();
        }
    }

    public static void s(Context context) {
        DisplayMetrics displayMetricsY = y(context);
        d = Math.min(displayMetricsY.widthPixels, displayMetricsY.heightPixels);
        c = Math.max(displayMetricsY.widthPixels, displayMetricsY.heightPixels);
    }

    @Deprecated
    public static boolean t(Context context) {
        int iK = k(context);
        return iK == 3 || iK == 4;
    }

    public static boolean u(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 720;
    }

    public static boolean v(Context context) {
        if (taq.K(context)) {
            return true;
        }
        return w(context.getResources().getConfiguration());
    }

    public static boolean w(Configuration configuration) {
        return configuration.smallestScreenWidthDp >= 600;
    }

    public static ListenableFuture x(final Activity activity, boolean z, final boolean z2) {
        agke agkeVarB;
        Bitmap bitmapN;
        if (activity == null || activity.getWindow() == null || activity.getWindow().peekDecorView() == null) {
            return ahng.m(new RuntimeException("Couldn't obtain root view for screenshot"));
        }
        final View rootView = activity.getWindow().getDecorView().getRootView();
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            return ahng.m(new RuntimeException("Activity root view width or height is <= 0"));
        }
        if (!z2 || Build.VERSION.SDK_INT < 29) {
            agkeVarB = agpi.a;
        } else {
            View viewPeekDecorView = activity.getWindow().peekDecorView();
            agjz agjzVar = new agjz(4);
            for (View view : WindowInspector.getGlobalWindowViews()) {
                if (!view.equals(viewPeekDecorView) && (viewPeekDecorView == null || !view.equals(viewPeekDecorView.getRootView()))) {
                    if (view.getWindowVisibility() == 0 || view.isShown()) {
                        if (view.getWidth() > 0 && view.getHeight() > 0) {
                            Context context = view.getContext();
                            while (context instanceof ContextWrapper) {
                                ContextWrapper contextWrapper = (ContextWrapper) context;
                                if (contextWrapper == activity) {
                                    agjzVar.h(view);
                                    break;
                                }
                                context = contextWrapper.getBaseContext();
                            }
                        }
                    }
                }
            }
            agkeVarB = agke.B(b, agjzVar.g());
        }
        final agke agkeVar = agkeVarB;
        if (z) {
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            return ape.f(new aqk() { // from class: twk
                @Override // defpackage.aqk
                public final Object a(aqi aqiVar) {
                    agrf agrfVar = twm.a;
                    boolean z3 = z2;
                    Bitmap bitmap = bitmapCreateBitmap;
                    View view2 = rootView;
                    PixelCopy.request(activity.getWindow(), bitmap, new twl(aqiVar, z3, bitmap, view2, agkeVar), view2.getHandler());
                    return "getCurrentScreenshotAsync";
                }
            });
        }
        if (z2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            rootView.draw(canvas);
            r(canvas, rootView, agkeVar);
            bitmapN = n(bitmapCreateBitmap2, 1048576);
        } else {
            boolean zIsDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
            rootView.setDrawingCacheEnabled(true);
            bitmapN = rootView.getDrawingCache();
            if (bitmapN != null) {
                bitmapN = n(bitmapN, 1048576);
            }
            if (!zIsDrawingCacheEnabled) {
                rootView.setDrawingCacheEnabled(false);
                rootView.destroyDrawingCache();
            }
        }
        return bitmapN != null ? ahng.n(bitmapN) : ahng.m(new RuntimeException("Couldn't obtain software screenshot"));
    }

    private static DisplayMetrics y(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
