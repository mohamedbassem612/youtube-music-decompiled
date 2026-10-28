package defpackage;

import android.os.Handler;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mis extends fkx {
    public static final /* synthetic */ int w = 0;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmb a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    awmd d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsu e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean f;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avlr s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxa u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mjb v;

    private mis() {
        super("ComponentType");
    }

    public static miq aE(fhd fhdVar) {
        return new miq(fhdVar, new mis());
    }

    private static final mir aF(fhd fhdVar) {
        return (mir) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        mir mirVarAF = aF(fhdVar);
        ntr ntrVar = (ntr) fhdVar.k(ntr.class);
        avmm avmmVar = (avmm) fhdVar.k(avmm.class);
        nth nthVar = (nth) fhdVar.k(nth.class);
        mjb mjbVar = this.v;
        avlr avlrVar = this.s;
        nsl nslVar = this.b;
        nuc nucVar = this.t;
        boolean z = this.r;
        boolean z2 = this.c;
        boolean z3 = this.f;
        boolean z4 = this.g;
        Handler handler = mjc.a;
        mkx mkxVar = new mkx(nucVar, ntrVar, nslVar, nthVar, avmmVar, z);
        mjc.a(mkxVar, fhdVar, nslVar, mjbVar, avlrVar, nucVar, z2, z3, z4);
        avmmVar.c(mkxVar);
        mirVarAF.b = mkxVar;
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        mir mirVarAF = aF(fhdVar);
        boolean z = this.q;
        avmb avmbVar = this.a;
        mkx mkxVar = mirVarAF.b;
        Handler handler = mjc.a;
        if (z) {
            mkxVar.c(avmbVar);
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mir mirVar = (mir) fkyVar;
        mir mirVar2 = (mir) fkyVar2;
        mirVar2.a = mirVar.a;
        mirVar2.b = mirVar.b;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        fhd fhdVar2;
        fgy fgyVarA;
        mir mirVar = (mir) fhdVar.i().c;
        mkx mkxVar = mirVar.b;
        int i = mirVar.a;
        mjb mjbVar = this.v;
        avlr avlrVar = this.s;
        nsl nslVar = this.b;
        avnq avnqVar = nslVar.i;
        boolean z = avnqVar instanceof avmm;
        avmb avmbVar = this.a;
        nuc nucVar = this.t;
        nxa nxaVar = this.u;
        boolean z2 = this.c;
        boolean z3 = this.f;
        boolean z4 = this.g;
        Handler handler = mjc.a;
        if (z) {
            mkxVar.d((avmm) avnqVar, avmbVar);
        }
        if (mkxVar.g != avlrVar) {
            if (mjbVar != null && (fgyVarA = mkxVar.a()) != null) {
                awkq awkqVar = mkxVar.i;
                mjb mjbVar2 = awkqVar != null ? awkqVar.b : null;
                if (mjbVar2 != null && !mkxVar.f() && mjbVar.equals(mjbVar2)) {
                    mkxVar.e(fhdVar);
                    nslVar.f("UNDEFINED");
                    return fgyVarA.l();
                }
            }
            mkxVar.dispose();
        }
        if (mkxVar.f()) {
            fhdVar2 = fhdVar;
            mjc.a(mkxVar, fhdVar2, nslVar, mjbVar, avlrVar, nucVar, z2, z3, z4);
            if (avnqVar != null) {
                avnqVar.c(mkxVar);
            }
        } else {
            fhdVar2 = fhdVar;
            mkxVar.e(fhdVar2);
        }
        fgy fgyVarA2 = mkxVar.a();
        if (fgyVarA2 == null) {
            nxaVar.d(true);
            nslVar.f("UNDEFINED");
            return fqp.aE(fhdVar2).a;
        }
        nxaVar.d(false);
        nslVar.f("UNDEFINED");
        return fgyVarA2.l();
    }

    @Override // defpackage.fgy
    public final void an() {
        nsl nslVar = this.b;
        mjb mjbVar = this.v;
        awmd awmdVar = this.d;
        nsu nsuVar = this.e;
        Handler handler = mjc.a;
        if (nsuVar.b()) {
            aihf aihfVarCreateBuilder = assb.a.createBuilder();
            assc asscVarD = npi.d((DebuggerClient) awmdVar.io(), nslVar);
            aihfVarCreateBuilder.copyOnWrite();
            assb assbVar = (assb) aihfVarCreateBuilder.instance;
            asscVarD.getClass();
            assbVar.c = asscVarD;
            assbVar.b |= 1;
            mzq mzqVar = mjbVar.b;
            String strA = "Unknown template";
            if (mzqVar == null) {
                mzt mztVar = mjbVar.a;
                if (mztVar != null) {
                    if (mztVar.i() != 0) {
                        String strJ = mztVar.j();
                        if (!strJ.isEmpty()) {
                            strA = strJ;
                        }
                    } else {
                        ByteBuffer byteBufferK = mztVar.k();
                        if (byteBufferK != null) {
                            try {
                                asow asowVar = ((asmv) aihn.parseFrom(asmv.a, byteBufferK, mjc.b)).c;
                                if (asowVar == null) {
                                    asowVar = asow.a;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(asma.b);
                                asowVar.c(aihlVarCheckIsLite);
                                Object objK = asowVar.j.k(aihlVarCheckIsLite.d);
                                asoq asoqVar = ((asma) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d;
                                if (asoqVar == null) {
                                    asoqVar = asoq.a;
                                }
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(asoy.b);
                                asoqVar.c(aihlVarCheckIsLite2);
                                Object objK2 = asoqVar.j.k(aihlVarCheckIsLite2.d);
                                asoy asoyVar = (asoy) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                                if ((asoyVar.c & 1) != 0) {
                                    strA = asoyVar.d;
                                }
                            } catch (aiik unused) {
                            }
                        }
                    }
                }
            } else if (mzqVar.c()) {
                mew mewVarI = mzqVar.i();
                mep mepVar = nfi.al;
                if (mewVarI.e(mepVar)) {
                    nfi nfiVar = (nfi) mzqVar.i().d(mepVar);
                    if (nfiVar.b()) {
                        strA = nfiVar.a();
                    }
                }
            }
            aihfVarCreateBuilder.copyOnWrite();
            assb assbVar2 = (assb) aihfVarCreateBuilder.instance;
            strA.getClass();
            assbVar2.b |= 2;
            assbVar2.d = strA;
            assb assbVar3 = (assb) aihfVarCreateBuilder.build();
            DebuggerClient debuggerClient = (DebuggerClient) awmdVar.io();
            aihf aihfVarCreateBuilder2 = assh.a.createBuilder();
            aijp aijpVarB = npi.b();
            aihfVarCreateBuilder2.copyOnWrite();
            assh asshVar = (assh) aihfVarCreateBuilder2.instance;
            aijpVarB.getClass();
            asshVar.e = aijpVarB;
            asshVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            assh asshVar2 = (assh) aihfVarCreateBuilder2.instance;
            assbVar3.getClass();
            asshVar2.d = assbVar3;
            asshVar2.c = 9;
            debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder2.build()).toByteArray());
        }
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (mis) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mir();
    }
}
