package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auyx implements auyy {
    public static final auyy a = new auyx(0);
    private final /* synthetic */ int $cid;

    public auyx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.auzj
    public final InputStream a(InputStream inputStream) {
        return this.$cid != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.auyz, defpackage.auzj
    public final String b() {
        return this.$cid != 0 ? "gzip" : "identity";
    }
}
