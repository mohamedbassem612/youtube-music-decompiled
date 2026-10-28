package defpackage;

import android.util.Base64;
import android.webkit.PermissionRequest;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeic implements aehi {
    public final anib a;
    public final String b;
    public final vxe c;
    public final lqa d;
    public final lqa e;
    private final mbc f;
    private final Set g;
    private final xeu h;
    private final zvl i;
    private final wby j;
    private final tun k;
    private final byte[] l;
    private final ahey m;
    private ListenableFuture n;
    private final awmd o;
    private final long p;
    private Runnable q;
    private Runnable r;
    private Runnable s;
    private anhh t;
    private long u;
    private final tul v;
    private final vxz w;
    private final ahnz x;
    private final zj y;

    public aeic(arkm arkmVar, aego aegoVar, mbc mbcVar, txp txpVar, ahnz ahnzVar, xeu xeuVar, vxe vxeVar, wby wbyVar, zvl zvlVar, tun tunVar, vxz vxzVar, lqa lqaVar, ahey aheyVar, lqa lqaVar2, zj zjVar, awmd awmdVar) {
        HashSet hashSet = new HashSet();
        this.g = hashSet;
        this.q = new aeia(0);
        this.r = new aeia(2);
        this.s = new abmn(18);
        anhh anhhVar = anhh.a;
        this.t = anhhVar;
        this.u = 0L;
        this.v = new aeib(this);
        anib anibVar = arkmVar.f == 44 ? (anib) arkmVar.g : anib.a;
        this.a = anibVar;
        boolean z = anibVar.h;
        this.f = mbcVar;
        this.b = arkmVar.h;
        hashSet.add(aegoVar);
        this.h = xeuVar;
        this.i = zvlVar;
        this.x = ahnzVar;
        this.c = vxeVar;
        this.j = wbyVar;
        this.k = tunVar;
        this.w = vxzVar;
        this.e = lqaVar;
        this.m = aheyVar;
        this.d = lqaVar2;
        this.y = zjVar;
        this.o = awmdVar;
        this.p = vxzVar.d(3, 45834297L);
        this.l = arkmVar.N.G();
        String strA = txpVar.a();
        anhh anhhVar2 = anibVar.c;
        aihf builder = (anhhVar2 != null ? anhhVar2 : anhhVar).toBuilder();
        builder.copyOnWrite();
        anhh anhhVar3 = (anhh) builder.instance;
        strA.getClass();
        anhhVar3.b |= 4;
        anhhVar3.e = strA;
        anhh anhhVar4 = (anhh) builder.build();
        this.t = anhhVar4;
        ahnzVar.a = anhhVar4;
    }

    @Override // defpackage.aehi
    public final long a(long j) {
        long jD = this.w.d(2, 45810604L);
        return jD > 0 ? jD : j;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ agkz b() {
        return agpr.a;
    }

    @Override // defpackage.aehi
    public final ajwo c(ajwo ajwoVar) {
        String str = this.t.e;
        aihf aihfVarCreateBuilder = akzk.a.createBuilder();
        anhh anhhVar = this.t;
        aihfVarCreateBuilder.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
        anhhVar.getClass();
        akzkVar.m = anhhVar;
        akzkVar.b |= 67108864;
        akzk akzkVar2 = (akzk) aihfVarCreateBuilder.build();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amtu.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihl aihlVar = amtu.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aihf builder = ((amtu) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
            builder.copyOnWrite();
            amtu amtuVar = (amtu) builder.instance;
            str.getClass();
            amtuVar.c |= 16;
            amtuVar.h = str;
            builder.copyOnWrite();
            amtu amtuVar2 = (amtu) builder.instance;
            akzkVar2.getClass();
            amtuVar2.g = akzkVar2;
            amtuVar2.c |= 8;
            aihhVar.e(aihlVar, (amtu) builder.build());
            return (ajwo) aihhVar.build();
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aplv.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
            aihl aihlVar2 = aplv.b;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aihf builder2 = ((aplv) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).toBuilder();
            aihf aihfVarCreateBuilder2 = ajgs.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ajgs ajgsVar = (ajgs) aihfVarCreateBuilder2.instance;
            str.getClass();
            ajgsVar.b = 11;
            ajgsVar.c = str;
            builder2.ce(aihfVarCreateBuilder2);
            aihhVar2.e(aihlVar2, (aplv) builder2.build());
            return (ajwo) aihhVar2.build();
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajwm.b);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (!ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            return ajwoVar;
        }
        aihf aihfVarCreateBuilder3 = ajwm.a.createBuilder();
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajwm.b);
        ajwoVar.c(aihlVarCheckIsLite6);
        Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
        for (ajwo ajwoVar2 : ((ajwm) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).c) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(amtu.b);
            ajwoVar2.c(aihlVarCheckIsLite7);
            if (ajwoVar2.j.n(aihlVarCheckIsLite7.d)) {
                aihh aihhVar3 = (aihh) ajwoVar2.toBuilder();
                aihl aihlVar3 = amtu.b;
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
                ajwoVar2.c(aihlVarCheckIsLite8);
                Object objK4 = ajwoVar2.j.k(aihlVarCheckIsLite8.d);
                aihf builder3 = ((amtu) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).toBuilder();
                builder3.copyOnWrite();
                amtu amtuVar3 = (amtu) builder3.instance;
                str.getClass();
                amtuVar3.c |= 16;
                amtuVar3.h = str;
                builder3.copyOnWrite();
                amtu amtuVar4 = (amtu) builder3.instance;
                akzkVar2.getClass();
                amtuVar4.g = akzkVar2;
                amtuVar4.c |= 8;
                aihhVar3.e(aihlVar3, (amtu) builder3.build());
                aihfVarCreateBuilder3.aP((ajwo) aihhVar3.build());
            } else {
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aplv.b);
                ajwoVar2.c(aihlVarCheckIsLite9);
                if (ajwoVar2.j.n(aihlVarCheckIsLite9.d)) {
                    aihh aihhVar4 = (aihh) ajwoVar2.toBuilder();
                    aihl aihlVar4 = aplv.b;
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar4);
                    ajwoVar2.c(aihlVarCheckIsLite10);
                    Object objK5 = ajwoVar2.j.k(aihlVarCheckIsLite10.d);
                    aihf builder4 = ((aplv) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).toBuilder();
                    aihf aihfVarCreateBuilder4 = ajgs.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    ajgs ajgsVar2 = (ajgs) aihfVarCreateBuilder4.instance;
                    str.getClass();
                    ajgsVar2.b = 11;
                    ajgsVar2.c = str;
                    builder4.ce(aihfVarCreateBuilder4);
                    aihhVar4.e(aihlVar4, (aplv) builder4.build());
                    aihfVarCreateBuilder3.aP((ajwo) aihhVar4.build());
                } else {
                    aihfVarCreateBuilder3.aP(ajwoVar2);
                }
            }
        }
        aihh aihhVar5 = (aihh) ajwoVar.toBuilder();
        aihhVar5.e(ajwm.b, (ajwm) aihfVarCreateBuilder3.build());
        return (ajwo) aihhVar5.build();
    }

    @Override // defpackage.aehi
    public final void e() {
        String str = this.t.c;
        ahnz ahnzVar = this.x;
        Object obj = ahnzVar.a;
        if (obj != null && ((anhh) obj).c.equals(str)) {
            ahnzVar.a = null;
        }
        ListenableFuture listenableFuture = this.n;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.n = null;
        }
        zj zjVar = this.y;
        if (zjVar.c == this.q) {
            zjVar.c = new abmn(19);
        }
        if (zjVar.b == this.r) {
            zjVar.b = new abmn(20);
        }
        if (zjVar.a == this.s) {
            zjVar.a = new aeia(1);
            if (this.w.m(11, 45811671L)) {
                ania aniaVar = this.a.i;
                if (aniaVar == null) {
                    aniaVar = ania.a;
                }
                if ((aniaVar.b & 1) != 0) {
                    this.d.H();
                }
            }
        }
        ania aniaVar2 = this.a.i;
        if (aniaVar2 == null) {
            aniaVar2 = ania.a;
        }
        if ((aniaVar2.b & 1) != 0) {
            this.k.e(this.v);
        }
    }

    @Override // defpackage.aehi
    public final void f() {
        aihf aihfVarCreateBuilder = anhr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anhr anhrVar = (anhr) aihfVarCreateBuilder.instance;
        anhrVar.e = 9;
        anhrVar.b |= 4;
        String str = this.t.e;
        aihfVarCreateBuilder.copyOnWrite();
        anhr anhrVar2 = (anhr) aihfVarCreateBuilder.instance;
        str.getClass();
        anhrVar2.b |= 2;
        anhrVar2.d = str;
        String str2 = this.t.c;
        aihfVarCreateBuilder.copyOnWrite();
        anhr anhrVar3 = (anhr) aihfVarCreateBuilder.instance;
        str2.getClass();
        anhrVar3.b |= 1;
        anhrVar3.c = str2;
        int i = this.t.d;
        aihfVarCreateBuilder.copyOnWrite();
        anhr anhrVar4 = (anhr) aihfVarCreateBuilder.instance;
        anhrVar4.b |= 8;
        anhrVar4.f = i;
        xeu xeuVar = this.h;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MINI_APP_PLAY_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            anhr anhrVar5 = (anhr) aihfVarCreateBuilder.build();
            anhrVar5.getClass();
            alouVar.d = anhrVar5;
            alouVar.c = 469;
            xeuVar.b((alou) alosVar.build());
        }
        anib anibVar = this.a;
        if ((anibVar.b & 32) != 0) {
            w(0.1f);
            this.n = this.m.schedule(new acqu(this, 20), 1L, TimeUnit.SECONDS);
        }
        this.q = new aehz(this, 1);
        this.r = new aehz(this, 0);
        this.s = new aehz(this, 2);
        zj zjVar = this.y;
        zjVar.c = this.q;
        zjVar.b = this.r;
        zjVar.a = this.s;
        if (this.w.m(11, 45811671L)) {
            ania aniaVar = anibVar.i;
            if (aniaVar == null) {
                aniaVar = ania.a;
            }
            if ((aniaVar.b & 1) != 0) {
                this.k.b(this.v);
                lqa lqaVar = this.d;
                ania aniaVar2 = anibVar.i;
                int i2 = (aniaVar2 == null ? ania.a : aniaVar2).d;
                if (aniaVar2 == null) {
                    aniaVar2 = ania.a;
                }
                Duration durationOfMillis = Duration.ofMillis(aniaVar2.e);
                Object obj = lqaVar.a;
                synchronized (((aeis) obj).b) {
                    ((aeis) obj).m = i2;
                    ((aeis) obj).n = durationOfMillis.toMillis();
                    ((aeis) obj).k = true;
                    ((aeis) obj).h.l();
                }
            } else {
                this.d.H();
            }
        } else {
            ania aniaVar3 = anibVar.i;
            if (aniaVar3 == null) {
                aniaVar3 = ania.a;
            }
            if ((aniaVar3.b & 1) != 0) {
                tun tunVar = this.k;
                tunVar.e.execute(new sxk(tunVar, this.v, 19, null));
            }
        }
        v(true);
    }

    @Override // defpackage.aehi
    public final void g(String str) {
        Optional optionalEmpty;
        ListenableFuture listenableFuture;
        int i = 0;
        try {
            optionalEmpty = Optional.of((arjt) aihn.parseFrom(arjt.a, Base64.decode((String) agfm.b(',').h(str).get(0), 2), ExtensionRegistryLite.getGeneratedRegistry()));
        } catch (aiik e) {
            zvl zvlVar = this.i;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
            zvjVarA.j = 51;
            zvjVarA.d("InvalidProtocolBufferException while decoding WebToNativeMessage for parseWebToNativeMessage: ".concat(String.valueOf(e.getMessage() == null ? "no error message" : e.getMessage())));
            zvjVarA.b(0.01d);
            zvlVar.a(zvjVarA.a());
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isEmpty()) {
            return;
        }
        arjt arjtVar = (arjt) optionalEmpty.get();
        if (arjtVar.d.equals("yt-mini-app-update-loading-progress") && (listenableFuture = this.n) != null) {
            listenableFuture.cancel(false);
            this.n = null;
        }
        ajwo ajwoVar = (ajwo) DesugarCollections.unmodifiableMap(this.a.d).get(arjtVar.d);
        if (ajwoVar != null) {
            if ((arjtVar.b & 4) == 0) {
                this.c.a(c(ajwoVar));
                return;
            }
            arjp arjpVarE = arjr.e(wfs.g(441, String.format("_%s", arjtVar.d)));
            arjpVarE.am(arjtVar.e);
            String str2 = arjtVar.c;
            aihf aihfVar = arjpVarE.a;
            aihfVar.copyOnWrite();
            arjs arjsVar = (arjs) aihfVar.instance;
            arjs arjsVar2 = arjs.a;
            str2.getClass();
            arjsVar.b |= 4;
            arjsVar.e = str2;
            wby wbyVar = this.j;
            arjr arjrVarAn = arjpVarE.an();
            wer werVarE = wbyVar.e();
            werVarE.e(arjrVarAn);
            werVarE.b().k(new acrr(12)).i(new hmg(this, ajwoVar, 17)).D();
            return;
        }
        String str3 = arjtVar.d;
        int iHashCode = str3.hashCode();
        if (iHashCode == -1995840757) {
            if (str3.equals("yt-mini-app-confirm-navigate-to-new-mini-app")) {
                agke agkeVarN = agke.n(this.g);
                int size = agkeVarN.size();
                while (i < size) {
                    ((aego) agkeVarN.get(i)).b();
                    i++;
                }
                return;
            }
            return;
        }
        if (iHashCode == 11634481 && str3.equals("yt-mini-app-cancel-navigate-to-new-mini-app")) {
            agke agkeVarN2 = agke.n(this.g);
            int size2 = agkeVarN2.size();
            while (i < size2) {
                ((aego) agkeVarN2.get(i)).a();
                i++;
            }
        }
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void i(PermissionRequest permissionRequest, agke agkeVar, agke agkeVar2) {
        permissionRequest.deny();
    }

    @Override // defpackage.aehi
    public final void m() {
        agke agkeVarN = agke.n(this.g);
        int size = agkeVarN.size();
        for (int i = 0; i < size; i++) {
            ((aego) agkeVarN.get(i)).c();
        }
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean n(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.aehi
    public final void p() {
        ania aniaVar = this.a.i;
        if (aniaVar == null) {
            aniaVar = ania.a;
        }
        if ((aniaVar.b & 1) == 0) {
            this.k.c();
        }
    }

    @Override // defpackage.aehi
    public final void s() {
        long jB = this.f.b();
        ania aniaVar = this.a.i;
        if (aniaVar == null) {
            aniaVar = ania.a;
        }
        if ((aniaVar.b & 1) == 0 || jB - this.u < this.p) {
            return;
        }
        this.u = jB;
        this.k.c();
    }

    @Override // defpackage.aehi
    public final void t(aihf aihfVar) {
        aihf aihfVarCreateBuilder = amjc.a.createBuilder();
        String str = this.t.e;
        aihfVarCreateBuilder.copyOnWrite();
        amjc amjcVar = (amjc) aihfVarCreateBuilder.instance;
        str.getClass();
        amjcVar.b |= 2;
        amjcVar.d = str;
        String str2 = this.t.c;
        aihfVarCreateBuilder.copyOnWrite();
        amjc amjcVar2 = (amjc) aihfVarCreateBuilder.instance;
        str2.getClass();
        amjcVar2.b |= 1;
        amjcVar2.c = str2;
        int i = this.t.d;
        aihfVarCreateBuilder.copyOnWrite();
        amjc amjcVar3 = (amjc) aihfVarCreateBuilder.instance;
        amjcVar3.b |= 4;
        amjcVar3.e = i;
        amjc amjcVar4 = (amjc) aihfVarCreateBuilder.build();
        aihfVar.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar.instance;
        amiu amiuVar2 = amiu.a;
        amjcVar4.getClass();
        amiuVar.X = amjcVar4;
        amiuVar.e |= 1;
    }

    @Override // defpackage.aehi
    public final void u(ahub ahubVar, WebSettings webSettings) {
        ahubVar.f("postPlayNonce", this.t.e);
        ahubVar.f("parentCsn", "");
        ahubVar.f("parentTrackingParams", Base64.encodeToString(this.l, 10));
        ahubVar.f("deviceTextZoomSetting", Integer.toString(webSettings.getTextZoom()));
    }

    public final void v(boolean z) {
        nsr nsrVar = (nsr) this.o.io();
        aihf aihfVarCreateBuilder = ajlv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajlv ajlvVar = (ajlv) aihfVarCreateBuilder.instance;
        ajlvVar.c |= 1;
        ajlvVar.d = "/miniapp/has_focus";
        aihfVarCreateBuilder.copyOnWrite();
        ajlv ajlvVar2 = (ajlv) aihfVarCreateBuilder.instance;
        ajlvVar2.c |= 2;
        ajlvVar2.e = z;
        nsrVar.b("/miniapp/has_focus", ((ajlv) aihfVarCreateBuilder.build()).toByteArray());
    }

    public final void w(float f) {
        ajwo ajwoVar = this.a.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihf aihfVarCreateBuilder = anhl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anhl anhlVar = (anhl) aihfVarCreateBuilder.instance;
        anhlVar.b = 3;
        anhlVar.c = Float.valueOf(f);
        String strEncodeToString = Base64.encodeToString(((anhl) aihfVarCreateBuilder.build()).toByteArray(), 2);
        arjp arjpVarE = arjr.e(wfs.g(441, String.format("_%s", "yt-mini-app-update-loading-progress")));
        arjpVarE.am(strEncodeToString);
        wby wbyVar = this.j;
        arjr arjrVarAn = arjpVarE.an();
        wer werVarE = wbyVar.e();
        werVarE.e(arjrVarAn);
        werVarE.b().i(new hmg(this, ajwoVar, 18)).D();
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void h(String str) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void k(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
