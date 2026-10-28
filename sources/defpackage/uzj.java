package defpackage;

import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzj {
    public final Effect a;
    public final asjv b;
    public final ajhv c;
    public final atte d;
    private final ajht e;
    private final agke f;
    private final atso g;
    private final uzi h;
    private final apvy i;

    public uzj(Effect effect, asjv asjvVar, ajhv ajhvVar, ajht ajhtVar, agke agkeVar, atte atteVar, atso atsoVar, uzi uziVar, apvy apvyVar) {
        this.a = effect;
        this.b = asjvVar;
        this.c = ajhvVar;
        this.e = ajhtVar;
        this.f = agkeVar;
        this.d = atteVar;
        this.g = atsoVar;
        this.h = uziVar;
        this.i = apvyVar;
    }

    public static avbm a() {
        avbm avbmVar = new avbm();
        avbmVar.c(asjv.a);
        avbmVar.b(agpi.a);
        avbmVar.d(atte.a);
        avbmVar.f = uzi.a().i();
        return avbmVar;
    }

    public final boolean equals(Object obj) {
        ajhv ajhvVar;
        ajht ajhtVar;
        atso atsoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzj) {
            uzj uzjVar = (uzj) obj;
            Effect effect = this.a;
            if (effect != null ? effect.equals(uzjVar.a) : uzjVar.a == null) {
                if (this.b.equals(uzjVar.b) && ((ajhvVar = this.c) != null ? ajhvVar.equals(uzjVar.c) : uzjVar.c == null) && ((ajhtVar = this.e) != null ? ajhtVar.equals(uzjVar.e) : uzjVar.e == null) && aguu.v(this.f, uzjVar.f) && this.d.equals(uzjVar.d) && ((atsoVar = this.g) != null ? atsoVar.equals(uzjVar.g) : uzjVar.g == null) && this.h.equals(uzjVar.h)) {
                    apvy apvyVar = this.i;
                    if (apvyVar == null) {
                        if (uzjVar.i == null) {
                            return true;
                        }
                    } else if (apvyVar.equals(uzjVar.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Effect effect = this.a;
        int iHashCode = (((effect == null ? 0 : effect.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        ajhv ajhvVar = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ajhvVar == null ? 0 : ajhvVar.hashCode())) * 1000003;
        ajht ajhtVar = this.e;
        int iHashCode3 = (((((iHashCode2 ^ (ajhtVar == null ? 0 : ajhtVar.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        atso atsoVar = this.g;
        int iHashCode4 = (((iHashCode3 ^ (atsoVar == null ? 0 : atsoVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        apvy apvyVar = this.i;
        return iHashCode4 ^ (apvyVar != null ? apvyVar.hashCode() : 0);
    }

    public final String toString() {
        apvy apvyVar = this.i;
        uzi uziVar = this.h;
        atso atsoVar = this.g;
        atte atteVar = this.d;
        agke agkeVar = this.f;
        ajht ajhtVar = this.e;
        ajhv ajhvVar = this.c;
        asjv asjvVar = this.b;
        return "AppliedEffectInfo{xenoEffect=" + String.valueOf(this.a) + ", qosEffectChosenRequest=" + String.valueOf(asjvVar) + ", assetRuntimeData=" + String.valueOf(ajhvVar) + ", assetBrowseData=" + String.valueOf(ajhtVar) + ", assetParallelData=" + String.valueOf(agkeVar) + ", xenoEffectProto=" + String.valueOf(atteVar) + ", xenoCapabilityDrivenEffectProto=" + String.valueOf(atsoVar) + ", additionalEffectInfo=" + String.valueOf(uziVar) + ", shortsCreationMediaAttribution=" + String.valueOf(apvyVar) + '}';
    }

    public uzj() {
        throw null;
    }
}
