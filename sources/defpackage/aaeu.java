package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaeu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineCleanupHelper");
    public final aalf b;
    public final aaew c;
    public final wcn d;
    public final aany e;
    private final aafj f;
    private final awly g;
    private final afip h;
    private final axfd i;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public aaeu(aalf aalfVar, axfd axfdVar, afip afipVar, aafj aafjVar, abxu abxuVar, aaew aaewVar, wcn wcnVar, aany aanyVar, awly awlyVar) {
        this.b = aalfVar;
        this.i = axfdVar;
        this.h = afipVar;
        this.f = aafjVar;
        this.c = aaewVar;
        this.d = wcnVar;
        this.e = aanyVar;
        this.g = awlyVar;
        axfdVar.d.add(new hzo(this));
        afipVar.O(new aaet(this, 0));
        aafjVar.l(new aaes(this, 0));
        abxuVar.h(new aagf(this, 1));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    public final void a(String str) {
        Cursor cursorRawQuery = this.h.aa().rawQuery("SELECT COUNT(*) FROM videosV2 WHERE channel_id=?", new String[]{str});
        try {
            cursorRawQuery.moveToFirst();
            int i = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            if (i == 0) {
                Cursor cursorRawQuery2 = this.f.p().rawQuery("SELECT COUNT(*) FROM playlistsV13 WHERE channel_id=?", new String[]{str});
                try {
                    cursorRawQuery2.moveToFirst();
                    int i2 = cursorRawQuery2.getInt(0);
                    cursorRawQuery2.close();
                    if (i2 == 0) {
                        try {
                            axfd axfdVar = this.i;
                            long jDelete = axfdVar.t().delete("channelsV13", "id = ?", new String[]{str});
                            axfdVar.s(str);
                            if (jDelete != 1) {
                                throw new SQLException(a.cf(jDelete, "Delete channel affected ", " rows"));
                            }
                            Iterator it = axfdVar.d.iterator();
                            while (it.hasNext()) {
                                aalf aalfVar = ((aaeu) ((hzo) it.next()).a).b;
                                aalfVar.l(aalfVar.a(str));
                            }
                        } catch (SQLException unused) {
                        }
                    }
                } catch (Throwable th) {
                    cursorRawQuery2.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public final void b(Collection collection, aoen aoenVar) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aamo aamoVar = (aamo) it.next();
            String strD = aamoVar.d();
            if (hashSet.add(strD)) {
                aaew aaewVar = this.c;
                aihf builder = aoenVar.toBuilder();
                builder.copyOnWrite();
                aoen aoenVar2 = (aoen) builder.instance;
                strD.getClass();
                aoenVar2.b |= 1;
                aoenVar2.c = strD;
                if (aaewVar.z(aamoVar, (aoen) builder.build())) {
                    arrayList.add(strD);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.g.kk(new aahy(arrayList));
    }
}
