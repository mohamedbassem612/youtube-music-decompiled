package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfv {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final aunn c;
    private final mbc d;
    private final HashMap e = new HashMap();

    public pfv(Context context, aunn aunnVar, mbc mbcVar) {
        this.b = context;
        this.c = aunnVar;
        this.d = mbcVar;
    }

    private final synchronized pfq f(plx plxVar) {
        HashMap map;
        Long lValueOf;
        long j = plxVar != null ? plxVar.a : -1L;
        map = this.e;
        lValueOf = Long.valueOf(j);
        if (!map.containsKey(lValueOf)) {
            map.put(lValueOf, new pfq(this.b, j));
        }
        return (pfq) map.get(lValueOf);
    }

    private final synchronized agkj g(plx plxVar, SQLiteDatabase sQLiteDatabase, qoe qoeVar) {
        agkj agkjVarD;
        try {
            Cursor cursorQuery = sQLiteDatabase.query("threads", null, qoeVar.a, qoeVar.a(), null, null, "last_notification_version DESC", null);
            try {
                agkh agkhVar = new agkh(4);
                while (cursorQuery.moveToNext()) {
                    try {
                        poo pooVarA = nxi.a();
                        pooVarA.l(cursorQuery.getString(pfx.a(cursorQuery, "thread_id")));
                        pooVarA.B(aiep.b(cursorQuery.getInt(pfx.a(cursorQuery, "read_state"))));
                        pooVarA.x(a.aS(cursorQuery.getInt(pfx.a(cursorQuery, "count_behavior"))));
                        pooVarA.z(a.aS(cursorQuery.getInt(pfx.a(cursorQuery, "system_tray_behavior"))));
                        pooVarA.o(cursorQuery.getLong(pfx.a(cursorQuery, "last_updated__version")));
                        pooVarA.n(cursorQuery.getLong(pfx.a(cursorQuery, "last_notification_version")));
                        pooVarA.t(cursorQuery.getString(pfx.a(cursorQuery, "payload_type")));
                        pooVarA.p(pfx.f(cursorQuery, aieb.a, "notification_metadata"));
                        List listF = pfx.f(cursorQuery, aicf.a, "actions");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listF.iterator();
                        while (it.hasNext()) {
                            agev agevVarA = pos.a((aicf) it.next());
                            if (agevVarA.g()) {
                                arrayList.add(agevVarA.c());
                            }
                        }
                        pooVarA.b(arrayList);
                        pooVarA.f(cursorQuery.getLong(pfx.a(cursorQuery, "creation_id")));
                        pooVarA.c((aidq) pfx.e(cursorQuery, aidq.a, "rendered_message"));
                        pooVarA.s((aifv) pfx.e(cursorQuery, aifv.a, "payload"));
                        pooVarA.w(cursorQuery.getString(pfx.a(cursorQuery, "update_thread_state_token")));
                        pooVarA.A(cursorQuery.getString(pfx.a(cursorQuery, "group_id")));
                        pooVarA.i(cursorQuery.getLong(pfx.a(cursorQuery, "expiration_timestamp")));
                        pooVarA.h(cursorQuery.getLong(pfx.a(cursorQuery, "expiration_duration_from_display_ms")));
                        pooVarA.m(cursorQuery.getLong(pfx.a(cursorQuery, "thread_stored_timestamp")));
                        pooVarA.y(a.aS(cursorQuery.getInt(pfx.a(cursorQuery, "storage_mode"))));
                        pooVarA.g(aidu.a(cursorQuery.getInt(pfx.a(cursorQuery, "deletion_status"))));
                        pooVarA.r(aigj.v(cursorQuery.getBlob(pfx.a(cursorQuery, "opaque_backend_data"))));
                        String string = cursorQuery.getString(pfx.a(cursorQuery, "external_experiment_ids"));
                        HashSet hashSet = new HashSet();
                        if (string != null) {
                            try {
                                for (String str : TextUtils.split(string, ",")) {
                                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                                }
                            } catch (NumberFormatException e) {
                                ((agsj) ((agsj) ((agsj) pfx.a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseDelimitedString", 112, "DatabaseHelper.java")).w("Error parsing comma separated numbers to int list: %s", string);
                                hashSet = new HashSet();
                            }
                        }
                        pooVarA.j(hashSet);
                        pooVarA.u((aies) pfx.e(cursorQuery, aies.a, "rendering_metadata"));
                        pooVarA.v(cursorQuery.getLong(pfx.a(cursorQuery, "send_timestamp_usec")));
                        pooVarA.q(cursorQuery.getString(pfx.a(cursorQuery, "notification_type")));
                        agkhVar.e(pooVarA.a(), Long.valueOf(cursorQuery.getLong(pfx.a(cursorQuery, "reference"))));
                    } catch (pfw unused) {
                        paw pawVarA = ((pav) this.c.io()).a(ahyy.DATABASE_ERROR);
                        pawVarA.f(plxVar);
                        pawVarA.a();
                    }
                }
                agkjVarD = agkhVar.d(true);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return agkjVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized void h(plx plxVar, qoe qoeVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(plxVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    agqs agqsVarListIterator = ((agke) list).listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        qoe qoeVar2 = (qoe) agqsVarListIterator.next();
                        tld tldVar = new tld();
                        tldVar.A("UPDATE ");
                        tldVar.A("threads");
                        tldVar.A(" SET ");
                        tldVar.A(qoeVar.a);
                        tldVar.A(" WHERE ");
                        tldVar.A(qoeVar2.a);
                        String str = tldVar.z().a;
                        String[] strArrA = qoeVar.a();
                        String[] strArrA2 = qoeVar2.a();
                        int length = strArrA.length;
                        int length2 = strArrA2.length;
                        Object[] objArr = (Object[]) Array.newInstance((Class<?>) String.class, length + length2);
                        System.arraycopy(strArrA, 0, objArr, 0, length);
                        System.arraycopy(strArrA2, 0, objArr, length, length2);
                        writableDatabase.execSQL(str, objArr);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeUpdate", 168, "ChimeThreadStorageHelper.java")).B("Error updating ChimeThread for account. Set: %s, Queries: %s", qoeVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized agke a(plx plxVar, List list) {
        agke agkeVarG;
        agjz agjzVar = new agjz(4);
        try {
            SQLiteDatabase writableDatabase = f(plxVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    agqs agqsVarListIterator = ((agke) list).listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        agjzVar.j(g(plxVar, writableDatabase, (qoe) agqsVarListIterator.next()).keySet());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    agkeVarG = agjzVar.g();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeQuery", 109, "ChimeThreadStorageHelper.java")).w("Error getting ChimeThreads for account. Queries: %s", list);
            return agpi.a;
        }
        return agkeVarG;
    }

    public final synchronized void b(plx plxVar, List list) {
        tld tldVar = new tld();
        tldVar.A("reference");
        tldVar.A(" = ");
        tldVar.A("reference");
        tldVar.B(" & ~?", 1L);
        h(plxVar, tldVar.z(), list);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0229 A[Catch: RuntimeException -> 0x027f, all -> 0x02ae, PHI: r0
      0x0229: PHI (r0v20 android.util.Pair) = (r0v19 android.util.Pair), (r0v22 android.util.Pair) binds: [B:45:0x0227, B:33:0x01f7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x027f, blocks: (B:4:0x0005, B:46:0x0229, B:60:0x0267, B:73:0x027e, B:72:0x027b), top: B:85:0x0005, outer: #4 }] */
    public final synchronized Pair c(plx plxVar, pot potVar, boolean z) {
        Pair pair;
        try {
            SQLiteDatabase writableDatabase = f(plxVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues(16);
                    String str = potVar.a;
                    contentValues.put("thread_id", str);
                    contentValues.put("read_state", Integer.valueOf(potVar.B - 1));
                    contentValues.put("count_behavior", Integer.valueOf(potVar.y - 1));
                    contentValues.put("system_tray_behavior", Integer.valueOf(potVar.z - 1));
                    long j = potVar.c;
                    contentValues.put("last_updated__version", Long.valueOf(j));
                    contentValues.put("last_notification_version", Long.valueOf(potVar.d));
                    contentValues.put("payload_type", potVar.f);
                    contentValues.put("update_thread_state_token", potVar.j);
                    contentValues.put("group_id", potVar.q);
                    contentValues.put("expiration_timestamp", Long.valueOf(potVar.r));
                    contentValues.put("expiration_duration_from_display_ms", Long.valueOf(potVar.s));
                    contentValues.put("thread_stored_timestamp", Long.valueOf(this.d.f().toEpochMilli()));
                    contentValues.put("locally_removed", Boolean.FALSE);
                    contentValues.put("storage_mode", Integer.valueOf(potVar.A - 1));
                    contentValues.put("creation_id", Long.valueOf(potVar.e));
                    contentValues.put("reference", (Long) 1L);
                    contentValues.put("deletion_status", Integer.valueOf(potVar.b.d));
                    contentValues.put("opaque_backend_data", potVar.i.G());
                    contentValues.put("rendered_message", potVar.o.toByteArray());
                    List<aieb> list = potVar.p;
                    if (!list.isEmpty()) {
                        aihf aihfVarCreateBuilder = pzm.a.createBuilder();
                        for (aieb aiebVar : list) {
                            aihf aihfVarCreateBuilder2 = aifv.a.createBuilder();
                            aigj byteString = aiebVar.toByteString();
                            aihfVarCreateBuilder2.copyOnWrite();
                            ((aifv) aihfVarCreateBuilder2.instance).c = byteString;
                            aihfVarCreateBuilder.Y((aifv) aihfVarCreateBuilder2.build());
                        }
                        contentValues.put("notification_metadata", ((pzm) aihfVarCreateBuilder.build()).toByteArray());
                    }
                    List<pos> list2 = potVar.u;
                    if (!list2.isEmpty()) {
                        aihf aihfVarCreateBuilder3 = pzm.a.createBuilder();
                        for (pos posVar : list2) {
                            aihf aihfVarCreateBuilder4 = aifv.a.createBuilder();
                            aigj byteString2 = posVar.b().toByteString();
                            aihfVarCreateBuilder4.copyOnWrite();
                            ((aifv) aihfVarCreateBuilder4.instance).c = byteString2;
                            aihfVarCreateBuilder3.Y((aifv) aihfVarCreateBuilder4.build());
                        }
                        contentValues.put("actions", ((pzm) aihfVarCreateBuilder3.build()).toByteArray());
                    }
                    aifv aifvVar = potVar.g;
                    if (aifvVar != null) {
                        contentValues.put("payload", aifvVar.toByteArray());
                    }
                    Set set = potVar.k;
                    if (!set.isEmpty()) {
                        contentValues.put("external_experiment_ids", TextUtils.join(",", set));
                    }
                    aies aiesVar = potVar.l;
                    if (aiesVar != null) {
                        contentValues.put("rendering_metadata", aiesVar.toByteArray());
                    }
                    contentValues.put("send_timestamp_usec", Long.valueOf(potVar.m));
                    contentValues.put("notification_type", potVar.n);
                    tld tldVar = new tld();
                    tldVar.A("thread_id");
                    tldVar.B(" = ?", str);
                    qoe qoeVarZ = tldVar.z();
                    agkj agkjVarG = g(plxVar, writableDatabase, qoeVarZ);
                    if (agkjVarG.isEmpty()) {
                        writableDatabase.insertWithOnConflict("threads", null, contentValues, 4);
                        writableDatabase.setTransactionSuccessful();
                        pair = new Pair(pfm.a, agdf.a);
                        writableDatabase.endTransaction();
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                    } else {
                        pot potVar2 = (pot) ((agpl) agkjVarG.keySet()).a.get(0);
                        long j2 = potVar2.c;
                        boolean z2 = j2 == j && !potVar2.equals(potVar);
                        if (j2 < j || (z && z2)) {
                            writableDatabase.update("threads", contentValues, qoeVarZ.a, qoeVarZ.a());
                            writableDatabase.setTransactionSuccessful();
                            pfm pfmVar = (((Long) agkjVarG.get(potVar2)).longValue() & 1) > 0 ? pfm.b : pfm.a;
                            Pair pair2 = new Pair(pfmVar, pfmVar == pfm.b ? agev.i(potVar2) : agdf.a);
                            writableDatabase.endTransaction();
                            if (writableDatabase != null) {
                                writableDatabase.close();
                            }
                            return pair2;
                        }
                        pair = new Pair(pfm.c, agdf.a);
                        writableDatabase.endTransaction();
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                    }
                    return pair;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase == null) {
                    throw th2;
                }
                try {
                    writableDatabase.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "insertOrReplaceThread", 246, "ChimeThreadStorageHelper.java")).w("Error inserting ChimeThread for account, %s", potVar);
            return new Pair(pfm.d, agdf.a);
        }
    }

    public final synchronized void d(plx plxVar) {
        try {
            this.b.deleteDatabase(f(plxVar).getDatabaseName());
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "deleteDatabase", SemanticState.Hidden, "ChimeThreadStorageHelper.java")).t("Error deleting database for account");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(plx plxVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(plxVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    agqs agqsVarListIterator = ((agke) list).listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        qoe qoeVar = (qoe) agqsVarListIterator.next();
                        writableDatabase.delete("threads", qoeVar.a, qoeVar.a());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeDelete", 188, "ChimeThreadStorageHelper.java")).w("Error deleting ChimeThreads for account. Queries: %s", list);
        }
    }
}
