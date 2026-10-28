package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zxx implements zxy {
    private final /* synthetic */ int $cid;

    public zxx(Context context, vyt vytVar, int i, byte[] bArr) {
        this.$cid = i;
        context.getClass();
        vytVar.getClass();
    }

    @Override // defpackage.zxy
    public final amum a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? amum.PLUS_PAGE_ID : amum.DATASYNC_ID;
        }
        return amum.DELEGATED_CHILD;
    }

    @Override // defpackage.zxy
    public final void b(Map map, zyg zygVar) {
        int i = this.$cid;
        if (i == 0) {
            if (!tyu.h(zygVar.c())) {
                throw new IllegalStateException();
            }
            if (zygVar.P().f()) {
                map.put("X-YouTube-Delegated-Child", "true");
                return;
            }
            return;
        }
        if (i != 1) {
            if (!tyu.h(zygVar.c())) {
                throw new IllegalStateException();
            }
            zwa zwaVarP = zygVar.P();
            if (zwaVarP.d()) {
                map.put("X-Goog-PageId", zwaVarP.l());
                return;
            }
            return;
        }
        if (!tyu.h(zygVar.c())) {
            throw new IllegalStateException();
        }
        zwa zwaVarP2 = zygVar.P();
        if (zwaVarP2.h()) {
            return;
        }
        map.put("X-YouTube-DataSync-Id", zwaVarP2.i());
    }

    @Override // defpackage.zxy
    public final boolean c() {
        int i = this.$cid;
        return (i == 0 || i == 1) ? false : true;
    }

    public zxx(Context context, vyt vytVar, int i) {
        this.$cid = i;
        context.getClass();
        vytVar.getClass();
    }

    public zxx(Context context, vyt vytVar, int i, char[] cArr) {
        this.$cid = i;
        context.getClass();
        vytVar.getClass();
    }
}
