package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csj implements cdz {
    private static final ager a = new ager(", ");
    private static final NumberFormat b;
    private final String c = "EventLogger";
    private final btm d = new btm();
    private final btl e = new btl();
    private final long f = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        b = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    private final String b(cdy cdyVar, String str, String str2, Throwable th) {
        String strCd = str + " [" + c(cdyVar);
        if (th instanceof bta) {
            strCd = strCd + ", errorCode=" + ((bta) th).a();
        }
        if (str2 != null) {
            strCd = a.cd(str2, strCd, ", ");
        }
        String strB = bvx.b(th);
        if (!TextUtils.isEmpty(strB)) {
            strCd = strCd + "\n  " + strB.replace("\n", "\n  ") + '\n';
        }
        return strCd.concat("]");
    }

    private final String c(cdy cdyVar) {
        String str = "window=" + cdyVar.c;
        cnm cnmVar = cdyVar.d;
        if (cnmVar != null) {
            str = str + ", period=" + cdyVar.b.a(cnmVar.a);
            if (cnmVar.c()) {
                str = (str + ", adGroup=" + cnmVar.b) + ", ad=" + cnmVar.c;
            }
        }
        long j = cdyVar.a;
        long j2 = this.f;
        long j3 = cdyVar.e;
        return "eventTime=" + d(j - j2) + ", mediaPos=" + d(j3) + ", " + str;
    }

    private static String d(long j) {
        return j == -9223372036854775807L ? "?" : b.format(j / 1000.0f);
    }

    private final void e(cdy cdyVar, String str) {
        bvx.g(b(cdyVar, str, null, null));
    }

    private final void f(cdy cdyVar, String str, String str2) {
        bvx.g(b(cdyVar, str, str2, null));
    }

    private final void g(cdy cdyVar, String str, String str2, Throwable th) {
        a(b(cdyVar, str, str2, th));
    }

    private static final void h(bsx bsxVar, String str) {
        for (int i = 0; i < bsxVar.a(); i++) {
            bvx.g(str.concat(String.valueOf(String.valueOf(bsxVar.b(i)))));
        }
    }

    private static String i(cri criVar) {
        String strConcat;
        String str;
        ArrayList arrayList = new ArrayList();
        int i = criVar.a;
        if (i != -1) {
            int i2 = bwp.a;
            if (i == -1) {
                str = "unset";
            } else if (i == 0) {
                str = "invalid";
            } else if (i == 30) {
                str = "dts-uhd-p2";
            } else if (i == 31) {
                str = "dsd";
            } else if (i == 268435456) {
                str = "pcm-16be";
            } else if (i == 1073741824) {
                str = "aac-er-bsac";
            } else if (i == 1342177280) {
                str = "pcm-24be";
            } else if (i == 1610612736) {
                str = "pcm-32be";
            } else if (i == 1879048192) {
                str = "pcm-double";
            } else if (i == 1895825408) {
                str = "pcm-float-be";
            } else if (i != 1912602624) {
                switch (i) {
                    case 2:
                        str = "pcm-16";
                        break;
                    case 3:
                        str = "pcm-8";
                        break;
                    case 4:
                        str = "pcm-float";
                        break;
                    case 5:
                        str = "ac3";
                        break;
                    case 6:
                        str = "eac3";
                        break;
                    case 7:
                        str = "dts";
                        break;
                    case 8:
                        str = "dts-hd";
                        break;
                    case 9:
                        str = "mp3";
                        break;
                    case 10:
                        str = "aac-lc";
                        break;
                    case 11:
                        str = "aac-he-v1";
                        break;
                    case 12:
                        str = "aac-he-v2";
                        break;
                    default:
                        switch (i) {
                            case 14:
                                str = "truehd";
                                break;
                            case 15:
                                str = "aac-eld";
                                break;
                            case 16:
                                str = "aac-xhe";
                                break;
                            case 17:
                                str = "ac4";
                                break;
                            case 18:
                                str = "eac3-joc";
                                break;
                            default:
                                switch (i) {
                                    case 20:
                                        str = "opus";
                                        break;
                                    case 21:
                                        str = "pcm-24";
                                        break;
                                    case 22:
                                        str = "pcm-32";
                                        break;
                                    default:
                                        str = "unknown(" + i + ')';
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                str = "pcm-double-be";
            }
            arrayList.add("enc=".concat(str));
        }
        int i3 = criVar.d;
        switch (i3) {
            case 4:
                strConcat = "mono";
                break;
            case 12:
                strConcat = "stereo";
                break;
            case 204:
                strConcat = "quad";
                break;
            case 252:
                strConcat = "5.1";
                break;
            case 6396:
                strConcat = "7.1";
                break;
            case 737532:
                strConcat = "5.1.4";
                break;
            case 743676:
                strConcat = "7.1.4";
                break;
            case 3145980:
                strConcat = "5.1.2";
                break;
            case 3152124:
                strConcat = "7.1.2";
                break;
            case 202070268:
                strConcat = "9.1.4";
                break;
            case 205215996:
                strConcat = "9.1.6";
                break;
            default:
                strConcat = "0x".concat(String.valueOf(Integer.toHexString(i3)));
                break;
        }
        arrayList.add("channelConf=".concat(strConcat));
        arrayList.add("sampleRate=" + criVar.c);
        arrayList.add("bufferSize=" + criVar.b);
        if (criVar.e) {
            arrayList.add("offload");
        }
        return a.b(arrayList);
    }

    @Override // defpackage.cdz
    public final void B(cdy cdyVar, brq brqVar) {
        f(cdyVar, "audioAttributes", brqVar.b + ",0," + brqVar.c + ",1");
    }

    @Override // defpackage.cdz
    public final void C(cdy cdyVar, String str, long j, long j2) {
        f(cdyVar, "audioDecoderInitialized", str);
    }

    @Override // defpackage.cdz
    public final void D(cdy cdyVar, String str) {
        f(cdyVar, "audioDecoderReleased", str);
    }

    @Override // defpackage.cdz
    public final void E(cdy cdyVar, long j) {
        f(cdyVar, "audioPositionAdvancing", "since ".concat(String.valueOf(d(((j - System.currentTimeMillis()) + SystemClock.elapsedRealtime()) - this.f))));
    }

    @Override // defpackage.cdz
    public final void F(cdy cdyVar, int i) {
        f(cdyVar, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.cdz
    public final void H(cdy cdyVar, int i, long j, long j2) {
        g(cdyVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // defpackage.cdz
    public final void I(cdy cdyVar, cni cniVar) {
        f(cdyVar, "downstreamFormat", bse.c(cniVar.c));
    }

    @Override // defpackage.cdz
    public final void K(cdy cdyVar) {
        e(cdyVar, "drmKeysRestored");
    }

    @Override // defpackage.cdz
    public final void L(cdy cdyVar, int i) {
        f(cdyVar, "drmSessionAcquired", a.bR(i, "state="));
    }

    @Override // defpackage.cdz
    public final void M(cdy cdyVar, Exception exc) {
        g(cdyVar, "internalError", "drmSessionManagerError", exc);
    }

    @Override // defpackage.cdz
    public final void N(cdy cdyVar) {
        e(cdyVar, "drmSessionReleased");
    }

    @Override // defpackage.cdz
    public final void O(cdy cdyVar, int i) {
        f(cdyVar, "droppedSeeksWhileScrubbing", Integer.toString(i));
    }

    @Override // defpackage.cdz
    public final void P(cdy cdyVar, int i, long j) {
        f(cdyVar, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.cdz
    public final void Q(cdy cdyVar, boolean z) {
        f(cdyVar, "loading", Boolean.toString(z));
    }

    @Override // defpackage.cdz
    public final void R(cdy cdyVar, boolean z) {
        f(cdyVar, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.cdz
    public final void S(cdy cdyVar, cnd cndVar, cni cniVar, IOException iOException, boolean z) {
        g(cdyVar, "internalError", "loadError", iOException);
    }

    @Override // defpackage.cdz
    public final void U(cdy cdyVar, bsx bsxVar) {
        bvx.g("metadata [".concat(c(cdyVar)));
        h(bsxVar, "  ");
        bvx.g("]");
    }

    @Override // defpackage.cdz
    public final void V(cdy cdyVar, boolean z, int i) {
        String str;
        if (i == 1) {
            str = "USER_REQUEST";
        } else if (i == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i != 4) {
            str = i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        f(cdyVar, "playWhenReady", z + ", " + str);
    }

    @Override // defpackage.cdz
    public final void W(cdy cdyVar, btb btbVar) {
        f(cdyVar, "playbackParameters", btbVar.toString());
    }

    @Override // defpackage.cdz
    public final void X(cdy cdyVar, int i) {
        String str;
        if (i == 1) {
            str = "IDLE";
        } else if (i != 2) {
            str = i != 3 ? "ENDED" : "READY";
        } else {
            str = "BUFFERING";
        }
        f(cdyVar, "state", str);
    }

    @Override // defpackage.cdz
    public final void Y(cdy cdyVar, int i) {
        String str;
        if (i == 0) {
            str = "NONE";
        } else if (i == 1) {
            str = "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else if (i != 3) {
            str = i != 4 ? "?" : "SCRUBBING";
        } else {
            str = "UNSUITABLE_AUDIO_OUTPUT";
        }
        f(cdyVar, "playbackSuppressionReason", str);
    }

    @Override // defpackage.cdz
    public final void Z(cdy cdyVar, bta btaVar) {
        a(b(cdyVar, "playerFailed", null, btaVar));
    }

    protected final void a(String str) {
        bvx.c(this.c, str);
    }

    @Override // defpackage.cdz
    public final void aA(cdy cdyVar, cri criVar) {
        f(cdyVar, "audioTrackInit", i(criVar));
    }

    @Override // defpackage.cdz
    public final void aB(cdy cdyVar, cri criVar) {
        f(cdyVar, "audioTrackReleased", i(criVar));
    }

    @Override // defpackage.cdz
    public final void ab(cdy cdyVar, btg btgVar, btg btgVar2, int i) {
        String str;
        if (i == 0) {
            str = "AUTO_TRANSITION";
        } else if (i == 1) {
            str = "SEEK";
        } else if (i == 2) {
            str = "SEEK_ADJUSTMENT";
        } else if (i == 3) {
            str = "SKIP";
        } else if (i != 4) {
            str = i != 5 ? "SILENCE_SKIP" : "INTERNAL";
        } else {
            str = "REMOVE";
        }
        f(cdyVar, "positionDiscontinuity", "reason=" + str + ", PositionInfo:old [" + btgVar.toString() + "], PositionInfo:new [" + btgVar2.toString() + ']');
    }

    @Override // defpackage.cdz
    public final void ac(cdy cdyVar, Object obj, long j) {
        f(cdyVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.cdz
    public final void ad(cdy cdyVar, int i, int i2, boolean z) {
        int i3 = bwp.a;
        f(cdyVar, "rendererReady", "rendererIndex=" + i + ", " + bwp.P(i2) + ", " + z);
    }

    @Override // defpackage.cdz
    public final void ae(cdy cdyVar, int i) {
        String str;
        if (i != 0) {
            str = i != 1 ? "ALL" : "ONE";
        } else {
            str = "OFF";
        }
        f(cdyVar, "repeatMode", str);
    }

    @Override // defpackage.cdz
    public final void ag(cdy cdyVar, boolean z) {
        f(cdyVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.cdz
    public final void ah(cdy cdyVar, int i, int i2) {
        f(cdyVar, "surfaceSize", a.bQ(i2, i, "w=", ", h="));
    }

    @Override // defpackage.cdz
    public final void ai(cdy cdyVar, int i) {
        btn btnVar = cdyVar.b;
        int iB = btnVar.b();
        int iC = btnVar.c();
        bvx.g("timeline [" + c(cdyVar) + ", periodCount=" + iB + ", windowCount=" + iC + ", reason=" + (i != 0 ? "SOURCE_UPDATE" : "PLAYLIST_CHANGED"));
        for (int i2 = 0; i2 < Math.min(iB, 3); i2++) {
            btl btlVar = this.e;
            btnVar.d(i2, btlVar, false);
            bvx.g("  period [" + d(btlVar.f()) + ']');
        }
        if (iB > 3) {
            bvx.g("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iC, 3); i3++) {
            btm btmVar = this.d;
            btnVar.e(i3, btmVar, 0L);
            bvx.g("  window [" + d(btmVar.b()) + ", seekable=" + btmVar.i + ", dynamic=" + btmVar.j + ']');
        }
        if (iC > 3) {
            bvx.g("  ...");
        }
        bvx.g("]");
    }

    @Override // defpackage.cdz
    public final void aj(cdy cdyVar, btu btuVar) {
        agke agkeVar;
        bsx bsxVar;
        bvx.g("tracks [".concat(c(cdyVar)));
        int i = 0;
        while (true) {
            agkeVar = btuVar.b;
            if (i >= agkeVar.size()) {
                break;
            }
            btt bttVar = (btt) agkeVar.get(i);
            bvx.g("  group [ id=".concat(String.valueOf(bttVar.b.b)));
            for (int i2 = 0; i2 < bttVar.a; i2++) {
                String str = true != bttVar.d(i2) ? "[ ]" : "[X]";
                String strN = bwp.N(bttVar.c[i2]);
                bvx.g("    " + str + " Track:" + i2 + ", " + bse.c(bttVar.b(i2)) + ", supported=" + strN);
            }
            bvx.g("  ]");
            i++;
        }
        boolean z = false;
        int i3 = 0;
        while (!z && i3 < agkeVar.size()) {
            btt bttVar2 = (btt) agkeVar.get(i3);
            boolean z2 = false;
            for (int i4 = 0; !z2 && i4 < bttVar2.a; i4++) {
                if (!bttVar2.d(i4) || (bsxVar = bttVar2.b(i4).m) == null || bsxVar.a() <= 0) {
                    z2 = false;
                } else {
                    bvx.g("  Metadata [");
                    h(bsxVar, "    ");
                    bvx.g("  ]");
                    z2 = true;
                }
            }
            i3++;
            z = z2;
        }
        bvx.g("]");
    }

    @Override // defpackage.cdz
    public final void ak(cdy cdyVar, cni cniVar) {
        f(cdyVar, "upstreamDiscarded", bse.c(cniVar.c));
    }

    @Override // defpackage.cdz
    public final void am(cdy cdyVar, String str, long j, long j2) {
        f(cdyVar, "videoDecoderInitialized", str);
    }

    @Override // defpackage.cdz
    public final void an(cdy cdyVar, String str) {
        f(cdyVar, "videoDecoderReleased", str);
    }

    @Override // defpackage.cdz
    public final void ao(cdy cdyVar, cay cayVar) {
        e(cdyVar, "videoDisabled");
    }

    @Override // defpackage.cdz
    public final void ap(cdy cdyVar, cay cayVar) {
        e(cdyVar, "videoEnabled");
    }

    @Override // defpackage.cdz
    public final void aq(cdy cdyVar, bse bseVar, caz cazVar) {
        f(cdyVar, "videoInputFormat", bse.c(bseVar));
    }

    @Override // defpackage.cdz
    public final void ar(cdy cdyVar, btz btzVar) {
        StringBuilder sb = new StringBuilder("w=" + btzVar.b + ", h=" + btzVar.c);
        float f = btzVar.d;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        f(cdyVar, "videoSize", sb.toString());
    }

    @Override // defpackage.cdz
    public final void as(cdy cdyVar, float f) {
        f(cdyVar, "volume", Float.toString(f));
    }

    @Override // defpackage.cdz
    public final void at(cdy cdyVar) {
        e(cdyVar, "audioDisabled");
    }

    @Override // defpackage.cdz
    public final void au(cdy cdyVar) {
        e(cdyVar, "audioEnabled");
    }

    @Override // defpackage.cdz
    public final void av(cdy cdyVar, bse bseVar) {
        f(cdyVar, "audioInputFormat", bse.c(bseVar));
    }

    @Override // defpackage.cdz
    public final void ax(cdy cdyVar) {
        e(cdyVar, "drmKeysLoaded");
    }

    @Override // defpackage.cdz
    public final void ay(cdy cdyVar, int i) {
        String str;
        String strC = c(cdyVar);
        if (i == 0) {
            str = "REPEAT";
        } else if (i == 1) {
            str = "AUTO";
        } else if (i != 2) {
            str = i != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        bvx.g(a.ch((byte) 93, str, strC, "mediaItem [", ", reason="));
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void J(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void af(cdy cdyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void G(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void T(cdy cdyVar, boolean z) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aC(bth bthVar, boy boyVar) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void al(cdy cdyVar, Exception exc) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aa(cdy cdyVar, boolean z, int i) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void aw(cdy cdyVar, int i, long j) {
    }

    @Override // defpackage.cdz
    public final /* synthetic */ void az(cdy cdyVar, int i, int i2, float f) {
    }
}
