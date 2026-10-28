package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ackh {
    public final Context a;
    public final alay b;
    public final ackf c;

    public ackh(Context context, alay alayVar, ackf ackfVar) {
        this.a = context;
        this.b = alayVar;
        this.c = ackfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ackh) {
            ackh ackhVar = (ackh) obj;
            Context context = this.a;
            if (context != null ? context.equals(ackhVar.a) : ackhVar.a == null) {
                alay alayVar = this.b;
                if (alayVar != null ? alayVar.equals(ackhVar.b) : ackhVar.b == null) {
                    if (this.c.equals(ackhVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.a;
        int iHashCode = context == null ? 0 : context.hashCode();
        alay alayVar = this.b;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (alayVar != null ? alayVar.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ackf ackfVar = this.c;
        alay alayVar = this.b;
        return "FormattedStringDecorator{context=" + String.valueOf(this.a) + ", formattedString=" + String.valueOf(alayVar) + ", commandSpanFactory=" + ackfVar.toString() + '}';
    }
}
