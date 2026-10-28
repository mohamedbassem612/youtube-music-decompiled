package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwm extends acea {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/MusicPlayerControlsUpdater");
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final xeu e;
    public final acdq f;
    public boolean g;
    private final Executor j;
    private final Executor k;
    private final aunn l;
    private final acdw m;
    private final aunn n;
    private final aunn o;
    private final awmd p;
    private final aunn q;
    private final aunn r;
    private Optional s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private Optional x;
    private CharSequence y;
    private String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwm(Executor executor, Executor executor2, ahey aheyVar, aunn aunnVar, acdo acdoVar, acdq acdqVar, adws adwsVar, acdw acdwVar, aunn aunnVar2, aunn aunnVar3, tbt tbtVar, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, abmt abmtVar, awmd awmdVar, abwg abwgVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, abxv abxvVar, xeu xeuVar, awmd awmdVar2) {
        super(acdoVar, adwsVar, new glj(aunnVar, 2), acdwVar, aheyVar, abwgVar, avlhVar, avlhVar2, avlhVar3, tbtVar, abmtVar, acdqVar, abxvVar, awmdVar2);
        aunnVar.getClass();
        this.s = Optional.empty();
        this.v = 0;
        this.w = 0;
        this.x = Optional.empty();
        this.y = "";
        this.z = "";
        this.j = executor;
        this.k = executor2;
        this.l = aunnVar;
        this.m = acdwVar;
        this.q = aunnVar2;
        this.n = aunnVar3;
        this.b = aunnVar4;
        this.o = aunnVar5;
        this.c = aunnVar6;
        this.d = aunnVar7;
        this.f = acdqVar;
        this.p = awmdVar;
        this.e = xeuVar;
        this.r = aunnVar8;
    }

    private final void q() {
        e(null);
        f(null);
    }

    private final void r() {
        acdq acdqVar = this.f;
        int iHash = Objects.hash(acdqVar.u(), acdqVar.t(), acdqVar.s());
        if (iHash != this.w) {
            this.w = iHash;
            String.format(Locale.getDefault(), "BT metadata: %s, %s, %s", acdqVar.u(), acdqVar.t(), acdqVar.s());
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, wjf] */
    private final void s(Optional optional, Optional optional2) {
        if (optional.isPresent()) {
            hyw hywVar = (hyw) optional.get();
            this.f.I(hywVar.h(), hywVar.g());
            w(new abuz(hywVar.e()));
        } else if (optional2.isPresent()) {
            ?? r3 = optional2.get();
            this.f.I(r3.F(), null);
            w(r3.af());
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.y);
        acdq acdqVar = this.f;
        if (zIsEmpty) {
            acdqVar.F("");
        } else {
            acdqVar.F(this.y);
        }
        r();
    }

    private final void t() {
        boolean zL = ((vxz) this.r.io()).l(226, 45770563L, false);
        aunn aunnVar = this.c;
        if (zL) {
            taf.n(((aerz) aunnVar.io()).a ? ((jij) this.o.io()).n() : ahng.n(Float.valueOf(1.0f)), this.j, new hvn(this, 2));
        } else if (((aerz) aunnVar.io()).a) {
            taf.n(((jij) this.o.io()).n(), this.j, new hvn(this, 3));
        } else {
            ((abvk) this.b.io()).J(1.0f);
        }
    }

    private final void u() {
        if (!((aerz) this.c.io()).a) {
            ((abvk) this.b.io()).an(false);
            return;
        }
        ListenableFuture listenableFutureO = ((jij) this.o.io()).o();
        Executor executor = this.j;
        abvk abvkVar = (abvk) this.b.io();
        abvkVar.getClass();
        taf.n(listenableFutureO, executor, new hvn(abvkVar, 4));
    }

    private static boolean v(wjf wjfVar) {
        if (!hna.y(wjfVar)) {
            aqpo aqpoVar = wjfVar.t().u;
            if (aqpoVar == null) {
                aqpoVar = aqpo.a;
            }
            aqpn aqpnVar = aqpoVar.f;
            if (aqpnVar == null) {
                aqpnVar = aqpn.a;
            }
            if (!aqpnVar.c) {
                return false;
            }
        }
        return true;
    }

    private final void w(abuz abuzVar) {
        acdq acdqVar = this.f;
        if (Objects.equals(acdqVar.L().l(), abuzVar.l())) {
            return;
        }
        acdqVar.k(null, null);
        acdqVar.K(abuzVar);
        this.m.c(abuzVar);
    }

    public final void a() {
        if (this.x.isEmpty()) {
            Optional optionalOf = Optional.of((axfd) this.q.io());
            this.x = optionalOf;
            ((axfd) optionalOf.get()).ai(new hwp(this, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Type inference failed for: r0v6, types: [hyw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [hyw, java.lang.Object] */
    public final void b(hyw hywVar) {
        CharSequence charSequence;
        Optional optional = this.s;
        Optional optionalOf = Optional.of(hywVar);
        this.s = optionalOf;
        this.g = true;
        this.i.v(Optional.of(new hgx(this, 11)));
        if (((abjp) this.p.io()).c() != 0) {
            if (!optional.isEmpty() && !optionalOf.isEmpty()) {
                aqmh aqmhVarE = optional.get().e();
                aqmh aqmhVarE2 = optionalOf.get().e();
                if (aqmhVarE != null && aqmhVarE2 != null) {
                    charSequence = (aqmhVarE.c.size() == 0 || aqmhVarE2.c.size() == 0) ? aqmhVarE.equals(aqmhVarE2) : Objects.equals(((aqmg) aqmhVarE.c.get(0)).c, ((aqmg) aqmhVarE2.c.get(0)).c) ? this.y : "";
                }
            }
        }
        this.y = charSequence;
        super.p();
        this.f.J(amlg.INDIFFERENT);
        s(optionalOf, Optional.empty());
        super.m();
    }

    public final void c(aima aimaVar) {
        if (aimaVar == null || (aimaVar.b & 2) == 0) {
            return;
        }
        aqmh aqmhVar = aimaVar.h;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        abuz abuzVar = new abuz(aqmhVar);
        p();
        acdq acdqVar = this.f;
        acdqVar.G(true);
        acdqVar.K(abuzVar);
        acdqVar.h(3);
        acdqVar.F(aimaVar.f);
        acdqVar.E(jrj.AUDIO_ROUTE_MUSIC);
        acdqVar.d(false);
        acdqVar.e(aimaVar.g);
        acdqVar.J(amlg.INDIFFERENT);
        acdqVar.I(aimaVar.d, aimaVar.e);
        this.t = true;
        m();
        this.m.c(abuzVar);
        r();
    }

    public final void d() {
        aceu aceuVar = (aceu) this.l.io();
        boolean z = true;
        if (!this.g && !h.contains(Integer.valueOf(this.v))) {
            z = false;
        }
        aceuVar.e(z);
    }

    @tcc
    void handleLikeVideoActionEvent(gsg gsgVar) {
        this.f.J(gsgVar.b);
    }

    @Override // defpackage.acea
    @tcc
    public void handlePlaybackRateChangedEvent(aaxh aaxhVar) {
        super.handlePlaybackRateChangedEvent(aaxhVar);
    }

    @Override // defpackage.acea
    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "YT.PCU")).j(aboeVar.g)).k("com/google/android/apps/youtube/music/player/MusicPlayerControlsUpdater", "handlePlaybackServiceException", 390, "MusicPlayerControlsUpdater.java")).w("Handling PlaybackServiceException (isCritical: %s), updating PlayerControlsModel.", Boolean.valueOf(aawb.B(aboeVar.j)));
        this.f.b.T(aboeVar);
    }

    @Override // defpackage.acea
    @tcc
    public void handleSequencerHasPreviousNextEvent(aayv aayvVar) {
        super.handleSequencerHasPreviousNextEvent(aayvVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    @Override // defpackage.acea
    @tcc
    public void handleSequencerStageEvent(aayw aaywVar) {
        CharSequence charSequenceK;
        boolean z;
        a();
        abnw abnwVar = abnw.a;
        abnw abnwVar2 = aaywVar.b;
        this.u = abnwVar2 == abnwVar;
        super.p();
        ajwo ajwoVar = aaywVar.e;
        boolean z2 = ajwoVar != null && gzj.P(ajwoVar) == anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE;
        if (abnwVar2.a(abnw.b) && ajwoVar != null) {
            if (!((vxz) this.r.io()).l(272, 45836112L, false)) {
                this.f.H(z2);
                ((aerz) this.c.io()).a = z2;
                t();
                ((igk) this.d.io()).c = z2;
            } else if (z2) {
                this.f.H(true);
                ((aerz) this.c.io()).a = true;
                t();
                ((igk) this.d.io()).c = true;
            }
        }
        wjf wjfVar = aaywVar.c;
        abnw abnwVar3 = abnw.d;
        if (abnwVar2.b(abnwVar3) && wjfVar != null) {
            aqpo aqpoVar = wjfVar.t().u;
            if (aqpoVar == null) {
                aqpoVar = aqpo.a;
            }
            acdq acdqVar = this.f;
            aqpn aqpnVar = aqpoVar.d;
            if (aqpnVar == null) {
                aqpnVar = aqpn.a;
            }
            if (aqpnVar.c) {
                aqpn aqpnVar2 = aqpoVar.e;
                if (aqpnVar2 == null) {
                    aqpnVar2 = aqpn.a;
                }
                if (aqpnVar2.c) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            acdqVar.H(z);
            ((aerz) this.c.io()).a = v(wjfVar);
            if (abnwVar2.a(abnwVar3)) {
                t();
                u();
            }
            ((igk) this.d.io()).c = hna.y(wjfVar);
        }
        abnw abnwVar4 = abnw.e;
        if (abnwVar2 == abnwVar4) {
            wgi wgiVar = aaywVar.d;
            if (wgiVar != null) {
                amae amaeVar = wgiVar.a;
                amaa amaaVar = amaeVar.q;
                if (amaaVar == null) {
                    amaaVar = amaa.a;
                }
                if (amaaVar.b == 61479009) {
                    amaa amaaVar2 = amaeVar.q;
                    if (amaaVar2 == null) {
                        amaaVar2 = amaa.a;
                    }
                    amto amtoVar = amaaVar2.b == 61479009 ? (amto) amaaVar2.c : amto.a;
                    if ((amtoVar.b & 32) != 0) {
                        alay alayVar = amtoVar.g;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        charSequenceK = ackj.k(null, alayVar, null, false);
                    } else {
                        charSequenceK = "";
                    }
                    this.y = charSequenceK;
                }
            }
            Optional optionalAh = this.x;
            if (true == optionalAh.isPresent()) {
                optionalAh = ((axfd) optionalAh.get()).ah();
            }
            s(optionalAh, Optional.empty());
            if (wgiVar != null) {
                acdq acdqVar2 = this.f;
                amlg amlgVarR = acdqVar2.r();
                amlg amlgVarA = amlg.INDIFFERENT;
                if (amlgVarR == amlgVarA || !TextUtils.equals(wgiVar.b, this.z)) {
                    amks amksVarW = fhz.W(wgiVar);
                    if (amksVarW != null && (amlgVarA = amlg.a(amksVarW.d)) == null) {
                        amlgVarA = amlg.LIKE;
                    }
                    acdqVar2.J(amlgVarA);
                }
                String str = wgiVar.b;
                if (str != null) {
                    this.z = str;
                }
            }
        }
        super.m();
        if (abnwVar2 == abnwVar4) {
            final wgi wgiVar2 = aaywVar.d;
            final Optional optionalOfNullable = Optional.ofNullable(wjfVar);
            Optional optionalAh2 = this.x;
            if (true == optionalAh2.isPresent()) {
                optionalAh2 = ((axfd) optionalAh2.get()).ah();
            }
            final Optional optional = optionalAh2;
            final String str2 = aaywVar.f;
            this.k.execute(afwl.i(new Runnable() { // from class: hwl
                @Override // java.lang.Runnable
                public final void run() {
                    String string;
                    String string2;
                    wgi wgiVar3 = wgiVar2;
                    if (wgiVar3 != null) {
                        amae amaeVar2 = wgiVar3.a;
                        amaa amaaVar3 = amaeVar2.q;
                        if (amaaVar3 == null) {
                            amaaVar3 = amaa.a;
                        }
                        if (amaaVar3.b == 61479009) {
                            amaa amaaVar4 = amaeVar2.q;
                            if (amaaVar4 == null) {
                                amaaVar4 = amaa.a;
                            }
                            amto amtoVar2 = amaaVar4.b == 61479009 ? (amto) amaaVar4.c : amto.a;
                            Optional optional2 = optionalOfNullable;
                            String str3 = amtoVar2.c;
                            Optional optionalOfNullable2 = true != optional2.isPresent() ? optional2 : Optional.ofNullable(((wjf) optional2.get()).G());
                            Optional optionalOfNullable3 = optional;
                            String str4 = (String) optionalOfNullable2.orElse("");
                            Optional optionalEmpty = (true != optionalOfNullable3.isPresent() || true == (((hyw) optionalOfNullable3.get()) instanceof abke)) ? optionalOfNullable3 : Optional.empty();
                            if (true == optionalEmpty.isPresent()) {
                                optionalEmpty = Optional.ofNullable(((abke) ((hyw) optionalEmpty.get())).t());
                            }
                            String str5 = (String) optionalEmpty.orElse("");
                            boolean z3 = false;
                            boolean z4 = Stream.CC.of((Object[]) new String[]{str3, str4, str5}).filter(new hud(7)).distinct().count() > 1;
                            if ((amtoVar2.b & 4) != 0) {
                                alay alayVar2 = amtoVar2.d;
                                if (alayVar2 == null) {
                                    alayVar2 = alay.a;
                                }
                                string = ackj.k(null, alayVar2, null, false).toString();
                            } else {
                                string = "";
                            }
                            String str6 = (String) (true != optionalOfNullable3.isPresent() ? optionalOfNullable3 : Optional.ofNullable(((hyw) optionalOfNullable3.get()).h())).orElse("");
                            boolean z5 = (string.isEmpty() || str6.isEmpty() || Objects.equals(string, str6)) ? false : true;
                            if ((amtoVar2.b & 16) != 0) {
                                alay alayVar3 = amtoVar2.f;
                                if (alayVar3 == null) {
                                    alayVar3 = alay.a;
                                }
                                string2 = ackj.k(null, alayVar3, null, false).toString();
                            } else {
                                string2 = "";
                            }
                            if (true == optionalOfNullable3.isPresent()) {
                                optionalOfNullable3 = Optional.ofNullable(((hyw) optionalOfNullable3.get()).g());
                            }
                            String str7 = (String) optionalOfNullable3.orElse("");
                            if (!string2.isEmpty() && !str7.isEmpty() && !Objects.equals(string2, str7)) {
                                z3 = true;
                            }
                            if (!z4 && !z5) {
                                if (!z3) {
                                    return;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (z4) {
                                ((agrc) ((agrc) hwm.a.b().i(agso.a, "YT.PCU")).k("com/google/android/apps/youtube/music/player/MusicPlayerControlsUpdater", "verifyMetadataMatch", 731, "MusicPlayerControlsUpdater.java")).E("Video ID mismatch! LockScreen: %s, PlayerResponse: %s, QueueItem: %s", str3, str4, str5);
                            }
                            if (z5) {
                                ((agrc) ((agrc) hwm.a.b().i(agso.a, "YT.PCU")).k("com/google/android/apps/youtube/music/player/MusicPlayerControlsUpdater", "verifyMetadataMatch", 736, "MusicPlayerControlsUpdater.java")).B("Title mismatch! LockScreen: %s, QueueItem: %s", string, str6);
                            }
                            if (z3) {
                                ((agrc) ((agrc) hwm.a.b().i(agso.a, "YT.PCU")).k("com/google/android/apps/youtube/music/player/MusicPlayerControlsUpdater", "verifyMetadataMatch", 740, "MusicPlayerControlsUpdater.java")).B("Artist mismatch! LockScreen: %s, QueueItem: %s", string2, str7);
                            }
                            aihf aihfVarCreateBuilder = anrr.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            anrr anrrVar = (anrr) aihfVarCreateBuilder.instance;
                            anrrVar.b |= 4;
                            anrrVar.e = z4;
                            aihfVarCreateBuilder.copyOnWrite();
                            anrr anrrVar2 = (anrr) aihfVarCreateBuilder.instance;
                            anrrVar2.b |= 1;
                            anrrVar2.c = z5;
                            aihfVarCreateBuilder.copyOnWrite();
                            anrr anrrVar3 = (anrr) aihfVarCreateBuilder.instance;
                            anrrVar3.b |= 2;
                            anrrVar3.d = z3;
                            Optional optionalOfNullable4 = true != optional2.isPresent() ? optional2 : Optional.ofNullable(Boolean.valueOf(hna.y((wjf) optional2.get())));
                            Boolean bool = Boolean.FALSE;
                            boolean zBooleanValue = ((Boolean) optionalOfNullable4.orElse(bool)).booleanValue();
                            aihfVarCreateBuilder.copyOnWrite();
                            anrr anrrVar4 = (anrr) aihfVarCreateBuilder.instance;
                            anrrVar4.b |= 8;
                            anrrVar4.f = zBooleanValue;
                            Optional optionalOfNullable5 = true != optional2.isPresent() ? optional2 : Optional.ofNullable(Boolean.valueOf(((wjf) optional2.get()).Q()));
                            String str8 = str2;
                            boolean zBooleanValue2 = ((Boolean) optionalOfNullable5.orElse(bool)).booleanValue();
                            aihfVarCreateBuilder.copyOnWrite();
                            anrr anrrVar5 = (anrr) aihfVarCreateBuilder.instance;
                            anrrVar5.b |= 16;
                            anrrVar5.g = zBooleanValue2;
                            if (str8 != null) {
                                aihfVarCreateBuilder.copyOnWrite();
                                anrr anrrVar6 = (anrr) aihfVarCreateBuilder.instance;
                                anrrVar6.b |= 32;
                                anrrVar6.h = str8;
                            }
                            xeu xeuVar = this.a.e;
                            if (xeuVar.b) {
                                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_METADATA_MISMATCH_EVENT);
                                ztf ztfVar = xffVarA.k.e;
                                xffVarA.l = ztfVar.a();
                                ztfVar.k(xffVarA);
                                return;
                            }
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            anrr anrrVar7 = (anrr) aihfVarCreateBuilder.build();
                            anrrVar7.getClass();
                            alouVar.d = anrrVar7;
                            alouVar.c = 551;
                            xeuVar.b((alou) alosVar.build());
                        }
                    }
                }
            }));
        }
    }

    @Override // defpackage.acea
    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        a();
        abob abobVar = abob.a;
        abob abobVar2 = aazjVar.a;
        wjf wjfVar = aazjVar.b;
        if (abobVar2 == abobVar) {
            if (wjfVar != null) {
                super.p();
                Optional optionalAh = this.x;
                if (true == optionalAh.isPresent()) {
                    optionalAh = ((axfd) optionalAh.get()).ah();
                }
                s(optionalAh, Optional.of(wjfVar));
                super.m();
            }
            if (this.u) {
                acdq acdqVar = this.f;
                acdqVar.b.S();
                if (!this.t) {
                    acdqVar.c();
                }
                this.t = false;
                ((aerz) this.c.io()).e();
                q();
                this.y = "";
            }
        }
        if (wjfVar == null || !abobVar2.c(abob.c)) {
            return;
        }
        super.p();
        q();
        boolean z = aazjVar.i;
        boolean zW = wjfVar.W();
        int iAe = wjfVar.ae() - 1;
        boolean z2 = iAe == 1 || iAe == 2;
        acdq acdqVar2 = this.f;
        acdqVar2.G(!z || zW || z2);
        acdqVar2.e(((long) wjfVar.a()) * 1000);
        boolean z3 = !z || zW;
        acdy acdyVar = this.i;
        acdyVar.k(z3);
        aqpo aqpoVar = wjfVar.t().u;
        if (aqpoVar == null) {
            aqpoVar = aqpo.a;
        }
        aqpn aqpnVar = aqpoVar.c;
        if (aqpnVar == null) {
            aqpnVar = aqpn.a;
        }
        boolean z4 = aqpnVar.b;
        aqpn aqpnVar2 = aqpoVar.b;
        if (aqpnVar2 == null) {
            aqpnVar2 = aqpn.a;
        }
        acdyVar.n(z4, aqpnVar2.b);
        Optional optionalAh2 = this.x;
        if (true == optionalAh2.isPresent()) {
            optionalAh2 = ((axfd) optionalAh2.get()).ah();
        }
        s(optionalAh2, Optional.of(wjfVar));
        super.m();
        if (!((vxz) this.r.io()).l(272, 45836112L, false)) {
            if (((aerz) this.c.io()).a && abobVar2 == abob.g && aazjVar.c == null) {
                t();
                u();
                return;
            }
            return;
        }
        if (abobVar2 == abob.g && aazjVar.c == null && v(wjfVar)) {
            ((aerz) this.c.io()).a = true;
            t();
            u();
        }
    }

    @Override // defpackage.acea
    @tcc
    public void handleVideoTimeEvent(aazk aazkVar) {
        super.handleVideoTimeEvent(aazkVar);
        acdq acdqVar = this.f;
        long jN = acdqVar.n();
        long j = aazkVar.d;
        if (jN != j) {
            acdqVar.e(j);
        }
    }

    @Override // defpackage.acea
    @tcc
    public void handleYouTubePlayerStateEvent(aazn aaznVar) {
        int i = aaznVar.a;
        if (i == 4) {
            i = 3;
        }
        this.v = i;
        d();
        this.f.h(this.v);
    }
}
