package defpackage;

import android.util.Range;
import android.util.Size;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqv {
    public final UUID a;
    public final Size b;
    public final augy c;
    public final urn d;
    public final boolean e;
    public final boolean f;
    public final agkz g;
    public final Optional h;
    public final Range i;
    public final Optional j;
    public final Size k;
    public final xsc l;

    public uqv(UUID uuid, Size size, augy augyVar, urn urnVar, boolean z, boolean z2, agkz agkzVar, Optional optional, Range range, xsc xscVar, Optional optional2, Size size2) {
        this.a = uuid;
        this.b = size;
        this.c = augyVar;
        this.d = urnVar;
        this.e = z;
        this.f = z2;
        this.g = agkzVar;
        this.h = optional;
        this.i = range;
        this.l = xscVar;
        this.j = optional2;
        this.k = size2;
    }

    public final Size a() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqv) {
            uqv uqvVar = (uqv) obj;
            if (this.a.equals(uqvVar.a) && this.b.equals(uqvVar.b) && this.c.equals(uqvVar.c) && this.d.equals(uqvVar.d) && this.e == uqvVar.e && this.f == uqvVar.f && this.g.equals(uqvVar.g) && this.h.equals(uqvVar.h) && this.i.equals(uqvVar.i) && this.l.equals(uqvVar.l) && this.j.equals(uqvVar.j) && this.k.equals(uqvVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        Size size = this.k;
        Optional optional = this.j;
        xsc xscVar = this.l;
        Range range = this.i;
        Optional optional2 = this.h;
        agkz agkzVar = this.g;
        urn urnVar = this.d;
        augy augyVar = this.c;
        Size size2 = this.b;
        return "FocusedState{referenceId=" + String.valueOf(this.a) + ", boundSize=" + String.valueOf(size2) + ", initialProto=" + String.valueOf(augyVar) + ", cumulativeMotionEventDiff=" + String.valueOf(urnVar) + ", isTapPossible=" + this.e + ", highlightTrashCan=" + this.f + ", activeGuidelines=" + String.valueOf(agkzVar) + ", activeGhostOverlayData=" + String.valueOf(optional2) + ", scaleRange=" + String.valueOf(range) + ", guidelineHelper=" + String.valueOf(xscVar) + ", ghostOverlayHelper=" + String.valueOf(optional) + ", playerDimensions=" + String.valueOf(size) + '}';
    }

    public uqv() {
        throw null;
    }
}
