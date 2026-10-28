package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wlr extends ept {
    public final MessageLite a;
    public final Optional b;

    public wlr(MessageLite messageLite, Optional optional) {
        this.a = messageLite;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wlr)) {
            return false;
        }
        wlr wlrVar = (wlr) obj;
        return Objects.equals(this.a, wlrVar.a) && Objects.equals(this.b, wlrVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "response;futResult".split(";");
        StringBuilder sb = new StringBuilder("wlr[");
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
