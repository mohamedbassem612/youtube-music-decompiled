package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adiu implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ adiu(GlideImageLoggerImpl glideImageLoggerImpl, String str, long j, int i, int i2) {
        this.$cid = i2;
        this.d = glideImageLoggerImpl;
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            adiw adiwVar = (adiw) ((GlideImageLoggerImpl) this.d).e.get(this.a);
            if (adiwVar == null || adiwVar.f != 0) {
                return;
            }
            int i = this.c;
            adiwVar.f = this.b;
            adiwVar.c = i;
            adiwVar.g = true;
            return;
        }
        StringBuilder sb = new StringBuilder("https://www.youtube.com/error_204?source=heartbeat&timestamp=");
        sb.append(this.b);
        sb.append("&requestID=");
        sb.append(this.a);
        sb.append("&triggerType=");
        int i2 = this.c;
        sb.append(atqp.L(i2));
        Uri uri = Uri.parse(sb.toString());
        xfn xfnVar = (xfn) this.d;
        awmd awmdVar = xfnVar.d;
        zxi zxiVar = new zxi(1, atqp.L(i2));
        zxiVar.b(uri);
        zxiVar.d = true;
        zxiVar.g = xfnVar.g;
        zxiVar.h = xfnVar.l.aD(xfnVar.g);
        zxiVar.a(tok.HTTP_PING_VIDEO_STATS_2_CLIENT);
        ((zxj) awmdVar.io()).b((zrx) xfnVar.e.io(), zxiVar, new xkj(1));
    }

    public /* synthetic */ adiu(xfn xfnVar, long j, String str, int i, int i2) {
        this.$cid = i2;
        this.d = xfnVar;
        this.b = j;
        this.a = str;
        this.c = i;
    }
}
