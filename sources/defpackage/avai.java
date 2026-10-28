package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avai {
    public final List a;
    public final auyo b;
    public final Object[][] c;

    public avai(List list, auyo auyoVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        auyoVar.getClass();
        this.b = auyoVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("addrs", this.a);
        ageuVarAc.b("attrs", this.b);
        ageuVarAc.b("customOptions", Arrays.deepToString(this.c));
        return ageuVarAc.toString();
    }
}
