package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mjh {
    public final nar a;
    public final nxl b;
    public final nuc c;
    public final nso d;
    public final boolean e;
    public final nry f;
    public final agkj g;
    public final nsl h;
    public final omj i;
    public final omj j;
    public final omj k;
    public final omj l;
    public final omj m;

    public mjh(omj omjVar, omj omjVar2, omj omjVar3, omj omjVar4, omj omjVar5, nar narVar, nxl nxlVar, nuc nucVar, nso nsoVar, boolean z, nry nryVar, agkj agkjVar, nsl nslVar) {
        this.i = omjVar;
        this.j = omjVar2;
        this.k = omjVar3;
        this.l = omjVar4;
        if (omjVar5 == null) {
            throw new NullPointerException("Null imageSourceExtensionResolver");
        }
        this.m = omjVar5;
        if (narVar == null) {
            throw new NullPointerException("Null editableTextType");
        }
        this.a = narVar;
        if (nxlVar == null) {
            throw new NullPointerException("Null typefaceProvider");
        }
        this.b = nxlVar;
        if (nucVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.c = nucVar;
        if (nsoVar == null) {
            throw new NullPointerException("Null dataLayerSelector");
        }
        this.d = nsoVar;
        this.e = z;
        if (nryVar == null) {
            throw new NullPointerException("Null commandResolver");
        }
        this.f = nryVar;
        if (agkjVar == null) {
            throw new NullPointerException("Null styleRunExtensionConverters");
        }
        this.g = agkjVar;
        if (nslVar == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.h = nslVar;
    }

    static mjh a(omj omjVar, omj omjVar2, omj omjVar3, omj omjVar4, nar narVar, omj omjVar5, nxl nxlVar, nuc nucVar, nso nsoVar, boolean z, nry nryVar, Map map, nsl nslVar) {
        return new mjh(omjVar, omjVar2, omjVar3, omjVar4, omjVar5, narVar, nxlVar, nucVar, nsoVar, z, nryVar, agkj.h(map), nslVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mjh) {
            mjh mjhVar = (mjh) obj;
            omj omjVar = this.i;
            if (omjVar != null ? omjVar.equals(mjhVar.i) : mjhVar.i == null) {
                omj omjVar2 = this.j;
                if (omjVar2 != null ? omjVar2.equals(mjhVar.j) : mjhVar.j == null) {
                    omj omjVar3 = this.k;
                    if (omjVar3 != null ? omjVar3.equals(mjhVar.k) : mjhVar.k == null) {
                        omj omjVar4 = this.l;
                        if (omjVar4 != null ? omjVar4.equals(mjhVar.l) : mjhVar.l == null) {
                            if (this.m.equals(mjhVar.m) && this.a.equals(mjhVar.a) && this.b.equals(mjhVar.b) && this.c.equals(mjhVar.c) && this.d.equals(mjhVar.d) && this.e == mjhVar.e && this.f.equals(mjhVar.f) && aguu.q(this.g, mjhVar.g) && this.h.equals(mjhVar.h)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        omj omjVar = this.i;
        int iHashCode = omjVar == null ? 0 : omjVar.hashCode();
        omj omjVar2 = this.j;
        int iHashCode2 = omjVar2 == null ? 0 : omjVar2.hashCode();
        int i = iHashCode ^ 1000003;
        omj omjVar3 = this.k;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (omjVar3 == null ? 0 : omjVar3.hashCode())) * 1000003;
        omj omjVar4 = this.l;
        return ((((((((((((((((((iHashCode3 ^ (omjVar4 != null ? omjVar4.hashCode() : 0)) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        nsl nslVar = this.h;
        agkj agkjVar = this.g;
        nry nryVar = this.f;
        nso nsoVar = this.d;
        nuc nucVar = this.c;
        nxl nxlVar = this.b;
        nar narVar = this.a;
        omj omjVar = this.m;
        omj omjVar2 = this.l;
        omj omjVar3 = this.k;
        omj omjVar4 = this.j;
        return "PropArgs{onChangeCommandFuture=" + String.valueOf(this.i) + ", onFocusCommandFuture=" + String.valueOf(omjVar4) + ", onBlurCommandFuture=" + String.valueOf(omjVar3) + ", onTextInputActionCommandFuture=" + String.valueOf(omjVar2) + ", imageSourceExtensionResolver=" + omjVar.toString() + ", editableTextType=" + narVar.toString() + ", typefaceProvider=" + nxlVar.toString() + ", logger=" + nucVar.toString() + ", dataLayerSelector=" + nsoVar.toString() + ", enableEmojiCompat=" + this.e + ", commandResolver=" + nryVar.toString() + ", styleRunExtensionConverters=" + agkjVar.toString() + ", conversionContext=" + String.valueOf(nslVar) + '}';
    }

    public mjh() {
        throw null;
    }
}
