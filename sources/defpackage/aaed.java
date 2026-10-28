package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaed {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    boolean e;
    private final tbt f;
    private final vyo g;
    private final ScheduledExecutorService h;
    private final awmd i;

    public aaed(tbt tbtVar, vyo vyoVar, ScheduledExecutorService scheduledExecutorService, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.f = tbtVar;
        this.g = vyoVar;
        this.h = scheduledExecutorService;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.i = awmdVar4;
        this.d = awmdVar5;
    }

    public final void a() {
        this.f.f(this);
        this.e = false;
    }

    public final void b(int i, int i2, int i3) {
        String str;
        String str2;
        awmd awmdVar = this.i;
        if (awmdVar.io() != null) {
            aerv aervVar = (aerv) awmdVar.io();
            if (i != 1) {
                str = i != 2 ? "VERIFICATION_SUCCESS" : "VIDEO_STREAM_VERIFICATION_FAILURE";
            } else {
                str = "AUDIO_STREAM_VERIFICATION_FAILURE";
            }
            String string = Integer.toString(i2 - 1);
            if (i3 == 1) {
                str2 = "PLAYBACK_EXCEPTION_UNKNOWN";
            } else if (i3 != 2) {
                str2 = i3 != 3 ? "PLAYBACK_EXCEPTION_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_OFFLINE_FMT_NONEAVAILABLE";
            } else {
                str2 = "PLAYBACK_EXCEPTION_NO_CONNECTION";
            }
            ((qtf) aervVar.q.io()).b(1L, "VERIFY_ON_PLAYBACK_EXCEPTION", str, string, str2);
        }
    }

    @tcc
    void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        awmd awmdVar = this.a;
        String str = aaiaVar.a;
        abvk abvkVar = (abvk) awmdVar.io();
        if (abvkVar != null && abvkVar.W() && TextUtils.equals(abvkVar.n(), str) && this.e) {
            abvkVar.r();
        }
    }

    @tcc
    void handlePlaybackServiceException(final aboe aboeVar) {
        final aoev aoevVar = this.g.b().i;
        if (aoevVar == null) {
            aoevVar = aoev.a;
        }
        if (aoevVar.n || aoevVar.o) {
            this.h.execute(new Runnable() { // from class: aaec
                /* JADX WARN: Code duplicated, block: B:29:0x007b  */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    aamm aammVarG;
                    boolean z;
                    aare aareVarA;
                    aboe aboeVar2 = aboeVar;
                    String str = aboeVar2.h;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    aaed aaedVar = this.a;
                    aaqn aaqnVarB = ((aanb) aaedVar.b.io()).b();
                    if (aaqnVarB != null) {
                        aamt aamtVarA = aaqnVarB.l().a(str);
                        aaew aaewVarD = aaqnVarB.d();
                        if (aamtVarA == null || aamtVarA.f() != aamp.PLAYABLE) {
                            return;
                        }
                        String str2 = aboeVar2.i;
                        if (TextUtils.isEmpty(str2)) {
                            i = 1;
                        } else if (str2.contains("offline.nocontent")) {
                            i = 3;
                        } else if (str2.startsWith("fmt.noneavailable")) {
                            i = 4;
                        } else if (str2.contains("net.retryexhausted") || str2.contains("net.closed") || str2.contains("net.read") || str2.contains("net.read.timeout") || str2.contains("net.timeout")) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        aoev aoevVar2 = aoevVar;
                        if (aoevVar2.o && i == 3) {
                            if (aaewVarD != null) {
                                aaewVarD.S(str, aamg.STREAM_CORRUPT);
                                return;
                            }
                            i = 3;
                        }
                        if (!aoevVar2.n || (aammVarG = aaqnVarB.f().g(str, null)) == null) {
                            return;
                        }
                        aihf aihfVarCreateBuilder = aofq.a.createBuilder();
                        if (str != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar.b |= 1;
                            aofqVar.c = str;
                        }
                        String str3 = aboeVar2.b;
                        if (str3 != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar2 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar2.b |= SemanticState.Focused;
                            aofqVar2.h = str3;
                        }
                        boolean zW = ((abvk) aaedVar.a.io()).W();
                        aihfVarCreateBuilder.copyOnWrite();
                        aofq aofqVar3 = (aofq) aihfVarCreateBuilder.instance;
                        aofqVar3.b |= SemanticState.Hidden;
                        aofqVar3.i = zW;
                        int i2 = i - 1;
                        if (i2 == 1) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar4 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar4.g = 2;
                            aofqVar4.b |= 64;
                        } else if (i2 == 2) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar5 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar5.g = 1;
                            aofqVar5.b |= 64;
                        } else if (i2 != 3) {
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar6 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar6.g = 0;
                            aofqVar6.b |= 64;
                        } else {
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar7 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar7.g = 3;
                            aofqVar7.b |= 64;
                        }
                        aaml aamlVar = aammVarG.a;
                        if (aamlVar != null) {
                            int iA = aamlVar.a();
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar8 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar8.b |= 2;
                            aofqVar8.d = iA;
                        }
                        aaml aamlVar2 = aammVarG.b;
                        if (aamlVar2 != null) {
                            int iA2 = aamlVar2.a();
                            aihfVarCreateBuilder.copyOnWrite();
                            aofq aofqVar9 = (aofq) aihfVarCreateBuilder.instance;
                            aofqVar9.b |= 4;
                            aofqVar9.e = iA2;
                        }
                        boolean z2 = aammVarG.h;
                        aihfVarCreateBuilder.copyOnWrite();
                        aofq aofqVar10 = (aofq) aihfVarCreateBuilder.instance;
                        aofqVar10.b |= 16;
                        aofqVar10.f = z2;
                        ((aalv) aaedVar.d.io()).c((aofq) aihfVarCreateBuilder.build());
                        boolean zK = aamtVarA.k();
                        if (aamlVar2 == null || !aamlVar2.i()) {
                            z = false;
                            aareVarA = null;
                        } else {
                            aare aareVarA2 = ((aarf) aaedVar.c.io()).a(aamlVar2, zK);
                            if (aareVarA2 != null && !aareVarA2.a()) {
                                aaedVar.b(1, aareVarA2.d, i);
                                zvp.a(zvn.a, zvm.C, String.format(Locale.US, "Stream verification failed on playback exception for video %s and itag %d", str, Integer.valueOf(aamlVar2.a())));
                                if (aaewVarD != null) {
                                    aaewVarD.S(str, aamg.STREAM_CORRUPT);
                                    return;
                                }
                                return;
                            }
                            aareVarA = aareVarA2;
                            z = true;
                        }
                        if (aamlVar != null && aamlVar.i()) {
                            aareVarA = ((aarf) aaedVar.c.io()).a(aamlVar, zK);
                            if (aareVarA != null && !aareVarA.a()) {
                                aaedVar.b(2, aareVarA.d, i);
                                zvp.a(zvn.a, zvm.C, String.format(Locale.US, "Stream verification failed on playback exception for video %s and itag %d", str, Integer.valueOf(aamlVar.a())));
                                if (aaewVarD != null) {
                                    aaewVarD.S(str, aamg.STREAM_CORRUPT);
                                    return;
                                }
                                return;
                            }
                            z = true;
                        }
                        if (z) {
                            aaedVar.b(3, aareVarA != null ? aareVarA.d : 1, i);
                            zvp.a(zvn.a, zvm.C, String.format(Locale.US, "Stream verification succeeded on playback exception for video %s", str));
                        }
                    }
                }
            });
        }
    }

    @tcc
    void handleSequencerStageEvent(aayw aaywVar) {
        ajwo ajwoVar = aaywVar.e;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite);
            this.e = ajwoVar.j.n(aihlVarCheckIsLite.d);
        }
    }
}
