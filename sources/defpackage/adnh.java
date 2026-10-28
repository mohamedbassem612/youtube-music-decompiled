package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnh {
    public final adma a;
    public final View b;
    public final long c;
    public final Runnable d;
    public final Runnable e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public adnh(adma admaVar, View view, long j, Runnable runnable, Runnable runnable2, int i, int i2, int i3, int i4) {
        this.a = admaVar;
        this.b = view;
        this.c = j;
        this.d = runnable;
        this.e = runnable2;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final adnh a(adnf adnfVar) {
        adng adngVar = new adng();
        adngVar.a = this.a;
        adngVar.b = this.b;
        adngVar.f(this.d);
        adngVar.e(this.e);
        adngVar.b(adnfVar.a);
        adngVar.c(adnfVar.b);
        adngVar.d(adnfVar.c);
        adngVar.g(adnfVar.d);
        adngVar.h(adnfVar.e);
        return adngVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adnh) {
            adnh adnhVar = (adnh) obj;
            adma admaVar = this.a;
            if (admaVar != null ? admaVar.equals(adnhVar.a) : adnhVar.a == null) {
                View view = this.b;
                if (view != null ? view.equals(adnhVar.b) : adnhVar.b == null) {
                    if (this.c == adnhVar.c && this.d.equals(adnhVar.d) && this.e.equals(adnhVar.e) && this.f == adnhVar.f && this.g == adnhVar.g && this.h == adnhVar.h && this.i == adnhVar.i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        adma admaVar = this.a;
        int iHashCode = admaVar == null ? 0 : admaVar.hashCode();
        View view = this.b;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ (view != null ? view.hashCode() : 0)) * 1000003) ^ ((int) this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    public final String toString() {
        Runnable runnable = this.e;
        Runnable runnable2 = this.d;
        View view = this.b;
        return "MoveParameters{presenter=" + String.valueOf(this.a) + ", view=" + String.valueOf(view) + ", duration=" + this.c + ", onStart=" + String.valueOf(runnable2) + ", onEnd=" + String.valueOf(runnable) + ", fromX=" + this.f + ", fromY=" + this.g + ", toX=" + this.h + ", toY=" + this.i + '}';
    }

    public adnh() {
        throw null;
    }
}
