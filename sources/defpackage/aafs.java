package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aafs extends tbi {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineSQLiteOpenHelper");
    public final mbc b;
    public final aalf c;
    private final twv d;
    private final vxu e;
    private final hzo f;

    public aafs(mbc mbcVar, Context context, vxu vxuVar, aalf aalfVar, String str, hzo hzoVar) {
        super(context, str, 38);
        this.d = new aafk(this);
        this.b = mbcVar;
        this.c = aalfVar;
        this.f = hzoVar;
        this.e = vxuVar;
        aoej aoejVar = vxuVar.c().l;
        if ((aoejVar == null ? aoej.a : aoejVar).d) {
            setWriteAheadLoggingEnabled(true);
            if (Build.VERSION.SDK_INT >= 27) {
                setIdleConnectionTimeout(60000L);
            }
        }
    }

    @Override // defpackage.tbi
    protected final tbh a(int i) {
        boolean z = false;
        if (i >= 0 && i < 38) {
            z = true;
        }
        ahno.F(z);
        return (tbh) ((List) this.d.io()).get(i);
    }

    @Override // defpackage.tbi
    protected final void c(SQLiteDatabase sQLiteDatabase) {
        hxh hxhVar;
        tbd.d(sQLiteDatabase);
        hzo hzoVar = this.f;
        if (hzoVar == null || (hxhVar = ((aaev) hzoVar.a).a) == null) {
            return;
        }
        aado aadoVar = (aado) hxhVar.a;
        aalf aalfVar = (aalf) aadoVar.p.io();
        aalf.t(aalfVar.a, aalfVar.f, aalfVar.b, aalfVar.h, aalfVar.d);
        aada aadaVar = aalfVar.g;
        if (aadaVar != null) {
            aadaVar.k();
        }
        aaps aapsVar = aadoVar.g;
        String str = aadoVar.b;
        aapsVar.a(str);
        aadoVar.h.a(str);
        aadoVar.i.a(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f != null) {
            sQLiteDatabase.delete("playlistsV13", "placeholder = ?", new String[]{tbd.a.toString()});
        }
    }
}
