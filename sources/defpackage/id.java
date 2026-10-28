package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class id {
    baj b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final bak f = new ic(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ci) arrayList.get(i)).o();
            }
            this.c = false;
        }
    }

    public final void b() {
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ci ciVar = (ci) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                ciVar.r(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null) {
                ciVar.s(interpolator);
            }
            if (this.b != null) {
                ciVar.t(this.f);
            }
            ciVar.p();
        }
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void d(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(baj bajVar) {
        if (this.c) {
            return;
        }
        this.b = bajVar;
    }

    public final void f(ci ciVar) {
        if (this.c) {
            return;
        }
        this.a.add(ciVar);
    }
}
