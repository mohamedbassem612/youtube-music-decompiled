package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eob {
    public Object d = null;
    public Object c = null;
    public Object b = null;
    public boolean a = false;

    public eob(byte[] bArr, byte[] bArr2) {
    }

    private final void h() {
        if (this.a) {
            this.d = new afv((aha) this.d);
            this.c = new afv((aha) this.c);
            this.b = new afv((aha) this.b);
            this.a = false;
        }
    }

    public final String a() {
        return (String) ((isw) this.b).a;
    }

    public final String b() {
        return (String) ((isw) this.b).b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final rv c() {
        this.a = true;
        return new rv(this.d, this.c, this.b);
    }

    public final void d(Object obj, int i, String str) {
        azs.l(obj);
        h();
        e(obj, new ry(i, null, str));
    }

    public final void e(Object obj, ry ryVar) {
        azs.l(obj);
        h();
        if (ryVar.b()) {
            Object obj2 = this.d;
            if (!ryVar.b()) {
                Objects.toString(ryVar);
                throw new IllegalStateException("AppSearchResult is a failure: ".concat(ryVar.toString()));
            }
            ((aha) obj2).put(obj, ryVar.b);
            ((aha) this.c).remove(obj);
        } else {
            ((aha) this.c).put(obj, ryVar);
            ((aha) this.d).remove(obj);
        }
        ((aha) this.b).put(obj, ryVar);
    }

    public final void f(Object obj, Object obj2) {
        azs.l(obj);
        h();
        e(obj, new ry(0, obj2, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final eqf g() {
        if (TextUtils.isEmpty(this.d)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (wf.d(0)) {
            return new eqf((CharSequence) this.d, (CharSequence) this.c, (CharSequence) this.b, this.a);
        }
        throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": 0");
    }

    public eob(byte[] bArr) {
    }
}
