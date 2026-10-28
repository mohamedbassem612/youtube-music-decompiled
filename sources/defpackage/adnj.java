package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnj {
    public final adma a;
    public final adma b;
    public final long c;
    public final Runnable d;
    public final Runnable e;
    public final Runnable f;
    public final Runnable g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public adnj(adma admaVar, adma admaVar2, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, int i, int i2, int i3, int i4) {
        this.a = admaVar;
        this.b = admaVar2;
        this.c = 250L;
        this.d = runnable;
        this.e = runnable2;
        this.f = runnable3;
        this.g = runnable4;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adnj) {
            adnj adnjVar = (adnj) obj;
            if (this.a.equals(adnjVar.a) && this.b.equals(adnjVar.b) && this.c == adnjVar.c && this.d.equals(adnjVar.d) && this.e.equals(adnjVar.e) && this.f.equals(adnjVar.f) && this.g.equals(adnjVar.g) && this.h == adnjVar.h && this.i == adnjVar.i && this.j == adnjVar.j && this.k == adnjVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    public final String toString() {
        Runnable runnable = this.g;
        Runnable runnable2 = this.f;
        Runnable runnable3 = this.e;
        Runnable runnable4 = this.d;
        adma admaVar = this.b;
        return "ReplaceParameters{oldPresenter=" + String.valueOf(this.a) + ", newPresenter=" + String.valueOf(admaVar) + ", duration=" + this.c + ", oldOnStart=" + String.valueOf(runnable4) + ", oldOnEnd=" + String.valueOf(runnable3) + ", newOnStart=" + String.valueOf(runnable2) + ", newOnEnd=" + String.valueOf(runnable) + ", fromX=" + this.h + ", fromY=" + this.i + ", toX=" + this.j + ", toY=" + this.k + '}';
    }

    public adnj() {
        throw null;
    }
}
