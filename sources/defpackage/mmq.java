package defpackage;

import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.LegacyMaterializationResult;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmq extends ComponentObserver {
    public final nxa a;
    public final Component b;
    public final nsl c;
    public final avls d;
    public final npg e;
    public final nsu f;
    public final awmd g;
    public final boolean h;
    public final String i;
    public final nso j;
    public final fhd k;
    int l = 0;

    public mmq(nxa nxaVar, Component component, nsl nslVar, avls avlsVar, npg npgVar, nsu nsuVar, awmd awmdVar, boolean z, String str, nso nsoVar, fhd fhdVar) {
        this.a = nxaVar;
        this.b = component;
        this.c = nslVar;
        this.d = avlsVar;
        this.e = npgVar;
        this.f = nsuVar;
        this.g = awmdVar;
        this.h = z;
        this.i = str;
        this.j = nsoVar;
        this.k = fhdVar;
    }

    public final void a(nxa nxaVar, assc asscVar, Component component, nay nayVar, nsl nslVar) {
        asrl asrlVarC;
        nxaVar.c();
        if (asscVar != null) {
            aihf aihfVarCreateBuilder = assf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            assf assfVar = (assf) aihfVarCreateBuilder.instance;
            assfVar.c = asscVar;
            assfVar.b |= 1;
            if (nayVar != null && (asrlVarC = npi.c(nayVar, nwl.a(component.debugLatestModel()), component.latestSubscriptionConfig(), nslVar.u, this.j)) != null) {
                aihfVarCreateBuilder.copyOnWrite();
                assf assfVar2 = (assf) aihfVarCreateBuilder.instance;
                assfVar2.d = asrlVarC;
                assfVar2.b |= 2;
            }
            DebuggerClient debuggerClient = (DebuggerClient) this.g.io();
            aihf aihfVarCreateBuilder2 = assh.a.createBuilder();
            aijp aijpVarB = npi.b();
            aihfVarCreateBuilder2.copyOnWrite();
            assh asshVar = (assh) aihfVarCreateBuilder2.instance;
            aijpVarB.getClass();
            asshVar.e = aijpVarB;
            asshVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            assh asshVar2 = (assh) aihfVarCreateBuilder2.instance;
            assf assfVar3 = (assf) aihfVarCreateBuilder.build();
            assfVar3.getClass();
            asshVar2.d = assfVar3;
            asshVar2.c = 3;
            debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder2.build()).toByteArray());
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0175 A[Catch: all -> 0x0179, TRY_LEAVE, TryCatch #3 {all -> 0x0179, blocks: (B:37:0x015f, B:39:0x0175), top: B:68:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0191 A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:46:0x018d, B:48:0x0191, B:49:0x019d), top: B:63:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
    public final Status componentDidUpdate(Component component) throws Throwable {
        Throwable th;
        mus musVar;
        int materializationNumber;
        mus musVar2;
        Status statusB;
        Component component2;
        npg npgVar;
        mma mmaVar;
        asrl asrlVarC;
        nsu nsuVar = this.f;
        MaterializationResult materializationResult = null;
        assc asscVarD = nsuVar.b() ? npi.d((DebuggerClient) this.g.io(), this.c) : null;
        String str = this.i;
        String strConcat = "templateResolve:".concat(String.valueOf(str));
        if (strConcat.length() > 127) {
            strConcat.substring(0, 127);
        }
        try {
            nxa nxaVar = this.a;
            nxaVar.h();
            if (asscVarD != null) {
                try {
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
                    DebuggerClient debuggerClient = (DebuggerClient) this.g.io();
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
                } catch (Throwable th2) {
                    th = th2;
                    musVar = null;
                }
            }
            boolean z = this.h;
            Component component3 = this.b;
            if (z) {
                StatusOr statusOrMaterializeWithResult = component3.materializeWithResult(true);
                if (statusOrMaterializeWithResult.hasValue) {
                    MaterializationResult materializationResult2 = (MaterializationResult) statusOrMaterializeWithResult.value;
                    if (materializationResult2 == null || materializationResult2.size() == 0) {
                        nud nudVar = new nud("Error materializing SharedComponentType: No FBS result.");
                        this.d.g(nudVar);
                        statusB = Status.b(nudVar);
                    } else {
                        int iMaterializationNumber = materializationResult2.materializationNumber();
                        musVar2 = new mus(ahuj.q(ByteBuffer.wrap(materializationResult2.getElement())));
                        materializationResult = materializationResult2;
                        materializationNumber = iMaterializationNumber;
                        musVar = musVar2;
                        try {
                            component2 = this.b;
                            npgVar = this.e;
                            if (nsuVar.a() && npgVar != null) {
                                try {
                                    asrlVarC = npi.c(musVar, nwl.a(component2.debugLatestModel()), component2.latestSubscriptionConfig(), npgVar.c, this.j);
                                    if (asrlVarC != null) {
                                        npgVar.c(asrlVarC);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    this = this;
                                }
                            }
                            mmaVar = new mma(musVar, materializationResult, npgVar);
                            a(this.a, asscVarD, this.b, musVar, this.c);
                            synchronized (this) {
                                if (materializationNumber > this.l) {
                                    this.l = materializationNumber;
                                    this.k.q();
                                    this.d.c(mmaVar);
                                }
                            }
                            return Status.OK;
                        } catch (Throwable th4) {
                            this = this;
                            th = th4;
                        }
                    }
                } else {
                    nud nudVar2 = new nud(a.cp(statusOrMaterializeWithResult.status, "Error materializing SharedComponentType: "), statusOrMaterializeWithResult.status.asException());
                    this.d.g(nudVar2);
                    statusB = Status.b(nudVar2);
                }
                a(nxaVar, asscVarD, component3, null, this.c);
                return statusB;
            }
            StatusOr statusOrMaterialize = component3.materialize(true);
            LegacyMaterializationResult legacyMaterializationResult = (LegacyMaterializationResult) statusOrMaterialize.value;
            if (legacyMaterializationResult == null) {
                nud nudVar3 = new nud(a.cp(statusOrMaterialize.status, "Error materializing SharedComponentType: "), statusOrMaterialize.status.asException());
                this.d.g(nudVar3);
                statusB = Status.b(nudVar3);
                a(nxaVar, asscVarD, component3, null, this.c);
                return statusB;
            }
            materializationNumber = legacyMaterializationResult.getMaterializationNumber();
            musVar2 = new mus(ahuj.q(ByteBuffer.wrap(legacyMaterializationResult.getElement())));
            musVar = musVar2;
            component2 = this.b;
            npgVar = this.e;
            if (nsuVar.a()) {
                asrlVarC = npi.c(musVar, nwl.a(component2.debugLatestModel()), component2.latestSubscriptionConfig(), npgVar.c, this.j);
                if (asrlVarC != null) {
                    npgVar.c(asrlVarC);
                }
            }
            mmaVar = new mma(musVar, materializationResult, npgVar);
            a(this.a, asscVarD, this.b, musVar, this.c);
            synchronized (this) {
                if (materializationNumber > this.l) {
                    this.l = materializationNumber;
                    this.k.q();
                    this.d.c(mmaVar);
                }
                return Status.OK;
            }
            musVar = null;
        } catch (Throwable th5) {
            th = th5;
        }
        this.a(this.a, asscVarD, this.b, musVar, this.c);
        throw th;
    }
}
