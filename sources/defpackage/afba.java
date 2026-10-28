package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afba {
    public afba() {
    }

    public static void A(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void B(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean C(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static ColorStateList D(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !alj$$ExternalSyntheticApiModelOutline0.m97m((Object) drawable)) {
            return null;
        }
        return alj$$ExternalSyntheticApiModelOutline0.m((Object) drawable).getColorStateList();
    }

    public static void E(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            aewp.a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                aewo.e(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            aewo.e(outline, path);
        }
    }

    public static void F(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    public static Drawable G(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            return drawableMutate;
        }
        drawableMutate.setTintMode(mode);
        return drawableMutate;
    }

    public static int H(int i, int i2) {
        return avv.f(i, (Color.alpha(i) * i2) / 255);
    }

    public static int I(View view, int i) {
        return M(view.getContext(), v(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int J(Context context, int i, int i2) {
        TypedValue typedValueU = u(context.getTheme(), i);
        Integer numValueOf = typedValueU != null ? Integer.valueOf(M(context, typedValueU)) : null;
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int K(Context context, int i, String str) {
        return M(context, v(context, i, str));
    }

    public static int L(int i, int i2, float f) {
        return avv.e(avv.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int M(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    public static ColorStateList N(Context context, int i) {
        TypedValue typedValueT = t(context, i);
        if (typedValueT != null) {
            if (typedValueT.resourceId != 0) {
                return avg.d(context, typedValueT.resourceId);
            }
            if (typedValueT.data != 0) {
                return ColorStateList.valueOf(typedValueT.data);
            }
        }
        return null;
    }

    public static boolean O(int i) {
        if (i != 0) {
            double[] dArrI = avv.i();
            avv.h(Color.red(i), Color.green(i), Color.blue(i), dArrI);
            if (dArrI[1] / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    public static File P(aess aessVar, aesv aesvVar) {
        return new File(new File(((Context) aessVar.c).getCacheDir(), aesvVar.f), aessVar.a + '_' + aesvVar.e);
    }

    public static File Q(aess aessVar, aesv aesvVar, long j) {
        return new File(new File(((Context) aessVar.c).getCacheDir(), aesvVar.f), aessVar.a + '_' + j + '_' + aesvVar.e);
    }

    public static List R(aess aessVar, aesv aesvVar, final boolean z) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        File file = new File(((Context) aessVar.c).getCacheDir(), aesvVar.f);
        try {
            fileArrListFiles = file.listFiles();
        } catch (SecurityException e) {
            T(String.format("TerminationJournal !journals '%s'", file), e);
            fileArrListFiles = null;
        }
        if (fileArrListFiles != null) {
            Collections.addAll(arrayList, fileArrListFiles);
        }
        final File fileP = P(aessVar, aesvVar);
        final String string = Long.toString(aessVar.a);
        Collection.EL.removeIf(arrayList, new Predicate() { // from class: aest
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final /* synthetic */ Predicate mo841negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                File file2 = (File) obj;
                if (file2.getName().equals(fileP.getName())) {
                    return true;
                }
                if (z) {
                    if (file2.getName().contains(string)) {
                        return true;
                    }
                }
                return false;
            }
        });
        return arrayList;
    }

    public static void S(File file) {
        tym.n(file, new aesu(0));
    }

    public static void T(String str, Throwable th) {
        String strZ = ahno.Z(str);
        zvn zvnVar = zvn.a;
        if (th == null) {
            zvp.a(zvnVar, zvm.B, strZ);
        } else {
            zvp.b(zvnVar, zvm.B, strZ, th);
        }
    }

    public static void U(aess aessVar, MessageLite messageLite, aesv aesvVar) {
        V(messageLite, P(aessVar, aesvVar));
    }

    public static void V(MessageLite messageLite, File file) {
        try {
            OutputStream outputStreamS = tym.s(file);
            try {
                messageLite.writeTo(outputStreamS);
                outputStreamS.close();
            } catch (Throwable th) {
                try {
                    outputStreamS.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            S(file);
            T(String.format("TerminationJournal !write '%s'", file), e);
        }
    }

    public static int W(int i) {
        return ThreadLocalRandom.current().nextInt(i);
    }

    public static qhx X(int i, qic qicVar) {
        xlf xlfVarD = qhx.d();
        xlfVarD.a = 3;
        if (qicVar != null) {
            xlfVarD.e = qicVar;
        }
        if (i > 0) {
            xlfVarD.e(i);
        }
        return xlfVarD.d();
    }

    public static ColorStateList Y(Context context, ahto ahtoVar, int i) {
        int iZ;
        ColorStateList colorStateListD;
        return (!ahtoVar.H(i) || (iZ = ahtoVar.z(i, 0)) == 0 || (colorStateListD = avg.d(context, iZ)) == null) ? ahtoVar.A(i) : colorStateListD;
    }

    private static float Z(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String aa(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean ab(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static Typeface d(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight() + configuration.fontWeightAdjustment;
        if (weight <= 0) {
            weight = 1;
        } else if (weight > 1000) {
            weight = 1000;
        }
        return Typeface.create(typeface, weight, typeface.isItalic());
    }

    public static int e(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static ColorStateList f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA = avt.a(context.getResources(), resourceId, context.getTheme())) == null) ? typedArray.getColorStateList(i) : colorStateListA;
    }

    public static Drawable g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableC;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableC = ok.e().c(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableC;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static dd j(aunr aunrVar) {
        int iD = aunrVar.d() - 1;
        if (iD == 0) {
            dd supportFragmentManager = ((cf) aunrVar.a()).getSupportFragmentManager();
            supportFragmentManager.getClass();
            return supportFragmentManager;
        }
        if (iD != 1) {
            dd childFragmentManager = aunrVar.b().getChildFragmentManager();
            childFragmentManager.getClass();
            return childFragmentManager;
        }
        dd ddVarA = aunrVar.e().a();
        ddVarA.getClass();
        return ddVarA;
    }

    public static RectF l(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.w || !(view instanceof afdm)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        afdm afdmVar = (afdm) view;
        View[] viewArr = {afdmVar.a, afdmVar.b, afdmVar.c};
        int right = 0;
        int left = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                if (z) {
                    left = Math.min(left, view2.getLeft());
                    right = Math.max(right, view2.getRight());
                } else {
                    left = view2.getLeft();
                    right = view2.getRight();
                }
                z = true;
            }
        }
        int i2 = right - left;
        View[] viewArr2 = {afdmVar.a, afdmVar.b, afdmVar.c};
        int bottom = 0;
        int top = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                if (z2) {
                    top = Math.min(top, view3.getTop());
                    bottom = Math.max(bottom, view3.getBottom());
                } else {
                    top = view3.getTop();
                    bottom = view3.getBottom();
                }
                z2 = true;
            }
        }
        int i4 = bottom - top;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, afdmVar.getContext().getResources().getDisplayMetrics());
        if (i2 < iApplyDimension) {
            i2 = iApplyDimension;
        }
        int left2 = (afdmVar.getLeft() + afdmVar.getRight()) / 2;
        int top2 = (afdmVar.getTop() + afdmVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new RectF(left2 - i5, top2 - (i4 / 2), left2 + i5, (left2 / 2) + top2);
    }

    public static void n(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof afbe) {
            ((afbe) background).p(f);
        }
    }

    public static void o(View view) {
        Drawable background = view.getBackground();
        if (background instanceof afbe) {
            p(view, (afbe) background);
        }
    }

    public static void p(View view, afbe afbeVar) {
        aewq aewqVar = afbeVar.a.b;
        if (aewqVar == null || !aewqVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        afbc afbcVar = afbeVar.a;
        if (afbcVar.n != elevation) {
            afbcVar.n = elevation;
            afbeVar.x();
        }
    }

    public static afba q(int i) {
        return i != 1 ? new afbi() : new afaz();
    }

    public static int r(Context context, int i, int i2) {
        return s(context.getTheme(), i, i2);
    }

    public static int s(Resources.Theme theme, int i, int i2) {
        TypedValue typedValueU = u(theme, i);
        return (typedValueU == null || typedValueU.type != 16) ? i2 : typedValueU.data;
    }

    public static TypedValue t(Context context, int i) {
        return u(context.getTheme(), i);
    }

    public static TypedValue u(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue v(Context context, int i, String str) {
        TypedValue typedValueT = t(context, i);
        if (typedValueT != null) {
            return typedValueT;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean w(Context context, int i, boolean z) {
        return x(context.getTheme(), i, z);
    }

    public static boolean x(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueU = u(theme, i);
        if (typedValueU == null || typedValueU.type != 18) {
            return z;
        }
        return typedValueU.data != 0;
    }

    public static TimeInterpolator y(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!ab(strValueOf, "cubic-bezier") && !ab(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (ab(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = aa(strValueOf, "cubic-bezier").split(",");
            int length = strArrSplit.length;
            if (length == 4) {
                return new PathInterpolator(Z(strArrSplit, 0), Z(strArrSplit, 1), Z(strArrSplit, 2), Z(strArrSplit, 3));
            }
            throw new IllegalArgumentException(a.bR(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
        }
        if (!ab(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String strAa = aa(strValueOf, "path");
        Path path = new Path();
        try {
            avd.a(avd.b(strAa), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(strAa)), e);
        }
    }

    public static ViewGroup z(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public void b(float f, float f2, float f3, afbu afbuVar) {
        afbuVar.d(f, 0.0f);
    }

    public boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(dd ddVar) {
        try {
            ddVar.ae(null, -1, 1);
            List<cc> listK = ddVar.k();
            listK.getClass();
            if (listK.isEmpty()) {
                return;
            }
            av avVar = new av(ddVar);
            for (cc ccVar : listK) {
                if (ccVar instanceof auph) {
                    Object objGeneratedComponent = ((auph) ccVar).generatedComponent();
                    objGeneratedComponent.getClass();
                    if (objGeneratedComponent instanceof afgv) {
                        avVar.l(ccVar);
                    }
                }
                dd childFragmentManager = ccVar.getChildFragmentManager();
                childFragmentManager.getClass();
                childFragmentManager.ah();
                k(childFragmentManager);
            }
            if (avVar.j()) {
                return;
            }
            avVar.r();
            avVar.e();
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            ddVar.H("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((agrc) ((agrc) afgw.a.b()).j(e).k("com/google/apps/tiktok/account/api/controller/ActivityAccountState$Companion", "clearFragments", 319, "ActivityAccountState.kt")).w("popBackStackImmediate failure, fragment state %s", new ahve(ahvd.a, stringWriter.toString()));
            throw e;
        }
    }

    public void m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFL = l(tabLayout, view);
        RectF rectFL2 = l(tabLayout, view2);
        drawable.setBounds(aetz.b((int) rectFL.left, (int) rectFL2.left, f), drawable.getBounds().top, aetz.b((int) rectFL.right, (int) rectFL2.right, f), drawable.getBounds().bottom);
    }

    public afba(char[] cArr) {
    }

    public void a(afbu afbuVar, float f, float f2) {
    }
}
