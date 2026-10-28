package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class absu {
    private static final Pattern d = Pattern.compile("bytes=(\\d*)-(\\d*)");
    public final long a;
    public final long b;
    public final long c;
    private final boolean e;

    private absu(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.e = z;
    }

    public static absu a(Header header, long j) {
        long j2 = (-1) + j;
        boolean z = false;
        long j3 = 0;
        if (header != null) {
            Matcher matcher = d.matcher(header.getValue());
            if (matcher.matches()) {
                z = true;
                String strGroup = matcher.group(1);
                j3 = TextUtils.isEmpty(strGroup) ? 0L : Long.parseLong(strGroup);
                String strGroup2 = matcher.group(2);
                if (!TextUtils.isEmpty(strGroup2)) {
                    j2 = Long.parseLong(strGroup2);
                }
            }
        }
        return new absu(j3, j2, j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r3 <= r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r7.e == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r8.setStatusCode(206);
        r8.setHeader("Content-Range", "bytes " + r7.a + '-' + r7.b + '/' + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r8.setStatusCode(200);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r3 < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(org.apache.http.HttpResponse r8) {
        /*
            r7 = this;
            long r0 = r7.c
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r3 = r7.a
            r5 = 0
            if (r2 != 0) goto L11
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L1f
            goto L57
        L11:
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L57
            long r5 = r7.b
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L57
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L57
        L1f:
            boolean r2 = r7.e
            if (r2 == 0) goto L50
            r2 = 206(0xce, float:2.89E-43)
            r8.setStatusCode(r2)
            long r2 = r7.a
            long r4 = r7.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r6 = "bytes "
            r7.<init>(r6)
            r7.append(r2)
            r2 = 45
            r7.append(r2)
            r7.append(r4)
            r2 = 47
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "Content-Range"
            r8.setHeader(r0, r7)
            goto L55
        L50:
            r7 = 200(0xc8, float:2.8E-43)
            r8.setStatusCode(r7)
        L55:
            r7 = 1
            goto L5d
        L57:
            r7 = 416(0x1a0, float:5.83E-43)
            r8.setStatusCode(r7)
            r7 = 0
        L5d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absu.b(org.apache.http.HttpResponse):boolean");
    }
}
