package defpackage;

import android.support.rastermill.FrameSequence;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzz implements eua {
    private final List a;
    private final ewn b;
    private final ewv c;

    public nzz(List list, ewn ewnVar, ewv ewvVar) {
        this.a = list;
        this.b = ewnVar;
        this.c = ewvVar;
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        return c((InputStream) obj);
    }

    @Override // defpackage.eua
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ety etyVar) {
        return ept.g(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.ANIMATED_WEBP;
    }

    public final ewf c(InputStream inputStream) {
        return new oaa(FrameSequence.decodeStream(inputStream), this.b);
    }
}
