package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vix {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final int k;
    public final int l;

    public vix(int i, int i2, int i3, int i4, int i5, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = optional;
        this.g = optional2;
        this.h = optional3;
        this.i = optional4;
        this.j = optional5;
        this.k = i6;
        this.l = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vix) {
            vix vixVar = (vix) obj;
            if (this.a == vixVar.a && this.b == vixVar.b && this.c == vixVar.c && this.d == vixVar.d && this.e == vixVar.e && this.f.equals(vixVar.f) && this.g.equals(vixVar.g) && this.h.equals(vixVar.h) && this.i.equals(vixVar.i) && this.j.equals(vixVar.j) && this.k == vixVar.k && this.l == vixVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.l;
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        Optional optional4 = this.g;
        return "ThemeIds{primarySurfaceId=" + this.a + ", raisedPrimarySurfaceId=" + this.b + ", secondarySurfaceId=" + this.c + ", primaryTextId=" + this.d + ", secondaryTextId=" + this.e + ", iconId=" + String.valueOf(this.f) + ", iconInsetId=" + String.valueOf(optional4) + ", tertiarySurfaceId=" + String.valueOf(optional3) + ", primaryTextHintId=" + String.valueOf(optional2) + ", primaryTextCursorId=" + String.valueOf(optional) + ", contentDescriptionId=" + this.k + ", chipColorId=" + this.l + '}';
    }

    public vix() {
        throw null;
    }
}
