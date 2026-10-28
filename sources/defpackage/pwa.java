package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pwa implements aunn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ pwa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    @Override // defpackage.aunn
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            return ((GnpRoomDatabase) this.a.io()).w();
        }
        Object obj = this.a;
        if (i != 1) {
            return i != 2 ? ((adak) obj).o : obj;
        }
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }
}
