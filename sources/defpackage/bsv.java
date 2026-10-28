package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsv {
    public static final bsv a = new bsv(new bsu());
    public final CharSequence A;
    public final Integer B;
    public final agke C;
    public final agke D;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    @Deprecated
    public final Integer k;
    public final Boolean l;

    @Deprecated
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        int i = bwp.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    public bsv(bsu bsuVar) {
        Boolean boolValueOf = bsuVar.k;
        Integer numValueOf = bsuVar.j;
        Integer numValueOf2 = bsuVar.z;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                } else {
                    i = 0;
                }
                numValueOf = Integer.valueOf(i);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            boolValueOf.getClass();
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        } else {
            numValueOf = null;
        }
        this.b = bsuVar.a;
        this.c = bsuVar.b;
        this.d = bsuVar.c;
        this.e = bsuVar.d;
        this.f = bsuVar.e;
        this.g = bsuVar.f;
        this.h = bsuVar.g;
        this.i = bsuVar.h;
        this.j = bsuVar.i;
        this.k = numValueOf;
        this.l = boolValueOf;
        Integer num = bsuVar.l;
        this.m = num;
        this.n = num;
        this.o = bsuVar.m;
        this.p = bsuVar.n;
        this.q = bsuVar.o;
        this.r = bsuVar.p;
        this.s = bsuVar.q;
        this.t = bsuVar.r;
        this.u = bsuVar.s;
        this.v = bsuVar.t;
        this.w = bsuVar.u;
        this.x = bsuVar.v;
        this.y = bsuVar.w;
        this.z = bsuVar.x;
        this.A = bsuVar.y;
        this.B = numValueOf2;
        this.C = bsuVar.A;
        this.D = bsuVar.B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bsv bsvVar = (bsv) obj;
            if (TextUtils.equals(this.b, bsvVar.b) && TextUtils.equals(this.c, bsvVar.c) && TextUtils.equals(this.d, bsvVar.d) && TextUtils.equals(this.e, bsvVar.e) && TextUtils.equals(this.f, bsvVar.f) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(null, null) && Arrays.equals(this.g, bsvVar.g) && Objects.equals(this.h, bsvVar.h) && Objects.equals(null, null) && Objects.equals(this.i, bsvVar.i) && Objects.equals(this.j, bsvVar.j) && Objects.equals(this.k, bsvVar.k) && Objects.equals(this.l, bsvVar.l) && Objects.equals(null, null) && Objects.equals(this.n, bsvVar.n) && Objects.equals(this.o, bsvVar.o) && Objects.equals(this.p, bsvVar.p) && Objects.equals(this.q, bsvVar.q) && Objects.equals(this.r, bsvVar.r) && Objects.equals(this.s, bsvVar.s) && TextUtils.equals(this.t, bsvVar.t) && TextUtils.equals(this.u, bsvVar.u) && TextUtils.equals(this.v, bsvVar.v) && TextUtils.equals(this.w, bsvVar.w) && Objects.equals(this.x, bsvVar.x) && Objects.equals(this.y, bsvVar.y) && TextUtils.equals(this.z, bsvVar.z) && TextUtils.equals(this.A, bsvVar.A) && Objects.equals(this.B, bsvVar.B) && Objects.equals(null, null) && Objects.equals(this.C, bsvVar.C) && Objects.equals(this.D, bsvVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, null, null, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, null, this.i, this.j, this.k, this.l, null, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, null, this.A, this.B, Boolean.TRUE, this.D, null, this.C);
    }
}
