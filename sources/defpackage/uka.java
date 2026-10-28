package defpackage;

import com.google.protos.youtube.api.innertube.CompositionProto$Composition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uka {
    private final CompositionProto$Composition a;
    private final String b;
    private final augy c;

    public uka(CompositionProto$Composition compositionProto$Composition, String str, augy augyVar) {
        this.a = compositionProto$Composition;
        this.b = str;
        this.c = augyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uka) {
            uka ukaVar = (uka) obj;
            if (awrc.c(this.a, ukaVar.a) && awrc.c(this.b, ukaVar.b) && awrc.c(this.c, ukaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TargetSegment(composition=" + this.a + ", segmentIdStr=" + this.b + ", graphicalSegment=" + this.c + ')';
    }
}
