package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukq extends ept {
    public final usd a;
    public final vfs b;
    public final aeiv c;

    public ukq(usd usdVar, vfs vfsVar, aeiv aeivVar) {
        this.a = usdVar;
        this.b = vfsVar;
        this.c = aeivVar;
    }

    public final boolean equals(Object obj) {
        return u(obj);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final void t() {
        this.b.b(this.a.c());
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "mediaCompositionManager;shortsEditorProjectState;compositionHistory".split(";");
        StringBuilder sb = new StringBuilder("ukq[");
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

    public final /* synthetic */ boolean u(Object obj) {
        if (obj instanceof ukq) {
            ukq ukqVar = (ukq) obj;
            if (Objects.equals(this.a, ukqVar.a) && Objects.equals(this.b, ukqVar.b) && Objects.equals(this.c, ukqVar.c)) {
                return true;
            }
        }
        return false;
    }
}
