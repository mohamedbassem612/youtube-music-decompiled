package defpackage;

import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xoc implements xoh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/discovery/DialYouTubeTvLauncher");
    final xob b;
    private final tft c;
    private final awmd d;
    private final agke e;
    private final boolean f;
    private final boolean g;
    private final vxz h;
    private final xpl i;

    static {
        twu.b("MDX.".concat(String.valueOf(xoc.class.getCanonicalName())));
    }

    public xoc(xwh xwhVar, tft tftVar, awmd awmdVar, xpl xplVar, xla xlaVar, vxz vxzVar) {
        this.c = tftVar;
        this.d = awmdVar;
        this.i = xplVar;
        this.h = vxzVar;
        agke agkeVarQ = xlaVar.Q();
        this.e = agkeVarQ;
        this.f = xlaVar.aw();
        this.g = xlaVar.aq();
        HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
        handlerThread.start();
        this.b = new xob(handlerThread.getLooper(), xwhVar, agkeVarQ);
    }

    @Override // defpackage.xoh
    public final void a() {
        this.b.removeMessages(1);
    }

    @Override // defpackage.xoh
    public final void b(Uri uri) {
        String string = uri.toString();
        tge tgeVar = new tge();
        tgeVar.a = 4;
        tgeVar.b = string;
        tgeVar.c("Origin", "package:com.google.android.youtube");
        if (this.h.m(14, 45627566L)) {
            tgeVar.d(tok.MDX_DISCOVERY_DIAL_YT_TV_LAUNCHER);
        }
        yno.cL(this.c, tgeVar.a(), new xoa(0));
    }

    public final void c(tge tgeVar, StringBuilder sb, String str, xwc xwcVar, yaa yaaVar) {
        if (!TextUtils.isEmpty(str)) {
            agrx agrxVar = agso.a;
            sb.append(str);
        }
        if (this.f) {
            sb.append("&cfm=1");
        }
        String string = sb.toString();
        Charset charset = StandardCharsets.UTF_8;
        if (charset == null) {
            charset = tfs.a;
        }
        tgeVar.d = tgd.e(string.getBytes(charset), "text/plain; charset=".concat(String.valueOf(String.valueOf(charset))));
        if (this.h.m(14, 45627566L)) {
            tgeVar.d(tok.MDX_DISCOVERY_DIAL_YT_TV_LAUNCHER);
        }
        tgf tgfVarA = tgeVar.a();
        yno.cL(this.c, tgfVarA, new xnz(this, xwcVar, yaaVar, Uri.parse(tgfVarA.a).getHost()));
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [awut, java.lang.Object] */
    @Override // defpackage.xoh
    public final void d(Uri uri, xyv xyvVar, yaa yaaVar) {
        xwc xwcVar = new xwc(tym.l());
        tge tgeVarB = tgf.b(uri.toString());
        tgeVarB.c("Content-Type", "text/plain; charset=\"utf-8\"");
        tgeVarB.c("Origin", "package:com.google.android.youtube");
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("pairingCode", xwcVar.b);
        if (this.g) {
            builder.appendQueryParameter("theme", "cl");
            builder.appendQueryParameter("topic", "music");
        } else {
            builder.appendQueryParameter("theme", "m");
        }
        if (xyvVar.e()) {
            builder.appendQueryParameter("dialLaunch", "watch");
        } else {
            builder.appendQueryParameter("dialLaunch", "browse");
        }
        StringBuilder sb = new StringBuilder(builder.build().toString().replaceFirst("\\?", ""));
        sb.append(((ydy) this.d.io()).h);
        xpl xplVar = this.i;
        ahng.x(awrc.ag(xplVar.b, awov.a, new dnz(xplVar, (awoq) null, 19)), new xny(this, tgeVarB, sb, xwcVar, yaaVar), MoreExecutors.directExecutor());
    }
}
