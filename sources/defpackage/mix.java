package defpackage;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mix extends ComponentObserver {
    int a = 0;
    final /* synthetic */ nsl b;
    final /* synthetic */ nxa c;
    final /* synthetic */ String d;
    final /* synthetic */ Component e;
    final /* synthetic */ avls f;
    final /* synthetic */ npg g;
    final /* synthetic */ fhd h;
    final /* synthetic */ miy i;

    public mix(miy miyVar, nsl nslVar, nxa nxaVar, String str, Component component, avls avlsVar, npg npgVar, fhd fhdVar) {
        this.b = nslVar;
        this.c = nxaVar;
        this.d = str;
        this.e = component;
        this.f = avlsVar;
        this.g = npgVar;
        this.h = fhdVar;
        this.i = miyVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
    public final Status componentDidUpdate(Component component) throws Throwable {
        Throwable th;
        nkl nklVar;
        Status statusB;
        asrl asrlVarC;
        miy miyVar = this.i;
        assc asscVarD = miyVar.h.b() ? npi.d((DebuggerClient) miyVar.g.io(), this.b) : null;
        try {
            nxa nxaVar = this.c;
            String str = this.d;
            nxaVar.h();
            if (asscVarD != null) {
                aihf aihfVarCreateBuilder = assg.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                assg assgVar = (assg) aihfVarCreateBuilder.instance;
                assgVar.c = asscVarD;
                assgVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                assg assgVar2 = (assg) aihfVarCreateBuilder.instance;
                str.getClass();
                assgVar2.b |= 2;
                assgVar2.d = str;
                assg assgVar3 = (assg) aihfVarCreateBuilder.build();
                DebuggerClient debuggerClient = (DebuggerClient) miyVar.g.io();
                aihf aihfVarCreateBuilder2 = assh.a.createBuilder();
                aijp aijpVarB = npi.b();
                aihfVarCreateBuilder2.copyOnWrite();
                assh asshVar = (assh) aihfVarCreateBuilder2.instance;
                aijpVarB.getClass();
                asshVar.e = aijpVarB;
                asshVar.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                assh asshVar2 = (assh) aihfVarCreateBuilder2.instance;
                assgVar3.getClass();
                asshVar2.d = assgVar3;
                asshVar2.c = 2;
                debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder2.build()).toByteArray());
            }
            Component component2 = this.e;
            StatusOr statusOrMaterializeWithResult = component2.materializeWithResult(true);
            if (statusOrMaterializeWithResult.hasValue) {
                MaterializationResult materializationResult = (MaterializationResult) statusOrMaterializeWithResult.value;
                if (materializationResult == null) {
                    nud nudVar = new nud("Error materializing ComponentType: No materialization result.");
                    this.f.g(nudVar);
                    Status statusB2 = Status.b(nudVar);
                    miyVar.c(nxaVar, asscVarD, component2, null, this.b);
                    return statusB2;
                }
                nxaVar.e(Boolean.valueOf(materializationResult.isWasm()));
                int iMaterializationNumber = materializationResult.materializationNumber();
                try {
                    UpbArena upbArenaB = UpbArena.b(materializationResult.getArenaHandle());
                    if (upbArenaB == null) {
                        throw new nud("Error getting container from materialization result: Failed to wrap UpbArena handle");
                    }
                    nklVar = new nkl(new UpbMessage(materializationResult.getNativeUpb(), nkk.a, upbArenaB));
                    try {
                        miy miyVar2 = this.i;
                        Component component3 = this.e;
                        npg npgVar = this.g;
                        if (miyVar2.h.a() && npgVar != null && (asrlVarC = npi.c(nklVar, nwl.a(component3.debugLatestModel()), component3.latestSubscriptionConfig(), npgVar.c, miyVar2.k)) != null) {
                            npgVar.c(asrlVarC);
                        }
                        mma mmaVar = new mma(nklVar, materializationResult, npgVar);
                        miyVar2.c(this.c, asscVarD, component3, nklVar, this.b);
                        synchronized (this) {
                            if (iMaterializationNumber > this.a) {
                                this.a = iMaterializationNumber;
                                this.h.q();
                                this.f.c(mmaVar);
                            }
                        }
                        return Status.OK;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (nud e) {
                    this.f.g(e);
                    statusB = Status.b(e);
                }
                this.i.c(this.c, asscVarD, this.e, nklVar, this.b);
                throw th;
            }
            nud nudVar2 = new nud("Error materializing ComponentType for template " + this.b.e("unknown path") + " with status " + String.valueOf(statusOrMaterializeWithResult.status), statusOrMaterializeWithResult.status.asException());
            this.f.g(nudVar2);
            statusB = Status.b(nudVar2);
            this.i.c(this.c, asscVarD, this.e, null, this.b);
            return statusB;
        } catch (Throwable th3) {
            th = th3;
            nklVar = null;
        }
    }
}
