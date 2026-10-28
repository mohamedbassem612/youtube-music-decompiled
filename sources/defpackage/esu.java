package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class esu {
    public final String a;
    public final long[] b;
    public boolean c;
    final /* synthetic */ esw d;
    public rvp e;

    public esu(esw eswVar, String str) {
        this.d = eswVar;
        str.getClass();
        this.a = str;
        this.b = new long[eswVar.d];
    }

    public static final IOException e(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return sb.toString();
            }
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
            i = 1;
        }
    }

    public final File c() {
        return new File(this.d.a, this.a.concat(".0"));
    }

    public final File d() {
        return new File(this.d.a, this.a.concat(".0.tmp"));
    }
}
