package defpackage;

import com.google.android.libraries.elements.interfaces.ScopedTransaction;
import com.google.android.libraries.elements.interfaces.TransactionClosure;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mfm extends TransactionClosure {
    final /* synthetic */ aspb a;

    public mfm(aspb aspbVar) {
        this.a = aspbVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.TransactionClosure
    public final void apply(ScopedTransaction scopedTransaction) {
        aspb aspbVar = this.a;
        if ((aspbVar.b & 2) != 0) {
            scopedTransaction.set(aspbVar.c, aspbVar.d.G());
        } else {
            scopedTransaction.remove(aspbVar.c);
        }
    }
}
