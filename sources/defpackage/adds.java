package defpackage;

import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adds implements nwg {
    private final DirectUpdateDataRelay a;
    private float b = 0.0f;

    public adds(DirectUpdateDataRelay directUpdateDataRelay) {
        this.a = directUpdateDataRelay;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return astd.b;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        astd astdVar = (astd) obj;
        String str = astdVar.c;
        ason asonVar = astdVar.d;
        if (asonVar == null) {
            asonVar = ason.a;
        }
        int iAV = a.aV(astdVar.e);
        if (iAV == 0) {
            iAV = 1;
        }
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nwfVar.c;
        if (senderStateOuterClass$SenderState != null) {
            aihl aihlVar = aslk.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            senderStateOuterClass$SenderState.c(aihlVarCheckIsLite);
            if (senderStateOuterClass$SenderState.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                senderStateOuterClass$SenderState.c(aihlVarCheckIsLite2);
                Object objK = senderStateOuterClass$SenderState.j.k(aihlVarCheckIsLite2.d);
                aslk aslkVar = (aslk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                float f = this.b;
                asob asobVar = aslkVar.e;
                if (asobVar == null) {
                    asobVar = asob.a;
                }
                float f2 = asobVar.d;
                asob asobVar2 = aslkVar.d;
                if (asobVar2 == null) {
                    asobVar2 = asob.a;
                }
                float f3 = asobVar2.d;
                float f4 = -asonVar.d;
                int i = iAV - 1;
                if (i == 1) {
                    float f5 = -f3;
                    this.b = f5;
                    if (f5 < f4) {
                        this.b = f4;
                    } else if (f5 > 0.0d) {
                        this.b = 0.0f;
                    }
                } else if (i == 3) {
                    float f6 = this.b - f2;
                    if (f3 == 0.0d || f6 >= 0.0d) {
                        this.b = 0.0f;
                    } else if (f6 < f4) {
                        this.b = f4;
                    } else if (f6 < 0.0f) {
                        this.b = f6;
                    }
                }
                if (f == this.b) {
                    return avlb.e();
                }
                aihh aihhVar = (aihh) senderStateOuterClass$SenderState.toBuilder();
                aihf aihfVarCreateBuilder = aste.a.createBuilder();
                aihf aihfVarCreateBuilder2 = asob.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                asob asobVar3 = (asob) aihfVarCreateBuilder2.instance;
                asobVar3.b |= 1;
                asobVar3.c = 0.0f;
                float f7 = this.b;
                aihfVarCreateBuilder2.copyOnWrite();
                asob asobVar4 = (asob) aihfVarCreateBuilder2.instance;
                asobVar4.b |= 2;
                asobVar4.d = f7;
                aihfVarCreateBuilder.copyOnWrite();
                aste asteVar = (aste) aihfVarCreateBuilder.instance;
                asob asobVar5 = (asob) aihfVarCreateBuilder2.build();
                asobVar5.getClass();
                asteVar.d = asobVar5;
                asteVar.c |= 1;
                aihhVar.e(aste.b, (aste) aihfVarCreateBuilder.build());
                this.a.send(str, ((SenderStateOuterClass$SenderState) aihhVar.build()).toByteArray());
                return avlb.e();
            }
        }
        return avlb.m(new Throwable("SenderState is missing CollectionSenderState."));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return nrb.a(this, mewVar, nwfVar);
    }
}
