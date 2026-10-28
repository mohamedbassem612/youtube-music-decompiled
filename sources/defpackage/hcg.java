package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcg {
    public final Optional a;
    public final Optional b;
    public final agke c;
    public final agke d;
    public final agke e;
    public final String f;
    public final String g;
    public final aqmh h;

    public hcg(Optional optional, Optional optional2, agke agkeVar, agke agkeVar2, agke agkeVar3, String str, String str2, aqmh aqmhVar) {
        this.a = optional;
        this.b = optional2;
        this.c = agkeVar;
        this.d = agkeVar2;
        this.e = agkeVar3;
        this.f = str;
        this.g = str2;
        this.h = aqmhVar;
    }

    public static hcf a() {
        hcf hcfVar = new hcf();
        agke agkeVar = agpi.a;
        hcfVar.f(agkeVar);
        hcfVar.e(agkeVar);
        hcfVar.a = agkeVar;
        return hcfVar;
    }

    public static hcg b(anyx anyxVar, anyo anyoVar) {
        hcf hcfVarA = a();
        hcfVarA.d(anyxVar);
        hcfVarA.c(anyoVar);
        hcfVarA.b = anyxVar.getTitle();
        hcfVarA.c = anyxVar.getThumbnailDetails();
        agke agkeVar = agpi.a;
        hcfVarA.f(agkeVar);
        hcfVarA.e(agkeVar);
        hcfVarA.b("");
        return hcfVarA.a();
    }

    public static hcg c(anjx anjxVar, agke agkeVar) {
        hcf hcfVarA = a();
        hcfVarA.d(anjxVar);
        hcfVarA.f(agkeVar);
        hcfVarA.e(agpi.a);
        hcfVarA.b(anjxVar.getAndroidMediaStoreContentUri());
        hcfVarA.b = anjxVar.getTitle();
        hcfVarA.c = anjxVar.getThumbnailDetails();
        return hcfVarA.a();
    }

    public static hcg d(ankr ankrVar, agke agkeVar) {
        hcf hcfVarA = a();
        hcfVarA.d(ankrVar);
        hcfVarA.f(agkeVar);
        hcfVarA.e(agpi.a);
        hcfVarA.b(ankrVar.getAndroidMediaStoreContentUri());
        hcfVarA.b = ankrVar.getName();
        hcfVarA.c = ankrVar.getThumbnailDetails();
        return hcfVarA.a();
    }

    public static hcg e(anuk anukVar, String str, List list) {
        agjz agjzVarF = agke.f(list.size());
        agjz agjzVarF2 = agke.f(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hci hciVar = (hci) it.next();
            agjzVarF.h(hciVar.a);
            agjzVarF2.h(hciVar.b);
        }
        return f(anukVar, str, agjzVarF2.g(), agjzVarF.g());
    }

    public static hcg f(anuk anukVar, String str, agke agkeVar, agke agkeVar2) {
        hcf hcfVarA = a();
        hcfVarA.d(anukVar);
        hcfVarA.f(agkeVar2);
        hcfVarA.e(agpi.a);
        hcfVarA.a = agkeVar;
        hcfVarA.b(str);
        hcfVarA.b = anukVar.getTitle();
        hcfVarA.c = anukVar.getThumbnailDetails();
        return hcfVarA.a();
    }

    public static hcg g(agke agkeVar, String str, String str2) {
        hcf hcfVarA = a();
        hcfVarA.f(agkeVar);
        hcfVarA.e(agpi.a);
        hcfVarA.b = str;
        hcfVarA.b(str2);
        return hcfVarA.a();
    }

    public static Optional h(String str, String str2, agke agkeVar, agke agkeVar2) {
        if (agkeVar.isEmpty() || agkeVar2.isEmpty()) {
            return Optional.empty();
        }
        hcf hcfVarA = a();
        hcfVarA.f(agkeVar);
        hcfVarA.e(agkeVar2);
        hcfVarA.b(str2);
        hcfVarA.b = str;
        return Optional.of(hcfVarA.a());
    }

    public final boolean equals(Object obj) {
        agke agkeVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcg) {
            hcg hcgVar = (hcg) obj;
            if (this.a.equals(hcgVar.a) && this.b.equals(hcgVar.b) && aguu.v(this.c, hcgVar.c) && aguu.v(this.d, hcgVar.d) && ((agkeVar = this.e) != null ? aguu.v(agkeVar, hcgVar.e) : hcgVar.e == null) && this.f.equals(hcgVar.f) && ((str = this.g) != null ? str.equals(hcgVar.g) : hcgVar.g == null)) {
                aqmh aqmhVar = this.h;
                if (aqmhVar == null) {
                    if (hcgVar.h == null) {
                        return true;
                    }
                } else if (aqmhVar.equals(hcgVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        agke agkeVar = this.e;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (agkeVar == null ? 0 : agkeVar.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        aqmh aqmhVar = this.h;
        return iHashCode3 ^ (aqmhVar != null ? aqmhVar.hashCode() : 0);
    }

    public final String toString() {
        aqmh aqmhVar = this.h;
        agke agkeVar = this.e;
        agke agkeVar2 = this.d;
        agke agkeVar3 = this.c;
        Optional optional = this.b;
        return "MusicContainerTracksModel{entity=" + String.valueOf(this.a) + ", downloadMetadataEntity=" + String.valueOf(optional) + ", trackList=" + String.valueOf(agkeVar3) + ", trackDownloadMetadataList=" + String.valueOf(agkeVar2) + ", trackUniqueIdList=" + String.valueOf(agkeVar) + ", containerId=" + this.f + ", title=" + this.g + ", thumbnailDetails=" + String.valueOf(aqmhVar) + '}';
    }

    public hcg() {
        throw null;
    }
}
