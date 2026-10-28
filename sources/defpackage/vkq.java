package defpackage;

import android.graphics.Paint;
import android.net.Uri;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkq {
    public static final Paint.Join a;
    public static final Optional b;
    public static final Optional c;
    public static final Optional d;
    public final auir e;
    public final int f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final boolean l;
    public final Object m = new Object();
    public Optional n;
    public Uri o;
    public final int p;

    static {
        Paint.Join join = Paint.Join.MITER;
        a = join;
        b = Optional.of(Float.valueOf(0.0625f));
        c = Optional.of(join);
        d = Optional.of(Float.valueOf(2.0f));
    }

    public vkq(auir auirVar, int i, int i2, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, boolean z) {
        this.e = auirVar;
        this.f = i;
        this.p = i2;
        optional.getClass();
        this.g = optional;
        optional2.getClass();
        this.h = optional2;
        this.n = optional3;
        this.i = optional4;
        this.j = optional5;
        this.k = optional6;
        this.l = z;
    }

    public final Optional a() {
        Optional optional;
        synchronized (this.m) {
            optional = this.n;
        }
        return optional;
    }
}
