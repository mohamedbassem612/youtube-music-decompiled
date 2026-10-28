package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xlx extends xlu {
    String c;

    @Override // defpackage.xlu, defpackage.yeb
    public final void a(IOException iOException) {
        this.b = iOException;
        this.a = true != (iOException instanceof tfj) ? 500 : 505;
    }

    @Override // defpackage.xlu, defpackage.yeb
    public final void b(tgo tgoVar) {
        super.b(tgoVar);
        tgn tgnVar = tgoVar.d;
        if (tgnVar != null) {
            try {
                this.c = tgnVar.d();
            } catch (IOException e) {
                a(e);
            }
        }
    }
}
