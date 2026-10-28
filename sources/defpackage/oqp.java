package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oqp extends DataSourceListener {
    final /* synthetic */ orf a;
    public final /* synthetic */ oqu b;

    public oqp(oqu oquVar, orf orfVar) {
        this.a = orfVar;
        this.b = oquVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onDataChanged() {
        orf orfVar = this.a;
        this.b.c.post(new lez((Object) this, (Object) orfVar, (Object) agke.n(orfVar.identifiers()), 10, (short[]) null));
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onError(Status status) {
        this.b.c.post(new lez((Object) this, (Object) this.a, (Object) status, 9, (short[]) null));
        return Status.OK;
    }
}
