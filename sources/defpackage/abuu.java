package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abuu implements abvz {
    public final abnl a;
    private final abnp b;
    private final boolean c;
    private final String e;
    private final awmd f;
    private final agke g;

    public abuu(abnl abnlVar, abnp abnpVar, boolean z, String str, awmd awmdVar, agke agkeVar) {
        this.a = abnlVar;
        this.b = abnpVar;
        this.c = z;
        this.e = str;
        this.f = awmdVar;
        this.g = agkeVar;
    }

    public static abut h() {
        abut abutVar = new abut();
        abutVar.c(abnp.a);
        abutVar.d(agpi.a);
        abutVar.e(true);
        return abutVar;
    }

    public static abut i(abvz abvzVar) {
        String str;
        abut abutVarH = h();
        abutVarH.b(abvzVar.a());
        abutVarH.c(abvzVar.b());
        abutVarH.e(abvzVar.g());
        abutVarH.d(abvzVar.c());
        awmd awmdVarF = abvzVar.f();
        if (awmdVarF != null) {
            abutVarH.b = awmdVarF;
        }
        if ((abvzVar instanceof abuu) && (str = ((abuu) abvzVar).e) != null) {
            abutVarH.a = str;
        }
        return abutVarH;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static boolean j(abnl abnlVar) {
        ajwo ajwoVar;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        int iAV;
        int iAV2;
        if (abnlVar == null) {
            return false;
        }
        ajwo ajwoVar2 = abnlVar.b;
        if (ajwoVar2 != null) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzf.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            if (!ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                ajwoVar = abnlVar.b;
                if (ajwoVar != null) {
                    aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite.b;
                    } else {
                        objC = aihlVarCheckIsLite.c(objK);
                    }
                    int i = ((apfp) objC).n;
                    iAV = a.aV(i);
                    if ((iAV != 0 || iAV != 3) && ((iAV2 = a.aV(i)) == 0 || iAV2 != 4)) {
                        if (abnlVar.w().isEmpty()) {
                            return false;
                        }
                    }
                } else if (abnlVar.w().isEmpty()) {
                    return false;
                }
            }
        } else {
            ajwoVar = abnlVar.b;
            if (ajwoVar != null) {
                aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                if (objK == null) {
                    objC = aihlVarCheckIsLite.b;
                } else {
                    objC = aihlVarCheckIsLite.c(objK);
                }
                int i2 = ((apfp) objC).n;
                iAV = a.aV(i2);
                if (iAV != 0) {
                    if (abnlVar.w().isEmpty()) {
                        return false;
                    }
                } else if (abnlVar.w().isEmpty()) {
                    return false;
                }
            } else if (abnlVar.w().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.abvz
    public final abnl a() {
        return this.a;
    }

    @Override // defpackage.abvz
    public final abnp b() {
        return this.b;
    }

    @Override // defpackage.abun
    public final agke c() {
        return this.g;
    }

    @Override // defpackage.abun
    public final Class d() {
        return abvz.class;
    }

    @Override // defpackage.abun
    public final String e() {
        String str = this.e;
        return str == null ? String.valueOf(System.identityHashCode(this)) : str;
    }

    public final boolean equals(Object obj) {
        String str;
        awmd awmdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof abuu) {
            abuu abuuVar = (abuu) obj;
            if (this.a.equals(abuuVar.a) && this.b.equals(abuuVar.b) && this.c == abuuVar.c && ((str = this.e) != null ? str.equals(abuuVar.e) : abuuVar.e == null) && ((awmdVar = this.f) != null ? awmdVar.equals(abuuVar.f) : abuuVar.f == null) && aguu.v(this.g, abuuVar.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abvz
    public final awmd f() {
        return this.f;
    }

    @Override // defpackage.abvz
    public final boolean g() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.e;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        awmd awmdVar = this.f;
        return ((iHashCode2 ^ (awmdVar != null ? awmdVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.g;
        awmd awmdVar = this.f;
        abnp abnpVar = this.b;
        return "DefaultVideoPlaybackItem{playbackStartDescriptor=" + String.valueOf(this.a) + ", playbackStartParameters=" + String.valueOf(abnpVar) + ", supportsPlaybackQueue=" + this.c + ", playbackItemKey=" + this.e + ", cacheablePlayerResponseProvider=" + String.valueOf(awmdVar) + ", sequenceItems=" + String.valueOf(agkeVar) + '}';
    }

    public abuu() {
        throw null;
    }
}
