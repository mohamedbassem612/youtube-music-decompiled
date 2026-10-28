package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsu {
    public agke A;
    public agke B;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public Integer v;
    public Integer w;
    public CharSequence x;
    public CharSequence y;
    public Integer z;

    public bsu(bsv bsvVar) {
        this.a = bsvVar.b;
        this.b = bsvVar.c;
        this.c = bsvVar.d;
        this.d = bsvVar.e;
        this.e = bsvVar.f;
        this.f = bsvVar.g;
        this.g = bsvVar.h;
        this.h = bsvVar.i;
        this.i = bsvVar.j;
        this.j = bsvVar.k;
        this.k = bsvVar.l;
        this.l = bsvVar.n;
        this.m = bsvVar.o;
        this.n = bsvVar.p;
        this.o = bsvVar.q;
        this.p = bsvVar.r;
        this.q = bsvVar.s;
        this.r = bsvVar.t;
        this.s = bsvVar.u;
        this.t = bsvVar.v;
        this.v = bsvVar.x;
        this.u = bsvVar.w;
        this.w = bsvVar.y;
        this.x = bsvVar.z;
        this.y = bsvVar.A;
        this.z = bsvVar.B;
        this.A = bsvVar.C;
        this.B = bsvVar.D;
    }

    public final void a(byte[] bArr, int i) {
        if (this.f == null || i == 3 || !Objects.equals(this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
    }

    public bsu() {
        agke agkeVar = agpi.a;
        this.A = agkeVar;
        this.B = agkeVar;
    }
}
