package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jwm {
    public final int a;
    public final String b;
    private final Object c;
    private final Object d;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public jwm(int i, String str, Object obj, Object obj2) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        jwf.a.d.a.add(this);
    }

    public static void f(String str, float f, float f2) {
        new jwk(str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static jwm g(String str, int i, int i2) {
        return new jwi(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static jwm h(String str, long j, long j2) {
        return new jwj(str, Long.valueOf(j), Long.valueOf(j2));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public static void i() {
        jwf.a.d.c.add(new jwl("gads:sdk_core_constants:experiment_id", null, null));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public static void j() {
        jwf.a.d.b.add(new jwl("gads:sdk_core_constants_service:experiment_id", null, null));
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public final Object d() {
        jwn jwnVar = jwf.a.b;
        if (!jwnVar.b.block(5000L)) {
            synchronized (jwnVar.a) {
                if (!jwnVar.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!jwnVar.c || jwnVar.e == null || jwnVar.j) {
            synchronized (jwnVar.a) {
                if (!jwnVar.c || jwnVar.e == null || jwnVar.j) {
                    return e();
                }
            }
        }
        if (this.a != 2) {
            return jwnVar.h.has(this.b) ? a(jwnVar.h) : kro.E(new jxq(jwnVar, this, 1, null));
        }
        Bundle bundle = jwnVar.f;
        return bundle == null ? e() : b(bundle);
    }

    public final Object e() {
        return jwf.a.b.i ? this.d : this.c;
    }
}
