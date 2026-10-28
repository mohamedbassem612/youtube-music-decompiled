package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eog {
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public eog(eof eofVar) {
        this.a = eofVar.a;
        this.b = eofVar.b;
        this.c = eofVar.c;
        this.d = eofVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eog) {
            eog eogVar = (eog) obj;
            if (this.c == eogVar.c && Objects.equals(this.a, eogVar.a) && Objects.equals(this.b, eogVar.b) && Objects.equals(this.d, eogVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingRequestContext{libraryVersion='");
        sb.append(this.a);
        sb.append("', libraryWrapperVersion='");
        sb.append(this.b);
        sb.append("', billingClientSessionId=");
        sb.append(this.c);
        sb.append(", accountName=");
        sb.append(this.d == null ? "null" : "'<redacted>'");
        sb.append('}');
        return sb.toString();
    }
}
