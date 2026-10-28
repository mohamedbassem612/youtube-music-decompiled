package defpackage;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class fdr {
    public fdr(int i) {
        int i2 = AudioAttributesCompat.b;
        zf zfVar = new zf((byte[]) null);
        e(i, zfVar);
        d(zfVar);
    }

    private static void a(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(cls))), exc);
    }

    public static fdp c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                a(cls, e);
            } catch (InstantiationException e2) {
                a(cls, e2);
            } catch (NoSuchMethodException e3) {
                a(cls, e3);
            } catch (InvocationTargetException e4) {
                a(cls, e4);
            }
            if (objNewInstance instanceof fdp) {
                return (fdp) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(objNewInstance))));
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static AudioAttributesCompat d(zf zfVar) {
        return new AudioAttributesCompat(new AudioAttributesImplApi26(((AudioAttributes.Builder) zfVar.a).build()));
    }

    public static void e(int i, zf zfVar) {
        ((AudioAttributes.Builder) zfVar.a).setLegacyStreamType(i);
    }

    public static void f(zf zfVar) {
        ((AudioAttributes.Builder) zfVar.a).setUsage(1);
    }

    public fdr() {
    }
}
