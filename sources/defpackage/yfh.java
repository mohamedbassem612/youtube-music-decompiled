package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfh extends ept {
    public final String a;
    public final FormatIdOuterClass$FormatId b;
    public final int c;

    public yfh(String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, int i) {
        this.a = str;
        this.b = formatIdOuterClass$FormatId;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yfh)) {
            return false;
        }
        yfh yfhVar = (yfh) obj;
        return this.c == yfhVar.c && Objects.equals(this.a, yfhVar.a) && Objects.equals(this.b, yfhVar.b);
    }

    public final int hashCode() {
        return (((this.c * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String t() {
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = this.b;
        return zik.bu(this.a, formatIdOuterClass$FormatId.c, formatIdOuterClass$FormatId.e, formatIdOuterClass$FormatId.d);
    }

    public final String toString() {
        return t() + '.' + this.c;
    }
}
