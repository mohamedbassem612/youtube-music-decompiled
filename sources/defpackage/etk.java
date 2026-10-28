package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etk implements ets {
    final /* synthetic */ InputStream a;

    public etk(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.ets
    public final ImageHeaderParser$ImageType a(etj etjVar) throws IOException {
        try {
            return etjVar.a(this.a);
        } finally {
            this.a.reset();
        }
    }
}
