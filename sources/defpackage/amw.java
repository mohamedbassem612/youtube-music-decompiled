package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amw {
    public static final Void a(String str) {
        throw new IllegalStateException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(aiz aizVar, akp akpVar) {
        aoa aoaVar = akpVar.a().c;
        if (aoaVar == null) {
            a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
            throw new awmh();
        }
        aiz aizVarA = aoaVar.h.a();
        int i = aizVarA.b - 1;
        Object[] objArr = aizVarA.a;
        if (i < objArr.length) {
            while (i >= 0) {
                aizVar.i(((anq) objArr[i]).d.e);
                i--;
            }
        }
    }

    public static boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
        } else if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        }
        return false;
    }

    public static final bpi e(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (bpi) objNewInstance;
            } catch (IllegalAccessException e) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (InstantiationException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            }
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }
}
