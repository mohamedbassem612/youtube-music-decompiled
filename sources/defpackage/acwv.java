package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwv {
    public final akdd a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final acwm e;
    public final Object f;
    public final xgn g;
    public final ajwo h;

    public acwv(akdd akddVar, boolean z, boolean z2, boolean z3, acwm acwmVar, Object obj, xgn xgnVar, ajwo ajwoVar) {
        this.a = akddVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = acwmVar;
        this.f = obj;
        this.g = xgnVar;
        this.h = ajwoVar;
    }

    public static acwu a() {
        acwu acwuVar = new acwu();
        acwuVar.b(true);
        acwuVar.c(true);
        acwuVar.f();
        acwuVar.e(false);
        acwuVar.e = (byte) (acwuVar.e | 16);
        return acwuVar;
    }

    public final boolean equals(Object obj) {
        acwm acwmVar;
        Object obj2;
        xgn xgnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acwv) {
            acwv acwvVar = (acwv) obj;
            if (this.a.equals(acwvVar.a) && this.b == acwvVar.b && this.c == acwvVar.c && this.d == acwvVar.d && ((acwmVar = this.e) != null ? acwmVar.equals(acwvVar.e) : acwvVar.e == null) && ((obj2 = this.f) != null ? obj2.equals(acwvVar.f) : acwvVar.f == null) && ((xgnVar = this.g) != null ? xgnVar.equals(acwvVar.g) : acwvVar.g == null)) {
                ajwo ajwoVar = this.h;
                if (ajwoVar == null) {
                    if (acwvVar.h == null) {
                        return true;
                    }
                } else if (ajwoVar.equals(acwvVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        acwm acwmVar = this.e;
        int iHashCode2 = ((((((((((((iHashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (acwmVar == null ? 0 : acwmVar.hashCode())) * 1000003;
        Object obj = this.f;
        int iHashCode3 = (iHashCode2 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        xgn xgnVar = this.g;
        int iHashCode4 = (iHashCode3 ^ (xgnVar == null ? 0 : xgnVar.hashCode())) * 1000003;
        ajwo ajwoVar = this.h;
        return (iHashCode4 ^ (ajwoVar != null ? ajwoVar.hashCode() : 0)) * (-721379959);
    }

    public final String toString() {
        ajwo ajwoVar = this.h;
        xgn xgnVar = this.g;
        Object obj = this.f;
        acwm acwmVar = this.e;
        return "ShowConfirmDialogArgs{confirmDialogRenderer=" + String.valueOf(this.a) + ", cancelOnBackPress=" + this.b + ", cancelOnTouchOutside=" + this.c + ", useSubtitleIfAvailable=false, enableMonoStyleButtons=" + this.d + ", useRendererButtonStyles=false, listener=" + String.valueOf(acwmVar) + ", tag=" + String.valueOf(obj) + ", interactionLogger=" + String.valueOf(xgnVar) + ", triggeringCommand=" + String.valueOf(ajwoVar) + ", identity=null, accountId=null}";
    }

    public acwv() {
        throw null;
    }
}
