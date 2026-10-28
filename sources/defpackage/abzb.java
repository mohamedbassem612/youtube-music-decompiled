package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzb extends ept {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g = "0";
    public final String h;
    public final String i;
    public final float j;
    public final float k;
    public final int l;
    public final String m;
    public final String n;
    public final agkj o;
    public final Optional p;
    public final int q;

    public abzb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f, float f2, int i, String str10, String str11, agkj agkjVar, Optional optional, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.h = str8;
        this.i = str9;
        this.j = f;
        this.k = f2;
        this.l = i;
        this.m = str10;
        this.n = str11;
        this.o = agkjVar;
        this.p = optional;
        this.q = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abzb)) {
            return false;
        }
        abzb abzbVar = (abzb) obj;
        return this.l == abzbVar.l && this.q == abzbVar.q && Float.compare(this.j, abzbVar.j) == 0 && Float.compare(this.k, abzbVar.k) == 0 && Objects.equals(this.a, abzbVar.a) && Objects.equals(this.b, abzbVar.b) && Objects.equals(this.c, abzbVar.c) && Objects.equals(this.d, abzbVar.d) && Objects.equals(this.e, abzbVar.e) && Objects.equals(this.f, abzbVar.f) && Objects.equals(this.g, abzbVar.g) && Objects.equals(this.h, abzbVar.h) && Objects.equals(this.i, abzbVar.i) && Objects.equals(this.m, abzbVar.m) && Objects.equals(this.n, abzbVar.n) && Objects.equals(this.o, abzbVar.o) && Objects.equals(this.p, abzbVar.p);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((this.l * 31) + this.q) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.m)) * 31) + Objects.hashCode(this.n)) * 31) + Objects.hashCode(this.o)) * 31) + Objects.hashCode(this.p);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Float.valueOf(this.j), Float.valueOf(this.k), Integer.valueOf(this.l), this.m, this.n, this.o, this.p, Integer.valueOf(this.q)};
        String[] strArrSplit = "startTimeString;endTimeString;connectionType;playerVisibility;subtitleId;userinducedAudioOnly;isBlackout;embargoStatusToken;muted;playbackRate;baselinePlaybackRate;volume;clipId;als;clientVssParams;multiAudioTrackId;seekSource".split(";");
        StringBuilder sb = new StringBuilder("abzb[");
        int i = 0;
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
