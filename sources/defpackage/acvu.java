package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvu {
    public final avlh a;
    public final avlh b;
    public final acvr c;
    public final acvr d;
    public final Optional e;
    public final Optional f;
    public final boolean g;
    public final boolean h;

    public acvu(avlh avlhVar, avlh avlhVar2, acvr acvrVar, acvr acvrVar2, Optional optional, Optional optional2, boolean z, boolean z2) {
        this.a = avlhVar;
        this.b = avlhVar2;
        this.c = acvrVar;
        this.d = acvrVar2;
        this.e = optional;
        this.f = optional2;
        this.g = z;
        this.h = z2;
    }

    public static acvt a() {
        acvt acvtVar = new acvt();
        acvtVar.b = avlh.G(acvs.a);
        acvtVar.i = (byte) (acvtVar.i | 1);
        acvtVar.c = acvr.a();
        acvtVar.d = acvr.a();
        acvtVar.e = Optional.empty();
        acvtVar.f = Optional.empty();
        acvtVar.a = avlh.G(acos.a);
        acvtVar.g = true;
        byte b = acvtVar.i;
        acvtVar.h = true;
        acvtVar.i = (byte) (b | 30);
        return acvtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acvu) {
            acvu acvuVar = (acvu) obj;
            if (this.a.equals(acvuVar.a) && this.b.equals(acvuVar.b) && this.c.equals(acvuVar.c) && this.d.equals(acvuVar.d) && this.e.equals(acvuVar.e) && this.f.equals(acvuVar.f) && this.g == acvuVar.g && this.h == acvuVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        acvr acvrVar = this.d;
        acvr acvrVar2 = this.c;
        avlh avlhVar = this.b;
        return "ReelPlayerViewModel{captionPositionFlowable=" + String.valueOf(this.a) + ", aspectViewType=" + String.valueOf(avlhVar) + ", desiredAspectRatio=0.0, landscapeVideoLayout=" + String.valueOf(acvrVar2) + ", portraitVideoLayout=" + String.valueOf(acvrVar) + ", reducedPlayerSizeFactor=" + String.valueOf(optional2) + ", backgroundDrawable=" + String.valueOf(optional) + ", forceAspectFitOnTablet=" + this.g + ", fitVideoForWideDevice=" + this.h + ", enableAutocropInLandscape=false, enableAutocropInPortrait=false}";
    }

    public acvu() {
        throw null;
    }
}
