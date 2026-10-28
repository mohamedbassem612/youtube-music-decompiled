package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eix {
    public enp d;
    private final eiu e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public eix(List list) {
        eiu eiwVar;
        if (list.isEmpty()) {
            eiwVar = new eit();
        } else {
            eiwVar = list.size() == 1 ? new eiw(list) : new eiv(list);
        }
        this.e = eiwVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float fB = this.e.b();
        this.g = fB;
        return fB;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fA = this.e.a();
        this.h = fA;
        return fA;
    }

    public final float b() {
        Interpolator interpolator;
        enn ennVarD = d();
        if (ennVarD == null || ennVarD.f() || (interpolator = ennVarD.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(c());
    }

    final float c() {
        if (!this.b) {
            enn ennVarD = d();
            if (!ennVarD.f()) {
                return (this.c - ennVarD.c()) / (ennVarD.b() - ennVarD.c());
            }
        }
        return 0.0f;
    }

    public final enn d() {
        return this.e.c();
    }

    public Object e() {
        Interpolator interpolator;
        float fC = c();
        if (this.d == null && this.e.d(fC)) {
            return this.f;
        }
        enn ennVarD = d();
        Interpolator interpolator2 = ennVarD.e;
        Object objF = (interpolator2 == null || (interpolator = ennVarD.f) == null) ? f(ennVarD, b()) : g(ennVarD, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f = objF;
        return objF;
    }

    public abstract Object f(enn ennVar, float f);

    protected Object g(enn ennVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(eis eisVar) {
        this.a.add(eisVar);
    }

    public void i() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((eis) list.get(i)).d();
            i++;
        }
    }

    public void j(float f) {
        eiu eiuVar = this.e;
        if (eiuVar.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (eiuVar.f(f)) {
                i();
            }
        }
    }
}
