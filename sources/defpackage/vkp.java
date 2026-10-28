package defpackage;

import android.graphics.Paint;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkp {
    private final auir c;
    private final int d;
    private final int j;
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();
    public Optional a = Optional.empty();
    private Optional g = vkq.b;
    private Optional h = vkq.c;
    public Optional b = vkq.d;
    private boolean i = false;

    public vkp(auir auirVar, int i, int i2) {
        this.c = auirVar;
        this.d = i;
        this.j = i2;
    }

    public final vkq a() {
        return new vkq(this.c, this.d, this.j, this.e, this.f, this.a, this.g, this.h, this.b, this.i);
    }

    public final void b(String str) {
        this.f = Optional.of(str);
    }

    public final void c(float f) {
        this.e = Optional.of(Float.valueOf(f));
    }

    public final void d(Paint.Join join) {
        this.h = Optional.of(join);
    }

    public final void e(float f) {
        this.g = Optional.of(Float.valueOf(f));
    }

    public final void f() {
        this.i = true;
    }
}
