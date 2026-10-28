package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class etm implements ets {
    final /* synthetic */ euv a;
    final /* synthetic */ ewv b;

    public etm(euv euvVar, ewv ewvVar) {
        this.a = euvVar;
        this.b = ewvVar;
    }

    @Override // defpackage.ets
    public final ImageHeaderParser$ImageType a(etj etjVar) throws Throwable {
        fbg fbgVar;
        try {
            fbgVar = new fbg(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = etjVar.a(fbgVar);
                fbgVar.b();
                this.a.a();
                return imageHeaderParser$ImageTypeA;
            } catch (Throwable th) {
                th = th;
                if (fbgVar != null) {
                    fbgVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fbgVar = null;
        }
    }
}
