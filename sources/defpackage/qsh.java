package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qsh implements qsq {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ qsi c;

    public qsh(qsi qsiVar, Object[] objArr, String str) {
        this.a = objArr;
        this.b = str;
        this.c = qsiVar;
    }

    @Override // defpackage.qsq
    public final Cursor a(CancellationSignal cancellationSignal) {
        qsi qsiVar = this.c;
        qsiVar.d.b();
        try {
            return qsiVar.a.rawQueryWithFactory(new qsw(this.a), this.b, null, null, cancellationSignal);
        } finally {
            this.c.d.a();
        }
    }

    @Override // defpackage.qsq
    public final String b() {
        return this.b;
    }
}
