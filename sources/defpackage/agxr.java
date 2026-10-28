package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agxr {
    private static final agxo a;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r0 = defpackage.agxn.INSTANCE;
     */
    static {
        /*
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "amd64"
            boolean r0 = j$.util.Objects.equals(r0, r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L20
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            agxq r0 = defpackage.agxq.a     // Catch: java.lang.Throwable -> L20
            goto L22
        L1d:
            agxq r0 = defpackage.agxq.b     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            agxn r0 = defpackage.agxn.INSTANCE
        L22:
            defpackage.agxr.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxr.<clinit>():void");
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static long b(byte[] bArr, int i) {
        return a.a(bArr, i);
    }
}
