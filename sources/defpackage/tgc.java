package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tgc extends tgd {
    static final tgc a = new tgc();
    private static final byte[] d = new byte[0];

    private tgc() {
        super(0L, null);
    }

    @Override // defpackage.tgd
    public final InputStream a() {
        return new tpe(d, 0);
    }

    @Override // defpackage.tgd
    public final byte[] c() {
        return d;
    }
}
