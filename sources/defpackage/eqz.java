package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class eqz {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public eqz(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static eqz a(era eraVar) throws IOException {
        if (und.c(eraVar) != 538247942) {
            throw new IOException();
        }
        String strG = und.g(eraVar);
        String strG2 = und.g(eraVar);
        long jD = und.d(eraVar);
        long jD2 = und.d(eraVar);
        long jD3 = und.d(eraVar);
        long jD4 = und.d(eraVar);
        int iC = und.c(eraVar);
        if (iC < 0) {
            throw new IOException(a.bR(iC, "readHeaderList size="));
        }
        List arrayList = iC == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iC; i++) {
            arrayList.add(new eqc(und.g(eraVar).intern(), und.g(eraVar).intern()));
        }
        return new eqz(strG, strG2, jD, jD2, jD3, jD4, arrayList);
    }
}
