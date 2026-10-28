package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exy implements eyw {
    private final /* synthetic */ int $cid;

    public exy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        int i = this.$cid;
        if (i == 0) {
            return new ezd(new exx(0), 1);
        }
        if (i == 1) {
            return new ezd(new exx(1), 1);
        }
        if (i == 2) {
            return new eyb();
        }
        if (i != 3) {
            return i != 4 ? new ezd(ezaVar.a(Uri.class, InputStream.class), 0) : new ezd(ezaVar.a(Uri.class, ParcelFileDescriptor.class), 0);
        }
        return new ezd(ezaVar.a(Uri.class, AssetFileDescriptor.class), 0);
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
