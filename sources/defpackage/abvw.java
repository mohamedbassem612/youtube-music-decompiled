package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abvw extends ept {
    public final abvz a;
    public final abug b;
    public final wjf c;

    public abvw(abvz abvzVar, abug abugVar, wjf wjfVar) {
        this.a = abvzVar;
        this.b = abugVar;
        this.c = wjfVar;
    }

    public final boolean equals(Object obj) {
        return t(obj);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final /* synthetic */ boolean t(Object obj) {
        if (obj instanceof abvw) {
            abvw abvwVar = (abvw) obj;
            if (Objects.equals(this.a, abvwVar.a) && Objects.equals(this.b, abvwVar.b) && Objects.equals(this.c, abvwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "videoPlaybackItem;prefetchContext;playerResponseModel".split(";");
        StringBuilder sb = new StringBuilder("abvw[");
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
