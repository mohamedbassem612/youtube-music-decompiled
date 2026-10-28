package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgq implements cfu {
    public static final /* synthetic */ int d = 0;
    private static final agfr e = aguu.al(new jxp(1));
    public cff a;
    public cfj b;
    public dje c;
    private final Context f;
    private final cgy g;
    private final cgw h;
    private final float i;
    private bvd j;
    private Looper k;
    private Context l;
    private final qcb m;

    public cgq(cgp cgpVar) {
        this.f = cgpVar.a;
        cgw cgwVar = cgpVar.b;
        cgwVar.getClass();
        this.h = cgwVar;
        this.g = cgpVar.c;
        this.a = cgpVar.d;
        this.m = cgpVar.a == null ? null : new qcb(this);
        this.i = 8.0f;
        this.j = bvd.a;
    }

    private static String j(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private final void k(cfp cfpVar) {
        cff cffVar;
        i();
        cfj cfjVar = this.b;
        if (cfjVar == null) {
            Context context = this.f;
            if (context != null) {
                cfj cfjVar2 = new cfj(context, new qcb(this, null), cfpVar.b, cfpVar.c);
                this.b = cfjVar2;
                if (cfjVar2.i) {
                    cffVar = cfjVar2.f;
                    cffVar.getClass();
                } else {
                    cfjVar2.i = true;
                    cfh cfhVar = cfjVar2.e;
                    if (cfhVar != null) {
                        cfhVar.a.registerContentObserver(cfhVar.b, false, cfhVar);
                    }
                    Context context2 = cfjVar2.a;
                    AudioManager audioManagerO = ast.o(context2);
                    AudioDeviceCallback audioDeviceCallback = cfjVar2.c;
                    Handler handler = cfjVar2.b;
                    audioManagerO.registerAudioDeviceCallback(audioDeviceCallback, handler);
                    if (Build.VERSION.SDK_INT >= 32 && cfjVar2.j == null) {
                        cfjVar2.j = new eqf(context2, new bkn(cfjVar2, 10), Boolean.valueOf(bwp.ae(context2)));
                    }
                    cfjVar2.f = cff.c(context2, context2.registerReceiver(cfjVar2.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), cfjVar2.h, cfjVar2.g, cfjVar2.a());
                    cffVar = cfjVar2.f;
                }
                this.a = cffVar;
            }
        } else {
            AudioDeviceInfo audioDeviceInfo = cfpVar.c;
            if (audioDeviceInfo != null) {
                cfjVar.c(audioDeviceInfo);
            }
            cfj cfjVar3 = this.b;
            brq brqVar = cfpVar.b;
            if (!Objects.equals(brqVar, cfjVar3.h)) {
                cfjVar3.h = brqVar;
                cfjVar3.b(cff.b(cfjVar3.a, brqVar, cfjVar3.g, cfjVar3.a()));
            }
        }
        this.a.getClass();
    }

    @Override // defpackage.cfu
    public final cfq a(cfp cfpVar) {
        k(cfpVar);
        cgw cgwVar = this.h;
        bse bseVar = cfpVar.a;
        brq brqVar = cfpVar.b;
        cfl cflVarA = cgwVar.a(bseVar, brqVar);
        mol molVar = new mol(null);
        int i = 0;
        if (!Objects.equals(bseVar.q, "audio/raw") ? this.a.a(bseVar, brqVar) != null : bseVar.L == 2) {
            i = 2;
        }
        molVar.a = i;
        molVar.b = cflVarA.b;
        molVar.d = cflVarA.c;
        molVar.c = cflVarA.d;
        return molVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0165  */
    @Override // defpackage.cfu
    public final cft b(cfp cfpVar) throws cfn {
        int i;
        int iIntValue;
        int iA;
        int iJ;
        char c;
        boolean z;
        boolean z2;
        int i2;
        int iMax;
        boolean z3;
        cgy cgyVar;
        int minBufferSize;
        boolean z4;
        double d2;
        int iK;
        che cheVar;
        int i3;
        int iA2;
        k(cfpVar);
        bse bseVar = cfpVar.a;
        String str = bseVar.q;
        if (!Objects.equals(str, "audio/raw")) {
            i = bseVar.K;
            boolean z5 = cfpVar.d;
            cfl cflVarA = z5 ? this.h.a(bseVar, cfpVar.b) : cfl.a;
            if (z5 && cflVarA.b) {
                str.getClass();
                iA = bsy.a(str, bseVar.l);
                int iH = bwp.h(bseVar);
                if (iA == 11) {
                    if (i >= 16000 && !((Boolean) e.io()).booleanValue()) {
                        if (iA == 12 && bseVar.I == 2) {
                            iH = 4;
                        }
                        i >>= 1;
                        iA = 10;
                    }
                } else if (iA == 12) {
                    iA = 12;
                    if (i >= 16000) {
                        if (iA == 12) {
                            iH = 4;
                        }
                        i >>= 1;
                        iA = 10;
                    }
                }
                iJ = -1;
                z2 = true;
                z = cflVarA.c;
                iIntValue = iH;
                c = 1;
            } else {
                Pair pairA = this.a.a(bseVar, cfpVar.b);
                if (pairA == null) {
                    throw new cfn("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(bseVar))));
                }
                int iIntValue2 = ((Integer) pairA.first).intValue();
                iIntValue = ((Integer) pairA.second).intValue();
                iA = iIntValue2;
                iJ = -1;
                c = 2;
                z = false;
            }
            i2 = bseVar.k;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i2 == -1) {
                i2 = 768000;
            }
            iMax = cfpVar.g;
            if (iMax == -1) {
                cgyVar = this.g;
                minBufferSize = AudioTrack.getMinBufferSize(i, iIntValue, iA);
                if (minBufferSize != -2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ahno.O(z4);
                if (iJ == -1) {
                    iJ = 1;
                }
                if (z2) {
                    d2 = this.i;
                } else {
                    d2 = 1.0d;
                }
                if (c != 0) {
                    if (c != 1) {
                        cheVar = (che) cgyVar;
                        int i4 = cheVar.c;
                        if (iA == 5) {
                            int i5 = cheVar.e;
                            i3 = 500000;
                        } else if (iA == 8) {
                            int i6 = cheVar.f;
                            i3 = 1000000;
                            iA = 8;
                        } else {
                            i3 = 250000;
                        }
                        if (i2 != -1) {
                            iA2 = ahng.X(i2, 8, RoundingMode.CEILING);
                        } else {
                            iA2 = che.a(iA);
                        }
                        iK = ahng.K((((long) i3) * ((long) iA2)) / 1000000);
                    } else {
                        int iA3 = che.a(iA);
                        int i7 = ((che) cgyVar).d;
                        iK = ahng.K((((long) iA3) * 50000000) / 1000000);
                    }
                    i = i;
                } else {
                    che cheVar2 = (che) cgyVar;
                    int i8 = cheVar2.b;
                    int i9 = cheVar2.g;
                    iK = ahng.K(((((long) i) * 500000) * ((long) iJ)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iK) * d2)) + iJ) - 1) / iJ) * iJ;
            }
            cfs cfsVar = new cfs();
            cfsVar.b = i;
            cfsVar.c = iIntValue;
            cfsVar.a = iA;
            cfsVar.e = iMax;
            cfsVar.g = cfpVar.e;
            cfsVar.f = cfpVar.b;
            if (c == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            cfsVar.d = z3;
            cfsVar.i = z2;
            cfsVar.j = z;
            cfsVar.h = cfpVar.f;
            return new cft(cfsVar);
        }
        iA = bseVar.L;
        ahno.F(bwp.ab(iA));
        i = bseVar.K;
        iIntValue = bwp.h(bseVar);
        iJ = bwp.j(iA) * bseVar.I;
        z = false;
        c = 0;
        z2 = false;
        i2 = bseVar.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i2 = 768000;
        }
        iMax = cfpVar.g;
        if (iMax == -1) {
            cgyVar = this.g;
            minBufferSize = AudioTrack.getMinBufferSize(i, iIntValue, iA);
            if (minBufferSize != -2) {
                z4 = true;
            } else {
                z4 = false;
            }
            ahno.O(z4);
            if (iJ == -1) {
                iJ = 1;
            }
            if (z2) {
                d2 = this.i;
            } else {
                d2 = 1.0d;
            }
            if (c != 0) {
                if (c != 1) {
                    cheVar = (che) cgyVar;
                    int i10 = cheVar.c;
                    if (iA == 5) {
                        int i11 = cheVar.e;
                        i3 = 500000;
                    } else if (iA == 8) {
                        int i12 = cheVar.f;
                        i3 = 1000000;
                        iA = 8;
                    } else {
                        i3 = 250000;
                    }
                    if (i2 != -1) {
                        iA2 = ahng.X(i2, 8, RoundingMode.CEILING);
                    } else {
                        iA2 = che.a(iA);
                    }
                    iK = ahng.K((((long) i3) * ((long) iA2)) / 1000000);
                } else {
                    int iA4 = che.a(iA);
                    int i13 = ((che) cgyVar).d;
                    iK = ahng.K((((long) iA4) * 50000000) / 1000000);
                }
                i = i;
            } else {
                che cheVar3 = (che) cgyVar;
                int i14 = cheVar3.b;
                int i15 = cheVar3.g;
                iK = ahng.K(((((long) i) * 500000) * ((long) iJ)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iK) * d2)) + iJ) - 1) / iJ) * iJ;
        }
        cfs cfsVar2 = new cfs();
        cfsVar2.b = i;
        cfsVar2.c = iIntValue;
        cfsVar2.a = iA;
        cfsVar2.e = iMax;
        cfsVar2.g = cfpVar.e;
        cfsVar2.f = cfpVar.b;
        if (c == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        cfsVar2.d = z3;
        cfsVar2.i = z2;
        cfsVar2.j = z;
        cfsVar2.h = cfpVar.f;
        return new cft(cfsVar2);
    }

    @Override // defpackage.cfu
    public final void c() {
        eqf eqfVar;
        dje djeVar = this.c;
        if (djeVar != null) {
            djeVar.f();
        }
        cfj cfjVar = this.b;
        if (cfjVar == null || !cfjVar.i) {
            return;
        }
        cfjVar.f = null;
        Context context = cfjVar.a;
        ast.o(context).unregisterAudioDeviceCallback(cfjVar.c);
        if (Build.VERSION.SDK_INT >= 32 && (eqfVar = cfjVar.j) != null) {
            eqfVar.a();
            cfjVar.j = null;
        }
        context.unregisterReceiver(cfjVar.d);
        cfh cfhVar = cfjVar.e;
        if (cfhVar != null) {
            cfhVar.a.unregisterContentObserver(cfhVar);
        }
        cfjVar.i = false;
    }

    @Override // defpackage.cfu
    public final void d(bvd bvdVar) {
        this.j = bvdVar;
    }

    @Override // defpackage.cfu
    public final boolean e() {
        boolean z;
        synchronized (cgo.a) {
            z = cgo.c > 0;
        }
        return z;
    }

    @Override // defpackage.cfu
    public final void g(qcb qcbVar) {
        i();
        dje djeVar = this.c;
        if (djeVar == null) {
            djeVar = new dje(Thread.currentThread());
            this.c = djeVar;
        }
        djeVar.c(qcbVar);
    }

    @Override // defpackage.cfu
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final cgo f(cft cftVar) throws cfr {
        Context context;
        try {
            int i = cftVar.g;
            int i2 = cftVar.h;
            Context context2 = null;
            if (i2 != -1 && (context = this.f) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.l;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.l = context.createDeviceContext(i2);
                }
                context2 = this.l;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(cftVar.f.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(cftVar.b).setChannelMask(cftVar.c).setEncoding(cftVar.a).build()).setTransferMode(1).setBufferSizeInBytes(cftVar.e).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(cftVar.d);
            }
            if (Build.VERSION.SDK_INT >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new cgo(audioTrackBuild, cftVar, this.m, this.i, this.j);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new cfr();
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new cfr(e2);
        }
    }

    public final void i() {
        if (this.f != null) {
            Looper looperMyLooper = Looper.myLooper();
            Looper looper = this.k;
            boolean z = true;
            if (looper != null && looper != looperMyLooper) {
                z = false;
            }
            ahno.U(z, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", j(looper), j(looperMyLooper));
            this.k = looperMyLooper;
        }
    }
}
