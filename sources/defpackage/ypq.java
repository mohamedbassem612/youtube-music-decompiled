package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypq {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final ywn f;
    public final cuz g;
    public final wgs h;
    public final Optional i;
    public final xxj j;

    public ypq(Long l, Long l2, Long l3, Long l4, xxj xxjVar, boolean z, ywn ywnVar, cuz cuzVar, wgs wgsVar, Optional optional) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.j = xxjVar;
        this.e = z;
        this.f = ywnVar;
        this.g = cuzVar;
        this.h = wgsVar;
        this.i = optional;
    }

    public static ypp a() {
        ypp yppVar = new ypp();
        yppVar.d(false);
        yppVar.i(ywn.b);
        return yppVar;
    }

    public final boolean equals(Object obj) {
        cuz cuzVar;
        wgs wgsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ypq) {
            ypq ypqVar = (ypq) obj;
            Long l = this.a;
            if (l != null ? l.equals(ypqVar.a) : ypqVar.a == null) {
                Long l2 = this.b;
                if (l2 != null ? l2.equals(ypqVar.b) : ypqVar.b == null) {
                    Long l3 = this.c;
                    if (l3 != null ? l3.equals(ypqVar.c) : ypqVar.c == null) {
                        Long l4 = this.d;
                        if (l4 != null ? l4.equals(ypqVar.d) : ypqVar.d == null) {
                            xxj xxjVar = this.j;
                            if (xxjVar != null ? xxjVar.equals(ypqVar.j) : ypqVar.j == null) {
                                if (this.e == ypqVar.e && this.f.equals(ypqVar.f) && ((cuzVar = this.g) != null ? cuzVar.equals(ypqVar.g) : ypqVar.g == null) && ((wgsVar = this.h) != null ? wgsVar.equals(ypqVar.h) : ypqVar.h == null) && this.i.equals(ypqVar.i)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.b;
        int iHashCode2 = (((iHashCode ^ 1000003) * 1000003) ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.d;
        int iHashCode4 = iHashCode3 ^ (l4 == null ? 0 : l4.hashCode());
        xxj xxjVar = this.j;
        int iHashCode5 = ((((((iHashCode4 * (-721379959)) ^ (xxjVar == null ? 0 : xxjVar.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003;
        cuz cuzVar = this.g;
        int iHashCode6 = (iHashCode5 ^ (cuzVar == null ? 0 : cuzVar.hashCode())) * 1000003;
        wgs wgsVar = this.h;
        return ((iHashCode6 ^ (wgsVar != null ? wgsVar.hashCode() : 0)) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        Optional optional = this.i;
        wgs wgsVar = this.h;
        cuz cuzVar = this.g;
        ywn ywnVar = this.f;
        return "RequestData{mediaStartTimeMs=" + this.a + ", mediaDurationMs=" + this.b + ", formatBitrateBps=" + this.c + ", playbackPositionMillis=" + this.d + ", timeSinceLastSeekOrJoinMillis=null, umpPartListener=" + String.valueOf(this.j) + ", forceRequestIdempotent=" + this.e + ", qoeLogger=" + String.valueOf(ywnVar) + ", chunkIndex=" + String.valueOf(cuzVar) + ", formatStreamModel=" + String.valueOf(wgsVar) + ", trafficTag=" + String.valueOf(optional) + '}';
    }

    public ypq() {
        throw null;
    }
}
