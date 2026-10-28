package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acss extends ept implements acsu {
    public final ajwo a;
    public final wjf b;
    public final boolean c = false;

    public acss(ajwo ajwoVar, wjf wjfVar, boolean z) {
        this.a = ajwoVar;
        this.b = wjfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acss)) {
            return false;
        }
        acss acssVar = (acss) obj;
        boolean z = acssVar.c;
        return Objects.equals(this.a, acssVar.a) && Objects.equals(this.b, acssVar.b);
    }

    public final int hashCode() {
        return (((a.aj(false) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Boolean.FALSE};
        String[] strArrSplit = "requestEndpoint;response;isImmediatePrefetch".split(";");
        StringBuilder sb = new StringBuilder("acss[");
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
