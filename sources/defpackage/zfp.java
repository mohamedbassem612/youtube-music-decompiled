package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfp {
    public static final zfp a = new zfp(new byte[]{116, 101, 115, 116});
    public final byte[] b;
    private llw c;

    public zfp(llw llwVar) {
        this.b = llwVar.a;
        this.c = llwVar;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final String toString() {
        return new String(this.b, StandardCharsets.UTF_8);
    }

    public zfp(byte[] bArr) {
        this.b = bArr;
    }
}
