package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fmi extends fnp {
    private final fmh e;
    private final fkm f = new fkm();

    public fmi(fkm fkmVar, fmh fmhVar) {
        b(fkmVar);
        this.e = fmhVar;
    }

    private static Object i(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [fnp] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.fnp
    public final float a(long j) {
        if (d() > 1) {
            throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
        }
        Map map = this.a;
        boolean zContainsKey = map == null ? false : map.containsKey("default_input");
        Object objI = i((WeakReference) this.f.d());
        ?? E = this;
        if (objI == null) {
            if (zContainsKey) {
                E = e();
            }
            return E.c;
        }
        if (!zContainsKey) {
            return this.e.a(objI);
        }
        float f = e().c;
        c(f);
        return f;
    }

    public final void b(fkm fkmVar) {
        fkm fkmVar2;
        int i = 0;
        while (true) {
            fkmVar2 = this.f;
            if (i >= 5) {
                break;
            }
            fkmVar2.a[i] = null;
            i++;
        }
        fkmVar2.b = (short) 0;
        if (fkmVar != null) {
            short s = fkmVar.b;
            for (int i2 = 0; i2 < s; i2++) {
                fkmVar2.e(fkmVar.a(i2), new WeakReference(fkmVar.c(i2)));
            }
        }
    }

    public final void c(float f) {
        fkm fkmVar = this.f;
        short s = fkmVar.b;
        for (int i = 0; i < s; i++) {
            Object objI = i((WeakReference) fkmVar.c(i));
            if (objI != null) {
                this.e.d(objI, f);
            }
        }
    }
}
