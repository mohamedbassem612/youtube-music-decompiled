package defpackage;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.window.sidecar.SidecarProvider;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azw {
    public azw() {
    }

    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean f(View view) {
        return view.isScreenReaderFocusable();
    }

    public static ActionMode.Callback g(ActionMode.Callback callback) {
        return callback instanceof bdd ? ((bdd) callback).a : callback;
    }

    public static ActionMode.Callback h(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof bdd) || callback == null) ? callback : new bdd(callback, textView);
    }

    public static void i(TextView textView, int i) {
        azs.j(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void j(TextView textView, int i) {
        azs.j(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void k(TextView textView, int i) {
        azs.j(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void l(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            textView.setLineHeight(i, f);
        } else {
            k(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static biw m(Object obj, long j) {
        return (biw) bke.f(obj, j);
    }

    public static List n(Object obj, long j) {
        biw biwVarM = m(obj, j);
        if (biwVarM.c()) {
            return biwVarM;
        }
        int size = biwVarM.size();
        biw biwVarD = biwVarM.d(size == 0 ? 10 : size << 1);
        bke.q(obj, j, biwVarD);
        return biwVarD;
    }

    public static bin o(Object obj) {
        return ((bir) obj).extensions;
    }

    public static void p(Object obj) {
        throw null;
    }

    public static void q(Object obj) {
        o(obj).c();
    }

    public static dyg r() {
        if (Build.VERSION.SDK_INT >= 34) {
            return dyi.b;
        }
        return Build.VERSION.SDK_INT >= 30 ? dyh.a : dyi.a;
    }

    public static IBinder s(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static dwl t() {
        String strGroup;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion) || apiVersion == null || awrc.v(apiVersion)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return null;
            }
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                return null;
            }
            int i2 = Integer.parseInt(strGroup2);
            String strGroup3 = matcher.group(3);
            if (strGroup3 == null) {
                return null;
            }
            int i3 = Integer.parseInt(strGroup3);
            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
            strGroup4.getClass();
            return new dwl(i, i2, i3, strGroup4);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }

    public boolean x(int i) {
        throw null;
    }

    public azw(byte[] bArr) {
    }

    public void u(int i) {
    }

    public void w(int i) {
    }

    public void v(int i, float f, int i2) {
    }
}
