package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lgn {
    final /* synthetic */ lgp a;
    private final String b;
    private long c;

    public lgn(lgp lgpVar, String str, long j) {
        this.a = lgpVar;
        kro.i(str);
        this.b = str;
        this.c = lgpVar.d("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.a.e().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{this.b, String.valueOf(this.c)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.c) {
                            this.c = j;
                        }
                        try {
                            aihf aihfVar = (aihf) lfx.l(lin.a.createBuilder(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            aihfVar.copyOnWrite();
                            lin linVar = (lin) aihfVar.instance;
                            linVar.b |= 1;
                            linVar.d = string;
                            long j4 = cursorQuery.getLong(2);
                            aihfVar.copyOnWrite();
                            lin linVar2 = (lin) aihfVar.instance;
                            linVar2.b |= 2;
                            linVar2.e = j4;
                            aihfVar.copyOnWrite();
                            lin linVar3 = (lin) aihfVar.instance;
                            linVar3.b |= 64;
                            linVar3.j = j3;
                            arrayList.add(new lgm(j, j2, z, (lin) aihfVar.build()));
                        } catch (IOException e) {
                            this.a.aT().c.c("Data loss. Failed to merge raw event. appId", lcz.a(this.b), e);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e2) {
            this.a.aT().c.c("Data loss. Error querying raw events batch. appId", lcz.a(this.b), e2);
        }
        return arrayList;
    }

    public lgn(lgp lgpVar, String str) {
        this.a = lgpVar;
        kro.i(str);
        this.b = str;
        this.c = -1L;
    }
}
