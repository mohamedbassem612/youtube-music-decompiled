package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lj {
    private static final RectF j = new RectF();
    private static final ConcurrentHashMap k = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final TextView h;
    public final Context i;
    private TextPaint l;
    private final qa m;

    public lj(TextView textView) {
        this.h = textView;
        this.i = textView.getContext();
        this.m = Build.VERSION.SDK_INT >= 29 ? new li() : new qa((byte[]) null);
    }

    public static Object d(Object obj, String str, Object obj2) {
        try {
            Object objInvoke = m(str).invoke(obj, null);
            if (objInvoke == null) {
                return null;
            }
            return objInvoke;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", a.bT(str, "Failed to invoke TextView#", "() method"), e);
            return obj2;
        }
    }

    public static final int[] l(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    Integer numValueOf = Integer.valueOf(i);
                    if (Collections.binarySearch(arrayList, numValueOf) < 0) {
                        arrayList.add(numValueOf);
                    }
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private static Method m(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = k;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", a.bT(str, "Failed to retrieve TextView#", "() method"), e);
            return null;
        }
    }

    final int a() {
        return Math.round(this.e);
    }

    final int b() {
        return Math.round(this.d);
    }

    final int c() {
        return Math.round(this.c);
    }

    final void e() {
        CharSequence transformation;
        if (h()) {
            if (this.b) {
                TextView textView = this.h;
                if (textView.getMeasuredHeight() <= 0 || textView.getMeasuredWidth() <= 0) {
                    return;
                }
                qa qaVar = this.m;
                int measuredWidth = qaVar.fW(textView) ? 1048576 : (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
                int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    int length = this.f.length;
                    if (length == 0) {
                        throw new IllegalStateException("No available text sizes to choose from.");
                    }
                    int i = length - 1;
                    int i2 = 1;
                    int i3 = 0;
                    while (i2 <= i) {
                        int i4 = (i2 + i) / 2;
                        int i5 = this.f[i4];
                        CharSequence text = textView.getText();
                        TransformationMethod transformationMethod = textView.getTransformationMethod();
                        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                            text = transformation;
                        }
                        int maxLines = textView.getMaxLines();
                        TextPaint textPaint = this.l;
                        if (textPaint == null) {
                            this.l = new TextPaint();
                        } else {
                            textPaint.reset();
                        }
                        this.l.set(textView.getPaint());
                        this.l.setTextSize(i5);
                        Layout.Alignment alignment = (Layout.Alignment) d(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.l, Math.round(rectF.right));
                        builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Alert.DURATION_SHOW_INDEFINITELY : maxLines);
                        try {
                            qaVar.fV(builderObtain, textView);
                        } catch (ClassCastException unused) {
                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                        }
                        StaticLayout staticLayoutBuild = builderObtain.build();
                        if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                            int i6 = i4 + 1;
                            i3 = i2;
                            i2 = i6;
                        } else {
                            i3 = i4 - 1;
                            i = i3;
                        }
                    }
                    float f = this.f[i3];
                    if (f != this.h.getTextSize()) {
                        f(0, f);
                    }
                }
            }
            this.b = true;
        }
    }

    final void f(int i, float f) {
        Context context = this.i;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.h;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    Method methodM = m("nullLayouts");
                    if (methodM != null) {
                        methodM.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                TextView textView2 = this.h;
                if (zIsInLayout) {
                    textView2.forceLayout();
                } else {
                    textView2.requestLayout();
                }
                this.h.invalidate();
            }
        }
    }

    public final void g(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.a = 1;
        this.d = f;
        this.e = f2;
        this.c = f3;
        this.g = false;
    }

    final boolean h() {
        return k() && this.a != 0;
    }

    public final boolean i() {
        boolean z = false;
        z = false;
        if (k() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int iFloor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.d + (i * this.c));
                }
                this.f = l(iArr);
            }
            z = true;
        }
        this.b = z;
        return z;
    }

    public final boolean j() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean k() {
        return !(this.h instanceof AppCompatEditText);
    }
}
