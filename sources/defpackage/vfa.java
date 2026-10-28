package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfa extends ept {
    public final akqy a;
    public final ukh b;
    public final auij c;
    public final vey d = null;

    public vfa(akqy akqyVar, ukh ukhVar, auij auijVar) {
        this.a = akqyVar;
        this.b = ukhVar;
        this.c = auijVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vfa)) {
            return false;
        }
        vfa vfaVar = (vfa) obj;
        if (!Objects.equals(this.a, vfaVar.a) || !Objects.equals(this.b, vfaVar.b) || !Objects.equals(this.c, vfaVar.c)) {
            return false;
        }
        vey veyVar = vfaVar.d;
        return Objects.equals(null, null);
    }

    public final int hashCode() {
        return yno.E(this.a, this.b, this.c, null);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, null};
        String[] strArrSplit = "editing;cropValues;editorState;croppedImageData".split(";");
        StringBuilder sb = new StringBuilder("vfa[");
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
