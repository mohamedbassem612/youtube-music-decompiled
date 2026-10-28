package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcz extends lea {
    public char a;
    public long b;
    public final lcx c;
    public final lcx d;
    public final lcx e;
    public final lcx f;
    public final lcx g;
    public final lcx h;
    public final lcx i;
    public final lcx j;
    public final lcx k;
    private String l;

    public lcz(ldr ldrVar) {
        super(ldrVar);
        this.a = (char) 0;
        this.b = -1L;
        this.c = new lcx(this, 6, false, false);
        this.d = new lcx(this, 6, true, false);
        this.e = new lcx(this, 6, false, true);
        this.f = new lcx(this, 5, false, false);
        this.g = new lcx(this, 5, true, false);
        this.h = new lcx(this, 5, false, true);
        this.i = new lcx(this, 4, false, false);
        this.j = new lcx(this, 3, false, false);
        this.k = new lcx(this, 2, false, false);
    }

    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new lcy(str);
    }

    public static String b(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strC = c(z, obj);
        String strC2 = c(z, obj2);
        String strC3 = c(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strC)) {
            sb.append(str2);
            sb.append(strC);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strC2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strC2);
        }
        if (!TextUtils.isEmpty(strC3)) {
            sb.append(str3);
            sb.append(strC3);
        }
        return sb.toString();
    }

    static String c(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            String str = cCharAt == '-' ? "-" : "";
            return str + jRound + "..." + str + jRound2;
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof lcy) {
                return ((lcy) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strD = d(ldr.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && d(className).equals(strD)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    static String d(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    @Override // defpackage.lea
    protected final boolean e() {
        return false;
    }

    protected final String f() {
        String str;
        synchronized (this) {
            str = this.l;
            if (str == null) {
                str = "FA";
                this.l = "FA";
            }
            if (str == null) {
                throw new NullPointerException("null reference");
            }
        }
        return str;
    }

    public final void g(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && i(i)) {
            h(i, b(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        if (str == null) {
            throw new NullPointerException("null reference");
        }
        lha lhaVar = this.t.f;
        if (lhaVar == null) {
            h(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!lhaVar.r()) {
                h(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            lhaVar.j(new pac(this, i, str, obj, obj2, obj3, 1));
        }
    }

    public final void h(int i, String str) {
        Log.println(i, f(), str);
    }

    public final boolean i(int i) {
        return Log.isLoggable(f(), i);
    }
}
