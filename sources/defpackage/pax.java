package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pax {
    public final Long a;
    public final Long b;
    public Long c = 0L;
    public Long d = 0L;
    public Long e = 0L;
    public Long f = 0L;
    public Long g = 0L;
    public Long h = 0L;
    public final int i;

    public pax(Long l, Long l2, int i) {
        this.a = l;
        this.b = l2;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pax) {
            pax paxVar = (pax) obj;
            if (Objects.equals(this.a, paxVar.a) && Objects.equals(this.b, paxVar.b) && this.i == paxVar.i && Objects.equals(this.c, paxVar.c) && Objects.equals(this.d, paxVar.d) && Objects.equals(this.e, paxVar.e) && Objects.equals(this.f, paxVar.f) && Objects.equals(this.g, paxVar.g) && Objects.equals(this.h, paxVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.i), this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
