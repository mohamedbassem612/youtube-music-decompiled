package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class awa extends avz {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public awa() throws NoSuchMethodException {
        Method methodE;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            Class<?> cls4 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method3 = cls2.getMethod("freeze", null);
            method4 = cls2.getMethod("abortCreation", null);
            methodE = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
            methodE = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
        this.g = methodE;
    }

    private final Object f() {
        try {
            return this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void i(Object obj) {
        try {
            this.f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean j(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean l() {
        if (this.c != null) {
            return true;
        }
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        return false;
    }

    @Override // defpackage.avz, defpackage.awg
    public final Typeface a(Context context, CancellationSignal cancellationSignal, axd[] axdVarArr, int i) {
        Typeface typefaceC;
        if (axdVarArr.length <= 0) {
            return null;
        }
        if (!l()) {
            axd axdVarG = g(axdVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) axdVarG.f, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(axdVarG.b).setItalic(axdVarG.c).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (axd axdVar : axdVarArr) {
            if (axdVar.e == 0) {
                Object obj = axdVar.f;
                if (!map.containsKey(obj)) {
                    map.put(obj, ave.b(context, cancellationSignal, (Uri) obj));
                }
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        Object objF = f();
        if (objF == null) {
            return null;
        }
        int length = axdVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            axd axdVar2 = axdVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(axdVar2.f);
            if (byteBuffer != null) {
                try {
                    if (!((Boolean) this.d.invoke(objF, byteBuffer, Integer.valueOf(axdVar2.a), null, Integer.valueOf(axdVar2.b), Integer.valueOf(axdVar2.c ? 1 : 0))).booleanValue()) {
                        i(objF);
                        return null;
                    }
                    z = true;
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
            i2++;
            z = z;
        }
        if (!z) {
            i(objF);
            return null;
        }
        if (!k(objF) || (typefaceC = c(objF)) == null) {
            return null;
        }
        return Typeface.create(typefaceC, i);
    }

    @Override // defpackage.avz, defpackage.awg
    public final Typeface b(Context context, zs zsVar, Resources resources, int i) {
        if (!l()) {
            return super.b(context, zsVar, resources, i);
        }
        Object objF = f();
        if (objF != null) {
            axd[] axdVarArr = (axd[]) zsVar.a;
            int length = axdVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                axd axdVar = axdVarArr[i2];
                Object obj = axdVar.f;
                int i3 = axdVar.a;
                int i4 = axdVar.b;
                boolean z = axdVar.c;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(axdVar.d);
                String str = (String) obj;
                awa awaVar = this;
                Context context2 = context;
                if (awaVar.j(context2, objF, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    i2++;
                    this = awaVar;
                    context = context2;
                } else {
                    awaVar.i(objF);
                }
            }
            awa awaVar2 = this;
            if (awaVar2.k(objF)) {
                return awaVar2.c(objF);
            }
        }
        return null;
    }

    protected Typeface c(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.g.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.awg
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!l()) {
            return super.d(context, resources, i, str, i2);
        }
        Object objF = f();
        if (objF != null) {
            if (!j(context, objF, str, 0, -1, -1, null)) {
                i(objF);
            } else if (k(objF)) {
                return c(objF);
            }
        }
        return null;
    }

    protected Method e(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
