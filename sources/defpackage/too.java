package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class too {
    final String a;
    final long[] b;
    boolean c;
    ton d;
    final /* synthetic */ toq e;

    public too(toq toqVar, String str) {
        this.e = toqVar;
        this.a = str;
        this.b = new long[toqVar.b];
    }

    public static final IOException d(String[] strArr) throws IOException {
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

    public final File b() {
        return new File(this.e.a, String.valueOf(this.a).concat(".0"));
    }

    public final File c() {
        return new File(this.e.a, String.valueOf(this.a).concat(".0.tmp"));
    }
}
