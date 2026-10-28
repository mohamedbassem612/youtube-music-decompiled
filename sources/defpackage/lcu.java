package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcu {
    protected static final AtomicReference a = new AtomicReference();
    protected static final AtomicReference b = new AtomicReference();
    protected static final AtomicReference c = new AtomicReference();
    public final hhc d;

    public lcu(hhc hhcVar) {
        this.d = hhcVar;
    }

    private static final String f(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        kro.l(atomicReference);
        kro.c(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    String str2 = strArr3[i];
                    if (str2 == null) {
                        String str3 = strArr2[i] + '(' + strArr[i] + ')';
                        strArr3[i] = str3;
                        str = str3;
                    } else {
                        str = str2;
                    }
                }
                break;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strB);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    protected final String b(Bundle bundle) {
        String strA;
        if (bundle == null) {
            return null;
        }
        if (!this.d.c()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(d(str));
            sb.append('=');
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strA = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strA = a((Object[]) obj);
            } else {
                strA = obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strA);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return this.d.c() ? f(str, lec.d, lec.a, a) : str;
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return this.d.c() ? f(str, led.b, led.a, b) : str;
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (this.d.c()) {
            return str.startsWith("_exp_") ? a.bU((byte) 41, str, "experiment_id(") : f(str, lee.b, lee.a, c);
        }
        return str;
    }
}
