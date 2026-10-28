package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzy implements eua {
    private final List a;
    private final nzz b;

    public nzy(List list, ewn ewnVar, ewv ewvVar) {
        this.a = list;
        this.b = new nzz(list, ewnVar, ewvVar);
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        int i3 = fff.a;
        return this.b.c(new ffe((ByteBuffer) obj));
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        return ept.b(this.a, (ByteBuffer) obj) == ImageHeaderParser$ImageType.ANIMATED_WEBP;
    }
}
