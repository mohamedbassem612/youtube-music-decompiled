package defpackage;

import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyr {
    public final Effect a;
    public final ajhv b;
    public final ajht c;
    public final agke d;
    public final atte e;
    public final atso f;

    public uyr(Effect effect, ajhv ajhvVar, ajht ajhtVar, agke agkeVar, atte atteVar, atso atsoVar) {
        this.a = effect;
        this.b = ajhvVar;
        this.c = ajhtVar;
        if (agkeVar == null) {
            throw new NullPointerException("Null assetParallelData");
        }
        this.d = agkeVar;
        this.e = atteVar;
        this.f = atsoVar;
    }

    public final boolean equals(Object obj) {
        ajhv ajhvVar;
        ajht ajhtVar;
        atte atteVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uyr) {
            uyr uyrVar = (uyr) obj;
            if (this.a.equals(uyrVar.a) && ((ajhvVar = this.b) != null ? ajhvVar.equals(uyrVar.b) : uyrVar.b == null) && ((ajhtVar = this.c) != null ? ajhtVar.equals(uyrVar.c) : uyrVar.c == null) && aguu.v(this.d, uyrVar.d) && ((atteVar = this.e) != null ? atteVar.equals(uyrVar.e) : uyrVar.e == null)) {
                atso atsoVar = this.f;
                if (atsoVar == null) {
                    if (uyrVar.f == null) {
                        return true;
                    }
                } else if (atsoVar.equals(uyrVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ajhv ajhvVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ajhvVar == null ? 0 : ajhvVar.hashCode())) * 1000003;
        ajht ajhtVar = this.c;
        int iHashCode3 = (((iHashCode2 ^ (ajhtVar == null ? 0 : ajhtVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        atte atteVar = this.e;
        int iHashCode4 = (iHashCode3 ^ (atteVar == null ? 0 : atteVar.hashCode())) * 1000003;
        atso atsoVar = this.f;
        return iHashCode4 ^ (atsoVar != null ? atsoVar.hashCode() : 0);
    }

    public final String toString() {
        atso atsoVar = this.f;
        atte atteVar = this.e;
        agke agkeVar = this.d;
        ajht ajhtVar = this.c;
        ajhv ajhvVar = this.b;
        return "XenoEffectInfo{effect=" + this.a.toString() + ", assetRuntimeData=" + String.valueOf(ajhvVar) + ", assetBrowseData=" + String.valueOf(ajhtVar) + ", assetParallelData=" + agkeVar.toString() + ", effectProto=" + String.valueOf(atteVar) + ", capabilityDrivenEffectProto=" + String.valueOf(atsoVar) + '}';
    }

    public uyr() {
        throw null;
    }
}
