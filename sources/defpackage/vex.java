package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vex extends ept {
    public final Uri a;
    public final aigj b;

    public vex(Uri uri, aigj aigjVar) {
        this.a = uri;
        this.b = aigjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vex)) {
            return false;
        }
        vex vexVar = (vex) obj;
        return Objects.equals(this.a, vexVar.a) && Objects.equals(this.b, vexVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "uri;serializedGeneratedMediaImage".split(";");
        StringBuilder sb = new StringBuilder("vex[");
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
