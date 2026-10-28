package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xou {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/handoff/HandoffResponseController");
    public final vxe b;
    public final xgn c;
    public final tbt d;
    public final aunn e;
    public final vxz h;
    private final awli i = new awli();
    public boolean f = false;
    public boolean g = false;

    public xou(vxe vxeVar, xgn xgnVar, tbt tbtVar, aunn aunnVar, vxz vxzVar) {
        this.b = vxeVar;
        this.c = xgnVar;
        this.d = tbtVar;
        this.e = aunnVar;
        this.h = vxzVar;
    }

    public static final void b(xgn xgnVar) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = 173664;
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
        argnVar2.b |= 32;
        argnVar2.h = true;
        aihf aihfVarCreateBuilder2 = ajva.a.createBuilder();
        aihf aihfVarCreateBuilder3 = ajvb.a.createBuilder();
        algp algpVar = algp.HANDOFF_FEATURE_TYPE_LR_AUTOCONNECT;
        aihfVarCreateBuilder3.copyOnWrite();
        ajvb ajvbVar = (ajvb) aihfVarCreateBuilder3.instance;
        ajvbVar.c = algpVar.x;
        ajvbVar.b |= 2;
        ajvb ajvbVar2 = (ajvb) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder2.copyOnWrite();
        ajva ajvaVar = (ajva) aihfVarCreateBuilder2.instance;
        ajvbVar2.getClass();
        ajvaVar.d = ajvbVar2;
        ajvaVar.b |= SemanticState.Multiline;
        ajva ajvaVar2 = (ajva) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
        ajvaVar2.getClass();
        argnVar3.i = ajvaVar2;
        argnVar3.b |= 64;
        xgnVar.l(new xgj((argn) aihfVarCreateBuilder.build(), (amud) null));
    }

    public final void a(boolean z) {
        this.i.kk(Boolean.valueOf(z));
    }

    @tcc
    public void handleInteractionLoggingNewScreenEvent(xhj xhjVar) {
        if (this.g) {
            b(xhjVar.a);
            this.g = false;
        }
        if (this.f) {
            this.d.l(this);
            this.f = false;
        }
    }
}
