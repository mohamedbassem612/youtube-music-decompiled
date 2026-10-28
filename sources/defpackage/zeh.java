package defpackage;

import android.os.PowerManager;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState;
import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$LicenseConstraint;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.libraries.youtube.media.interfaces.SconeBitrateTracker;
import com.google.cardboard.sdk.R;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.LongSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zeh {
    public final zjr a;
    public final zkd b;
    public final aunn c;
    public final yoq e;
    public acom i;
    public auym j;
    private final mbc k;
    private final zkk l;
    private final yup m;
    private final zju n;
    private final awmd o;
    private final tun p;
    private final PowerManager q;
    private LongSupplier t;
    private LongSupplier u;
    private LongSupplier v;
    private final tfq w;
    private final hed x;
    public volatile ywn d = ywn.b;
    public int f = -1;
    private long r = -9223372036854775807L;
    private aigj s = null;
    public final AtomicLong g = new AtomicLong(-1);
    public final AtomicReference h = new AtomicReference(null);

    public zeh(tfq tfqVar, mbc mbcVar, zkk zkkVar, zjr zjrVar, zkd zkdVar, hed hedVar, yup yupVar, tun tunVar, zju zjuVar, yoq yoqVar, PowerManager powerManager, awmd awmdVar, aunn aunnVar) {
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = tfqVar;
        this.a = zjrVar;
        this.b = zkdVar;
        this.k = mbcVar;
        this.l = zkkVar;
        this.x = hedVar;
        this.m = yupVar;
        this.n = zjuVar;
        this.p = tunVar;
        this.e = yoqVar;
        this.q = powerManager;
        this.o = awmdVar;
        this.c = aunnVar;
        final int i = 2;
        if ((zjrVar.V().b & 2) != 0) {
            MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig = zjrVar.V().d;
            if ((mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig == null ? MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig.getDefaultInstance() : mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig).b) {
                final int i2 = 1;
                this.t = new LongSupplier() { // from class: zeg
                    @Override // java.util.function.LongSupplier
                    public final long getAsLong() {
                        int i3 = i2;
                        if (i3 != 0) {
                            return i3 != 1 ? SconeBitrateTracker.getSecondsSinceLatestSconeSample() : SconeBitrateTracker.getMinimumSconeKbps();
                        }
                        return SconeBitrateTracker.getLatestRawSconeKbps();
                    }
                };
                final int i3 = 0;
                this.u = new LongSupplier() { // from class: zeg
                    @Override // java.util.function.LongSupplier
                    public final long getAsLong() {
                        int i4 = i3;
                        if (i4 != 0) {
                            return i4 != 1 ? SconeBitrateTracker.getSecondsSinceLatestSconeSample() : SconeBitrateTracker.getMinimumSconeKbps();
                        }
                        return SconeBitrateTracker.getLatestRawSconeKbps();
                    }
                };
                this.v = new LongSupplier() { // from class: zeg
                    @Override // java.util.function.LongSupplier
                    public final long getAsLong() {
                        int i4 = i;
                        if (i4 != 0) {
                            return i4 != 1 ? SconeBitrateTracker.getSecondsSinceLatestSconeSample() : SconeBitrateTracker.getMinimumSconeKbps();
                        }
                        return SconeBitrateTracker.getLatestRawSconeKbps();
                    }
                };
            }
        }
    }

    public static int e(int i) {
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 11;
        }
        if (i != 3) {
            return i == 4 ? 31 : 1;
        }
        return 21;
    }

    private final void h(String str, long j) {
        AtomicReference atomicReference = this.h;
        if (str.equals(atomicReference.get())) {
            return;
        }
        if (j > 0) {
            this.d.w("scr", String.valueOf(j));
            long secondsSinceLatestSconeSample = this.v != null ? SconeBitrateTracker.getSecondsSinceLatestSconeSample() : -1L;
            if (secondsSinceLatestSconeSample >= 0) {
                this.d.w("sct", String.valueOf(secondsSinceLatestSconeSample));
            }
        }
        this.d.w("scf", str);
        atomicReference.set(str);
        this.g.set(-1L);
    }

    public final ClientAbrStateOuterClass$ClientAbrState a(wiu wiuVar, int i, int i2, long j, String str, float f, agke agkeVar, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities) {
        int iEO;
        aihf aihfVarG = g(wiuVar);
        long jB = this.d.b();
        if (jB != 0) {
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState2 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState.b |= 2097152;
            clientAbrStateOuterClass$ClientAbrState.z = jB;
        }
        if (j != -9223372036854775807L) {
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState3 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState4 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState3.b |= 16384;
            clientAbrStateOuterClass$ClientAbrState3.s = j;
        }
        zkd zkdVar = this.b;
        if (zkdVar.m()) {
            arfb arfbVarF = zkdVar.f(str);
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState5 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState6 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState5.q = arfbVarF.e;
            clientAbrStateOuterClass$ClientAbrState5.b |= SemanticState.Obscured;
        }
        if (zkdVar.l()) {
            ajhj ajhjVarA = zkdVar.a(str);
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState7 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState8 = ClientAbrStateOuterClass$ClientAbrState.a;
            clientAbrStateOuterClass$ClientAbrState7.H = ajhjVarA.d;
            clientAbrStateOuterClass$ClientAbrState7.c |= 8388608;
        }
        zjr zjrVar = this.a;
        if (zjrVar.j.m(307, 45738253L)) {
            int iE = e(i);
            int iE2 = e(i2);
            if (iE != 1) {
                aihfVarG.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState9 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState10 = ClientAbrStateOuterClass$ClientAbrState.a;
                clientAbrStateOuterClass$ClientAbrState9.o = iE - 1;
                clientAbrStateOuterClass$ClientAbrState9.b |= SemanticState.ReadOnly;
            }
            if (iE2 != 1) {
                aihfVarG.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState11 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState12 = ClientAbrStateOuterClass$ClientAbrState.a;
                clientAbrStateOuterClass$ClientAbrState11.p = iE2 - 1;
                clientAbrStateOuterClass$ClientAbrState11.b |= SemanticState.Modal;
            }
        }
        if (!agkeVar.isEmpty()) {
            ClientAbrStateOuterClass$LicenseConstraint defaultInstance = ((ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance).J;
            if (defaultInstance == null) {
                defaultInstance = ClientAbrStateOuterClass$LicenseConstraint.getDefaultInstance();
            }
            aihf builder = defaultInstance.toBuilder();
            int size = agkeVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = (InnertubeDrmService$AuthorizedFormat) agkeVar.get(i3);
                aihf aihfVarCreateBuilder = jqw.a.createBuilder();
                akvr akvrVarA = akvr.a(innertubeDrmService$AuthorizedFormat.c);
                if (akvrVarA == null) {
                    akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
                }
                aihfVarCreateBuilder.copyOnWrite();
                jqw jqwVar = (jqw) aihfVarCreateBuilder.instance;
                jqwVar.c = akvrVarA.g;
                jqwVar.b |= 1;
                if ((innertubeDrmService$AuthorizedFormat.b & 4) != 0) {
                    boolean z = innertubeDrmService$AuthorizedFormat.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    jqw jqwVar2 = (jqw) aihfVarCreateBuilder.instance;
                    jqwVar2.b |= 2;
                    jqwVar2.d = z;
                }
                builder.copyOnWrite();
                ClientAbrStateOuterClass$LicenseConstraint clientAbrStateOuterClass$LicenseConstraint = (ClientAbrStateOuterClass$LicenseConstraint) builder.instance;
                jqw jqwVar3 = (jqw) aihfVarCreateBuilder.build();
                jqwVar3.getClass();
                aiie aiieVar = clientAbrStateOuterClass$LicenseConstraint.b;
                if (!aiieVar.c()) {
                    clientAbrStateOuterClass$LicenseConstraint.b = aihn.mutableCopy(aiieVar);
                }
                clientAbrStateOuterClass$LicenseConstraint.b.add(jqwVar3);
            }
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState13 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            ClientAbrStateOuterClass$LicenseConstraint clientAbrStateOuterClass$LicenseConstraint2 = (ClientAbrStateOuterClass$LicenseConstraint) builder.build();
            clientAbrStateOuterClass$LicenseConstraint2.getClass();
            clientAbrStateOuterClass$ClientAbrState13.J = clientAbrStateOuterClass$LicenseConstraint2;
            clientAbrStateOuterClass$ClientAbrState13.c |= 536870912;
        }
        int iF = f(false);
        aihfVarG.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState14 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState15 = ClientAbrStateOuterClass$ClientAbrState.a;
        clientAbrStateOuterClass$ClientAbrState14.v = iF - 1;
        clientAbrStateOuterClass$ClientAbrState14.b |= 131072;
        if (!ahbd.c(f, 0.0d, 1.199999957179898E-7d)) {
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState16 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState16.b |= 1048576;
            clientAbrStateOuterClass$ClientAbrState16.y = f;
        }
        if (mediaCapabilitiesOuterClass$MediaCapabilities != null) {
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState17 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState17.A = mediaCapabilitiesOuterClass$MediaCapabilities;
            clientAbrStateOuterClass$ClientAbrState17.b |= 8388608;
        }
        if ((zjrVar.eb() || zjrVar.cE()) && (iEO = zjrVar.eO()) != 0) {
            aihfVarG.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState18 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
            clientAbrStateOuterClass$ClientAbrState18.c |= 134217728;
            clientAbrStateOuterClass$ClientAbrState18.I = iEO;
        }
        List list = wiuVar.f;
        aihfVarG.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState19 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.instance;
        aiie aiieVar2 = clientAbrStateOuterClass$ClientAbrState19.M;
        if (!aiieVar2.c()) {
            clientAbrStateOuterClass$ClientAbrState19.M = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(list, clientAbrStateOuterClass$ClientAbrState19.M);
        return (ClientAbrStateOuterClass$ClientAbrState) aihfVarG.build();
    }

    public final synchronized aigj b() {
        return this.s;
    }

    public final synchronized void c() {
        this.r = this.k.b();
    }

    public final synchronized void d(aigj aigjVar) {
        this.s = aigjVar;
    }

    public final int f(boolean z) {
        String str;
        zjr.fJ();
        zju zjuVar = this.n;
        boolean z2 = zjuVar.d;
        boolean z3 = zjuVar.e;
        int i = 2;
        if (z2 && !z3) {
            i = 3;
        }
        if (z) {
            int i2 = i - 1;
            switch (this.w.l()) {
                case 102:
                    str = "DETAILED_NETWORK_TYPE_EDGE";
                    break;
                case 103:
                    str = "DETAILED_NETWORK_TYPE_GPRS";
                    break;
                case 104:
                    str = "DETAILED_NETWORK_TYPE_1_X_RTT";
                    break;
                case 105:
                    str = "DETAILED_NETWORK_TYPE_CDMA";
                    break;
                case 106:
                    str = "DETAILED_NETWORK_TYPE_EVDO_0";
                    break;
                case 107:
                    str = "DETAILED_NETWORK_TYPE_EVDO_A";
                    break;
                case 108:
                    str = "DETAILED_NETWORK_TYPE_HSDPA";
                    break;
                case 109:
                    str = "DETAILED_NETWORK_TYPE_HSPA";
                    break;
                case 110:
                    str = "DETAILED_NETWORK_TYPE_HSUPA";
                    break;
                case 111:
                    str = "DETAILED_NETWORK_TYPE_IDEN";
                    break;
                case 112:
                    str = "DETAILED_NETWORK_TYPE_UMTS";
                    break;
                case 113:
                    str = "DETAILED_NETWORK_TYPE_EVDO_B";
                    break;
                case 114:
                    str = "DETAILED_NETWORK_TYPE_EHRPD";
                    break;
                case 115:
                    str = "DETAILED_NETWORK_TYPE_HSPAP";
                    break;
                case 116:
                    str = "DETAILED_NETWORK_TYPE_LTE";
                    break;
                case 117:
                    str = "DETAILED_NETWORK_TYPE_WIFI";
                    break;
                case 118:
                    str = "DETAILED_NETWORK_TYPE_BLUETOOTH";
                    break;
                case 119:
                    str = "DETAILED_NETWORK_TYPE_ETHERNET";
                    break;
                case 120:
                    str = "DETAILED_NETWORK_TYPE_WIMAX";
                    break;
                case 121:
                    str = "DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN";
                    break;
                case 122:
                    str = "DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN";
                    break;
                case 123:
                    str = "DETAILED_NETWORK_TYPE_DISCONNECTED";
                    break;
                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                    str = "DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT";
                    break;
                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    str = "DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED";
                    break;
                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                    str = "DETAILED_NETWORK_TYPE_NR_SA";
                    break;
                default:
                    str = "DETAILED_NETWORK_TYPE_NR_NSA";
                    break;
            }
            this.d.l("nms", "ncn." + z2 + ";ntu." + z3 + ";nms." + i2 + ";dnt." + str);
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0317  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0278  */
    public final aihf g(wiu wiuVar) {
        int i;
        long j;
        String str;
        zkj zkjVar;
        int i2;
        int i3;
        aihf aihfVarCreateBuilder = ClientAbrStateOuterClass$ClientAbrState.a.createBuilder();
        tfq tfqVar = this.w;
        int iL = tfqVar.l();
        aihfVarCreateBuilder.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
        clientAbrStateOuterClass$ClientAbrState.h = iL - 1;
        clientAbrStateOuterClass$ClientAbrState.b |= 8;
        boolean z = this.n.f;
        aihfVarCreateBuilder.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState2 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
        clientAbrStateOuterClass$ClientAbrState2.b |= 262144;
        clientAbrStateOuterClass$ClientAbrState2.w = z;
        aehn aehnVar = (aehn) this.o.io();
        if (aehnVar.c()) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState3 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState3.c |= Integer.MIN_VALUE;
            clientAbrStateOuterClass$ClientAbrState3.K = true;
        }
        if (aehnVar.b() != -1.0f) {
            int iRound = Math.round(aehnVar.b() * 100.0f);
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState4 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState4.d |= 1;
            clientAbrStateOuterClass$ClientAbrState4.L = iRound;
        }
        zjr zjrVar = this.a;
        zjr.fJ();
        zkd zkdVar = this.b;
        mbc mbcVar = this.k;
        zkc zkcVarN = zkdVar.n(2);
        long epochMilli = mbcVar.f().toEpochMilli();
        long j2 = zkcVarN.d;
        if (j2 != -1) {
            int i4 = zkcVarN.c;
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState5 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState5.b |= 2;
            clientAbrStateOuterClass$ClientAbrState5.f = i4;
            int i5 = zkcVarN.b;
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState6 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState6.b |= 4;
            clientAbrStateOuterClass$ClientAbrState6.g = i5;
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState7 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState7.b |= 1;
            clientAbrStateOuterClass$ClientAbrState7.e = epochMilli - j2;
        }
        Object objIo = this.l.io();
        if (objIo != null && (i2 = (zkjVar = (zkj) objIo).c) > 0 && (i3 = zkjVar.d) > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState8 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState8.b |= 16;
            clientAbrStateOuterClass$ClientAbrState8.i = i2;
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState9 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState9.b |= 32;
            clientAbrStateOuterClass$ClientAbrState9.j = i3;
            boolean z2 = zkjVar.b;
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState10 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState10.b |= SemanticState.Hidden;
            clientAbrStateOuterClass$ClientAbrState10.m = z2;
        }
        List listU = wiuVar.U();
        if (!listU.isEmpty() && listU.contains(Integer.valueOf(tfqVar.a()))) {
            long jZ = wiuVar.z() / 8;
            if (jZ != -1) {
                aihfVarCreateBuilder.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState11 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
                clientAbrStateOuterClass$ClientAbrState11.b |= 64;
                clientAbrStateOuterClass$ClientAbrState11.k = jZ;
                if (wiuVar.ae()) {
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState12 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
                    clientAbrStateOuterClass$ClientAbrState12.b |= 268435456;
                    clientAbrStateOuterClass$ClientAbrState12.D = (int) jZ;
                }
            }
        }
        aooc aoocVarZ = this.x.z();
        if (aoocVarZ != aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState13 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState13.r = aoocVarZ.n;
            clientAbrStateOuterClass$ClientAbrState13.b |= SemanticState.Multiline;
        }
        if (zjrVar.j.m(243, 45658770L)) {
            i = 2;
        } else {
            yus yusVarJ = this.m.j();
            if (yusVarJ.c == 1) {
                i = 2;
                long j3 = yusVarJ.b / 8;
                if (j3 > 0) {
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState14 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
                    clientAbrStateOuterClass$ClientAbrState14.b |= SemanticState.LiveRegion;
                    clientAbrStateOuterClass$ClientAbrState14.n = j3;
                }
            } else {
                i = 2;
            }
        }
        long jD = zjrVar.i.d(15, 45616894L);
        if (jD > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState15 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState15.b |= SemanticState.LiveRegion;
            clientAbrStateOuterClass$ClientAbrState15.n = jD;
        }
        boolean zIsPowerSaveMode = this.q.isPowerSaveMode();
        aihfVarCreateBuilder.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState16 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
        clientAbrStateOuterClass$ClientAbrState16.b |= 65536;
        clientAbrStateOuterClass$ClientAbrState16.u = zIsPowerSaveMode;
        synchronized (this) {
            j = this.r;
        }
        if (j != -9223372036854775807L) {
            long jB = this.k.b() - j;
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState17 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState17.b |= 32768;
            clientAbrStateOuterClass$ClientAbrState17.t = jB;
        }
        tun tunVar = this.p;
        long jB2 = tunVar.c.b();
        long j4 = tunVar.a;
        long j5 = j4 == -1 ? -1L : jB2 - j4;
        if (j5 != -1) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState18 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState18.b |= 16777216;
            clientAbrStateOuterClass$ClientAbrState18.B = j5;
        }
        int i6 = this.f;
        aihfVarCreateBuilder.copyOnWrite();
        ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState19 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
        clientAbrStateOuterClass$ClientAbrState19.b |= 524288;
        clientAbrStateOuterClass$ClientAbrState19.x = i6;
        zjr zjrVar2 = this.a;
        if (zjrVar2.fi() && this.e.c()) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState20 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
            clientAbrStateOuterClass$ClientAbrState20.b |= Integer.MIN_VALUE;
            clientAbrStateOuterClass$ClientAbrState20.E = true;
        } else if (zjrVar2.fi() && zjrVar2.bt()) {
            ywn ywnVar = this.d;
            yoq yoqVar = this.e;
            if (yoqVar.h) {
                str = "1";
            } else {
                zjr zjrVar3 = yoqVar.a;
                if (zjrVar3.fj() && zjrVar3.fi()) {
                    str = "1";
                } else {
                    str = "0";
                }
            }
            ywnVar.w("ddr", str);
        }
        vxz vxzVar = zjrVar2.j;
        if (vxzVar.m(SemanticState.Hidden, 45669169L)) {
            yoq yoqVar2 = this.e;
            if (!yoqVar2.b().isEmpty()) {
                String strB = yoqVar2.b();
                aihfVarCreateBuilder.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState21 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
                clientAbrStateOuterClass$ClientAbrState21.c |= 1048576;
                clientAbrStateOuterClass$ClientAbrState21.F = strB;
            }
        }
        if (this.t != null) {
            tfq tfqVar2 = this.w;
            long minimumSconeKbps = SconeBitrateTracker.getMinimumSconeKbps();
            boolean z3 = tfqVar2 != null && tfqVar2.j(0);
            if (minimumSconeKbps > 0 && z3) {
                aihfVarCreateBuilder.copyOnWrite();
                ClientAbrStateOuterClass$ClientAbrState clientAbrStateOuterClass$ClientAbrState22 = (ClientAbrStateOuterClass$ClientAbrState) aihfVarCreateBuilder.instance;
                clientAbrStateOuterClass$ClientAbrState22.d |= i;
                clientAbrStateOuterClass$ClientAbrState22.N = minimumSconeKbps;
            }
            if (vxzVar.l(385, 45831624L, false)) {
                if (minimumSconeKbps > 0) {
                    if (z3) {
                        AtomicLong atomicLong = this.g;
                        if (atomicLong.get() != minimumSconeKbps) {
                            this.d.w("scb", String.valueOf(minimumSconeKbps));
                            atomicLong.set(minimumSconeKbps);
                            this.h.set(null);
                        }
                    } else {
                        h("not_cellular", -1L);
                    }
                } else if (z3) {
                    long latestRawSconeKbps = this.u != null ? SconeBitrateTracker.getLatestRawSconeKbps() : -1L;
                    h(latestRawSconeKbps > 0 ? "expired" : "no_envoy", latestRawSconeKbps);
                } else {
                    h("not_cellular", -1L);
                }
            }
        }
        return aihfVarCreateBuilder;
    }
}
