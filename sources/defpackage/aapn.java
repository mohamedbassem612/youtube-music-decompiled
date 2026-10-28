package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aapn extends acii {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/player/PlaybackPositionTrackingPlaybackListener");
    private final zwb b;
    private final wco c;
    private final ahbw d;
    private final awmd e;
    private wjf f;
    private String g;
    private long h;
    private long i;
    private aaok j;
    private iai k;
    private final vxz l;
    private final aerj m;
    private final isi n;

    public aapn(isi isiVar, aerj aerjVar, awmd awmdVar, vxz vxzVar, ahbw ahbwVar, zwb zwbVar, wco wcoVar) {
        super(0);
        this.n = isiVar;
        this.m = aerjVar;
        this.e = awmdVar;
        this.l = vxzVar;
        this.d = ahbwVar;
        this.b = zwbVar;
        this.c = wcoVar;
    }

    private final void z() {
        wjf wjfVar;
        if (this.k == null || this.h < 0) {
            return;
        }
        vxz vxzVar = this.l;
        boolean zM = vxzVar.m(111, 45619618L);
        long j = this.h;
        final long seconds = (!zM || j >= 1000) ? Duration.ofMillis(j).toSeconds() : 1L;
        if (vxzVar.l(175, 45702256L, false)) {
            String str = this.g;
            zwb zwbVar = this.b;
            if (zwbVar.u() && !ahno.aa(str) && !((aaqg) this.e.io()).B(zwbVar.e().k()) && (wjfVar = this.f) != null) {
                aoqd aoqdVar = wjfVar.u().e;
                if (aoqdVar == null) {
                    aoqdVar = aoqd.a;
                }
                ajui ajuiVar = aoqdVar.L;
                if (ajuiVar == null) {
                    ajuiVar = ajui.a;
                }
                if (ajuiVar.b) {
                    arer arerVarE = aret.e(wfs.g(76, str));
                    arerVarE.ap(str);
                    arerVarE.an(Long.valueOf(seconds));
                    arerVarE.ao(Long.valueOf(this.d.a().toEpochMilli()));
                    wer werVarE = this.c.b(zwbVar.e()).e();
                    werVarE.e(arerVarE.aq());
                    werVarE.b().k(new xuk(7));
                }
            }
        }
        final iai iaiVar = this.k;
        iaiVar.getClass();
        final Optional optionalOf = Optional.of(Long.valueOf(Duration.ofMillis(this.i).toSeconds()));
        zwb zwbVar2 = iaiVar.e;
        if (zwbVar2.u()) {
            String str2 = iaiVar.b;
            if (TextUtils.isEmpty(str2) || ((aaqg) iaiVar.d.io()).B(zwbVar2.e().k())) {
                return;
            }
            taf.i(iaiVar.f.a(kro.aH(str2)), iaiVar.h, new hou(12), new tae() { // from class: iah
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean zIsEmpty = optional.isEmpty();
                    iai iaiVar2 = iaiVar;
                    long j2 = seconds;
                    Optional optional2 = optionalOf;
                    if (zIsEmpty) {
                        return;
                    }
                    anyx anyxVar = (anyx) optional.get();
                    if (anyxVar.getEligibleForResumption().booleanValue()) {
                        try {
                            aihf aihfVarCreateBuilder = areq.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            areq areqVar = (areq) aihfVarCreateBuilder.instance;
                            areqVar.c |= 1;
                            areqVar.d = j2;
                            if (iaiVar2.i.u()) {
                                long epochMilli = iaiVar2.c.a().toEpochMilli();
                                aihfVarCreateBuilder.copyOnWrite();
                                areq areqVar2 = (areq) aihfVarCreateBuilder.instance;
                                areqVar2.c |= 2;
                                areqVar2.e = epochMilli;
                            }
                            aany aanyVar = iaiVar2.g;
                            aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
                            aofhVar.c = 4;
                            aofhVar.b |= 1;
                            String strAL = kro.aL(iaiVar2.b);
                            aihfVarCreateBuilder2.copyOnWrite();
                            aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
                            strAL.getClass();
                            aofhVar2.b |= 2;
                            aofhVar2.d = strAL;
                            aihh aihhVar = (aihh) aofg.b.createBuilder();
                            aihhVar.e(areq.b, (areq) aihfVarCreateBuilder.build());
                            aihfVarCreateBuilder2.copyOnWrite();
                            aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
                            aofg aofgVar = (aofg) aihhVar.build();
                            aofgVar.getClass();
                            aofhVar3.e = aofgVar;
                            aofhVar3.b |= 4;
                            aanyVar.a((aofh) aihfVarCreateBuilder2.build());
                        } catch (aaob e) {
                            ((agrc) ((agrc) ((agrc) iai.a.c()).j(e)).k("com/google/android/apps/youtube/music/player/offline/MusicOfflinePlaybackPositionTrackingReporter", "storeLastPlaybackPosition", 'g', "MusicOfflinePlaybackPositionTrackingReporter.java")).t("Failed to report video playback position update.");
                        }
                        try {
                            optional2.isPresent();
                            if (anyxVar.getExternallyHostedMetadata().b) {
                                if (Duration.ofMillis(anyxVar.getLengthMs().longValue()).toSeconds() != ((Long) optional2.get()).longValue()) {
                                    long jLongValue = ((Long) optional2.get()).longValue();
                                    aany aanyVar2 = iaiVar2.g;
                                    aihf aihfVarCreateBuilder3 = aofh.a.createBuilder();
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder3.instance;
                                    aofhVar4.c = 4;
                                    aofhVar4.b |= 1;
                                    String strAH = kro.aH(iaiVar2.b);
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    aofh aofhVar5 = (aofh) aihfVarCreateBuilder3.instance;
                                    strAH.getClass();
                                    aofhVar5.b |= 2;
                                    aofhVar5.d = strAH;
                                    aihh aihhVar2 = (aihh) aofg.b.createBuilder();
                                    aihl aihlVar = anyr.b;
                                    aihf aihfVarCreateBuilder4 = anyr.a.createBuilder();
                                    long millis = Duration.ofSeconds(jLongValue).toMillis();
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    anyr anyrVar = (anyr) aihfVarCreateBuilder4.instance;
                                    anyrVar.c |= SemanticState.Obscured;
                                    anyrVar.n = millis;
                                    aihhVar2.e(aihlVar, (anyr) aihfVarCreateBuilder4.build());
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    aofh aofhVar6 = (aofh) aihfVarCreateBuilder3.instance;
                                    aofg aofgVar2 = (aofg) aihhVar2.build();
                                    aofgVar2.getClass();
                                    aofhVar6.e = aofgVar2;
                                    aofhVar6.b |= 4;
                                    aanyVar2.a((aofh) aihfVarCreateBuilder3.build());
                                }
                            }
                        } catch (aaob e2) {
                            ((agrc) ((agrc) ((agrc) iai.a.c()).j(e2)).k("com/google/android/apps/youtube/music/player/offline/MusicOfflinePlaybackPositionTrackingReporter", "storeLastPlaybackPosition", 'v', "MusicOfflinePlaybackPositionTrackingReporter.java")).t("Failed to update duration.");
                        }
                    }
                }
            }, null);
        }
    }

    @Override // defpackage.acii
    public final Parcelable c() {
        return new aapm(this.g);
    }

    public final void d(abvn abvnVar) {
        if (abvnVar != null) {
            int i = 0;
            if (this.l.l(182, 45712016L, false)) {
                int i2 = 15;
                int i3 = 1;
                abvnVar.M(new wvk(i2), new wvk(16)).N().i(new abwr(i3)).al(new aawl(new aapk(this, 2), "PPTPL", 1), new jop(15));
                abvnVar.M(new wvk(i2), new wvk(17)).N().i(new abwr(i3)).al(new aapk(this, 3), new jop(15));
                abvnVar.M(new wvk(i2), new wvk(18)).N().i(new abwr(i3)).al(new aapk(this, i), new jop(15));
            }
        }
    }

    @Override // defpackage.acii
    public final void e(String str) {
        if (this.l.l(182, 45712016L, false)) {
            return;
        }
        z();
        if (this.k != null) {
            this.h = -1L;
            this.i = -1L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.acii
    public final void f(aazj aazjVar) {
        abob abobVar = aazjVar.a;
        if (abobVar == abob.h || abobVar == abob.i) {
            wjf wjfVar = aazjVar.b;
            this.f = wjfVar;
            if (wjfVar != null) {
                String strG = wjfVar.G();
                String str = this.g;
                if (str == null || !str.equals(strG)) {
                    this.g = strG;
                    isi isiVar = this.n;
                    mbc mbcVar = (mbc) isiVar.a.io();
                    mbcVar.getClass();
                    abfv abfvVar = (abfv) isiVar.b.io();
                    abfvVar.getClass();
                    strG.getClass();
                    this.j = new aaok((awmd) isiVar.c, mbcVar, abfvVar, strG);
                    aerj aerjVar = this.m;
                    String str2 = this.g;
                    ahbw ahbwVar = (ahbw) aerjVar.g.io();
                    ahbwVar.getClass();
                    zwb zwbVar = (zwb) aerjVar.f.io();
                    zwbVar.getClass();
                    hpy hpyVar = (hpy) aerjVar.a.io();
                    hpyVar.getClass();
                    aany aanyVar = (aany) aerjVar.b.io();
                    aanyVar.getClass();
                    Executor executor = (Executor) aerjVar.c.io();
                    executor.getClass();
                    aauk aaukVar = (aauk) aerjVar.d.io();
                    aaukVar.getClass();
                    str2.getClass();
                    this.k = new iai(ahbwVar, aerjVar.e, zwbVar, hpyVar, aanyVar, executor, aaukVar, str2);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awmd, java.lang.Object] */
    @Override // defpackage.acii
    public final void g(aazk aazkVar) {
        aaok aaokVar = this.j;
        if (aaokVar != null && aazkVar.h) {
            ?? r1 = aaokVar.d;
            if (!TextUtils.isEmpty(r1) && ((abfv) aaokVar.c).r()) {
                aanb aanbVar = (aanb) aaokVar.a.io();
                if (aanbVar.g()) {
                    aaqn aaqnVarB = aanbVar.b();
                    String str = (String) r1;
                    if (aaqnVarB.l().a(str) != null) {
                        aaqnVarB.l().r(str, aaokVar.b.f().toEpochMilli());
                    }
                }
            }
            this.j = null;
        }
        if (aazkVar.h) {
            this.h = aazkVar.a;
            this.i = aazkVar.d;
        }
    }

    @Override // defpackage.acii
    public final void h(aazn aaznVar) {
        vxz vxzVar = this.l;
        if (vxzVar.l(174, 45700492L, false) && aaznVar.b()) {
            z();
            return;
        }
        if (vxzVar.l(182, 45712016L, false)) {
            int i = aaznVar.a;
            if (i == 7 || i == 4) {
                z();
                if (this.k != null) {
                    this.h = -1L;
                    this.i = -1L;
                }
            }
        }
    }

    @Override // defpackage.acii
    public final void i(Parcelable parcelable, acih acihVar) {
        ahno.F(parcelable instanceof aapm);
        if (acihVar.a) {
            return;
        }
        this.g = ((aapm) parcelable).a;
    }
}
