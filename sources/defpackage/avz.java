package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class avz extends awg {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object e() throws NoSuchMethodException {
        f();
        try {
            return b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void f() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    private static final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    @Override // defpackage.awg
    public Typeface a(Context context, CancellationSignal cancellationSignal, axd[] axdVarArr, int i) {
        Typeface typefaceM;
        if (axdVarArr.length <= 0) {
            return null;
        }
        axd axdVarG = g(axdVarArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) axdVarG.f, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return null;
            }
            try {
                File fileI = i(parcelFileDescriptorOpenFileDescriptor);
                if (fileI == null || !fileI.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceM = super.m(context, fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    typefaceM = Typeface.createFromFile(fileI);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceM;
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.awg
    public Typeface b(Context context, zs zsVar, Resources resources, int i) throws NoSuchMethodException {
        Object obj = zsVar.a;
        Object objE = e();
        for (axd axdVar : (axd[]) obj) {
            File fileA = ave.a(context);
            if (fileA == null) {
                return null;
            }
            try {
                if (ave.d(fileA, resources, axdVar.e)) {
                    String path = fileA.getPath();
                    int i2 = axdVar.b;
                    boolean z = axdVar.c;
                    f();
                    try {
                        if (((Boolean) c.invoke(objE, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                            fileA.delete();
                        }
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            } catch (RuntimeException unused) {
            } catch (Throwable th) {
                fileA.delete();
                throw th;
            }
            fileA.delete();
            return null;
        }
        f();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(objNewInstance, 0, objE);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
