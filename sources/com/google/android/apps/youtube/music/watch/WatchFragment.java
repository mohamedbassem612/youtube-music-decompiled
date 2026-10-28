package com.google.android.apps.youtube.music.watch;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.player.MusicPlayerView;
import com.google.android.apps.youtube.music.player.PlayerPanel;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aack;
import defpackage.aaje;
import defpackage.aawb;
import defpackage.aawi;
import defpackage.aawl;
import defpackage.abbd;
import defpackage.abct;
import defpackage.abea;
import defpackage.abel;
import defpackage.abeq;
import defpackage.aber;
import defpackage.abes;
import defpackage.abfv;
import defpackage.abfx;
import defpackage.abgo;
import defpackage.abgp;
import defpackage.abgu;
import defpackage.abgx;
import defpackage.abhb;
import defpackage.abhe;
import defpackage.abhf;
import defpackage.abhh;
import defpackage.abmt;
import defpackage.abmy;
import defpackage.abna;
import defpackage.abnc;
import defpackage.absa;
import defpackage.absc;
import defpackage.abui;
import defpackage.abvc;
import defpackage.abvk;
import defpackage.abvn;
import defpackage.abwk;
import defpackage.abwr;
import defpackage.acda;
import defpackage.acdq;
import defpackage.acfi;
import defpackage.acfj;
import defpackage.acxn;
import defpackage.aczl;
import defpackage.adhv;
import defpackage.adly;
import defpackage.aeba;
import defpackage.aefv;
import defpackage.aerj;
import defpackage.afki;
import defpackage.afkj;
import defpackage.afty;
import defpackage.afwl;
import defpackage.agrf;
import defpackage.ahcz;
import defpackage.ahey;
import defpackage.ahng;
import defpackage.ahno;
import defpackage.ahub;
import defpackage.aiik;
import defpackage.ajiz;
import defpackage.ajja;
import defpackage.ajjm;
import defpackage.ajws;
import defpackage.alvl;
import defpackage.ameb;
import defpackage.arat;
import defpackage.atq;
import defpackage.atr;
import defpackage.aunn;
import defpackage.avlh;
import defpackage.avmb;
import defpackage.avmm;
import defpackage.avmn;
import defpackage.awka;
import defpackage.awku;
import defpackage.awmd;
import defpackage.axfd;
import defpackage.cf;
import defpackage.ci;
import defpackage.dfo;
import defpackage.dmf;
import defpackage.fg;
import defpackage.hfk;
import defpackage.hfn;
import defpackage.hhb;
import defpackage.hpw;
import defpackage.hva;
import defpackage.hwc;
import defpackage.hwd;
import defpackage.hwf;
import defpackage.hwg;
import defpackage.hwj;
import defpackage.hwk;
import defpackage.hwn;
import defpackage.hwp;
import defpackage.hwr;
import defpackage.hws;
import defpackage.hww;
import defpackage.hwz;
import defpackage.hxg;
import defpackage.hxi;
import defpackage.hxj;
import defpackage.hyh;
import defpackage.hyo;
import defpackage.hyp;
import defpackage.hyr;
import defpackage.hys;
import defpackage.hyt;
import defpackage.hyu;
import defpackage.hyw;
import defpackage.hyx;
import defpackage.hyy;
import defpackage.hzi;
import defpackage.hzo;
import defpackage.hzp;
import defpackage.ico;
import defpackage.igp;
import defpackage.igz;
import defpackage.iho;
import defpackage.ihp;
import defpackage.ilx;
import defpackage.iqc;
import defpackage.isi;
import defpackage.ivo;
import defpackage.ixe;
import defpackage.izr;
import defpackage.izt;
import defpackage.jij;
import defpackage.jkb;
import defpackage.jlf;
import defpackage.jmo;
import defpackage.jmp;
import defpackage.jmt;
import defpackage.jmx;
import defpackage.jna;
import defpackage.jnb;
import defpackage.jnc;
import defpackage.jnd;
import defpackage.jne;
import defpackage.jnf;
import defpackage.jnh;
import defpackage.jnj;
import defpackage.jnk;
import defpackage.jnl;
import defpackage.jnm;
import defpackage.jqp;
import defpackage.khn;
import defpackage.kjc;
import defpackage.kjs;
import defpackage.mkw;
import defpackage.ok;
import defpackage.omj;
import defpackage.pwf;
import defpackage.qof;
import defpackage.ruf;
import defpackage.ruk;
import defpackage.sxw;
import defpackage.tbt;
import defpackage.tqj;
import defpackage.ttm;
import defpackage.tuk;
import defpackage.vxe;
import defpackage.vxz;
import defpackage.wjf;
import defpackage.xgj;
import defpackage.xgm;
import defpackage.xgn;
import defpackage.xhb;
import defpackage.xrd;
import defpackage.xrn;
import defpackage.xru;
import defpackage.xxq;
import defpackage.ycp;
import defpackage.yha;
import defpackage.zhz;
import defpackage.zpw;
import defpackage.zwb;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WatchFragment extends jmp implements xgm, acfi, jlf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/watch/WatchFragment");
    public abhe A;
    public hwn B;
    public abgp C;
    public aunn D;
    public aunn E;
    public abes F;
    public abel G;
    public xrn H;
    public ico I;
    public awmd J;
    public hzi K;
    public xrd L;
    public ivo M;
    public jnm N;
    public aunn O;
    public aunn P;
    public aunn Q;
    public aunn R;
    public ilx S;
    public tqj T;
    public int U;
    public izt V;
    public MusicPlayerView W;
    public hww X;
    public hxj Y;
    public wjf Z;
    public axfd aA;
    private hwr aC;
    private hwg aD;
    private abfv aE;
    private abhh aF;
    private abgx aG;
    private abgu aH;
    private xxq aI;
    private absc aJ;
    private abct aK;
    private jnc aL;
    private hyy aM;
    private fg aP;
    public jmt aa;
    public boolean ab;
    avmn ad;
    public ruf ae;
    public hzp af;
    public vxz ag;
    public vxz ah;
    public abfx ai;
    public jnj aj;
    public jqp ak;
    public kjs al;
    public hfn am;
    public ruk an;
    public pwf ao;
    public khn ap;
    public acda aq;
    public hwz ar;
    public kjc as;
    public abwk at;
    public zpw au;
    public axfd av;
    public hfn aw;
    public omj ax;
    public isi ay;
    public aerj az;
    public tbt b;
    public afki c;
    public abvn d;
    public vxe e;
    public zwb f;
    public hwk g;
    public ahey h;
    public abnc i;
    public awmd j;
    public jnj k;
    public jnh l;
    public jmx m;
    public jmo n;
    public abbd o;
    public aunn p;
    public ttm q;
    public acfj r;
    public hyu s;
    public xgn t;
    public hyh u;
    public hyo v;
    public hyr w;
    public hyt x;
    public hyp y;
    public hwc z;
    private final adly aB = new adly();
    final avmm ac = new avmm();
    private final igp aO = new igp(this);
    private final afkj aN = new jne();

    @Override // defpackage.jlf
    public final void a() {
        alvl alvlVarT = (((abvk) this.P.io()).h() == null || ((abvk) this.P.io()).h().c() == null) ? null : ((abvk) this.P.io()).h().c().t();
        wjf wjfVar = this.Z;
        if (wjfVar != null) {
            jnh jnhVar = this.l;
            if (alvlVarT == null) {
                alvl alvlVar = alvl.a;
            }
            Context context = getContext();
            jnhVar.j = System.currentTimeMillis();
            if (((abvk) jnhVar.f.io()).ac()) {
                ajjm ajjmVarK = aaje.k(wjfVar.t());
                if (jnh.c(ajjmVarK)) {
                    jnhVar.h = ajjmVarK;
                }
                if ((wjfVar.u().b & 1073741824) != 0) {
                    ajiz ajizVar = wjfVar.u().B;
                    if (ajizVar == null) {
                        ajizVar = ajiz.a;
                    }
                    ajja ajjaVar = ajizVar.b;
                    if (ajjaVar == null) {
                        ajjaVar = ajja.a;
                    }
                    jnhVar.i = ajjaVar.b == 182224395 ? (ajws) ajjaVar.c : ajws.a;
                }
                if (!jnhVar.l.C() && !jnhVar.k && jnh.c(jnhVar.h)) {
                    atr atrVar = new atr(context, null);
                    atrVar.E = "generic_notifications";
                    Intent intentAddCategory = new Intent().setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity").setFlags(335544320).setAction("android.intent.action.MAIN").putExtra("intent_notification_source", 1308).addCategory("android.intent.category.LAUNCHER");
                    String string = context.getString(R.string.paused_upsell_notification_title);
                    String string2 = context.getString(R.string.paused_upsell_notification_music_text);
                    atrVar.l(string);
                    atrVar.k(string2);
                    atrVar.z = context.getColor(R.color.ytm_color_red_02);
                    atrVar.h = qof.b(context, 0, intentAddCategory, 201326592);
                    atrVar.q(jnhVar.c);
                    atrVar.A = 1;
                    atq atqVar = new atq();
                    atqVar.c(string2);
                    atqVar.d(string);
                    atrVar.r(atqVar);
                    atrVar.m = false;
                    atrVar.e(2, false);
                    atrVar.e(16, true);
                    jnhVar.d.b("MUSIC_BACKGROUND_PAUSED_UPSELL", 1308, atrVar.a());
                    jnhVar.e.l(new xgj(xhb.b(58534)));
                }
            } else {
                jnhVar.a();
            }
        }
        ((aack) this.R.io()).c(requireActivity().isFinishing());
    }

    @Override // defpackage.jlf
    public final void b() {
        boolean z = !this.S.b;
        aack aackVar = (aack) this.R.io();
        abui abuiVar = new abui();
        abuiVar.d(true);
        abuiVar.e(this.W.f);
        abuiVar.d(z);
        abna abnaVarC = abuiVar.c();
        abmy abmyVar = (abmy) this.p.io();
        Object obj = aackVar.e;
        aackVar.d(((hwz) aackVar.d).f());
        ((abvk) aackVar.c).ai(abnaVarC, abmyVar);
        ((abvk) this.P.io()).B();
        this.i.f();
        this.af.d();
        cf cfVarRequireActivity = requireActivity();
        if (!this.ah.l(34, 45770870L, false)) {
            Object obj2 = ((fg) this.J.io()).a;
            cfVarRequireActivity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, obj2);
            axfd.az(cfVarRequireActivity, (fg) obj2);
        } else {
            ahey aheyVar = this.h;
            jkb jkbVar = new jkb(this, cfVarRequireActivity, 2, null);
            long j = afwl.a;
            this.c.c(ahub.s(aheyVar.submit(new ahcz(afty.c(false), jkbVar, 1))), this.aN);
        }
    }

    public final void e() {
        MusicPlayerView musicPlayerView = this.W;
        if (musicPlayerView != null) {
            musicPlayerView.setTranslationY(1.0f);
            this.W.post(new ixe(this, 8));
        }
    }

    public final void f() {
        this.g.l();
    }

    public final void h(float f) {
        hwc hwcVar = this.z;
        View view = hwcVar.c;
        view.setTranslationY(hwcVar.getMeasuredHeight() * (1.0f - f));
        tuk.l(view, f != 0.0f);
        hwcVar.i.d(f);
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.t;
    }

    public final void i() {
        wjf wjfVar;
        boolean z = (!this.ab || (wjfVar = this.Z) == null || aaje.o(wjfVar.t())) ? false : true;
        Window window = getActivity() != null ? getActivity().getWindow() : null;
        Boolean bool = (Boolean) ((awku) this.ap.a).aD();
        if ((bool != null ? bool.booleanValue() : false) == z || window == null) {
            return;
        }
        ((awku) this.ap.a).kk(Boolean.valueOf(z));
    }

    public final void j(Optional optional) {
        if (optional.isEmpty() || ((hyw) optional.get()).h() == null) {
            return;
        }
        this.z.A(((hyw) optional.get()).h());
        this.z.n(ahno.Z(((hyw) optional.get()).g()));
    }

    @Override // defpackage.acfi
    public final boolean k(zhz zhzVar) {
        if (!"surfaceunavailable".equals(zhzVar.f())) {
            return false;
        }
        ((aack) this.R.io()).c(requireActivity().isFinishing());
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        pwf pwfVar = this.ao;
        hwc hwcVar = this.z;
        hwcVar.getClass();
        cf cfVar = (cf) pwfVar.a.io();
        cfVar.getClass();
        abvk abvkVar = (abvk) pwfVar.C.io();
        abvkVar.getClass();
        abmt abmtVar = (abmt) pwfVar.l.io();
        abmtVar.getClass();
        ci ciVar = (ci) pwfVar.b.io();
        ciVar.getClass();
        aefv aefvVar = (aefv) pwfVar.n.io();
        aefvVar.getClass();
        ?? r9 = pwfVar.h;
        xgn xgnVar = (xgn) pwfVar.p.io();
        xgnVar.getClass();
        hfk hfkVar = (hfk) pwfVar.j.io();
        hfkVar.getClass();
        ?? Io = pwfVar.v.io();
        Io.getClass();
        yha yhaVar = (yha) pwfVar.t.io();
        yhaVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) pwfVar.A.io();
        scheduledExecutorService.getClass();
        Executor executor = (Executor) pwfVar.d.io();
        executor.getClass();
        avmb avmbVar = (avmb) pwfVar.i.io();
        avmbVar.getClass();
        abea abeaVar = (abea) pwfVar.k.io();
        abeaVar.getClass();
        ?? Io2 = pwfVar.s.io();
        Io2.getClass();
        ?? Io3 = pwfVar.x.io();
        Io3.getClass();
        acdq acdqVar = (acdq) pwfVar.m.io();
        acdqVar.getClass();
        ?? Io4 = pwfVar.y.io();
        Io4.getClass();
        pwfVar.c.io().getClass();
        acxn acxnVar = (acxn) pwfVar.r.io();
        acxnVar.getClass();
        jij jijVar = (jij) pwfVar.B.io();
        jijVar.getClass();
        axfd axfdVar = (axfd) pwfVar.o.io();
        jnj jnjVar = (jnj) pwfVar.z.io();
        jnm jnmVar = (jnm) pwfVar.f.io();
        jnmVar.getClass();
        vxz vxzVar = (vxz) pwfVar.q.io();
        vxzVar.getClass();
        abgo abgoVar = (abgo) pwfVar.g.io();
        abgoVar.getClass();
        hhb hhbVar = (hhb) pwfVar.w.io();
        hhbVar.getClass();
        vxz vxzVar2 = (vxz) pwfVar.e.io();
        vxzVar2.getClass();
        this.aD = new hwg(hwcVar, cfVar, abvkVar, abmtVar, ciVar, aefvVar, r9, xgnVar, hfkVar, Io, yhaVar, scheduledExecutorService, executor, avmbVar, abeaVar, Io2, Io3, acdqVar, Io4, acxnVar, jijVar, axfdVar, jnjVar, jnmVar, vxzVar, abgoVar, hhbVar, vxzVar2, (vxz) pwfVar.u.io());
        this.aE = new abfv((abvk) this.P.io(), this.u);
        this.aF = new abhh((abvk) this.P.io(), (abhf) this.w);
        this.aG = new abgx((abvk) this.P.io(), (abvc) this.Q.io(), this.z, Integer.valueOf(this.U), this.ag.l(116, 45822170L, false));
        if (!this.ag.l(44, 45682398L, false)) {
            this.aH = new abgu((abvk) this.P.io(), this.v);
        }
        hwc hwcVar2 = this.z;
        hwcVar2.V = this.aP;
        hwcVar2.P = this;
        MusicPlayerView musicPlayerView = this.W;
        hwcVar2.getClass();
        musicPlayerView.ab = new iqc(hwcVar2, 6);
    }

    @Override // defpackage.jmp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.aI = new xxq(context.getResources(), (abvk) this.P.io(), this.x, (ycp) this.j.io(), this.T);
        requireActivity().getLifecycle().b(this.aI);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MusicPlayerView musicPlayerView = this.W;
        if (musicPlayerView != null) {
            musicPlayerView.post(new ixe(this, 9));
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.c.b(this.aN);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [aunn, java.lang.Object] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cf cfVarRequireActivity = requireActivity();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.watch_fragment, viewGroup, false);
        MusicPlayerView musicPlayerView = (MusicPlayerView) viewGroup2.findViewById(R.id.watch_player);
        this.W = musicPlayerView;
        ruk rukVar = this.an;
        musicPlayerView.getClass();
        rukVar.b = musicPlayerView;
        if (!this.ag.l(41, 45679250L, false)) {
            jqp jqpVar = this.ak;
            ChipCloudChipView chipCloudChipView = (ChipCloudChipView) viewGroup2.findViewById(R.id.player_overlay_chip);
            chipCloudChipView.getClass();
            ?? Io = jqpVar.m.io();
            Io.getClass();
            ?? Io2 = jqpVar.k.io();
            Io2.getClass();
            ?? Io3 = jqpVar.c.io();
            Io3.getClass();
            ?? Io4 = jqpVar.e.io();
            Io4.getClass();
            ?? Io5 = jqpVar.d.io();
            Io5.getClass();
            ?? Io6 = jqpVar.h.io();
            Io6.getClass();
            avmb avmbVar = (avmb) jqpVar.n.io();
            avmbVar.getClass();
            ?? Io7 = jqpVar.f.io();
            Io7.getClass();
            ?? Io8 = jqpVar.p.io();
            Io8.getClass();
            awmd awmdVar = jqpVar.b;
            awmd awmdVar2 = jqpVar.l;
            ?? Io9 = jqpVar.a.io();
            Io9.getClass();
            ?? Io10 = jqpVar.g.io();
            Io10.getClass();
            ?? Io11 = jqpVar.o.io();
            Io11.getClass();
            ?? Io12 = jqpVar.j.io();
            Io12.getClass();
            ?? Io13 = jqpVar.i.io();
            Io13.getClass();
            this.aL = new jnc(chipCloudChipView, Io, Io2, Io3, Io4, Io5, Io6, avmbVar, Io7, Io8, awmdVar, awmdVar2, Io9, Io10, Io11, Io12, Io13);
        }
        PlayerPanel playerPanel = (PlayerPanel) viewGroup2.findViewById(R.id.player_panel);
        kjc kjcVar = this.as;
        playerPanel.getClass();
        ?? Io14 = kjcVar.a.io();
        Io14.getClass();
        this.aq = new acda(playerPanel, Io14);
        hwc hwcVar = this.z;
        hwcVar.O = this;
        dfo dfoVar = (dfo) LayoutInflater.from(requireActivity()).inflate(R.layout.player_cast_media_route_button, (ViewGroup) null);
        dfoVar.b(ok.e().c(requireContext(), this.aj.e()));
        this.H.b(dfoVar);
        hwcVar.c(dfoVar);
        hwc hwcVar2 = this.z;
        hwcVar2.v = true;
        hwcVar2.K();
        this.z.S(this.B);
        this.aP = this.ay.F(this.z, this.w);
        aerj aerjVar = this.az;
        hwc hwcVar3 = this.z;
        hwcVar3.getClass();
        adhv adhvVar = (adhv) aerjVar.a.io();
        adhvVar.getClass();
        axfd axfdVar = (axfd) aerjVar.c.io();
        axfdVar.getClass();
        abvn abvnVar = (abvn) aerjVar.d.io();
        abvnVar.getClass();
        hwz hwzVar = (hwz) aerjVar.g.io();
        hwzVar.getClass();
        this.aC = new hwr(hwcVar3, adhvVar, axfdVar, abvnVar, hwzVar, aerjVar.e, aerjVar.f, aerjVar.b);
        abct abctVar = new abct(cfVarRequireActivity);
        this.aK = abctVar;
        abctVar.setOnClickListener(new hxg(this, 4));
        this.aa = new jmt(this.aK, this.o);
        viewGroup2.addView(this.aK);
        viewGroup2.addView(this.z);
        viewGroup2.addView(this.G);
        viewGroup2.addView(this.ai.jM());
        playerPanel.setAccessibilityDelegate(new jnf((int) cfVarRequireActivity.getResources().getDimension(R.dimen.remix_generic_button_size)));
        View viewFindViewById = viewGroup2.findViewById(R.id.player_error_icon_layout);
        viewGroup2.bringChildToFront(viewFindViewById);
        this.al.f(this);
        this.M.d();
        if (bundle != null) {
            jnh jnhVar = this.l;
            if (bundle.containsKey("background_failed")) {
                try {
                    jnhVar.h = (ajjm) ahng.aA(bundle, "background_failed", ajjm.a, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik unused) {
                }
            }
            jnhVar.j = bundle.getLong("background_start_time");
        }
        this.aJ = new absc(cfVarRequireActivity, new absa(cfVarRequireActivity, this.h, this.f, this.ax));
        this.aM = new hwp(this, 2);
        this.Y = this.au.i((FrameLayout) this.z.findViewById(R.id.audio_video_switch_pill_container));
        this.aB.f("sharedToggleMenuItemMutations", this.V);
        ((izr) this.D.io()).b(this.z.findViewById(R.id.player_overflow_button), this.V);
        return viewGroup2;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        this.an.b = null;
        this.A.i();
        this.W.f.i();
        this.al.g(this);
        this.M.e();
    }

    @Override // defpackage.cc
    public final void onDetach() {
        if (this.aI != null) {
            requireActivity().getLifecycle().c(this.aI);
        }
        this.aI = null;
        super.onDetach();
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        ((abvk) this.P.io()).B();
        this.af.d();
        cf cfVarRequireActivity = requireActivity();
        if (cfVarRequireActivity.isInMultiWindowMode()) {
            return;
        }
        jnh jnhVar = this.l;
        if (System.currentTimeMillis() - jnhVar.j < 30000 && !jnhVar.a.c() && !jnhVar.k) {
            ajjm ajjmVar = jnhVar.h;
            if (!jnh.c(ajjmVar)) {
                ajws ajwsVar = jnhVar.i;
                if (ajwsVar != null) {
                    jnhVar.b(ajwsVar);
                }
            } else if (ajjmVar != null) {
                int i = ajjmVar.b;
                if ((i & 2) != 0) {
                    arat aratVar = ajjmVar.c;
                    if (aratVar == null) {
                        aratVar = arat.a;
                    }
                    aeba aebaVar = jnhVar.g;
                    if (aebaVar.c(aratVar.m)) {
                        jnhVar.k = true;
                        jnhVar.b.b(aratVar, jnhVar.e, null);
                        aebaVar.a(aratVar.m);
                        jnhVar.a();
                    }
                } else if ((i & 4) != 0) {
                    ajws ajwsVar2 = ajjmVar.d;
                    if (ajwsVar2 == null) {
                        ajwsVar2 = ajws.a;
                    }
                    jnhVar.b(ajwsVar2);
                }
            }
        }
        jnhVar.d.a("MUSIC_BACKGROUND_PAUSED_UPSELL", 1308);
        if (cfVarRequireActivity.getIntent().getIntExtra("intent_notification_source", -1) == 1308) {
            jnhVar.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(58534)), null);
        }
        jnhVar.j = 0L;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        jnh jnhVar = this.l;
        if (bundle != null) {
            ajjm ajjmVar = jnhVar.h;
            if (ajjmVar != null) {
                ahng.aG(bundle, "background_failed", ajjmVar);
            }
            bundle.putLong("background_start_time", jnhVar.j);
        }
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        hwr hwrVar = this.aC;
        avmm avmmVar = hwrVar.e;
        hws hwsVar = hwrVar.n;
        abvn abvnVar = hwrVar.b;
        int i = 3;
        int i2 = 1;
        int i3 = 10;
        avmn avmnVarAl = ((avlh) abvnVar.r().a).i(new abwr(i2)).al(new hwd(hwsVar, 7), new hpw(i3));
        int i4 = 0;
        int i5 = 8;
        int i6 = 9;
        avmn avmnVarAl2 = ((avlh) abvnVar.r().n).i(new abwr(i2)).al(new hwd(hwsVar, i6), new hpw(i3));
        int i7 = 2;
        avmmVar.e(avmnVarAl, abvnVar.P().i(new abwr(i2)).al(new hwd(hwsVar, i5), new hpw(i3)), avmnVarAl2);
        axfd axfdVar = hwrVar.p;
        axfdVar.ai(hwrVar.f);
        if (axfdVar.ah().isPresent()) {
            hwrVar.b((hyw) axfdVar.ah().get());
        } else {
            hwrVar.m = true;
        }
        avmmVar.c(hwrVar.o.h().p().al(new hwd(hwrVar, 6), new hpw(i6)));
        if (((vxz) hwrVar.d.io()).l(85, 45746502L, false)) {
            avlh avlhVarI = ((WatchWhileLayout) hwrVar.c.io()).y().i(new abwr(i2));
            hwc hwcVar = hwrVar.a;
            hwcVar.getClass();
            avmmVar.c(avlhVarI.al(new hva(hwcVar, i5), new hpw(i6)));
        }
        this.aA.ai(this.aM);
        avmm avmmVar2 = this.ac;
        igp igpVar = this.aO;
        abvn abvnVar2 = this.d;
        int i8 = 14;
        avmmVar2.e(((avlh) abvnVar2.r().n).i(new abwr(i2)).al(new jnb(igpVar, i6), new ihp(i8)), abvnVar2.P().i(new abwr(i2)).al(new jnb(igpVar, i3), new ihp(i8)));
        int i9 = 4;
        avmmVar2.e(this.d.M(new hys(i4), new hys(i7)).i(new abwr(i2)).al(new hxi(this.x.i, i9), new hpw(20)));
        avmmVar2.e(this.A.l(this.d));
        avmmVar2.e(this.aE.a(this.d));
        avmmVar2.e(this.aF.a(this.d));
        xxq xxqVar = this.aI;
        if (xxqVar != null) {
            abvn abvnVar3 = this.d;
            avmmVar2.e(((avlh) abvnVar3.r().p).i(aawb.y(abvnVar3.X(), 4194304L)).i(new abwr(i4)).al(new abhb(xxqVar, i9), new abeq(i3)));
        }
        avmmVar2.e(this.aG.a(this.d));
        abgu abguVar = this.aH;
        if (abguVar != null) {
            avmmVar2.e(abguVar.c(this.d));
        }
        avmmVar2.e(this.C.u.a(this.d));
        hwf hwfVar = this.aD.k;
        abvn abvnVar4 = this.d;
        ArrayList arrayList = new ArrayList();
        Object obj = abvnVar4.r().a;
        hwg hwgVar = (hwg) hwfVar.a;
        avmb avmbVar = hwgVar.g;
        int i10 = 7;
        arrayList.add(((avlh) obj).L(avmbVar).al(new hwd(hwfVar, i7), new hpw(i10)));
        arrayList.add(abvnVar4.P().L(avmbVar).al(new hwd(hwfVar, i), new hpw(i10)));
        arrayList.add(((avlh) abvnVar4.r().k).L(avmbVar).al(new hwd(hwfVar, i9), new hpw(i10)));
        abmt abmtVar = hwgVar.j;
        if (abmtVar != null && abmtVar.aD()) {
            arrayList.add(abvnVar4.F().L(avmbVar).al(new hwd(hwfVar, i9), new hpw(7)));
        }
        avmmVar2.e((avmn[]) arrayList.toArray(new avmn[0]));
        avmmVar2.e(this.aD.X.b(this.d));
        Object obj2 = this.k.c;
        abvn abvnVar5 = this.d;
        int i11 = 11;
        int i12 = 15;
        int i13 = 1;
        int i14 = 12;
        avmmVar2.e(((avlh) abvnVar5.r().a).i(new abwr(1)).al(new jnb(obj2, i11), new ihp(i12)), abvnVar5.P().i(new abwr(i13)).al(new jnb(obj2, i14), new ihp(i12)));
        hzo hzoVar = this.aa.f;
        abvn abvnVar6 = this.d;
        avlh avlhVarI2 = ((avlh) abvnVar6.r().a).i(new abwr(i13));
        hzo hzoVar2 = ((jmt) hzoVar.a).f;
        hzoVar2.getClass();
        int i15 = 19;
        avlh avlhVarB = abvnVar6.ao().b();
        hzoVar2.getClass();
        int i16 = 1;
        avmmVar2.e(avlhVarI2.al(new iho(hzoVar2, i15), new ihp(i3)), avlhVarB.al(new iho(hzoVar2, 20), new ihp(i3)));
        int i17 = 5;
        avmmVar2.e(this.d.P().i(new abwr(i16)).al(new hxi(this.s.h, i17), new hyx(i16)));
        Object obj3 = this.aq.e;
        abvn abvnVar7 = this.d;
        avmmVar2.e(((avlh) abvnVar7.r().n).i(new abwr(i16)).al(new jnb(obj3, i17), new ihp(i14)), abvnVar7.P().i(new abwr(i16)).al(new jnb(obj3, 6), new ihp(i14)), ((avlh) abvnVar7.r().k).i(new abwr(i16)).al(new jnb(obj3, 7), new ihp(i14)));
        jnc jncVar = this.aL;
        if (jncVar != null) {
            abvn abvnVar8 = this.d;
            ArrayList arrayList2 = new ArrayList();
            avlh avlhVarH = abvnVar8.P().x(new jna(i4)).x(new jna(i7)).H(new igz(i7));
            jnd jndVar = jncVar.p;
            jnc jncVar2 = (jnc) jndVar.a;
            avmb avmbVar2 = jncVar2.e;
            arrayList2.add(avlhVarH.L(avmbVar2).al(new jnb(jndVar, i4), new ihp(i11)));
            arrayList2.add(((avlh) jncVar2.f.io()).p().L(avmbVar2).al(new jnb(jndVar, i7), new ihp(i11)));
            arrayList2.add(((hfn) jncVar2.g.io()).y().p().L(avmbVar2).al(new jnb(jndVar, i), new ihp(i11)));
            arrayList2.add(((xru) jncVar2.b.io()).H().O(avmbVar2).ag(new jnb(jndVar, i9), new ihp(i11)));
            arrayList2.add(((hwz) jncVar2.h.io()).h().p().L(avmbVar2).al(new jnb(jndVar, 1), new ihp(i11)));
            avmmVar2.e((avmn[]) arrayList2.toArray(new avmn[arrayList2.size()]));
        }
        avmmVar2.e(((avlh) this.d.r().a).i(new abwr(1)).al(new hxi(this.y.d, i), new hpw(i15)));
        aber aberVar = this.F.s;
        abvn abvnVar9 = this.d;
        avmmVar2.e(((avlh) abvnVar9.r().a).i(aawb.y(abvnVar9.X(), 2048L)).i(new abwr(1)).al(new aawl(new aawi(aberVar, 15), "IPOP", 1), new abeq(i4)), ((avlh) abvnVar9.r().i).i(aawb.y(abvnVar9.X(), 2048L)).i(new abwr(1)).al(new aawl(new aawi(aberVar, 16), "IPOP", 2), new abeq(i4)), abvnVar9.ao().b().i(aawb.y(abvnVar9.X(), 2048L)).i(new abwr(i4)).al(new aawi(aberVar, 17), new abeq(i4)));
        hwf hwfVar2 = this.z.i.d;
        avmmVar2.e(this.d.P().P().L(((hwj) hwfVar2.a).b).al(new hwd(hwfVar2, 5), new hpw(8)));
        avmmVar2.e(this.C.B.a(this.d));
        this.b.f(this.C.v);
        this.b.f(this.aD.l);
        this.b.f(this.aD.U);
        this.b.f(this.k.d);
        this.b.f(this.F.t);
        this.ae.i(this.at);
        int i18 = 13;
        this.ad = this.ar.h().i(new abwr(1)).al(new jnb(this, 8), new ihp(i18));
        this.aD.g();
        hxj hxjVar = this.Y;
        if (hxjVar != null) {
            hxjVar.c();
            if (!this.ag.l(81, 45739191L, false)) {
                avmmVar2.e(this.Y.k.a(this.d));
                this.b.f(this.Y.j);
            }
        }
        jmx jmxVar = this.m;
        jmxVar.f = this.aJ;
        jmxVar.a = this.n;
        this.am.b(false);
        if (this.aA.ah().isPresent()) {
            j(this.aA.ah());
        }
        this.r.a(this);
        this.L.b = new igp(this, null);
        jnm jnmVar = this.N;
        Object obj4 = jnmVar.d;
        khn khnVar = (khn) jnmVar.b;
        ((avmm) obj4).c(avlh.f(((avlh) khnVar.a).P(), ((avlh) khnVar.b).P(), new mkw(new jnk(0), 1)).p().L((avmb) jnmVar.c).al(new jnb(new dmf((Object) jnmVar, 4, (int[]) null), i18), new jnb(jnl.a, 14)));
        if (this.ag.l(69, 45728267L, false)) {
            ((aczl) this.O.io()).B();
        }
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        this.r.a(null);
        this.ac.b();
        hwr hwrVar = this.aC;
        hwrVar.e.b();
        hwrVar.p.ak(hwrVar.f);
        sxw sxwVar = hwrVar.g;
        if (sxwVar != null && !sxwVar.d()) {
            hwrVar.g.c();
        }
        hwrVar.k = false;
        this.aA.ak(this.aM);
        this.s.a();
        this.b.l(this.C.v);
        this.b.l(this.aD.l);
        this.b.l(this.aD.U);
        this.b.l(this.k.d);
        this.b.l(this.F.t);
        Object obj = this.ad;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.aD.f();
        hxj hxjVar = this.Y;
        if (hxjVar != null) {
            hxjVar.b();
            if (!this.ag.l(81, 45739191L, false)) {
                this.b.l(this.Y.j);
            }
        }
        jmx jmxVar = this.m;
        jmxVar.f = null;
        jmxVar.a = null;
        this.ae.i(null);
        this.am.b(true);
        this.L.b = null;
        jnm jnmVar = this.N;
        ((avmm) jnmVar.d).b();
        jnmVar.a(false);
        if (this.ag.l(69, 45728267L, false)) {
            ((avmm) ((aczl) this.O.io()).e).b();
        }
    }
}
