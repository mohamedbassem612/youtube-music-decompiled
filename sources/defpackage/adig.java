package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adig implements eua {
    private final /* synthetic */ int $cid;
    private final Object a;

    public adig(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ewn, java.lang.Object] */
    @Override // defpackage.eua
    public final /* synthetic */ ewf a(Object obj, int i, int i2, ety etyVar) {
        if (this.$cid == 0) {
            return ezw.f((Bitmap) ((adif) obj).a, this.a);
        }
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        byte[] bArr = (byte[]) ((ewv) this.a).a(65536, byte[].class);
        while (true) {
            try {
                int i3 = inputStream.read(bArr, 0, bArr.length);
                if (i3 == -1) {
                    byteArrayOutputStream.flush();
                    ((ewv) this.a).c(bArr);
                    return new fbu(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            } catch (Throwable th) {
                ((ewv) this.a).c(bArr);
                throw th;
            }
        }
    }

    @Override // defpackage.eua
    public final /* synthetic */ boolean b(Object obj, ety etyVar) {
        if (this.$cid != 0) {
        }
        return true;
    }
}
