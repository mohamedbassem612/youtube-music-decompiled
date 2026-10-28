package defpackage;

import internal.org.jni_zero.JniZero;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awqv implements awsd, awqu {
    public static final Map a;
    public final Class b;

    static {
        int i = 0;
        List listAL = atqq.aL(new Class[]{Function0.class, awqg.class, awqk.class, awql.class, awqm.class, awqn.class, awqo.class, awqp.class, awqq.class, awqr.class, awpw.class, awpx.class, awpy.class, awpz.class, awqa.class, awqb.class, awqc.class, awqd.class, awqe.class, awqf.class, awqh.class, awqi.class, awqj.class});
        ArrayList arrayList = new ArrayList(atqq.N(listAL, 10));
        for (Object obj : listAL) {
            int i2 = i + 1;
            if (i < 0) {
                atqq.M();
            }
            arrayList.add(new awml((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = atqq.C(arrayList);
    }

    public awqv(Class cls) {
        cls.getClass();
        this.b = cls;
    }

    @Override // defpackage.awqu
    public final Class a() {
        return this.b;
    }

    @Override // defpackage.awsd
    public final String b() {
        Class cls = this.b;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String name = cls.getName();
            name.getClass();
            String strF = JniZero.f(name);
            return strF == null ? cls.getCanonicalName() : strF;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive()) {
            String name2 = componentType.getName();
            name2.getClass();
            String strF2 = JniZero.f(name2);
            if (strF2 != null) {
                strConcat = strF2.concat("Array");
            }
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.awsd
    public final String c() {
        Class cls = this.b;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String name = cls.getName();
                name.getClass();
                String strG = JniZero.g(name);
                return strG == null ? cls.getSimpleName() : strG;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                String name2 = componentType.getName();
                name2.getClass();
                String strG2 = JniZero.g(name2);
                if (strG2 != null) {
                    strConcat = strG2.concat("Array");
                }
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            return awrc.s(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            simpleName.getClass();
            return awrc.s(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
        }
        simpleName.getClass();
        int iIndexOf = simpleName.indexOf(36, 0);
        if (iIndexOf == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iIndexOf + 1, simpleName.length());
        strSubstring.getClass();
        return strSubstring;
    }

    @Override // defpackage.awsd
    public final boolean d(Object obj) {
        Map map = a;
        map.getClass();
        Class clsH = this.b;
        Integer num = (Integer) map.get(clsH);
        if (num != null) {
            return awro.b(obj, num.intValue());
        }
        if (clsH.isPrimitive()) {
            int i = awrn.a;
            clsH = JniZero.h(new awqv(clsH));
        }
        return clsH.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awqv) && awrc.c(JniZero.h(this), JniZero.h((awsd) obj));
    }

    @Override // defpackage.awsb
    public final List getAnnotations() {
        throw null;
    }

    public final int hashCode() {
        return JniZero.h(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat(" (Kotlin reflection is not available)");
    }
}
