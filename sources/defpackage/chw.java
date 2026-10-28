package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class chw implements crq {
    final /* synthetic */ chz a;

    public chw(chz chzVar) {
        this.a = chzVar;
    }

    @Override // defpackage.crq
    public final void a() throws IOException {
        chz chzVar = this.a;
        chzVar.j.d(Integer.MIN_VALUE);
        IOException iOException = chzVar.l;
        if (iOException != null) {
            throw iOException;
        }
    }
}
