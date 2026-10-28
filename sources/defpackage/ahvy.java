package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvy {
    public final long a;
    public final awmd b;
    public long c = -1;
    public final LinkedHashMap d = new LinkedHashMap(aguu.k(100));
    public ArrayList e = new ArrayList();

    public ahvy(long j, awmd awmdVar) {
        this.a = j;
        this.b = awmdVar;
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = this.e;
        this.e = new ArrayList();
        return arrayList;
    }
}
