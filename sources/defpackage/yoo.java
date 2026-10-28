package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yoo extends ept {
    public final yoc a;
    public final float b;
    public final wiw[] c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    private final wgo[] h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    public yoo(yoc yocVar, float f, wiw[] wiwVarArr, wgo[] wgoVarArr, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6) {
        this.a = yocVar;
        this.b = f;
        this.c = wiwVarArr;
        this.h = wgoVarArr;
        this.i = z;
        this.j = z2;
        this.d = z3;
        this.e = str;
        this.k = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yoo)) {
            return false;
        }
        yoo yooVar = (yoo) obj;
        return this.i == yooVar.i && this.j == yooVar.j && this.d == yooVar.d && this.k == yooVar.k && this.f == yooVar.f && this.g == yooVar.g && Float.compare(this.b, yooVar.b) == 0 && Objects.equals(this.a, yooVar.a) && Objects.equals(this.c, yooVar.c) && Objects.equals(this.h, yooVar.h) && Objects.equals(this.e, yooVar.e);
    }

    public final int hashCode() {
        int iAj = a.aj(this.i);
        float f = this.b;
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.k;
        return (((((((((((((((((((iAj * 31) + a.aj(this.j)) * 31) + a.aj(this.d)) * 31) + a.aj(z3)) * 31) + a.aj(z2)) * 31) + a.aj(z)) * 31) + Float.floatToIntBits(f)) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.e);
    }

    final boolean t() {
        return !this.a.g.c();
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Float.valueOf(this.b), this.c, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.k), Boolean.valueOf(this.f), Boolean.valueOf(this.g)};
        String[] strArrSplit = "formatFilterConfig;maxFrameRateForVideoFormats;availableVideoQualities;availableAudioTracks;hasVideoFormatsWithAssociatedAudioTrack;createForOnesieCompatibilityCheck;hasVideo;resolvedAudioTrackId;audioOnly;hasAllOfflineVideo;ssffConstrainToOfflineMutatedStreamingData".split(";");
        StringBuilder sb = new StringBuilder("yoo[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    final boolean u() {
        return this.j && this.a.c(SemanticState.Hidden) && this.h.length > 1 && this.i;
    }
}
