package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chd implements cgf {
    private brq A;
    private chb B;
    private chb C;
    private boolean D;
    private long E;
    private long F;
    private long G;
    private long H;
    private int I;
    private int J;
    private long K;
    private boolean L;
    private boolean M;
    private long N;
    private float O;
    private ByteBuffer P;
    private int Q;
    private ByteBuffer R;
    private boolean S;
    private int T;
    private boolean U;
    private brr V;
    private AudioDeviceInfo W;
    private int X;
    private boolean Y;
    private boolean Z;
    public cgx a;
    private long aa;
    private Handler ab;
    private final ayq ac;
    private qcb ad;
    public cfd b;
    public cgc c;
    public cha d;
    public btb e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public cgo l;
    private final Context m;
    private final cgs n;
    private final cho o;
    private final buq p;
    private final chn q;
    private final agke r;
    private final ArrayDeque s;
    private int t;
    private final chc u;
    private final chc v;
    private final cbp w;
    private cha x;
    private buf y;
    private cfu z;

    public chd(cgz cgzVar) {
        Context context;
        Context context2 = cgzVar.a;
        this.m = context2 == null ? null : context2.getApplicationContext();
        this.A = brq.a;
        this.ac = cgzVar.f;
        this.t = 0;
        this.z = cgzVar.c;
        cgs cgsVar = new cgs();
        this.n = cgsVar;
        cho choVar = new cho();
        this.o = choVar;
        this.p = new buq();
        this.q = new chn();
        this.r = agke.r(choVar, cgsVar);
        this.O = 1.0f;
        this.T = 0;
        this.V = new brr();
        btb btbVar = btb.a;
        this.C = new chb(btbVar, 0L, 0L);
        this.e = btbVar;
        this.D = false;
        this.s = new ArrayDeque();
        this.u = new chc(this);
        this.v = new chc(this);
        this.w = cgzVar.e;
        int iJ = -1;
        if (Build.VERSION.SDK_INT >= 34 && (context = cgzVar.a) != null) {
            iJ = J(context.getDeviceId());
        }
        this.X = iJ;
    }

    private static int J(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    private final long K() {
        if (!this.d.c()) {
            return this.H;
        }
        long j = this.G;
        long j2 = this.d.d;
        int i = bwp.a;
        return ((j + j2) - 1) / j2;
    }

    private final void L(long j) {
        btb btbVar;
        boolean z = false;
        if (Y()) {
            btbVar = btb.a;
        } else {
            if (X()) {
                ayq ayqVar = this.ac;
                btbVar = this.e;
                float f = btbVar.b;
                bup bupVar = (bup) ayqVar.c;
                bupVar.l(f);
                float f2 = btbVar.c;
                ahno.F(f2 > 0.0f);
                if (bupVar.c != f2) {
                    bupVar.c = f2;
                    bupVar.f = true;
                }
            } else {
                btbVar = btb.a;
            }
            this.e = btbVar;
        }
        btb btbVar2 = btbVar;
        if (X()) {
            ayq ayqVar2 = this.ac;
            z = this.D;
            ((chl) ayqVar2.a).e = z;
        }
        this.D = z;
        this.s.add(new chb(btbVar2, Math.max(0L, j), this.d.a(K())));
        U(j);
        cgc cgcVar = this.c;
        if (cgcVar != null) {
            cgcVar.i(this.D);
        }
    }

    private final void M() {
        if (this.d.e.d) {
            this.Y = true;
        }
    }

    private final void N() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (this.l.g()) {
            this.h = false;
        }
        cgo cgoVar = this.l;
        if (cgoVar.k) {
            return;
        }
        cgoVar.k = true;
        cgr cgrVar = cgoVar.h;
        long jD = cgoVar.d();
        cgrVar.s = cgrVar.a();
        cgrVar.q = bwp.y(cgrVar.a.b());
        cgrVar.t = jD;
        cgoVar.d.stop();
    }

    private final void O(long j) throws cge {
        ab();
        if (this.R == null) {
            if (!this.y.h()) {
                ByteBuffer byteBuffer = this.P;
                if (byteBuffer != null) {
                    S(byteBuffer);
                    ab();
                    return;
                }
                return;
            }
            while (!this.y.g()) {
                do {
                    ByteBuffer byteBufferB = this.y.b();
                    if (byteBufferB.hasRemaining()) {
                        S(byteBufferB);
                        ab();
                    } else {
                        ByteBuffer byteBuffer2 = this.P;
                        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                            return;
                        } else {
                            this.y.f(this.P);
                        }
                    }
                } while (this.R == null);
                return;
            }
        }
    }

    private final void P() {
        cha chaVar = this.d;
        if (chaVar != null) {
            cha chaVar2 = this.x;
            if (chaVar2 != null) {
                this.d = chaVar2;
                this.x = null;
                chaVar = chaVar2;
            }
            try {
                this.d = this.d.b(this.z.b(aa(chaVar.b)));
            } catch (cfn e) {
                throw new IllegalStateException(new cga(e, this.d.a));
            }
        }
        i();
    }

    private final void Q() {
        if (W()) {
            cgo cgoVar = this.l;
            btb btbVar = this.e;
            try {
                cgoVar.d.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(bwp.a(btbVar.b, 0.1f, cgoVar.f)).setPitch(bwp.a(btbVar.c, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                bvx.f("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            cgr cgrVar = cgoVar.h;
            cgrVar.h = cgoVar.d.getPlaybackParams().getSpeed();
            cgrVar.g.c(0);
            cgrVar.e();
            PlaybackParams playbackParams = this.l.d.getPlaybackParams();
            this.e = new btb(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    private final void R(btb btbVar) {
        chb chbVar = new chb(btbVar, -9223372036854775807L, -9223372036854775807L);
        if (W()) {
            this.B = chbVar;
        } else {
            this.C = chbVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0267  */
    /* JADX WARN: Code duplicated, block: B:102:0x026e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[PHI: r11
      0x00d3: PHI (r11v56 double) = (r11v55 double), (r11v67 double) binds: [B:42:0x00d1, B:34:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[PHI: r11
      0x00d9: PHI (r11v61 double) = (r11v55 double), (r11v67 double) binds: [B:42:0x00d1, B:34:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x016f A[PHI: r11
      0x016f: PHI (r11v26 float) = (r11v25 float), (r11v63 float) binds: [B:54:0x016d, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0174 A[PHI: r11
      0x0174: PHI (r11v31 float) = (r11v25 float), (r11v63 float) binds: [B:54:0x016d, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x019b  */
    /* JADX WARN: Code duplicated, block: B:65:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Code duplicated, block: B:95:0x021a  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:97:0x023a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0251  */
    /* JADX WARN: Code duplicated, block: B:99:0x0264  */
    private final void S(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        double d;
        float fA;
        float f4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double dAo;
        double d2;
        ahno.O(this.R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.d.c()) {
                int iU = (int) bwp.u(bwp.y(20L), this.d.e.b);
                long jK = K();
                long j = iU;
                if (jK < j) {
                    cha chaVar = this.d;
                    int i12 = chaVar.e.a;
                    int i13 = chaVar.d;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i14 = (int) jK;
                    while (byteBuffer.hasRemaining() && i14 < iU) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i3 = ((byteBuffer.get() & 255) - 128) << 24;
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    if (i12 == 22) {
                                        i8 = byteBuffer.get() & 255;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    } else if (i12 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i12 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else if (i12 != 1610612736) {
                                        if (i12 == 1879048192) {
                                            dAo = bwp.ao(byteBuffer.getDouble());
                                            if (dAo < 0.0d) {
                                                d2 = (-dAo) * (-2.147483648E9d);
                                            } else {
                                                d2 = dAo * 2.147483647E9d;
                                            }
                                        } else if (i12 == 1895825408) {
                                            fA = bwp.a(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                            if (fA < 0.0f) {
                                                f4 = (-fA) * (-2.1474836E9f);
                                            } else {
                                                f4 = fA * 2.1474836E9f;
                                            }
                                            i3 = (int) f4;
                                        } else {
                                            if (i12 != 1912602624) {
                                                throw new IllegalStateException();
                                            }
                                            dAo = bwp.ao(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())));
                                            if (dAo < 0.0d) {
                                                d2 = (-dAo) * (-2.147483648E9d);
                                            } else {
                                                d2 = dAo * 2.147483647E9d;
                                            }
                                        }
                                        i3 = (int) d2;
                                    } else {
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = byteBuffer.get() & 255;
                                    }
                                    i3 = i8 | i9 | i10 | i11;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                fA = bwp.a(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fA < 0.0f) {
                                    f4 = (-fA) * (-2.1474836E9f);
                                } else {
                                    f4 = fA * 2.1474836E9f;
                                }
                                i3 = (int) f4;
                            }
                            i4 = (int) ((((long) i3) * ((long) i14)) / j);
                            if (i12 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 3) {
                                byteBufferOrder.put((byte) ((i4 >> 24) + SemanticState.Focused));
                            } else if (i12 != 4) {
                                f = i4;
                                if (i4 < 0) {
                                    byteBufferOrder.putFloat((-f) / (-2.1474836E9f));
                                } else {
                                    byteBufferOrder.putFloat(f / 2.1474836E9f);
                                }
                            } else if (i12 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i12 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i12 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i12 != 1879048192) {
                                if (i12 != 1895825408) {
                                    f2 = i4;
                                    if (i4 < 0) {
                                        f3 = (-f2) / (-2.1474836E9f);
                                    } else {
                                        f3 = f2 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f3)));
                                } else {
                                    if (i12 == 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                            if (byteBuffer.position() == iPosition + i13) {
                                i14++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i14)) / j);
                        if (i12 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 3) {
                            byteBufferOrder.put((byte) ((i4 >> 24) + SemanticState.Focused));
                        } else if (i12 != 4) {
                            f = i4;
                            if (i4 < 0) {
                                byteBufferOrder.putFloat((-f) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(f / 2.1474836E9f);
                            }
                        } else if (i12 != 21) {
                            byteBufferOrder.put((byte) (i4 >> 8));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 22) {
                            byteBufferOrder.put((byte) i4);
                            byteBufferOrder.put((byte) (i4 >> 8));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 268435456) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                            byteBufferOrder.put((byte) (i4 >> 16));
                        } else if (i12 != 1342177280) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 8));
                        } else if (i12 != 1610612736) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 8));
                            byteBufferOrder.put((byte) i4);
                        } else if (i12 != 1879048192) {
                            if (i12 != 1895825408) {
                                f2 = i4;
                                if (i4 < 0) {
                                    f3 = (-f2) / (-2.1474836E9f);
                                } else {
                                    f3 = f2 / 2.1474836E9f;
                                }
                                byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f3)));
                            } else {
                                if (i12 == 1912602624) {
                                    throw new IllegalStateException();
                                }
                                if (i4 < 0) {
                                    d = (-i4) / (-2.147483648E9d);
                                } else {
                                    d = ((double) i4) / 2.147483647E9d;
                                }
                                byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                        } else {
                            byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                        }
                        if (byteBuffer.position() == iPosition + i13) {
                            i14++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.R = byteBuffer2;
        }
    }

    private final void T() {
        if (W()) {
            cgo cgoVar = this.l;
            cgoVar.d.setVolume(this.O);
        }
    }

    private final void U(long j) {
        long j2;
        cha chaVar = this.d;
        this.y = chaVar.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.f;
            if (chaVar.g != btn.a && this.d.h != null) {
                btl btlVar = new btl();
                cha chaVar2 = this.d;
                chaVar2.g.m(chaVar2.h, btlVar);
                j2 += btlVar.f;
            }
        }
        buf bufVar = this.y;
        acbr acbrVar = new acbr((byte[]) null);
        cha chaVar3 = this.d;
        acbrVar.b = chaVar3.g;
        acbrVar.c = chaVar3.h;
        acbrVar.a = j2;
        bufVar.d(acbrVar.a());
    }

    private final boolean V() throws cge {
        ByteBuffer byteBuffer;
        if (this.y.h()) {
            this.y.e();
            O(Long.MIN_VALUE);
            if (this.y.g() && ((byteBuffer = this.R) == null || !byteBuffer.hasRemaining())) {
                return true;
            }
        } else {
            ab();
            if (this.R == null) {
                return true;
            }
        }
        return false;
    }

    private final boolean W() {
        return this.l != null;
    }

    private final boolean X() {
        if (!this.d.c()) {
            return false;
        }
        int i = this.d.a.L;
        return true;
    }

    private final boolean Y() {
        cha chaVar = this.d;
        return chaVar != null && chaVar.e.i;
    }

    private final cgo Z(cft cftVar) throws cgb {
        try {
            return this.z.f(cftVar);
        } catch (cfr e) {
            cgb cgbVar = new cgb(cftVar.b, cftVar.c, cftVar.a, cftVar.e, this.d.a, cftVar.d, e);
            cgc cgcVar = this.c;
            if (cgcVar != null) {
                cgcVar.c(cgbVar);
            }
            throw cgbVar;
        }
    }

    private final cfp aa(bse bseVar) {
        cfo cfoVar = new cfo(bseVar);
        cfoVar.b = this.A;
        cfoVar.d = this.t != 0;
        cfoVar.c = this.W;
        cfoVar.e = this.T;
        cfoVar.g = -1;
        cfoVar.f = this.X;
        return new cfp(cfoVar);
    }

    private final void ab() throws cge {
        cgc cgcVar;
        qcb qcbVar;
        if (this.R == null || this.v.c()) {
            return;
        }
        int iRemaining = this.R.remaining();
        boolean z = false;
        try {
            cgo cgoVar = this.l;
            ByteBuffer byteBuffer = this.R;
            int i = this.Q;
            boolean z2 = cgoVar.i;
            if (!z2 && cgoVar.n == 0) {
                cgoVar.n = azz.d(cgoVar.e.a, byteBuffer);
            }
            dje djeVar = cgoVar.p;
            if (djeVar.i()) {
                int underrunCount = cgoVar.d.getUnderrunCount();
                int i2 = cgoVar.o;
                cgoVar.o = underrunCount;
                if (underrunCount > i2) {
                    djeVar.h(-1, new cce(13));
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            cft cftVar = cgoVar.e;
            int iWrite = cgoVar.d.write(byteBuffer, byteBuffer.remaining(), 1);
            if (iWrite < 0) {
                boolean z3 = iWrite == -6 || iWrite == -32;
                if (z3 && (qcbVar = cgoVar.q) != null) {
                    Object obj = qcbVar.a;
                    if (((cgq) obj).b != null) {
                        cff cffVar = cff.a;
                        ((cgq) obj).a = cffVar;
                        ((cgq) obj).b.b(cffVar);
                    }
                }
                throw new cfm(iWrite, z3);
            }
            boolean z4 = iWrite == iRemaining2;
            if (z2) {
                cgoVar.l += (long) iWrite;
            } else if (z4) {
                cgoVar.m += ((long) cgoVar.n) * ((long) i);
            }
            this.j = SystemClock.elapsedRealtime();
            this.v.a();
            if (this.l.g()) {
                if (this.H > 0) {
                    this.Z = false;
                }
                if (this.i && (cgcVar = this.c) != null && !z4 && !this.Z) {
                    cgcVar.e();
                }
            }
            int iRemaining3 = iRemaining - this.R.remaining();
            if (this.d.c()) {
                this.G += (long) iRemaining3;
            }
            cha chaVar = this.d;
            if (z4) {
                if (!chaVar.c()) {
                    ahno.O(this.R == this.P);
                    this.H += (((long) this.I) * ((long) this.Q)) - this.K;
                    this.K = 0L;
                }
                this.R = null;
                return;
            }
            if (chaVar.c() || iRemaining3 <= 0) {
                return;
            }
            ahno.O(this.J > 0);
            long jD = bwp.D(this.J - this.R.remaining(), ((long) this.I) * ((long) this.Q), this.J, RoundingMode.CEILING);
            this.H += jD - this.K;
            this.K = jD;
        } catch (cfm e) {
            boolean z5 = e.b;
            if (z5) {
                if (K() > 0) {
                    z = true;
                } else if (this.l.g()) {
                    M();
                    z = true;
                }
            }
            cge cgeVar = new cge(e.a, this.d.a, z);
            cgc cgcVar2 = this.c;
            if (cgcVar2 != null) {
                cgcVar2.c(cgeVar);
            }
            if (z5) {
                throw cgeVar;
            }
            this.v.b(cgeVar);
        }
    }

    @Override // defpackage.cgf
    public final void A(AudioDeviceInfo audioDeviceInfo) {
        this.W = audioDeviceInfo;
        cgo cgoVar = this.l;
        if (cgoVar != null) {
            cgoVar.f(audioDeviceInfo);
        }
    }

    @Override // defpackage.cgf
    public final void B(boolean z) {
        this.D = z;
        R(Y() ? btb.a : this.e);
    }

    @Override // defpackage.cgf
    public final void C(int i) {
        int i2 = this.X;
        int iJ = J(i);
        if (i2 != iJ) {
            this.X = iJ;
            P();
        }
    }

    @Override // defpackage.cgf
    public final void D(float f) {
        if (this.O != f) {
            this.O = f;
            T();
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0321  */
    /* JADX WARN: Code duplicated, block: B:151:0x0327  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0278, code lost:
    
        if (r0 != 0) goto L117;
     */
    @Override // defpackage.cgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(java.nio.ByteBuffer r19, long r20, int r22) throws defpackage.cge, defpackage.cgb {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.E(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // defpackage.cgf
    public final boolean F() {
        if (W() && (Build.VERSION.SDK_INT < 29 || !this.l.g() || !this.h)) {
            long jK = K();
            long jC = this.l.c();
            cgo cgoVar = this.l;
            cgoVar.getClass();
            if (jK > bwp.u(jC, cgoVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgf
    public final boolean G() {
        if (W()) {
            return this.S && !F();
        }
        return true;
    }

    @Override // defpackage.cgf
    public final boolean H(bse bseVar) {
        return a(bseVar) != 0;
    }

    public final boolean I() {
        return this.z.e();
    }

    @Override // defpackage.cgf
    public final int a(bse bseVar) {
        boolean z;
        int i = bseVar.L;
        if (!bwp.ab(i) || i == 2) {
            z = false;
        } else {
            bsd bsdVar = new bsd(bseVar);
            bsdVar.J = 2;
            bseVar = new bse(bsdVar);
            z = true;
        }
        int i2 = this.z.a(aa(bseVar)).d;
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    @Override // defpackage.cgf
    public final long b() {
        if (!W()) {
            return -9223372036854775807L;
        }
        if (this.d.c()) {
            return this.d.a(this.l.b());
        }
        long jB = this.l.b();
        int iE = azz.e(this.d.e.a);
        ahno.O(iE != -2147483647);
        return bwp.D(jB, 1000000L, iE, RoundingMode.DOWN);
    }

    @Override // defpackage.cgf
    public final long c(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        long jC;
        if (!W() || this.M) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.l.c(), this.d.a(K()));
        while (true) {
            arrayDeque = this.s;
            if (arrayDeque.isEmpty() || jMin < ((chb) arrayDeque.getFirst()).c) {
                break;
            }
            this.C = (chb) arrayDeque.remove();
        }
        chb chbVar = this.C;
        long j2 = jMin - chbVar.c;
        long jV = bwp.v(j2, chbVar.a.b);
        if (arrayDeque.isEmpty()) {
            bup bupVar = (bup) this.ac.c;
            if (bupVar.h()) {
                if (bupVar.i >= 1024) {
                    long j3 = bupVar.h;
                    buo buoVar = bupVar.g;
                    buoVar.getClass();
                    long jB = j3 - ((long) buoVar.b());
                    int i = bupVar.e.b;
                    int i2 = bupVar.d.b;
                    jC = i == i2 ? bwp.C(j2, jB, bupVar.i) : bwp.C(j2, jB * ((long) i), bupVar.i * ((long) i2));
                } else {
                    jC = (long) (((double) bupVar.b) * j2);
                }
                j2 = jC;
            }
            chb chbVar2 = this.C;
            j = chbVar2.b + j2;
            chbVar2.d = j2 - jV;
        } else {
            chb chbVar3 = this.C;
            j = chbVar3.b + jV + chbVar3.d;
        }
        long j4 = ((chl) this.ac.a).f;
        long jA = j + this.d.a(j4);
        long j5 = this.aa;
        if (j4 <= j5) {
            return jA;
        }
        long jA2 = this.d.a(j4 - j5);
        this.aa = j4;
        this.k += jA2;
        Handler handler = this.ab;
        if (handler == null) {
            handler = new Handler(Looper.myLooper());
            this.ab = handler;
        }
        handler.removeCallbacksAndMessages(null);
        this.ab.postDelayed(new bkn(this, 13), 100L);
        return jA;
    }

    @Override // defpackage.cgf
    public final btb d() {
        return this.e;
    }

    @Override // defpackage.cgf
    public final cff e() {
        cfu cfuVar = this.z;
        if (cfuVar instanceof cgq) {
            return ((cgq) cfuVar).a;
        }
        return null;
    }

    @Override // defpackage.cgf
    public final cfl f(bse bseVar) {
        if (this.Y) {
            return cfl.a;
        }
        cfq cfqVarA = this.z.a(aa(bseVar));
        cfk cfkVar = new cfk();
        cfkVar.a = cfqVarA.a;
        cfkVar.b = cfqVarA.b;
        cfkVar.c = cfqVarA.c;
        return cfkVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cgf
    public final void g(cfz cfzVar) throws cga {
        buf bufVar;
        int iJ;
        int iJ2;
        bse bseVar;
        Object[] objArr = 0;
        if (this.ad == null && this.m != null) {
            qcb qcbVar = new qcb(this, objArr == true ? 1 : 0);
            this.ad = qcbVar;
            this.z.g(qcbVar);
        }
        bse bseVar2 = cfzVar.a;
        if ("audio/raw".equals(bseVar2.q)) {
            int i = bseVar2.L;
            ahno.F(bwp.ab(i));
            int i2 = bseVar2.I;
            iJ = bwp.j(i) * i2;
            agjz agjzVar = new agjz(4);
            agjzVar.j(this.r);
            agjzVar.h(this.p);
            agjzVar.i((Object[]) this.ac.b);
            bufVar = new buf(agjzVar.g());
            if (bufVar.equals(this.y)) {
                bufVar = this.y;
            }
            cho choVar = this.o;
            int i3 = bseVar2.M;
            int i4 = bseVar2.N;
            choVar.e = i3;
            choVar.f = i4;
            this.n.e = cfzVar.c;
            try {
                bug bugVarA = bufVar.a(new bug(bseVar2.K, i2, i));
                bsd bsdVar = new bsd(bseVar2);
                int i5 = bugVarA.d;
                bsdVar.J = i5;
                bsdVar.I = bugVarA.b;
                int i6 = bugVarA.c;
                bsdVar.G = i6;
                bsdVar.H = i6 == bseVar2.I ? bseVar2.J : -1;
                bse bseVar3 = new bse(bsdVar);
                iJ2 = i6 * bwp.j(i5);
                bseVar = bseVar3;
            } catch (bui e) {
                throw new cga(e, bseVar2);
            }
        } else {
            bufVar = new buf(agpi.a);
            iJ = -1;
            iJ2 = -1;
            bseVar = bseVar2;
        }
        buf bufVar2 = bufVar;
        cfp cfpVarAa = aa(bseVar);
        try {
            cft cftVarB = this.z.b(cfpVarAa);
            if (cftVarB.a == 0) {
                throw new cga("Invalid output encoding (isOffload=" + cftVarB.d + ')', cfpVarAa.a);
            }
            if (cftVarB.c == 0) {
                throw new cga("Invalid output channel config (isOffload=" + cftVarB.d + ')', cfpVarAa.a);
            }
            this.Y = false;
            btn btnVar = cfzVar.d;
            cnm cnmVar = cfzVar.e;
            cha chaVar = new cha(bseVar2, bseVar, iJ, iJ2, cftVarB, bufVar2, btnVar, cnmVar != null ? cnmVar.a : null);
            if (W()) {
                this.x = chaVar;
            } else {
                this.d = chaVar;
            }
        } catch (cfn e2) {
            throw new cga(e2, bseVar2);
        }
    }

    @Override // defpackage.cgf
    public final void i() {
        if (W()) {
            this.E = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.Z = false;
            this.I = 0;
            this.J = 0;
            this.K = 0L;
            this.C = new chb(this.e, 0L, 0L);
            this.N = 0L;
            this.B = null;
            this.s.clear();
            this.P = null;
            this.Q = 0;
            this.R = null;
            this.g = false;
            this.S = false;
            this.h = false;
            this.o.g = 0L;
            U(-9223372036854775807L);
            this.a = null;
            cha chaVar = this.x;
            if (chaVar != null) {
                this.d = chaVar;
                this.x = null;
            }
            cgo cgoVar = this.l;
            AudioTrack audioTrack = cgoVar.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                cgoVar.d.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && cgoVar.g()) {
                cgn cgnVar = cgoVar.j;
                cgnVar.getClass();
                cgnVar.c.d.unregisterStreamEventCallback(cgnVar.b);
                cgnVar.a.removeCallbacksAndMessages(null);
            }
            cgk cgkVar = cgoVar.g;
            if (cgkVar != null) {
                AudioRouting.OnRoutingChangedListener onRoutingChangedListener = cgkVar.c;
                onRoutingChangedListener.getClass();
                cgkVar.a.removeOnRoutingChangedListener(onRoutingChangedListener);
                cgkVar.c = null;
                cgoVar.g = null;
            }
            AudioTrack audioTrack2 = cgoVar.d;
            dje djeVar = cgoVar.p;
            Handler handlerH = bwp.H(null);
            boolean z = Build.VERSION.SDK_INT >= 29 && (bsc.c(9) || audioTrack2.isOffloadedPlayback());
            synchronized (cgo.a) {
                if (cgo.b == null) {
                    cgo.b = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: bwo
                        public final /* synthetic */ String a = "ExoPlayer:AudioTrackReleaseThread";

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            int i = bwp.a;
                            return new Thread(runnable, this.a);
                        }
                    });
                }
                cgo.c++;
                cgo.b.schedule(new gqc(z, audioTrack2, handlerH, djeVar, 1), 20L, TimeUnit.MILLISECONDS);
            }
            this.l = null;
        }
        this.v.a();
        this.u.a();
        this.aa = 0L;
        this.k = 0L;
        Handler handler = this.ab;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.cgf
    public final void j() {
        this.L = true;
    }

    @Override // defpackage.cgf
    public final void k() {
        this.i = false;
        if (W()) {
            cgo cgoVar = this.l;
            cgr cgrVar = cgoVar.h;
            cgrVar.e();
            if (cgrVar.q == -9223372036854775807L) {
                cgrVar.g.c(0);
            }
            cgrVar.s = cgrVar.a();
            if (!cgoVar.k || cgoVar.g()) {
                cgoVar.d.pause();
            }
        }
    }

    @Override // defpackage.cgf
    public final void l() {
        this.i = true;
        if (W()) {
            cgo cgoVar = this.l;
            cgr cgrVar = cgoVar.h;
            if (cgrVar.q != -9223372036854775807L) {
                cgrVar.q = bwp.y(cgrVar.a.b());
            }
            cgrVar.i = cgrVar.c();
            cgrVar.x = true;
            cgrVar.g.c(0);
            if (!cgoVar.k || cgoVar.g()) {
                cgoVar.d.play();
            }
        }
    }

    @Override // defpackage.cgf
    public final void m() {
        if (!this.S && W() && V()) {
            N();
            this.S = true;
        }
    }

    @Override // defpackage.cgf
    public final void n() {
        this.z.c();
    }

    @Override // defpackage.cgf
    public final void o() {
        i();
        int i = 0;
        while (true) {
            agke agkeVar = this.r;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            ((buj) agkeVar.get(i)).g();
            i++;
        }
        this.p.g();
        this.q.g();
        buf bufVar = this.y;
        if (bufVar != null) {
            int i2 = 0;
            while (true) {
                agke agkeVar2 = bufVar.a;
                if (i2 >= ((agpi) agkeVar2).d) {
                    break;
                }
                buj bujVar = (buj) agkeVar2.get(i2);
                buh buhVar = buh.a;
                bujVar.j();
                bujVar.g();
                i2++;
            }
            bufVar.b.clear();
            bufVar.c = new ByteBuffer[0];
            bug bugVar = bug.a;
            bufVar.d = false;
        }
        this.i = false;
        this.Y = false;
    }

    @Override // defpackage.cgf
    public final void p(brq brqVar) {
        if (this.A.equals(brqVar)) {
            return;
        }
        this.A = brqVar;
        P();
    }

    @Override // defpackage.cgf
    public final void q(cfu cfuVar) {
        if (cfuVar.equals(this.z)) {
            return;
        }
        this.z.c();
        this.z = cfuVar;
        qcb qcbVar = this.ad;
        if (qcbVar != null) {
            cfuVar.g(qcbVar);
        }
        P();
    }

    @Override // defpackage.cgf
    public final void r(int i) {
        if (this.U) {
            if (this.T != i) {
                return;
            } else {
                this.U = false;
            }
        }
        if (this.T != i) {
            this.T = i;
            P();
        }
    }

    @Override // defpackage.cgf
    public final void s(brr brrVar) {
        if (this.V.equals(brrVar)) {
            return;
        }
        int i = brrVar.a;
        float f = brrVar.b;
        if (this.l != null) {
            int i2 = this.V.a;
        }
        this.V = brrVar;
    }

    @Override // defpackage.cgf
    public final void t(bvd bvdVar) {
        this.z.d(bvdVar);
    }

    @Override // defpackage.cgf
    public final void u(cgc cgcVar) {
        this.c = cgcVar;
    }

    @Override // defpackage.cgf
    public final void v(int i, int i2) {
        cha chaVar;
        cgo cgoVar = this.l;
        if (cgoVar == null || !cgoVar.g() || (chaVar = this.d) == null || !chaVar.e.j) {
            return;
        }
        this.l.e(i, i2);
    }

    @Override // defpackage.cgf
    public final void w(int i) {
        ahno.O(Build.VERSION.SDK_INT >= 29);
        this.t = i;
    }

    @Override // defpackage.cgf
    public final void x(long j) {
        this.f = j;
    }

    @Override // defpackage.cgf
    public final void y(btb btbVar) {
        if (Y()) {
            this.e = btbVar;
            Q();
        } else {
            btb btbVar2 = new btb(bwp.a(btbVar.b, 0.1f, 8.0f), bwp.a(btbVar.c, 0.1f, 8.0f));
            this.e = btbVar2;
            R(btbVar2);
        }
    }

    @Override // defpackage.cgf
    public final void z(cfd cfdVar) {
        this.b = cfdVar;
    }

    @Override // defpackage.cgf
    public final void h() {
    }
}
