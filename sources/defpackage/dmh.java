package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dmh extends RemoteCallbackList {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public dmh(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        ((dmb) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
