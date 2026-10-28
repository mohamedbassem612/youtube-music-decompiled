package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avaz extends avbb {
    private final avba d;

    public avaz(String str, avba avbaVar) {
        super(str, false);
        ahno.M(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        avbaVar.getClass();
        this.d = avbaVar;
    }

    @Override // defpackage.avbb
    public final Object a(byte[] bArr) {
        return this.d.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.avbb
    public final byte[] b(Object obj) {
        return this.d.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
