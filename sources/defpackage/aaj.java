package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aaj {
    public static final String a(String str) {
        return str.toLowerCase(Locale.US).replace(" ", "");
    }

    public static int b(Display display) {
        try {
            Object objInvoke = Display.class.getMethod("getType", null).invoke(display, null);
            objInvoke.getClass();
            return ((Integer) objInvoke).intValue();
        } catch (NoSuchMethodException unused) {
            return 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getResId();
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public static int d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getType();
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e3);
            return -1;
        }
    }

    public static Icon e(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        switch (iconCompat.b) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.i(), iconCompat.f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(iconCompat.c());
                } else {
                    if (context == null) {
                        Uri uriC = iconCompat.c();
                        Objects.toString(uriC);
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(uriC)));
                    }
                    InputStream inputStreamH = iconCompat.h(context);
                    if (inputStreamH == null) {
                        Uri uriC2 = iconCompat.c();
                        Objects.toString(uriC2);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(uriC2)));
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamH));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode == IconCompat.a) {
            return iconCreateWithBitmap;
        }
        iconCreateWithBitmap.setTintMode(mode);
        return iconCreateWithBitmap;
    }

    public static Uri f(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getUri();
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static IconCompat g(Object obj) {
        azs.l(obj);
        int iD = d(obj);
        if (iD == 2) {
            return IconCompat.g(null, h(obj), c(obj));
        }
        if (iD == 4) {
            Uri uriF = f(obj);
            aie.f(uriF);
            String string = uriF.toString();
            aie.f(string);
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.c = string;
            return iconCompat;
        }
        if (iD != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.c = obj;
            return iconCompat2;
        }
        Uri uriF2 = f(obj);
        aie.f(uriF2);
        String string2 = uriF2.toString();
        aie.f(string2);
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.c = string2;
        return iconCompat3;
    }

    public static String h(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((Icon) obj).getResPackage();
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }
}
