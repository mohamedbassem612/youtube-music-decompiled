package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzz {
    public final String a;
    public final String b;
    public final String c;
    public final Optional d;
    public final agke e;
    public final String f;
    public final apvy g;
    public final int h;
    public final int i;

    public uzz(String str, String str2, String str3, int i, int i2, Optional optional, agke agkeVar, String str4, apvy apvyVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.h = i;
        this.i = i2;
        this.d = optional;
        this.e = agkeVar;
        this.f = str4;
        this.g = apvyVar;
    }

    public static uzy a() {
        uzy uzyVar = new uzy();
        uzyVar.e = 2;
        uzyVar.f(2);
        uzyVar.c = "";
        uzyVar.d("");
        uzyVar.b = agke.p(new ajgi[0]);
        return uzyVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzz) {
            uzz uzzVar = (uzz) obj;
            if (this.a.equals(uzzVar.a) && this.b.equals(uzzVar.b) && this.c.equals(uzzVar.c)) {
                int i = this.h;
                int i2 = uzzVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.i;
                    int i4 = uzzVar.i;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.d.equals(uzzVar.d) && aguu.v(this.e, uzzVar.e) && ((str = this.f) != null ? str.equals(uzzVar.f) : uzzVar.f == null)) {
                        apvy apvyVar = this.g;
                        if (apvyVar == null) {
                            if (uzzVar.g == null) {
                                return true;
                            }
                        } else if (apvyVar.equals(uzzVar.g)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = this.h;
        a.by(i);
        int i2 = this.i;
        a.by(i2);
        int iHashCode2 = (((((((iHashCode * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode();
        String str = this.f;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        apvy apvyVar = this.g;
        return (iHashCode3 ^ (apvyVar != null ? apvyVar.hashCode() : 0)) * (-721379959);
    }

    public final String toString() {
        int i = this.h;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.i;
        String string2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        Optional optional = this.d;
        agke agkeVar = this.e;
        apvy apvyVar = this.g;
        return "EffectSelectionRequest{assetId=" + this.a + ", assetLoggingId=" + this.b + ", assetName=" + this.c + ", assetSource=" + string + ", assetUserType=" + string2 + ", assetParams=" + String.valueOf(optional) + ", clickTrackingParams=null, assetParallelData=" + String.valueOf(agkeVar) + ", entityKey=" + this.f + ", shortsCreationMediaAttribution=" + String.valueOf(apvyVar) + ", startTime=null, duration=null}";
    }

    public uzz() {
        throw null;
    }
}
