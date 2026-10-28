package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeyi extends afar {
    final /* synthetic */ aeyk a;

    public aeyi(aeyk aeykVar) {
        this.a = aeykVar;
    }

    @Override // defpackage.afar
    public final void a(int i) {
        aeyk aeykVar = this.a;
        aeykVar.d = true;
        aeyj aeyjVar = (aeyj) aeykVar.e.get();
        if (aeyjVar != null) {
            aeyjVar.a();
        }
    }

    @Override // defpackage.afar
    public final void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        aeyk aeykVar = this.a;
        aeykVar.d = true;
        aeyj aeyjVar = (aeyj) aeykVar.e.get();
        if (aeyjVar != null) {
            aeyjVar.a();
        }
    }
}
