package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Collection;
import j$.util.Comparator$EL;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hur implements wnf {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/service/OfflineBrowsePageGenerationService");
    public static final agkj b;
    public static final agkj c;
    private final vxz A;
    private final vxz B;
    private final syn C;
    private final abxv D;
    private final jnm E;
    private final hfn F;
    public final Context d;
    public final Executor e;
    public final Executor f;
    public akmy i;
    public anqm j;
    public boolean k;
    public final hbf l;
    public final tfq m;
    public final vxz o;
    public final kwq p;
    private final hnq r;
    private final hpk s;
    private final jlb t;
    private final jks u;
    private final zwb v;
    private final hpy w;
    private afkb x;
    private final Map y;
    private final Map z;
    public htd g = null;
    public gny n = null;
    public boolean h = false;

    static {
        zh zhVar = new zh();
        zhVar.a = 2;
        zhVar.e(imj.c);
        b = agkj.j("display_context", zhVar.d());
        akmy akmyVar = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT;
        acb acbVar = new acb((byte[]) null, (byte[]) null);
        acbVar.c("PPAD");
        acbVar.d(5);
        imi imiVarB = acbVar.b();
        akmy akmyVar2 = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS;
        acb acbVar2 = new acb((byte[]) null, (byte[]) null);
        acbVar2.c("PPAD");
        acbVar2.d(4);
        imi imiVarB2 = acbVar2.b();
        akmy akmyVar3 = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP;
        acb acbVar3 = new acb((byte[]) null, (byte[]) null);
        acbVar3.c("PPAD");
        acbVar3.d(4);
        c = agkj.l(akmyVar, imiVarB, akmyVar2, imiVarB2, akmyVar3, acbVar3.b());
    }

    public hur(Context context, hnq hnqVar, jnm jnmVar, hpk hpkVar, hfn hfnVar, kwq kwqVar, jlb jlbVar, jks jksVar, abxv abxvVar, hbf hbfVar, syn synVar, zwb zwbVar, tfq tfqVar, hpy hpyVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, Executor executor, Executor executor2, aunn aunnVar) {
        akmy akmyVar = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT;
        this.i = akmyVar;
        this.j = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED;
        this.k = false;
        akmz akmzVar = akmz.SORT_RELOAD_CONTINUATION_TOKEN_RECENTS;
        this.y = new HashMap(agkj.q(akmyVar, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS, akmzVar, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS_DOWNLOADED_SUBCHIP, akmzVar));
        this.z = new HashMap(agkj.n(akmzVar, aofy.OFFLINE_PLAYLIST_SORT_ORDER_RECENTS, akmz.SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_ADDED, aofy.OFFLINE_PLAYLIST_SORT_ORDER_RECENTLY_ADDED, akmz.SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_PLAYED, aofy.OFFLINE_PLAYLIST_SORT_ORDER_RECENTLY_PLAYED, akmz.SORT_RELOAD_CONTINUATION_TOKEN_A_TO_Z, aofy.OFFLINE_PLAYLIST_SORT_ORDER_A_TO_Z, akmz.SORT_RELOAD_CONTINUATION_TOKEN_Z_TO_A, aofy.OFFLINE_PLAYLIST_SORT_ORDER_Z_TO_A));
        this.d = context;
        this.r = hnqVar;
        this.E = jnmVar;
        this.s = hpkVar;
        this.F = hfnVar;
        this.l = hbfVar;
        this.p = kwqVar;
        this.t = jlbVar;
        this.u = jksVar;
        this.D = abxvVar;
        this.C = synVar;
        this.v = zwbVar;
        this.m = tfqVar;
        this.w = hpyVar;
        this.A = vxzVar;
        this.o = vxzVar2;
        this.B = vxzVar3;
        this.e = executor;
        this.f = executor2;
        if (vxzVar.l(206, 45734052L, false)) {
            this.x = new afkb(afwl.c(new gwj(aunnVar, executor2, 5)), executor2);
        }
    }

    public static final ajsv p(String str, akmy akmyVar) {
        aihf aihfVarCreateBuilder = ajsv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar = (ajsv) aihfVarCreateBuilder.instance;
        str.getClass();
        ajsvVar.b |= 1;
        ajsvVar.c = str;
        String strValueOf = String.valueOf(akmyVar.name());
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar2 = (ajsv) aihfVarCreateBuilder.instance;
        ajsvVar2.b |= SemanticState.Focused;
        ajsvVar2.g = "Offline_chip_".concat(strValueOf);
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar3 = (ajsv) aihfVarCreateBuilder.instance;
        ajsvVar3.b |= SemanticState.LiveRegion;
        ajsvVar3.h = "Offline_chip_preselected";
        CommandOuterClass$Command commandOuterClass$CommandE = ixt.E(akmyVar.name());
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar4 = (ajsv) aihfVarCreateBuilder.instance;
        commandOuterClass$CommandE.getClass();
        ajsvVar4.d = commandOuterClass$CommandE;
        ajsvVar4.b |= 2;
        CommandOuterClass$Command commandOuterClass$CommandE2 = ixt.E(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT.name());
        aihfVarCreateBuilder.copyOnWrite();
        ajsv ajsvVar5 = (ajsv) aihfVarCreateBuilder.instance;
        commandOuterClass$CommandE2.getClass();
        ajsvVar5.e = commandOuterClass$CommandE2;
        ajsvVar5.b |= 4;
        return (ajsv) aihfVarCreateBuilder.build();
    }

    public static final ajwo q(ajwo... ajwoVarArr) {
        aihf aihfVarCreateBuilder = ajwm.a.createBuilder();
        for (ajwo ajwoVar : ajwoVarArr) {
            aihfVarCreateBuilder.aP(ajwoVar);
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajwm.b, (ajwm) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static final ajwo r() {
        alhe alheVar = alhe.a;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(alhe.b, alheVar);
        return (ajwo) aihhVar.build();
    }

    public static final ajwo s() {
        anxk anxkVar = anxk.a;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(anxl.a, anxkVar);
        return (ajwo) aihhVar.build();
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        akmy akmyVarA;
        String str;
        akmy akmyVar;
        hle hleVarA = hle.a(acjxVar.c());
        if (!hleVarA.c() || (akmyVar = this.i) == null) {
            akna aknaVar = hleVarA.c;
            agkj agkjVar = hle.b;
            if (aknaVar.b != 1 || (akmyVarA = akmy.a(((Integer) aknaVar.c).intValue())) == null) {
                akmyVarA = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED;
            }
            str = (String) agkjVar.get(akmyVarA);
        } else {
            str = (String) hle.b.get(akmyVar);
        }
        if (str == null) {
            throw new IllegalArgumentException("Unsupported continuation: ".concat(String.valueOf(acjxVar.c())));
        }
        abxv abxvVar = this.D;
        aihh aihhVar = (aihh) almb.a.createBuilder();
        aihhVar.copyOnWrite();
        almb almbVar = (almb) aihhVar.instance;
        almbVar.b |= 2;
        almbVar.e = str;
        String strC = acjxVar.c();
        aihhVar.copyOnWrite();
        almb almbVar2 = (almb) aihhVar.instance;
        strC.getClass();
        almbVar2.b |= 16;
        almbVar2.h = strC;
        huq huqVar = new huq(abxvVar, (almb) aihhVar.build());
        huqVar.m();
        return huqVar;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        boolean z;
        akmy akmyVarA;
        akmz akmzVarA;
        akmy akmyVarA2;
        hle hleVarA = hle.a(((almb) ((huq) wluVar).a().instance).h);
        if (this.g == null || this.h) {
            z = true;
        } else {
            akna aknaVar = hleVarA.c;
            if (aknaVar.b != 1 || (akmyVarA2 = akmy.a(((Integer) aknaVar.c).intValue())) == null) {
                akmyVarA2 = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED;
            }
            if (akmyVarA2.equals(this.i)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (hleVarA.c()) {
            Map map = this.y;
            akmy akmyVar = this.i;
            akna aknaVar2 = hleVarA.c;
            if (aknaVar2.b != 2 || (akmzVarA = akmz.a(((Integer) aknaVar2.c).intValue())) == null) {
                akmzVarA = akmz.SORT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED;
            }
            map.put(akmyVar, akmzVarA);
        } else {
            akna aknaVar3 = hleVarA.c;
            if (aknaVar3.b != 1 || (akmyVarA = akmy.a(((Integer) aknaVar3.c).intValue())) == null) {
                akmyVarA = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED;
            }
            this.i = akmyVarA;
        }
        if (!z) {
            n(zzaVar);
        } else {
            taf.i(this.s.f(), this.e, new gtq(zzaVar, 19), new gov(this, zzaVar, 18), null);
        }
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final ListenableFuture e() {
        ListenableFuture listenableFutureI = i();
        ListenableFuture listenableFutureF = f(false);
        return ahno.ax(listenableFutureI, listenableFutureF).k(new egz(this, listenableFutureI, listenableFutureF, 14), this.f);
    }

    public final ListenableFuture f(boolean z) {
        ajnf ajnfVarJ;
        final aihf aihfVarCreateBuilder = apoq.a.createBuilder();
        aihf aihfVarCreateBuilder2 = apos.a.createBuilder();
        aihf aihfVarCreateBuilder3 = apho.a.createBuilder();
        String strName = this.i.name();
        aihfVarCreateBuilder3.copyOnWrite();
        apho aphoVar = (apho) aihfVarCreateBuilder3.instance;
        strName.getClass();
        aphoVar.c |= 1;
        aphoVar.d = strName;
        aihfVarCreateBuilder2.copyOnWrite();
        apos aposVar = (apos) aihfVarCreateBuilder2.instance;
        apho aphoVar2 = (apho) aihfVarCreateBuilder3.build();
        aphoVar2.getClass();
        aposVar.e = aphoVar2;
        aposVar.b |= 4;
        aihfVarCreateBuilder.cl(aihfVarCreateBuilder2);
        if (z && (ajnfVarJ = j()) != null) {
            aihf aihfVarCreateBuilder4 = apon.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            apon aponVar = (apon) aihfVarCreateBuilder4.instance;
            aponVar.c = ajnfVarJ;
            aponVar.b = 65153809;
            aihfVarCreateBuilder.copyOnWrite();
            apoq apoqVar = (apoq) aihfVarCreateBuilder.instance;
            apon aponVar2 = (apon) aihfVarCreateBuilder4.build();
            aponVar2.getClass();
            apoqVar.i = aponVar2;
            apoqVar.c |= 32;
        }
        if (this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP) || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP) || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP) || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS_DOWNLOADED_SUBCHIP)) {
            return ahng.n(aihfVarCreateBuilder);
        }
        if (this.A.l(206, 45734052L, false)) {
            if (!this.k) {
                return ahng.n(aihfVarCreateBuilder);
            }
            afkb afkbVar = this.x;
            afkbVar.getClass();
            afxd afxdVarF = afxd.f(afkbVar.a());
            agek agekVar = new agek() { // from class: hum
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    aihf aihfVarCreateBuilder5 = aseq.a.createBuilder();
                    ajsv ajsvVar = ajsv.a;
                    aihf aihfVarCreateBuilder6 = ajsvVar.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    ajsv ajsvVar2 = (ajsv) aihfVarCreateBuilder6.instance;
                    ajsvVar2.b |= SemanticState.Focused;
                    ajsvVar2.g = "cancel";
                    aihfVarCreateBuilder6.copyOnWrite();
                    ajsv ajsvVar3 = (ajsv) aihfVarCreateBuilder6.instance;
                    ajsvVar3.b |= SemanticState.LiveRegion;
                    ajsvVar3.h = "cancel";
                    aihfVarCreateBuilder6.copyOnWrite();
                    ajsv ajsvVar4 = (ajsv) aihfVarCreateBuilder6.instance;
                    ajsvVar4.f = 6;
                    ajsvVar4.b |= 8;
                    CommandOuterClass$Command commandOuterClass$CommandD = ixt.D();
                    aihfVarCreateBuilder6.copyOnWrite();
                    ajsv ajsvVar5 = (ajsv) aihfVarCreateBuilder6.instance;
                    commandOuterClass$CommandD.getClass();
                    ajsvVar5.e = commandOuterClass$CommandD;
                    ajsvVar5.b |= 4;
                    aihfVarCreateBuilder5.cw((ajsv) aihfVarCreateBuilder6.build());
                    aihf aihfVarCreateBuilder7 = ajsvVar.createBuilder();
                    hur hurVar = this.a;
                    Context context = hurVar.d;
                    String string = context.getString(R.string.library_downloads_shelf_title);
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajsv ajsvVar6 = (ajsv) aihfVarCreateBuilder7.instance;
                    string.getClass();
                    ajsvVar6.b |= 1;
                    ajsvVar6.c = string;
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajsv ajsvVar7 = (ajsv) aihfVarCreateBuilder7.instance;
                    ajsvVar7.b |= SemanticState.Focused;
                    ajsvVar7.g = "Offline_chip_preselected";
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajsv ajsvVar8 = (ajsv) aihfVarCreateBuilder7.instance;
                    ajsvVar8.b |= SemanticState.LiveRegion;
                    ajsvVar8.h = "root";
                    akmy akmyVar = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT;
                    CommandOuterClass$Command commandOuterClass$CommandE = ixt.E(akmyVar.name());
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajsv ajsvVar9 = (ajsv) aihfVarCreateBuilder7.instance;
                    commandOuterClass$CommandE.getClass();
                    ajsvVar9.d = commandOuterClass$CommandE;
                    ajsvVar9.b |= 2;
                    CommandOuterClass$Command commandOuterClass$CommandD2 = ixt.D();
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajsv ajsvVar10 = (ajsv) aihfVarCreateBuilder7.instance;
                    commandOuterClass$CommandD2.getClass();
                    ajsvVar10.e = commandOuterClass$CommandD2;
                    ajsvVar10.b |= 4;
                    aihfVarCreateBuilder5.cw((ajsv) aihfVarCreateBuilder7.build());
                    aihf aihfVarCreateBuilder8 = ajsvVar.createBuilder();
                    String string2 = context.getString(R.string.library_device_files_songs_shelf_title);
                    aihfVarCreateBuilder8.copyOnWrite();
                    ajsv ajsvVar11 = (ajsv) aihfVarCreateBuilder8.instance;
                    string2.getClass();
                    ajsvVar11.b |= 1;
                    ajsvVar11.c = string2;
                    aihfVarCreateBuilder8.copyOnWrite();
                    ajsv ajsvVar12 = (ajsv) aihfVarCreateBuilder8.instance;
                    ajsvVar12.b |= SemanticState.Focused;
                    ajsvVar12.g = "Sideloaded_chip_key";
                    aihfVarCreateBuilder8.copyOnWrite();
                    ajsv ajsvVar13 = (ajsv) aihfVarCreateBuilder8.instance;
                    ajsvVar13.b |= SemanticState.LiveRegion;
                    ajsvVar13.h = "root";
                    aihh aihhVar = (aihh) CommandOuterClass$Command.a.createBuilder();
                    aihhVar.e(almz.a, vxh.a("FEmusic_library_sideloaded_tracks"));
                    CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihhVar.build();
                    aihfVarCreateBuilder8.copyOnWrite();
                    ajsv ajsvVar14 = (ajsv) aihfVarCreateBuilder8.instance;
                    commandOuterClass$Command.getClass();
                    ajsvVar14.d = commandOuterClass$Command;
                    ajsvVar14.b |= 2;
                    CommandOuterClass$Command commandOuterClass$CommandE2 = ixt.E(akmyVar.name());
                    aihfVarCreateBuilder8.copyOnWrite();
                    ajsv ajsvVar15 = (ajsv) aihfVarCreateBuilder8.instance;
                    commandOuterClass$CommandE2.getClass();
                    ajsvVar15.e = commandOuterClass$CommandE2;
                    ajsvVar15.b |= 4;
                    aihfVarCreateBuilder5.cw((ajsv) aihfVarCreateBuilder8.build());
                    aihfVarCreateBuilder5.cw(hur.p(context.getString(R.string.library_playlists_shelf_title), akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS));
                    aihfVarCreateBuilder5.cw(hur.p(hurVar.l.c(), akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS));
                    String string3 = context.getString(R.string.library_songs_shelf_title);
                    aihf aihfVar = aihfVarCreateBuilder;
                    aihfVarCreateBuilder5.cw(hur.p(string3, akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS));
                    aihfVarCreateBuilder5.cw(hur.p(context.getString(R.string.library_albums_shelf_title), akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS));
                    aihfVarCreateBuilder5.copyOnWrite();
                    aseq aseqVar = (aseq) aihfVarCreateBuilder5.instance;
                    aseqVar.b |= 1;
                    aseqVar.d = "Offline_chip_preselected";
                    asmv asmvVarI = ((afzx) obj).i((aseq) aihfVarCreateBuilder5.build());
                    aihh aihhVar2 = (aihh) akrn.a.createBuilder();
                    acxu.b(aihhVar2, asmvVarI);
                    akrn akrnVar = (akrn) aihhVar2.build();
                    aihf aihfVarCreateBuilder9 = apoo.a.createBuilder();
                    aihfVarCreateBuilder9.copyOnWrite();
                    apoo apooVar = (apoo) aihfVarCreateBuilder9.instance;
                    akrnVar.getClass();
                    apooVar.c = akrnVar;
                    apooVar.b = 153515154;
                    apoo apooVar2 = (apoo) aihfVarCreateBuilder9.build();
                    hurVar.k = false;
                    aihfVar.copyOnWrite();
                    apoq apoqVar2 = (apoq) aihfVar.instance;
                    apoq apoqVar3 = apoq.a;
                    apooVar2.getClass();
                    apoqVar2.h = apooVar2;
                    apoqVar2.c |= 2;
                    return aihfVar;
                }
            };
            Executor executor = this.f;
            return afxdVarF.g(agekVar, executor).b(ExecutionException.class, new hrk(aihfVarCreateBuilder, 18), executor);
        }
        ArrayList arrayList = new ArrayList();
        akmy akmyVar = this.i;
        akmy akmyVar2 = akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT;
        boolean zEquals = akmyVar.equals(akmyVar2);
        if (zEquals || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS)) {
            jkj jkjVar = new jkj();
            jkjVar.c(this.d.getString(R.string.library_playlists_shelf_title));
            jkjVar.d(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS.name());
            jkjVar.b(!zEquals);
            arrayList.add(jkjVar.a());
        }
        if (zEquals || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS)) {
            jkj jkjVar2 = new jkj();
            jkjVar2.c(this.l.c());
            jkjVar2.d(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS.name());
            jkjVar2.b(!zEquals);
            arrayList.add(jkjVar2.a());
        }
        if (zEquals || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS)) {
            jkj jkjVar3 = new jkj();
            jkjVar3.c(this.d.getString(R.string.library_songs_shelf_title));
            jkjVar3.d(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS.name());
            jkjVar3.b(!zEquals);
            arrayList.add(jkjVar3.a());
        }
        if (zEquals || this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS)) {
            jkj jkjVar4 = new jkj();
            jkjVar4.c(this.d.getString(R.string.library_albums_shelf_title));
            jkjVar4.d(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS.name());
            jkjVar4.b(!zEquals);
            arrayList.add(jkjVar4.a());
        }
        ixt.F(aihfVarCreateBuilder, arrayList, akmyVar2.name());
        return ahng.n(aihfVarCreateBuilder);
    }

    public final ListenableFuture g(hcg hcgVar, agkh agkhVar) {
        if (this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS)) {
            akmz akmzVar = (akmz) this.y.get(this.i);
            Map map = this.z;
            if (map.containsKey(akmzVar)) {
                agkhVar.e("offline_playlist_sort_order", (aofy) map.get(akmzVar));
            }
        }
        Object obj = hcgVar.a.get();
        if (obj instanceof anyx) {
            return this.F.ao(anyx.class, true != o() ? anzi.class : anzn.class, (anyx) obj, agkhVar.d(true));
        }
        if (obj instanceof anjx) {
            return this.F.ao(anjx.class, true != o() ? anzi.class : anzn.class, (anjx) obj, agkhVar.d(true));
        }
        if (!(obj instanceof anuk)) {
            throw new IllegalArgumentException("Unexpected entity: ".concat(obj.toString()));
        }
        return this.F.ao(anuk.class, true != o() ? anzi.class : anzn.class, (anuk) obj, agkhVar.d(true));
    }

    public final ListenableFuture h() {
        return (this.w.i() || !this.B.m(10, 45616924L)) ? ahno.ar(this.s.h(), new hrk(this, 17), this.f) : ahno.ar(ahng.n(Boolean.FALSE), new hrk(this, 16), this.f);
    }

    public final ListenableFuture i() {
        if (!this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT)) {
            return ahng.n(Optional.empty());
        }
        if (this.E.C()) {
            hnq hnqVar = this.r;
            if (!hnqVar.f() && !hnqVar.g()) {
                afxd afxdVarF = afxd.f(this.C.n(this.v.e()));
                hqj hqjVar = new hqj(this, 10);
                Executor executor = this.f;
                return ahno.ar(afxdVarF.h(hqjVar, executor), new agek() { // from class: huk
                    @Override // defpackage.agek
                    public final Object apply(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            return Optional.empty();
                        }
                        hur hurVar = this.a;
                        aihf aihfVarCreateBuilder = ankz.a.createBuilder();
                        Context context = hurVar.d;
                        alay alayVarI = fhz.I(context, R.string.auto_offline_title);
                        aihfVarCreateBuilder.copyOnWrite();
                        ankz ankzVar = (ankz) aihfVarCreateBuilder.instance;
                        alayVarI.getClass();
                        ankzVar.c = alayVarI;
                        ankzVar.b |= 1;
                        alay alayVarI2 = fhz.I(context, R.string.smart_downloads_education_shelf_description_v2);
                        aihfVarCreateBuilder.copyOnWrite();
                        ankz ankzVar2 = (ankz) aihfVarCreateBuilder.instance;
                        alayVarI2.getClass();
                        ankzVar2.d = alayVarI2;
                        ankzVar2.b |= 4;
                        ajnf ajnfVar = ajnf.a;
                        aihh aihhVar = (aihh) ajnfVar.createBuilder();
                        alay alayVarI3 = fhz.I(context, R.string.smart_downloads_edu_shelf_dismiss_button_text);
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                        alayVarI3.getClass();
                        ajnfVar2.m = alayVarI3;
                        ajnfVar2.b |= 64;
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
                        ajnfVar3.d = 15;
                        ajnfVar3.c = 1;
                        ajwo ajwoVarQ = hur.q(hur.s(), hur.r());
                        aihhVar.copyOnWrite();
                        ajnf ajnfVar4 = (ajnf) aihhVar.instance;
                        ajwoVarQ.getClass();
                        ajnfVar4.s = ajwoVarQ;
                        ajnfVar4.b |= SemanticState.Multiline;
                        ajnf ajnfVar5 = (ajnf) aihhVar.build();
                        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
                        alay alayVarI4 = fhz.I(context, R.string.smart_downloads_edu_shelf_opt_in_button_text);
                        aihhVar2.copyOnWrite();
                        ajnf ajnfVar6 = (ajnf) aihhVar2.instance;
                        alayVarI4.getClass();
                        ajnfVar6.m = alayVarI4;
                        ajnfVar6.b |= 64;
                        aihhVar2.copyOnWrite();
                        ajnf ajnfVar7 = (ajnf) aihhVar2.instance;
                        ajnfVar7.d = 2;
                        ajnfVar7.c = 1;
                        ajwo[] ajwoVarArr = new ajwo[4];
                        aihf aihfVarCreateBuilder2 = apqc.a.createBuilder();
                        aihf aihfVarCreateBuilder3 = apru.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apru apruVar = (apru) aihfVarCreateBuilder3.instance;
                        apruVar.c = 113;
                        apruVar.b |= 1;
                        aihfVarCreateBuilder2.copyOnWrite();
                        apqc apqcVar = (apqc) aihfVarCreateBuilder2.instance;
                        apru apruVar2 = (apru) aihfVarCreateBuilder3.build();
                        apruVar2.getClass();
                        apqcVar.e = apruVar2;
                        apqcVar.b |= 1;
                        aihfVarCreateBuilder2.copyOnWrite();
                        apqc apqcVar2 = (apqc) aihfVarCreateBuilder2.instance;
                        apqcVar2.c = 3;
                        apqcVar2.d = Boolean.TRUE;
                        apqc apqcVar3 = (apqc) aihfVarCreateBuilder2.build();
                        aihf aihfVarCreateBuilder4 = apqd.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        apqd apqdVar = (apqd) aihfVarCreateBuilder4.instance;
                        apqcVar3.getClass();
                        aiie aiieVar = apqdVar.c;
                        if (!aiieVar.c()) {
                            apqdVar.c = aihn.mutableCopy(aiieVar);
                        }
                        apqdVar.c.add(apqcVar3);
                        apqd apqdVar2 = (apqd) aihfVarCreateBuilder4.build();
                        aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
                        aihhVar3.e(apqd.b, apqdVar2);
                        ajwoVarArr[0] = (ajwo) aihhVar3.build();
                        ajwoVarArr[1] = hur.s();
                        ajwoVarArr[2] = hur.r();
                        ajwoVarArr[3] = fhz.P(context.getString(R.string.smart_downloads_introducer_enable_toast));
                        ajwo ajwoVarQ2 = hur.q(ajwoVarArr);
                        aihhVar2.copyOnWrite();
                        ajnf ajnfVar8 = (ajnf) aihhVar2.instance;
                        ajwoVarQ2.getClass();
                        ajnfVar8.s = ajwoVarQ2;
                        ajnfVar8.b |= SemanticState.Multiline;
                        ajnf ajnfVar9 = (ajnf) aihhVar2.build();
                        apji apjiVar = apji.a;
                        aihh aihhVar4 = (aihh) apjiVar.createBuilder();
                        aihhVar4.e(ajnp.a, ajnfVar5);
                        aihfVarCreateBuilder.bK(aihhVar4);
                        aihh aihhVar5 = (aihh) apjiVar.createBuilder();
                        aihhVar5.e(ajnp.a, ajnfVar9);
                        aihfVarCreateBuilder.bK(aihhVar5);
                        return Optional.of((ankz) aihfVarCreateBuilder.build());
                    }
                }, executor);
            }
        }
        return ahng.n(Optional.empty());
    }

    public final ajnf j() {
        int iOrdinal = this.i.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 6) {
            return null;
        }
        ias iasVarG = hna.g();
        iasVarG.b = "PPAD";
        iasVarG.k(true);
        ajwo ajwoVarB = iasVarG.b();
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarD = ackj.d(this.d.getString(R.string.shuffle_all));
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarD.getClass();
        ajnfVar.m = alayVarD;
        ajnfVar.b |= 64;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.SHUFFLE;
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
        ajwoVarB.getClass();
        ajnfVar3.s = ajwoVarB;
        ajnfVar3.b |= SemanticState.Multiline;
        return (ajnf) aihhVar.build();
    }

    public final Optional k(int i) {
        if (i == 0) {
            return Optional.empty();
        }
        aihf aihfVarCreateBuilder = anwz.a.createBuilder();
        akmz akmzVar = (akmz) this.y.get(this.i);
        akmzVar.getClass();
        Context context = this.d;
        String string = context.getString(R.string.sort_selector_option_recently_saved);
        abut abutVar = new abut();
        abutVar.i(context.getString(R.string.sort_selector_option_recent_activity));
        akmz akmzVar2 = akmz.SORT_RELOAD_CONTINUATION_TOKEN_RECENTS;
        abutVar.k(ixt.B(akmzVar2.name()));
        abutVar.h(akmzVar.equals(akmzVar2));
        aiqd aiqdVar = aiqd.a;
        aihf aihfVarCreateBuilder2 = aiqdVar.createBuilder();
        String string2 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.sort_selector_option_recent_activity));
        aihfVarCreateBuilder2.copyOnWrite();
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder2.instance;
        string2.getClass();
        aiqdVar2.b |= 2;
        aiqdVar2.c = string2;
        abutVar.j((aiqd) aihfVarCreateBuilder2.build());
        aihf aihfVarCreateBuilder3 = aiqdVar.createBuilder();
        String string3 = context.getString(R.string.sort_selector_option_recent_activity);
        aihfVarCreateBuilder3.copyOnWrite();
        aiqd aiqdVar3 = (aiqd) aihfVarCreateBuilder3.instance;
        string3.getClass();
        aiqdVar3.b |= 2;
        aiqdVar3.c = string3;
        abutVar.g((aiqd) aihfVarCreateBuilder3.build());
        jla jlaVarF = abutVar.f();
        abut abutVar2 = new abut();
        abutVar2.i(string);
        akmz akmzVar3 = akmz.SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_ADDED;
        abutVar2.k(ixt.B(akmzVar3.name()));
        abutVar2.h(akmzVar.equals(akmzVar3));
        aihf aihfVarCreateBuilder4 = aiqdVar.createBuilder();
        String string4 = context.getString(R.string.sort_filter_button_selected_a11y_label, string);
        aihfVarCreateBuilder4.copyOnWrite();
        aiqd aiqdVar4 = (aiqd) aihfVarCreateBuilder4.instance;
        string4.getClass();
        aiqdVar4.b |= 2;
        aiqdVar4.c = string4;
        abutVar2.j((aiqd) aihfVarCreateBuilder4.build());
        aihf aihfVarCreateBuilder5 = aiqdVar.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        aiqd aiqdVar5 = (aiqd) aihfVarCreateBuilder5.instance;
        string.getClass();
        aiqdVar5.b |= 2;
        aiqdVar5.c = string;
        abutVar2.g((aiqd) aihfVarCreateBuilder5.build());
        jla jlaVarF2 = abutVar2.f();
        abut abutVar3 = new abut();
        abutVar3.i(context.getString(R.string.sort_selector_option_recently_played));
        akmz akmzVar4 = akmz.SORT_RELOAD_CONTINUATION_TOKEN_RECENTLY_PLAYED;
        abutVar3.k(ixt.B(akmzVar4.name()));
        abutVar3.h(akmzVar.equals(akmzVar4));
        aihf aihfVarCreateBuilder6 = aiqdVar.createBuilder();
        String string5 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.sort_selector_option_recently_played));
        aihfVarCreateBuilder6.copyOnWrite();
        aiqd aiqdVar6 = (aiqd) aihfVarCreateBuilder6.instance;
        string5.getClass();
        aiqdVar6.b |= 2;
        aiqdVar6.c = string5;
        abutVar3.j((aiqd) aihfVarCreateBuilder6.build());
        aihf aihfVarCreateBuilder7 = aiqdVar.createBuilder();
        String string6 = context.getString(R.string.sort_selector_option_recently_played);
        aihfVarCreateBuilder7.copyOnWrite();
        aiqd aiqdVar7 = (aiqd) aihfVarCreateBuilder7.instance;
        string6.getClass();
        aiqdVar7.b |= 2;
        aiqdVar7.c = string6;
        abutVar3.g((aiqd) aihfVarCreateBuilder7.build());
        ArrayList arrayList = new ArrayList(agke.s(jlaVarF, jlaVarF2, abutVar3.f()));
        if (!this.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT)) {
            abut abutVar4 = new abut();
            abutVar4.i(context.getString(R.string.sort_selector_option_A_to_Z));
            akmz akmzVar5 = akmz.SORT_RELOAD_CONTINUATION_TOKEN_A_TO_Z;
            abutVar4.k(ixt.B(akmzVar5.name()));
            abutVar4.h(akmzVar.equals(akmzVar5));
            aihf aihfVarCreateBuilder8 = aiqdVar.createBuilder();
            String string7 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.sort_selector_option_A_to_Z));
            aihfVarCreateBuilder8.copyOnWrite();
            aiqd aiqdVar8 = (aiqd) aihfVarCreateBuilder8.instance;
            string7.getClass();
            aiqdVar8.b |= 2;
            aiqdVar8.c = string7;
            abutVar4.j((aiqd) aihfVarCreateBuilder8.build());
            aihf aihfVarCreateBuilder9 = aiqdVar.createBuilder();
            String string8 = context.getString(R.string.sort_selector_option_A_to_Z);
            aihfVarCreateBuilder9.copyOnWrite();
            aiqd aiqdVar9 = (aiqd) aihfVarCreateBuilder9.instance;
            string8.getClass();
            aiqdVar9.b |= 2;
            aiqdVar9.c = string8;
            abutVar4.g((aiqd) aihfVarCreateBuilder9.build());
            jla jlaVarF3 = abutVar4.f();
            abut abutVar5 = new abut();
            abutVar5.i(context.getString(R.string.sort_selector_option_Z_to_A));
            akmz akmzVar6 = akmz.SORT_RELOAD_CONTINUATION_TOKEN_Z_TO_A;
            abutVar5.k(ixt.B(akmzVar6.name()));
            abutVar5.h(akmzVar.equals(akmzVar6));
            aihf aihfVarCreateBuilder10 = aiqdVar.createBuilder();
            String string9 = context.getString(R.string.sort_filter_button_selected_a11y_label, context.getString(R.string.sort_selector_option_Z_to_A));
            aihfVarCreateBuilder10.copyOnWrite();
            aiqd aiqdVar10 = (aiqd) aihfVarCreateBuilder10.instance;
            string9.getClass();
            aiqdVar10.b |= 2;
            aiqdVar10.c = string9;
            abutVar5.j((aiqd) aihfVarCreateBuilder10.build());
            aihf aihfVarCreateBuilder11 = aiqdVar.createBuilder();
            String string10 = context.getString(R.string.sort_selector_option_Z_to_A);
            aihfVarCreateBuilder11.copyOnWrite();
            aiqd aiqdVar11 = (aiqd) aihfVarCreateBuilder11.instance;
            string10.getClass();
            aiqdVar11.b |= 2;
            aiqdVar11.c = string10;
            abutVar5.g((aiqd) aihfVarCreateBuilder11.build());
            arrayList.addAll(agke.r(jlaVarF3, abutVar5.f()));
        }
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihhVar.e(anxo.a, this.t.a(arrayList, context.getString(R.string.sort_selector_header), 2));
        apji apjiVar2 = (apji) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        anwz anwzVar = (anwz) aihfVarCreateBuilder.instance;
        apjiVar2.getClass();
        aiie aiieVar = anwzVar.c;
        if (!aiieVar.c()) {
            anwzVar.c = aihn.mutableCopy(aiieVar);
        }
        anwzVar.c.add(apjiVar2);
        aihfVarCreateBuilder.bS(this.u.b(ixt.B(this.i.name()), this.j));
        if (((anwz) aihfVarCreateBuilder.instance).c.size() == 0 && ((anwz) aihfVarCreateBuilder.instance).d.size() == 0) {
            return Optional.empty();
        }
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(anwz.b, (anwz) aihfVarCreateBuilder.build());
        return Optional.of((apji) aihhVar2.build());
    }

    public final Comparator l() {
        Object hlhVar;
        Map map = this.y;
        akmz akmzVar = (akmz) map.get(this.i);
        akmzVar.getClass();
        int iOrdinal = akmzVar.ordinal();
        int i = 3;
        if (iOrdinal == 1) {
            hlhVar = new hlh();
        } else if (iOrdinal == 2) {
            hlhVar = Comparator$EL.reversed(new hlh());
        } else if (iOrdinal == 3) {
            hlhVar = new hlg(3, false, this.B);
        } else if (iOrdinal == 4) {
            hlhVar = new hlg(1, false, this.B);
        } else {
            if (iOrdinal != 5) {
                throw new IllegalArgumentException("No entity sorter for continuation ".concat(String.valueOf(String.valueOf(map.get(this.i)))));
            }
            hlhVar = new hlg(2, false, this.B);
        }
        return new fui(hlhVar, i, null);
    }

    public final void m() {
        this.n = null;
    }

    public final void n(final zza zzaVar) {
        taf.i(this.u.a(), this.e, new gtq(zzaVar, 18), new tae() { // from class: hul
            /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Collection] */
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                afxd afxdVarH;
                hur hurVar = this.a;
                hurVar.j = (anqm) obj;
                if (hurVar.g != null) {
                    ArrayList arrayList = new ArrayList();
                    boolean zEquals = hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT);
                    int i = 7;
                    if (hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS) || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP)) {
                        arrayList.addAll(hurVar.g.a);
                        htd htdVar = hurVar.g;
                        agke agkeVar = htdVar == null ? agpi.a : (agke) Stream.CC.concat(Collection.EL.stream(htdVar.d), Collection.EL.stream(hurVar.g.e)).map(new hsw(18)).flatMap(new hsw(19)).collect(aghu.a);
                        Stream map = Collection.EL.stream(agkeVar).filter(new hud(3)).map(new hsw(15));
                        Collector collector = aghu.a;
                        agke agkeVar2 = (agke) map.collect(collector);
                        Optional optionalOfNullable = hurVar.g.b;
                        hlx hlxVar = new hlx(agkeVar2, i);
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = Optional.ofNullable((agke) Collection.EL.stream(optionalOfNullable.get()).filter(new gnh(hlxVar.a, 20)).collect(collector));
                        }
                        arrayList.addAll((java.util.Collection) optionalOfNullable.orElse(agpi.a));
                        arrayList.addAll(agkeVar);
                    }
                    if (zEquals || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS) || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP)) {
                        if (hurVar.g.c.isPresent()) {
                            arrayList.add((hcg) hurVar.g.c.get());
                        }
                        arrayList.addAll((agke) Collection.EL.stream(hurVar.g.e).filter(new hud(5)).collect(aghu.a));
                    }
                    int i2 = 16;
                    int i3 = 17;
                    if (zEquals || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS) || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP)) {
                        Context context = hurVar.d;
                        String string = context.getString(R.string.offline_songs_detail_page_title);
                        int i4 = 11;
                        Stream map2 = Collection.EL.stream(hurVar.g.a).map(new hsw(i4)).filter(new hud(4)).map(new hsw(i2));
                        Collector collector2 = aghu.a;
                        int i5 = 13;
                        Optional optionalH = hcg.h(string, "PPSV", (agke) map2.collect(collector2), (agke) Collection.EL.stream(hurVar.g.a).map(new hsw(i5)).filter(new hud(4)).map(new hsw(i3)).collect(collector2));
                        hge hgeVar = new hge(arrayList, i3);
                        if (true == optionalH.isPresent()) {
                            hgeVar.a.add(optionalH.get());
                        }
                        if (hurVar.g.b.isPresent()) {
                            Optional optionalH2 = hcg.h(context.getString(R.string.recent_music_playlist_title), "PPSDST", (agke) Collection.EL.stream(hurVar.g.b.get()).map(new hsw(i4)).filter(new hud(4)).map(new hsw(12)).collect(collector2), (agke) Collection.EL.stream(hurVar.g.b.get()).map(new hsw(i5)).filter(new hud(4)).map(new hsw(14)).collect(collector2));
                            hge hgeVar2 = new hge(arrayList, i3);
                            if (true == optionalH2.isPresent()) {
                                hgeVar2.a.add(optionalH2.get());
                            }
                        }
                    }
                    if (zEquals || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS) || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP)) {
                        arrayList.addAll((agke) Collection.EL.stream(hurVar.g.e).filter(new hud(6)).collect(aghu.a));
                    }
                    if (zEquals || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS) || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS_DOWNLOADED_SUBCHIP)) {
                        arrayList.addAll(hurVar.g.d);
                    }
                    if (hurVar.o()) {
                        ArrayList arrayList2 = new ArrayList();
                        Collection.EL.stream(arrayList).distinct().sorted(hurVar.l()).forEach(new hfo(hurVar, arrayList2, 16, null));
                        afxdVarH = afxd.f(ahng.k(arrayList2)).h(new hqj(hurVar, 7), hurVar.f);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Collection.EL.stream(arrayList).distinct().sorted(hurVar.l()).forEach(new hfo(hurVar, arrayList3, 17, null));
                        afxdVarH = afxd.f(ahng.k(arrayList3)).h(new hqj(hurVar, 8), hurVar.f);
                    }
                    ahno.at(afxdVarH, new hfb(zzaVar, 8), hurVar.e);
                }
            }
        }, null);
    }

    public final boolean o() {
        return this.j == anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_GRID_ITEMS;
    }
}
