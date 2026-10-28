package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lw {
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        boolean z;
        Field field4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            z = false;
                            field4 = null;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                    b = method;
                    c = field;
                    d = field2;
                    e = field3;
                    f = field4;
                    a = true;
                    return;
                }
                b = null;
                c = null;
                d = null;
                e = null;
                f = null;
                a = false;
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
            method = null;
            field = null;
        }
        if (z) {
            b = method;
            c = field;
            d = field2;
            e = field3;
            f = field4;
            a = true;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        a = false;
    }
}
