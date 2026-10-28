package defpackage;

import com.google.android.libraries.elements.interfaces.ScopedTransaction;
import com.google.android.libraries.elements.interfaces.TransactionClosure;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wbt extends TransactionClosure {
    final /* synthetic */ List a;
    final /* synthetic */ aijp b;
    final /* synthetic */ wbx c;
    final /* synthetic */ avpr d;

    public wbt(wbx wbxVar, List list, aijp aijpVar, avpr avprVar) {
        this.a = list;
        this.b = aijpVar;
        this.d = avprVar;
        this.c = wbxVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.TransactionClosure
    public final void apply(ScopedTransaction scopedTransaction) {
        try {
            this.c.k(this.a, this.b, new wca(scopedTransaction));
        } catch (RuntimeException e) {
            scopedTransaction.cancel();
            int i = this.c.b - 1;
            if (i == 0) {
                throw e;
            }
            avpr avprVar = this.d;
            if (i != 1) {
                avprVar.a();
            } else {
                avprVar.b(e);
            }
        } catch (wfe e2) {
            scopedTransaction.cancel();
            this.d.b(e2);
        }
    }
}
