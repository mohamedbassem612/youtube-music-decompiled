package defpackage;

import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class osq implements nry {
    @Override // defpackage.nry
    public final /* synthetic */ avlb a(CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar) {
        boolean z = osu.a;
        return avlb.e();
    }

    @Override // defpackage.nry
    public final /* synthetic */ avlb c(CommandOuterClass$Command commandOuterClass$Command, nrv nrvVar, int i) {
        boolean z = osu.a;
        return avlb.e();
    }

    @Override // defpackage.orq
    public final /* synthetic */ void d(mew mewVar, ors orsVar) {
        mewVar.getClass();
        nrt nrtVarD = nrv.d();
        nrtVarD.d(orsVar.a());
        nrtVarD.d = orsVar.a;
        mew mewVar2 = orsVar.j;
        if (mewVar2 != null) {
            try {
                nrtVarD.e = (SenderStateOuterClass$SenderState) aihn.parseFrom(SenderStateOuterClass$SenderState.a, mewVar2.f(), ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik e) {
                Log.w("RENDER_NEXT", "Failed to parse sender state: " + e.getMessage());
            }
        }
        nrtVarD.a();
        avlb avlbVarA = nqx.a(mewVar);
        if (avlbVarA != null) {
            avlbVarA.D();
        }
    }

    @Override // defpackage.nry
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar, int i) {
        return nqx.a(mewVar);
    }
}
