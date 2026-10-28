package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxg {
    public final long a;
    public final long b;
    public final long c;

    public wxg(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        long j = this.c;
        if (j > 5000) {
            return j - 5000;
        }
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wxg) {
            wxg wxgVar = (wxg) obj;
            if (this.a == wxgVar.a && this.b == wxgVar.b && this.c == wxgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) ((j2 >>> 32) ^ j2);
        long j3 = (j >>> 32) ^ j;
        long j4 = this.b;
        return ((((i ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) j3);
    }

    public final String toString() {
        return "LiveChatHighEngagementState{millisSinceLastUserTyping=" + this.a + ", millisSinceLastBuyFlowInteraction=" + this.b + ", millisSinceLastBuyButtonClick=" + this.c + '}';
    }

    public wxg() {
        throw null;
    }
}
