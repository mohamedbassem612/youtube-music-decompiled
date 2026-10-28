package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbe implements eua {
    private final /* synthetic */ int $cid;
    private final Object a;

    public fbe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [ewn, java.lang.Object] */
    @Override // defpackage.eua
    public final /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        int i3 = this.$cid;
        if (i3 == 0) {
            fap fapVar = (fap) this.a;
            return fapVar.a(new fba((ParcelFileDescriptor) obj, fapVar.h, fapVar.i), i, i2, etyVar, fap.g);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return i3 != 3 ? ezw.f(((eta) obj).a(), this.a) : pj.P(ImageDecoder.createSource(fff.a((InputStream) obj, false)), i, i2, etyVar);
            }
            return pj.P(ImageDecoder.createSource((ByteBuffer) obj), i, i2, etyVar);
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        fap fapVar2 = (fap) this.a;
        dov dovVar = fapVar2.j;
        return fapVar2.a(new fay(byteBuffer, fapVar2.h, fapVar2.i, dovVar != null && dovVar.m(ero.class)), i, i2, etyVar, fap.g);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eua
    public final /* synthetic */ boolean b(Object obj, ety etyVar) {
        int i = this.$cid;
        if (i == 0) {
            return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && euv.d();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return pj.Q(ept.b(((pj) this.a).a, (ByteBuffer) obj));
        }
        if (i != 3) {
            return true;
        }
        pj pjVar = (pj) this.a;
        return pj.Q(ept.g(pjVar.a, (InputStream) obj, (ewv) pjVar.b));
    }
}
