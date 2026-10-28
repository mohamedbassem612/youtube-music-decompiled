package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fbu implements ewf {
    private final /* synthetic */ int $cid;
    private final Object a;

    public fbu(byte[] bArr, int i) {
        this.$cid = i;
        gzj.bM(bArr);
        this.a = bArr;
    }

    @Override // defpackage.ewf
    public final int a() {
        int i = this.$cid;
        Object obj = this.a;
        return i != 0 ? ffs.a((Bitmap) obj) : ((byte[]) obj).length;
    }

    @Override // defpackage.ewf
    public final Class b() {
        return this.$cid != 0 ? Bitmap.class : byte[].class;
    }

    @Override // defpackage.ewf
    public final /* synthetic */ Object c() {
        return this.a;
    }

    public fbu(Bitmap bitmap, int i) {
        this.$cid = i;
        this.a = bitmap;
    }

    @Override // defpackage.ewf
    public final void e() {
    }
}
