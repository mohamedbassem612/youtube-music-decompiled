package defpackage;

import com.google.android.libraries.youtube.media.interfaces.HttpRequest;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ysv extends ept {
    public final HttpRequest a;

    public ysv(HttpRequest httpRequest) {
        this.a = httpRequest;
    }

    public final boolean equals(Object obj) {
        return t(obj);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final /* synthetic */ boolean t(Object obj) {
        return (obj instanceof ysv) && Objects.equals(this.a, ((ysv) obj).a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "httpRequest".split(";");
        StringBuilder sb = new StringBuilder("ysv[");
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
