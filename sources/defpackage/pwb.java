package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase;
import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pwb implements aunn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ pwb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aunn, java.lang.Object] */
    @Override // defpackage.aunn
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            return ((GnpRoomDatabase) this.a.io()).w();
        }
        if (i == 1) {
            return (afzv) ((may) this.a).a(new afyq(6));
        }
        if (i == 2) {
            return ((GnpPerDeviceRoomDatabase) this.a.io()).w();
        }
        Boolean.TRUE.booleanValue();
        return Boolean.TRUE;
    }
}
