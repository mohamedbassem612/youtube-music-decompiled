package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yvr {
    public boolean a;
    public short b;
    private Float c;
    private Float d;
    private Float e;
    private Float f;
    private Float g;
    private float h;
    private float i;
    private float j;
    private String k;
    private Float l;
    private int m;

    public final yvy a() {
        int i = ~this.b;
        if ((i & 449) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" normalizationMode");
            }
            if ((this.b & 64) == 0) {
                sb.append(" normalizationMultiplier");
            }
            if ((this.b & 128) == 0) {
                sb.append(" finalVolume");
            }
            if ((this.b & 256) == 0) {
                sb.append(" inputVolume");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        int i2 = this.m;
        Float f = this.c;
        Float f2 = this.d;
        Float f3 = this.e;
        Float f4 = this.f;
        Float f5 = this.g;
        float f6 = this.h;
        float f7 = this.i;
        float f8 = this.j;
        boolean z = this.a;
        String str = this.k;
        Float f9 = this.l;
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            f2 = null;
        }
        if ((i & 8) != 0) {
            f3 = null;
        }
        if ((i & 16) != 0) {
            f4 = null;
        }
        if ((i & 32) != 0) {
            f5 = null;
        }
        boolean z2 = ((i & SemanticState.LiveRegion) == 0) & z;
        if ((i & SemanticState.ReadOnly) != 0) {
            str = null;
        }
        return new yvy(i2, f, f2, f3, f4, f5, f6, f7, f8, z2, str, (i & SemanticState.Modal) != 0 ? null : f9);
    }

    public final void b(Float f) {
        this.g = f;
        this.b = (short) (this.b | 32);
    }

    public final void c(float f) {
        this.i = f;
        this.b = (short) (this.b | 128);
    }

    public final void d(Float f) {
        this.d = f;
        this.b = (short) (this.b | 4);
    }

    public final void e(float f) {
        this.j = f;
        this.b = (short) (this.b | 256);
    }

    public final void f(Float f) {
        this.e = f;
        this.b = (short) (this.b | 8);
    }

    public final void g(float f) {
        this.h = f;
        this.b = (short) (this.b | 64);
    }

    public final void h(Float f) {
        this.f = f;
        this.b = (short) (this.b | 16);
    }

    public final void i(String str) {
        this.k = str;
        this.b = (short) (this.b | 1024);
    }

    public final void j(Float f) {
        this.l = f;
        this.b = (short) (this.b | 2048);
    }

    public final void k(Float f) {
        this.c = f;
        this.b = (short) (this.b | 2);
    }

    public final void l(int i) {
        this.m = i;
        this.b = (short) (this.b | 1);
    }
}
