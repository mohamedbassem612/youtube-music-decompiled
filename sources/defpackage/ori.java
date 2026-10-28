package defpackage;

import com.google.android.libraries.elements.interfaces.FetcherFactory;
import com.youtube.android.libraries.elements.StatusOr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ori extends FetcherFactory {
    final /* synthetic */ orh a;

    public ori(orh orhVar) {
        this.a = orhVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FetcherFactory
    public final StatusOr create(int i, byte[] bArr) {
        mew mewVar = new mew(atgv.a);
        mewVar.bH(bArr);
        orh orhVar = this.a;
        mewVar.d(orhVar.a());
        return StatusOr.fromValue(orhVar.b());
    }
}
