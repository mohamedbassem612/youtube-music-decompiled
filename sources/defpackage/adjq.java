package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adjq implements syp {
    final exj a;
    final agm b;
    final ewn c;

    public adjq(exj exjVar, ewn ewnVar, agm agmVar) {
        this.a = exjVar;
        this.b = agmVar;
        this.c = ewnVar;
    }

    @Override // defpackage.syp
    public final /* synthetic */ Object a(Object obj) {
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        ewf ewfVar = (ewf) this.a.g((ett) this.b.b(uri));
        adjr adjrVar = (ewfVar == null || !(ewfVar instanceof adjr)) ? null : (adjr) ewfVar;
        if (adjrVar != null) {
            return adjrVar.a;
        }
        return null;
    }

    @Override // defpackage.syp
    public final void b() {
        this.a.j(0L);
    }

    @Override // defpackage.syp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            this.a.h((ett) this.b.b(uri), new adjr((zrr) obj2, this.c));
        }
    }
}
