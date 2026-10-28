package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulb {
    public final agke a;
    public final usd b;
    public final ukq c;
    public final auhs d;
    public final zf e;
    private final boolean f;

    public ulb(agke agkeVar, usd usdVar, zf zfVar, ukq ukqVar, auhs auhsVar, boolean z) {
        if (agkeVar == null) {
            throw new NullPointerException("Null effectsCallbackCancelers");
        }
        this.a = agkeVar;
        this.b = usdVar;
        this.e = zfVar;
        this.c = ukqVar;
        this.d = auhsVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulb) {
            ulb ulbVar = (ulb) obj;
            if (aguu.v(this.a, ulbVar.a) && this.b.equals(ulbVar.b) && this.e.equals(ulbVar.e) && this.c.u(ulbVar.c) && this.d.equals(ulbVar.d) && this.f == ulbVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        auhs auhsVar = this.d;
        ukq ukqVar = this.c;
        zf zfVar = this.e;
        usd usdVar = this.b;
        return "LoadDraftResult{effectsCallbackCancelers=" + String.valueOf(this.a) + ", mediaCompositionManager=" + usdVar.toString() + ", mediaEngineAudioController=" + String.valueOf(zfVar) + ", editorCompositionContext=" + ukqVar.toString() + ", loadedMediaComposition=" + auhsVar.toString() + ", hasTextMigrated=" + this.f + '}';
    }

    public ulb() {
        throw null;
    }
}
