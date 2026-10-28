package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mna extends DataSourceListener {
    public final List a;

    public mna(byte[] bArr) {
        this.a = new ArrayList();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onDataChanged() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DataSourceListener) it.next()).onDataChanged();
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onError(Status status) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DataSourceListener) it.next()).onError(status);
        }
        return Status.OK;
    }

    public mna() {
        throw null;
    }
}
