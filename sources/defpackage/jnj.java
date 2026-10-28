package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import internal.org.jni_zero.CommonApis;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnj {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public jnj(adhv adhvVar, View view) {
        this.c = view;
        ImageView imageView = (ImageView) view.findViewById(R.id.live_stream_thumbnail);
        this.e = imageView;
        this.d = view.findViewById(R.id.bottom_content_container);
        this.b = (TextView) view.findViewById(R.id.main_text);
        this.a = (TextView) view.findViewById(R.id.subtitle_text);
        this.f = new adia(adhvVar, imageView, false);
    }

    public static ajwo B(anfv anfvVar) {
        if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & 64) == 0) {
            return null;
        }
        ajwo ajwoVar = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).e;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    private final anlx F() {
        anlx anlxVar = ((vxu) this.a).c().h;
        return anlxVar == null ? anlx.a : anlxVar;
    }

    private final anpk G() {
        anpk anpkVar = ((vyo) this.c).b().h;
        return anpkVar == null ? anpk.a : anpkVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [abvn, java.lang.Object] */
    private final avlh H() {
        return this.e.P().x(new hgu(20)).H(new igz(0));
    }

    private static final anfv I(anfv anfvVar) {
        aihf builder = anfvVar.toBuilder();
        anfv anfvVar2 = (anfv) builder.instance;
        aihf builder2 = (anfvVar2.b == 66441155 ? (anga) anfvVar2.c : anga.a).toBuilder();
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.OFFLINE_DOWNLOAD;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        builder2.copyOnWrite();
        anga angaVar = (anga) builder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        angaVar.d = aljaVar2;
        angaVar.b |= 8;
        anga angaVar2 = (anga) builder2.build();
        builder.copyOnWrite();
        anfv anfvVar3 = (anfv) builder.instance;
        angaVar2.getClass();
        anfvVar3.c = angaVar2;
        anfvVar3.b = 66441155;
        return (anfv) builder.build();
    }

    private final void J(aihf aihfVar, int i) {
        yno.dY(aihfVar, ackj.c(((Context) this.d).getResources().getString(i)));
    }

    public static final int w(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.page_margin);
    }

    public static final int x(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(R.dimen.page_margin) - resources.getDimensionPixelSize(R.dimen.intrinsic_item_padding);
    }

    public final boolean A() {
        return ((View) this.c).getVisibility() == 0;
    }

    public final anfv C(anfv anfvVar, Object obj) {
        anfvVar.getClass();
        if (obj == null) {
            obj = new Object();
        }
        String strAe = fhz.ae(obj);
        if (TextUtils.isEmpty(fhz.ag(obj)) || !TextUtils.isEmpty(strAe)) {
            aihf builder = I(anfvVar).toBuilder();
            J(builder, R.string.action_add_playlist_to_offline);
            return (anfv) builder.build();
        }
        aihf builder2 = I(anfvVar).toBuilder();
        J(builder2, R.string.action_add_to_offline_songs);
        return (anfv) builder2.build();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    public final anfv D(anfv anfvVar) {
        String str;
        anfvVar.getClass();
        ajwo ajwoVarB = B(anfvVar);
        if (ajwoVarB != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aofx.b);
            ajwoVarB.c(aihlVarCheckIsLite);
            if (ajwoVarB.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aofx.b);
                ajwoVarB.c(aihlVarCheckIsLite2);
                Object objK = ajwoVarB.j.k(aihlVarCheckIsLite2.d);
                str = ((aofx) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((vxz) this.a).l(172, 45648925L, false)) {
            return anfvVar;
        }
        anga angaVar = anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a;
        aihf builder = anfvVar.toBuilder();
        Object obj = this.d;
        aihf builder2 = angaVar.toBuilder();
        alay alayVarC = ackj.c(((Context) obj).getString(R.string.menu_offline_placeholder));
        builder2.copyOnWrite();
        anga angaVar2 = (anga) builder2.instance;
        alayVarC.getClass();
        angaVar2.c = alayVarC;
        angaVar2.b |= 1;
        builder.copyOnWrite();
        anfv anfvVar2 = (anfv) builder.instance;
        anga angaVar3 = (anga) builder2.build();
        angaVar3.getClass();
        anfvVar2.c = angaVar3;
        anfvVar2.b = 66441155;
        return (anfv) builder.build();
    }

    public final agke E(anfv anfvVar) {
        anfvVar.getClass();
        ajwo ajwoVarB = B(anfvVar);
        String str = null;
        if (ajwoVarB != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
            ajwoVarB.c(aihlVarCheckIsLite);
            if (ajwoVarB.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohd.b);
                ajwoVarB.c(aihlVarCheckIsLite2);
                Object objK = ajwoVarB.j.k(aihlVarCheckIsLite2.d);
                aohd aohdVar = (aohd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                str = aohdVar.d == 1 ? (String) aohdVar.e : "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return agpi.a;
        }
        if (((vxz) this.a).l(172, 45648925L, false)) {
            return agke.q(anfvVar);
        }
        anga angaVar = anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a;
        aihf builder = anfvVar.toBuilder();
        aihf builder2 = angaVar.toBuilder();
        alay alayVarC = ackj.c(((Context) this.d).getString(R.string.menu_offline_placeholder));
        builder2.copyOnWrite();
        anga angaVar2 = (anga) builder2.instance;
        alayVarC.getClass();
        angaVar2.c = alayVarC;
        angaVar2.b |= 1;
        builder.copyOnWrite();
        anfv anfvVar2 = (anfv) builder.instance;
        anga angaVar3 = (anga) builder2.build();
        angaVar3.getClass();
        anfvVar2.c = angaVar3;
        anfvVar2.b = 66441155;
        return agke.q((anfv) builder.build());
    }

    public final void a() {
        iyk iykVar = ((jcn) this.a).b;
        if (iykVar != null) {
            iykVar.c();
        }
    }

    public final void b(amzh amzhVar) {
        jcn jcnVar = (jcn) this.a;
        if (amzhVar.equals(Optional.ofNullable(jcnVar.c).orElse(null))) {
            return;
        }
        new adly();
        jcnVar.d(amzhVar);
    }

    public final boolean c() {
        return ((jcn) this.a).b != null;
    }

    public final void d(amzh amzhVar) {
        amzhVar.getClass();
        int iE = CommonApis.e(amzhVar.j);
        if (iE == 0) {
            iE = 1;
        }
        int i = iE - 1;
        if (i == 1) {
            b(amzhVar);
        } else if (i == 2) {
            ((heg) this.b).a = amzhVar;
        }
    }

    public final int e() {
        amzd amzdVar = ((vyo) this.c).b().m;
        if (amzdVar == null) {
            amzdVar = amzd.a;
        }
        return amzdVar.e ? R.drawable.yt_media_route_transparent_waves_outline_delhi : R.drawable.yt_media_route_transparent_waves_delhi;
    }

    public final anpn f() {
        anpn anpnVar = G().h;
        return anpnVar == null ? anpn.a : anpnVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final String g() {
        if (this.b.u()) {
            return (F().b & 16) != 0 ? F().c : "FEmusic_home";
        }
        return "FEmusic_library_sideloaded_tracks";
    }

    public final boolean h() {
        anpl anplVar = G().i;
        if (anplVar == null) {
            anplVar = anpl.a;
        }
        return anplVar.b;
    }

    public final boolean i() {
        return ((vxz) this.d).l(88, 45412800L, false);
    }

    public final boolean j(anfy anfyVar) {
        vxz vxzVar = (vxz) this.d;
        if (vxzVar.l(177, 45660582L, false)) {
            return vxzVar.l(172, 45648925L, false);
        }
        if ((anfyVar.b & 4) != 0) {
            return false;
        }
        for (anfv anfvVar : anfyVar.c) {
            int i = anfvVar.b;
            if (i != 153515154 && i != 66441108) {
                if (i == 66441155) {
                    ajwo ajwoVar = ((anga) anfvVar.c).e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        return false;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aofx.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                        return false;
                    }
                } else if (i != 77258115) {
                    return false;
                }
            }
            int i2 = anfvVar.b;
            if (i2 == 77258115) {
                ajwo ajwoVar2 = (i2 == 77258115 ? (anft) anfvVar.c : anft.a).e;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohd.b);
                ajwoVar2.c(aihlVarCheckIsLite3);
                if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                    return false;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aofx.b);
                ajwoVar2.c(aihlVarCheckIsLite4);
                if (ajwoVar2.j.n(aihlVarCheckIsLite4.d)) {
                    return false;
                }
            }
        }
        return vxzVar.l(172, 45648925L, false);
    }

    public final boolean k() {
        return ((vxz) this.f).l(20, 45651956L, false);
    }

    public final boolean l() {
        return !k();
    }

    public final boolean m() {
        return ((vxz) this.f).l(62, 45719172L, false);
    }

    public final boolean n() {
        return ((vxz) this.f).l(23, 45654250L, false);
    }

    public final boolean o() {
        return ((vxz) this.f).l(26, 45659062L, false);
    }

    public final boolean p() {
        return ((vxz) this.f).l(74, 45732758L, false);
    }

    public final boolean q() {
        anpm anpmVar = G().g;
        if (anpmVar == null) {
            anpmVar = anpm.a;
        }
        return anpmVar.b;
    }

    public final boolean r() {
        return ((vxz) this.f).l(40, 45677954L, false);
    }

    public final boolean s() {
        return ((vxz) this.f).l(41, 45679250L, false);
    }

    public final boolean t() {
        return ((vxz) this.f).l(67, 45726685L, false);
    }

    public final boolean u() {
        return G().b;
    }

    public final boolean v() {
        anly anlyVar = F().d;
        if (anlyVar == null) {
            anlyVar = anly.a;
        }
        return anlyVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [axso, java.lang.Object] */
    public final void y() {
        jnj jnjVar = (jnj) this.d;
        int i = 20;
        int i2 = 19;
        int i3 = 1;
        if (jnjVar.k()) {
            int i4 = 12;
            avlh.I(H(), ((avlh) this.a).x(new hxe(i4)).H(new hpr(i4))).q(new mkv(1)).H(new igz(i3)).L((avmb) this.f).al(new icy(this, i2), new hyx(i));
            return;
        }
        if (jnjVar.l()) {
            avlh.I(H(), this.b).q(new mkv(1)).H(new igz(i3)).L((avmb) this.f).al(new icy(this, i2), new hyx(i));
        } else {
            int i5 = 11;
            this.e.P().x(new hxe(i5)).H(new hpr(i5)).p().L((avmb) this.f).al(new icy(this, i2), new hyx(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final hvz z(ImageView imageView, View view) {
        Context context = (Context) this.c.io();
        context.getClass();
        aesp aespVar = (aesp) this.a.io();
        aespVar.getClass();
        xgn xgnVar = (xgn) this.b.io();
        xgnVar.getClass();
        abea abeaVar = (abea) this.f.io();
        abeaVar.getClass();
        ((vxe) this.d.io()).getClass();
        adxj adxjVar = (adxj) this.e.io();
        adxjVar.getClass();
        imageView.getClass();
        view.getClass();
        return new hvz(context, aespVar, xgnVar, abeaVar, adxjVar, imageView, view);
    }

    public jnj(Application application, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5) {
        this.d = application;
        this.a = aunnVar;
        this.f = aunnVar2;
        this.c = aunnVar3;
        this.b = aunnVar4;
        this.e = aunnVar5;
    }

    public jnj(awmd awmdVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, awmd awmdVar2, aunn aunnVar4) {
        this.a = awmdVar;
        this.c = aunnVar;
        this.b = aunnVar2;
        this.e = aunnVar3;
        this.f = awmdVar2;
        this.d = aunnVar4;
    }

    public jnj(jcn jcnVar) {
        this.c = new jni(this);
        this.d = new jni(this);
        this.a = jcnVar;
        this.e = new heg((char[]) null);
        this.f = new heg((char[]) null);
        this.b = new heg((char[]) null);
    }

    public jnj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        this.b = awmdVar3;
        awmdVar4.getClass();
        this.e = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        this.f = awmdVar6;
    }

    public jnj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
    }

    public jnj(exs exsVar, exs exsVar2, exs exsVar3, aerj aerjVar, aerj aerjVar2) {
        this.d = new ffx(new axt(150), new evt(this, 0), fga.a);
        this.a = exsVar;
        this.f = exsVar2;
        this.b = exsVar3;
        this.c = aerjVar;
        this.e = aerjVar2;
    }

    public jnj(vxu vxuVar, vyo vyoVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, zwb zwbVar) {
        vxuVar.getClass();
        this.a = vxuVar;
        vyoVar.getClass();
        this.c = vyoVar;
        this.d = vxzVar;
        this.e = vxzVar2;
        this.f = vxzVar3;
        this.b = zwbVar;
    }

    public jnj(Context context, Executor executor, hlz hlzVar, hpy hpyVar, hpk hpkVar, vxz vxzVar) {
        context.getClass();
        this.d = context;
        executor.getClass();
        this.f = executor;
        hlzVar.getClass();
        this.c = hlzVar;
        hpyVar.getClass();
        this.b = hpyVar;
        hpkVar.getClass();
        this.e = hpkVar;
        vxzVar.getClass();
        this.a = vxzVar;
    }

    public jnj(abvn abvnVar, avlh avlhVar, avlh avlhVar2, avmb avmbVar, vwx vwxVar, jnj jnjVar) {
        this.e = abvnVar;
        this.a = avlhVar;
        this.b = avlhVar2;
        this.f = avmbVar;
        this.c = vwxVar;
        this.d = jnjVar;
    }

    public jnj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        awmdVar4.getClass();
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
    }
}
