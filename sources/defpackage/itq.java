package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class itq implements wnf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/service/SideloadedBrowsePageGenerationService");
    private static final agkj i;
    public final Context b;
    public final iss c;
    public final Map d = new EnumMap(apyu.class);
    public anqm e = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED;
    public volatile boolean f = false;
    public final vxz g;
    public final hfn h;
    private final jks j;
    private final iup k;
    private final isi l;
    private final hlp m;
    private final Executor n;
    private final Executor o;
    private apyu p;
    private String r;
    private afkb s;
    private final vxz t;
    private final hef u;
    private final hef v;
    private final kwq w;
    private final abxv x;

    static {
        zh zhVar = new zh();
        zhVar.a = 1;
        zhVar.e(imj.c);
        i = agkj.j("display_context", zhVar.d());
    }

    public itq(Context context, abxv abxvVar, jks jksVar, hfn hfnVar, iup iupVar, hef hefVar, isi isiVar, hef hefVar2, hlp hlpVar, Executor executor, kwq kwqVar, iss issVar, vxz vxzVar, vxz vxzVar2, Executor executor2, aunn aunnVar) {
        this.b = context;
        this.x = abxvVar;
        this.j = jksVar;
        this.h = hfnVar;
        this.k = iupVar;
        this.v = hefVar;
        this.l = isiVar;
        this.u = hefVar2;
        this.m = hlpVar;
        this.n = executor;
        this.w = kwqVar;
        this.c = issVar;
        this.g = vxzVar;
        this.t = vxzVar2;
        this.o = executor2;
        if (vxzVar2.l(206, 45734052L, false)) {
            this.s = new afkb(afwl.c(new gwj(aunnVar, executor2, 6)), executor2);
        }
    }

    public static apoq h(String str) {
        apho aphoVar;
        ahno.G(ish.o.contains(str), "Unexpected sideloaded browse ID");
        aihf aihfVarCreateBuilder = apho.a.createBuilder();
        apyu apyuVar = (apyu) ((agph) ish.p).d.get(str);
        if (apyuVar == null) {
            aphoVar = null;
        } else {
            String strName = apyuVar.name();
            aihfVarCreateBuilder.copyOnWrite();
            apho aphoVar2 = (apho) aihfVarCreateBuilder.instance;
            strName.getClass();
            aphoVar2.c |= 1;
            aphoVar2.d = strName;
            aihfVarCreateBuilder.copyOnWrite();
            apho aphoVar3 = (apho) aihfVarCreateBuilder.instance;
            aphoVar3.c |= 2;
            aphoVar3.e = true;
            aphoVar = (apho) aihfVarCreateBuilder.build();
        }
        aphoVar.getClass();
        aihf aihfVarCreateBuilder2 = apoq.a.createBuilder();
        aihf aihfVarCreateBuilder3 = apos.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        apos aposVar = (apos) aihfVarCreateBuilder3.instance;
        aposVar.e = aphoVar;
        aposVar.b |= 4;
        aihfVarCreateBuilder2.cl(aihfVarCreateBuilder3);
        return (apoq) aihfVarCreateBuilder2.build();
    }

    private final ListenableFuture k(Class cls, ListenableFuture listenableFuture, agkj agkjVar, apyu apyuVar) {
        ListenableFuture listenableFutureA = this.j.a();
        ahcy ahcyVarD = afwl.d(new gpr(14));
        Executor executor = this.n;
        ListenableFuture listenableFutureF = ahbz.f(listenableFutureA, Throwable.class, ahcyVarD, executor);
        ListenableFuture listenableFutureF2 = ahbz.f(listenableFuture, Throwable.class, afwl.d(new gpr(15)), executor);
        return ahng.j(listenableFutureF, listenableFutureF2).b(afwl.c(new itk(this, listenableFutureF, listenableFutureF2, cls, agkjVar, apyuVar, 0)), executor);
    }

    private final ListenableFuture l(ListenableFuture listenableFuture, apyu apyuVar) {
        return ahng.h(listenableFuture).a(afwl.j(new egz(this, listenableFuture, apyuVar, 20)), this.n);
    }

    private final ListenableFuture m(apyu apyuVar) {
        List list = (List) this.d.get(apyuVar);
        list.getClass();
        return ahng.n(list);
    }

    private final ajnf n() {
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarD = ackj.d(this.b.getString(R.string.sideloaded_new_playlist));
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarD.getClass();
        ajnfVar.m = alayVarD;
        ajnfVar.b |= 64;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.ADD;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        ajnfVar2.f = aljaVar2;
        ajnfVar2.e = 8;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = 2;
        ajnfVar3.c = 1;
        aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
        aihhVar3.e(apyq.b, apyq.a);
        ajwo ajwoVar = (ajwo) aihhVar3.build();
        aihhVar.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar.instance;
        ajwoVar.getClass();
        ajnfVar4.s = ajwoVar;
        ajnfVar4.b |= SemanticState.Multiline;
        return (ajnf) aihhVar.build();
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        String strC = acjxVar.c();
        String str = (String) ish.p.get((apyu) Enum.valueOf(apyu.class, strC));
        if (str == null) {
            throw new IllegalArgumentException("Unexpected continuation token: ".concat(String.valueOf(strC)));
        }
        ajwo ajwoVarA = vxh.a(str);
        aihh aihhVar = (aihh) almb.a.createBuilder();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVarA.c(aihlVarCheckIsLite);
        if (ajwoVarA.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
            ajwoVarA.c(aihlVarCheckIsLite2);
            Object objK = ajwoVarA.j.k(aihlVarCheckIsLite2.d);
            ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (!ajmfVar.c.isEmpty()) {
                String str2 = ajmfVar.c;
                aihhVar.copyOnWrite();
                almb almbVar = (almb) aihhVar.instance;
                str2.getClass();
                almbVar.b |= 2;
                almbVar.e = str2;
            }
            if (!ajmfVar.d.isEmpty()) {
                String str3 = ajmfVar.d;
                aihhVar.copyOnWrite();
                almb almbVar2 = (almb) aihhVar.instance;
                str3.getClass();
                almbVar2.b |= 4;
                almbVar2.f = str3;
            }
            if (!ajmfVar.e.isEmpty()) {
                String str4 = ajmfVar.e;
                aihhVar.copyOnWrite();
                almb almbVar3 = (almb) aihhVar.instance;
                str4.getClass();
                almbVar3.b |= 8;
                almbVar3.g = str4;
            }
        }
        itp itpVar = new itp(this.x, (almb) aihhVar.build());
        itpVar.m();
        return itpVar;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x0230  */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v18, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        ajwo ajwoVar;
        ListenableFuture listenableFutureN;
        int i2 = 1;
        if (isi.a(this.b) && this.m.m()) {
            kwq kwqVar = this.w;
            taf.j(Build.VERSION.SDK_INT >= 36 ? ahng.n(Boolean.FALSE) : ahno.as(((klc) kwqVar.c).d(), new isv(kwqVar, i2), kwqVar.a), new ihw(17));
            String str = ((almb) ((itp) wluVar).a().instance).e;
            this.r = str;
            apyu apyuVar = (apyu) ((agph) ish.p).d.get(str);
            apyu apyuVar2 = this.p;
            boolean z = apyuVar2 == null || apyuVar2.equals(apyuVar) || apyuVar == null || !this.d.containsKey(apyuVar);
            switch (str) {
                case "FEmusic_library_sideloaded_releases":
                    apyuVar.getClass();
                    listenableFutureN = k(anjx.class, z ? l(this.k.n(), apyuVar) : m(apyuVar), i, apyuVar);
                    this.p = apyuVar;
                    break;
                case "FEmusic_library_sideloaded_artists":
                    apyuVar.getClass();
                    listenableFutureN = k(ankr.class, z ? l(this.k.o(), apyuVar) : m(apyuVar), i, apyuVar);
                    this.p = apyuVar;
                    break;
                case "FEmusic_library_sideloaded_playlists":
                    apyuVar.getClass();
                    boolean z2 = z || this.u.m();
                    this.u.l(false);
                    listenableFutureN = k(anuk.class, z2 ? l(this.k.p(true), apyuVar) : m(apyuVar), i, apyuVar);
                    this.p = apyuVar;
                    break;
                case "FEmusic_library_sideloaded_tracks":
                    apyuVar.getClass();
                    ListenableFuture listenableFutureL = z ? l(this.k.q(), apyuVar) : m(apyuVar);
                    HashMap map = new HashMap(i);
                    acb acbVar = new acb((byte[]) null, (byte[]) null);
                    acbVar.d(4);
                    acbVar.c(ixt.t().toString());
                    map.put("container_context", acbVar.b());
                    listenableFutureN = k(anyx.class, listenableFutureL, agkj.h(map), apyuVar);
                    this.p = apyuVar;
                    break;
                default:
                    listenableFutureN = ahng.m(new IllegalArgumentException("invalid browse id: ".concat(String.valueOf(str))));
                    break;
            }
        } else {
            aihf aihfVarCreateBuilder = apoq.a.createBuilder();
            aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
            isi isiVar = this.l;
            aliz alizVar = aliz.MUSIC;
            Object obj = isiVar.a;
            Context context = (Context) obj;
            String string = context.getString(R.string.sideloaded_permission_missing_message);
            aihh aihhVar = (aihh) ajnf.a.createBuilder();
            alay alayVarD = ackj.d(context.getString(R.string.sideloaded_permission_mealbar_action_button_text));
            aihhVar.copyOnWrite();
            ajnf ajnfVar = (ajnf) aihhVar.instance;
            alayVarD.getClass();
            ajnfVar.m = alayVarD;
            ajnfVar.b |= 64;
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            ajnfVar2.d = 2;
            ajnfVar2.c = 1;
            if (isi.a(context)) {
                aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                aihhVar2.e(ish.d, apyp.a);
                ajwoVar = (ajwo) aihhVar2.build();
            } else {
                Activity activity = (Activity) obj;
                boolean z3 = isiVar.b.getBoolean(true != awk.c() ? "sideloaded_permission_requested_via_mealbar" : "sideloaded_permission_requested_via_mealbar_api_33", false);
                if (atb.b(activity, jkx.a()) || !z3) {
                    aihf aihfVarCreateBuilder3 = aomo.a.createBuilder();
                    aihf aihfVarCreateBuilder4 = aomr.a.createBuilder();
                    aomq aomqVar = (aomq) jkx.a.get(jkx.b());
                    aomqVar.getClass();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aomr aomrVar = (aomr) aihfVarCreateBuilder4.instance;
                    aomrVar.c = aomqVar.q;
                    aomrVar.b |= 1;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aomo aomoVar = (aomo) aihfVarCreateBuilder3.instance;
                    aomr aomrVar2 = (aomr) aihfVarCreateBuilder4.build();
                    aomrVar2.getClass();
                    aomoVar.d = aomrVar2;
                    aomoVar.c |= 1;
                    aomo aomoVar2 = (aomo) aihfVarCreateBuilder3.build();
                    aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
                    aihhVar3.e(aomo.b, aomoVar2);
                    ajwoVar = (ajwo) aihhVar3.build();
                } else {
                    aihh aihhVar4 = (aihh) ajwo.a.createBuilder();
                    aihhVar4.e(ish.d, apyp.a);
                    ajwoVar = (ajwo) aihhVar4.build();
                }
            }
            aihhVar.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar.instance;
            ajwoVar.getClass();
            ajnfVar3.s = ajwoVar;
            ajnfVar3.b |= SemanticState.Multiline;
            angn angnVarH = jij.h(alizVar, string, Optional.of((ajnf) aihhVar.build()));
            aihfVarCreateBuilder2.copyOnWrite();
            apox apoxVar = (apox) aihfVarCreateBuilder2.instance;
            angnVarH.getClass();
            apoxVar.bc = angnVarH;
            apoxVar.e |= 8;
            aihfVarCreateBuilder.ck(aihfVarCreateBuilder2);
            aihfVarCreateBuilder.copyOnWrite();
            apoq apoqVar = (apoq) aihfVarCreateBuilder.instance;
            apoqVar.c |= 16777216;
            apoqVar.s = true;
            if (!this.t.l(206, 45734052L, false)) {
                ixt.F(aihfVarCreateBuilder, agpi.a, apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS.name());
            }
            listenableFutureN = ahng.n(new iti((apoq) aihfVarCreateBuilder.build(), 2, (char[]) null));
        }
        taf.i(listenableFutureN, this.n, new ijj(zzaVar, 6), new hvn(zzaVar, 18), null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final ListenableFuture e(ListenableFuture listenableFuture, String str) {
        ist istVar = new ist(4);
        Executor executor = this.n;
        return ahno.an(ahno.ar(listenableFuture, istVar, executor), Throwable.class, new isv(str, 5), executor);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r4v40, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, zwb] */
    public final ListenableFuture f(List list, Class cls, apyu apyuVar, BiFunction biFunction) {
        Optional optionalOf;
        aliz alizVar;
        int i2;
        final aihf aihfVarCreateBuilder = apoq.a.createBuilder();
        hef hefVar = this.v;
        int i3 = 2;
        if (hefVar.b.u() && !hefVar.a.getBoolean("sideloaded_limitations_banner_dismissed", false) && apyuVar.equals(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS)) {
            aihf aihfVarCreateBuilder2 = anss.a.createBuilder();
            aihh aihhVar = (aihh) alay.a.createBuilder();
            aihh aihhVar2 = (aihh) alba.a.createBuilder();
            Context context = this.b;
            String string = context.getString(R.string.sideloaded_limitations_banner_tracks_text);
            aihhVar2.copyOnWrite();
            alba albaVar = (alba) aihhVar2.instance;
            string.getClass();
            albaVar.b |= 1;
            albaVar.c = string;
            int color = context.getColor(R.color.ytm_color_grey_05);
            aihhVar2.copyOnWrite();
            alba albaVar2 = (alba) aihhVar2.instance;
            albaVar2.b |= SemanticState.Hidden;
            albaVar2.i = color;
            aihhVar.v(aihhVar2);
            aihfVarCreateBuilder2.copyOnWrite();
            anss anssVar = (anss) aihfVarCreateBuilder2.instance;
            alay alayVar = (alay) aihhVar.build();
            alayVar.getClass();
            anssVar.c = alayVar;
            anssVar.b |= 1;
            aihf aihfVarCreateBuilder3 = ansr.a.createBuilder();
            aihh aihhVar3 = (aihh) ajnf.a.createBuilder();
            alay alayVarD = ackj.d(context.getString(R.string.dialog_got_it_text));
            aihhVar3.copyOnWrite();
            ajnf ajnfVar = (ajnf) aihhVar3.instance;
            alayVarD.getClass();
            ajnfVar.m = alayVarD;
            ajnfVar.b |= 64;
            ajwo ajwoVar = ajwo.a;
            aihh aihhVar4 = (aihh) ajwoVar.createBuilder();
            aihhVar4.e(ish.e, apyt.a);
            aihh aihhVar5 = (aihh) ajwoVar.createBuilder();
            aihhVar5.e(alhe.b, alhe.a);
            ajwo[] ajwoVarArr = {(ajwo) aihhVar4.build(), (ajwo) aihhVar5.build()};
            aihf aihfVarCreateBuilder4 = ajwm.a.createBuilder();
            for (int i4 = 0; i4 < 2; i4++) {
                aihfVarCreateBuilder4.aP(ajwoVarArr[i4]);
            }
            aihh aihhVar6 = (aihh) ajwoVar.createBuilder();
            aihhVar6.e(ajwm.b, (ajwm) aihfVarCreateBuilder4.build());
            ajwo ajwoVar2 = (ajwo) aihhVar6.build();
            aihhVar3.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar3.instance;
            ajwoVar2.getClass();
            ajnfVar2.s = ajwoVar2;
            ajnfVar2.b |= SemanticState.Multiline;
            aihfVarCreateBuilder3.copyOnWrite();
            ansr ansrVar = (ansr) aihfVarCreateBuilder3.instance;
            ajnf ajnfVar3 = (ajnf) aihhVar3.build();
            ajnfVar3.getClass();
            ansrVar.c = ajnfVar3;
            ansrVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            anss anssVar2 = (anss) aihfVarCreateBuilder2.instance;
            ansr ansrVar2 = (ansr) aihfVarCreateBuilder3.build();
            ansrVar2.getClass();
            aiie aiieVar = anssVar2.e;
            if (!aiieVar.c()) {
                anssVar2.e = aihn.mutableCopy(aiieVar);
            }
            anssVar2.e.add(ansrVar2);
            aihf aihfVarCreateBuilder5 = anld.a.createBuilder();
            aihf aihfVarCreateBuilder6 = anlc.a.createBuilder();
            aihfVarCreateBuilder6.bM(context.getColor(R.color.ytm_color_grey_10));
            aihfVarCreateBuilder5.copyOnWrite();
            anld anldVar = (anld) aihfVarCreateBuilder5.instance;
            anlc anlcVar = (anlc) aihfVarCreateBuilder6.build();
            anlcVar.getClass();
            anldVar.c = anlcVar;
            anldVar.b = 1;
            aihfVarCreateBuilder2.copyOnWrite();
            anss anssVar3 = (anss) aihfVarCreateBuilder2.instance;
            anld anldVar2 = (anld) aihfVarCreateBuilder5.build();
            anldVar2.getClass();
            anssVar3.j = anldVar2;
            anssVar3.b |= 64;
            aihfVarCreateBuilder2.copyOnWrite();
            anss anssVar4 = (anss) aihfVarCreateBuilder2.instance;
            anssVar4.b |= 16;
            anssVar4.h = true;
            anss anssVar5 = (anss) aihfVarCreateBuilder2.build();
            aihf aihfVarCreateBuilder7 = apox.a.createBuilder();
            aihfVarCreateBuilder7.copyOnWrite();
            apox apoxVar = (apox) aihfVarCreateBuilder7.instance;
            anssVar5.getClass();
            apoxVar.at = anssVar5;
            apoxVar.d |= 1;
            aihfVarCreateBuilder.ci((apox) aihfVarCreateBuilder7.build());
        }
        if (list.size() == 0) {
            optionalOf = Optional.empty();
        } else {
            aihf aihfVarCreateBuilder8 = anwz.a.createBuilder();
            jks jksVar = this.j;
            apyu apyuVar2 = (apyu) ((agph) ish.p).d.get(this.r);
            apyuVar2.getClass();
            aihfVarCreateBuilder8.bS(jksVar.b(ixt.B(apyuVar2.name()), this.e));
            aihh aihhVar7 = (aihh) apji.a.createBuilder();
            aihhVar7.e(anwz.b, (anwz) aihfVarCreateBuilder8.build());
            optionalOf = Optional.of((apji) aihhVar7.build());
        }
        aihfVarCreateBuilder.ci((apox) biFunction.apply(list, optionalOf));
        if (list.isEmpty()) {
            aihf aihfVarCreateBuilder9 = apox.a.createBuilder();
            String str = (String) ish.p.get(apyuVar);
            str.getClass();
            Context context2 = this.b;
            Optional optionalOf2 = apyuVar.equals(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS) ? Optional.of(n()) : Optional.empty();
            switch (str.hashCode()) {
                case -330302318:
                    if (str.equals("FEmusic_library_sideloaded_releases")) {
                        alizVar = aliz.ALBUM;
                        i2 = R.string.sideloaded_albums_empty_state_text;
                        break;
                    }
                    throw new AssertionError("unexpected browseId: ".concat(str));
                case 521692678:
                    if (str.equals("FEmusic_library_sideloaded_artists")) {
                        alizVar = aliz.ARTIST;
                        i2 = R.string.sideloaded_artists_empty_state_text;
                        break;
                    }
                    throw new AssertionError("unexpected browseId: ".concat(str));
                case 690093659:
                    if (str.equals("FEmusic_library_sideloaded_playlists")) {
                        alizVar = aliz.PLAYLIST_PLAY;
                        i2 = R.string.sideloaded_playlists_empty_state_text;
                        break;
                    }
                    throw new AssertionError("unexpected browseId: ".concat(str));
                case 1252947278:
                    if (str.equals("FEmusic_library_sideloaded_tracks")) {
                        alizVar = aliz.AUDIOTRACK;
                        i2 = R.string.sideloaded_songs_empty_state_text;
                        break;
                    }
                    throw new AssertionError("unexpected browseId: ".concat(str));
                default:
                    throw new AssertionError("unexpected browseId: ".concat(str));
            }
            angn angnVarH = jij.h(alizVar, context2.getString(i2), optionalOf2);
            aihfVarCreateBuilder9.copyOnWrite();
            apox apoxVar2 = (apox) aihfVarCreateBuilder9.instance;
            angnVarH.getClass();
            apoxVar2.bc = angnVarH;
            apoxVar2.e |= 8;
            aihfVarCreateBuilder.ck(aihfVarCreateBuilder9);
        } else if (cls == anyx.class) {
            aihf aihfVarCreateBuilder10 = apon.a.createBuilder();
            aihh aihhVar8 = (aihh) ajnf.a.createBuilder();
            alay alayVarD2 = ackj.d(this.b.getString(R.string.shuffle_all));
            aihhVar8.copyOnWrite();
            ajnf ajnfVar4 = (ajnf) aihhVar8.instance;
            alayVarD2.getClass();
            ajnfVar4.m = alayVarD2;
            ajnfVar4.b |= 64;
            aihh aihhVar9 = (aihh) alja.a.createBuilder();
            aliz alizVar2 = aliz.SHUFFLE;
            aihhVar9.copyOnWrite();
            alja aljaVar = (alja) aihhVar9.instance;
            aljaVar.c = alizVar2.yN;
            aljaVar.b |= 1;
            aihhVar8.copyOnWrite();
            ajnf ajnfVar5 = (ajnf) aihhVar8.instance;
            alja aljaVar2 = (alja) aihhVar9.build();
            aljaVar2.getClass();
            ajnfVar5.f = aljaVar2;
            ajnfVar5.e = 8;
            ajwo ajwoVarO = hef.o("", ixt.t().toString(), -1, true);
            aihhVar8.copyOnWrite();
            ajnf ajnfVar6 = (ajnf) aihhVar8.instance;
            ajwoVarO.getClass();
            ajnfVar6.s = ajwoVarO;
            ajnfVar6.b |= SemanticState.Multiline;
            aihfVarCreateBuilder10.copyOnWrite();
            apon aponVar = (apon) aihfVarCreateBuilder10.instance;
            ajnf ajnfVar7 = (ajnf) aihhVar8.build();
            ajnfVar7.getClass();
            aponVar.c = ajnfVar7;
            aponVar.b = 65153809;
            aihfVarCreateBuilder.copyOnWrite();
            apoq apoqVar = (apoq) aihfVarCreateBuilder.instance;
            apon aponVar2 = (apon) aihfVarCreateBuilder10.build();
            aponVar2.getClass();
            apoqVar.i = aponVar2;
            apoqVar.c |= 32;
        } else if (cls == anuk.class) {
            aihf aihfVarCreateBuilder11 = apon.a.createBuilder();
            ajnf ajnfVarN = n();
            aihfVarCreateBuilder11.copyOnWrite();
            apon aponVar3 = (apon) aihfVarCreateBuilder11.instance;
            ajnfVarN.getClass();
            aponVar3.c = ajnfVarN;
            aponVar3.b = 65153809;
            aihfVarCreateBuilder.copyOnWrite();
            apoq apoqVar2 = (apoq) aihfVarCreateBuilder.instance;
            apon aponVar4 = (apon) aihfVarCreateBuilder11.build();
            aponVar4.getClass();
            apoqVar2.i = aponVar4;
            apoqVar2.c |= 32;
        }
        aihf aihfVarCreateBuilder12 = apos.a.createBuilder();
        aihf aihfVarCreateBuilder13 = apho.a.createBuilder();
        String strName = apyuVar.name();
        aihfVarCreateBuilder13.copyOnWrite();
        apho aphoVar = (apho) aihfVarCreateBuilder13.instance;
        strName.getClass();
        aphoVar.c |= 1;
        aphoVar.d = strName;
        aihfVarCreateBuilder12.copyOnWrite();
        apos aposVar = (apos) aihfVarCreateBuilder12.instance;
        apho aphoVar2 = (apho) aihfVarCreateBuilder13.build();
        aphoVar2.getClass();
        aposVar.e = aphoVar2;
        aposVar.b |= 4;
        aihfVarCreateBuilder.cl(aihfVarCreateBuilder12);
        if (this.t.l(206, 45734052L, false)) {
            if (apyuVar.equals(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS) || apyuVar.equals(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ALBUMS) || apyuVar.equals(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ARTISTS)) {
                return ahng.n(aihfVarCreateBuilder);
            }
            if (!this.f) {
                return ahng.n(aihfVarCreateBuilder);
            }
            afkb afkbVar = this.s;
            afkbVar.getClass();
            afxd afxdVarF = afxd.f(afkbVar.a());
            agek agekVar = new agek() { // from class: itn
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    aihf aihfVarCreateBuilder14 = aseq.a.createBuilder();
                    ajsv ajsvVar = ajsv.a;
                    aihf aihfVarCreateBuilder15 = ajsvVar.createBuilder();
                    aihfVarCreateBuilder15.copyOnWrite();
                    ajsv ajsvVar2 = (ajsv) aihfVarCreateBuilder15.instance;
                    ajsvVar2.b |= SemanticState.Focused;
                    ajsvVar2.g = "cancel";
                    aihfVarCreateBuilder15.copyOnWrite();
                    ajsv ajsvVar3 = (ajsv) aihfVarCreateBuilder15.instance;
                    ajsvVar3.b |= SemanticState.LiveRegion;
                    ajsvVar3.h = "cancel";
                    aihfVarCreateBuilder15.copyOnWrite();
                    ajsv ajsvVar4 = (ajsv) aihfVarCreateBuilder15.instance;
                    ajsvVar4.f = 6;
                    ajsvVar4.b |= 8;
                    CommandOuterClass$Command commandOuterClass$CommandD = ixt.D();
                    aihfVarCreateBuilder15.copyOnWrite();
                    ajsv ajsvVar5 = (ajsv) aihfVarCreateBuilder15.instance;
                    commandOuterClass$CommandD.getClass();
                    ajsvVar5.e = commandOuterClass$CommandD;
                    ajsvVar5.b |= 4;
                    aihfVarCreateBuilder14.cw((ajsv) aihfVarCreateBuilder15.build());
                    aihf aihfVarCreateBuilder16 = ajsvVar.createBuilder();
                    itq itqVar = this.a;
                    Context context3 = itqVar.b;
                    String string2 = context3.getString(R.string.library_downloads_shelf_title);
                    aihfVarCreateBuilder16.copyOnWrite();
                    ajsv ajsvVar6 = (ajsv) aihfVarCreateBuilder16.instance;
                    string2.getClass();
                    ajsvVar6.b |= 1;
                    ajsvVar6.c = string2;
                    aihfVarCreateBuilder16.copyOnWrite();
                    ajsv ajsvVar7 = (ajsv) aihfVarCreateBuilder16.instance;
                    ajsvVar7.b |= SemanticState.Focused;
                    ajsvVar7.g = "Downloads_chip_key";
                    aihfVarCreateBuilder16.copyOnWrite();
                    ajsv ajsvVar8 = (ajsv) aihfVarCreateBuilder16.instance;
                    ajsvVar8.b |= SemanticState.LiveRegion;
                    ajsvVar8.h = "root";
                    aihh aihhVar10 = (aihh) CommandOuterClass$Command.a.createBuilder();
                    aihhVar10.e(almz.a, vxh.a("FEmusic_offline"));
                    CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihhVar10.build();
                    aihfVarCreateBuilder16.copyOnWrite();
                    ajsv ajsvVar9 = (ajsv) aihfVarCreateBuilder16.instance;
                    commandOuterClass$Command.getClass();
                    ajsvVar9.d = commandOuterClass$Command;
                    ajsvVar9.b |= 2;
                    apyu apyuVar3 = apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS;
                    CommandOuterClass$Command commandOuterClass$CommandE = ixt.E(apyuVar3.name());
                    aihfVarCreateBuilder16.copyOnWrite();
                    ajsv ajsvVar10 = (ajsv) aihfVarCreateBuilder16.instance;
                    commandOuterClass$CommandE.getClass();
                    ajsvVar10.e = commandOuterClass$CommandE;
                    ajsvVar10.b |= 4;
                    aihfVarCreateBuilder14.cw((ajsv) aihfVarCreateBuilder16.build());
                    aihf aihfVarCreateBuilder17 = ajsvVar.createBuilder();
                    String string3 = context3.getString(R.string.library_device_files_songs_shelf_title);
                    aihfVarCreateBuilder17.copyOnWrite();
                    ajsv ajsvVar11 = (ajsv) aihfVarCreateBuilder17.instance;
                    string3.getClass();
                    ajsvVar11.b |= 1;
                    ajsvVar11.c = string3;
                    aihfVarCreateBuilder17.copyOnWrite();
                    ajsv ajsvVar12 = (ajsv) aihfVarCreateBuilder17.instance;
                    ajsvVar12.b |= SemanticState.Focused;
                    ajsvVar12.g = "Sideloaded_chip_preselected";
                    aihfVarCreateBuilder17.copyOnWrite();
                    ajsv ajsvVar13 = (ajsv) aihfVarCreateBuilder17.instance;
                    ajsvVar13.b |= SemanticState.LiveRegion;
                    ajsvVar13.h = "root";
                    CommandOuterClass$Command commandOuterClass$CommandE2 = ixt.E(apyuVar3.name());
                    aihfVarCreateBuilder17.copyOnWrite();
                    ajsv ajsvVar14 = (ajsv) aihfVarCreateBuilder17.instance;
                    commandOuterClass$CommandE2.getClass();
                    ajsvVar14.d = commandOuterClass$CommandE2;
                    ajsvVar14.b |= 2;
                    CommandOuterClass$Command commandOuterClass$CommandD2 = ixt.D();
                    aihfVarCreateBuilder17.copyOnWrite();
                    ajsv ajsvVar15 = (ajsv) aihfVarCreateBuilder17.instance;
                    commandOuterClass$CommandD2.getClass();
                    ajsvVar15.e = commandOuterClass$CommandD2;
                    ajsvVar15.b |= 4;
                    aihfVarCreateBuilder14.cw((ajsv) aihfVarCreateBuilder17.build());
                    aihfVarCreateBuilder14.cw(itqVar.g(R.string.library_playlists_shelf_title, apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS));
                    aihfVarCreateBuilder14.cw(itqVar.g(R.string.library_albums_shelf_title, apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ALBUMS));
                    aihfVarCreateBuilder14.cw(itqVar.g(R.string.library_artists_shelf_title, apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ARTISTS));
                    aihfVarCreateBuilder14.copyOnWrite();
                    aihn aihnVar = aihfVarCreateBuilder14.instance;
                    aihf aihfVar = aihfVarCreateBuilder;
                    aseq aseqVar = (aseq) aihnVar;
                    aseqVar.b |= 1;
                    aseqVar.d = "Sideloaded_chip_preselected";
                    asmv asmvVarI = ((afzx) obj).i((aseq) aihfVarCreateBuilder14.build());
                    aihh aihhVar11 = (aihh) akrn.a.createBuilder();
                    acxu.b(aihhVar11, asmvVarI);
                    akrn akrnVar = (akrn) aihhVar11.build();
                    aihf aihfVarCreateBuilder18 = apoo.a.createBuilder();
                    aihfVarCreateBuilder18.copyOnWrite();
                    apoo apooVar = (apoo) aihfVarCreateBuilder18.instance;
                    akrnVar.getClass();
                    apooVar.c = akrnVar;
                    apooVar.b = 153515154;
                    apoo apooVar2 = (apoo) aihfVarCreateBuilder18.build();
                    itqVar.f = false;
                    aihfVar.copyOnWrite();
                    apoq apoqVar3 = (apoq) aihfVar.instance;
                    apoq apoqVar4 = apoq.a;
                    apooVar2.getClass();
                    apoqVar3.h = apooVar2;
                    apoqVar3.c |= 2;
                    return aihfVar;
                }
            };
            Executor executor = this.o;
            return afxdVarF.g(agekVar, executor).b(ExecutionException.class, new itg(aihfVarCreateBuilder, i3), executor);
        }
        ArrayList arrayList = new ArrayList();
        boolean z = cls == anyx.class;
        if (z || cls == anuk.class) {
            jkj jkjVar = new jkj();
            jkjVar.c(this.b.getString(R.string.library_playlists_shelf_title));
            jkjVar.d(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS.name());
            jkjVar.b(cls == anuk.class);
            arrayList.add(jkjVar.a());
        }
        if (z || cls == anjx.class) {
            jkj jkjVar2 = new jkj();
            jkjVar2.c(this.b.getString(R.string.library_albums_shelf_title));
            jkjVar2.d(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ALBUMS.name());
            jkjVar2.b(cls == anjx.class);
            arrayList.add(jkjVar2.a());
        }
        if (z || cls == ankr.class) {
            jkj jkjVar3 = new jkj();
            jkjVar3.c(this.b.getString(R.string.library_artists_shelf_title));
            jkjVar3.d(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ARTISTS.name());
            jkjVar3.b(cls == ankr.class);
            arrayList.add(jkjVar3.a());
        }
        ixt.F(aihfVarCreateBuilder, arrayList, apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS.name());
        return ahng.n(aihfVarCreateBuilder);
    }

    public final ajsv g(int i2, apyu apyuVar) {
        aihf aihfVarCreateBuilder = ajsv.a.createBuilder();
        String string = this.b.getString(i2);
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar = (ajsv) aihfVarCreateBuilder.instance;
        string.getClass();
        ajsvVar.b |= 1;
        ajsvVar.c = string;
        String strValueOf = String.valueOf(apyuVar.name());
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar2 = (ajsv) aihfVarCreateBuilder.instance;
        ajsvVar2.b |= SemanticState.Focused;
        ajsvVar2.g = "Sideloaded_chip_".concat(strValueOf);
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar3 = (ajsv) aihfVarCreateBuilder.instance;
        ajsvVar3.b |= SemanticState.LiveRegion;
        ajsvVar3.h = "Sideloaded_chip_preselected";
        CommandOuterClass$Command commandOuterClass$CommandE = ixt.E(apyuVar.name());
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar4 = (ajsv) aihfVarCreateBuilder.instance;
        commandOuterClass$CommandE.getClass();
        ajsvVar4.d = commandOuterClass$CommandE;
        ajsvVar4.b |= 2;
        CommandOuterClass$Command commandOuterClass$CommandE2 = ixt.E(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS.name());
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar5 = (ajsv) aihfVarCreateBuilder.instance;
        commandOuterClass$CommandE2.getClass();
        ajsvVar5.e = commandOuterClass$CommandE2;
        ajsvVar5.b |= 4;
        return (ajsv) aihfVarCreateBuilder.build();
    }

    public final void j() {
        this.f = true;
    }
}
