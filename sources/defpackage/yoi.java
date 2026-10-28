package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yoi extends ept {
    public final wgo[] a;
    public final Map b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final yoc j;

    public yoi(yoc yocVar, wgo[] wgoVarArr, Map map, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.j = yocVar;
        this.a = wgoVarArr;
        this.b = map;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yoi)) {
            return false;
        }
        yoi yoiVar = (yoi) obj;
        return this.c == yoiVar.c && this.e == yoiVar.e && this.f == yoiVar.f && this.g == yoiVar.g && this.h == yoiVar.h && this.i == yoiVar.i && Objects.equals(this.j, yoiVar.j) && Objects.equals(this.a, yoiVar.a) && Objects.equals(this.b, yoiVar.b) && Objects.equals(this.d, yoiVar.d);
    }

    public final int hashCode() {
        int iAj = a.aj(this.c);
        yoc yocVar = this.j;
        boolean z = this.i;
        boolean z2 = this.h;
        boolean z3 = this.g;
        return (((((((((((((((((iAj * 31) + a.aj(this.e)) * 31) + a.aj(this.f)) * 31) + a.aj(z3)) * 31) + a.aj(z2)) * 31) + a.aj(z)) * 31) + Objects.hashCode(yocVar)) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.d);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.j, this.a, this.b, Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i)};
        String[] strArrSplit = "formatFilterConfig;availableAudioTracks;spatialBitmaskMap;createForOnesieCompatibilityCheck;resolvedAudioTrackId;audioOnly;spatialAudioSupported;canBeSpatialized;hasAllOfflineAudio;ssffConstrainToOfflineMutatedStreamingData".split(";");
        StringBuilder sb = new StringBuilder("yoi[");
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
}
