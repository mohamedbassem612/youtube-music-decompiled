package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vez extends ept {
    public final qtt a;
    public final auij b;
    public final vex c;
    public final vey d = null;

    public vez(qtt qttVar, auij auijVar, vex vexVar) {
        this.a = qttVar;
        this.b = auijVar;
        this.c = vexVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vez)) {
            return false;
        }
        vez vezVar = (vez) obj;
        if (!Objects.equals(this.a, vezVar.a) || !Objects.equals(this.b, vezVar.b) || !Objects.equals(this.c, vezVar.c)) {
            return false;
        }
        vey veyVar = vezVar.d;
        return Objects.equals(null, null);
    }

    public final int hashCode() {
        return yno.E(this.a, this.b, this.c, null);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, null};
        String[] strArrSplit = "editableVideo;editorState;aiEditedImageData;croppedImageData".split(";");
        StringBuilder sb = new StringBuilder("vez[");
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
