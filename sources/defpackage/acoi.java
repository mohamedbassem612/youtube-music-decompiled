package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.reel.internal.fragment.ReelTouchCaptureView;
import com.google.android.libraries.youtube.reel.internal.pager.ReelLinearLayoutManager;
import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class acoi extends acmm implements acnn, acvf, acpa, acmn, actu, aclp, acqt, acmf, acqr, abgv, acpo, acmz, acnh, zwh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl");
    public static final String g = String.valueOf(acnl.class.getName()).concat("$ReelSequenceControllerStateKey");
    public static final String h = String.valueOf(acoi.class.getName()).concat("$ReelSequenceControllerStateKey");
    public static final String i = String.valueOf(acnl.class.getName()).concat("$ReelHiddenSurveysKey");
    public acrc A;
    public acve B;
    public acpc C;
    public acpe D;
    public aclm E;
    public abvk F;
    public actt G;
    public abvn H;
    public mbc I;
    public tbt J;
    public adhv K;
    public vxe L;
    public zwb M;
    public aunn N;
    public xgm O;
    public abea P;
    public Handler Q;
    public awmd R;
    public tre S;
    public Runnable V;
    public final awli W;
    public acor X;
    public aunn Y;
    public aunn Z;
    public tqj aA;
    public awmd aB;
    public wbz aC;
    public aunn aD;
    public aunn aE;
    public aunn aF;
    public acmt aG;
    public acpm aH;
    public aunn aI;
    public final acoh aJ;
    public acom aK;
    public final avmm aL;
    public final avmm aM;
    public final awly aN;
    public final awly aO;
    public final awly aP;
    public final awly aQ;
    public final awly aR;
    public final Set aS;
    public final AtomicBoolean aT;
    public final AtomicBoolean aU;
    public final Object aV;
    public final awli aW;
    public final awli aX;
    public final awli aY;
    public acoz aZ;
    public acou aa;
    public abhe ab;
    public abhh ac;
    public abgq ad;
    public vyo ae;
    public xhu af;
    public Set ag;
    public aunn ah;
    public aefv ai;
    public Optional aj;
    public acme ak;
    public acmg al;
    public avmb am;
    public aeqw an;
    public acdc ao;
    public aunn ap;
    public wyl aq;
    public ahey ar;
    public acul as;
    public absg at;
    public acnm au;
    public acva av;
    public acno aw;
    public xeu ax;
    public acmy ay;
    public aeqq az;
    private final awlk b;
    public ajwo bA;
    public ajwo bB;
    public Optional bC;
    public Optional bD;
    public Optional bE;
    public boolean bF;
    public final awli bG;
    public boolean bH;
    public Optional bI;
    public final String bJ;
    public boolean bK;
    public Size bL;
    public boolean bM;
    public boolean bN;
    public boolean bO;
    public agkz bP;
    public String bQ;
    int bR;
    public acoq bS;
    public acmx bT;
    public aboi bU;
    public aetm bV;
    public aetk bW;
    public rrf bX;
    public aetc bY;
    public aeqt bZ;
    public ReelPlayerView ba;
    public View bb;
    public ReelRecyclerView bc;
    ViewGroup bd;
    ViewGroup be;
    ViewGroup bf;
    public boolean bg;
    public boolean bh;
    boolean bi;
    public boolean bj;
    public zwa bk;
    public boolean bl;
    public Optional bm;
    public long bn;
    public int bo;
    public acol bp;
    public acok bq;
    public apfu br;
    public String bs;
    public boolean bt;
    public long bu;
    public boolean bv;
    public boolean bw;
    public final awli bx;
    public final awli by;
    public final awli bz;
    private final awly c;
    private String cA;
    private Optional cB;
    private abnl cC;
    private List cD;
    private apfq cE;
    private acnb cF;
    private boolean cG;
    private boolean cH;
    private Optional cI;
    private long cJ;
    private long cK;
    private boolean cL;
    private boolean cM;
    private Runnable cN;
    private boolean cO;
    private int cP;
    private int cQ;
    public vxz ca;
    public vxz cb;
    public vxz cc;
    public vxz cd;
    public vxz ce;
    public acsj cf;
    public acsj cg;
    public aeid ch;
    public adif ci;
    public adz cj;
    public hno ck;
    public adif cl;
    public adyc cm;
    public auor cn;
    public adyc co;
    public aawr cp;
    public rnj cq;
    public vwt cr;
    public axlj cs;
    public ahud ct;
    public abxv cu;
    public qcb cv;
    private vqi cw;
    private View cx;
    private SwipeRefreshLayout cy;
    private Bundle cz;
    private final awly d;
    private final awly e;
    private final AtomicBoolean f;
    public acnk k;
    public aunn l;
    public actj m;
    public acni n;
    public acmw o;
    public acvd p;
    public acng q;
    public abfv r;
    public aunn s;
    public acqz t;
    public actv u;
    public actr v;
    public acts w;
    public awmd x;
    public actm y;
    public actw z;
    public final zkk j = new acnz(this);
    public boolean T = false;
    public int U = 0;

    public acoi() {
        Boolean bool = Boolean.FALSE;
        this.W = new awli(bool);
        this.aJ = new acoh(this);
        this.aL = new avmm();
        this.aM = new avmm();
        this.b = new awlk();
        this.c = new awli().az();
        this.aN = new awli().az();
        this.aO = new awli().az();
        this.aP = new awli().az();
        this.aQ = new awli().az();
        this.aR = new awli().az();
        this.d = new awli(tvz.b).az();
        this.e = new awli(agke.q(arbd.USER_INTERFACE_ORIENTATION_PORTRAIT));
        this.aS = new HashSet();
        this.f = new AtomicBoolean(false);
        this.aT = new AtomicBoolean(false);
        this.aU = new AtomicBoolean(false);
        this.aV = new Object();
        this.cw = null;
        this.aW = new awli(bool);
        this.aX = new awli(bool);
        this.aY = new awli(bool);
        this.bg = false;
        this.bh = false;
        this.bi = false;
        this.bj = false;
        this.bl = false;
        this.bm = Optional.empty();
        this.bn = Long.MIN_VALUE;
        this.bo = -1;
        this.cB = Optional.empty();
        this.br = null;
        this.cD = agpi.a;
        this.cE = null;
        this.bR = 1;
        this.bt = false;
        this.bu = Long.MIN_VALUE;
        this.bv = false;
        this.cG = false;
        this.bw = false;
        this.cH = false;
        this.bx = new awli(bool);
        this.by = new awli(bool);
        this.bz = new awli(bool);
        this.bA = null;
        this.bB = null;
        this.bC = Optional.empty();
        this.cI = Optional.empty();
        this.bD = Optional.empty();
        this.bE = Optional.empty();
        this.cM = true;
        this.bG = new awli(Boolean.TRUE);
        this.bI = Optional.empty();
        this.bJ = UUID.randomUUID().toString();
        this.bK = false;
        this.bL = new Size(0, 0);
        this.bM = false;
        this.bO = false;
        this.bP = agpr.a;
        this.bQ = null;
        this.cO = false;
        this.cP = 0;
        this.cQ = 0;
    }

    public static boolean aa(Context context) {
        Optional optionalOfNullable = Optional.ofNullable(context);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(ab(((Context) optionalOfNullable.get()).getResources().getConfiguration())));
        }
        return ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
    }

    public static boolean ab(Configuration configuration) {
        return configuration.orientation == 2;
    }

    public static final Optional ao(alqc alqcVar) {
        Optional optionalAb = aecm.ab(alqcVar);
        if (true == optionalAb.isPresent() && (((aqhx) optionalAb.get()).c & 1) == 0) {
            optionalAb = Optional.empty();
        }
        if (true != optionalAb.isPresent()) {
            return optionalAb;
        }
        ajwo ajwoVar = ((aqhx) optionalAb.get()).d;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return Optional.ofNullable(ajwoVar);
    }

    private final Optional aq() {
        ap();
        return Optional.empty();
    }

    private final void ar(float f, boolean z) {
        View view = this.bb;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new acod(this, String.valueOf(getClass().getSimpleName()).concat("-RootView2"), false, 0.0f));
        }
    }

    private final void as() {
        acor acorVar;
        ViewGroup viewGroup = this.bf;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ReelPlayerView reelPlayerView = this.ba;
        if (reelPlayerView != null) {
            reelPlayerView.removeAllViews();
        }
        if (this.ck.G() && (acorVar = this.X) != null && (acorVar.getParent() instanceof ViewGroup)) {
            ((ViewGroup) acorVar.getParent()).removeView(acorVar);
        }
        this.X.removeAllViews();
    }

    private final void at(ajwo ajwoVar) {
        zyz zyzVar;
        if (aecm.ar(ajwoVar)) {
            acoa acoaVar = new acoa(this, ajwoVar);
            if (this.ck.aJ() && (zyzVar = (zyz) this.as.a.getAndSet(new zyz())) != null) {
                zyzVar.cancel(false);
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            this.t.b.d(((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).z, ajwoVar.c, true);
            this.t.b.i(acoaVar);
            acqz acqzVar = this.t;
            if (((vxz) acqzVar.at.m).l(109, 45824695L, false)) {
                acqh acqhVar = acqzVar.ag;
                ReelRecyclerView reelRecyclerView = acqzVar.y;
                if (acqhVar == null || reelRecyclerView == null) {
                    return;
                }
                reelRecyclerView.aG().m((acrp) acqhVar.jV(reelRecyclerView, 6));
            }
        }
    }

    private final void au(apfp apfpVar, Bundle bundle) {
        long j = bundle.getLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", this.I.f().toEpochMilli());
        String string = bundle.getString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", "warm");
        bundle.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY");
        bundle.remove("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY");
        acok acokVar = this.bq;
        abnl abnlVar = this.cC;
        ajwo ajwoVar = abnlVar != null ? abnlVar.b : null;
        apfu apfuVar = this.br;
        actm actmVar = acokVar.b;
        if (actmVar.c().isEmpty() || j != actmVar.h) {
            aunn aunnVar = acokVar.c;
            if (((aenu) aunnVar.io()).l()) {
                if (ajwoVar != null) {
                    ((aenu) aunnVar.io()).e(aewo.u(41, ajwoVar.c, aecm.V(ajwoVar), ajwoVar, 3), Long.valueOf(j));
                } else {
                    tqj tqjVar = acokVar.d;
                    int i2 = tqr.a;
                    if (tqjVar.k(1073830120)) {
                        aawr aawrVar = acokVar.f;
                        aawr.v(zvn.b, zvm.y, "Command is null when requesting page in automated logging.");
                    }
                }
            }
            if (string.equals("warm")) {
                actmVar.m(0, 2, apfpVar, null, j, string, apfuVar);
            }
        }
        this.y.g("r_fa", this.cJ);
        this.cJ = 0L;
        this.y.g("r_fc", this.cK);
        this.cK = 0L;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    private final void av(Optional optional) {
        Optional optionalI = this.t.i();
        if (optionalI.isEmpty() || optional.isEmpty()) {
            return;
        }
        adyc adycVar = this.co;
        String strE = ((acra) optionalI.get()).e();
        Object obj = optional.get();
        if (adycVar.f.containsKey(strE)) {
            if (obj == aped.REEL_NAVIGATION_REASON_USER_INITIATED) {
                adycVar.f(new acfb(strE, 3));
            } else if (obj == aped.REEL_NAVIGATION_REASON_PLAYBACK_ENDED) {
                adycVar.f(new acfb(strE, 4));
            }
            adycVar.c.remove(strE);
        }
    }

    private final void aw() {
        View view = this.cx;
        if (view != null) {
            if (((vxz) this.ck.i).l(208, 45768728L, false)) {
                view.setBackgroundResource(R.drawable.reel_scrim_shorts_while_top_refresh);
                tym.h(view, new tyl(getResources().getDimensionPixelSize(R.dimen.reel_scrim_shorts_while_height_top_gradient_refresh), 1), ViewGroup.LayoutParams.class);
            }
            apfu apfuVar = this.br;
            if (apfuVar != null) {
                apfd apfdVar = apfuVar.j;
                if (apfdVar == null) {
                    apfdVar = apfd.a;
                }
                if ((apfdVar.b & 2) != 0 && this.ck.O()) {
                    apfd apfdVar2 = apfuVar.j;
                    if (apfdVar2 == null) {
                        apfdVar2 = apfd.a;
                    }
                    float f = apfdVar2.d;
                    int i2 = tzk.i(view.getContext(), R.attr.ytOverlayBackgroundSolid);
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{avv.f(i2, (int) (f * 255.0f)), avv.f(i2, 0)}));
                }
            }
            if (apfuVar != null) {
                apfd apfdVar3 = apfuVar.j;
                if (apfdVar3 == null) {
                    apfdVar3 = apfd.a;
                }
                if ((apfdVar3.b & 8) == 0 || !this.ck.O()) {
                    return;
                }
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                apfd apfdVar4 = apfuVar.j;
                if (apfdVar4 == null) {
                    apfdVar4 = apfd.a;
                }
                tym.h(view, new tyl(Math.round(twm.a(displayMetrics, apfdVar4.e)), 1), ViewGroup.LayoutParams.class);
            }
        }
    }

    private final void ax() {
        actr actrVar = this.v;
        actv actvVar = actrVar.c;
        actvVar.F(actrVar);
        actrVar.g.b();
        actrVar.a();
        hno hnoVar = actrVar.i;
        if (hnoVar.bd()) {
            actrVar.h = actr.g(actvVar, actrVar.b, actrVar.d, hnoVar, actrVar.e);
        }
        acqz acqzVar = this.t;
        acrn acrnVar = acqzVar.b;
        if (acrnVar != null) {
            acrnVar.p = false;
        }
        if (acqzVar.ak) {
            acqzVar.a.g();
        }
        this.G.a.b();
        this.u.F(this);
        this.J.l(this.y);
        J();
        acoz acozVar = this.aZ;
        if (acozVar != null) {
            this.J.l(acozVar.b.v);
        }
        this.J.l(this.aK);
    }

    private final void ay() {
        Iterator it = this.aS.iterator();
        while (it.hasNext()) {
            this.cu.L((String) it.next());
        }
    }

    private final boolean az(alqc alqcVar) {
        if ((this.ck.aZ() && this.bK) || aecm.W(alqcVar) != null) {
            return false;
        }
        if (!this.ck.ax()) {
            apez apezVar = alqcVar.d;
            if (apezVar == null) {
                apezVar = apez.a;
            }
            if (apezVar.b == 423410527) {
                return false;
            }
        }
        return true;
    }

    private final xgn b(String str) {
        aenr aenrVarC = ((aenu) this.aF.io()).c(str);
        return aenrVarC != null ? aenrVarC.a() : this.O.hB();
    }

    @Override // defpackage.acvf
    public final /* synthetic */ acvq A() {
        return this.ba;
    }

    public final acvv B() {
        acrp acrpVarB = acmo.b(this.t.i());
        if (acrpVarB != null) {
            return acrpVarB.H();
        }
        return null;
    }

    public final /* synthetic */ ajwo C(ajwo ajwoVar) {
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVar = aoaq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aihf builder = ((aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
        String strI = t().i();
        builder.copyOnWrite();
        aoar aoarVar = (aoar) builder.instance;
        strI.getClass();
        aoarVar.b |= 1;
        aoarVar.c = strI;
        aihhVar.e(aihlVar, (aoar) builder.build());
        return (ajwo) aihhVar.build();
    }

    public final apdw D(alqc alqcVar, ajwo ajwoVar) {
        apfp apfpVar;
        apdo apdoVar;
        apdw apdwVarA;
        apdw apdwVarA2;
        apdw apdwVar = null;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        } else {
            apfpVar = null;
        }
        if (this.bK && !this.ck.l()) {
            apdw apdwVar2 = apdw.REEL_LOOP_BEHAVIOR_UNKNOWN;
            if (apfpVar == null || (apfpVar.d & 134217728) == 0 ? alqcVar == null || (alqcVar.b & SemanticState.Hidden) == 0 || (apdwVarA2 = apdw.a(alqcVar.i)) == null : (apdwVarA2 = apdw.a(apfpVar.Y)) == null) {
                apdwVarA2 = apdwVar2;
            }
            if (apdwVarA2 == apdw.REEL_LOOP_BEHAVIOR_AUTO_ADVANCE && !this.bl) {
                return apdw.REEL_LOOP_BEHAVIOR_REPEAT;
            }
            if (apdwVarA2 != apdwVar2) {
                return apdwVarA2;
            }
        }
        if (apfpVar == null || (apfpVar.d & 536870912) == 0) {
            apdoVar = null;
        } else {
            apdoVar = apfpVar.Z;
            if (apdoVar == null) {
                apdoVar = apdo.a;
            }
        }
        acpv acpvVar = (acpv) this.aI.io();
        if (acpvVar.j.l() && apdoVar != null) {
            if (1 != (apdoVar.b & 1)) {
                apdoVar = null;
            }
            if (apdoVar != null && apdoVar.c && acpvVar.c()) {
                apdwVar = acpvVar.g.b ? apdw.REEL_LOOP_BEHAVIOR_AUTO_ADVANCE : apdw.REEL_LOOP_BEHAVIOR_REPEAT;
            }
        }
        if (apdwVar != null) {
            return apdwVar;
        }
        return (alqcVar == null || (apdwVarA = apdw.a(alqcVar.h)) == null) ? apdw.REEL_LOOP_BEHAVIOR_UNKNOWN : apdwVarA;
    }

    public final Optional E(alqc alqcVar) {
        Optional optionalAo = ao(alqcVar);
        vre vreVar = new vre(this, 16);
        if (true == optionalAo.isPresent()) {
            optionalAo = Optional.ofNullable(((acoi) vreVar.a).C((ajwo) optionalAo.get()));
        }
        if (optionalAo.isPresent()) {
            return optionalAo;
        }
        Optional optionalOfNullable = Optional.ofNullable(alqcVar);
        if (true == optionalOfNullable.isPresent()) {
            apez apezVar = ((alqc) optionalOfNullable.get()).d;
            if (apezVar == null) {
                apezVar = apez.a;
            }
            optionalOfNullable = Optional.ofNullable(apezVar);
        }
        if (true == optionalOfNullable.isPresent()) {
            apez apezVar2 = (apez) optionalOfNullable.get();
            optionalOfNullable = Optional.ofNullable(apezVar2.b == 139970731 ? (apey) apezVar2.c : apey.a);
        }
        if (true == optionalOfNullable.isPresent()) {
            apex apexVar = ((apey) optionalOfNullable.get()).g;
            if (apexVar == null) {
                apexVar = apex.a;
            }
            optionalOfNullable = Optional.ofNullable(apexVar);
        }
        if (true == optionalOfNullable.isPresent()) {
            apew apewVar = ((apex) optionalOfNullable.get()).b;
            if (apewVar == null) {
                apewVar = apew.a;
            }
            optionalOfNullable = Optional.ofNullable(apewVar);
        }
        if (true == optionalOfNullable.isPresent() && (((apew) optionalOfNullable.get()).b & 16) == 0) {
            optionalOfNullable = Optional.empty();
        }
        Optional optional = optionalOfNullable;
        if (true != optional.isPresent()) {
            return optional;
        }
        ajwo ajwoVar = ((apew) optional.get()).c;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return Optional.ofNullable(ajwoVar);
    }

    public final Optional F() {
        return (Optional) this.R.io();
    }

    public final Optional G() {
        ajwo ajwoVar = this.bA;
        if (ajwoVar == null) {
            return Optional.empty();
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return Optional.of(((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).o);
    }

    public final Optional H(acra acraVar) {
        if (this.ck.aP()) {
            return !acraVar.r ? Optional.of(Long.valueOf(acraVar.b)) : Optional.empty();
        }
        return Optional.empty();
    }

    public final void I() {
        Runnable runnable = this.cN;
        if (runnable != null) {
            this.Q.removeCallbacks(runnable);
            this.cN = null;
        }
    }

    protected final void J() {
        this.aL.b();
        acnk acnkVar = this.k;
        acnkVar.f.F(acnkVar);
        acnkVar.b.b();
        this.o.a.b();
        if (this.ck.Y()) {
            acmo acmoVar = (acmo) this.s.io();
            acmoVar.b.b();
            aazu aazuVar = (aazu) acmoVar.d.b;
            zki zkiVar = aazuVar.a.d;
            if (zkiVar instanceof zkt) {
                ((zkt) zkiVar).f = null;
                aazuVar.g = null;
                aazuVar.f = null;
                aazuVar.e.b();
            }
            acmoVar.a();
            acmoVar.c = null;
        }
        if (this.ck.y()) {
            ((acqf) this.l.io()).a();
        }
        if (this.ck.aG()) {
        }
    }

    public final void K() {
        synchronized (this.aV) {
            this.bE.isPresent();
            this.bE = Optional.empty();
            this.cH = false;
        }
    }

    public final void L(ajwo ajwoVar, alqc alqcVar, boolean z) {
        alqc alqcVar2;
        if (alqcVar != null) {
            if (this.bN) {
                synchronized (this.aV) {
                    I();
                    K();
                }
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            String str = (String) G().orElse("");
            if (!this.ck.aX() || (apfpVar.c & 8) == 0 || apfpVar.o.equals(str)) {
                if ((alqcVar.b & SemanticState.ReadOnly) != 0) {
                    ajwo ajwoVar2 = alqcVar.k;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    this.bB = ajwoVar2;
                    this.bC = Optional.of(ajwoVar2);
                    ajwo ajwoVar3 = this.bB;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                    ajwoVar3.c(aihlVarCheckIsLite2);
                    Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
                    apfp apfpVar2 = (apfp) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                    str = apfpVar2.o;
                    ajwo ajwoVar4 = this.bB;
                    this.bA = ajwoVar4;
                    acqz acqzVar = this.t;
                    long j = this.bu;
                    if (ajwoVar4 != null) {
                        Optional optionalK = acqzVar.k(j);
                        if (optionalK.isPresent()) {
                            ((acra) optionalK.get()).h(ajwoVar4);
                        }
                        if (j == acqzVar.M) {
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                            ajwoVar4.c(aihlVarCheckIsLite3);
                            if (ajwoVar4.j.n(aihlVarCheckIsLite3.d)) {
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                                ajwoVar4.c(aihlVarCheckIsLite4);
                                Object objK3 = ajwoVar4.j.k(aihlVarCheckIsLite4.d);
                                acqzVar.G((apfp) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3)));
                            }
                        }
                    }
                    ajwo ajwoVar5 = this.bB;
                    if (ajwoVar5 != null) {
                        this.c.kk(ajwoVar5);
                    }
                    if (this.bu == this.t.c()) {
                        this.G.c = actt.a(this.bB);
                    }
                    boolean zAk = this.ck.ak();
                    actm actmVar = this.y;
                    if (zAk) {
                        actmVar.i(apfpVar2.U, str);
                    } else {
                        actmVar.h(str);
                    }
                    if (aecm.aA(apfpVar2) != 1) {
                        boolean zM = this.cd.m(48, 45545693L);
                        actm actmVar2 = this.y;
                        if (zM) {
                            actmVar2.j(apfpVar2, this.br);
                        } else {
                            int iB = aawr.B(apfpVar2);
                            synchronized (actmVar2.b) {
                                if (actmVar2.g != null) {
                                    int i2 = actmVar2.m;
                                    if (i2 == 0) {
                                        throw null;
                                    }
                                    if (i2 != iB) {
                                        actmVar2.m = iB;
                                        aihf aihfVarCreateBuilder = amjf.a.createBuilder();
                                        aihfVarCreateBuilder.copyOnWrite();
                                        amjf amjfVar = (amjf) aihfVarCreateBuilder.instance;
                                        amjfVar.f = iB - 1;
                                        amjfVar.b |= 8;
                                        amjf amjfVar2 = (amjf) aihfVarCreateBuilder.build();
                                        aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        amiu amiuVar = (amiu) aihfVarCreateBuilder2.instance;
                                        amjfVar2.getClass();
                                        amiuVar.S = amjfVar2;
                                        amiuVar.d |= 131072;
                                        actmVar2.g.h((amiu) aihfVarCreateBuilder2.build());
                                    }
                                }
                            }
                        }
                    }
                }
                int iAX = a.aX(alqcVar.f);
                int i3 = 2;
                if (iAX == 0 || iAX != 2) {
                    Q(false);
                }
                if ((alqcVar.b & SemanticState.Modal) != 0) {
                    acrn acrnVar = this.t.b;
                    String str2 = alqcVar.l;
                    ajwo ajwoVar6 = alqcVar.k;
                    if (ajwoVar6 == null) {
                        ajwoVar6 = ajwo.a;
                    }
                    acrnVar.d(str2, ajwoVar6.c, false);
                }
                long jB = this.y.b(z, str);
                cf activity = getActivity();
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                int iAU = a.aU(((apfp) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4))).M);
                if ((iAU == 0 || iAU != 2) && !((vxz) this.ck.m).l(28, 45702517L, false)) {
                    synchronized (this.aV) {
                        this.cH = aecm.az(ajwoVar);
                        if (this.bE.isPresent()) {
                            zvp.h(zvn.a, zvm.y, "Last delayed ReelItemPlayback not processed during playback", 0.1d);
                        }
                        alqcVar2 = alqcVar;
                        this.bE = Optional.of(new laz(this, jB, alqcVar2, 15));
                        boolean zAd = ad();
                        long jC = this.ce.c(44, 45722358L, 0L);
                        if (this.bN && !zAd && !this.bH && jC > 0) {
                            I();
                            this.bE.isPresent();
                            Runnable runnableI = afwl.i(new abyz(this, 18));
                            this.cN = runnableI;
                            this.Q.postDelayed(runnableI, jC);
                        }
                    }
                } else {
                    if (activity != null) {
                        activity.runOnUiThread(afwl.i(new laz(this, jB, alqcVar, 16)));
                    }
                    alqcVar2 = alqcVar;
                }
                this.Q.post(afwl.i(new acnp(this, alqcVar2, i3)));
                this.aN.kk(alqcVar2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wjf] */
    public final void M(wjf wjfVar) {
        if (wjfVar != null) {
            this.cI = Optional.of(wjfVar);
        }
        if (this.bv || this.cI.isEmpty()) {
            return;
        }
        Optional optional = this.cI;
        Optional optional2 = this.bC;
        if (optional.isEmpty() || optional2.isEmpty()) {
            return;
        }
        Object obj = optional2.get();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        aihi aihiVar = (aihi) obj;
        aihiVar.c(aihlVarCheckIsLite);
        Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (apfpVar.o.equals(optional.get().G()) || (!apfpVar.p.isEmpty() && apfpVar.o.isEmpty())) {
            this.bv = true;
            this.O.hB().d(new xgj(ByteBuffer.wrap(this.cI.get().ab()).array()));
        }
    }

    public final void N() {
        if (this.bm.isPresent()) {
            this.F.H(D((alqc) this.bm.get(), this.bA) == apdw.REEL_LOOP_BEHAVIOR_REPEAT);
        }
    }

    public final void O() {
        cf activity = getActivity();
        activity.getClass();
        activity.onBackPressed();
    }

    @Override // defpackage.acqr
    public final void P() {
        this.t.y(this);
    }

    public final void Q(boolean z) {
        synchronized (this.aV) {
            this.cL = true;
            this.bH = true;
            if (z) {
                ad();
            }
        }
        actm actmVar = this.y;
        String str = (String) G().orElse("");
        synchronized (actmVar.b) {
            if (!actmVar.i && actmVar.k(str)) {
                actmVar.e.h.p(117);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0213  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:293:0x064b  */
    /* JADX WARN: Code duplicated, block: B:414:0x089e  */
    /* JADX WARN: Code duplicated, block: B:424:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:426:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:444:0x093c  */
    /* JADX WARN: Code duplicated, block: B:467:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f6  */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, wjf] */
    public final void R(long j, alqc alqcVar, long j2) {
        alqd alqdVar;
        amud amudVar;
        int i2;
        apey apeyVar;
        byte[] bArrG;
        alqd alqdVar2;
        aoqt aoqtVar;
        int i3;
        String str;
        int i4;
        int iAX;
        int i5;
        boolean z;
        acoh acohVar;
        int iAX2;
        int iAX3;
        int iAV;
        RelativeLayout.LayoutParams layoutParams;
        TextView textView;
        Optional optionalEmpty;
        boolean zAn;
        acpd acpdVar;
        this.y.f("r_rips");
        this.an.a();
        this.bm = Optional.ofNullable(alqcVar);
        xgn xgnVarT = t();
        alqc alqcVar2 = (alqc) this.bm.get();
        apfa apfaVar = null;
        if ((alqcVar2.b & 32768) == 0) {
            alqdVar = null;
        } else {
            apji apjiVar = alqcVar2.p;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(alqf.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = alqcVar2.p;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alqf.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                alqdVar = (alqd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                alqdVar = null;
            }
        }
        aoqt aoqtVarW = aecm.W((alqc) this.bm.get());
        Optional optionalAb = aecm.ab((alqc) this.bm.get());
        Optional optionalAo = this.bm;
        if (true == optionalAo.isPresent()) {
            optionalAo = ao((alqc) optionalAo.get());
        }
        this.A.e = optionalAb.isPresent() || optionalAo.isPresent();
        this.A.b((aqhx) optionalAb.orElse(null));
        Optional optionalK = this.t.k(j);
        vre vreVar = new vre(this, 17);
        if (true == optionalK.isPresent()) {
            optionalK = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK.get()));
        }
        int i6 = 16;
        if (optionalK.isPresent()) {
            aigj aigjVar = ((acra) optionalK.get()).d;
            i2 = 2;
            if (aigjVar != null) {
                xgnVarT.l(new xgj(aigjVar, (amud) null));
            }
            if (this.cG) {
                amudVar = null;
            } else {
                this.cG = true;
                apji apjiVar3 = alqcVar.x;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVar = apfy.a;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    apji apjiVar4 = alqcVar.x;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                    apjiVar4.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                    zAn = aecm.an((apfx) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
                    amudVar = null;
                } else {
                    if ((alqcVar.b & 2) != 0) {
                        apez apezVar = alqcVar.d;
                        if (apezVar == null) {
                            apezVar = apez.a;
                        }
                        int i7 = apezVar.b;
                        int iBp = acfz.bp(i7);
                        amudVar = null;
                        int i8 = iBp - 1;
                        if (iBp == 0) {
                            throw null;
                        }
                        if (i8 == 0) {
                            apey apeyVar2 = i7 == 139970731 ? (apey) apezVar.c : apey.a;
                            if (apeyVar2 == null || (apeyVar2.b & 4194304) == 0) {
                                apfaVar = null;
                            } else {
                                apji apjiVar5 = apeyVar2.k;
                                if (apjiVar5 == null) {
                                    apjiVar5 = apji.a;
                                }
                                aihl aihlVar2 = apfb.b;
                                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
                                apjiVar5.c(aihlVarCheckIsLite5);
                                if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                                    apji apjiVar6 = apeyVar2.k;
                                    if (apjiVar6 == null) {
                                        apjiVar6 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar2);
                                    apjiVar6.c(aihlVarCheckIsLite6);
                                    Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                                    apfaVar = (apfa) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                                } else {
                                    apfaVar = null;
                                }
                            }
                        } else if (i8 != 1) {
                            apfaVar = null;
                        } else {
                            aljp aljpVar = i7 == 423410527 ? (aljp) apezVar.c : aljp.a;
                            if (aljpVar == null || (aljpVar.b & 64) == 0) {
                                apfaVar = null;
                            } else {
                                apji apjiVar7 = aljpVar.c;
                                if (apjiVar7 == null) {
                                    apjiVar7 = apji.a;
                                }
                                aihl aihlVar3 = apfb.b;
                                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar3);
                                apjiVar7.c(aihlVarCheckIsLite7);
                                if (apjiVar7.j.n(aihlVarCheckIsLite7.d)) {
                                    apji apjiVar8 = aljpVar.c;
                                    if (apjiVar8 == null) {
                                        apjiVar8 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
                                    apjiVar8.c(aihlVarCheckIsLite8);
                                    Object objK4 = apjiVar8.j.k(aihlVarCheckIsLite8.d);
                                    apfaVar = (apfa) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                                } else {
                                    apfaVar = null;
                                }
                            }
                        }
                    } else {
                        amudVar = null;
                    }
                    if (apfaVar == null || (apfaVar.b & 16) == 0) {
                        zAn = false;
                    } else {
                        int iAV2 = a.aV(apfaVar.c);
                        if (iAV2 == 0) {
                            iAV2 = 1;
                        }
                        if (iAV2 == 3 || iAV2 == 4) {
                            zAn = true;
                        } else {
                            zAn = false;
                        }
                    }
                }
                ViewGroup viewGroup = this.bd;
                ReelRecyclerView reelRecyclerView = this.bc;
                if (viewGroup != null && reelRecyclerView != null && zAn) {
                    acpe acpeVar = this.D;
                    acpeVar.f = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reel_player_edu_vertical, viewGroup, true);
                    acpeVar.j = (AccessibilityManager) acpeVar.f.getContext().getSystemService("accessibility");
                    if (acpeVar.s.X()) {
                        RecyclerView recyclerView = acpeVar.g;
                        if (recyclerView != null && (acpdVar = acpeVar.h) != null) {
                            recyclerView.Z(acpdVar);
                        }
                        acpeVar.g = reelRecyclerView;
                        acpeVar.h = new acpd(acpeVar);
                        reelRecyclerView.w(acpeVar.h);
                    } else {
                        reelRecyclerView.w(new acpd(acpeVar));
                    }
                }
            }
        } else {
            amudVar = null;
            i2 = 2;
        }
        N();
        xgnVarT.l(new xgj(alqcVar.g, amudVar));
        if ((alqcVar.b & 2) == 0) {
            apeyVar = null;
        } else {
            apez apezVar2 = alqcVar.d;
            if (apezVar2 == null) {
                apezVar2 = apez.a;
            }
            if (apezVar2.b == 139970731) {
                apez apezVar3 = alqcVar.d;
                if (apezVar3 == null) {
                    apezVar3 = apez.a;
                }
                apeyVar = apezVar3.b == 139970731 ? (apey) apezVar3.c : apey.a;
            } else {
                apeyVar = null;
            }
        }
        if (apeyVar == null) {
            bArrG = null;
        } else {
            apji apjiVar9 = apeyVar.h;
            if (apjiVar9 == null) {
                apjiVar9 = apji.a;
            }
            aihl aihlVar4 = ajiv.b;
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar4);
            apjiVar9.c(aihlVarCheckIsLite9);
            if (apjiVar9.j.n(aihlVarCheckIsLite9.d)) {
                apji apjiVar10 = apeyVar.h;
                if (apjiVar10 == null) {
                    apjiVar10 = apji.a;
                }
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar4);
                apjiVar10.c(aihlVarCheckIsLite10);
                Object objK5 = apjiVar10.j.k(aihlVarCheckIsLite10.d);
                bArrG = ((ajip) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).d.G();
            } else {
                bArrG = null;
            }
        }
        if (bArrG != null) {
            xgnVarT.w(new xgj(bArrG), null);
        }
        if (this.z.i() || this.T) {
            this.F.ap(false, 19);
        }
        if (this.T && this.U == 0) {
            this.U = this.z.d();
        }
        int i9 = 138681066;
        if (this.ci.b(getContext())) {
            acoq acoqVar = this.bS;
            acoqVar.g = true;
            try {
                if (alqcVar.o.isEmpty()) {
                    ((vor) acoqVar.b.io()).A();
                    alqdVar2 = alqdVar;
                    aoqtVar = aoqtVarW;
                    i3 = 10;
                } else {
                    aunn aunnVar = acoqVar.b;
                    String strK = ((vor) aunnVar.io()).I() ? ((vor) aunnVar.io()).k() : null;
                    if (((vor) aunnVar.io()).d() == null) {
                        strK = null;
                    }
                    aiie aiieVar = alqcVar.o;
                    aiieVar.getClass();
                    ArrayList<akuf> arrayList = new ArrayList();
                    for (Object obj : aiieVar) {
                        if (((akuf) obj).b == 138681066) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    for (akuf akufVar : arrayList) {
                        arrayList2.add(tzk.aa(akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b));
                    }
                    List listAi = atqq.ai(arrayList2);
                    if (strK != null && !listAi.contains(strK)) {
                        ((vor) aunnVar.io()).A();
                        strK = null;
                    }
                    for (akuf akufVar2 : alqcVar.o) {
                        int i10 = akufVar2.b;
                        if (i10 == i9) {
                            akuj akujVar = i10 == i9 ? (akuj) akufVar2.c : akuj.b;
                            akujVar.getClass();
                            String strAa = tzk.aa(akujVar);
                            if (strK == null || !awrc.c(strK, strAa)) {
                                ((vor) aunnVar.io()).w(akujVar);
                            } else {
                                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                                aihl aihlVar5 = apxs.b;
                                aihf aihfVarCreateBuilder = apxs.a.createBuilder();
                                aihf aihfVarCreateBuilder2 = akud.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                akud akudVar = (akud) aihfVarCreateBuilder2.instance;
                                strAa.getClass();
                                akudVar.b |= 2;
                                akudVar.d = strAa;
                                akud akudVar2 = (akud) aihfVarCreateBuilder2.build();
                                aihfVarCreateBuilder.copyOnWrite();
                                apxs apxsVar = (apxs) aihfVarCreateBuilder.instance;
                                akudVar2.getClass();
                                apxsVar.e = akudVar2;
                                apxsVar.d = 10;
                                aihhVar.e(aihlVar5, aihfVarCreateBuilder.build());
                                aihn aihnVarBuild = aihhVar.build();
                                aihnVarBuild.getClass();
                                ((vor) aunnVar.io()).x(akujVar, null, true, (ajwo) aihnVarBuild, false, null);
                            }
                            alqdVar = alqdVar;
                            aoqtVarW = aoqtVarW;
                            i9 = 138681066;
                        }
                    }
                    alqdVar2 = alqdVar;
                    aoqtVar = aoqtVarW;
                    String str2 = acoqVar.d;
                    if (str2 == null || ((vor) aunnVar.io()).I() || !((vor) aunnVar.io()).G(str2)) {
                        i3 = 10;
                    } else {
                        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                        aihl aihlVar6 = apxs.b;
                        aihf aihfVarCreateBuilder3 = apxs.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = akud.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        akud akudVar3 = (akud) aihfVarCreateBuilder4.instance;
                        akudVar3.b |= 2;
                        akudVar3.d = str2;
                        akud akudVar4 = (akud) aihfVarCreateBuilder4.build();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apxs apxsVar2 = (apxs) aihfVarCreateBuilder3.instance;
                        akudVar4.getClass();
                        apxsVar2.e = akudVar4;
                        i3 = 10;
                        apxsVar2.d = 10;
                        aihhVar2.e(aihlVar6, aihfVarCreateBuilder3.build());
                        aihn aihnVarBuild2 = aihhVar2.build();
                        aihnVarBuild2.getClass();
                        ((vor) aunnVar.io()).e((ajwo) aihnVarBuild2, null);
                    }
                }
                acoqVar.g = false;
            } catch (Throwable th) {
                acoqVar.g = false;
                throw th;
            }
        } else {
            alqdVar2 = alqdVar;
            aoqtVar = aoqtVarW;
            i3 = 10;
            if (!alqcVar.o.isEmpty()) {
                ((vor) this.ah.io()).A();
                for (akuf akufVar3 : alqcVar.o) {
                    if (akufVar3.b == 138681066) {
                        ((vor) this.ah.io()).w(akufVar3.b == 138681066 ? (akuj) akufVar3.c : akuj.b);
                    }
                }
            }
        }
        Optional optionalI = this.t.i();
        if (true == optionalI.isPresent()) {
            optionalI = Optional.ofNullable(((acra) optionalI.get()).c());
        }
        if (true == optionalI.isPresent() && (((apfp) optionalI.get()).c & 67108864) == 0) {
            optionalI = Optional.empty();
        }
        if (true == optionalI.isPresent()) {
            ajwo ajwoVar = ((apfp) optionalI.get()).F;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            optionalI = Optional.ofNullable(ajwoVar);
        }
        abyy abyyVar = new abyy(this, 9);
        if (true == optionalI.isPresent()) {
            ((acoi) abyyVar.a).L.a((ajwo) optionalI.get());
        }
        Optional optional = this.bm;
        abyy abyyVar2 = new abyy(this, 8);
        if (true == optional.isPresent()) {
            Object obj2 = optional.get();
            Object obj3 = abyyVar2.a;
            alqc alqcVar3 = (alqc) obj2;
            if ((alqcVar3.b & 65536) != 0) {
                vxe vxeVar = ((acoi) obj3).L;
                ajwo ajwoVar2 = alqcVar3.q;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.a(ajwoVar2);
            }
        }
        if ((alqcVar.b & 131072) != 0) {
            vxe vxeVar2 = this.L;
            ajwo ajwoVar3 = alqcVar.r;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            vxeVar2.a(ajwoVar3);
        }
        if (optionalK.isPresent()) {
            acra acraVar = (acra) optionalK.get();
            acraVar.i(alqcVar, true);
            str = acraVar.c().o;
        } else {
            str = null;
        }
        if (aoqtVar == null) {
            if (str != null) {
                acme acmeVar = this.ak;
                if (this.bm.isEmpty()) {
                    optionalEmpty = Optional.empty();
                } else {
                    apez apezVar4 = ((alqc) this.bm.get()).d;
                    if (apezVar4 == null) {
                        apezVar4 = apez.a;
                    }
                    if (apezVar4.b == 139970731) {
                        apez apezVar5 = ((alqc) this.bm.get()).d;
                        if (apezVar5 == null) {
                            apezVar5 = apez.a;
                        }
                        optionalEmpty = Optional.of(apezVar5.b == 139970731 ? (apey) apezVar5.c : apey.a);
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                }
                acmeVar.a(str, optionalEmpty);
            }
            if (optionalK.isPresent()) {
                acmo.b(optionalK);
                acrp acrpVarB = acmo.b(optionalK);
                if ((acrpVarB != null ? acrpVarB.H() : null) != null) {
                    this.aY.kk(Boolean.TRUE);
                }
                if (this.ck.ag()) {
                    this.aX.kk(Boolean.TRUE);
                } else {
                    this.t.s(j);
                }
                if (B() != null) {
                    if (this.ck.aZ() && this.bK) {
                        Z(false);
                    } else {
                        Z(af());
                    }
                }
            }
            apji apjiVar11 = alqcVar.x;
            if (apjiVar11 == null) {
                apjiVar11 = apji.a;
            }
            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apfy.a);
            apjiVar11.c(aihlVarCheckIsLite11);
            Object objK6 = apjiVar11.j.k(aihlVarCheckIsLite11.d);
            apfx apfxVar = (apfx) (objK6 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK6));
            acpe acpeVar2 = this.D;
            acpeVar2.i = null;
            acpeVar2.l = false;
            acpeVar2.n = -1;
            acpeVar2.a = 0;
            acpeVar2.r = 1;
            acpeVar2.o = 0L;
            boolean zAn2 = aecm.an(apfxVar);
            acpeVar2.k = zAn2;
            int i11 = 12;
            if (apfxVar != null && zAn2) {
                acpeVar2.n = apfxVar.g;
                int i12 = apfxVar.b;
                if ((i12 & 2) != 0) {
                    int iAS = a.aS(apfxVar.d);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    acpeVar2.r = iAS;
                } else {
                    acpeVar2.r = 3;
                }
                if ((i12 & 4) != 0) {
                    acpeVar2.o = apfxVar.e;
                }
                if ((i12 & 32) != 0) {
                    acpeVar2.i = xhb.b(apfxVar.h);
                } else {
                    acpeVar2.i = xhb.b(109990);
                }
                View view = acpeVar2.f;
                if (view != null) {
                    if ((apfxVar.b & 1) != 0 && (textView = (TextView) view.findViewById(R.id.reels_edu_swipe_text_view)) != null) {
                        alay alayVar = apfxVar.c;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        textView.setText(alayVar.d);
                    }
                    View view2 = acpeVar2.f;
                    if (view2 != null && (apfxVar.b & 8) != 0 && (iAV = a.aV(apfxVar.f)) != 0 && iAV == 4) {
                        ((RelativeLayout) view2.findViewById(R.id.reel_edu_group)).setBackgroundResource(R.drawable.reel_scrim_vertical_edu_medium);
                        View view3 = acpeVar2.f;
                        view3.getClass();
                        TextView textView2 = (TextView) view3.findViewById(R.id.reels_edu_swipe_text_view);
                        if (textView2 != null && (layoutParams = (RelativeLayout.LayoutParams) textView2.getLayoutParams()) != null) {
                            layoutParams.addRule(12);
                            View view4 = acpeVar2.f;
                            view4.getClass();
                            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, (int) TypedValue.applyDimension(1, 64.0f, view4.getContext().getResources().getDisplayMetrics()));
                            textView2.setLayoutParams(layoutParams);
                        }
                    }
                }
                acpeVar2.a |= 1;
                xhc xhcVar = acpeVar2.i;
                xhcVar.getClass();
                ahcs.e(acpeVar2.c.a(), afwl.a(new aaat(acpeVar2, new xgj(xhcVar), 15)), acpeVar2.d);
                if (acpeVar2.r == i2 && acpeVar2.p.isDone() && acpeVar2.q) {
                    acpeVar2.q = false;
                    acpeVar2.p = acpeVar2.a();
                }
            }
            acoz acozVar = this.aZ;
            if (acozVar == null || !acozVar.d()) {
                i4 = 2;
            } else {
                i4 = 2;
                String.format(Locale.US, "Reels[%s / %s] Response Time: %d ms", this.F.m() == null ? "" : this.F.m(), G().orElse(""), Long.valueOf(j2));
            }
            int i13 = alqcVar.f;
            int iAX4 = a.aX(i13);
            if ((iAX4 == 0 || iAX4 != i4) && (iAX = a.aX(i13)) != 0 && iAX != 1) {
                this.w.a(4);
                int i14 = alqcVar.f;
                int iAX5 = a.aX(i14);
                if (iAX5 == 0) {
                    iAX5 = 1;
                }
                int i15 = iAX5 - 1;
                if (i15 == 2) {
                    i5 = i3;
                } else if (i15 == 3) {
                    i5 = 11;
                } else if (i15 != 5) {
                    i5 = i15 != 6 ? 23 : 22;
                } else {
                    i5 = 12;
                }
                acts actsVar = this.w;
                String str3 = this.bs;
                int iAX6 = a.aX(i14);
                if (iAX6 == 0) {
                    iAX6 = 1;
                }
                StringBuilder sb = new StringBuilder("ReelResponse.getStatus() unexpected:");
                sb.append(iAX6 - 1);
                actsVar.g(str3, i5, sb.toString());
            }
            if (alqdVar2 == null) {
                Optional optional2 = this.cI;
                if (optional2.isPresent()) {
                    aony aonyVarA = aony.a(optional2.get().t().c);
                    if (aonyVarA == null) {
                        aonyVarA = aony.OK;
                    }
                    if (aonyVarA != aony.UNPLAYABLE) {
                        if (this.bm.isPresent()) {
                            acohVar = this.aJ;
                            if (acohVar.a.isPresent()) {
                                acohVar.a((aazn) acohVar.a.get());
                            }
                        } else {
                            acohVar = this.aJ;
                            if (acohVar.a.isPresent()) {
                                acohVar.a((aazn) acohVar.a.get());
                            }
                        }
                    }
                } else if (this.bm.isPresent() || (((iAX2 = a.aX(((alqc) this.bm.get()).f)) == 0 || iAX2 != 4) && ((iAX3 = a.aX(((alqc) this.bm.get()).f)) == 0 || iAX3 != 3))) {
                    acohVar = this.aJ;
                    if (acohVar.a.isPresent()) {
                        acohVar.a((aazn) acohVar.a.get());
                    }
                }
            }
            ay();
            if ((alqcVar.b & 16384) == 0) {
                z = true;
            } else {
                apji apjiVar12 = alqcVar.n;
                if (apjiVar12 == null) {
                    apjiVar12 = apji.a;
                }
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aqog.a);
                apjiVar12.c(aihlVarCheckIsLite12);
                if (apjiVar12.j.n(aihlVarCheckIsLite12.d)) {
                    apji apjiVar13 = alqcVar.n;
                    if (apjiVar13 == null) {
                        apjiVar13 = apji.a;
                    }
                    aihl aihlVarCheckIsLite13 = aihn.checkIsLite(aqog.a);
                    apjiVar13.c(aihlVarCheckIsLite13);
                    Object objK7 = apjiVar13.j.k(aihlVarCheckIsLite13.d);
                    aqof aqofVar = (aqof) (objK7 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK7));
                    String strO = kro.O(aqofVar);
                    if (strO != null) {
                        this.aS.add(strO);
                        z = true;
                        this.cu.K(aqofVar, new hsb(this, i11), true);
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
            }
            Optional optionalI2 = this.t.i();
            if (z == optionalI2.isPresent()) {
                optionalI2 = Optional.ofNullable(((acra) optionalI2.get()).c());
            }
            if (z == optionalI2.isPresent() && (((apfp) optionalI2.get()).c & 33554432) == 0) {
                optionalI2 = Optional.empty();
            }
            if (true == optionalI2.isPresent()) {
                ajwo ajwoVar4 = ((apfp) optionalI2.get()).E;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                optionalI2 = Optional.ofNullable(ajwoVar4);
            }
            abyy abyyVar3 = new abyy(this, i6);
            if (true == optionalI2.isPresent()) {
                ((acoi) abyyVar3.a).L.a((ajwo) optionalI2.get());
            }
            this.y.f("r_ripe");
            if (optionalK.isPresent()) {
                if (aecm.aw(((acra) optionalK.get()).f)) {
                    this.aP.kk(E(alqcVar));
                } else {
                    this.aP.kk(Optional.empty());
                }
            } else {
                this.aP.kk(Optional.empty());
            }
            this.t.F();
        }
    }

    @Override // defpackage.acqt
    public final void S(int i2) {
        boolean z;
        synchronized (this.aV) {
            z = i2 == 0;
            this.cM = z;
            ad();
        }
        if (this.ck.j()) {
            this.bG.kk(Boolean.valueOf(z));
        }
        acpv acpvVar = (acpv) this.aI.io();
        boolean z2 = !z;
        if (acpvVar.j.l()) {
            acpvVar.e.kk(Boolean.valueOf(z2));
        }
    }

    public final void T(boolean z) {
        ap();
        if (z) {
            ((vxz) this.ck.i).l(300, 45841045L, false);
        }
        if (this.aG == null || !this.ck.aA()) {
            return;
        }
        this.aG.d(!z);
    }

    @Override // defpackage.acvf
    public final void U() {
        if (this.ah.io() == null || !((vor) this.ah.io()).I()) {
            if (((vxz) this.ck.i).l(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor, 45696095L, false)) {
                requireView().post(new abyz(this, 17));
            } else {
                Y();
            }
        }
    }

    public final void V(acra acraVar) {
        acmo.b(Optional.of(acraVar));
        acraVar.f();
        if (!this.ck.aO()) {
            this.v.d(Optional.of(this.t), acraVar.f, this.bs);
            return;
        }
        ajwo ajwoVar = acraVar.f;
        String str = this.bs;
        abnk abnkVar = new abnk();
        abnkVar.a = ajwoVar;
        abnl abnlVarA = abnkVar.a();
        abor aborVarA = this.H.i().a(abnlVarA);
        if (aborVarA instanceof acuc) {
            acuc acucVar = (acuc) aborVarA;
            abnp abnpVar = abnp.a;
            ajwo ajwoVar2 = abnlVarA.b;
            if (ajwoVar2 != null) {
                acrz acrzVar = acucVar.b;
                acuv acuvVarD = acrzVar.d(ajwoVar2);
                if (acuvVarD != null) {
                    acrzVar.i(acuvVarD.Y());
                }
                acucVar.a(ajwoVar2, tzk.b(((abrj) acucVar.e.a(str, acucVar.l(acucVar.k(false, true, abnlVarA, abnpVar, str), abnlVarA, str, abnpVar, 2), abnpVar.b)).a(acsx.class).h(acrx.class).ao()), false, false);
            }
        }
    }

    public final void W(ajwo ajwoVar) {
        acra acraVarF = this.t.f(ajwoVar);
        if (acraVarF != null) {
            this.t.U((int) acraVarF.b, (int) (acraVarF.b + 1), 8);
        }
    }

    protected final void X() {
        int i2;
        int i3;
        alqc alqcVar;
        Object obj;
        abvn abvnVar = this.H;
        Object obj2 = abvnVar.r().j;
        final acoh acohVar = this.aJ;
        int i4 = 16;
        int i5 = 0;
        int i6 = 1;
        int i7 = 9;
        int i8 = 2;
        avmn[] avmnVarArr = {((avlh) obj2).al(new acnt(acohVar, 7), new abxq(i4)), ((avlh) abvnVar.r().o).al(new acnt(acohVar, 8), new abxq(i4)), ((avlh) abvnVar.r().m).al(new acnt(acohVar, i7), new abxq(i4))};
        avmm avmmVar = this.aL;
        avmmVar.e(avmnVarArr);
        int i9 = 15;
        avmmVar.c(this.u.a.ag(new acmv(this, 19), new abxq(i9)));
        if (this.cd.l(26, 45415174L, false)) {
            avmmVar.e(this.r.a(this.H));
        }
        avmmVar.e(this.ac.a(this.H));
        avmmVar.e(this.ab.l(this.H));
        acpe acpeVar = this.D;
        abvn abvnVar2 = this.H;
        int i10 = 18;
        avmmVar.e(((avlh) abvnVar2.r().o).al(new acnt(acpeVar, i9), new abxq(i10)), abvnVar2.H().al(new acnt(acpeVar, i4), new abxq(i10)));
        acoz acozVar = this.aZ;
        if (acozVar != null) {
            avmmVar.e(acozVar.b.u.a(this.H));
        }
        acoz acozVar2 = this.aZ;
        if (acozVar2 != null) {
            avmmVar.e(acozVar2.b.B.a(this.H));
        }
        if (this.ck.x()) {
            avmmVar.e(((abgu) this.ap.io()).c(this.H));
        }
        acnk acnkVar = this.k;
        actv actvVar = acnkVar.f;
        actvVar.z(acnkVar);
        avmm avmmVar2 = acnkVar.b;
        avmmVar2.b();
        int i11 = 14;
        int i12 = 10;
        abvn abvnVar3 = acnkVar.c;
        int i13 = 12;
        int i14 = 13;
        avmmVar2.e(acnkVar.e.al.ag(new acmv(acnkVar, i7), new abxq(i11)), actvVar.a.ag(new acmv(acnkVar, i12), new abxq(i11)), abvnVar3.P().al(new acmv(acnkVar, 11), new abxq(i11)), ((avlh) abvnVar3.r().f).al(new acmv(acnkVar, i13), new abxq(i11)), ((avlh) abvnVar3.r().m).al(new acmv(acnkVar, i14), new abxq(i11)));
        acmw acmwVar = this.o;
        avmm avmmVar3 = acmwVar.a;
        avmmVar3.b();
        abvn abvnVar4 = acmwVar.b;
        avmmVar3.e(acmwVar.c.al.ag(new acjp(acmwVar, 20), new abxq(i12)), ((avlh) abvnVar4.r().o).al(new acmv(acmwVar, i6), new abxq(i12)), abvnVar4.P().al(new acmv(acmwVar, i5), new abxq(i12)));
        if (this.ck.y()) {
            acqf acqfVar = (acqf) this.l.io();
            if (((hno) acqfVar.c).y()) {
                avmm avmmVar4 = (avmm) acqfVar.d;
                avmmVar4.b();
                avmmVar4.c(((acqz) acqfVar.a).al.af(new acpf(new acqe(acqfVar, 0), i11)));
            }
        }
        if (this.ck.aG()) {
            awlo awloVar = this.t.al;
        }
        acsj acsjVar = this.cf;
        final acqz acqzVar = this.t;
        awlo awloVar2 = acqzVar.al;
        zwb zwbVar = this.M;
        acqzVar.getClass();
        acpo acpoVar = new acpo() { // from class: acnu
            @Override // defpackage.acpo
            public final apfu hx() {
                return acqzVar.h();
            }
        };
        hno hnoVar = (hno) acsjVar.b;
        if (!hnoVar.ap() && (obj = acsjVar.f) != null) {
            avnr.b((AtomicReference) obj);
        }
        avmn avmnVarAg = awloVar2.ag(new acpf(new hgo((Object) acpoVar, (Object) acsjVar, (Object) zwbVar, 14, (char[]) null), i13), new acpf(acpy.a, i14));
        if (!hnoVar.ap()) {
            acsjVar.f = avmnVarAg;
        }
        avmmVar.c(avmnVarAg);
        if (this.ck.aR()) {
            avlh avlhVarI = this.H.H().i(new abwr(i5));
            acohVar.getClass();
            i2 = 15;
            avmmVar.c(avlhVarI.al(new avni() { // from class: acns
                /* JADX WARN: Code duplicated, block: B:66:0x01e1  */
                @Override // defpackage.avni
                public final void a(Object obj3) {
                    int i15;
                    ajwo ajwoVar;
                    int i16;
                    ajwo ajwoVar2;
                    String str;
                    Optional optionalEmpty;
                    alqc alqcVar2;
                    acra acraVarF;
                    ajwo ajwoVar3;
                    acip acipVar;
                    acoh acohVar2 = acohVar;
                    acoi acoiVar = acohVar2.b;
                    aazq aazqVar = (aazq) obj3;
                    synchronized (acoiVar.aV) {
                        i15 = 0;
                        acoiVar.bF = false;
                        acoiVar.cL = false;
                    }
                    acoi acoiVar2 = acohVar2.b;
                    String str2 = acoiVar2.bs;
                    acoiVar2.bs = (aazqVar == null || (acipVar = aazqVar.b) == null) ? null : acipVar.au();
                    if (acoiVar2.bA == null || Objects.equals(str2, acoiVar2.bs)) {
                        return;
                    }
                    acoiVar2.aP.kk(Optional.empty());
                    acip acipVar2 = aazqVar.b;
                    abnl abnlVarN = acipVar2.n();
                    if (abnlVarN == null || (ajwoVar = abnlVarN.b) == null) {
                        return;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        if (acoiVar2.y.c().isEmpty()) {
                            if (((aenu) acoiVar2.aF.io()).l()) {
                                aihf aihfVarCreateBuilder = aokx.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                aokx aokxVar = (aokx) aihfVarCreateBuilder.instance;
                                aokxVar.c = 5;
                                aokxVar.b |= 1;
                                aokx aokxVar2 = (aokx) aihfVarCreateBuilder.build();
                                zvl zvlVar = (zvl) acoiVar2.x.io();
                                zvj zvjVarA = zvk.a();
                                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                                zvjVarA.i = 411;
                                zvjVarA.j = 47;
                                zvjVarA.b(0.01d);
                                zvjVarA.e(aokxVar2);
                                zvjVarA.d("ReelWatchFragmentImpl: reelPendingCsiActionController.start called with empty action logger");
                                zvlVar.a(zvjVarA.a());
                            }
                            actm actmVar = acoiVar2.y;
                            int i17 = actmVar.n;
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite2);
                            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                            actmVar.m(6, i17, (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), (xir) acipVar2.d().a(), 0L, "warm", acoiVar2.br);
                        }
                        xgn xgnVarU = acoiVar2.u(ajwoVar);
                        if (xgnVarU == xgn.l) {
                            acoiVar2.y.f("r_uil");
                        }
                        acoiVar2.bq.b(xgnVarU);
                        acok acokVar = acoiVar2.bq;
                        aihf aihfVarP = acfz.P(ajwoVar);
                        if (((aoar) aihfVarP.instance).c.isEmpty() || ((aoar) aihfVarP.instance).d == 22156) {
                            Bundle bundle = acokVar.a.a;
                            if (bundle == null) {
                                i16 = 2;
                            } else {
                                if (bundle.containsKey("tracking_interaction_parent_csn")) {
                                    ajwo ajwoVar4 = ajwo.a;
                                    aihh aihhVar = (aihh) ajwoVar4.createBuilder();
                                    aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
                                    String string = bundle.getString("tracking_interaction_parent_csn");
                                    if (string != null) {
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        aoar aoarVar = (aoar) aihfVarCreateBuilder2.instance;
                                        i16 = 2;
                                        aoarVar.b |= 1;
                                        aoarVar.c = string;
                                    } else {
                                        i16 = 2;
                                    }
                                    if (bundle.containsKey("tracking_interaction_parent_ve")) {
                                        int i18 = bundle.getInt("tracking_interaction_parent_ve");
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        aoar aoarVar2 = (aoar) aihfVarCreateBuilder2.instance;
                                        aoarVar2.b |= 2;
                                        aoarVar2.d = i18;
                                    }
                                    if (bundle.containsKey("tracking_interaction_click_tracking_params")) {
                                        byte[] byteArray = bundle.getByteArray("tracking_interaction_click_tracking_params");
                                        if (byteArray != null) {
                                            aigj aigjVarV = aigj.v(byteArray);
                                            aihhVar.copyOnWrite();
                                            ajwo ajwoVar5 = (ajwo) aihhVar.instance;
                                            aigjVarV.getClass();
                                            ajwoVar5.b |= 1;
                                            ajwoVar5.c = aigjVarV;
                                        } else {
                                            aihhVar.copyOnWrite();
                                            ajwo ajwoVar6 = (ajwo) aihhVar.instance;
                                            ajwoVar6.b &= -2;
                                            ajwoVar6.c = ajwoVar4.c;
                                        }
                                    }
                                    aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder2.build());
                                    ajwoVar2 = (ajwo) aihhVar.build();
                                } else {
                                    i16 = 2;
                                    ajwoVar2 = null;
                                }
                                aoar aoarVarO = acfz.O(ajwoVar2);
                                str = aoarVarO != null ? aoarVarO.c : null;
                                if (str != null) {
                                    aihfVarP.copyOnWrite();
                                    aoar aoarVar3 = (aoar) aihfVarP.instance;
                                    aoarVar3.b |= 1;
                                    aoarVar3.c = str;
                                }
                            }
                            if (str != null) {
                                aihfVarP.copyOnWrite();
                                aoar aoarVar4 = (aoar) aihfVarP.instance;
                                aoarVar4.b |= 1;
                                aoarVar4.c = str;
                            }
                        } else {
                            i16 = 2;
                        }
                        aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
                        aihhVar2.e(aoaq.b, (aoar) aihfVarP.build());
                        ajwo ajwoVar7 = (ajwo) aihhVar2.build();
                        String str3 = acoiVar2.bs;
                        if (str3 != null) {
                            acoiVar2.E.b(ajwoVar7, str3);
                        }
                        acoiVar2.v.c(Optional.of(acoiVar2.t), ajwoVar7, acoiVar2.bs);
                        if (((vxz) acoiVar2.ck.m).l(74, 45767989L, false) && (acraVarF = acoiVar2.t.f(ajwoVar7)) != null && !acraVarF.r) {
                            Optional optionalK = acoiVar2.t.k(acraVarF.q);
                            acog acogVar = new acog(acohVar2, acraVarF, i15);
                            if (true == optionalK.isPresent()) {
                                Object obj4 = optionalK.get();
                                Object obj5 = acogVar.a;
                                long j = ((acra) acogVar.b).b + 1;
                                List list = ((acra) obj4).o;
                                int i19 = (int) j;
                                if (i19 < list.size() && (ajwoVar3 = ((acra) list.get(i19)).f) != null && aecm.aa(ajwoVar3) != null) {
                                    ((acoh) obj5).b.v.f(ajwoVar3);
                                }
                            }
                        }
                        if (!acoiVar2.bq.c(ajwoVar7)) {
                            acoi acoiVar3 = acohVar2.b;
                            acok acokVar2 = acoiVar3.bq;
                            String str4 = acoiVar3.bs;
                            boolean zAa = acoi.aa(acoiVar3.getContext());
                            apfu apfuVar = acoiVar3.br;
                            if (acoiVar3.ck.aP()) {
                                Optional optionalK2 = acoiVar3.t.k(acoiVar3.bu);
                                if (true == optionalK2.isPresent() && true != ((acra) optionalK2.get()).l()) {
                                    optionalK2 = Optional.empty();
                                }
                                if (true == optionalK2.isPresent()) {
                                    optionalK2 = Optional.ofNullable(Long.valueOf(((acra) optionalK2.get()).p));
                                }
                                optionalEmpty = optionalK2;
                                acokVar2 = acokVar2;
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                            acokVar2.d(xgnVarU, ajwoVar7, str2, str4, true, zAa, apfuVar, optionalEmpty);
                        } else if (!TextUtils.isEmpty(acoiVar2.bs)) {
                            if (acoiVar2.ck.ak()) {
                                tqj tqjVar = acoiVar2.aA;
                                int i20 = tqr.a;
                                if (tqjVar.k(1073830416)) {
                                    String str5 = acoiVar2.bs;
                                    str5.getClass();
                                    xgnVarU.r(str5);
                                } else {
                                    synchronized (acoiVar2.aV) {
                                        if (acoiVar2.bR == 3) {
                                            String str6 = acoiVar2.bs;
                                            str6.getClass();
                                            xgnVarU.r(str6);
                                            acoiVar2.bR = 1;
                                        } else {
                                            acoiVar2.bR = i16;
                                        }
                                    }
                                }
                            } else {
                                String str7 = acohVar2.b.bs;
                                str7.getClass();
                                xgnVarU.r(str7);
                            }
                        }
                        acoi acoiVar4 = acohVar2.b;
                        acoiVar4.bC = Optional.of(ajwoVar7);
                        acoiVar4.bv = false;
                        acoiVar4.M(acipVar2.f());
                        if (ajwoVar7 != null) {
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                            ajwoVar7.c(aihlVarCheckIsLite3);
                            if (ajwoVar7.j.n(aihlVarCheckIsLite3.d)) {
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                                ajwoVar7.c(aihlVarCheckIsLite4);
                                Object objK2 = ajwoVar7.j.k(aihlVarCheckIsLite4.d);
                                apfp apfpVar = (apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                                if ((apfpVar.c & 134217728) != 0) {
                                    vxe vxeVar = acoiVar4.L;
                                    ajwo ajwoVar8 = apfpVar.G;
                                    if (ajwoVar8 == null) {
                                        ajwoVar8 = ajwo.a;
                                    }
                                    vxeVar.a(ajwoVar8);
                                }
                            }
                        }
                        Optional optionalK3 = acoiVar4.t.k(acoiVar4.bu);
                        vre vreVar = new vre(acoiVar4, 17);
                        if (true == optionalK3.isPresent()) {
                            optionalK3 = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK3.get()));
                        }
                        if (optionalK3.isEmpty() || (alqcVar2 = ((acra) optionalK3.get()).h) == null) {
                            return;
                        }
                        AtomicBoolean atomicBoolean = acoiVar4.aT;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        atomicBoolean.set(true);
                        acoiVar4.u.B(((acra) optionalK3.get()).f, alqcVar2, true);
                    }
                }
            }, new abxq(i2)));
        } else {
            i2 = 15;
        }
        avlh avlhVarW = this.H.C().p().W(new ablh(17));
        acohVar.getClass();
        Object obj3 = this.H.r().f;
        acohVar.getClass();
        int i15 = 15;
        avlh avlhVar = (avlh) obj3;
        avlh avlhVarP = this.H.P();
        acohVar.getClass();
        avmmVar.e(this.t.al.ag(new avni() { // from class: acnv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.lang.Runnable] */
            /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.lang.Runnable] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, xgm] */
            @Override // defpackage.avni
            public final void a(Object obj4) {
                aigj aigjVar;
                String str;
                acvm acvmVar = (acvm) obj4;
                acvmVar.getClass();
                int iE = a.E(acvmVar);
                acoi acoiVar = this.a;
                if (iE != 0) {
                    if (iE == 1) {
                        ajwo ajwoVar = ((acvi) acvmVar).a;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apef.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                            Optional optional = (Optional) acoiVar.cg.f;
                            if (true == optional.isPresent()) {
                                ((ViewGroup) optional.get()).setVisibility(8);
                            }
                        }
                        if (acoiVar.ck.l()) {
                            ((acpv) acoiVar.aI.io()).a();
                        }
                        if (acoiVar.ck.ak()) {
                            acoiVar.bR = 1;
                        }
                        if (acoiVar.ck.aF()) {
                            acoiVar.K();
                        }
                        if (acoiVar.bN) {
                            synchronized (acoiVar.aV) {
                                if (!acoiVar.bH) {
                                    if (acoiVar.ce.l(153, 45732500L, false)) {
                                        if (acoiVar.bE.isPresent()) {
                                            acoiVar.Q.removeCallbacks(acoiVar.bE.get());
                                            acoiVar.bE.get().run();
                                        }
                                        acoiVar.I();
                                    }
                                    acoiVar.bH = true;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (iE == 2) {
                        return;
                    }
                    if (iE != 3) {
                        if (iE != 4) {
                            throw new RuntimeException(null, null);
                        }
                        return;
                    }
                    ajwo ajwoVar2 = ((acvj) acvmVar).a;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                    ajwoVar2.c(aihlVarCheckIsLite2);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                        ajwoVar2.c(aihlVarCheckIsLite3);
                        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                        if ((apfpVar.c & 268435456) != 0) {
                            vxe vxeVar = acoiVar.L;
                            ajwo ajwoVar3 = apfpVar.H;
                            if (ajwoVar3 == null) {
                                ajwoVar3 = ajwo.a;
                            }
                            vxeVar.a(ajwoVar3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                acvh acvhVar = (acvh) acvmVar;
                boolean z = acvhVar.a;
                ajwo ajwoVar4 = acvhVar.b;
                acra acraVar = acvhVar.c;
                acrc acrcVar = acoiVar.A;
                acrcVar.e = false;
                acrcVar.b(null);
                hno hnoVar2 = acoiVar.ck;
                if (aecm.ag(acraVar.c()) || ((vxz) hnoVar2.i).l(196, 45760508L, false)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apef.b);
                    ajwoVar4.c(aihlVarCheckIsLite4);
                    if (!ajwoVar4.j.n(aihlVarCheckIsLite4.d)) {
                        acoiVar.v.f(ajwoVar4);
                    }
                }
                if (acoiVar.bq.c(ajwoVar4) && (!z || acoiVar.ag())) {
                    xgn xgnVarU = acoiVar.u(ajwoVar4);
                    if (acoiVar.ck.ak()) {
                        tqj tqjVar = acoiVar.aA;
                        int i16 = tqr.a;
                        if (!tqjVar.k(1073830416)) {
                            synchronized (acoiVar.aV) {
                                String str2 = acoiVar.bs;
                                if (str2 == null || acoiVar.bR != 2) {
                                    acoiVar.bR = 3;
                                } else {
                                    xgnVarU.r(str2);
                                    acoiVar.bR = 1;
                                }
                            }
                        }
                    }
                    acoiVar.bq.b(xgnVarU);
                    acoiVar.bq.d(xgnVarU, ajwoVar4, acoiVar.bs, null, false, acoi.aa(acoiVar.getContext()), acoiVar.br, acoiVar.H(acraVar));
                }
                acoiVar.aT.set(false);
                if (acoiVar.ck.aP()) {
                    acoiVar.bu = acraVar.q;
                } else {
                    acoiVar.bu = acraVar.b;
                }
                acoiVar.bA = ajwoVar4;
                synchronized (acoiVar.aV) {
                    if (!acoiVar.bH && (!z || ((str = acoiVar.bQ) != null && !str.equals(acraVar.e())))) {
                        acoiVar.bH = true;
                        acoiVar.I();
                    }
                    if (!acoiVar.ck.aF() && acoiVar.bE.isPresent() && acoiVar.bN && !z) {
                        aawr.v(zvn.a, zvm.y, "Last delayed ReelItemPlayback not processed during root change");
                        acoiVar.bE = Optional.empty();
                    }
                }
                aihl aihlVar = apef.b;
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
                ajwoVar4.c(aihlVarCheckIsLite5);
                if (ajwoVar4.j.n(aihlVarCheckIsLite5.d)) {
                    Optional optionalH = acoiVar.H(acraVar);
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
                    ajwoVar4.c(aihlVarCheckIsLite6);
                    ahno.O(ajwoVar4.j.n(aihlVarCheckIsLite6.d));
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar);
                    ajwoVar4.c(aihlVarCheckIsLite7);
                    Object objK2 = ajwoVar4.j.k(aihlVarCheckIsLite7.d);
                    apef apefVar = (apef) (objK2 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK2));
                    xgn xgnVarU2 = acoiVar.u(ajwoVar4);
                    if (!acoiVar.bq.c(ajwoVar4)) {
                        acoiVar.bq.b(xgnVarU2);
                        acoiVar.bq.d(xgnVarU2, ajwoVar4, null, null, false, acoi.aa(acoiVar.getContext()), acoiVar.br, optionalH);
                    }
                    Optional optionalK = acoiVar.t.k(acoiVar.bu);
                    vre vreVar = new vre(acoiVar, 17);
                    if (true == optionalK.isPresent()) {
                        optionalK = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK.get()));
                    }
                    if (optionalK.isPresent() && (aigjVar = ((acra) optionalK.get()).d) != null) {
                        xgnVarU2.l(new xgj(aigjVar, (amud) null));
                    }
                    acsj acsjVar2 = acoiVar.cg;
                    if (!optionalK.isEmpty() && acsj.h(((acra) optionalK.get()).b())) {
                        Optional optionalAc = aecm.ac(((acra) optionalK.get()).b());
                        if (optionalAc.isPresent() && (((apeh) optionalAc.get()).b & 16) != 0) {
                            apji apjiVar = ((apeh) optionalAc.get()).f;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(akrs.a);
                            apjiVar.c(aihlVarCheckIsLite8);
                            Object objK3 = apjiVar.j.k(aihlVarCheckIsLite8.d);
                            akrn akrnVar = (akrn) (objK3 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK3));
                            if (((Optional) acsjVar2.f).isEmpty()) {
                                Object obj5 = acsjVar2.a;
                                String string = ((Context) acsjVar2.d).getResources().getString(R.string.reel_generic_error_message);
                                Optional.empty();
                                string.getClass();
                                ((Optional) ((adif) obj5).a).isPresent();
                                throw null;
                            }
                            acxm acxmVarC = ((acyx) acsjVar2.c).c(akrnVar);
                            adly adlyVar = new adly();
                            xgn xgnVarHB = acsjVar2.e.hB();
                            xgnVarHB.getClass();
                            adlyVar.a(xgnVarHB);
                            Object obj6 = acsjVar2.b;
                            obj6.getClass();
                            acxt acxtVar = (acxt) obj6;
                            acxtVar.h(adlyVar, acxmVarC, false, false);
                            ((ViewGroup) ((Optional) acsjVar2.f).get()).removeAllViews();
                            ((ViewGroup) ((Optional) acsjVar2.f).get()).addView(acxtVar.a());
                            ((ViewGroup) ((Optional) acsjVar2.f).get()).setVisibility(0);
                        }
                    }
                    acoiVar.aO.kk(apefVar);
                    acoiVar.aP.kk(Optional.empty());
                    if (acoiVar.ck.l() && (apefVar.c & 32) != 0) {
                        apdo apdoVar = apefVar.f;
                        if (apdoVar == null) {
                            apdoVar = apdo.a;
                        }
                        if ((apdoVar.b & 2) != 0) {
                            apdo apdoVar2 = apefVar.f;
                            if ((apdoVar2 == null ? apdo.a : apdoVar2).d > 0) {
                                if (apdoVar2 == null) {
                                    apdoVar2 = apdo.a;
                                }
                                ((acpv) acoiVar.aI.io()).b(((long) apdoVar2.d) * 1000);
                            }
                        }
                    }
                }
                if (acoiVar.ck.ag() && !acoiVar.ck.ah()) {
                    awli awliVar = acoiVar.aW;
                    Boolean bool = Boolean.FALSE;
                    awliVar.kk(bool);
                    acoiVar.aX.kk(bool);
                }
                acoiVar.aY.kk(Boolean.FALSE);
                acoq acoqVar = acoiVar.bS;
                acoiVar.T(acoqVar.b(((vor) acoqVar.b.io()).d()));
            }
        }, new abxq(i2)), avlhVarW.ak(new acnt(acohVar, i8)), avlhVar.al(new aawl(new acnt(acohVar, 3), "RWFI", 0), new abxq(i15)), avlhVarP.al(new acmv(acohVar, 20), new abxq(i15)));
        if (this.ck.aR()) {
            i3 = 15;
        } else {
            avlh avlhVarI2 = this.H.H().i(new abwr(i5));
            acohVar.getClass();
            i3 = 15;
            avmmVar.c(avlhVarI2.al(new avni() { // from class: acns
                /* JADX WARN: Code duplicated, block: B:66:0x01e1  */
                @Override // defpackage.avni
                public final void a(Object obj4) {
                    int i16;
                    ajwo ajwoVar;
                    int i17;
                    ajwo ajwoVar2;
                    String str;
                    Optional optionalEmpty;
                    alqc alqcVar2;
                    acra acraVarF;
                    ajwo ajwoVar3;
                    acip acipVar;
                    acoh acohVar2 = acohVar;
                    acoi acoiVar = acohVar2.b;
                    aazq aazqVar = (aazq) obj4;
                    synchronized (acoiVar.aV) {
                        i16 = 0;
                        acoiVar.bF = false;
                        acoiVar.cL = false;
                    }
                    acoi acoiVar2 = acohVar2.b;
                    String str2 = acoiVar2.bs;
                    acoiVar2.bs = (aazqVar == null || (acipVar = aazqVar.b) == null) ? null : acipVar.au();
                    if (acoiVar2.bA == null || Objects.equals(str2, acoiVar2.bs)) {
                        return;
                    }
                    acoiVar2.aP.kk(Optional.empty());
                    acip acipVar2 = aazqVar.b;
                    abnl abnlVarN = acipVar2.n();
                    if (abnlVarN == null || (ajwoVar = abnlVarN.b) == null) {
                        return;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        if (acoiVar2.y.c().isEmpty()) {
                            if (((aenu) acoiVar2.aF.io()).l()) {
                                aihf aihfVarCreateBuilder = aokx.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                aokx aokxVar = (aokx) aihfVarCreateBuilder.instance;
                                aokxVar.c = 5;
                                aokxVar.b |= 1;
                                aokx aokxVar2 = (aokx) aihfVarCreateBuilder.build();
                                zvl zvlVar = (zvl) acoiVar2.x.io();
                                zvj zvjVarA = zvk.a();
                                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                                zvjVarA.i = 411;
                                zvjVarA.j = 47;
                                zvjVarA.b(0.01d);
                                zvjVarA.e(aokxVar2);
                                zvjVarA.d("ReelWatchFragmentImpl: reelPendingCsiActionController.start called with empty action logger");
                                zvlVar.a(zvjVarA.a());
                            }
                            actm actmVar = acoiVar2.y;
                            int i18 = actmVar.n;
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite2);
                            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                            actmVar.m(6, i18, (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), (xir) acipVar2.d().a(), 0L, "warm", acoiVar2.br);
                        }
                        xgn xgnVarU = acoiVar2.u(ajwoVar);
                        if (xgnVarU == xgn.l) {
                            acoiVar2.y.f("r_uil");
                        }
                        acoiVar2.bq.b(xgnVarU);
                        acok acokVar = acoiVar2.bq;
                        aihf aihfVarP = acfz.P(ajwoVar);
                        if (((aoar) aihfVarP.instance).c.isEmpty() || ((aoar) aihfVarP.instance).d == 22156) {
                            Bundle bundle = acokVar.a.a;
                            if (bundle == null) {
                                i17 = 2;
                            } else {
                                if (bundle.containsKey("tracking_interaction_parent_csn")) {
                                    ajwo ajwoVar4 = ajwo.a;
                                    aihh aihhVar = (aihh) ajwoVar4.createBuilder();
                                    aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
                                    String string = bundle.getString("tracking_interaction_parent_csn");
                                    if (string != null) {
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        aoar aoarVar = (aoar) aihfVarCreateBuilder2.instance;
                                        i17 = 2;
                                        aoarVar.b |= 1;
                                        aoarVar.c = string;
                                    } else {
                                        i17 = 2;
                                    }
                                    if (bundle.containsKey("tracking_interaction_parent_ve")) {
                                        int i19 = bundle.getInt("tracking_interaction_parent_ve");
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        aoar aoarVar2 = (aoar) aihfVarCreateBuilder2.instance;
                                        aoarVar2.b |= 2;
                                        aoarVar2.d = i19;
                                    }
                                    if (bundle.containsKey("tracking_interaction_click_tracking_params")) {
                                        byte[] byteArray = bundle.getByteArray("tracking_interaction_click_tracking_params");
                                        if (byteArray != null) {
                                            aigj aigjVarV = aigj.v(byteArray);
                                            aihhVar.copyOnWrite();
                                            ajwo ajwoVar5 = (ajwo) aihhVar.instance;
                                            aigjVarV.getClass();
                                            ajwoVar5.b |= 1;
                                            ajwoVar5.c = aigjVarV;
                                        } else {
                                            aihhVar.copyOnWrite();
                                            ajwo ajwoVar6 = (ajwo) aihhVar.instance;
                                            ajwoVar6.b &= -2;
                                            ajwoVar6.c = ajwoVar4.c;
                                        }
                                    }
                                    aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder2.build());
                                    ajwoVar2 = (ajwo) aihhVar.build();
                                } else {
                                    i17 = 2;
                                    ajwoVar2 = null;
                                }
                                aoar aoarVarO = acfz.O(ajwoVar2);
                                str = aoarVarO != null ? aoarVarO.c : null;
                                if (str != null) {
                                    aihfVarP.copyOnWrite();
                                    aoar aoarVar4 = (aoar) aihfVarP.instance;
                                    aoarVar4.b |= 1;
                                    aoarVar4.c = str;
                                }
                            }
                            if (str != null) {
                                aihfVarP.copyOnWrite();
                                aoar aoarVar5 = (aoar) aihfVarP.instance;
                                aoarVar5.b |= 1;
                                aoarVar5.c = str;
                            }
                        } else {
                            i17 = 2;
                        }
                        aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
                        aihhVar2.e(aoaq.b, (aoar) aihfVarP.build());
                        ajwo ajwoVar7 = (ajwo) aihhVar2.build();
                        String str3 = acoiVar2.bs;
                        if (str3 != null) {
                            acoiVar2.E.b(ajwoVar7, str3);
                        }
                        acoiVar2.v.c(Optional.of(acoiVar2.t), ajwoVar7, acoiVar2.bs);
                        if (((vxz) acoiVar2.ck.m).l(74, 45767989L, false) && (acraVarF = acoiVar2.t.f(ajwoVar7)) != null && !acraVarF.r) {
                            Optional optionalK = acoiVar2.t.k(acraVarF.q);
                            acog acogVar = new acog(acohVar2, acraVarF, i16);
                            if (true == optionalK.isPresent()) {
                                Object obj5 = optionalK.get();
                                Object obj6 = acogVar.a;
                                long j = ((acra) acogVar.b).b + 1;
                                List list = ((acra) obj5).o;
                                int i110 = (int) j;
                                if (i110 < list.size() && (ajwoVar3 = ((acra) list.get(i110)).f) != null && aecm.aa(ajwoVar3) != null) {
                                    ((acoh) obj6).b.v.f(ajwoVar3);
                                }
                            }
                        }
                        if (!acoiVar2.bq.c(ajwoVar7)) {
                            acoi acoiVar3 = acohVar2.b;
                            acok acokVar2 = acoiVar3.bq;
                            String str4 = acoiVar3.bs;
                            boolean zAa = acoi.aa(acoiVar3.getContext());
                            apfu apfuVar = acoiVar3.br;
                            if (acoiVar3.ck.aP()) {
                                Optional optionalK2 = acoiVar3.t.k(acoiVar3.bu);
                                if (true == optionalK2.isPresent() && true != ((acra) optionalK2.get()).l()) {
                                    optionalK2 = Optional.empty();
                                }
                                if (true == optionalK2.isPresent()) {
                                    optionalK2 = Optional.ofNullable(Long.valueOf(((acra) optionalK2.get()).p));
                                }
                                optionalEmpty = optionalK2;
                                acokVar2 = acokVar2;
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                            acokVar2.d(xgnVarU, ajwoVar7, str2, str4, true, zAa, apfuVar, optionalEmpty);
                        } else if (!TextUtils.isEmpty(acoiVar2.bs)) {
                            if (acoiVar2.ck.ak()) {
                                tqj tqjVar = acoiVar2.aA;
                                int i20 = tqr.a;
                                if (tqjVar.k(1073830416)) {
                                    String str5 = acoiVar2.bs;
                                    str5.getClass();
                                    xgnVarU.r(str5);
                                } else {
                                    synchronized (acoiVar2.aV) {
                                        if (acoiVar2.bR == 3) {
                                            String str6 = acoiVar2.bs;
                                            str6.getClass();
                                            xgnVarU.r(str6);
                                            acoiVar2.bR = 1;
                                        } else {
                                            acoiVar2.bR = i17;
                                        }
                                    }
                                }
                            } else {
                                String str7 = acohVar2.b.bs;
                                str7.getClass();
                                xgnVarU.r(str7);
                            }
                        }
                        acoi acoiVar4 = acohVar2.b;
                        acoiVar4.bC = Optional.of(ajwoVar7);
                        acoiVar4.bv = false;
                        acoiVar4.M(acipVar2.f());
                        if (ajwoVar7 != null) {
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                            ajwoVar7.c(aihlVarCheckIsLite3);
                            if (ajwoVar7.j.n(aihlVarCheckIsLite3.d)) {
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                                ajwoVar7.c(aihlVarCheckIsLite4);
                                Object objK2 = ajwoVar7.j.k(aihlVarCheckIsLite4.d);
                                apfp apfpVar = (apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                                if ((apfpVar.c & 134217728) != 0) {
                                    vxe vxeVar = acoiVar4.L;
                                    ajwo ajwoVar8 = apfpVar.G;
                                    if (ajwoVar8 == null) {
                                        ajwoVar8 = ajwo.a;
                                    }
                                    vxeVar.a(ajwoVar8);
                                }
                            }
                        }
                        Optional optionalK3 = acoiVar4.t.k(acoiVar4.bu);
                        vre vreVar = new vre(acoiVar4, 17);
                        if (true == optionalK3.isPresent()) {
                            optionalK3 = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK3.get()));
                        }
                        if (optionalK3.isEmpty() || (alqcVar2 = ((acra) optionalK3.get()).h) == null) {
                            return;
                        }
                        AtomicBoolean atomicBoolean = acoiVar4.aT;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        atomicBoolean.set(true);
                        acoiVar4.u.B(((acra) optionalK3.get()).f, alqcVar2, true);
                    }
                }
            }, new abxq(i3)));
        }
        avlh avlhVarW2 = this.H.C().p().W(new ablh(i3));
        acohVar.getClass();
        avmmVar.c(avlhVarW2.ak(new acnt(acohVar, i6)));
        if (this.ck.E()) {
            avmmVar.e(this.ay.b.af(new acnt(this, i5)));
        }
        if (this.ck.aR()) {
            Optional optionalI = this.t.i();
            if (!optionalI.isPresent() || ((acra) optionalI.get()).h == null || (alqcVar = ((acra) optionalI.get()).h) == null || (alqcVar.b & 1048576) == 0) {
                return;
            }
            avmmVar.c(this.aC.e(hw()).k(alqcVar.t).B(new yqz(19)).K(new ablh(16)).h(aqzc.class).B(new acpq(alqcVar, 1)).O(this.am).af(new abqo(this, (Object) optionalI, 3)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, vxe] */
    public final void Y() {
        Optional optionalAo = this.bm;
        if (true == optionalAo.isPresent()) {
            optionalAo = ao((alqc) optionalAo.get());
        }
        if (this.ck.v() && optionalAo.isPresent()) {
            ajwo ajwoVar = (ajwo) optionalAo.get();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                this.L.a((ajwo) optionalAo.get());
                return;
            }
        }
        if (!this.cd.l(12, 45401048L, false) || o()) {
            return;
        }
        Optional optionalE = this.bm;
        vre vreVar = new vre(this, 18);
        if (true == optionalE.isPresent()) {
            Object obj = optionalE.get();
            optionalE = ((acoi) vreVar.a).E((alqc) obj);
        }
        vxe vxeVar = this.L;
        vxeVar.getClass();
        abyy abyyVar = new abyy(vxeVar, 11);
        if (true == optionalE.isPresent()) {
            abyyVar.a.a((ajwo) optionalE.get());
        }
    }

    public final void Z(boolean z) {
        if (!a.x() || this.bi || getView() == null) {
            return;
        }
        boolean zE = this.ck.E();
        View view = this.cx;
        if (!zE) {
            acfz.I(view, z);
            return;
        }
        boolean z2 = false;
        if (z && !this.bM) {
            z2 = true;
        }
        acfz.I(view, z2);
    }

    public final boolean ac(String str) {
        if (this.bA == null || TextUtils.isEmpty(str)) {
            return true;
        }
        ajwo ajwoVar = this.bA;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return true;
        }
        ajwo ajwoVar2 = this.bA;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar2.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        return apfpVar.o.isEmpty() || apfpVar.o.equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002a A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:33:0x005f, B:35:0x0066, B:36:0x006a, B:38:0x006c, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:13:0x001a, B:15:0x001e, B:16:0x0020, B:18:0x0024, B:19:0x0026, B:21:0x002a, B:23:0x002f, B:25:0x0033, B:27:0x003f, B:28:0x004d, B:30:0x005a), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x003f A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:33:0x005f, B:35:0x0066, B:36:0x006a, B:38:0x006c, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:13:0x001a, B:15:0x001e, B:16:0x0020, B:18:0x0024, B:19:0x0026, B:21:0x002a, B:23:0x002f, B:25:0x0033, B:27:0x003f, B:28:0x004d, B:30:0x005a), top: B:44:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    public final boolean ad() {
        boolean zAe;
        boolean z;
        Optional optionalI;
        synchronized (this.aV) {
            zAe = false;
            if (!this.bF && !this.cL) {
                z = false;
            } else if (this.cM) {
                z = true;
                if (this.bN && !this.bH) {
                    optionalI = this.t.i();
                    if (true == optionalI.isPresent()) {
                        optionalI = Optional.ofNullable(((acra) optionalI.get()).c());
                    }
                    if (!aecm.ag((apfp) optionalI.orElse(null)) && !this.cH) {
                        z = false;
                    }
                }
            } else {
                alik alikVarB = this.ae.b();
                if (alikVarB == null) {
                    alikVarB = alik.a;
                }
                apdy apdyVar = alikVarB.r;
                if (apdyVar == null) {
                    apdyVar = apdy.a;
                }
                apeq apeqVar = apdyVar.c;
                if (apeqVar == null) {
                    apeqVar = apeq.a;
                }
                if (apeqVar.c) {
                    z = false;
                } else {
                    z = true;
                    if (this.bN) {
                        optionalI = this.t.i();
                        if (true == optionalI.isPresent()) {
                            optionalI = Optional.ofNullable(((acra) optionalI.get()).c());
                        }
                        if (!aecm.ag((apfp) optionalI.orElse(null))) {
                            z = false;
                        }
                    }
                }
            }
            this.bE.isPresent();
            if (z) {
                zAe = ae();
            }
        }
        return zAe;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    public final boolean ae() {
        synchronized (this.aV) {
            this.cH = false;
            this.bE.isPresent();
            I();
            if (!this.bE.isPresent()) {
                return false;
            }
            this.Q.post(afwl.i(this.bE.get()));
            K();
            return true;
        }
    }

    public final boolean af() {
        if (this.ck.ax()) {
            return true;
        }
        Optional optionalK = this.t.k(this.bu);
        vre vreVar = new vre(this, 17);
        if (true == optionalK.isPresent()) {
            optionalK = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK.get()));
        }
        if (true == optionalK.isPresent()) {
            optionalK = Optional.ofNullable(Boolean.valueOf(aecm.aj(((acra) optionalK.get()).f)));
        }
        return !((Boolean) optionalK.orElse(Boolean.FALSE)).booleanValue();
    }

    public final boolean ag() {
        return this.ck.ak();
    }

    public final void ai() {
        ReelPlayerView reelPlayerView = this.ba;
        if (reelPlayerView != null) {
            reelPlayerView.k = false;
            tym.h(reelPlayerView, new tyi(0, 1), ViewGroup.MarginLayoutParams.class);
            aq().isPresent();
        }
    }

    public final void aj() {
        ReelPlayerView reelPlayerView = this.ba;
        if (reelPlayerView != null) {
            tym.h(reelPlayerView, new tyj(1, 1, null), FrameLayout.LayoutParams.class);
            tym.h(reelPlayerView, new tyi(0, 0), ViewGroup.MarginLayoutParams.class);
            aq().isPresent();
        }
    }

    public final void ak() {
        ReelPlayerView reelPlayerView = this.ba;
        if (reelPlayerView != null) {
            reelPlayerView.k = false;
            tym.h(reelPlayerView, new tyj(0, 2), ViewGroup.MarginLayoutParams.class);
            aq().isPresent();
        }
    }

    @Override // defpackage.acpa
    public final void al() {
        acmo.b(this.t.i());
    }

    public final void ap() {
        acmo.b(this.t.i());
    }

    protected abmy c() {
        throw null;
    }

    @Override // defpackage.acmz
    public boolean d() {
        throw null;
    }

    protected boolean e() {
        throw null;
    }

    @Override // defpackage.acvf
    public void f() {
        throw null;
    }

    @Override // defpackage.abgv
    public final void g() {
        throw null;
    }

    @Override // defpackage.abgv
    public final void h() {
        throw null;
    }

    @Override // defpackage.acnn, defpackage.zwh
    public final zwa hw() {
        return this.M.e();
    }

    @Override // defpackage.acpo
    public final apfu hx() {
        return this.br;
    }

    @Override // defpackage.acmf
    public final void i() {
        O();
    }

    @Override // defpackage.acmn
    public final void j() {
        acrp acrpVarZ;
        t().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(37419)), null);
        this.y.d();
        if (getActivity() != null && !this.cb.l(242, 45710437L, false) && (acrpVarZ = z()) != null) {
            Optional optionalJ = acrpVarZ.J();
            if (true == optionalJ.isPresent()) {
                ((acph) optionalJ.get()).f();
            }
        }
        Optional optional = this.cB;
        abyy abyyVar = new abyy(this, 10);
        if (true == optional.isPresent()) {
            ((acoi) abyyVar.a).L.a((ajwo) optional.get());
        }
        if (getActivity() != null) {
            this.b.kn();
        }
    }

    @Override // defpackage.acnh
    public final View k() {
        return getView();
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0375  */
    @Override // defpackage.actu
    public final void l(acsu acsuVar) {
        apfp apfpVar;
        acqz acqzVar;
        acqh acqhVar;
        acra acraVarI;
        boolean zEquals;
        acsuVar.getClass();
        boolean z = false;
        Objects.checkIndex(0, 10);
        if (acsuVar instanceof acso) {
            acso acsoVar = (acso) acsuVar;
            L(acsoVar.a, acsoVar.b, acsoVar.c);
            return;
        }
        String strG = "";
        if (acsuVar instanceof acsn) {
            acsn acsnVar = (acsn) acsuVar;
            ajwo ajwoVar = acsnVar.a;
            alqc alqcVar = acsnVar.b;
            boolean z2 = acsnVar.c;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVar2 = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                boolean zL = ((vxz) this.ck.m).l(29, 45704469L, false);
                ajwo ajwoVar2 = this.bA;
                if (zL) {
                    if (ajwoVar2 != null) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                        ajwoVar2.c(aihlVarCheckIsLite3);
                        Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                        strG = ((apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).U;
                    }
                    zEquals = strG.equals(apfpVar2.U);
                } else {
                    if (ajwoVar2 != null) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                        ajwoVar2.c(aihlVarCheckIsLite4);
                        Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                        strG = ((apfp) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).o;
                    }
                    zEquals = strG.equals(apfpVar2.o);
                }
                if (!zEquals) {
                    this.u.C(ajwoVar, alqcVar);
                    return;
                }
                AtomicBoolean atomicBoolean = this.aT;
                if (!atomicBoolean.get()) {
                    z = z2;
                } else if (z2) {
                    return;
                }
                atomicBoolean.set(true);
                this.u.B(ajwoVar, alqcVar, z);
                return;
            }
            return;
        }
        if (acsuVar instanceof acsp) {
            acsp acspVar = (acsp) acsuVar;
            ajwo ajwoVar3 = acspVar.a;
            alqc alqcVar2 = acspVar.b;
            cf activity = getActivity();
            if (activity != null) {
                Optional optionalOfNullable = Optional.ofNullable(alqcVar2);
                if (true == optionalOfNullable.isPresent()) {
                    alvt alvtVar = ((alqc) optionalOfNullable.get()).e;
                    if (alvtVar == null) {
                        alvtVar = alvt.a;
                    }
                    optionalOfNullable = Optional.ofNullable(alvtVar);
                }
                if (true == optionalOfNullable.isPresent()) {
                    alvw alvwVar = ((alvt) optionalOfNullable.get()).g;
                    if (alvwVar == null) {
                        alvwVar = alvw.a;
                    }
                    optionalOfNullable = Optional.ofNullable(alvwVar);
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((alvw) optionalOfNullable.get()).c);
                }
                if (optionalOfNullable.isPresent()) {
                    apez apezVar = alqcVar2.d;
                    if (apezVar == null) {
                        apezVar = apez.a;
                    }
                    if (apezVar.b == 139970731) {
                        acme acmeVar = this.ak;
                        String str = (String) optionalOfNullable.get();
                        apez apezVar2 = alqcVar2.d;
                        if (apezVar2 == null) {
                            apezVar2 = apez.a;
                        }
                        acmeVar.a(str, Optional.of(apezVar2.b == 139970731 ? (apey) apezVar2.c : apey.a));
                    }
                }
                activity.runOnUiThread(afwl.i(new aapc(this, ajwoVar3, alqcVar2, 20, (short[]) null)));
                return;
            }
            return;
        }
        if (acsuVar instanceof acss) {
            acss acssVar = (acss) acsuVar;
            ajwo ajwoVar4 = acssVar.a;
            wjf wjfVar = acssVar.b;
            cf activity2 = getActivity();
            if (activity2 != null) {
                if (this.ck.ab()) {
                    activity2.runOnUiThread(afwl.i(new aapc(this, wjfVar, ajwoVar4, 18, (char[]) null)));
                    return;
                } else {
                    if (this.t.R(wjfVar.u(), this.t.b(ajwoVar4))) {
                        return;
                    }
                    activity2.runOnUiThread(afwl.i(new aapc(this, ajwoVar4, wjfVar, 19)));
                    return;
                }
            }
            return;
        }
        if (acsuVar instanceof acsq) {
            acsq acsqVar = (acsq) acsuVar;
            String str2 = acsqVar.a;
            ajwo ajwoVar5 = acsqVar.b;
            cf activity3 = getActivity();
            if (activity3 != null) {
                activity3.runOnUiThread(afwl.i(new aapc(this, ajwoVar5, str2, 17, (short[]) null)));
                return;
            }
            return;
        }
        if (acsuVar instanceof acsl) {
            acve acveVar = this.B;
            xgn xgnVarHB = acveVar.c.hB();
            ArrayList arrayList = new ArrayList();
            arrayList.add(acve.b(114670));
            if (acveVar.f) {
                arrayList.add(acve.b(134942));
                hno hnoVar = acveVar.g;
                vxz vxzVar = (vxz) hnoVar.i;
                if (vxzVar.l(183, 45751092L, false)) {
                    arrayList.add(acve.b(307700));
                }
                if (vxzVar.l(209, 45769270L, false)) {
                    arrayList.add(acve.b(323876));
                }
                if (hnoVar.p()) {
                    arrayList.add(acve.b(341061));
                }
            }
            xgnVarHB.k(arrayList);
            return;
        }
        if (!(acsuVar instanceof acsk)) {
            if (acsuVar instanceof acsm) {
                acsm acsmVar = (acsm) acsuVar;
                aaxt aaxtVar = acsmVar.a;
                wjf wjfVar2 = acsmVar.b;
                if ((this.t.N() || !this.ck.bc()) && !this.ck.ad()) {
                    return;
                }
                acoh acohVar = this.aJ;
                Long lValueOf = Long.valueOf(aaxtVar.a);
                strG = wjfVar2 != null ? wjfVar2.G() : "";
                if (acohVar.b.ac(strG)) {
                    lValueOf.getClass();
                    acohVar.b(strG);
                    return;
                }
                return;
            }
            if (acsuVar instanceof acsr) {
                ajwo ajwoVar6 = ((acsr) acsuVar).a;
                if (ajwoVar6 == null) {
                    apfpVar = null;
                } else {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apfp.b);
                    ajwoVar6.c(aihlVarCheckIsLite5);
                    Object objK4 = ajwoVar6.j.k(aihlVarCheckIsLite5.d);
                    apfpVar = (apfp) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4));
                }
                String str3 = apfpVar != null ? apfpVar.o : null;
                acve acveVar2 = this.B;
                boolean z3 = this.t.D;
                acveVar2.f = aecm.ax(apfpVar);
                actm actmVar = this.y;
                if (actmVar.k(str3)) {
                    actmVar.f("r_wrs");
                    actmVar.e.c(64);
                }
                this.bD = Optional.empty();
                return;
            }
            return;
        }
        acsk acskVar = (acsk) acsuVar;
        ajwo ajwoVar7 = acskVar.a;
        boolean z4 = acskVar.b;
        boolean z5 = acskVar.c;
        if (!this.ca.l(12, 45622664L, false) || (acqhVar = (acqzVar = this.t).ag) == null) {
            return;
        }
        int i2 = acqzVar.Q;
        if (ajwoVar7 != null) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apfp.b);
            ajwoVar7.c(aihlVarCheckIsLite6);
            if (ajwoVar7.j.n(aihlVarCheckIsLite6.d)) {
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apfp.b);
                ajwoVar7.c(aihlVarCheckIsLite7);
                Object objK5 = ajwoVar7.j.k(aihlVarCheckIsLite7.d);
                int i3 = ((apfp) (objK5 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK5))).i;
                if ((i3 == 44 || i3 == 49) && (acraVarI = acqhVar.I(ajwoVar7, i2)) != null) {
                    apfp apfpVarC = acraVarI.c();
                    aihh aihhVar = (aihh) apfpVarC.toBuilder();
                    int i4 = apfpVarC.i;
                    if (i4 == 44) {
                        aihf builder = (i4 == 44 ? (apfq) apfpVarC.k : apfq.a).toBuilder();
                        if (z4) {
                            builder.copyOnWrite();
                            apfq apfqVar = (apfq) builder.instance;
                            apfqVar.b &= -2;
                            apfqVar.c = apfq.a.c;
                        }
                        if (z5) {
                            builder.copyOnWrite();
                            apfq apfqVar2 = (apfq) builder.instance;
                            apfqVar2.b &= -3;
                            apfqVar2.d = apfq.a.d;
                        }
                        apfq apfqVar3 = (apfq) builder.build();
                        int i5 = apfqVar3.b;
                        if ((i5 & 2) == 0 && (i5 & 1) == 0) {
                            aihhVar.copyOnWrite();
                            apfp apfpVar3 = (apfp) aihhVar.instance;
                            if (apfpVar3.i == 44) {
                                apfpVar3.i = 0;
                                apfpVar3.k = null;
                            }
                        } else {
                            aihhVar.copyOnWrite();
                            apfp apfpVar4 = (apfp) aihhVar.instance;
                            apfqVar3.getClass();
                            apfpVar4.k = apfqVar3;
                            apfpVar4.i = 44;
                        }
                    }
                    int i6 = apfpVarC.i;
                    if (i6 == 49) {
                        aihh aihhVar2 = (aihh) (i6 == 49 ? (apfs) apfpVarC.k : apfs.a).toBuilder();
                        if (z4) {
                            aihhVar2.d(alvu.b);
                        }
                        if (z5) {
                            aihhVar2.d(alqe.b);
                        }
                        apfs apfsVar = (apfs) aihhVar2.build();
                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(alvu.b);
                        apfsVar.c(aihlVarCheckIsLite8);
                        if (apfsVar.j.n(aihlVarCheckIsLite8.d)) {
                            aihhVar.copyOnWrite();
                            apfp apfpVar5 = (apfp) aihhVar.instance;
                            apfsVar.getClass();
                            apfpVar5.k = apfsVar;
                            apfpVar5.i = 49;
                        } else {
                            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(alqe.b);
                            apfsVar.c(aihlVarCheckIsLite9);
                            if (apfsVar.j.n(aihlVarCheckIsLite9.d)) {
                                aihhVar.copyOnWrite();
                                apfp apfpVar6 = (apfp) aihhVar.instance;
                                apfsVar.getClass();
                                apfpVar6.k = apfsVar;
                                apfpVar6.i = 49;
                            } else {
                                aihhVar.copyOnWrite();
                                apfp apfpVar7 = (apfp) aihhVar.instance;
                                if (apfpVar7.i == 49) {
                                    apfpVar7.i = 0;
                                    apfpVar7.k = null;
                                }
                            }
                        }
                    }
                    apfp apfpVar8 = (apfp) aihhVar.build();
                    if (apfpVar8.equals(apfpVarC)) {
                        return;
                    }
                    aihh aihhVar3 = (aihh) acraVarI.f.toBuilder();
                    aihhVar3.e(apfp.b, apfpVar8);
                    acraVarI.h((ajwo) aihhVar3.build());
                }
            }
        }
    }

    @Override // defpackage.acnh
    public final void m(tvz tvzVar) {
        this.d.kk(tvzVar);
    }

    @Override // defpackage.acnh
    public final void n(tuy tuyVar) {
        View view;
        if (this.ck.aK() && (view = getView()) != null) {
            Rect rectB = tuk.b(tuyVar.a);
            int iMax = Math.max(rectB.left, rectB.right);
            tym.h(view, new tyk(iMax, 0, iMax, 0), ViewGroup.MarginLayoutParams.class);
        }
        if (getContext() != null) {
            boolean zI = nuo.i(getContext());
            aihf aihfVarCreateBuilder = aldb.a.createBuilder();
            aldd alddVar = zI ? aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_TALL_SCREEN : aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_NORMAL_SCREEN;
            aihfVarCreateBuilder.copyOnWrite();
            aldb aldbVar = (aldb) aihfVarCreateBuilder.instance;
            aldbVar.c = alddVar.aW;
            aldbVar.b |= 1;
            xeu xeuVar = this.ax;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.GENERIC_CLIENT_EXPERIMENT_EVENT);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            aldb aldbVar2 = (aldb) aihfVarCreateBuilder.build();
            aldbVar2.getClass();
            alouVar.d = aldbVar2;
            alouVar.c = 423;
            this.ax.b((alou) alosVar.build());
        }
    }

    @Override // defpackage.acnh
    public final boolean o() {
        Optional optionalOfNullable = Optional.ofNullable(getArguments());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((Bundle) optionalOfNullable.get()).getBoolean("ReelWatchFragment.isInReelWatchPagerFragment", false)));
        }
        return ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.acmm, defpackage.cc
    public void onAttach(Activity activity) {
        this.cJ = Instant.now().toEpochMilli();
        super.onAttach(activity);
        adsj.b(activity.getApplicationContext());
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ReelRecyclerView reelRecyclerView;
        acmt acmtVar;
        aunn aunnVar;
        super.onConfigurationChanged(configuration);
        if (this.ci.b(getContext()) && (aunnVar = this.ah) != null && aunnVar.io() != null) {
            this.bS.a(((vor) this.ah.io()).d());
        }
        ReelPlayerView reelPlayerView = this.ba;
        if (reelPlayerView == null) {
            zvp.a(zvn.b, zvm.y, "null playerView in ReelWatchFragment#onConfigurationChanged");
            cf activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        reelPlayerView.getViewTreeObserver().addOnGlobalLayoutListener(new acoc(this, String.valueOf(getClass().getSimpleName()).concat("-PlayerView"), reelPlayerView.getWidth(), reelPlayerView.getHeight()));
        this.ci.c();
        boolean zAb = ab(configuration);
        if (this.ck.am() && (acmtVar = this.aG) != null && acmtVar.a) {
            acmtVar.h(zAb);
        }
        acng acngVar = this.q;
        if (!acngVar.o.aM() || (reelRecyclerView = acngVar.j) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = reelRecyclerView.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = acngVar.m;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            acngVar.m = null;
        }
        acngVar.m = new acnf(acngVar, String.valueOf(acngVar.getClass().getSimpleName()).concat("-RecyclerView"), viewTreeObserver, zAb);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = acngVar.m;
        if (onGlobalLayoutListener2 != null) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener2);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [awmd, java.lang.Object] */
    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.bO = false;
        this.cK = this.I.f().toEpochMilli();
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.aK.a = this;
        this.bN = this.ce.l(112, 45710754L, false);
        axlj axljVar = this.cs;
        int i2 = 11;
        ahno.as(((qrx) axljVar.a).c(), new aajs(axljVar, i2), axljVar.c);
        Optional.of(this);
        adyc adycVar = this.cm;
        ?? r4 = adycVar.b;
        xhu xhuVar = this.af;
        actr actrVar = this.v;
        aawr aawrVar = this.cp;
        actm actmVar = this.y;
        aclz aclzVar = (aclz) r4.io();
        aclzVar.getClass();
        tqj tqjVar = (tqj) adycVar.d.io();
        tqjVar.getClass();
        vxz vxzVar = (vxz) adycVar.e.io();
        vxzVar.getClass();
        acul aculVar = (acul) adycVar.f.io();
        aculVar.getClass();
        hno hnoVar = (hno) adycVar.c.io();
        hnoVar.getClass();
        ?? Io = adycVar.a.io();
        Io.getClass();
        xhuVar.getClass();
        actrVar.getClass();
        aawrVar.getClass();
        actmVar.getClass();
        this.bq = new acok(aclzVar, tqjVar, vxzVar, aculVar, hnoVar, Io, xhuVar, aawrVar, actmVar);
        Iterator it = this.ag.iterator();
        while (it.hasNext()) {
            getLifecycle().b((bof) it.next());
        }
        aeqq aeqqVar = this.az;
        if (aeqqVar != null && aeqqVar.b) {
            getLifecycle().b(this.az);
        }
        if (bundle != null) {
            this.cz = bundle.getBundle(g);
            this.cA = bundle.getString(h);
            this.bn = bundle.getLong("PagePositionKey", Long.MIN_VALUE);
            this.bo = bundle.getInt("AdapterPositionKey", -1);
            bundle.getBundle(i);
            if (this.ck.q()) {
                this.cj.a = true;
            }
        }
        acni acniVar = this.n;
        acor acorVar = this.X;
        vwt vwtVar = this.cr;
        acniVar.a = this;
        acniVar.b = acorVar;
        int i3 = 7;
        if (!acniVar.i.l(29, 45400535L, false)) {
            vwtVar.D(new acnd(acniVar, i3));
        }
        avlr avlrVarB = avlr.j(vwtVar.A(), acniVar.e, new abiw(4)).r().B(new yqz(17));
        int i4 = 8;
        avlrVarB.af(new acmv(this, i4));
        acoq acoqVar = this.bS;
        int i5 = 5;
        acnt acntVar = new acnt(this, i5);
        if (acoqVar.h.b(acoqVar.a)) {
            acoqVar.i.D(new aalq(acoqVar, acntVar, i3));
        }
        if (this.ci.b(getContext())) {
            this.cr.D(new acnd(this, 10));
            this.cr.D(new acnd(this, i2));
        }
        Optional optional = this.aj;
        int i6 = 14;
        abyy abyyVar = new abyy(this, i6);
        optional.isPresent();
        Object obj = optional.get();
        Object obj2 = abyyVar.a;
        ((acoi) obj2).cr.D(new aalq(obj2, obj, i5, null));
        int i7 = 15;
        if (this.ck.al()) {
            Optional optional2 = this.aj;
            abyy abyyVar2 = new abyy(this, i7);
            optional2.isPresent();
            optional2.get();
            Object obj3 = abyyVar2.a;
            ((acoi) obj3).cr.D(new acnd(obj3, i4));
        }
        this.cr.D(new acnd(this, 12));
        if (o()) {
            this.cr.D(new acnd(this, 13));
        }
        this.cr.D(new acnd(this, i6));
        absg absgVar = this.at;
        if (absgVar instanceof acun) {
            acun acunVar = (acun) absgVar;
            if (((vxz) this.ck.i).l(91, 45647746L, false)) {
                this.cr.D(new aalq(this, acunVar, 6));
            } else {
                acunVar.f(this.au, this.bJ);
            }
        }
        if (this.ck.aK() || this.ck.au()) {
            this.cr.D(new acnd(this, i7));
        }
        if (this.ck.bf()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:190:0x0729  */
    /* JADX WARN: Code duplicated, block: B:192:0x0749  */
    /* JADX WARN: Code duplicated, block: B:194:0x075f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0783  */
    /* JADX WARN: Code duplicated, block: B:198:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:201:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:203:0x080b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0818  */
    /* JADX WARN: Code duplicated, block: B:209:0x082b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:300:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:304:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:311:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:319:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:325:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:331:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:334:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:346:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:348:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:351:0x0bc5  */
    /* JADX WARN: Code duplicated, block: B:354:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:356:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:358:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:359:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:361:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:364:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:367:0x0bfa  */
    /* JADX WARN: Code duplicated, block: B:368:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:369:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:375:0x0c27  */
    /* JADX WARN: Code duplicated, block: B:377:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:382:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:390:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:393:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:400:0x0b15 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0b2a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0337  */
    /* JADX WARN: Code duplicated, block: B:70:0x033b  */
    /* JADX WARN: Code duplicated, block: B:71:0x033e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v103, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v148, types: [abvn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v61, types: [axso, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Optional optionalEmpty;
        apft apftVarA;
        ajwo ajwoVar;
        boolean z;
        int iAV;
        boolean z2;
        vxz vxzVar;
        vxz vxzVar2;
        hno hnoVar;
        acrc acrcVar;
        vxz vxzVar3;
        ahey aheyVar;
        hno hnoVar2;
        RecyclerView recyclerView;
        cf activity;
        actw actwVar;
        SparseBooleanArray sparseBooleanArray;
        apfu apfuVar;
        apft apftVarA2;
        apfu apfuVar2;
        apel apelVar;
        int iAV2;
        int i2;
        apel apelVar2;
        apfu apfuVar3;
        acmt acmtVar;
        apfu apfuVar4;
        apek apekVar;
        actx actxVar;
        SparseBooleanArray sparseBooleanArray2;
        Window window;
        int size;
        acmd acmdVar;
        List list;
        abnl abnlVar;
        acmd acmdVar2;
        List list2;
        List list3;
        int i3;
        List list4;
        acmd acmdVar3;
        final acqb acqbVar;
        int iC;
        int iC2;
        tgr tgrVarAG;
        int iAS;
        apfu apfuVar5;
        Window window2;
        Window.Callback callback;
        Bundle bundle2 = bundle;
        this.K.getClass();
        as();
        this.cn.m(this);
        int i4 = 5;
        int i5 = 9;
        int i6 = 2;
        int i7 = 4;
        int i8 = 3;
        int i9 = 1;
        int i10 = 0;
        if (this.ck.I()) {
            actj actjVar = this.m;
            avmm avmmVar = actjVar.l;
            if (avmmVar.a() <= 0) {
                final AudioManager audioManager = actjVar.j;
                actjVar.k = audioManager.getStreamVolume(3);
                final Activity activityB = actjVar.b();
                if (activityB != null) {
                    audioManager.getClass();
                    avlj avljVar = new avlj() { // from class: actg
                        @Override // defpackage.avlj
                        public final void a(avli avliVar) {
                            acth acthVar = new acth(avliVar, audioManager);
                            IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
                            Context context = activityB;
                            avg.f(context, acthVar, intentFilter, null, 4);
                            avliVar.d(new tuh(context, acthVar, 2));
                        }
                    };
                    avla avlaVar = avla.e;
                    int i11 = avlh.a;
                    avsl avslVar = new avsl(avljVar, avlaVar);
                    avnn avnnVar = atqp.j;
                    avmmVar.c(avlh.I(avslVar, actjVar.o.g(avlaVar)).H(new acpr(new acsc(actjVar, i7), i5)).L(actjVar.h).x(new acpq(new acsc(actjVar, i4), i7)).al(new acte(new acsc(actjVar, i6), i9), new acte(new actf(i9), i10)));
                }
                Activity activityB2 = actjVar.b();
                if (activityB2 != null && actjVar.n == null && (callback = (window2 = activityB2.getWindow()).getCallback()) != null) {
                    actjVar.n = callback;
                    window2.setCallback(new acti(callback, actjVar));
                }
                wby wbyVarB = actjVar.e.e(actjVar.f.hw());
                actjVar.m = wbyVarB;
                avmmVar.c(wbyVarB.k(actj.a).O(actjVar.g).ag(new acte(new acsc(actjVar, i8), i6), new acte(new actf(i6), i7)));
                if (actjVar.p.aa()) {
                    acsj acsjVar = actjVar.i;
                    avmm avmmVar2 = (avmm) acsjVar.d;
                    if (avmmVar2.a() <= 0) {
                        ?? r6 = acsjVar.b;
                        int i12 = 19;
                        int i13 = 20;
                        avmmVar2.c(avlh.J(acsjVar.e, ((avlh) r6.r().g).x(new acpq(new achf(16), i8)).H(new acpr(new achf(18), 7)), r6.C().W(new acpr(new achf(i12), 8)).H(new acpr(new achf(i13), 6))).R(acsjVar.f, new vnc(new acsi(acsjVar, 0), i5)).p().L((avmb) acsjVar.c).al(new acpf(new acsc(acsjVar, i10), i12), new acpf(new achf(17), i13)));
                    }
                }
            }
        }
        if (this.ck.am()) {
            this.bb = layoutInflater.inflate(R.layout.reel_watch_fragment_linear, viewGroup, false);
        } else {
            this.bb = layoutInflater.inflate(R.layout.reel_watch_fragment, viewGroup, false);
        }
        if (!((vxz) this.ck.i).l(79, 45639138L, false)) {
            this.bb.findViewById(R.id.reel_watch_fragment_root).setBackgroundColor(this.bb.getContext().getColor(R.color.reel_player_background));
        }
        if (this.aZ == null) {
            this.aZ = x();
        }
        this.bd = (ViewGroup) this.bb.findViewById(R.id.reel_player_edu_container);
        ViewGroup viewGroup2 = (ViewGroup) this.bb.findViewById(R.id.elements_top_bar_container);
        this.be = viewGroup2;
        this.cg.f = Optional.of(viewGroup2);
        this.cx = this.bb.findViewById(R.id.reel_scrim_shorts_while_top);
        ReelRecyclerView reelRecyclerView = (ReelRecyclerView) this.bb.findViewById(R.id.reel_recycler);
        this.bc = reelRecyclerView;
        reelRecyclerView.ag = this.ck;
        ReelTouchCaptureView reelTouchCaptureView = (ReelTouchCaptureView) this.bb.findViewById(R.id.reel_recycler_touch_capture);
        reelTouchCaptureView.b = this.ck;
        reelTouchCaptureView.a = this.ax;
        this.bc.aK(reelTouchCaptureView);
        if (this.ck.aZ()) {
            ((acox) this.Y.io()).c((ViewGroup) this.bb.findViewById(R.id.reel_pip_overlay_container));
        }
        acni acniVar = this.n;
        vwt vwtVar = this.cr;
        View view = this.bb;
        byte[] bArr = null;
        if (acniVar.i.l(29, 45400535L, false)) {
            vwtVar.F(new aalq(acniVar, view, i7, bArr));
        }
        Optional optionalOfNullable = Optional.ofNullable(getArguments());
        Bundle bundle3 = (Bundle) (true != optionalOfNullable.isPresent() ? new Bundle() : optionalOfNullable.get());
        apfp apfpVarZ = aecm.Z((abnl) bundle3.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor"));
        if (apfpVarZ == null || (apfpVarZ.c & SemanticState.Modal) == 0) {
            optionalEmpty = Optional.empty();
        } else {
            ajwo ajwoVar2 = apfpVarZ.v;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            optionalEmpty = Optional.of(ajwoVar2);
        }
        this.cB = optionalEmpty;
        abnl abnlVarV = v(this.bp, bundle3);
        abnlVarV.getClass();
        this.cC = abnlVarV;
        ahno.O((abnlVarV.w() == null && this.cC.u() == null) ? false : true);
        ajwo ajwoVar3 = this.cC.b;
        ajwoVar3.getClass();
        this.c.kk(ajwoVar3);
        apfp apfpVarZ2 = aecm.Z(this.cC);
        apfpVarZ2.getClass();
        this.bQ = apfpVarZ2.U;
        if (this.br == null) {
            if (bundle2 != null && bundle2.containsKey("ReelWatchExperienceConfigKey")) {
                try {
                    byte[] byteArray = bundle2.getByteArray("ReelWatchExperienceConfigKey");
                    if (byteArray != null) {
                        apfuVar5 = (apfu) aihn.parseFrom(apfu.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                    } else {
                        apfuVar5 = null;
                    }
                } catch (aiik unused) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "extractReelWatchExperienceConfig", 3002, "ReelWatchFragmentImpl.java")).t("Invalid ReelWatchExperienceConfig in Bundle");
                    if ((apfpVarZ2.d & 32768) != 0) {
                        apfuVar5 = apfpVarZ2.R;
                        if (apfuVar5 == null) {
                            apfuVar5 = apfu.a;
                        }
                    } else {
                        apfuVar5 = null;
                    }
                }
            } else if ((apfpVarZ2.d & 32768) != 0) {
                apfuVar5 = apfpVarZ2.R;
                if (apfuVar5 == null) {
                    apfuVar5 = apfu.a;
                }
            } else {
                apfuVar5 = null;
            }
            this.br = apfuVar5;
        }
        if (this.ck.aG()) {
            if (bundle2 != null) {
            } else {
                bundle2 = null;
            }
        }
        ((ViewGroup) this.bb).getClass();
        apfu apfuVar6 = this.br;
        if (apfuVar6 != null && (apfuVar6.b & 64) != 0) {
            acpc acpcVar = this.C;
            apfi apfiVar = apfuVar6.h;
            if (apfiVar == null) {
                apfiVar = apfi.a;
            }
            apfiVar.getClass();
            acpcVar.g = apfiVar;
            if ((apfiVar.b & 4) != 0) {
                acpcVar.f = apfiVar.e;
            }
        }
        if (this.bq.c(ajwoVar3) && !ag()) {
            xgn xgnVarT = t();
            this.bq.b(xgnVarT);
            this.bq.d(xgnVarT, ajwoVar3, null, null, false, aa(getContext()), this.br, Optional.empty());
        }
        if (ag()) {
            aenu aenuVar = (aenu) this.aF.io();
            String str = apfpVarZ2.U;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
            ajwoVar3.c(aihlVarCheckIsLite);
            Object objK = ajwoVar3.j.k(aihlVarCheckIsLite.d);
            aenuVar.j(str, (aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        }
        au(apfpVarZ2, bundle3);
        ReelRecyclerView reelRecyclerView2 = this.bc;
        apfu apfuVar7 = this.br;
        if (apfuVar7 == null || (apftVarA = apft.a(apfuVar7.c)) == null) {
            apftVarA = apft.REEL_WATCH_EXPERIENCE_TYPE_UNKNOWN;
        }
        aeqf aeqfVar = new aeqf();
        aeqfVar.b(t());
        aeqfVar.b = Optional.of(apftVarA);
        if (this.ck.ak()) {
            aeqfVar.a = new abzk(this, 5);
        }
        ((aepz) this.ct.b).m(reelRecyclerView2, aeqfVar.a());
        int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
        acol acolVar = this.bp;
        acmd acmdVar4 = acolVar != null ? acolVar.a : null;
        if (acmdVar4 == null && bundle2 != null) {
            acmdVar4 = (acmd) bundle2.getParcelable("ReelToReelListBundleKey");
        }
        if (acmdVar4 == null && (acmdVar4 = (acmd) bundle3.getParcelable("ReelToReelListBundleKey")) != null && layoutDirectionFromLocale == 1) {
            acmdVar4 = acmdVar4.a();
        }
        acol acolVar2 = this.bp;
        acmd acmdVar5 = acolVar2 != null ? acolVar2.b : null;
        if (acmdVar4 == null || acmdVar4.a.isEmpty()) {
            if (this.cE != null) {
                aihh aihhVar = (aihh) apfpVarZ2.toBuilder();
                apfq apfqVar = this.cE;
                aihhVar.copyOnWrite();
                apfp apfpVar = (apfp) aihhVar.instance;
                apfqVar.getClass();
                apfpVar.k = apfqVar;
                apfpVar.i = 44;
                apfp apfpVar2 = (apfp) aihhVar.build();
                aihh aihhVar2 = (aihh) ajwoVar3.toBuilder();
                aihhVar2.e(apfp.b, apfpVar2);
                ajwoVar = (ajwo) aihhVar2.build();
            } else {
                ajwoVar = ajwoVar3;
            }
            acmdVar4 = new acmd(ajwoVar);
        }
        this.cE = null;
        acol acolVar3 = this.bp;
        if (acolVar3 != null) {
            this.ak.b(acolVar3.d.a);
        }
        apey apeyVarX = aecm.X(aecm.Z(this.cC));
        this.bt = apeyVarX == null || (apeyVarX.b & 2097152) == 0 || ((iAS = a.aS(apeyVarX.j)) != 0 && iAS == 3);
        acni acniVar2 = this.n;
        acniVar2.f = acniVar2.e(this.cC);
        abnl abnlVar2 = this.cC;
        if (bundle2 == null || !bundle2.containsKey("UseRpcSequenceKey")) {
            apfp apfpVarZ3 = aecm.Z(abnlVar2);
            z = (apfpVarZ3 == null || (iAV = a.aV(apfpVarZ3.y)) == 0 || iAV != 3) ? false : true;
        } else {
            z = bundle2.getBoolean("UseRpcSequenceKey");
        }
        ReelPlayerView reelPlayerView = (ReelPlayerView) this.bb.findViewById(R.id.reel_watch_player);
        this.ba = reelPlayerView;
        reelPlayerView.c = this.am;
        reelPlayerView.b = (ViewGroup) this.bb.findViewById(R.id.reel_player_underlay);
        if (((vxz) this.ck.i).l(301, 45841078L, false)) {
            ReelPlayerView reelPlayerView2 = this.ba;
            float fA = (float) ((vxz) this.ck.i).a(4, 45841079L, 0.0d);
            zki zkiVar = reelPlayerView2.f;
            if (zkiVar != null) {
                zkiVar.j(fA);
            }
        }
        this.o.d = this.ba;
        this.bf = (ViewGroup) this.bb.findViewById(R.id.nerd_stats_container);
        Object obj = this.aZ.a;
        ViewGroup viewGroup3 = this.bf;
        if (viewGroup3 != null && obj != null) {
            viewGroup3.addView((View) obj);
        }
        acor acorVar = this.X;
        acou acouVar = this.aa;
        acorVar.m = acos.a;
        acorVar.setPadding(acorVar.a, acorVar.b, acorVar.c, acorVar.d);
        acouVar.g(0.9f);
        acorVar.addView(acouVar);
        acorVar.o = acouVar;
        ReelPlayerView reelPlayerView3 = this.ba;
        acor acorVar2 = this.X;
        acorVar2.l = reelPlayerView3.a;
        reelPlayerView3.S(acorVar2);
        reelPlayerView3.m = acorVar2;
        this.ba.n = this.ck;
        aw();
        apfu apfuVar8 = this.br;
        if (apfuVar8 == null) {
            tuk.l(this.cx, true);
        } else {
            apfd apfdVar = apfuVar8.j;
            if (apfdVar == null) {
                apfdVar = apfd.a;
            }
            if (apfdVar.c) {
                tuk.l(this.cx, false);
                this.bi = true;
            } else {
                tuk.l(this.cx, true);
            }
        }
        this.ai.h(this.bb);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.bb.findViewById(R.id.reel_watch_refresher);
        this.cy = swipeRefreshLayout;
        this.cF = this.cv.v(swipeRefreshLayout, this);
        acqz acqzVar = this.t;
        abhe abheVar = this.ab;
        boolean z3 = this.bt;
        boolean zAK = this.ck.aK();
        ReelRecyclerView reelRecyclerView3 = this.bc;
        ReelPlayerView reelPlayerView4 = this.ba;
        acnb acnbVar = this.cF;
        acqzVar.C = abheVar;
        acqzVar.D = z3;
        reelRecyclerView3.getClass();
        acqzVar.y = reelRecyclerView3;
        reelPlayerView4.getClass();
        acqzVar.B = reelPlayerView4;
        acqzVar.an = acnbVar;
        acud acudVar = acqzVar.as;
        aehs aehsVar = (aehs) acudVar.l.io();
        aciz acizVar = (aciz) acudVar.d.io();
        aciz acizVar2 = (aciz) acudVar.p.io();
        ((aawo) acudVar.j.io()).getClass();
        vxz vxzVar4 = (vxz) acudVar.q.io();
        vxzVar4.getClass();
        vxz vxzVar5 = (vxz) acudVar.i.io();
        vxzVar5.getClass();
        Map map = (Map) acudVar.n.io();
        abuv abuvVar = (abuv) acudVar.o.io();
        hno hnoVar3 = (hno) acudVar.b.io();
        hnoVar3.getClass();
        acts actsVar = (acts) acudVar.k.io();
        actsVar.getClass();
        mbc mbcVar = (mbc) acudVar.h.io();
        mbcVar.getClass();
        tqj tqjVar = (tqj) acudVar.m.io();
        tqjVar.getClass();
        awmd awmdVar = acudVar.a;
        awmd awmdVar2 = acudVar.e;
        acpo acpoVar = (acpo) acudVar.c.io();
        acpoVar.getClass();
        adif adifVar = (adif) acudVar.f.io();
        qcb qcbVar = (qcb) acudVar.g.io();
        qcbVar.getClass();
        acqzVar.ag = new acqh(aehsVar, acizVar, acizVar2, vxzVar4, vxzVar5, map, abuvVar, hnoVar3, actsVar, mbcVar, tqjVar, awmdVar, awmdVar2, acpoVar, adifVar, qcbVar, acqzVar, z);
        if (acqzVar.ak) {
            acqzVar.ah = acqzVar.ax.w(acqzVar.ag, acqzVar);
            acqzVar.ag.x(acqzVar.ah);
        }
        acqzVar.ai = zAK;
        acqzVar.aj = false;
        if (acqzVar.Z) {
            if (z3) {
                z2 = true;
                acqzVar.ag.T(true);
            }
            acqzVar.af = new trt(reelRecyclerView3.getContext());
            reelRecyclerView3.ad(acqzVar.ag);
            reelRecyclerView3.r = z2;
            reelRecyclerView3.az();
            vxzVar = acqzVar.ap;
            if (vxzVar.l(9, 45399111L, false)) {
                iC = (int) vxzVar.c(1, 45399109L, 0L);
                vxzVar2 = vxzVar;
                iC2 = (int) vxzVar.c(2, 45399110L, 0L);
                tgrVarAG = reelRecyclerView3.aG();
                if (iC >= 0) {
                    tgrVarAG.n(10002, iC);
                    tgrVarAG.n(10006, iC);
                    tgrVarAG.n(10009, iC);
                    tgrVarAG.n(10010, iC);
                }
                if (iC2 >= 0) {
                    tgrVarAG.n(10003, iC2);
                    tgrVarAG.n(10004, iC2);
                    tgrVarAG.n(10000, iC2);
                    tgrVarAG.n(10001, iC2);
                    tgrVarAG.n(10005, iC2);
                    tgrVarAG.n(10008, iC2);
                    tgrVarAG.n(10011, iC2);
                }
            } else {
                vxzVar2 = vxzVar;
            }
            Context context = reelRecyclerView3.getContext();
            hnoVar = acqzVar.at;
            acrcVar = acqzVar.d;
            acqzVar.z = new ReelLinearLayoutManager(context, hnoVar, acrcVar, z3);
            reelRecyclerView3.ah(acqzVar.z);
            acqzVar.z.scrollToPosition(0);
            acqzVar.z.setItemPrefetchEnabled(true);
            vxzVar3 = (vxz) hnoVar.i;
            if (vxzVar3.l(80, 45639194L, false)) {
                acqzVar.z.setInitialPrefetchItemCount(1);
            }
            aheyVar = acqzVar.j;
            acqzVar.x = new acqx(acqzVar);
            acqzVar.x.f(reelRecyclerView3);
            reelRecyclerView3.aC(new afxf(acqzVar.av, acqzVar.ar));
            reelRecyclerView3.addOnAttachStateChangeListener(new jh(acqzVar, 6));
            if (hnoVar.H()) {
                acqb acqbVar2 = new acqb(reelRecyclerView3, acqzVar.z, acqzVar.x, aheyVar, hnoVar);
                recyclerView = reelRecyclerView3;
                hnoVar2 = hnoVar;
                acqzVar.A = acqbVar2;
                acqbVar = acqzVar.A;
                if (((hno) acqbVar.e).H()) {
                    ((ReelRecyclerView) acqbVar.a).setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: acqa
                        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
                        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.Runnable] */
                        @Override // android.view.View.OnGenericMotionListener
                        public final boolean onGenericMotion(View view2, MotionEvent motionEvent) {
                            if (motionEvent.getAction() != 8) {
                                return false;
                            }
                            acqb acqbVar3 = acqbVar;
                            acqbVar3.a();
                            acqbVar3.f = acqbVar3.d.schedule(acqbVar3.g, 250L, TimeUnit.MILLISECONDS);
                            return false;
                        }
                    });
                }
            } else {
                hnoVar2 = hnoVar;
                recyclerView = reelRecyclerView3;
            }
            if (hnoVar2.v() || vxzVar3.l(12, 45401048L, false)) {
                acrcVar.c = 16;
            }
            acrcVar.g = acqzVar.aw;
            recyclerView.w(acrcVar);
            bac.p(recyclerView, new axx());
            reelPlayerView4.m();
            reelPlayerView4.g(vxzVar2.a(0, 45398939L, 0.1d));
            reelPlayerView4.j(hnoVar2.b());
            reelPlayerView4.e(vxzVar2.l(61, 45618485L, false));
            if (this.ck.aP() || acmdVar5 == null) {
                acmdVar4 = acmdVar4;
                this.t.V(acmdVar4.a, acmdVar4.b, 8);
            } else {
                acqz acqzVar2 = this.t;
                List list5 = acmdVar4.a;
                List list6 = acmdVar4.b;
                abnl abnlVar3 = this.cC;
                acqh acqhVar = acqzVar2.ag;
                if (acqhVar != null) {
                    List list7 = acmdVar5.a;
                    List list8 = acmdVar5.b;
                    if (list6 != null) {
                        ahno.O(list5.size() == list6.size());
                    }
                    if (list5.isEmpty()) {
                        acmdVar = acmdVar4;
                    } else {
                        apgj apgjVarQ = acqhVar.Q(list5);
                        List listR = acqhVar.R(list5);
                        synchronized (acqhVar.e) {
                            size = acqhVar.f.size();
                            long j = size == 0 ? -1L : ((acra) acqhVar.f.get(size - 1)).b;
                            long jB = acqhVar.k.b();
                            long jG = j;
                            int i14 = 0;
                            while (i14 < listR.size()) {
                                ajwo ajwoVar4 = (ajwo) listR.get(i14);
                                ahno.O(aecm.aD(ajwoVar4));
                                if (aecm.ae(ajwoVar4) && acqhVar.g.ak) {
                                    int i15 = i14;
                                    long jF = acqhVar.F(ajwoVar4, list6, i15, jB, jG);
                                    if (list7 == null || list7.isEmpty() || list8 == null || list8.isEmpty()) {
                                        list4 = list6;
                                        abnlVar = abnlVar3;
                                    } else {
                                        list4 = list6;
                                        abnlVar = abnlVar3;
                                        if (list7.size() == list8.size()) {
                                            acra acraVar = (acra) aguu.K(acqhVar.f);
                                            if (acqhVar.W(acraVar, (ajwo) list7.get(0))) {
                                                String strW = abnlVar != null ? abnlVar.w() : "";
                                                List list9 = acraVar.o;
                                                list9.clear();
                                                int i16 = 0;
                                                while (i16 < list7.size()) {
                                                    ajwo ajwoVar5 = (ajwo) list7.get(i16);
                                                    List list10 = list7;
                                                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                                                    ajwoVar5.c(aihlVarCheckIsLite2);
                                                    if (ajwoVar5.j.n(aihlVarCheckIsLite2.d)) {
                                                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                                                        ajwoVar5.c(aihlVarCheckIsLite3);
                                                        acmdVar3 = acmdVar4;
                                                        Object objK2 = ajwoVar5.j.k(aihlVarCheckIsLite3.d);
                                                        String str2 = ((apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).o;
                                                        if (!str2.isEmpty() && str2.equals(strW)) {
                                                            acraVar.p = i16;
                                                        }
                                                    } else {
                                                        acmdVar3 = acmdVar4;
                                                    }
                                                    long j2 = jB;
                                                    jB = j2;
                                                    list9.add(acqhVar.p.x(i16, acraVar.q, acqhVar.P(ajwoVar5), (aigj) ((Optional) list8.get(i16)).orElse(null), j2, false));
                                                    i16++;
                                                    acmdVar4 = acmdVar3;
                                                    list7 = list10;
                                                    list8 = list8;
                                                }
                                                list8 = list8;
                                                acmdVar2 = acmdVar4;
                                                list2 = list7;
                                            }
                                            list3 = list4;
                                            i3 = i15;
                                            jG = jF;
                                        }
                                    }
                                    acmdVar2 = acmdVar4;
                                    list2 = list7;
                                    list3 = list4;
                                    i3 = i15;
                                    jG = jF;
                                } else {
                                    list8 = list8;
                                    abnlVar = abnlVar3;
                                    acmdVar2 = acmdVar4;
                                    list2 = list7;
                                    listR = listR;
                                    list3 = list6;
                                    acqh acqhVar2 = acqhVar;
                                    i3 = i14;
                                    acqhVar = acqhVar2;
                                    jG = acqhVar2.G(ajwoVar4, list3, i3, jB, jG);
                                }
                                i14 = i3 + 1;
                                abnlVar3 = abnlVar;
                                listR = listR;
                                acmdVar4 = acmdVar2;
                                list6 = list3;
                                list7 = list2;
                                list8 = list8;
                            }
                            acmdVar = acmdVar4;
                            list = listR;
                        }
                        acqhVar.l(size, list.size());
                        acqhVar.U();
                        aciz acizVarJ = acqhVar.o.j();
                        acizVarJ.k(8);
                        acizVarJ.h(adif.f(aawo.i(list), apgjVarQ));
                        acizVarJ.g();
                    }
                    acqzVar2.u(list5);
                    acqx acqxVar = acqzVar2.x;
                    if (acqxVar != null) {
                        acqxVar.j();
                    }
                    acmdVar4 = acmdVar;
                }
            }
            if (!this.cD.isEmpty()) {
                List list11 = this.cD;
                this.cD = agpi.a;
                this.t.W(list11, null, 16, false);
            }
            if (aecm.ar(ajwoVar3) && !aecm.au(this.cC) && (!this.ck.T() || Collection.EL.stream(acmdVar4.a).anyMatch(new aaep(18)))) {
                if (this.ck.T()) {
                    this.cz = null;
                }
                at(ajwoVar3);
            }
            this.t.o.add(this);
            this.t.p.add(this);
            SwipeRefreshLayout swipeRefreshLayout2 = this.cy;
            acnb acnbVar2 = this.cF;
            swipeRefreshLayout2.a = acnbVar2;
            this.bc.af = acnbVar2;
            activity = getActivity();
            if (activity != null) {
                activity.startPostponedEnterTransition();
                if (((vxz) this.ck.i).l(302, 45841080L, false) && (window = activity.getWindow()) != null) {
                    this.cP = window.getAttributes().format;
                    this.cQ = window.getColorMode();
                    this.cO = true;
                    window.setFormat(22);
                    window.setColorMode(2);
                }
            }
            actwVar = this.z;
            if (actwVar.j.U()) {
                actxVar = actwVar.a;
                actxVar.f = false;
                actxVar.d = 0;
                sparseBooleanArray2 = actxVar.c;
                synchronized (sparseBooleanArray2) {
                    actxVar.b.kk(Boolean.FALSE);
                    sparseBooleanArray2.clear();
                }
            } else {
                actwVar.h = false;
                sparseBooleanArray = actwVar.d;
                synchronized (sparseBooleanArray) {
                    actwVar.b.kk(Boolean.FALSE);
                    sparseBooleanArray.clear();
                }
            }
            if (o()) {
                this.al.a(this.bb, this);
            }
            this.q.l(this.ba, this.bc, this.cr);
            this.q.d = false;
            this.cw = new acob(this);
            abwk abwkVar = ((vor) this.ah.io()).w;
            vqi vqiVar = this.cw;
            vqiVar.getClass();
            abwkVar.h(vqiVar);
            if (this.ck.ag()) {
                this.cr.E(new acnd(this, 9));
            }
            apfuVar = apfpVarZ2.R;
            if (apfuVar == null) {
                apfuVar = apfu.a;
            }
            apftVarA2 = apft.a(apfuVar.c);
            if (apftVarA2 == null) {
                apftVarA2 = apft.REEL_WATCH_EXPERIENCE_TYPE_UNKNOWN;
            }
            if (apftVarA2 == apft.REEL_WATCH_EXPERIENCE_TYPE_MINI_APP_AD) {
                this.bw = true;
            }
            this.n.b(apfpVarZ2);
            if ((!this.ck.aK() || this.ck.am()) && (apfuVar2 = this.br) != null) {
                if ((apfuVar2.b & 4) != 0) {
                    apelVar = apfuVar2.d;
                    if (apelVar == null) {
                        apelVar = apel.a;
                    }
                    iAV2 = a.aV(apelVar.c);
                    if (iAV2 == 0) {
                        iAV2 = 1;
                    }
                    i2 = iAV2 - 1;
                    if (i2 == 1) {
                        this.by.kk(Boolean.FALSE);
                    } else if (i2 == 2) {
                        this.by.kk(Boolean.TRUE);
                    } else if (i2 != 3) {
                        this.by.kk(Boolean.FALSE);
                    } else {
                        apelVar2 = this.br.d;
                        if (apelVar2 == null) {
                            apelVar2 = apel.a;
                        }
                        if ((apelVar2.b & 2) != 0 || this.bb == null) {
                            this.by.kk(Boolean.FALSE);
                        } else {
                            this.ci.c();
                            this.by.kk(Boolean.FALSE);
                        }
                    }
                }
            } else if (this.ck.aC()) {
                ar(0.0f, false);
            }
            if (this.ck.aK()) {
                apfuVar4 = apfpVarZ2.R;
                if (apfuVar4 == null) {
                    apfuVar4 = apfu.a;
                }
                if ((apfuVar4.b & 8) != 0) {
                    apekVar = this.br.e;
                    if (apekVar == null) {
                        apekVar = apek.b;
                    }
                    this.e.kk(agke.n(new aihx(apekVar.c, apek.a)));
                }
            }
            if (this.ck.am() && (apfuVar3 = this.br) != null) {
                this.aG.f(apfuVar3);
                acmtVar = this.aG;
                if (acmtVar.a) {
                    LinearLayout linearLayout = (LinearLayout) this.bb;
                    linearLayout.addView(acmtVar.a(layoutInflater, linearLayout, this.bc));
                    this.aG.h(aa(getContext()));
                }
            }
            if (this.ck.l()) {
                ((acpv) this.aI.io()).d(new avgj(this, null));
            }
            this.bg = true;
            return this.bb;
        }
        acqzVar.ag.T(false);
        z2 = true;
        acqzVar.af = new trt(reelRecyclerView3.getContext());
        reelRecyclerView3.ad(acqzVar.ag);
        reelRecyclerView3.r = z2;
        reelRecyclerView3.az();
        vxzVar = acqzVar.ap;
        if (vxzVar.l(9, 45399111L, false)) {
            iC = (int) vxzVar.c(1, 45399109L, 0L);
            vxzVar2 = vxzVar;
            iC2 = (int) vxzVar.c(2, 45399110L, 0L);
            tgrVarAG = reelRecyclerView3.aG();
            if (iC >= 0) {
                tgrVarAG.n(10002, iC);
                tgrVarAG.n(10006, iC);
                tgrVarAG.n(10009, iC);
                tgrVarAG.n(10010, iC);
            }
            if (iC2 >= 0) {
                tgrVarAG.n(10003, iC2);
                tgrVarAG.n(10004, iC2);
                tgrVarAG.n(10000, iC2);
                tgrVarAG.n(10001, iC2);
                tgrVarAG.n(10005, iC2);
                tgrVarAG.n(10008, iC2);
                tgrVarAG.n(10011, iC2);
            }
        } else {
            vxzVar2 = vxzVar;
        }
        Context context2 = reelRecyclerView3.getContext();
        hnoVar = acqzVar.at;
        acrcVar = acqzVar.d;
        acqzVar.z = new ReelLinearLayoutManager(context2, hnoVar, acrcVar, z3);
        reelRecyclerView3.ah(acqzVar.z);
        acqzVar.z.scrollToPosition(0);
        acqzVar.z.setItemPrefetchEnabled(true);
        vxzVar3 = (vxz) hnoVar.i;
        if (vxzVar3.l(80, 45639194L, false)) {
            acqzVar.z.setInitialPrefetchItemCount(1);
        }
        aheyVar = acqzVar.j;
        acqzVar.x = new acqx(acqzVar);
        acqzVar.x.f(reelRecyclerView3);
        reelRecyclerView3.aC(new afxf(acqzVar.av, acqzVar.ar));
        reelRecyclerView3.addOnAttachStateChangeListener(new jh(acqzVar, 6));
        if (hnoVar.H()) {
            acqb acqbVar3 = new acqb(reelRecyclerView3, acqzVar.z, acqzVar.x, aheyVar, hnoVar);
            recyclerView = reelRecyclerView3;
            hnoVar2 = hnoVar;
            acqzVar.A = acqbVar3;
            acqbVar = acqzVar.A;
            if (((hno) acqbVar.e).H()) {
                ((ReelRecyclerView) acqbVar.a).setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: acqa
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.Runnable] */
                    @Override // android.view.View.OnGenericMotionListener
                    public final boolean onGenericMotion(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 8) {
                            return false;
                        }
                        acqb acqbVar4 = acqbVar;
                        acqbVar4.a();
                        acqbVar4.f = acqbVar4.d.schedule(acqbVar4.g, 250L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            }
        } else {
            hnoVar2 = hnoVar;
            recyclerView = reelRecyclerView3;
        }
        if (hnoVar2.v()) {
            acrcVar.c = 16;
        } else {
            acrcVar.c = 16;
        }
        acrcVar.g = acqzVar.aw;
        recyclerView.w(acrcVar);
        bac.p(recyclerView, new axx());
        reelPlayerView4.m();
        reelPlayerView4.g(vxzVar2.a(0, 45398939L, 0.1d));
        reelPlayerView4.j(hnoVar2.b());
        reelPlayerView4.e(vxzVar2.l(61, 45618485L, false));
        if (this.ck.aP()) {
            acmdVar4 = acmdVar4;
            this.t.V(acmdVar4.a, acmdVar4.b, 8);
        } else {
            acmdVar4 = acmdVar4;
            this.t.V(acmdVar4.a, acmdVar4.b, 8);
        }
        if (!this.cD.isEmpty()) {
            List list12 = this.cD;
            this.cD = agpi.a;
            this.t.W(list12, null, 16, false);
        }
        if (aecm.ar(ajwoVar3)) {
            if (this.ck.T()) {
                this.cz = null;
            }
            at(ajwoVar3);
        }
        this.t.o.add(this);
        this.t.p.add(this);
        SwipeRefreshLayout swipeRefreshLayout3 = this.cy;
        acnb acnbVar3 = this.cF;
        swipeRefreshLayout3.a = acnbVar3;
        this.bc.af = acnbVar3;
        activity = getActivity();
        if (activity != null) {
            activity.startPostponedEnterTransition();
            if (((vxz) this.ck.i).l(302, 45841080L, false)) {
                this.cP = window.getAttributes().format;
                this.cQ = window.getColorMode();
                this.cO = true;
                window.setFormat(22);
                window.setColorMode(2);
            }
        }
        actwVar = this.z;
        if (actwVar.j.U()) {
            actxVar = actwVar.a;
            actxVar.f = false;
            actxVar.d = 0;
            sparseBooleanArray2 = actxVar.c;
            synchronized (sparseBooleanArray2) {
                actxVar.b.kk(Boolean.FALSE);
                sparseBooleanArray2.clear();
            }
        } else {
            actwVar.h = false;
            sparseBooleanArray = actwVar.d;
            synchronized (sparseBooleanArray) {
                actwVar.b.kk(Boolean.FALSE);
                sparseBooleanArray.clear();
            }
        }
        if (o()) {
            this.al.a(this.bb, this);
        }
        this.q.l(this.ba, this.bc, this.cr);
        this.q.d = false;
        this.cw = new acob(this);
        abwk abwkVar2 = ((vor) this.ah.io()).w;
        vqi vqiVar2 = this.cw;
        vqiVar2.getClass();
        abwkVar2.h(vqiVar2);
        if (this.ck.ag()) {
            this.cr.E(new acnd(this, 9));
        }
        apfuVar = apfpVarZ2.R;
        if (apfuVar == null) {
            apfuVar = apfu.a;
        }
        apftVarA2 = apft.a(apfuVar.c);
        if (apftVarA2 == null) {
            apftVarA2 = apft.REEL_WATCH_EXPERIENCE_TYPE_UNKNOWN;
        }
        if (apftVarA2 == apft.REEL_WATCH_EXPERIENCE_TYPE_MINI_APP_AD) {
            this.bw = true;
        }
        this.n.b(apfpVarZ2);
        if (this.ck.aK()) {
            if ((apfuVar2.b & 4) != 0) {
                apelVar = apfuVar2.d;
                if (apelVar == null) {
                    apelVar = apel.a;
                }
                iAV2 = a.aV(apelVar.c);
                if (iAV2 == 0) {
                    iAV2 = 1;
                }
                i2 = iAV2 - 1;
                if (i2 == 1) {
                    this.by.kk(Boolean.FALSE);
                } else if (i2 == 2) {
                    this.by.kk(Boolean.TRUE);
                } else if (i2 != 3) {
                    this.by.kk(Boolean.FALSE);
                } else {
                    apelVar2 = this.br.d;
                    if (apelVar2 == null) {
                        apelVar2 = apel.a;
                    }
                    if ((apelVar2.b & 2) != 0) {
                        this.by.kk(Boolean.FALSE);
                    } else {
                        this.by.kk(Boolean.FALSE);
                    }
                }
            }
        } else if ((apfuVar2.b & 4) != 0) {
            apelVar = apfuVar2.d;
            if (apelVar == null) {
                apelVar = apel.a;
            }
            iAV2 = a.aV(apelVar.c);
            if (iAV2 == 0) {
                iAV2 = 1;
            }
            i2 = iAV2 - 1;
            if (i2 == 1) {
                this.by.kk(Boolean.FALSE);
            } else if (i2 == 2) {
                this.by.kk(Boolean.TRUE);
            } else if (i2 != 3) {
                this.by.kk(Boolean.FALSE);
            } else {
                apelVar2 = this.br.d;
                if (apelVar2 == null) {
                    apelVar2 = apel.a;
                }
                if ((apelVar2.b & 2) != 0) {
                    this.by.kk(Boolean.FALSE);
                } else {
                    this.by.kk(Boolean.FALSE);
                }
            }
        }
        if (this.ck.aK()) {
            apfuVar4 = apfpVarZ2.R;
            if (apfuVar4 == null) {
                apfuVar4 = apfu.a;
            }
            if ((apfuVar4.b & 8) != 0) {
                apekVar = this.br.e;
                if (apekVar == null) {
                    apekVar = apek.b;
                }
                this.e.kk(agke.n(new aihx(apekVar.c, apek.a)));
            }
        }
        if (this.ck.am()) {
            this.aG.f(apfuVar3);
            acmtVar = this.aG;
            if (acmtVar.a) {
                LinearLayout linearLayout2 = (LinearLayout) this.bb;
                linearLayout2.addView(acmtVar.a(layoutInflater, linearLayout2, this.bc));
                this.aG.h(aa(getContext()));
            }
        }
        if (this.ck.l()) {
            ((acpv) this.aI.io()).d(new avgj(this, null));
        }
        this.bg = true;
        return this.bb;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cc
    public void onDestroy() {
        cf activity;
        cf activity2;
        super.onDestroy();
        Runnable runnable = this.V;
        if (runnable != null) {
            this.Q.removeCallbacks(runnable);
            this.V = null;
        }
        if (!this.bO && (activity2 = getActivity()) != null && !activity2.isChangingConfigurations()) {
            adyc adycVar = this.co;
            adycVar.f(new aavj(4));
            adycVar.f.clear();
        }
        apfu apfuVar = this.br;
        if (apfuVar != null && (apfuVar.b & 32) != 0 && !this.bO && (activity = getActivity()) != null && !activity.isChangingConfigurations()) {
            vxe vxeVar = this.L;
            ajwo ajwoVar = apfuVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
        this.bO = false;
        this.bP = agpr.a;
        this.aM.b();
        this.ch.a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40, types: [aclq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v20, types: [abwy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [abwy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cc
    public void onDestroyView() {
        View view;
        acpd acpdVar;
        Window window;
        String str;
        ?? r7;
        acqi acqiVar;
        zyz zyzVar;
        tes tesVar;
        cf activity;
        Window window2;
        if (this.ck.I()) {
            actj actjVar = this.m;
            if (actjVar.p.aa()) {
                ((avmm) actjVar.i.d).b();
            }
            Window.Callback callback = actjVar.n;
            if (callback != null) {
                Activity activityB = actjVar.b();
                if (activityB != null && (window2 = activityB.getWindow()) != null) {
                    window2.setCallback(callback);
                }
                actjVar.n = null;
            }
            actjVar.l.b();
        }
        int i2 = 1;
        if (this.cb.l(214, 45692313L, false)) {
            cf activity2 = getActivity();
            this.F.y(activity2 == null || activity2.isFinishing());
        }
        synchronized (this.aV) {
            Optional optional = this.bE;
            abyy abyyVar = new abyy(this, 12);
            if (true == optional.isPresent()) {
                ?? r3 = optional.get();
                Object obj = abyyVar.a;
                ((acoi) obj).Q.removeCallbacks(r3);
                ((acoi) obj).K();
            }
        }
        if (this.ck.l()) {
            acpv acpvVar = (acpv) this.aI.io();
            acpvVar.f.b();
            acpvVar.d.kk(Boolean.TRUE);
            awku awkuVar = acpvVar.a;
            Boolean bool = Boolean.FALSE;
            awkuVar.kk(bool);
            acpvVar.b.kk(bool);
            acpvVar.c.kk(bool);
            acpvVar.e.kk(bool);
            acpvVar.a();
        }
        if (this.ck.S() && !this.bO && (activity = getActivity()) != null && !activity.isChangingConfigurations()) {
            aclm aclmVar = this.E;
            acqh acqhVar = this.t.ag;
            aclmVar.a(acqhVar != null ? acqhVar.N() : agpr.a);
        }
        if (!this.bO) {
            av(Optional.of(aped.REEL_NAVIGATION_REASON_USER_INITIATED));
        }
        if (this.ck.Q() && this.bO && !this.bP.isEmpty()) {
            this.E.a(this.bP);
        }
        acqz acqzVar = this.t;
        Optional optional2 = acqzVar.E;
        acrj acrjVar = new acrj(acqzVar, i2);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            Object obj3 = acrjVar.a;
            ?? r4 = ((aciz) obj2).a;
            if (!((acqk) r4).c) {
                ((acqz) obj3).g.c(32, "reelAdsClientDelegate.onPageExit called but onPageEnter was never called.");
            }
            ((acqz) obj3).a.f(r4, 4);
        }
        acqzVar.p(acqj.b);
        acqzVar.E = Optional.empty();
        acqzVar.F = Optional.empty();
        acqzVar.M = Long.MIN_VALUE;
        acqzVar.Q = -1;
        acqh acqhVar2 = acqzVar.ag;
        if (acqhVar2 != null) {
            if (tym.at(acqhVar2.l) && (tesVar = acqhVar2.m) != null) {
                tesVar.e(acqhVar2);
            }
            synchronized (acqhVar2.e) {
                Iterator it = acqhVar2.f.iterator();
                while (it.hasNext()) {
                    acrp acrpVar = ((acra) it.next()).i;
                    if (acrpVar != null) {
                        acrpVar.M();
                    }
                }
                if (acqhVar2.n.aP()) {
                    acqhVar2.f = new ArrayList();
                } else {
                    acqhVar2.f.clear();
                }
            }
            acqhVar2.jW();
        }
        acqzVar.t.kk(Optional.empty());
        acqzVar.u.kk(Optional.empty());
        hno hnoVar = acqzVar.at;
        if (hnoVar.ay()) {
            acqzVar.v.kk(Optional.empty());
        }
        acqzVar.w.kk(Optional.empty());
        acqzVar.r.b();
        acqb acqbVar = acqzVar.A;
        if (acqbVar != null) {
            acqbVar.a();
            ((ReelRecyclerView) acqbVar.a).setOnGenericMotionListener(null);
        }
        if (acqzVar.ak) {
            acqzVar.aa.d = null;
            if (hnoVar.aJ() && (zyzVar = (zyz) acqzVar.ab.a.getAndSet(null)) != null) {
                zyzVar.cancel(false);
            }
            acqzVar.f.l = false;
            if (acqzVar.O) {
                acqzVar.r("EXIT");
            }
            acqzVar.N = Long.MIN_VALUE;
            acqh acqhVar3 = acqzVar.ag;
            if (acqhVar3 != null && (acqiVar = acqzVar.ah) != null) {
                acqhVar3.y(acqiVar);
                acqzVar.ah = null;
            }
        }
        acqzVar.an = null;
        acqzVar.k.c();
        this.t.y(this);
        this.aq.d();
        this.ab.i();
        acmg acmgVar = this.al;
        hno hnoVar2 = acmgVar.i;
        if (hnoVar2.ac()) {
            acmgVar.e.b();
        } else {
            acmgVar.d.g(acmgVar);
        }
        if (hnoVar2.X()) {
            acmgVar.f = null;
            acmgVar.g = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.cy;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.a = null;
            if (this.ck.X()) {
                swipeRefreshLayout.k(false);
                swipeRefreshLayout.clearAnimation();
            }
        }
        this.cF = null;
        if (this.cw != null) {
            abwk abwkVar = ((vor) this.ah.io()).w;
            vqi vqiVar = this.cw;
            vqiVar.getClass();
            abwkVar.i(vqiVar);
        }
        this.cn.m(null);
        if (!this.F.ac() || ((str = this.bs) != null && (r7 = this.F.o.d) != 0 && r7.p().equals(str))) {
            abxj abxjVar = this.ck.x() ? (abxj) this.H.aA().c.b() : abxj.a;
            boolean zL = ((vxz) this.ck.m).l(18, 45679567L, false);
            abvk abvkVar = this.F;
            if (zL) {
                abvkVar.D();
            } else {
                abvkVar.r();
            }
            if (!abxjVar.equals(abxj.a)) {
                this.H.aA().c.f(abxjVar);
            }
        }
        ReelRecyclerView reelRecyclerView = this.bc;
        if (reelRecyclerView != null) {
            this.ct.ae(reelRecyclerView);
        }
        this.bq.b(t());
        ay();
        absg absgVar = this.at;
        if (absgVar instanceof acun) {
            acun acunVar = (acun) absgVar;
            String str2 = this.bJ;
            if (str2 != null && !str2.isEmpty()) {
                Map map = acunVar.a;
                if (map.containsKey(str2)) {
                    map.remove(str2);
                }
            }
            acunVar.j.l(91, 45647746L, false);
        }
        ReelPlayerView reelPlayerView = this.ba;
        if (this.cd.l(34, 45421246L, false) && reelPlayerView != null && (reelPlayerView.getParent() instanceof ViewManager)) {
            ((ViewManager) reelPlayerView.getParent()).removeView(reelPlayerView);
        }
        this.bV.b();
        this.bW.a();
        if (this.cO) {
            this.cO = false;
            int i3 = this.cP;
            int i4 = this.cQ;
            this.cP = 0;
            this.cQ = 0;
            cf activity3 = getActivity();
            if (activity3 != null && (window = activity3.getWindow()) != null) {
                window.setFormat(i3);
                window.setColorMode(i4);
            }
        }
        this.bu = Long.MIN_VALUE;
        this.bm = Optional.empty();
        this.bT.b = 1;
        this.aT.set(false);
        if (this.ck.K()) {
            this.aU.set(false);
        }
        this.bs = null;
        this.cC = null;
        this.cD = agpi.a;
        this.cE = null;
        this.T = false;
        this.bv = false;
        this.bA = null;
        this.bB = null;
        this.bC = Optional.empty();
        this.cI = Optional.empty();
        this.bD = Optional.empty();
        this.bw = false;
        awli awliVar = this.by;
        Boolean bool2 = Boolean.FALSE;
        awliVar.kk(bool2);
        this.bx.kk(bool2);
        acni acniVar = this.n;
        acniVar.c(false);
        acniVar.f = false;
        acniVar.g = false;
        if (this.ck.aM()) {
            this.q.j();
        }
        synchronized (this.aV) {
            this.bF = false;
            this.cL = false;
            this.cM = true;
            this.bR = 1;
            this.cH = false;
        }
        if (this.ck.j()) {
            this.bG.kk(Boolean.TRUE);
        }
        I();
        this.bM = false;
        acnb acnbVar = this.cF;
        if (acnbVar != null) {
            acnbVar.j = false;
        }
        this.bQ = null;
        this.bi = false;
        this.cx = null;
        this.bh = false;
        this.cO = false;
        this.cP = 0;
        this.cQ = 0;
        this.bj = false;
        this.bS.d = null;
        this.bg = false;
        if (this.ck.X()) {
            this.q.j();
            this.t.o();
            acqz acqzVar2 = this.t;
            if (acqzVar2.at.X()) {
                acqx acqxVar = acqzVar2.x;
                if (acqxVar != null) {
                    acqxVar.f(null);
                }
                ReelRecyclerView reelRecyclerView2 = acqzVar2.y;
                if (reelRecyclerView2 != null) {
                    reelRecyclerView2.ad(null);
                    acqzVar2.y.ah(null);
                    tgr tgrVarAG = acqzVar2.y.aG();
                    if (tgrVarAG != null) {
                        tgrVarAG.k();
                    }
                    acqzVar2.y.A();
                    ReelRecyclerView reelRecyclerView3 = acqzVar2.y;
                    reelRecyclerView3.af = null;
                    reelRecyclerView3.aK(null);
                }
                acqzVar2.an = null;
                acqzVar2.ag = null;
                acqzVar2.y = null;
                acqzVar2.z = null;
                acqzVar2.x = null;
                acqzVar2.A = null;
                acqzVar2.B = null;
            }
            this.t.o.remove(this);
            acpe acpeVar = this.D;
            if (acpeVar.s.X()) {
                RecyclerView recyclerView = acpeVar.g;
                if (recyclerView != null && (acpdVar = acpeVar.h) != null) {
                    recyclerView.Z(acpdVar);
                }
                acpeVar.g = null;
                acpeVar.h = null;
                acpeVar.f = null;
            }
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.removeAllViews();
            }
            aefv aefvVar = this.ai;
            aefvVar.i();
            tus tusVar = aefvVar.d;
            if (tusVar != null) {
                tusVar.b(null);
                tus tusVar2 = aefvVar.d;
                tusVar2.b = null;
                tusVar2.a = null;
                aefvVar.d = null;
            }
            aefvVar.c = null;
            aefvVar.g = false;
            this.cg.f = Optional.empty();
            acmw acmwVar = this.o;
            ViewGroup viewGroup = acmwVar.d;
            if (viewGroup != null && (view = acmwVar.e) != null) {
                viewGroup.removeView(view);
            }
            acmwVar.a();
            acmwVar.d = null;
            acmwVar.e = null;
            ReelPlayerView reelPlayerView2 = this.ba;
            if (reelPlayerView2 != null) {
                reelPlayerView2.b = null;
            }
            View view2 = this.bb;
            if (view2 instanceof ViewGroup) {
                ((ViewGroup) view2).removeAllViews();
            }
        }
        if (this.ck.G()) {
            as();
            this.bb = null;
            this.bc = null;
            this.ba = null;
            this.bd = null;
            this.be = null;
            this.bf = null;
            this.cx = null;
            this.cy = null;
            this.cF = null;
            if (this.ck.aZ()) {
                ((acox) this.Y.io()).c(null);
            }
            this.aZ = null;
        }
        if (this.ck.aG()) {
        }
        super.onDestroyView();
        this.y.f("r_fd");
        tqj tqjVar = this.aA;
        int i5 = tqr.a;
        if (tqjVar.k(1073830961)) {
            this.y.d();
        }
    }

    @Override // defpackage.cc
    public final void onPause() {
        acqh acqhVar;
        if (this.ck.al() && this.bj) {
            this.z.h(true);
        }
        if (this.ck.K() && this.aU.getAndSet(false) && ((vxz) this.ck.i).l(281, 45822691L, false)) {
            this.F.aq(false, 1);
        }
        acqz acqzVar = this.t;
        if (acqzVar != null) {
            acqzVar.t();
            acqz acqzVar2 = this.t;
            if (acqzVar2.at.av() && (acqhVar = acqzVar2.ag) != null) {
                acqhVar.S(new aasz(acqzVar2, 16));
            }
        }
        if (this.ck.l()) {
            ((acpv) this.aI.io()).a();
        }
        ap();
        if (this.D.e()) {
            this.D.d();
        }
        vob vobVarD = ((vor) this.ah.io()).d();
        boolean z = ((vor) this.ah.io()).I() && vobVarD != null && vobVarD.K();
        if (this.ah != null && ((this.ck.aN() || this.ck.aK()) && !this.ck.aM() && z)) {
            ((vor) this.ah.io()).u(false);
            aj();
            ai();
            ak();
        }
        if (!this.ca.l(11, 45621798L, false) || !this.bK) {
            ax();
        }
        this.P.q(abdi.g);
        super.onPause();
        if (this.ck.aw()) {
            acno acnoVar = this.aw;
            if (awrc.c(acnoVar.a, this)) {
                acnoVar.a = null;
            }
        }
        this.bh = true;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x061b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0648  */
    /* JADX WARN: Code duplicated, block: B:231:0x0660  */
    /* JADX WARN: Code duplicated, block: B:233:0x0671  */
    /* JADX WARN: Code duplicated, block: B:235:0x0683  */
    /* JADX WARN: Code duplicated, block: B:238:0x069b  */
    /* JADX WARN: Code duplicated, block: B:241:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:243:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:244:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:281:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:283:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:289:0x0827  */
    /* JADX WARN: Code duplicated, block: B:291:0x084c  */
    /* JADX WARN: Code duplicated, block: B:292:0x084f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0958  */
    /* JADX WARN: Code duplicated, block: B:62:0x0267  */
    /* JADX WARN: Instruction removed from duplicated block: B:241:0x06c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:289:0x0827, please report this as an issue */
    @Override // defpackage.cc
    public void onResume() {
        Bundle bundle;
        ajwo ajwoVar;
        int iAV;
        int iAV2;
        int iAV3;
        boolean z;
        abnl abnlVar;
        Optional optionalK;
        vre vreVar;
        int i2;
        int iA;
        long j;
        int i3;
        abnl abnlVar2;
        Optional optionalL;
        vre vreVar2;
        Optional optionalL2;
        vre vreVar3;
        int i4;
        int iA2;
        yco ycoVar;
        int i5 = 11;
        if (this.ca.l(11, 45621798L, false)) {
            J();
        }
        this.p.c = hw();
        this.p.a();
        this.y.f("r_fr");
        super.onResume();
        if (this.ck.aw()) {
            this.aw.a = this;
        }
        if (((vxz) this.aE.io()).l(164, 45673420L, false) && (ycoVar = ((ycp) this.aD.io()).e) != null) {
            ycoVar.q(amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER_PLAY_ON_PHONE, Optional.empty());
        }
        ReelPlayerView reelPlayerView = this.ba;
        if (reelPlayerView != null) {
            reelPlayerView.requestLayout();
        }
        this.y.f("r_fcp");
        this.J.f(this.aK);
        acoz acozVar = this.aZ;
        if (acozVar != null) {
            this.J.f(acozVar.b.v);
        }
        this.J.f(this.y);
        X();
        this.G.b();
        this.v.e();
        this.t.x();
        this.u.z(this);
        this.y.f("r_ipl");
        int i6 = 16;
        int i7 = 19;
        int i8 = 8;
        int i9 = 17;
        if (isResumed()) {
            ReelPlayerView reelPlayerView2 = this.ba;
            if (reelPlayerView2 != null) {
                abvk abvkVar = this.F;
                taq.d();
                abvh abvhVar = abvkVar.k;
                if (abvhVar != null) {
                    abvhVar.b = false;
                }
                this.F.G(true);
                abvk abvkVar2 = this.F;
                abui abuiVar = new abui();
                abuiVar.d(true);
                abuiVar.e(reelPlayerView2.f);
                abvkVar2.ai(abuiVar.c(), c());
                if (this.ck.Y()) {
                    acmo acmoVar = (acmo) this.s.io();
                    acmoVar.c = reelPlayerView2;
                    xsc xscVar = acmoVar.d;
                    Object obj = xscVar.b;
                    aazu aazuVar = (aazu) obj;
                    zki zkiVar = aazuVar.a.d;
                    if (zkiVar instanceof zkt) {
                        aazuVar.g = xscVar;
                        avmm avmmVar = aazuVar.e;
                        avmmVar.b();
                        avmmVar.c(aazuVar.b.Q().H(new mkc(obj, zkiVar, xscVar, 8, null)).p().al(new zgd(obj, i7), new xuk(i8)));
                    }
                    avmm avmmVar2 = acmoVar.b;
                    avmmVar2.b();
                    avmmVar2.c(((avlh) xscVar.a).p().ak(new acjp(new hho(acmoVar, 17, (boolean[][][]) null), 10)));
                    avmmVar2.c(acmoVar.a.al.B(new wsh(new achf(i8), 18)).af(new acjp(new acjn(acmoVar, 12), i5)));
                }
                if (!this.ck.I()) {
                    this.F.M(1.0f);
                }
                abnl abnlVar3 = this.cC;
                if (abnlVar3 != null) {
                    ajwo ajwoVar2 = abnlVar3.b;
                    Optional optionalOfNullable = Optional.ofNullable(getArguments());
                    if (true == optionalOfNullable.isPresent() && true != ((Bundle) optionalOfNullable.get()).containsKey(acmc.a)) {
                        optionalOfNullable = Optional.empty();
                    }
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(vxg.b(((Bundle) optionalOfNullable.get()).getByteArray(acmc.a)));
                    }
                    ajwo ajwoVar3 = (ajwo) optionalOfNullable.orElse(ajwoVar2);
                    xhu xhuVar = this.af;
                    if (ajwoVar3 != null) {
                        aihl aihlVar = aoaq.b;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        ajwoVar3.c(aihlVarCheckIsLite);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            ajwoVar3.c(aihlVarCheckIsLite2);
                            Object objK = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
                            aoar aoarVar = (aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                            if ((aoarVar.b & 1) != 0) {
                                bundle = new Bundle();
                                bundle.putString("tracking_interaction_parent_csn", aoarVar.c);
                                int i10 = aoarVar.d;
                                if (i10 > 0) {
                                    bundle.putInt("tracking_interaction_parent_ve", i10);
                                }
                                if ((ajwoVar3.b & 1) != 0) {
                                    bundle.putByteArray("tracking_interaction_click_tracking_params", ajwoVar3.c.G());
                                }
                            } else {
                                bundle = null;
                            }
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    xhuVar.a = bundle;
                    abnl abnlVar4 = this.cC;
                    aoar aoarVarO = acfz.O(ajwoVar3);
                    int i11 = aoarVarO == null ? -1 : aoarVarO.d;
                    ajwo ajwoVar4 = abnlVar4.b;
                    if (ajwoVar4 != null) {
                        aihf aihfVarP = acfz.P(ajwoVar4);
                        aihfVarP.copyOnWrite();
                        aoar aoarVar2 = (aoar) aihfVarP.instance;
                        aoar aoarVar3 = aoar.a;
                        aoarVar2.b |= 2;
                        aoarVar2.d = i11;
                        abnk abnkVarF = abnlVar4.f();
                        aihh aihhVar = (aihh) ajwoVar4.toBuilder();
                        aihhVar.e(aoaq.b, (aoar) aihfVarP.build());
                        abnkVarF.a = (ajwo) aihhVar.build();
                        abnkVarF.c = abnlVar4.I();
                        abnkVarF.b = abnlVar4.H();
                        abnl abnlVarA = abnkVarF.a();
                        abnlVarA.z(abnlVar4);
                        abnlVar4 = abnlVarA;
                    }
                    this.cC = abnlVar4;
                    if (!TextUtils.isEmpty(this.cA)) {
                        abnl abnlVar5 = this.cC;
                        String str = this.cA;
                        ajwo ajwoVar5 = abnlVar5.b;
                        if (ajwoVar5 != null) {
                            aihf aihfVarP2 = acfz.P(ajwoVar5);
                            aihfVarP2.copyOnWrite();
                            aoar aoarVar4 = (aoar) aihfVarP2.instance;
                            aoar aoarVar5 = aoar.a;
                            str.getClass();
                            aoarVar4.b |= 32;
                            aoarVar4.f = str;
                            abnk abnkVarF2 = abnlVar5.f();
                            aihh aihhVar2 = (aihh) ajwoVar5.toBuilder();
                            aihhVar2.e(aoaq.b, (aoar) aihfVarP2.build());
                            abnkVarF2.a = (ajwo) aihhVar2.build();
                            abnkVarF2.c = abnlVar5.I();
                            abnkVarF2.b = abnlVar5.H();
                            abnl abnlVarA2 = abnkVarF2.a();
                            abnlVarA2.z(abnlVar5);
                            abnlVar5 = abnlVarA2;
                        }
                        this.cC = abnlVar5;
                    }
                    abnl abnlVar6 = this.cC;
                    this.bA = abnlVar6.b;
                    if (abnlVar6 != null) {
                        boolean zAk = this.ck.ak();
                        actm actmVar = this.y;
                        if (zAk) {
                            String strAd = ajwoVar2 != null ? aecm.ad(ajwoVar2) : null;
                            abnl abnlVar7 = this.cC;
                            abnlVar7.getClass();
                            actmVar.i(strAd, abnlVar7.w());
                        } else {
                            abnl abnlVar8 = this.cC;
                            abnlVar8.getClass();
                            actmVar.h(abnlVar8.w());
                        }
                    }
                    if (this.t.Q() || aecm.au(this.cC)) {
                        Bundle bundle2 = this.cz;
                        if (bundle2 != null) {
                            acrn acrnVar = this.t.b;
                            acrnVar.n = bundle2.getBoolean("ReelSequenceController.IS_INITIALIZED_KEY");
                            acrnVar.h = (acrk) bundle2.getParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY");
                            acrnVar.i = (acrk) bundle2.getParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY");
                            acrnVar.j = (acrk) bundle2.getParcelable("ReelSequenceController.PENDING_REFRESH_CONTINUATION_KEY");
                            acrnVar.k = (acrk) bundle2.getParcelable("ReelSequenceController.PENDING_SOFT_REFRESH_CONTINUATION_KEY");
                            acrnVar.m = bundle2.getBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY");
                            Optional optionalOfNullable2 = Optional.ofNullable(bundle2.getByteArray("ReelSequenceController.LATEST_TRACKING_PARAMS_KEY"));
                            if (true == optionalOfNullable2.isPresent()) {
                                optionalOfNullable2 = Optional.ofNullable(aigj.v((byte[]) optionalOfNullable2.get()));
                            }
                            acrnVar.l = optionalOfNullable2;
                        } else {
                            abnl abnlVar9 = this.cC;
                            if (abnlVar9 != null && (ajwoVar = abnlVar9.b) != null) {
                                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                                ajwoVar.c(aihlVarCheckIsLite3);
                                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                                    ajwoVar.c(aihlVarCheckIsLite4);
                                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                                    apfp apfpVar = (apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                                    if ((apfpVar.c & 65536) != 0 && !apfpVar.z.isEmpty()) {
                                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apfp.b);
                                        ajwoVar.c(aihlVarCheckIsLite5);
                                        Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                                        Object objC = objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3);
                                        acrn acrnVar2 = this.t.b;
                                        String str2 = ((apfp) objC).z;
                                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apfp.b);
                                        ajwoVar.c(aihlVarCheckIsLite6);
                                        if (ajwoVar.j.n(aihlVarCheckIsLite6.d) && !str2.isEmpty()) {
                                            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apfp.b);
                                            ajwoVar.c(aihlVarCheckIsLite7);
                                            Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
                                            apfp apfpVar2 = (apfp) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4));
                                            if (!acrnVar2.n && (((iAV = a.aV(apfpVar2.y)) != 0 && iAV == 3) || !acrnVar2.b.ak)) {
                                                acrnVar2.n = true;
                                                acrnVar2.l(acrnVar2.i, apfpVar2.o, str2, null, Optional.of(ajwoVar.c), acrt.SHEDDABLE, false, true);
                                                if (acrnVar2.k() && (iAV2 = a.aV(apfpVar2.n)) != 0 && iAV2 == 2) {
                                                    acrnVar2.i.f = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.ck.aE()) {
                        abnl abnlVar10 = this.cC;
                        int i12 = actk.b;
                        apfp apfpVarZ = aecm.Z(abnlVar10);
                        if (apfpVarZ != null && (iAV3 = a.aV(apfpVarZ.y)) != 0 && iAV3 == 4) {
                            acrn acrnVar3 = this.t.b;
                            apfp apfpVarZ2 = aecm.Z(this.cC);
                            Executor executor = ((vxz) acrnVar3.r.o).m(132, 45628696L) ? acrnVar3.e : acrnVar3.d;
                            actk actkVar = acrnVar3.f;
                            String str3 = apfpVarZ2.q;
                            String str4 = apfpVarZ2.o;
                            taf.i(ahng.n((alql) alql.a.createBuilder().build()), executor, new wuy(acrnVar3, i6), new yqj(acrnVar3, 15), null);
                        }
                    }
                }
            }
        } else {
            zvp.h(zvn.b, zvm.y, "ReelWatchFragment.initiatePlayback failed because the fragment is not resumed.", 0.01d);
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "initializePlayer", 3347, "ReelWatchFragmentImpl.java")).w("%s", "ReelWatchFragment.initiatePlayback failed because the fragment is not resumed.");
            this.w.g(this.bs, 5, "ReelWatchFragment.initiatePlayback failed because the fragment is not resumed.");
        }
        if (this.bu == Long.MIN_VALUE) {
            if (this.ck.T()) {
                int i13 = this.bo;
                if (i13 != -1) {
                    this.bo = -1;
                    iA = i13;
                } else {
                    long j2 = this.bn;
                    if (j2 != Long.MIN_VALUE) {
                        iA = this.t.a(j2);
                        this.bn = Long.MIN_VALUE;
                    } else {
                        iA = -1;
                    }
                }
                if (iA != -1) {
                    this.bu = this.t.d(iA);
                    this.t.A(iA, this.cC);
                } else {
                    abnl abnlVar11 = this.cC;
                    if (abnlVar11 != null) {
                        acqz acqzVar = this.t;
                        String strW = abnlVar11.w();
                        String strU = this.cC.u();
                        if (strW == null) {
                            strW = "";
                        }
                        if (strU == null) {
                            strU = "";
                        }
                        Optional optionalOf = Optional.of(strU);
                        acqh acqhVar = acqzVar.ag;
                        if (acqhVar != null) {
                            synchronized (acqhVar.e) {
                                i3 = 0;
                                while (true) {
                                    if (i3 < acqhVar.f.size()) {
                                        acra acraVar = (acra) acqhVar.f.get(i3);
                                        if (acraVar != null && acraVar.m()) {
                                            apfp apfpVarC = acraVar.c();
                                            j = 0;
                                            if (!strW.equals(apfpVarC.o) || (!optionalOf.isEmpty() && !((String) optionalOf.get()).equals(apfpVarC.p))) {
                                                if (acraVar.l()) {
                                                    Iterator it = acraVar.o.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            apfp apfpVarC2 = ((acra) it.next()).c();
                                                            if (!strW.equals(apfpVarC2.o) || (!optionalOf.isEmpty() && !((String) optionalOf.get()).equals(apfpVarC2.p))) {
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        i3++;
                                    } else {
                                        j = 0;
                                    }
                                }
                            }
                            if (i3 != -1) {
                                this.bu = this.t.d(i3);
                                if (this.ck.aL() && (abnlVar2 = this.cC) != null && abnlVar2.c() > j) {
                                    optionalL = this.t.l(i3);
                                    vreVar2 = new vre(this, i9);
                                    if (true == optionalL.isPresent()) {
                                        optionalL = Optional.ofNullable(((acoi) vreVar2.a).y((acra) optionalL.get()));
                                    }
                                    if (optionalL.isPresent()) {
                                        ((acra) optionalL.get()).n = true;
                                    }
                                }
                                this.t.A(i3, this.cC);
                            } else {
                                optionalL2 = this.t.l(0);
                                vreVar3 = new vre(this, i9);
                                if (true == optionalL2.isPresent()) {
                                    optionalL2 = Optional.ofNullable(((acoi) vreVar3.a).y((acra) optionalL2.get()));
                                }
                                if (optionalL2.isPresent()) {
                                    this.y.f("r_fips");
                                    String str5 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                                    if (this.cC == null) {
                                        i4 = 14;
                                    } else {
                                        i4 = 6;
                                    }
                                    this.w.g(this.bs, i4, str5);
                                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPageWithAdapterPosition", 2770, "ReelWatchFragmentImpl.java")).w("%s", str5);
                                } else {
                                    this.y.f("r_fips");
                                    String str6 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                                    if (this.cC == null) {
                                        i4 = 14;
                                    } else {
                                        i4 = 6;
                                    }
                                    this.w.g(this.bs, i4, str6);
                                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPageWithAdapterPosition", 2770, "ReelWatchFragmentImpl.java")).w("%s", str6);
                                }
                            }
                        } else {
                            j = 0;
                        }
                        i3 = -1;
                        if (i3 != -1) {
                            this.bu = this.t.d(i3);
                            if (this.ck.aL()) {
                                optionalL = this.t.l(i3);
                                vreVar2 = new vre(this, i9);
                                if (true == optionalL.isPresent()) {
                                    optionalL = Optional.ofNullable(((acoi) vreVar2.a).y((acra) optionalL.get()));
                                }
                                if (optionalL.isPresent()) {
                                    ((acra) optionalL.get()).n = true;
                                }
                            }
                            this.t.A(i3, this.cC);
                        } else {
                            optionalL2 = this.t.l(0);
                            vreVar3 = new vre(this, i9);
                            if (true == optionalL2.isPresent()) {
                                optionalL2 = Optional.ofNullable(((acoi) vreVar3.a).y((acra) optionalL2.get()));
                            }
                            if (optionalL2.isPresent()) {
                                this.y.f("r_fips");
                                String str7 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                                if (this.cC == null) {
                                    i4 = 14;
                                } else {
                                    i4 = 6;
                                }
                                this.w.g(this.bs, i4, str7);
                                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPageWithAdapterPosition", 2770, "ReelWatchFragmentImpl.java")).w("%s", str7);
                            } else {
                                this.y.f("r_fips");
                                String str8 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                                if (this.cC == null) {
                                    i4 = 14;
                                } else {
                                    i4 = 6;
                                }
                                this.w.g(this.bs, i4, str8);
                                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPageWithAdapterPosition", 2770, "ReelWatchFragmentImpl.java")).w("%s", str8);
                            }
                        }
                    } else if (this.bu == Long.MIN_VALUE || ((this.ck.aZ() && this.F.X()) || (iA2 = this.t.a(this.bu)) == -1)) {
                        optionalL2 = this.t.l(0);
                        vreVar3 = new vre(this, i9);
                        if (true == optionalL2.isPresent()) {
                            optionalL2 = Optional.ofNullable(((acoi) vreVar3.a).y((acra) optionalL2.get()));
                        }
                        if (optionalL2.isPresent() || ((acra) optionalL2.get()).b == Long.MIN_VALUE) {
                            this.y.f("r_fips");
                            String str9 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                            if (this.cC == null) {
                                i4 = 14;
                            } else {
                                i4 = 6;
                            }
                            this.w.g(this.bs, i4, str9);
                            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPageWithAdapterPosition", 2770, "ReelWatchFragmentImpl.java")).w("%s", str9);
                        } else {
                            this.bu = ((acra) optionalL2.get()).b;
                            this.bA = ((acra) optionalL2.get()).f;
                            this.t.A(0, null);
                        }
                    } else {
                        this.t.A(iA2, this.cC);
                    }
                }
            } else {
                long j3 = this.bn;
                if (j3 != Long.MIN_VALUE) {
                    this.t.B(j3, this.cC);
                    this.bn = Long.MIN_VALUE;
                } else {
                    abnl abnlVar12 = this.cC;
                    if (abnlVar12 != null) {
                        acqz acqzVar2 = this.t;
                        String strW2 = abnlVar12.w();
                        String strU2 = this.cC.u();
                        if (strW2 == null) {
                            strW2 = "";
                        }
                        if (strU2 == null) {
                            strU2 = "";
                        }
                        Optional optionalOf2 = Optional.of(strU2);
                        Long[] lArr = {Long.MIN_VALUE};
                        acqh acqhVar2 = acqzVar2.ag;
                        if (acqhVar2 != null) {
                            acqhVar2.S(new gyr(lArr, strW2, optionalOf2, i7));
                        }
                        long jLongValue = lArr[0].longValue();
                        this.bu = jLongValue;
                        if (jLongValue != Long.MIN_VALUE) {
                            if (this.ck.aL() && (abnlVar = this.cC) != null && abnlVar.c() > 0) {
                                Optional optionalK2 = this.t.k(this.bu);
                                vre vreVar4 = new vre(this, i9);
                                if (true == optionalK2.isPresent()) {
                                    optionalK2 = Optional.ofNullable(((acoi) vreVar4.a).y((acra) optionalK2.get()));
                                }
                                if (optionalK2.isPresent()) {
                                    ((acra) optionalK2.get()).n = true;
                                }
                            }
                            this.t.B(this.bu, this.cC);
                        } else {
                            optionalK = this.t.k(0L);
                            vreVar = new vre(this, i9);
                            if (true == optionalK.isPresent()) {
                                optionalK = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK.get()));
                            }
                            if (optionalK.isPresent()) {
                                this.y.f("r_fips");
                                String str10 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                                if (this.cC == null) {
                                    i2 = 14;
                                } else {
                                    i2 = 6;
                                }
                                this.w.g(this.bs, i2, str10);
                                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPage", 2849, "ReelWatchFragmentImpl.java")).w("%s", str10);
                            } else {
                                this.y.f("r_fips");
                                String str11 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                                if (this.cC == null) {
                                    i2 = 14;
                                } else {
                                    i2 = 6;
                                }
                                this.w.g(this.bs, i2, str11);
                                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPage", 2849, "ReelWatchFragmentImpl.java")).w("%s", str11);
                            }
                        }
                    } else if (this.bu == Long.MIN_VALUE || (this.ck.aZ() && this.F.X())) {
                        optionalK = this.t.k(0L);
                        vreVar = new vre(this, i9);
                        if (true == optionalK.isPresent()) {
                            optionalK = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK.get()));
                        }
                        if (optionalK.isPresent() || ((acra) optionalK.get()).b == Long.MIN_VALUE) {
                            this.y.f("r_fips");
                            String str12 = "ReelWatchFragment.selectInitialPageControllerPage failed to select initial page. restoredPagePosition=" + this.bn + ", reelPagePosition=" + this.bu;
                            if (this.cC == null) {
                                i2 = 14;
                            } else {
                                i2 = 6;
                            }
                            this.w.g(this.bs, i2, str12);
                            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchFragmentImpl", "selectInitialPageControllerPage", 2849, "ReelWatchFragmentImpl.java")).w("%s", str12);
                        } else {
                            this.bu = ((acra) optionalK.get()).b;
                            this.bA = ((acra) optionalK.get()).f;
                            this.t.B(this.bu, null);
                        }
                    } else {
                        this.t.B(this.bu, this.cC);
                    }
                }
            }
        }
        ap();
        Optional optionalI = this.t.i();
        if (optionalI.isPresent()) {
            ajwo ajwoVar6 = ((acra) optionalI.get()).f;
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(apfp.b);
            ajwoVar6.c(aihlVarCheckIsLite8);
            Object objK5 = ajwoVar6.j.k(aihlVarCheckIsLite8.d);
            if (aecm.av((apfp) (objK5 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK5)))) {
                alqc alqcVar = (alqc) this.bm.orElse(null);
                ajwo ajwoVar7 = (ajwo) this.bC.orElse(null);
                if (alqcVar == null || ajwoVar7 == null) {
                    this.v.d(Optional.of(this.t), ((acra) optionalI.get()).f, this.bs);
                } else {
                    L(ajwoVar7, alqcVar, true);
                }
            }
        }
        boolean z2 = this.n.f;
        if (e()) {
            if (this.ck.D() || !this.ck.K() || !this.aU.getAndSet(false)) {
                Runnable runnableI = afwl.i(new abyz(this, 16));
                long jC = ((vxz) this.ck.j).c(55, 45771927L, 0L);
                if (jC > 0) {
                    trd trdVar = this.S.h;
                    int iA3 = trdVar.a(260);
                    if (trd.m(trdVar.a(264)) && !trdVar.l() && (iA3 == 6 || iA3 == 7 || iA3 == 8)) {
                        this.T = true;
                        this.z.g(true);
                        acnp acnpVar = new acnp(this, runnableI, 0);
                        this.V = acnpVar;
                        this.Q.postDelayed(acnpVar, jC);
                    } else {
                        runnableI.run();
                    }
                } else {
                    runnableI.run();
                }
            }
            this.cC = null;
        }
        if (this.cz == null) {
            z = false;
            if (this.f.compareAndSet(false, true)) {
                this.an.c();
            }
        } else {
            z = false;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.cy;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.k(z);
        }
        this.bh = z;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        acmd acmdVar;
        int iMax = 0;
        if (!((vxz) this.ck.m).l(13, 45664026L, false) || this.bg) {
            acqq acqqVarE = this.t.e();
            if (this.t.Q()) {
                agke agkeVar = agpi.a;
                acmdVar = new acmd(agkeVar, agkeVar);
            } else {
                acmdVar = new acmd(acqqVarE.a, this.t.m());
            }
            bundle.putParcelable("ReelToReelListBundleKey", acmdVar);
            String str = g;
            acrn acrnVar = this.t.b;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", acrnVar.n);
            bundle2.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", acrnVar.h);
            bundle2.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", acrnVar.i);
            bundle2.putParcelable("ReelSequenceController.PENDING_REFRESH_CONTINUATION_KEY", acrnVar.j);
            bundle2.putParcelable("ReelSequenceController.PENDING_SOFT_REFRESH_CONTINUATION_KEY", acrnVar.k);
            bundle2.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", acrnVar.m);
            Optional optional = acrnVar.l;
            acrj acrjVar = new acrj(bundle2, iMax);
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                ((Bundle) acrjVar.a).putByteArray("ReelSequenceController.LATEST_TRACKING_PARAMS_KEY", ((aigj) obj).G());
            }
            bundle.putBundle(str, bundle2);
            bundle.putBoolean("UseRpcSequenceKey", this.t.Q());
            apfu apfuVar = this.br;
            if (apfuVar != null) {
                bundle.putByteArray("ReelWatchExperienceConfigKey", apfuVar.toByteArray());
            }
            xgn xgnVarHB = this.O.hB();
            if (xgnVarHB != null) {
                bundle.putString(h, xgnVarHB.i());
            }
            bundle.putBundle(i, Bundle.EMPTY);
            if (this.ck.aG()) {
                bundle.getClass();
            }
            Optional optionalI = this.t.i();
            if (optionalI.isPresent()) {
                if ((((acra) optionalI.get()).k() || ((acra) optionalI.get()).j()) && this.cc.m(3, 45368551L)) {
                    if (!this.ck.T()) {
                        bundle.putLong("PagePositionKey", ((acra) optionalI.get()).q);
                        return;
                    }
                    acqz acqzVar = this.t;
                    if (acqzVar.Q()) {
                        hno hnoVar = acqzVar.at;
                        if (hnoVar.Q()) {
                            iMax = Math.max(0, acqzVar.Q - hnoVar.d());
                        }
                    }
                    bundle.putInt("AdapterPositionKey", acqzVar.Q - iMax);
                }
            }
        }
    }

    @Override // defpackage.cc
    public final void onStart() {
        this.y.f("r_fs");
        this.bZ.c(aeqp.SHORTS_FRAGMENT);
        this.at.u(this.bY, this.k);
        int i2 = 0;
        if (((vxz) this.ck.i).l(266, 45807297L, false)) {
            zwa zwaVarHw = hw();
            zwa zwaVar = this.bk;
            if (zwaVar == null || !zwaVar.equals(zwaVarHw)) {
                this.aM.b();
                this.bl = false;
                this.bk = zwaVarHw;
                taf.k(this, ((syn) this.N.io()).n(zwaVarHw), new acnq(this, zwaVarHw, i2), new acnq(this, zwaVarHw, 2));
            }
        } else {
            this.bl = true;
        }
        super.onStart();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    @Override // defpackage.cc
    public void onStop() {
        boolean z;
        acrp acrpVarZ;
        this.p.c = hw();
        this.p.a();
        boolean z2 = true;
        if (this.cb.l(282, 45728204L, false)) {
            aihf aihfVarCreateBuilder = rrg.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            rrg rrgVar = (rrg) aihfVarCreateBuilder.instance;
            rrgVar.c = 3;
            rrgVar.b |= 1;
            if (this.bX.a((rrg) aihfVarCreateBuilder.build()) == aiwh.ANIMATION_DECISION_OFF) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.cb.l(242, 45710437L, false) && !z && (acrpVarZ = z()) != null) {
            Optional optionalJ = acrpVarZ.J();
            if (true == optionalJ.isPresent()) {
                ((acph) optionalJ.get()).f();
            }
            ReelPlayerView reelPlayerView = this.ba;
            if (reelPlayerView != null) {
                reelPlayerView.setVisibility(4);
            }
        }
        this.D.b();
        if (this.ca.l(11, 45621798L, false) && this.aL.a() != 0) {
            ax();
        }
        absg absgVar = this.at;
        absgVar.i = null;
        absgVar.g = null;
        absgVar.d = new awlo();
        Object obj = absgVar.h;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            absgVar.h = null;
        }
        this.F.ap(false, 19);
        if (!this.cb.l(214, 45692313L, false)) {
            cf activity = getActivity();
            if (activity != null && !activity.isFinishing()) {
                z2 = false;
            }
            this.F.y(z2);
        }
        this.bZ.e(aeqp.SHORTS_FRAGMENT);
        if (!this.ck.aw()) {
            this.av.a = false;
        }
        super.onStop();
    }

    @Override // defpackage.acnn
    public final void p(int i2, Optional optional, boolean z) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.ck.Z() && optional.isPresent() && optional.get() == aped.REEL_NAVIGATION_REASON_PLAYBACK_ENDED) {
                this.bT.c(z);
                return;
            } else {
                this.bT.a(z);
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 4) {
                av(optional);
                O();
                return;
            }
            return;
        }
        if (this.ck.Z() && optional.isPresent() && optional.get() == aped.REEL_NAVIGATION_REASON_PLAYBACK_ENDED) {
            this.bT.d(new acqy(2, z));
        } else {
            this.bT.b();
        }
    }

    @Override // defpackage.acvf
    public final int q() {
        return this.n.a();
    }

    @Override // defpackage.acvf
    public final Size r() {
        if (!this.ck.aC()) {
            return this.bc == null ? new Size(0, 0) : new Size(this.bc.getMeasuredWidth(), this.bc.getMeasuredHeight());
        }
        acni acniVar = this.n;
        return new Size(this.bL.getWidth(), Math.max((this.bL.getHeight() - acniVar.c) + acniVar.a(), 0));
    }

    @Override // defpackage.acvf
    public final View s() {
        return getView();
    }

    public final xgn t() {
        Optional optionalOf;
        if (ag()) {
            acqz acqzVar = this.t;
            if (acqzVar == null) {
                optionalOf = Optional.empty();
            } else {
                Optional optionalI = acqzVar.i();
                optionalOf = optionalI.isPresent() ? Optional.of(((acra) optionalI.get()).e()) : Optional.empty();
            }
            if (optionalOf.isPresent()) {
                return b((String) optionalOf.get());
            }
        }
        return this.O.hB();
    }

    public final xgn u(ajwo ajwoVar) {
        return ag() ? b(aecm.ad(ajwoVar)) : t();
    }

    public final abnl v(acol acolVar, Bundle bundle) {
        ajwo ajwoVar;
        abnl abnlVar = acolVar != null ? acolVar.c : null;
        if (abnlVar == null) {
            abnlVar = (abnl) bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor");
        }
        if (abnlVar != null && (ajwoVar = abnlVar.b) != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                apfu apfuVar = apfpVar.R;
                if (apfuVar == null) {
                    apfuVar = apfu.a;
                }
                boolean z = true;
                boolean z2 = apfuVar.l.size() > 0;
                boolean z3 = apfpVar.i == 44;
                if (z2) {
                    z = z3;
                } else if (z3) {
                }
                aihh aihhVar = (aihh) apfpVar.toBuilder();
                if (z2) {
                    if (!aecm.at(apfpVar)) {
                        apfu apfuVar2 = apfpVar.R;
                        if (apfuVar2 == null) {
                            apfuVar2 = apfu.a;
                        }
                        this.cD = apfuVar2.l;
                    }
                    apfu apfuVar3 = apfpVar.R;
                    if (apfuVar3 == null) {
                        apfuVar3 = apfu.a;
                    }
                    aihf builder = apfuVar3.toBuilder();
                    builder.copyOnWrite();
                    ((apfu) builder.instance).l = apfu.emptyProtobufList();
                    apfu apfuVar4 = (apfu) builder.build();
                    aihhVar.copyOnWrite();
                    apfp apfpVar2 = (apfp) aihhVar.instance;
                    apfuVar4.getClass();
                    apfpVar2.R = apfuVar4;
                    apfpVar2.d |= 32768;
                }
                if (z) {
                    this.cE = apfpVar.i == 44 ? (apfq) apfpVar.k : apfq.a;
                    aihhVar.copyOnWrite();
                    apfp apfpVar3 = (apfp) aihhVar.instance;
                    if (apfpVar3.i == 44) {
                        apfpVar3.i = 0;
                        apfpVar3.k = null;
                    }
                }
                aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
                aihhVar2.e(apfp.b, (apfp) aihhVar.build());
                ajwo ajwoVar2 = (ajwo) aihhVar2.build();
                abnlVar.b = ajwoVar2;
                jrk jrkVar = abnlVar.a;
                if (jrkVar != null) {
                    aihf builder2 = jrkVar.toBuilder();
                    aigj byteString = ajwoVar2.toByteString();
                    builder2.copyOnWrite();
                    jrk jrkVar2 = (jrk) builder2.instance;
                    jrkVar2.b |= 8388608;
                    jrkVar2.y = byteString;
                    abnlVar.a = (jrk) builder2.build();
                }
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", abnlVar);
            }
        }
        return abnlVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    public final acmi w(alqc alqcVar) {
        akrn akrnVar;
        akrn akrnVar2;
        aqpq aqpqVar;
        akrn akrnVar3;
        agke agkeVarG;
        apev apevVar = null;
        if ((alqcVar.b & SemanticState.Multiline) != 0 || !alqcVar.A.isEmpty()) {
            if ((alqcVar.b & SemanticState.Multiline) == 0) {
                akrnVar = null;
            } else {
                apji apjiVar = alqcVar.m;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = alqcVar.m;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                    this.bi = false;
                    Z(true);
                    akrnVar = (akrn) objC;
                } else {
                    akrnVar = null;
                }
            }
            if (alqcVar.A.isEmpty()) {
                akrnVar2 = null;
                aqpqVar = null;
            } else {
                apji apjiVar3 = (apji) alqcVar.A.get(0);
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apdl.a);
                apjiVar3.c(aihlVarCheckIsLite3);
                if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apdl.a);
                    apjiVar3.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite4.d);
                    apdk apdkVar = (apdk) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    apji apjiVar4 = apdkVar.c;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akrs.a);
                    apjiVar4.c(aihlVarCheckIsLite5);
                    if (apjiVar4.j.n(aihlVarCheckIsLite5.d)) {
                        apji apjiVar5 = apdkVar.c;
                        if (apjiVar5 == null) {
                            apjiVar5 = apji.a;
                        }
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(akrs.a);
                        apjiVar5.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar5.j.k(aihlVarCheckIsLite6.d);
                        akrnVar3 = (akrn) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                    } else {
                        akrnVar3 = null;
                    }
                    if ((apdkVar.b & 2) != 0) {
                        aqpq aqpqVar2 = apdkVar.d;
                        if (aqpqVar2 == null) {
                            aqpqVar2 = aqpq.a;
                        }
                        aqpqVar = aqpqVar2;
                    } else {
                        aqpqVar = null;
                    }
                    akrnVar2 = akrnVar3;
                } else {
                    akrnVar2 = null;
                    aqpqVar = null;
                }
            }
            if (!this.ck.u() || akrnVar != null || akrnVar2 != null) {
                return acmi.c(az(alqcVar), false, akrnVar, akrnVar2, aqpqVar, F());
            }
        }
        Optional optionalI = this.t.i();
        if (true == optionalI.isPresent()) {
            optionalI = Optional.ofNullable(((acra) optionalI.get()).f);
        }
        if (true == optionalI.isPresent()) {
            optionalI = Optional.ofNullable(Boolean.valueOf(aecm.aw((ajwo) optionalI.get())));
        }
        boolean zBooleanValue = ((Boolean) optionalI.orElse(Boolean.FALSE)).booleanValue();
        boolean zAz = az(alqcVar);
        apez apezVar = alqcVar.d;
        if (apezVar == null) {
            apezVar = apez.a;
        }
        int i2 = apezVar.b;
        int iBp = acfz.bp(i2);
        if (iBp == 0) {
            throw null;
        }
        int i3 = iBp - 1;
        if (i3 == 0) {
            apey apeyVar = i2 == 139970731 ? (apey) apezVar.c : apey.a;
            if (apeyVar.n.size() > 0) {
                agkeVarG = aecm.R(apeyVar.n);
            } else {
                agjz agjzVar = new agjz(4);
                int i4 = apeyVar.c;
                ajnf ajnfVarS = aecm.S(i4 == 25, i4 == 25 ? (apji) apeyVar.d : apji.a);
                if (ajnfVarS == null) {
                    int i5 = apeyVar.c;
                    ajnfVarS = aecm.S(i5 == 32, i5 == 32 ? (apji) apeyVar.d : apji.a);
                }
                if (ajnfVarS != null) {
                    agjzVar.h(ajnfVarS);
                }
                agkeVarG = agjzVar.g();
            }
        } else if (i3 == 8) {
            agkeVarG = aecm.R((i2 == 1333 ? (apfv) apezVar.c : apfv.a).b);
        } else if (i3 == 10) {
            agkeVarG = aecm.R((i2 == 2070 ? (apfz) apezVar.c : apfz.a).b);
        } else if (i3 == 13) {
            agkeVarG = aecm.R((i2 == 37249 ? (apga) apezVar.c : apga.a).b);
        } else if (i3 == 2) {
            agkeVarG = aecm.R((i2 == 520708025 ? (aljq) apezVar.c : aljq.a).b);
        } else if (i3 == 3) {
            agkeVarG = aecm.R((i2 == 502632665 ? (apff) apezVar.c : apff.a).b);
        } else if (i3 != 4) {
            agkeVarG = agpi.a;
        } else {
            agkeVarG = aecm.R((i2 == 481628963 ? (aqcf) apezVar.c : aqcf.a).b);
        }
        apez apezVar2 = alqcVar.d;
        if (apezVar2 == null) {
            apezVar2 = apez.a;
        }
        int i6 = apezVar2.b;
        int iBp2 = acfz.bp(i6);
        int i7 = iBp2 - 1;
        if (iBp2 == 0) {
            throw null;
        }
        if (i7 == 0) {
            apey apeyVar2 = i6 == 139970731 ? (apey) apezVar2.c : apey.a;
            if (apeyVar2 != null) {
                apji apjiVar6 = apeyVar2.m;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVar = apfb.c;
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar);
                apjiVar6.c(aihlVarCheckIsLite7);
                if (apjiVar6.j.n(aihlVarCheckIsLite7.d)) {
                    apji apjiVar7 = apeyVar2.m;
                    if (apjiVar7 == null) {
                        apjiVar7 = apji.a;
                    }
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar);
                    apjiVar7.c(aihlVarCheckIsLite8);
                    Object objK4 = apjiVar7.j.k(aihlVarCheckIsLite8.d);
                    apevVar = (apev) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                }
            }
        } else if (i7 == 3) {
            apff apffVar = i6 == 502632665 ? (apff) apezVar2.c : apff.a;
            apji apjiVar8 = apffVar.c;
            if (apjiVar8 == null) {
                apjiVar8 = apji.a;
            }
            aihl aihlVar2 = apfb.c;
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar2);
            apjiVar8.c(aihlVarCheckIsLite9);
            if (apjiVar8.j.n(aihlVarCheckIsLite9.d)) {
                apji apjiVar9 = apffVar.c;
                if (apjiVar9 == null) {
                    apjiVar9 = apji.a;
                }
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar2);
                apjiVar9.c(aihlVarCheckIsLite10);
                Object objK5 = apjiVar9.j.k(aihlVarCheckIsLite10.d);
                apevVar = (apev) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5));
            }
        }
        acmi acmiVarB = acmi.b(zAz, agkeVarG, apevVar, zBooleanValue, F());
        this.bI = Optional.of(acmiVarB);
        return acmiVarB;
    }

    protected final acoz x() {
        abgr abgrVar = new abgr(getContext());
        acoz acozVar = new acoz(getContext(), abgrVar, this.ad.a(getContext(), abgrVar, this.H));
        abgrVar.a = acozVar;
        return acozVar;
    }

    public final acra y(acra acraVar) {
        acra acraVarA;
        return (!this.ck.aP() || acraVar == null || (acraVarA = acraVar.a()) == null) ? acraVar : acraVarA;
    }

    public final acrp z() {
        acqz acqzVar = this.t;
        if (acqzVar == null) {
            return null;
        }
        return acmo.b(acqzVar.i());
    }

    @Override // defpackage.acqt
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.acvf
    public final void an() {
    }

    @Override // defpackage.acmm, defpackage.cc
    public void onAttach(Context context) {
        this.cJ = Instant.now().toEpochMilli();
        super.onAttach(context);
    }
}
