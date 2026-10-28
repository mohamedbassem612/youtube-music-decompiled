package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulp implements ulh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel");
    public final usw A;
    public final umy B;
    public final vdv C;
    public final vao D;
    public ShortsPlayerView E;
    public ulx F;
    public final vat G;
    public umi H;
    public final abix I;
    public roq J;
    public final roq K;
    public roq L;
    public final aeiv M;
    public final zf N;
    public final aaok O;
    public final aaok P;
    public final yno Q;
    private final uzk R;
    private final Context S;
    private final vfx T;
    private vfs U;
    private avmn V;
    private avmn W;
    public final Executor b;
    public final avmb c;
    public final bog d;
    public final ukp e;
    public final ukz f;
    public final vfq g;
    public final uxj h;
    public final vab i;
    public final awmd j;
    public avmn k;
    public avmn l;
    public avmn m;
    public avmn n;
    public avmn o;

    @Deprecated
    public long q;
    public usd r;
    public use t;
    public final ulj v;
    public final zvl x;
    public final ugf y;
    public final uwi z;
    public Uri p = Uri.EMPTY;
    public Size s = new Size(0, 0);
    public final List u = new ArrayList();
    public final avmm w = new avmm();

    public ulp(Context context, Executor executor, bog bogVar, aaok aaokVar, vao vaoVar, ulj uljVar, abix abixVar, yno ynoVar, uwi uwiVar, ukp ukpVar, vab vabVar, uzk uzkVar, zvl zvlVar, ugf ugfVar, vat vatVar, ukz ukzVar, awmd awmdVar, avmb avmbVar, zf zfVar, usw uswVar, aeda aedaVar, afip afipVar, roq roqVar, aeiv aeivVar, umy umyVar, vdv vdvVar, aaok aaokVar2, Optional optional, vfq vfqVar, uxj uxjVar) {
        this.S = aedaVar.i() ? afipVar.b() : context;
        this.b = executor;
        this.d = bogVar;
        this.e = ukpVar;
        this.T = (vfx) optional.orElse(null);
        this.f = ukzVar;
        this.g = vfqVar;
        this.P = aaokVar;
        this.D = vaoVar;
        this.h = uxjVar;
        this.v = uljVar;
        this.I = abixVar;
        this.Q = ynoVar;
        this.z = uwiVar;
        this.y = ugfVar;
        this.i = vabVar;
        this.x = zvlVar;
        this.G = vatVar;
        this.R = uzkVar;
        this.j = awmdVar;
        this.c = avmbVar;
        this.N = zfVar;
        this.A = uswVar;
        this.K = roqVar;
        this.M = aeivVar;
        this.B = umyVar;
        this.C = vdvVar;
        this.O = aaokVar2;
    }

    @Override // defpackage.ulh
    public final void c(Exception exc) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 16;
        zvjVarA.d("[ShortsCreation][Android][Edit] Player error in edit fragment");
        zvjVarA.f(exc);
        this.x.a(zvjVarA.a());
        ((agrc) ((agrc) ((agrc) a.b()).j(exc)).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "onPlayerError", (char) 1411, "ShortsEditViewModel.java")).t("Player error ");
        ShortsPlayerView shortsPlayerView = this.E;
        if (shortsPlayerView != null) {
            roq roqVar = shortsPlayerView.q;
            if (roqVar != null) {
                ugo ugoVarK = roqVar.k(xhb.b(107384));
                ugoVarK.h(true);
                ugoVarK.c();
            }
            Executor executor = shortsPlayerView.g;
            if (executor != null) {
                executor.execute(afwl.i(new ull(shortsPlayerView, 2)));
            }
        }
    }

    @Override // defpackage.ulh
    public final void d(btz btzVar) {
        int i;
        ShortsPlayerView shortsPlayerView;
        int i2 = btzVar.c;
        if (i2 == 0 || (i = btzVar.b) == 0 || (shortsPlayerView = this.E) == null) {
            return;
        }
        shortsPlayerView.d((i * btzVar.d) / i2);
    }

    public final vfs g() {
        vfs vfsVar = this.U;
        if (vfsVar != null) {
            return vfsVar;
        }
        vfq vfqVar = this.g;
        vfp vfpVar = vfqVar.b;
        vft vftVarB = vfqVar.b();
        if (vftVarB != null) {
            vftVarB.J();
            vfs vfsVar2 = new vfs(vftVarB, vfpVar.g);
            this.U = vfsVar2;
            return vfsVar2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Creating ShortsEditorProjectState with null project state.");
        ((agrc) ((agrc) ((agrc) vfp.a.b()).j(illegalStateException)).k("com/google/android/libraries/youtube/creation/projectstate/ProjectStateFactory", "createEditorProjectState", (char) 189, "ProjectStateFactory.java")).t("Creating ShortsEditorProjectState with null project state.");
        zvl zvlVar = vfpVar.d;
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 40;
        zvjVarA.d("[ShortsCreation][Android][Edit]Creating ShortsEditorProjectState with null project state.");
        zvjVarA.f(illegalStateException);
        zvlVar.a(zvjVarA.a());
        throw illegalStateException;
    }

    public final void h(agke agkeVar) {
        usd usdVar = this.r;
        if (usdVar != null) {
            usdVar.h(new uug(agkeVar, 0));
            i();
        }
    }

    public final void i() {
        if (this.r != null) {
            g().b(this.r.c());
        }
    }

    public final void j() {
        Object obj = this.o;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.o = null;
        }
    }

    public final void k() {
        Object obj = this.k;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.k = null;
        }
    }

    public final void l(Optional optional) {
        ajai ajaiVar;
        if (!a.x()) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "loadVideo", 1262, "ShortsEditViewModel.java")).t("not calling loadVideo from UI thread!");
            zvl zvlVar = this.x;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 16;
            zvjVarA.d("[ShortsCreation][Android][Edit] not calling loadVideo from UI thread!");
            zvlVar.a(zvjVarA.a());
        }
        if (this.p.equals(Uri.EMPTY) || this.q == 0) {
            return;
        }
        if (optional.isPresent() && ((vdg) optional.get()).l == null) {
            return;
        }
        if (!optional.isPresent()) {
            vfs vfsVarG = g();
            if (!vfsVarG.c.isEmpty()) {
                vfsVarG.c = Optional.empty();
                vft vftVar = vfsVarG.a;
                vftVar.q();
                Duration.ofMillis(vfs.d(vftVar) ? vfsVarG.h.y() : vfsVarG.h.x());
                vfsVarG.a();
            }
        } else {
            if (((vxz) this.P.b).l(468, 45746514L, false)) {
                if (this.g.a() == null) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "loadVideo", 1285, "ShortsEditViewModel.java")).t("shortsCameraProjectState is null when loading video");
                    return;
                } else {
                    g();
                    throw null;
                }
            }
            vfs vfsVarG2 = g();
            vdg vdgVar = (vdg) optional.get();
            boolean zC = vfsVarG2.h.C();
            auii auiiVar = auii.a;
            aihf aihfVarCreateBuilder = auiiVar.createBuilder();
            if (zC && (ajaiVar = vdgVar.H) != null) {
                aihfVarCreateBuilder.copyOnWrite();
                auii auiiVar2 = (auii) aihfVarCreateBuilder.instance;
                auiiVar2.o = ajaiVar;
                auiiVar2.b |= SemanticState.Obscured;
            }
            auhu auhuVar = vdgVar.x;
            if (auhuVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                auii auiiVar3 = (auii) aihfVarCreateBuilder.instance;
                auiiVar3.l = auhuVar;
                auiiVar3.b |= SemanticState.LiveRegion;
                auiiVar = (auii) aihfVarCreateBuilder.build();
            } else {
                String str = vdgVar.d;
                if (str != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    auii auiiVar4 = (auii) aihfVarCreateBuilder.instance;
                    auiiVar4.b |= 1;
                    auiiVar4.c = str;
                    aqmh aqmhVar = vdgVar.j;
                    String str2 = vdgVar.k;
                    if (aqmhVar != null && str2 != null) {
                        aihf aihfVarCreateBuilder2 = auev.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        auev auevVar = (auev) aihfVarCreateBuilder2.instance;
                        auevVar.d = aqmhVar;
                        auevVar.b |= 2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        auev auevVar2 = (auev) aihfVarCreateBuilder2.instance;
                        auevVar2.b |= 1;
                        auevVar2.c = str2;
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar5 = (auii) aihfVarCreateBuilder.instance;
                        auev auevVar3 = (auev) aihfVarCreateBuilder2.build();
                        auevVar3.getClass();
                        auiiVar5.e = auevVar3;
                        auiiVar5.b |= 4;
                    }
                    auin auinVar = auin.a;
                    aihf aihfVarCreateBuilder3 = auinVar.createBuilder();
                    long j = vdgVar.f;
                    aihfVarCreateBuilder3.copyOnWrite();
                    auin auinVar2 = (auin) aihfVarCreateBuilder3.instance;
                    auinVar2.b |= 1;
                    auinVar2.c = (int) j;
                    long j2 = vdgVar.o;
                    aihfVarCreateBuilder3.copyOnWrite();
                    auin auinVar3 = (auin) aihfVarCreateBuilder3.instance;
                    auinVar3.b |= 2;
                    auinVar3.d = (int) j2;
                    auin auinVar4 = (auin) aihfVarCreateBuilder3.build();
                    String str3 = vdgVar.g;
                    if (str3 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar6 = (auii) aihfVarCreateBuilder.instance;
                        auiiVar6.b |= 8;
                        auiiVar6.f = str3;
                    }
                    ajwo ajwoVar = vdgVar.h;
                    if (ajwoVar != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar7 = (auii) aihfVarCreateBuilder.instance;
                        auiiVar7.g = ajwoVar;
                        auiiVar7.b |= 16;
                    }
                    long j3 = vdgVar.u;
                    aihfVarCreateBuilder.copyOnWrite();
                    auii auiiVar8 = (auii) aihfVarCreateBuilder.instance;
                    auiiVar8.b |= 64;
                    auiiVar8.i = (int) j3;
                    apvm apvmVar = vdgVar.m;
                    if (apvmVar != null) {
                        String str4 = apvmVar.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar9 = (auii) aihfVarCreateBuilder.instance;
                        str4.getClass();
                        auiiVar9.b |= SemanticState.Focused;
                        auiiVar9.j = str4;
                    }
                    ajwo ajwoVar2 = vdgVar.w;
                    if (ajwoVar2 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar10 = (auii) aihfVarCreateBuilder.instance;
                        auiiVar10.k = ajwoVar2;
                        auiiVar10.b |= SemanticState.Hidden;
                    }
                    String str5 = vdgVar.A;
                    if (!str5.isEmpty()) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar11 = (auii) aihfVarCreateBuilder.instance;
                        str5.getClass();
                        auiiVar11.b |= SemanticState.Modal;
                        auiiVar11.n = str5;
                        aihf aihfVarCreateBuilder4 = auinVar.createBuilder();
                        int millis = (int) vdgVar.B.toMillis();
                        aihfVarCreateBuilder4.copyOnWrite();
                        auin auinVar5 = (auin) aihfVarCreateBuilder4.instance;
                        auinVar5.b |= 1;
                        auinVar5.c = millis;
                        int millis2 = (int) vdgVar.C.toMillis();
                        aihfVarCreateBuilder4.copyOnWrite();
                        auin auinVar6 = (auin) aihfVarCreateBuilder4.instance;
                        auinVar6.b |= 2;
                        auinVar6.d = millis2;
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar12 = (auii) aihfVarCreateBuilder.instance;
                        auin auinVar7 = (auin) aihfVarCreateBuilder4.build();
                        auinVar7.getClass();
                        auiiVar12.m = auinVar7;
                        auiiVar12.b |= SemanticState.ReadOnly;
                    }
                    float f = vdgVar.E;
                    if (f >= 0.0f) {
                        aihfVarCreateBuilder.copyOnWrite();
                        auii auiiVar13 = (auii) aihfVarCreateBuilder.instance;
                        auiiVar13.b |= 32;
                        auiiVar13.h = f;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    auii auiiVar14 = (auii) aihfVarCreateBuilder.instance;
                    auinVar4.getClass();
                    auiiVar14.d = auinVar4;
                    auiiVar14.b |= 2;
                    auiiVar = (auii) aihfVarCreateBuilder.build();
                }
            }
            if (!vfsVarG2.c.isPresent() || !auiiVar.equals(vfsVarG2.c.get())) {
                if (vfsVarG2.c.isEmpty()) {
                    vft vftVar2 = vfsVarG2.a;
                    int i = vfsVarG2.b;
                    vftVar2.A();
                }
                vfsVarG2.c = Optional.of(auiiVar);
                vfsVarG2.a();
            }
        }
        ulj uljVar = this.v;
        Uri uri = this.p;
        ((agrc) ((agrc) uld.a.c()).k("com/google/android/libraries/youtube/creation/editor/MediaEnginePlaybackController", "setComposedVideoUri", 518, "MediaEnginePlaybackController.java")).t("Using ME for playback.");
        Optional.of(uri);
        ((uld) uljVar.j()).C(Optional.empty());
    }

    public final void m(Throwable th, String str) {
        agrf agrfVar = a;
        if (th == null) {
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "logErrorToEcatcherAndLogcat", 1602, "ShortsEditViewModel.java")).w("%s", str);
            zvl zvlVar = this.x;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 40;
            zvjVarA.d("[ShortsCreation][Android][Edit] ".concat(str));
            zvlVar.a(zvjVarA.a());
            return;
        }
        ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "logErrorToEcatcherAndLogcat", (char) 1610, "ShortsEditViewModel.java")).w("%s", str);
        zvl zvlVar2 = this.x;
        zvj zvjVarA2 = zvk.a();
        zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA2.j = 40;
        zvjVarA2.d("[ShortsCreation][Android][Edit] ".concat(str));
        zvjVarA2.f(th);
        zvlVar2.a(zvjVarA2.a());
    }

    public final void n(boolean z) {
        if (z) {
            o();
        }
    }

    public final void o() {
        Context context = this.S;
        ahno.ao(new mrh((Object) this, context.getString(R.string.failed_load_edits_from_draft_dialog_title), context.getString(R.string.failed_load_edits_from_draft_dialog_message), (Object) context.getString(R.string.failed_load_edits_from_draft_dialog_dismiss_button), 13), this.b);
        roq roqVar = this.L;
        if (roqVar != null) {
            ugo ugoVarK = roqVar.k(xhb.b(271388));
            ugoVarK.h(true);
            ugoVarK.c();
        }
    }

    public final void p() {
        if (this.D.d(vbd.b) || this.r == null) {
            return;
        }
        avmn avmnVar = this.V;
        if (avmnVar != null) {
            this.w.h(avmnVar);
        }
        boolean zM = this.P.M();
        uzk uzkVar = this.R;
        if (zM) {
            avmn avmnVarAl = uzkVar.a().P().L(this.c).H(new ugm(this.O, 2)).al(new uln(this, 4), new uln(this, 8));
            this.V = avmnVarAl;
            this.w.c(avmnVarAl);
        } else {
            avmn avmnVarAl2 = uzkVar.a().P().L(this.c).H(new ugm(this, 3)).al(new uln(this, 11), new uln(this, 12));
            this.V = avmnVarAl2;
            this.w.c(avmnVarAl2);
        }
    }

    public final void q() {
        if (this.D.d(vbd.b) || r()) {
            avmn avmnVar = this.W;
            if (avmnVar != null) {
                this.w.h(avmnVar);
            }
            ukp ukpVar = this.e;
            avmn avmnVarAg = ukpVar.e().O(this.c).ag(new uln(this, 2), new uln(this, 3));
            this.W = avmnVarAg;
            this.w.c(avmnVarAg);
        }
    }

    public final boolean r() {
        vfx vfxVar = this.T;
        return vfxVar != null && vfxVar.a();
    }

    @Override // defpackage.ulh
    public final void a() {
    }

    @Override // defpackage.ulh
    public final void e() {
    }

    @Override // defpackage.ulh
    public final /* synthetic */ void b(Duration duration) {
    }

    @Override // defpackage.ulh
    public final /* synthetic */ void f(int i) {
    }
}
