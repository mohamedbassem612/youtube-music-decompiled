package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class awg {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long e(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object f(Object[] objArr, int i, boolean z, awf awfVar) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        Object obj = null;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(awfVar.a(obj2) - i) << 1) + (awfVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > iAbs) {
                obj = obj2;
                i2 = iAbs;
            }
        }
        return obj;
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, axd[] axdVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Typeface typefaceM = null;
        typefaceM = null;
        InputStream inputStream = null;
        if (axdVarArr.length > 0) {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream((Uri) g(axdVarArr, i).f);
                try {
                    typefaceM = m(context, inputStreamOpenInputStream);
                    yno.I(inputStreamOpenInputStream);
                } catch (IOException unused) {
                    yno.I(inputStreamOpenInputStream);
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamOpenInputStream;
                    yno.I(inputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return typefaceM;
    }

    public Typeface b(Context context, zs zsVar, Resources resources, int i) {
        axd axdVar = (axd) f((Object[]) zsVar.a, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new awe(0));
        if (axdVar == null) {
            return null;
        }
        Typeface typefaceB = avy.b(context, resources, axdVar.e, (String) axdVar.f, 0, i);
        long jE = e(typefaceB);
        if (jE != 0) {
            this.a.put(Long.valueOf(jE), zsVar);
        }
        return typefaceB;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileA = ave.a(context);
        Typeface typefaceCreateFromFile = null;
        if (fileA != null) {
            try {
                if (ave.d(fileA, resources, i)) {
                    typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                }
            } catch (RuntimeException unused) {
            } finally {
                fileA.delete();
            }
        }
        return typefaceCreateFromFile;
    }

    protected axd g(axd[] axdVarArr, int i) {
        return (axd) f(axdVarArr, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new awe(1));
    }

    public Typeface h(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface m(Context context, InputStream inputStream) {
        File fileA = ave.a(context);
        Typeface typefaceCreateFromFile = null;
        if (fileA != null) {
            try {
                if (ave.c(fileA, inputStream)) {
                    typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                }
            } catch (RuntimeException unused) {
            } finally {
                fileA.delete();
            }
        }
        return typefaceCreateFromFile;
    }
}
