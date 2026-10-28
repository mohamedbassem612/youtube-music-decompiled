package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kdd {
    public static final String a;
    private static kdd j;
    public final kcw b;
    public final SharedPreferences c;
    public final String d;
    public long i;
    public final Set g = new HashSet();
    public final Set h = new HashSet();
    public final Handler f = new afkg(Looper.getMainLooper(), (byte[]) null);
    public final Runnable e = new kcx(this, 2);

    static {
        new khn("FeatureUsageAnalytics", (String) null);
        a = "23.0.0";
    }

    private kdd(SharedPreferences sharedPreferences, kcw kcwVar, String str) {
        this.c = sharedPreferences;
        this.b = kcwVar;
        this.d = str;
    }

    public static synchronized kdd a(SharedPreferences sharedPreferences, kcw kcwVar, String str) {
        kdd kddVar;
        kddVar = j;
        if (kddVar == null) {
            kddVar = new kdd(sharedPreferences, kcwVar, str);
            j = kddVar;
        }
        return kddVar;
    }

    public static agzl b(String str) {
        try {
            return agzl.a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return agzl.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    static String c(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static void e(agzl agzlVar) {
        kdd kddVar;
        if (!kcw.a || (kddVar = j) == null) {
            return;
        }
        kddVar.c.edit().putLong(kddVar.d(h(agzlVar)), System.currentTimeMillis()).apply();
        kddVar.g.add(agzlVar);
        kddVar.g();
    }

    public static final String h(agzl agzlVar) {
        return Integer.toString(agzlVar.ag);
    }

    public final String d(String str) {
        SharedPreferences sharedPreferences = this.c;
        String strC = c("feature_usage_timestamp_reported_feature_", str);
        return !sharedPreferences.contains(strC) ? c("feature_usage_timestamp_detected_feature_", str) : strC;
    }

    public final void f(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.c.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    public final void g() {
        this.f.post(this.e);
    }
}
