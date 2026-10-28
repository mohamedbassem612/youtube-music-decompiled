package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.lang.Iterable$EL;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acnk implements actu, absn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchErrorController");
    public final abvn c;
    public final absg d;
    public final acqz e;
    public final actv f;
    public final acsy g;
    public final acpm h;
    public final actm i;
    public final acts j;
    public final ilv p;
    public final tfq q;
    public final aetc r;
    public final hno s;
    private final Context v;
    private final cc w;
    private final ahey x;
    private final agaz y;
    private final vxz z;
    private final List t = new ArrayList();
    private final awli u = new awli(Boolean.FALSE);
    public final avmm b = new avmm();
    public boolean k = false;
    public boolean l = false;
    public acra m = null;
    public String n = null;
    public ListenableFuture o = aher.a;

    public acnk(Context context, cc ccVar, aetc aetcVar, ilv ilvVar, awmd awmdVar, abvn abvnVar, absg absgVar, acqz acqzVar, actv actvVar, tfq tfqVar, ahey aheyVar, acsy acsyVar, acpm acpmVar, actm actmVar, acts actsVar, vxz vxzVar, hno hnoVar) {
        this.v = context;
        this.w = ccVar;
        this.r = aetcVar;
        this.p = ilvVar;
        this.c = abvnVar;
        this.d = absgVar;
        this.e = acqzVar;
        this.f = actvVar;
        this.q = tfqVar;
        this.x = aheyVar;
        this.g = acsyVar;
        this.i = actmVar;
        this.j = actsVar;
        this.z = vxzVar;
        this.s = hnoVar;
        this.h = acpmVar;
        this.y = (agaz) ((Container) awmdVar.io()).a(new afyq(12));
    }

    public final avlr b() {
        return this.u.r();
    }

    public final void c(acnj acnjVar) {
        if (this.s.ac()) {
            return;
        }
        this.t.add(acnjVar);
    }

    public final void d() {
        if (this.o.isDone()) {
            return;
        }
        this.o.cancel(false);
    }

    public final void e(ajwo ajwoVar) {
        if (aecm.ap(ajwoVar)) {
            k();
        }
    }

    public final void f() {
        acra acraVar = this.m;
        if (acraVar != null) {
            acrp acrpVar = acraVar.i;
            if (acrpVar != null) {
                ViewGroup viewGroup = acrpVar.u;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                ViewGroup viewGroup2 = acrpVar.t;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            } else {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchErrorController", "hideReelUi", 506, "ReelWatchErrorController.java")).t("ReelViewHolder is null when hiding reel UI");
            }
            if (!this.s.ac()) {
                Iterable$EL.forEach(this.t, new aavj(5));
            }
            i(true);
        }
    }

    public final void g(acnj acnjVar) {
        if (this.s.ac()) {
            return;
        }
        this.t.remove(acnjVar);
    }

    public final void h() {
        if (this.o.isDone()) {
            vxz vxzVar = this.z;
            ahew ahewVarSchedule = this.x.schedule(new abmn(7), vxzVar.d(7, 45639929L), TimeUnit.MILLISECONDS);
            this.o = ahewVarSchedule;
            taf.m(this.w, ahewVarSchedule, new aasz(this, 12), new aasz(this, 13));
        }
    }

    public final void i(boolean z) {
        this.u.kk(Boolean.valueOf(z));
    }

    public final void j(Optional optional) {
        Optional optionalOfNullable = Optional.ofNullable(this.m);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acra) optionalOfNullable.get()).i);
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acrp) optionalOfNullable.get()).H());
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acvv) optionalOfNullable.get()).b());
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.FALSE);
        }
        Context context = this.v;
        boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
        aihf aihfVarCreateBuilder = amfh.a.createBuilder();
        askp askpVarQ = aavv.q(context.getString(R.string.reel_interstitial_video_unavailable));
        aihfVarCreateBuilder.copyOnWrite();
        amfh amfhVar = (amfh) aihfVarCreateBuilder.instance;
        askpVarQ.getClass();
        amfhVar.c = askpVarQ;
        amfhVar.b |= 1;
        abyy abyyVar = new abyy(aihfVarCreateBuilder, 7);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = abyyVar.a;
            askp askpVarQ2 = aavv.q((String) obj);
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            amfh amfhVar2 = (amfh) aihfVar.instance;
            askpVarQ2.getClass();
            amfhVar2.d = askpVarQ2;
            amfhVar2.b |= 2;
        }
        int i = true != zBooleanValue ? 2 : 5;
        int i2 = true != zBooleanValue ? 177462 : 298294;
        int i3 = true != zBooleanValue ? R.string.reel_interstitial_skip_button : R.string.reel_interstitial_close_button;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = apec.b;
        aihf aihfVarCreateBuilder2 = apec.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apec apecVar = (apec) aihfVarCreateBuilder2.instance;
        apecVar.d = i - 1;
        apecVar.c |= 1;
        aihhVar.e(aihlVar, (apec) aihfVarCreateBuilder2.build());
        ajwo ajwoVar = (ajwo) aihhVar.build();
        aihh aihhVar2 = (aihh) CommandOuterClass$Command.a.createBuilder();
        aihhVar2.e(almz.a, ajwoVar);
        CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihhVar2.build();
        String string = context.getString(i3);
        aihh aihhVar3 = (aihh) ajnq.a.createBuilder();
        aihhVar3.copyOnWrite();
        ajnq ajnqVar = (ajnq) aihhVar3.instance;
        string.getClass();
        ajnqVar.e = 3;
        ajnqVar.f = string;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar2 = (ajnq) aihhVar3.instance;
        string.getClass();
        ajnqVar2.c |= 32;
        ajnqVar2.h = string;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar3 = (ajnq) aihhVar3.instance;
        ajnqVar3.k = 1;
        ajnqVar3.c |= SemanticState.Obscured;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar4 = (ajnq) aihhVar3.instance;
        ajnqVar4.m = 4;
        ajnqVar4.c |= 16384;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar5 = (ajnq) aihhVar3.instance;
        ajnqVar5.l = 1;
        ajnqVar5.c |= SemanticState.Multiline;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar6 = (ajnq) aihhVar3.instance;
        ajnqVar6.i = 4;
        ajnqVar6.c |= SemanticState.Modal;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar7 = (ajnq) aihhVar3.instance;
        commandOuterClass$Command.getClass();
        ajnqVar7.g = commandOuterClass$Command;
        ajnqVar7.c |= 1;
        aihh aihhVar4 = (aihh) amud.b.createBuilder();
        aihh aihhVar5 = (aihh) ajuz.a.createBuilder();
        aihhVar5.copyOnWrite();
        ajuz ajuzVar = (ajuz) aihhVar5.instance;
        ajuzVar.b |= 1;
        ajuzVar.c = i2;
        aihhVar4.copyOnWrite();
        amud amudVar = (amud) aihhVar4.instance;
        ajuz ajuzVar2 = (ajuz) aihhVar5.build();
        ajuzVar2.getClass();
        amudVar.h = ajuzVar2;
        amudVar.c |= 8;
        int[] iArr = {4, 8};
        aihf aihfVarCreateBuilder3 = argh.a.createBuilder();
        for (int i4 = 0; i4 < 2; i4++) {
            int i5 = iArr[i4];
            long j = ((argh) aihfVarCreateBuilder3.instance).c;
            if (i5 == 0) {
                throw null;
            }
            long j2 = j | ((long) i5);
            aihfVarCreateBuilder3.copyOnWrite();
            argh arghVar = (argh) aihfVarCreateBuilder3.instance;
            arghVar.b |= 1;
            arghVar.c = j2;
        }
        argh arghVar2 = (argh) aihfVarCreateBuilder3.build();
        aihhVar4.copyOnWrite();
        amud amudVar2 = (amud) aihhVar4.instance;
        arghVar2.getClass();
        amudVar2.e = arghVar2;
        amudVar2.c |= 2;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar8 = (ajnq) aihhVar3.instance;
        amud amudVar3 = (amud) aihhVar4.build();
        amudVar3.getClass();
        ajnqVar8.n = amudVar3;
        ajnqVar8.c |= Integer.MIN_VALUE;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar9 = (ajnq) aihhVar3.instance;
        ajnqVar9.d |= 16;
        ajnqVar9.p = true;
        aihhVar3.copyOnWrite();
        ajnq ajnqVar10 = (ajnq) aihhVar3.instance;
        ajnqVar10.d |= 8;
        ajnqVar10.o = true;
        ajnq ajnqVar11 = (ajnq) aihhVar3.build();
        aihh aihhVar6 = (aihh) apji.a.createBuilder();
        aihhVar6.e(ajnq.b, ajnqVar11);
        apji apjiVar = (apji) aihhVar6.build();
        aihfVarCreateBuilder.copyOnWrite();
        amfh amfhVar3 = (amfh) aihfVarCreateBuilder.instance;
        apjiVar.getClass();
        amfhVar3.e = apjiVar;
        amfhVar3.b |= 4;
        aihf aihfVarCreateBuilder4 = amfg.a.createBuilder();
        boolean zAK = this.s.aK();
        aihfVarCreateBuilder4.copyOnWrite();
        amfg amfgVar = (amfg) aihfVarCreateBuilder4.instance;
        amfgVar.b |= 1;
        amfgVar.c = zAK;
        aihfVarCreateBuilder.copyOnWrite();
        amfh amfhVar4 = (amfh) aihfVarCreateBuilder.instance;
        amfg amfgVar2 = (amfg) aihfVarCreateBuilder4.build();
        amfgVar2.getClass();
        amfhVar4.f = amfgVar2;
        amfhVar4.b |= SemanticState.Obscured;
        amfh amfhVar5 = (amfh) aihfVarCreateBuilder.build();
        agaz agazVar = this.y;
        InstanceProxy instanceProxyD = agazVar.d();
        if (instanceProxyD instanceof agba) {
            agcv agcvVar = ((agba) instanceProxyD).a;
        }
        asmv asmvVar = asmv.a;
        asmv asmvVar2 = (asmv) agazVar.f(-161461535, amfhVar5, aihn.getParserForClass(asmv.class));
        aihh aihhVar7 = (aihh) akrn.a.createBuilder();
        acxu.b(aihhVar7, asmvVar2);
        this.r.b((akrn) aihhVar7.build(), absm.a, null, null, null);
        f();
    }

    public final void k() {
        if (this.s.ab()) {
            this.x.execute(afwl.i(new abyz(this, 15)));
        } else {
            j(Optional.empty());
        }
    }

    @Override // defpackage.actu
    public final void l(acsu acsuVar) {
        acsuVar.getClass();
        Objects.checkIndex(0, 3);
        if (!(acsuVar instanceof acso)) {
            if (acsuVar instanceof acsq) {
                e(((acsq) acsuVar).b);
                return;
            }
            return;
        }
        acso acsoVar = (acso) acsuVar;
        ajwo ajwoVar = acsoVar.a;
        alqc alqcVar = acsoVar.b;
        aoqt aoqtVarW = aecm.W(alqcVar);
        if (aoqtVarW != null) {
            this.x.execute(afwl.i(new aapc(this, aoqtVarW, alqcVar, 15)));
            return;
        }
        int iAX = a.aX(alqcVar.f);
        if (iAX == 0) {
            iAX = 1;
        }
        if (iAX == 4 || iAX == 3) {
            this.x.execute(afwl.i(new aapc(this, ajwoVar, alqcVar, 16, (short[]) null)));
        }
    }

    @Override // defpackage.absn
    public final void a() {
    }
}
