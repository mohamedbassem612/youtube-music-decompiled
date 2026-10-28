package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tev {
    private final tew a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final long e;
    private final int f;
    private final int g;
    private final int h;

    public /* synthetic */ tev(int i, tew tewVar, boolean z, boolean z2, int i2, boolean z3, long j, int i3, int i4) {
        i2 = (i4 & 16) != 0 ? 1 : i2;
        if (i2 == 0) {
            throw null;
        }
        int i5 = i4 & SemanticState.Focused;
        int i6 = i4 & 64;
        int i7 = i4 & 4;
        int i8 = i4 & 8;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = i7 == 0;
        boolean z6 = i8 == 0;
        int i9 = i5 == 0 ? i3 : 0;
        long j2 = i6 != 0 ? 0L : j;
        this.g = i;
        this.a = tewVar;
        this.b = z5 & z;
        this.c = z6 & z2;
        this.h = i2;
        this.d = z4 & z3;
        this.e = j2;
        this.f = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tev) {
            tev tevVar = (tev) obj;
            if (this.g == tevVar.g && this.a == tevVar.a && this.b == tevVar.b && this.c == tevVar.c && this.h == tevVar.h && this.d == tevVar.d && this.e == tevVar.e && this.f == tevVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.g * 31) + this.a.hashCode()) * 31) + a.aj(this.b)) * 31) + a.aj(this.c)) * 31) + this.h) * 31) + a.aj(this.d)) * 31) + a.ak(this.e)) * 31) + this.f;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("TrimFrameworkDetails(eventPhase=");
        int i = this.g;
        if (i != 3) {
            str = i != 4 ? "EVENT_PHASE_TRIM_CANCELLED_BY_ESCALATION" : "EVENT_PHASE_TRIM_THROTTLED";
        } else {
            str = "EVENT_PHASE_TRIM_COMPLETED";
        }
        sb.append((Object) str);
        sb.append(", resultedTrimLevel=");
        sb.append(this.a);
        sb.append(", isEscalated=");
        sb.append(this.b);
        sb.append(", isThrottled=");
        sb.append(this.c);
        sb.append(", suppressionReason=");
        int i2 = this.h;
        if (i2 != 1) {
            str2 = i2 != 2 ? "SUPPRESSION_REASON_HIGHER_LEVEL_ACTIVE" : "SUPPRESSION_REASON_COOLDOWN_ACTIVE";
        } else {
            str2 = "SUPPRESSION_REASON_NONE";
        }
        sb.append((Object) str2);
        sb.append(", wasInline=");
        sb.append(this.d);
        sb.append(", trimDurationMs=");
        sb.append(this.e);
        sb.append(", trimmersExecutedCount=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
