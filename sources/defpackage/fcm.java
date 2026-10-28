package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcm implements fco {
    private final /* synthetic */ int $cid;
    private final Object a;

    public fcm(Resources resources, int i) {
        this.$cid = i;
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.a = resources;
    }

    @Override // defpackage.fco
    public final ewf a(ewf ewfVar, ety etyVar) {
        if (this.$cid == 0) {
            return fbd.f((Resources) this.a, ewfVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) ewfVar.c()).compress((Bitmap.CompressFormat) this.a, 100, byteArrayOutputStream);
        ewfVar.e();
        return new fbu(byteArrayOutputStream.toByteArray(), 0);
    }

    public fcm(int i) {
        this.$cid = i;
        this.a = Bitmap.CompressFormat.JPEG;
    }
}
