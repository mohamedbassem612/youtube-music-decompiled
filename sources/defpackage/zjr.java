package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.Spatializer;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjr extends zhl {
    public static final /* synthetic */ int L = 0;
    private static final heg X = new heg(Boolean.FALSE);
    public final long A;
    public boolean B;
    public volatile boolean C;
    public final zrv D;
    public final zjw E;
    public Set F;
    public Set G;
    public agkj H;
    public final agfr I;
    public final agfr J;
    public final int K;
    private final ListenableFuture M;
    private String N;
    private String O;
    private volatile agkz P;
    private final Set Q;
    private String R;
    private Boolean S;
    private final agfr T;
    private final agfr U;
    private final agfr V;
    private final vxz W;
    public final Context q;
    public final Resources r;
    public final tpq s;
    public final Optional t;
    public final zkd u;
    public final tqj v;
    public String w;
    public final String x;
    public final boolean y;
    public boolean z;

    public zjr(Context context, tpq tpqVar, Optional optional, tfq tfqVar, vyo vyoVar, vxu vxuVar, zkd zkdVar, isi isiVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, vxz vxzVar6, vxz vxzVar7, tre treVar, vxz vxzVar8, vxz vxzVar9, vxz vxzVar10, vxz vxzVar11, vxz vxzVar12, tqj tqjVar) {
        int i;
        super(vyoVar, vxuVar, vxzVar, vxzVar2, vxzVar3, vxzVar4, vxzVar5, vxzVar6, vxzVar7, tfqVar, vxzVar8, vxzVar9, vxzVar10, vxzVar11);
        int length = Build.SUPPORTED_32_BIT_ABIS.length;
        int length2 = Build.SUPPORTED_64_BIT_ABIS.length;
        String str = Build.SUPPORTED_ABIS.length > 0 ? Build.SUPPORTED_ABIS[0] : "unknown";
        char c = length2 > 0 ? '1' : '0';
        this.x = "32." + (length <= 0 ? '0' : '1') + ".64." + c + '.' + str;
        if (Build.SUPPORTED_ABIS != null && Build.SUPPORTED_ABIS.length != 0 && Build.SUPPORTED_ABIS[0] != null) {
            switch (Build.SUPPORTED_ABIS[0]) {
                case "x86_64":
                    i = 5;
                    break;
                case "x86":
                    i = 4;
                    break;
                case "armeabi-v7a":
                    i = 2;
                    break;
                case "arm64-v8a":
                    i = 3;
                    break;
                default:
                    i = 1;
                    break;
            }
        } else {
            i = 0;
        }
        this.K = i;
        this.Q = Collections.newSetFromMap(new ConcurrentHashMap());
        this.C = true;
        this.R = null;
        this.E = new zjw();
        this.q = context;
        this.r = context.getResources();
        this.s = tpqVar;
        this.t = optional;
        this.u = zkdVar;
        ListenableFuture listenableFutureA = tpqVar.a();
        thc thcVar = new thc(this, 13);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i2 = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureA, thcVar);
        listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        this.M = ahcqVar;
        this.D = (zrv) isiVar.b;
        agpr agprVar = agpr.a;
        this.P = agprVar;
        this.y = txz.g(context);
        this.W = vxzVar12;
        this.v = tqjVar;
        this.B = this.i.l(398, 45784214L, false);
        X.a = Boolean.FALSE;
        trh trhVarC = treVar.h.c(0);
        if (trhVarC != null) {
            this.A = trhVarC.a;
        } else {
            this.A = 0L;
        }
        hmb hmbVar = new hmb(15);
        Executor executor = taf.a;
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        taa taaVar = new taa(taf.c, null, hmbVar);
        long j = afwl.a;
        ahcqVar.addListener(new ahei(ahcqVar, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor2);
        this.F = agprVar;
        this.G = agprVar;
        this.H = agpn.b;
        this.T = aguu.al(new yyp(this, 7));
        this.I = aguu.al(new yyp(this, 8));
        this.J = aguu.al(new yyp(this, 9));
        this.U = aguu.al(new yyp(this, 10));
        this.V = aguu.al(new yyp(this, 11));
    }

    public static String eV(String str, Set set, Set set2, agkj agkjVar, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(Build.VERSION.RELEASE);
        int i = 0;
        Set[] setArr = {set, set2, agkjVar.keySet()};
        HashSet hashSet = new HashSet();
        int i2 = 0;
        if (z) {
            int i3 = 0;
            while (i < 3) {
                Iterator it = setArr[i].iterator();
                while (it.hasNext()) {
                    int iHashCode = ((String) it.next()).hashCode() << i3;
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    if (!hashSet.contains(numValueOf)) {
                        i2 ^= iHashCode;
                        hashSet.add(numValueOf);
                    }
                }
                i3++;
                i++;
            }
        } else {
            while (i < 3) {
                Iterator it2 = setArr[i].iterator();
                while (it2.hasNext()) {
                    int iHashCode2 = ((String) it2.next()).hashCode();
                    Integer numValueOf2 = Integer.valueOf(iHashCode2);
                    if (!hashSet.contains(numValueOf2)) {
                        i2 ^= iHashCode2;
                        hashSet.add(numValueOf2);
                    }
                }
                i++;
            }
        }
        if (i2 != 0) {
            sb.append('_');
            sb.append(i2);
        }
        return sb.toString();
    }

    public static final boolean fI(Spatializer spatializer) {
        return a.aM() && spatializer.getImmersiveAudioLevel() == 1;
    }

    public static void fJ() {
        ((Boolean) X.a).booleanValue();
    }

    public static final boolean fK(Spatializer spatializer) {
        return a.aM() && spatializer.isEnabled() && spatializer.isAvailable();
    }

    private final void fL() {
        if (Build.VERSION.SDK_INT < 31) {
            this.O = Build.HARDWARE + ';' + tyr.a("ro.board.platform");
            this.N = tyr.a("ro.board.platform");
            return;
        }
        this.O = Build.SOC_MANUFACTURER + ';' + Build.SOC_MODEL;
        this.N = Build.SOC_MODEL;
    }

    private static final boolean fM(int i, Display display) {
        Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
        if (hdrCapabilities == null) {
            return false;
        }
        for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zhl
    public final void ai() {
        this.P = agkz.n(R().D);
    }

    @Override // defpackage.zhl
    public final boolean dF() {
        if (aB()) {
            return this.C && super.dF();
        }
        return super.dF();
    }

    public final int eO() {
        Iterator it = eZ().iterator();
        int i = 0;
        while (it.hasNext()) {
            int iOrdinal = ((zij) it.next()).ordinal();
            if (iOrdinal == 1) {
                i |= 3;
            } else if (iOrdinal == 2) {
                i |= 4;
            } else if (iOrdinal == 3) {
                i |= 8;
            }
        }
        return i;
    }

    public final int eP() {
        Display.HdrCapabilities hdrCapabilities;
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (windowManager == null || (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i2 == 2) {
                i |= 2;
            } else if (i2 == 3) {
                i |= 1;
            }
        }
        return i;
    }

    public final int eQ() {
        if (!this.u.m()) {
            arfb arfbVarA = arfb.a(((atpl) this.s.c()).i);
            if (arfbVarA == null) {
                arfbVarA = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            if (arfbVarA.equals(arfb.VIDEO_QUALITY_SETTING_DATA_SAVER)) {
                return 480;
            }
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final wit eR() {
        xwx xwxVar = new xwx(7);
        Optional optional = this.t;
        Enum enumValueOf = wit.a;
        if (!optional.isEmpty()) {
            try {
                enumValueOf = Enum.valueOf(wit.class, (String) xwxVar.apply((atpm) ((tpq) optional.get()).c()));
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
        }
        return (wit) enumValueOf;
    }

    public final ListenableFuture eS(boolean z) {
        return this.s.b(new zjq(z, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final atpk eT(String str, String str2, boolean z, Set set, Set set2, agkj agkjVar, int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Integer numAv;
        String strEV = eV(str, set, set2, agkjVar, eB());
        atpl atplVar = (atpl) this.s.c();
        if (aq() && DesugarCollections.unmodifiableMap(atplVar.v).containsKey(strEV)) {
            atpk atpkVar = atpk.a;
            atpk atpkVar2 = (atpk) atplVar.v.get(strEV);
            return atpkVar2 != null ? atpkVar2 : atpkVar;
        }
        try {
            clo cloVarAt = yno.at(this, str2, z, set, set2, agkjVar, i);
            aihf aihfVarCreateBuilder = atpk.a.createBuilder();
            boolean z2 = cloVarAt != null;
            aihfVarCreateBuilder.copyOnWrite();
            atpk atpkVar3 = (atpk) aihfVarCreateBuilder.instance;
            atpkVar3.b |= 1;
            atpkVar3.c = z2;
            if (cloVarAt != null && (codecCapabilities = cloVarAt.e) != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                int iIntValue = ((Integer) videoCapabilities.getSupportedHeights().getLower()).intValue();
                aihfVarCreateBuilder.copyOnWrite();
                atpk atpkVar4 = (atpk) aihfVarCreateBuilder.instance;
                atpkVar4.b |= 2;
                atpkVar4.d = iIntValue;
                int iIntValue2 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                aihfVarCreateBuilder.copyOnWrite();
                atpk atpkVar5 = (atpk) aihfVarCreateBuilder.instance;
                atpkVar5.b |= 4;
                atpkVar5.e = iIntValue2;
                int iIntValue3 = ((Integer) videoCapabilities.getSupportedWidths().getLower()).intValue();
                aihfVarCreateBuilder.copyOnWrite();
                atpk atpkVar6 = (atpk) aihfVarCreateBuilder.instance;
                atpkVar6.b |= 8;
                atpkVar6.f = iIntValue3;
                int iIntValue4 = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                aihfVarCreateBuilder.copyOnWrite();
                atpk atpkVar7 = (atpk) aihfVarCreateBuilder.instance;
                atpkVar7.b |= 16;
                atpkVar7.g = iIntValue4;
                if (bx() && (numAv = yno.av(videoCapabilities, u())) != null) {
                    int iIntValue5 = numAv.intValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    atpk atpkVar8 = (atpk) aihfVarCreateBuilder.instance;
                    atpkVar8.b |= 32;
                    atpkVar8.h = iIntValue5;
                }
            }
            atpk atpkVar9 = (atpk) aihfVarCreateBuilder.build();
            tpq tpqVar = this.s;
            byte[] bArr = null;
            taf.j(tpqVar.b(new tvm(strEV, atpkVar9, 19, bArr)), new xwk(11));
            if (!aq()) {
                return atpkVar9;
            }
            taf.j(tpqVar.b(new tvm(strEV, atpkVar9, 20, bArr)), new xwk(12));
            return atpkVar9;
        } catch (cly | RuntimeException unused) {
            return atpk.a;
        }
    }

    public final Optional eU() {
        return (Optional) this.T.io();
    }

    public final synchronized String eW() {
        return this.R;
    }

    public final String eX() {
        if (this.O == null) {
            fL();
        }
        return this.O;
    }

    public final String eY() {
        if (this.N == null) {
            fL();
        }
        return this.N;
    }

    public final Set eZ() {
        return eN() == 3 ? agkz.n(this.Q) : EnumSet.noneOf(zij.class);
    }

    public final boolean fA(Set set, Set set2, agkj agkjVar) {
        boolean zFG;
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (windowManager == null || Build.VERSION.SDK_INT < 29 || !fB(eX(), eY())) {
            return false;
        }
        if (ar()) {
            try {
                zFG = fG("video/x-vnd.on2.vp9", set, set2, agkjVar, 16384);
            } catch (cly | RuntimeException unused) {
                zFG = false;
            }
        } else {
            zFG = fr("vp9_profile_2_hdr_10_plus_supported", "video/x-vnd.on2.vp9", false, set, set2, agkjVar, 16384);
        }
        return zFG && fM(4, windowManager.getDefaultDisplay());
    }

    final boolean fB(String str, String str2) {
        return (this.P.contains(str) || this.P.contains(str2)) ? false : true;
    }

    public final boolean fC(Set set, Set set2, agkj agkjVar) {
        return fB(eX(), eY()) && fr("vp9_supported", "video/x-vnd.on2.vp9", false, set, set2, agkjVar, 0);
    }

    public final boolean fD(Set set) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return fr("xheaac_supported", "audio/mp4a-latm", false, set, agpr.a, agpn.b, 42);
    }

    public final boolean fE() {
        int i = tqr.a;
        return this.v.k(1073830264);
    }

    public final boolean fF() {
        return !this.B;
    }

    final boolean fG(String str, Set set, Set set2, agkj agkjVar, int i) {
        return yno.at(this, str, false, set, set2, agkjVar, i) != null;
    }

    public final boolean fH(int i) {
        int i2;
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (windowManager != null) {
            int i3 = i - 1;
            if (i3 != 16) {
                i2 = i3 == 18 ? 3 : 2;
            }
            return fM(i2, windowManager.getDefaultDisplay());
        }
        return false;
    }

    public final synchronized void fd(String str) {
        this.R = str;
    }

    public final void fe(wgs wgsVar) {
        zij zijVarCu;
        if (eN() != 3 || (zijVarCu = yno.cu(wgsVar)) == zij.a) {
            return;
        }
        this.Q.add(zijVarCu);
    }

    public final boolean ff() {
        return this.W.l(162, 45726649L, false);
    }

    public final boolean fg() {
        return this.W.l(206, 45766435L, false);
    }

    public final boolean fh(wgs wgsVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        if (!a.aM() || wgsVar == null || !wgsVar.I() || wgsVar.b() <= 0) {
            return false;
        }
        try {
            if (as()) {
                return false;
            }
            Context context = this.q;
            AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
            if (audioManager2 != null) {
                Spatializer spatializer = audioManager2.getSpatializer();
                return fK(spatializer) && fI(spatializer) && spatializer.canBeSpatialized(new AudioAttributes.Builder().setUsage(1).setSpatializationBehavior(0).build(), new AudioFormat.Builder().setEncoding(2).setChannelMask(bwp.g(wgsVar.b())).setSampleRate((int) wgsVar.b.H).build());
            }
            Spatializer spatializerM = bby$$ExternalSyntheticApiModelOutline7.m(eU().orElse(null));
            if (spatializerM == null || !((Boolean) this.U.io()).booleanValue()) {
                return false;
            }
            if (as()) {
                zBooleanValue = ((Boolean) this.V.io()).booleanValue();
            } else {
                zBooleanValue = (!a.aM() || (audioManager = (AudioManager) context.getSystemService("audio")) == null) ? false : fI(audioManager.getSpatializer());
            }
            if (zBooleanValue) {
                return spatializerM.canBeSpatialized(new AudioAttributes.Builder().setUsage(1).setSpatializationBehavior(0).build(), new AudioFormat.Builder().setEncoding(2).setChannelMask(bwp.g(wgsVar.b())).setSampleRate((int) wgsVar.b.H).build());
            }
            return false;
        } catch (NullPointerException unused) {
            zvp.a(zvn.b, zvm.f, "Checking spatialization ability caused an exception.");
            return false;
        }
    }

    public final boolean fi() {
        int i = tqr.a;
        return this.v.k(88400);
    }

    public final boolean fj() {
        int i = tqr.a;
        return this.v.k(1073830227);
    }

    public final boolean fk() {
        int i = tqr.a;
        return this.v.k(1073840107);
    }

    public final boolean fl() {
        return ((atpl) this.s.c()).m;
    }

    public final boolean fm() {
        if (S().ah) {
            return false;
        }
        return this.y || S().Y;
    }

    public final boolean fn() {
        if (!fm()) {
            return false;
        }
        if (this.S == null) {
            try {
                AudioManager audioManager = (AudioManager) this.q.getSystemService("audio");
                if (audioManager != null) {
                    this.S = Boolean.valueOf(Objects.equals(audioManager.getParameters("offloadVariableRateSupported"), "offloadVariableRateSupported=1"));
                }
            } catch (RuntimeException unused) {
                zvp.a(zvn.b, zvm.f, "Checking audio offload speed change ability caused an exception.");
                this.S = Boolean.FALSE;
            }
        }
        return this.S.booleanValue();
    }

    public final boolean fo(Set set, Set set2, agkj agkjVar) {
        boolean zFG;
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (!dn() || windowManager == null || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        if (ar()) {
            try {
                zFG = fG("video/av01", set, set2, agkjVar, SemanticState.Multiline);
            } catch (cly | RuntimeException unused) {
                zFG = false;
            }
        } else {
            zFG = fr("av1_profile_main_10_hdr_10_plus_supported", "video/av01", false, set, set2, agkjVar, SemanticState.Multiline);
        }
        return zFG && fM(4, windowManager.getDefaultDisplay());
    }

    public final boolean fp(Set set, Set set2, agkj agkjVar) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return fr("av1_profile_main_10_supported", "video/av01", false, set, set2, agkjVar, SemanticState.Obscured);
    }

    public final boolean fq(Set set) {
        return fr("av1_supported", "video/av01", false, set, agpr.a, agpn.b, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fr(String str, String str2, boolean z, Set set, Set set2, agkj agkjVar, int i) {
        String strEV = eV(str, set, set2, agkjVar, eB());
        tpq tpqVar = this.s;
        atpl atplVar = (atpl) tpqVar.c();
        if (aq() && DesugarCollections.unmodifiableMap(atplVar.v).containsKey(strEV)) {
            atpk atpkVar = atpk.a;
            atpk atpkVar2 = (atpk) atplVar.v.get(strEV);
            if (atpkVar2 != null) {
                atpkVar = atpkVar2;
            }
            return atpkVar.c;
        }
        if (!aq() && atplVar.v.size() > 0) {
            tpqVar.b(new xwx(8));
        }
        if (!atplVar.h.containsKey(strEV)) {
            return eT(str, str2, z, set, set2, agkjVar, i).c;
        }
        Boolean bool = (Boolean) atplVar.h.get(strEV);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean fs(Set set) {
        return fr("eac3_supported", "audio/eac3", false, set, agpr.a, agpn.b, 0);
    }

    public final boolean ft() {
        tqj tqjVar = this.v;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074092410, 8)) {
                return true;
            }
        }
        return false;
    }

    public final boolean fu(Set set) {
        return fr("h264_main_profile_supported", "video/avc", false, set, agpr.a, agpn.b, 0);
    }

    public final boolean fv(Set set) {
        return fr("opus_supported", "audio/opus", false, set, agpr.a, agpn.b, 0);
    }

    public final boolean fw(Set set, Set set2, agkj agkjVar) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return fr("av1_secure_profile_main_10_supported", "video/av01", true, set, set2, agkjVar, SemanticState.Obscured);
    }

    public final boolean fx(Set set, Set set2, agkj agkjVar) {
        return fB(eX(), eY()) && fr("vp9_secure_profile_2_supported", "video/x-vnd.on2.vp9", true, set, set2, agkjVar, SemanticState.Obscured);
    }

    public final boolean fy(Set set, Set set2, agkj agkjVar) {
        return fB(eX(), eY()) && fr("vp9_secure_supported", "video/x-vnd.on2.vp9", true, set, set2, agkjVar, 0);
    }

    public final boolean fz() {
        return this.j.l(29, 45368366L, false);
    }
}
