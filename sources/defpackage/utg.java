package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utg {
    public final File a;
    public final uss b;
    public final agke c;
    private final uqh d;

    public utg(File file, uss ussVar, uqh uqhVar, agke agkeVar) {
        this.a = file;
        this.b = ussVar;
        this.d = uqhVar;
        if (agkeVar == null) {
            throw new NullPointerException("Null compositionLoadSteps");
        }
        this.c = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof utg) {
            utg utgVar = (utg) obj;
            if (this.a.equals(utgVar.a) && this.b.equals(utgVar.b) && this.d.equals(utgVar.d) && aguu.v(this.c, utgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1001100) * 1000003) ^ 1231) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CompositionInflationConfig{assetRoot=" + this.a.toString() + ", graphicalSegmentValidator=" + this.b.toString() + ", mediaEngineInEditorExperimentConfig=MediaEngineInEditorExperimentConfig{fullMediaEngineEnabled=true}, allowBestEffortLoad=true, compositionLoadSteps=" + String.valueOf(this.c) + '}';
    }

    public utg() {
        throw null;
    }
}
