package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jfp extends ezx {
    private final awlo b;
    private final adhl c;

    public jfp(awlo awloVar, adhl adhlVar) {
        this.b = awloVar;
        this.c = adhlVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        adhl adhlVar = this.c;
        if (adhlVar != null) {
            adhlVar.a(messageDigest);
        }
    }

    @Override // defpackage.ezx
    public final Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2) {
        awlo awloVar = this.b;
        awloVar.kk(bitmap);
        awloVar.kn();
        adhl adhlVar = this.c;
        return adhlVar != null ? adhlVar.c(ewnVar, bitmap, i, i2) : bitmap;
    }
}
