package defpackage;

import j$.util.Objects;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uom extends ept {
    public final uoi a;
    public final File b;
    public final uop c;
    public final uoj d;

    public uom(uoi uoiVar, File file, uop uopVar, uoj uojVar) {
        this.a = uoiVar;
        this.b = file;
        this.c = uopVar;
        this.d = uojVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uom)) {
            return false;
        }
        uom uomVar = (uom) obj;
        return Objects.equals(this.a, uomVar.a) && Objects.equals(this.b, uomVar.b) && Objects.equals(this.c, uomVar.c) && Objects.equals(this.d, uomVar.d);
    }

    public final int hashCode() {
        return yno.E(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d};
        String[] strArrSplit = "imageEditQuery;ttlCacheImageFile;feedbackStatus;generationResult".split(";");
        StringBuilder sb = new StringBuilder("uom[");
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
