package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcb implements eua {
    private final /* synthetic */ int $cid;

    public fcb(int i) {
        this.$cid = i;
    }

    @Override // defpackage.eua
    public final /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        int i3 = this.$cid;
        if (i3 != 0) {
            return i3 != 1 ? new ezq((File) obj) : new fbu((Bitmap) obj, 1);
        }
        return fbz.g((Drawable) obj);
    }

    @Override // defpackage.eua
    public final /* synthetic */ boolean b(Object obj, ety etyVar) {
        int i = this.$cid;
        if (i == 0) {
        } else if (i != 1) {
        }
        return true;
    }
}
