package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abxl implements abxo {
    public final int a;
    public final Set b;
    public final aipc c;
    public final arfb d;

    public abxl(int i, Set set, aipc aipcVar) {
        set.getClass();
        aipcVar.getClass();
        this.a = i;
        this.b = set;
        this.c = aipcVar;
        this.d = arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abxl) {
            abxl abxlVar = (abxl) obj;
            if (this.a == abxlVar.a && awrc.c(this.b, abxlVar.b) && this.c == abxlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FixedResolution(resolution=" + this.a + ", availableItags=" + this.b + ", qualityOrdinal=" + this.c + ')';
    }
}
