package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aawq extends aaxc {
    private final String a;

    public aawq(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
    }

    @Override // defpackage.aaxc
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaxc) {
            return this.a.equals(((aaxc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OfflineDrmSessionExpirationUpdateEvent{videoId=" + this.a + '}';
    }
}
