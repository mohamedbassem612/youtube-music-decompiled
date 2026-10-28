package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class vm {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;
    public static Boolean n;
    public static Boolean o;

    public vm(int i) {
        azs.i(i, 1, 3, "Embedding search metric type");
    }

    public static Bundle d(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.unmarshall(bArrMarshall, 0, bArrMarshall.length);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readBundle(vm.class.getClassLoader());
        } finally {
            parcelObtain.recycle();
        }
    }

    public static int e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd();
        }
        return 0;
    }

    public static int f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static int g(View view) {
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    public static int h(View view) {
        return f(view) + e(view);
    }

    public static int i(View view) {
        return view.getMeasuredWidth() + h(view);
    }

    public static boolean j(Map map, sl slVar, tb tbVar, int i) {
        si siVar;
        if (slVar == null) {
            return false;
        }
        if (i == tbVar.a()) {
            return slVar.a.equals("builtin:Account");
        }
        String str = tbVar.b(i).a;
        List listB = slVar.b();
        int i2 = 0;
        while (true) {
            if (i2 >= listB.size()) {
                siVar = null;
                break;
            }
            siVar = (si) listB.get(i2);
            if (siVar.g().equals(str)) {
                break;
            }
            i2++;
        }
        if (siVar == null || siVar.e() != 6) {
            return false;
        }
        return j(map, (sl) map.get(((sd) siVar).a()), tbVar, i + 1);
    }

    public static boolean k(Context context) {
        Intent intentPutExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null) {
                ApplicationInfo applicationInfo = activityInfo.applicationInfo;
                if ((applicationInfo.flags & 129) != 0) {
                    intentPutExtra.setPackage(applicationInfo.packageName);
                    context.startActivity(intentPutExtra);
                    return true;
                }
            }
        }
        return false;
    }

    public static int l(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i < i2 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        if (typedValue.type == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (typedValue.type != 6) {
                return -2;
            }
            fraction = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
        }
        return (int) fraction;
    }

    public static boolean m(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean n(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean o(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        Boolean boolValueOf = a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || n(resources));
            a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean p(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = e;
        if (boolValueOf == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            e = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean q(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final int describeContents() {
        return 0;
    }

    public vm(byte[] bArr) {
    }

    private vm() {
    }
}
