package defpackage;

import android.net.Uri;
import android.util.Pair;
import j$.util.Optional;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xly implements xmb {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/browserchannel/HttpClientBrowserChannelClient");
    private static final Charset n = StandardCharsets.UTF_8;
    public final tft b;
    public final xln c;
    public final Uri d;
    public final Map e;
    public final boolean f;
    public volatile String g;
    public int h;
    public String i;
    public int j = 0;
    public int k;
    public boolean l;
    public final vxz m;
    private final tft o;
    private final awmd p;
    private final xvh q;
    private final Map r;

    public xly(String str, awmd awmdVar, xvh xvhVar, Map map, Map map2, tft tftVar, tft tftVar2, boolean z, vxz vxzVar) {
        Uri uri = Uri.parse(str);
        this.d = uri;
        Uri.parse(str.replace("bind", "test"));
        ahno.F(tyu.g(uri));
        this.p = awmdVar;
        this.q = xvhVar;
        this.e = map;
        this.r = map2;
        this.b = tftVar;
        this.o = tftVar2;
        this.f = z;
        this.m = vxzVar;
        this.k = 1;
        this.c = new xln();
        this.l = false;
    }

    @Override // defpackage.xmb
    public final void a() {
        this.l = true;
        ((ydv) this.p.io()).h = true;
    }

    final synchronized void b(Map map, yeb yebVar) {
        Uri.Builder builderAppendQueryParameter = this.d.buildUpon().appendQueryParameter("RID", String.valueOf(this.k)).appendQueryParameter("VER", "8").appendQueryParameter("CVER", "1");
        if (this.g != null) {
            builderAppendQueryParameter.appendQueryParameter("SID", this.g);
        }
        String str = this.i;
        if (str != null) {
            builderAppendQueryParameter.appendQueryParameter("gsessionid", str);
        }
        if (this.f && !this.l) {
            builderAppendQueryParameter.appendQueryParameter("auth_failure_option", "send_error");
        }
        String string = builderAppendQueryParameter.build().toString();
        tge tgeVarB = tgf.b(string);
        c(tgeVarB, string);
        tgeVarB.d = tgd.d(map, n);
        if (this.m.m(14, 45627566L)) {
            tgeVarB.d(tok.MDX_BROWSER_CHANNEL_CLIENT);
        }
        tgf tgfVarA = tgeVarB.a();
        agrx agrxVar = agso.a;
        yno.cL(this.o, tgfVarA, new xlt(this, yebVar));
    }

    public final void c(tge tgeVar, String str) {
        Optional optionalEmpty;
        awmd awmdVar = this.p;
        ydv ydvVar = (ydv) awmdVar.io();
        if (ydvVar.a()) {
            zwa zwaVarE = ydvVar.a.e();
            zwm zwmVarA = ydvVar.b.a(zwaVarE);
            long jB = ydvVar.f.b();
            if ((ydvVar.d && ydvVar.h) || (ydvVar.c && jB > ydvVar.g + ydvVar.e)) {
                zwmVarA.b(zwaVarE);
                ydvVar.g = jB;
                ydvVar.h = false;
            } else if (ydvVar.g == 0) {
                ydvVar.g = jB;
            }
            zwk zwkVarA = zwmVarA.a(zwaVarE);
            optionalEmpty = zwkVarA.f() ? zwkVarA.b(str) : Optional.empty();
        } else {
            agrx agrxVar = agso.a;
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isPresent()) {
            tgeVar.c((String) ((Pair) optionalEmpty.get()).first, (String) ((Pair) optionalEmpty.get()).second);
        }
        ydv ydvVar2 = (ydv) awmdVar.io();
        String strL = !ydvVar2.a() ? null : ydvVar2.a.e().l();
        if (strL != null) {
            tgeVar.c("X-Goog-PageId", strL);
        }
        xvh xvhVar = this.q;
        if (xvhVar != null) {
            tgeVar.c("X-YouTube-LoungeId-Token", xvhVar.b);
        }
        for (Map.Entry entry : this.r.entrySet()) {
            tgeVar.c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final String toString() {
        return "Session id: " + this.g + " GFE Session cookie: " + this.i;
    }
}
