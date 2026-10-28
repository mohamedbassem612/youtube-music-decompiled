package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class etl implements ets {
    final /* synthetic */ ByteBuffer a;

    public etl(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.ets
    public final ImageHeaderParser$ImageType a(etj etjVar) {
        try {
            return etjVar.b(this.a);
        } finally {
            fff.b(this.a);
        }
    }
}
