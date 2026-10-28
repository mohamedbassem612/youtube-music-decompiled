package defpackage;

import android.graphics.Bitmap;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upj {
    public static final syx a;
    private static final long d;
    public final ahex b;
    public final syw c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = 86400L;
        a = new syx(1, "media_gen_image_cache", Duration.ofSeconds(86400L));
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
    }

    public upj(qcb qcbVar, ahex ahexVar, vxz vxzVar) {
        this.b = ahexVar;
        if (vxzVar.l(322, 45849203L, false)) {
            this.c = qcbVar.z(a);
        } else {
            this.c = qcbVar.A(1, "media_gen_image_cache", d);
        }
    }
}
