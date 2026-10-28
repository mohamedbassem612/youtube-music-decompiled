package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyh implements eyw {
    private final /* synthetic */ int $cid;
    private final Object a;

    public eyh(int i) {
        this.$cid = i;
        this.a = new ept(null);
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        int i = this.$cid;
        if (i == 0) {
            return new eyr(this.a, 1);
        }
        if (i == 1) {
            return new eyz(1);
        }
        Object obj = this.a;
        if (i != 2) {
            return new eyg((Context) obj, ezaVar.a(Integer.class, InputStream.class), 3);
        }
        return new eyg((Context) obj, ezaVar.a(Integer.class, AssetFileDescriptor.class), 3);
    }

    public eyh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
