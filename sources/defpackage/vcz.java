package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final boolean h;

    public vcz(boolean z, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = z4;
    }

    public static vcy a() {
        vcy vcyVar = new vcy();
        vcyVar.c(true);
        vcyVar.d(true);
        vcyVar.b(false);
        vcyVar.e(false);
        vcyVar.a = Optional.empty();
        vcyVar.b = Optional.empty();
        vcyVar.c = Optional.empty();
        vcyVar.d = Optional.empty();
        return vcyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vcz) {
            vcz vczVar = (vcz) obj;
            if (this.a == vczVar.a && this.b == vczVar.b && this.c == vczVar.c && this.d.equals(vczVar.d) && this.e.equals(vczVar.e) && this.f.equals(vczVar.f) && this.g.equals(vczVar.g) && this.h == vczVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        Optional optional = this.g;
        Optional optional2 = this.f;
        Optional optional3 = this.e;
        return "GreenScreenMediaListConfig{showDeselectItem=" + this.a + ", showMoreMediaItem=" + this.b + ", centerHorizontal=" + this.c + ", thumbnailSize=" + String.valueOf(this.d) + ", thumbnailBorderSize=" + String.valueOf(optional3) + ", thumbnailBorderBackgroundResource=" + String.valueOf(optional2) + ", listItemHorizontalMargin=" + String.valueOf(optional) + ", useGlideForGreenScreenPicker=" + this.h + '}';
    }

    public vcz() {
        throw null;
    }
}
