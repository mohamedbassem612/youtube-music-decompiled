package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwn extends qwu {
    public static final qwn a = new qwn(qwo.a, -1, qwo.b);
    public final Duration b;
    public final int c;
    private final agke d;

    public qwn(Duration duration, int i, agke agkeVar) {
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.b = duration;
        this.c = i;
        if (agkeVar == null) {
            throw new NullPointerException("Null tracks");
        }
        this.d = agkeVar;
    }

    @Override // defpackage.qwu
    public final agke a() {
        return this.d;
    }

    public final /* synthetic */ Optional b() {
        return Collection.EL.stream(this.d).filter(new jmy(7)).findFirst();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qwn) {
            qwn qwnVar = (qwn) obj;
            if (this.b.equals(qwnVar.b) && this.c == qwnVar.c && aguu.v(this.d, qwnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.d;
        return "Metadata{duration=" + this.b.toString() + ", sampleRate=" + this.c + ", tracks=" + agkeVar.toString() + '}';
    }

    public qwn() {
        throw null;
    }
}
