package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bal {
    public final avw a;
    public final avw b;

    public bal(WindowInsetsAnimation.Bounds bounds) {
        this.a = avw.e(bounds.getLowerBound());
        this.b = avw.e(bounds.getUpperBound());
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + '}';
    }

    public bal(avw avwVar, avw avwVar2) {
        this.a = avwVar;
        this.b = avwVar2;
    }
}
