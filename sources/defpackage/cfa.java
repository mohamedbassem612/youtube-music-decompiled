package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfa implements cdz {
    private aae A;
    private aae B;
    public final PlaybackSession a;
    public String b;
    public PlaybackMetrics.Builder c;
    private final Context d;
    private final cfb f;
    private int l;
    private bta o;
    private bse p;
    private bse q;
    private bse r;
    private boolean s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private aae z;
    private final Executor e = azs.F();
    private final btm h = new btm();
    private final btl i = new btl();
    private final HashMap k = new HashMap();
    private final HashMap j = new HashMap();
    private final long g = SystemClock.elapsedRealtime();
    private int m = 0;
    private int n = 0;

    public cfa(Context context, PlaybackSession playbackSession) {
        this.d = context.getApplicationContext();
        this.a = playbackSession;
        ceu ceuVar = new ceu();
        this.f = ceuVar;
        ceuVar.c = this;
    }

    private static int d(int i) {
        switch (bwp.k(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void e(long j, bse bseVar, int i) {
        if (Objects.equals(this.q, bseVar)) {
            return;
        }
        if (this.q == null && i == 0) {
            i = 1;
        }
        this.q = bseVar;
        h(0, j, bseVar, i);
    }

    private final void f(long j, bse bseVar, int i) {
        if (Objects.equals(this.r, bseVar)) {
            return;
        }
        if (this.r == null && i == 0) {
            i = 1;
        }
        this.r = bseVar;
        h(2, j, bseVar, i);
    }

    private final void g(long j, bse bseVar, int i) {
        if (Objects.equals(this.p, bseVar)) {
            return;
        }
        if (this.p == null && i == 0) {
            i = 1;
        }
        this.p = bseVar;
        h(1, j, bseVar, i);
    }

    private final void h(int i, long j, bse bseVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.g);
        if (bseVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = bseVar.p;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = bseVar.q;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = bseVar.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = bseVar.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = bseVar.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = bseVar.x;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = bseVar.I;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = bseVar.K;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = bseVar.d;
            if (str4 != null) {
                int i9 = bwp.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = bseVar.A;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.y = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.e.execute(new Runnable() { // from class: cev
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private final boolean i(aae aaeVar) {
        if (aaeVar != null) {
            cfb cfbVar = this.f;
            if (((String) aaeVar.c).equals(cfbVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdz
    public final void I(cdy cdyVar, cni cniVar) {
        cnm cnmVar = cdyVar.d;
        if (cnmVar != null) {
            bse bseVar = cniVar.c;
            bseVar.getClass();
            aae aaeVar = new aae(bseVar, cniVar.d, this.f.d(cdyVar.b, cnmVar));
            int i = cniVar.b;
            if (i != 0) {
                if (i == 1) {
                    this.A = aaeVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.B = aaeVar;
                        return;
                    }
                    return;
                }
            }
            this.z = aaeVar;
        }
    }

    @Override // defpackage.cdz
    public final void S(cdy cdyVar, cnd cndVar, cni cniVar, IOException iOException, boolean z) {
        this.t = cniVar.a;
    }

    @Override // defpackage.cdz
    public final void Z(cdy cdyVar, bta btaVar) {
        this.o = btaVar;
    }

    public final void a() {
        PlaybackMetrics.Builder builder = this.c;
        if (builder != null && this.y) {
            builder.setAudioUnderrunCount(this.x);
            this.c.setVideoFramesDropped(this.v);
            this.c.setVideoFramesPlayed(this.w);
            Long l = (Long) this.j.get(this.b);
            this.c.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.k.get(this.b);
            this.c.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.c.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.c.build();
            this.e.execute(new Runnable() { // from class: cey
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.c = null;
        this.b = null;
        this.x = 0;
        this.v = 0;
        this.w = 0;
        this.p = null;
        this.q = null;
        this.r = null;
        this.y = false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01df  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fe A[PHI: r10
      0x01fe: PHI (r10v7 int) = (r10v6 int), (r10v12 int), (r10v12 int) binds: [B:142:0x01fc, B:105:0x0183, B:107:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0200  */
    /* JADX WARN: Code duplicated, block: B:146:0x0204  */
    /* JADX WARN: Code duplicated, block: B:148:0x020a  */
    /* JADX WARN: Code duplicated, block: B:150:0x020e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:153:0x0219  */
    /* JADX WARN: Code duplicated, block: B:154:0x0224  */
    /* JADX WARN: Code duplicated, block: B:164:0x0272  */
    /* JADX WARN: Code duplicated, block: B:165:0x0278  */
    /* JADX WARN: Code duplicated, block: B:167:0x027c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0281  */
    @Override // defpackage.cdz
    public final void aC(bth bthVar, boy boyVar) {
        aae aaeVar;
        int i;
        int i2;
        int i3;
        bse bseVar;
        int i4;
        int i5;
        int iD;
        bsa bsaVar;
        int i6;
        int i7;
        if (boyVar.n() != 0) {
            int errorCode = 0;
            for (int i8 = 0; i8 < boyVar.n(); i8++) {
                int iA = ((bsb) boyVar.a).a(i8);
                cdy cdyVarO = boyVar.o(iA);
                if (iA == 0) {
                    this.f.h(cdyVarO);
                } else {
                    cfb cfbVar = this.f;
                    if (iA == 11) {
                        cfbVar.g(cdyVarO, this.l);
                    } else {
                        cfbVar.f(cdyVarO);
                    }
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (boyVar.p(0)) {
                cdy cdyVarO2 = boyVar.o(0);
                if (this.c != null) {
                    b(cdyVarO2.b, cdyVarO2.d);
                }
            }
            if (boyVar.p(2) && this.c != null) {
                agke agkeVar = bthVar.x().b;
                int size = agkeVar.size();
                int i9 = 0;
                loop1: while (true) {
                    if (i9 >= size) {
                        bsaVar = null;
                        break;
                    }
                    btt bttVar = (btt) agkeVar.get(i9);
                    int i10 = 0;
                    while (true) {
                        i7 = i9 + 1;
                        if (i10 < bttVar.a) {
                            if (bttVar.d(i10) && (bsaVar = bttVar.b(i10).u) != null) {
                                break loop1;
                            } else {
                                i10++;
                            }
                        }
                    }
                    i9 = i7;
                }
                if (bsaVar != null) {
                    PlaybackMetrics.Builder builder = this.c;
                    int i11 = bwp.a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= bsaVar.c) {
                            i6 = 1;
                            break;
                        }
                        UUID uuid = bsaVar.a(i12).a;
                        if (uuid.equals(brt.d)) {
                            i6 = 3;
                            break;
                        } else if (uuid.equals(brt.e)) {
                            i6 = 2;
                            break;
                        } else {
                            if (uuid.equals(brt.c)) {
                                i6 = 6;
                                break;
                            }
                            i12++;
                        }
                    }
                    builder.setDrmType(i6);
                }
            }
            if (boyVar.p(1011)) {
                this.x++;
            }
            bta btaVar = this.o;
            if (btaVar != null) {
                Context context = this.d;
                int i13 = this.t;
                int i14 = btaVar.a;
                if (i14 == 1001) {
                    iD = 20;
                } else {
                    cbo cboVar = (cbo) btaVar;
                    boolean z = cboVar.c == 1;
                    int i15 = cboVar.g;
                    Throwable cause = btaVar.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof byv) {
                            errorCode = ((byv) cause).d;
                            iD = 5;
                        } else {
                            if ((cause instanceof byu) || (cause instanceof bsz)) {
                                iD = i13 != 4 ? 11 : 10;
                            } else {
                                boolean z2 = cause instanceof byt;
                                if (z2 || (cause instanceof bzh)) {
                                    if (afjq.l(context).b() == 1) {
                                        iD = 3;
                                    } else {
                                        Throwable cause2 = cause.getCause();
                                        if (cause2 instanceof UnknownHostException) {
                                            errorCode = 0;
                                            iD = 6;
                                        } else if (cause2 instanceof SocketTimeoutException) {
                                            errorCode = 0;
                                            iD = 7;
                                        } else if (z2 && ((byt) cause).c == 1) {
                                            iD = 4;
                                        } else {
                                            errorCode = 0;
                                            iD = 8;
                                        }
                                    }
                                } else if (i14 == 1002) {
                                    iD = 21;
                                } else if (cause instanceof cjt) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                        errorCode = bwp.l(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                        iD = d(errorCode);
                                    } else if (cause3 instanceof MediaDrmResetException) {
                                        iD = 27;
                                    } else if (cause3 instanceof NotProvisionedException) {
                                        iD = 24;
                                    } else if (cause3 instanceof DeniedByServerException) {
                                        iD = 29;
                                    } else if (cause3 instanceof cko) {
                                        iD = 23;
                                    } else {
                                        iD = cause3 instanceof cjq ? 28 : 30;
                                    }
                                } else if ((cause instanceof byp) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause4 = cause.getCause();
                                    cause4.getClass();
                                    Throwable cause5 = cause4.getCause();
                                    i5 = 31;
                                    if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                        iD = 32;
                                    } else {
                                        iD = i5;
                                    }
                                } else {
                                    iD = 9;
                                }
                            }
                            errorCode = 0;
                        }
                    } else if (z) {
                        iD = 35;
                        if (i15 != 0 && i15 != 1) {
                            if (i15 == 3) {
                                iD = 15;
                            } else if (i15 == 2) {
                                iD = 23;
                            } else if (cause instanceof clq) {
                                errorCode = bwp.l(((clq) cause).d);
                                iD = 13;
                            } else {
                                i5 = 14;
                                if (cause instanceof clm) {
                                    errorCode = ((clm) cause).b;
                                    iD = 14;
                                } else if (cause instanceof OutOfMemoryError) {
                                    iD = i5;
                                } else if (cause instanceof cgb) {
                                    iD = 17;
                                } else if (cause instanceof cge) {
                                    errorCode = ((cge) cause).a;
                                    iD = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    iD = d(errorCode);
                                } else {
                                    iD = 22;
                                }
                            }
                        }
                        errorCode = 0;
                    } else if (cause instanceof clq) {
                        errorCode = bwp.l(((clq) cause).d);
                        iD = 13;
                    } else {
                        i5 = 14;
                        if (cause instanceof clm) {
                            errorCode = ((clm) cause).b;
                            iD = 14;
                        } else {
                            if (cause instanceof OutOfMemoryError) {
                                iD = i5;
                            } else if (cause instanceof cgb) {
                                iD = 17;
                            } else if (cause instanceof cge) {
                                errorCode = ((cge) cause).a;
                                iD = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iD = d(errorCode);
                            } else {
                                iD = 22;
                            }
                            errorCode = 0;
                        }
                    }
                }
                final PlaybackErrorEvent playbackErrorEventBuild = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.g).setErrorCode(iD).setSubErrorCode(errorCode).setException(btaVar).build();
                this.e.execute(new Runnable() { // from class: cex
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.reportPlaybackErrorEvent(playbackErrorEventBuild);
                    }
                });
                this.y = true;
                this.o = null;
            }
            if (boyVar.p(2)) {
                btu btuVarX = bthVar.x();
                boolean zA = btuVarX.a(2);
                boolean zA2 = btuVarX.a(1);
                boolean zA3 = btuVarX.a(3);
                if (zA || zA2) {
                    if (zA) {
                        bseVar = null;
                        i4 = 0;
                    } else {
                        bseVar = null;
                        i4 = 0;
                        g(jElapsedRealtime, null, 0);
                    }
                    if (!zA2) {
                        e(jElapsedRealtime, bseVar, i4);
                    }
                    if (!zA3) {
                        f(jElapsedRealtime, bseVar, i4);
                    }
                } else if (zA3) {
                    zA3 = true;
                    if (zA) {
                        bseVar = null;
                        i4 = 0;
                        g(jElapsedRealtime, null, 0);
                    } else {
                        bseVar = null;
                        i4 = 0;
                    }
                    if (!zA2) {
                        e(jElapsedRealtime, bseVar, i4);
                    }
                    if (!zA3) {
                        f(jElapsedRealtime, bseVar, i4);
                    }
                }
            }
            if (i(this.z)) {
                aae aaeVar2 = this.z;
                bse bseVar2 = (bse) aaeVar2.b;
                if (bseVar2.x != -1) {
                    g(jElapsedRealtime, bseVar2, aaeVar2.a);
                    this.z = null;
                }
            }
            if (i(this.A)) {
                aae aaeVar3 = this.A;
                e(jElapsedRealtime, (bse) aaeVar3.b, aaeVar3.a);
                aaeVar = null;
                this.A = null;
            } else {
                aaeVar = null;
            }
            if (i(this.B)) {
                aae aaeVar4 = this.B;
                f(jElapsedRealtime, (bse) aaeVar4.b, aaeVar4.a);
                this.B = aaeVar;
            }
            switch (afjq.l(this.d).b()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 9;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                case 8:
                default:
                    i = 1;
                    break;
                case 7:
                    i = 3;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 7;
                    break;
            }
            if (i != this.n) {
                this.n = i;
                final NetworkEvent networkEventBuild = new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.g).build();
                this.e.execute(new Runnable() { // from class: cew
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.reportNetworkEvent(networkEventBuild);
                    }
                });
            }
            if (bthVar.n() != 2) {
                this.s = false;
            }
            ccm ccmVar = (ccm) bthVar;
            ccmVar.ae();
            if (ccmVar.A.g == null) {
                this.u = false;
                i2 = 10;
            } else {
                i2 = 10;
                if (boyVar.p(10)) {
                    this.u = true;
                }
            }
            int iN = bthVar.n();
            if (this.s) {
                i3 = 5;
            } else if (this.u) {
                i3 = 13;
            } else if (iN == 4) {
                i3 = 11;
            } else if (iN == 2) {
                int i16 = this.m;
                if (i16 == 0 || i16 == 2 || i16 == 12) {
                    i3 = 2;
                } else if (bthVar.G()) {
                    i3 = bthVar.o() != 0 ? i2 : 6;
                } else {
                    i3 = 7;
                }
            } else if (iN != 3) {
                i3 = (iN != 1 || this.m == 0) ? this.m : 12;
            } else if (bthVar.G()) {
                i3 = bthVar.o() != 0 ? 9 : 3;
            } else {
                i3 = 4;
            }
            if (this.m != i3) {
                this.m = i3;
                this.y = true;
                final PlaybackStateEvent playbackStateEventBuild = new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.g).build();
                this.e.execute(new Runnable() { // from class: cez
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.reportPlaybackStateEvent(playbackStateEventBuild);
                    }
                });
            }
            if (boyVar.p(1028)) {
                this.f.e(boyVar.o(1028));
            }
        }
    }

    @Override // defpackage.cdz
    public final void ab(cdy cdyVar, btg btgVar, btg btgVar2, int i) {
        if (i == 1) {
            this.s = true;
            i = 1;
        }
        this.l = i;
    }

    @Override // defpackage.cdz
    public final void ao(cdy cdyVar, cay cayVar) {
        this.v += cayVar.g;
        this.w += cayVar.e;
    }

    @Override // defpackage.cdz
    public final void ar(cdy cdyVar, btz btzVar) {
        aae aaeVar = this.z;
        if (aaeVar != null) {
            bse bseVar = (bse) aaeVar.b;
            if (bseVar.x == -1) {
                bsd bsdVar = new bsd(bseVar);
                bsdVar.u = btzVar.b;
                bsdVar.v = btzVar.c;
                this.z = new aae(new bse(bsdVar), aaeVar.a, (String) aaeVar.c);
            }
        }
    }

    @Override // defpackage.cdz
    public final void aw(cdy cdyVar, int i, long j) {
        cnm cnmVar = cdyVar.d;
        if (cnmVar != null) {
            cfb cfbVar = this.f;
            btn btnVar = cdyVar.b;
            HashMap map = this.k;
            String strD = cfbVar.d(btnVar, cnmVar);
            Long l = (Long) map.get(strD);
            HashMap map2 = this.j;
            Long l2 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    public final void b(btn btnVar, cnm cnmVar) {
        int iA;
        PlaybackMetrics.Builder builder = this.c;
        if (cnmVar == null || (iA = btnVar.a(cnmVar.a)) == -1) {
            return;
        }
        btl btlVar = this.i;
        int i = 0;
        btnVar.d(iA, btlVar, false);
        btm btmVar = this.h;
        btnVar.e(btlVar.c, btmVar, 0L);
        bsp bspVar = btmVar.d.c;
        if (bspVar != null) {
            int iR = bwp.r(bspVar.a, bspVar.b);
            if (iR == 0) {
                i = 3;
            } else if (iR != 1) {
                i = iR != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (btmVar.n != -9223372036854775807L && !btmVar.l && !btmVar.j && !btmVar.d()) {
            builder.setMediaDurationMillis(btmVar.b());
        }
        builder.setPlaybackType(true != btmVar.d() ? 1 : 2);
        this.y = true;
    }

    public final void c(cdy cdyVar, String str) {
        cnm cnmVar = cdyVar.d;
        if ((cnmVar == null || !cnmVar.c()) && str.equals(this.b)) {
            a();
        }
        this.j.remove(str);
        this.k.remove(str);
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void J(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void K(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void N(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void af(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void at(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void au(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ax(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void B(cdy cdyVar, brq brqVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void D(cdy cdyVar, String str) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void E(cdy cdyVar, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void F(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void G(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void L(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void M(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void O(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Q(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void R(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void T(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void U(cdy cdyVar, bsx bsxVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void W(cdy cdyVar, btb btbVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void X(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void Y(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aA(cdy cdyVar, cri criVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aB(cdy cdyVar, cri criVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ae(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ag(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ai(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aj(cdy cdyVar, btu btuVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ak(cdy cdyVar, cni cniVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void al(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void an(cdy cdyVar, String str) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ap(cdy cdyVar, cay cayVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void as(cdy cdyVar, float f) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void av(cdy cdyVar, bse bseVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ay(cdy cdyVar, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void P(cdy cdyVar, int i, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void V(cdy cdyVar, boolean z, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aa(cdy cdyVar, boolean z, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ac(cdy cdyVar, Object obj, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ah(cdy cdyVar, int i, int i2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aq(cdy cdyVar, bse bseVar, caz cazVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void C(cdy cdyVar, String str, long j, long j2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void H(cdy cdyVar, int i, long j, long j2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void ad(cdy cdyVar, int i, int i2, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void am(cdy cdyVar, String str, long j, long j2) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void az(cdy cdyVar, int i, int i2, float f) {
    }
}
