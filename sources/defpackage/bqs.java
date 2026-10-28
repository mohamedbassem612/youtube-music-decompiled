package defpackage;

import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bqs {
    public final List a = new ArrayList();
    public MediaBrowserService b;
    Messenger c;
    public final /* synthetic */ bre d;

    public bqs(bre breVar) {
        this.d = breVar;
    }

    public brf a() {
        bqp bqpVar = this.d.d;
        if (bqpVar != null) {
            return bqpVar.d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    public void b() {
        throw null;
    }
}
