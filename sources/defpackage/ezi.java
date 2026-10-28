package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezi implements eyw {
    public static final ezi a = new ezi(1, null);
    private final /* synthetic */ int $cid;

    public ezi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        int i = this.$cid;
        if (i == 0) {
            return new ezj(ezaVar.a(eyl.class, InputStream.class));
        }
        if (i != 1) {
            return i != 2 ? new adjn(ezaVar.a(Uri.class, InputStream.class)) : new ezd(ezaVar.a(eyl.class, InputStream.class), 2);
        }
        return eyz.a;
    }

    @Deprecated
    public ezi(int i, byte[] bArr) {
        this.$cid = i;
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
