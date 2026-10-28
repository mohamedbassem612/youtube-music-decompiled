package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ysu extends ept {
    public final awmd a;
    public final Executor b;
    public final yre c;

    public ysu(awmd awmdVar, Executor executor, yre yreVar) {
        this.a = awmdVar;
        this.b = executor;
        this.c = yreVar;
    }

    public final boolean equals(Object obj) {
        return t(obj);
    }

    public final int hashCode() {
        return a.A(this.a, this.b, this.c);
    }

    public final /* synthetic */ boolean t(Object obj) {
        if (obj instanceof ysu) {
            ysu ysuVar = (ysu) obj;
            if (Objects.equals(this.a, ysuVar.a) && Objects.equals(this.b, ysuVar.b) && Objects.equals(this.c, ysuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "dataSourceProvider;executor;onesieNetworkRequestListener".split(";");
        StringBuilder sb = new StringBuilder("ysu[");
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
