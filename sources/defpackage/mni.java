package defpackage;

import android.graphics.Rect;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import io.grpc.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mni extends mnl {
    private final ArrayList a;
    private final nry b;
    private boolean c;
    private final omj f;
    private final omj g;

    public mni(nct nctVar, nry nryVar, nrv nrvVar, omj omjVar) {
        super(nrvVar);
        this.b = nryVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        omj omjVarB = null;
        if (nctVar.k()) {
            arrayList.add(omj.u(nctVar.i()));
            this.f = nctVar.j() ? omjVar.B(nctVar.g(), this.d.i) : null;
            if (nctVar.l()) {
                omjVarB = omjVar.B(nctVar.h(), this.d.i);
            }
        } else {
            this.f = null;
        }
        this.g = omjVarB;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        this.c = true;
        omj omjVar = this.f;
        if (omjVar != null) {
            this.b.a(omjVar.x(), a()).D();
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final String getGroupId() {
        return "";
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status isProminentCandidate(boolean z) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final boolean needContinuousUpdate() {
        return this.g != null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status visibilityChanged(float f, Rect rect, Rect rect2) {
        omj omjVar;
        if (this.c && (omjVar = this.g) != null) {
            float fCenterX = rect.centerX();
            float fCenterY = rect.centerY();
            float fCenterX2 = rect2.centerX();
            float fCenterY2 = rect2.centerY();
            aihf aihfVarCreateBuilder = asly.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asly aslyVar = (asly) aihfVarCreateBuilder.instance;
            aslyVar.c |= 1;
            aslyVar.d = f;
            asob asobVar = asob.a;
            aihf aihfVarCreateBuilder2 = asobVar.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            asob asobVar2 = (asob) aihfVarCreateBuilder2.instance;
            asobVar2.b |= 1;
            asobVar2.c = fCenterX;
            aihfVarCreateBuilder2.copyOnWrite();
            asob asobVar3 = (asob) aihfVarCreateBuilder2.instance;
            asobVar3.b |= 2;
            asobVar3.d = fCenterY;
            aihfVarCreateBuilder.copyOnWrite();
            asly aslyVar2 = (asly) aihfVarCreateBuilder.instance;
            asob asobVar4 = (asob) aihfVarCreateBuilder2.build();
            asobVar4.getClass();
            aslyVar2.e = asobVar4;
            aslyVar2.c |= 2;
            aihf aihfVarCreateBuilder3 = asobVar.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            asob asobVar5 = (asob) aihfVarCreateBuilder3.instance;
            asobVar5.b |= 1;
            asobVar5.c = fCenterX2;
            aihfVarCreateBuilder3.copyOnWrite();
            asob asobVar6 = (asob) aihfVarCreateBuilder3.instance;
            asobVar6.b |= 2;
            asobVar6.d = fCenterY2;
            aihfVarCreateBuilder.copyOnWrite();
            asly aslyVar3 = (asly) aihfVarCreateBuilder.instance;
            asob asobVar7 = (asob) aihfVarCreateBuilder3.build();
            asobVar7.getClass();
            aslyVar3.f = asobVar7;
            aslyVar3.c |= 4;
            asly aslyVar4 = (asly) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(asly.b, aslyVar4);
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
            nry nryVar = this.b;
            CommandOuterClass$Command commandOuterClass$CommandX = omjVar.x();
            nrt nrtVarE = a().e();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = nrtVarE.e;
            if (senderStateOuterClass$SenderState2 == null) {
                nrtVarE.e = senderStateOuterClass$SenderState;
            } else {
                aihh aihhVar2 = (aihh) senderStateOuterClass$SenderState2.toBuilder();
                aihhVar2.mergeFrom((aihn) senderStateOuterClass$SenderState);
                nrtVarE.e = (SenderStateOuterClass$SenderState) aihhVar2.build();
            }
            nryVar.a(commandOuterClass$CommandX, nrtVarE.a()).D();
        }
        return Status.OK;
    }
}
