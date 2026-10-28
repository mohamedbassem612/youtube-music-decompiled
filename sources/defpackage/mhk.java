package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.protos.youtube.elements.ExecuteJsFunctionCommand$ExecuteJSFunctionCommand;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhk implements nrw {
    public final awmd a;
    public final aunn b;
    public final agev c;
    private final JSEnvironment d;
    private final boolean e;
    private final boolean f;

    public mhk(JSEnvironment jSEnvironment, awmd awmdVar, aunn aunnVar, agev agevVar, agev agevVar2, agev agevVar3) {
        this.d = jSEnvironment;
        this.a = awmdVar;
        this.b = aunnVar;
        Boolean bool = Boolean.FALSE;
        this.e = ((Boolean) agevVar.e(bool)).booleanValue();
        this.f = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.c = agevVar3;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return ExecuteJsFunctionCommand$ExecuteJSFunctionCommand.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        if (this.e) {
            aihf aihfVarCreateBuilder = aslz.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aslz aslzVar = (aslz) aihfVarCreateBuilder.instance;
            aslzVar.c = 2;
            aslzVar.b |= 1;
            return (aslz) aihfVarCreateBuilder.build();
        }
        aihf aihfVarCreateBuilder2 = aslz.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aslz aslzVar2 = (aslz) aihfVarCreateBuilder2.instance;
        aslzVar2.c = 0;
        aslzVar2.b |= 1;
        return (aslz) aihfVarCreateBuilder2.build();
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        final ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand = (ExecuteJsFunctionCommand$ExecuteJSFunctionCommand) obj;
        final JSController controller = this.d.getController();
        if (this.f) {
            int i = nrvVar.o;
            nrt nrtVarD = nrv.d();
            nrtVarD.k = i;
            nrtVarD.c = nrvVar.c;
            nrtVarD.e = nrvVar.f;
            nrtVarD.h = nrvVar.j;
            nrtVarD.i = nrvVar.k;
            nrtVarD.e(nrvVar.m);
            nrtVarD.c(nrvVar.n);
            nrtVarD.g = nrvVar.h;
            nrtVarD.f = nrvVar.g;
            nrtVarD.j = nrvVar.l;
            nsl nslVar = nrvVar.i;
            if (nslVar != null) {
                nsk nskVar = new nsk(nslVar);
                nskVar.k = null;
                nrtVarD.b(nskVar.a());
            }
            if (nrvVar.b() != null) {
                nrtVarD.d(nrvVar.b());
            }
            nrvVar = nrtVarD.a();
        }
        final nrv nrvVar2 = nrvVar;
        final SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrvVar2.f;
        return avlb.g(new avld() { // from class: mhi
            @Override // defpackage.avld
            public final void a(avpr avprVar) {
                JSController jSController = controller;
                if (jSController == null) {
                    throw new nud("JavaScript controller is not provided");
                }
                mhk mhkVar = this.a;
                agev agevVar = (agev) mhkVar.a.io();
                if (!agevVar.g()) {
                    throw new nud("ByteStore is not provided");
                }
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = senderStateOuterClass$SenderState;
                nrv nrvVar3 = nrvVar2;
                mhj mhjVar = new mhj(avprVar);
                mhh mhhVar = new mhh((nry) mhkVar.b.io(), nrvVar3, mhkVar.c);
                mhl mhlVar = new mhl(nrvVar3);
                jSController.executeFunction(executeJsFunctionCommand$ExecuteJSFunctionCommand, senderStateOuterClass$SenderState2 != null ? senderStateOuterClass$SenderState2.toByteArray() : nty.a, (ByteStore) agevVar.c(), mhhVar, mhlVar, mhjVar);
                avprVar.c(new mqy(mhjVar, 1));
            }
        });
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
