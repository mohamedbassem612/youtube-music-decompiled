package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhm extends rhq {
    final /* synthetic */ rht a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhm(rht rhtVar, TextureFrame textureFrame) {
        super(textureFrame);
        this.a = rhtVar;
    }

    public final /* synthetic */ void a(GlSyncToken glSyncToken) {
        super.release(glSyncToken);
    }

    @Override // defpackage.rhq, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        riy riyVar;
        rht rhtVar = this.a;
        if (!rhtVar.i.af) {
            super.release();
            return;
        }
        rjc rjcVar = rhtVar.n;
        if (rjcVar != null && (riyVar = ((riz) rjcVar).a) != null && riyVar.isAlive()) {
            rjcVar.e(new rhl(this.b, 0));
            return;
        }
        rbc rbcVar = new rbc(rht.q, rbd.c);
        rbcVar.c();
        rbcVar.a("Releasing Xeno frame on current thread because GL thread is null or dead.", new Object[0]);
        super.release();
    }

    @Override // defpackage.rhq, com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        riy riyVar;
        rht rhtVar = this.a;
        if (!rhtVar.i.af) {
            super.release(glSyncToken);
            return;
        }
        rjc rjcVar = rhtVar.n;
        if (rjcVar != null && (riyVar = ((riz) rjcVar).a) != null && riyVar.isAlive()) {
            rjcVar.e(new plj(this, glSyncToken, 20));
            return;
        }
        rbc rbcVar = new rbc(rht.q, rbd.c);
        rbcVar.c();
        rbcVar.a("Releasing Xeno frame with sync token on current thread because GL thread is null or dead.", new Object[0]);
        super.release(glSyncToken);
    }
}
