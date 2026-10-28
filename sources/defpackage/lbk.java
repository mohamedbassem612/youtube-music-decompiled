package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lbk {
    final /* synthetic */ lbo a;
    private lin b;
    private Long c;
    private long d;

    public lbk(lbo lboVar) {
        this.a = lboVar;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01a0  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x019d: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:414), block:B:67:0x019d */
    final lin a(String str, lin linVar) {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        lbo lboVar = this.a;
        String str2 = linVar.d;
        List list = linVar.c;
        lboVar.u();
        Long l = (Long) lfx.ac(linVar, "_eid");
        if (l != null) {
            if (str2.equals("_ep")) {
                lboVar.u();
                String str3 = (String) lfx.ac(linVar, "_en");
                if (TextUtils.isEmpty(str3)) {
                    lboVar.aT().d.b("Extra parameter without an event name. eventId", l);
                } else {
                    if (this.b == null || this.c == null || l.longValue() != this.c.longValue()) {
                        lgp lgpVarV = lboVar.v();
                        lgpVarV.o();
                        lgpVarV.w();
                        try {
                            try {
                                cursorRawQuery = lgpVarV.e().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            pairCreate = Pair.create((lin) ((aihf) lfx.l(lin.a.createBuilder(), cursorRawQuery.getBlob(0))).build(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                        } catch (IOException e) {
                                            lgpVarV.aT().c.d("Failed to merge main event. appId, eventId", lcz.a(str), l, e);
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pairCreate = null;
                                        }
                                    } else {
                                        lgpVarV.aT().k.a("Main event not found");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pairCreate = null;
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    lgpVarV.aT().c.b("Error selecting main event", e);
                                    if (cursorRawQuery != null) {
                                    }
                                    pairCreate = null;
                                    if (pairCreate != null) {
                                    }
                                    this.a.aT().d.c("Extra parameter without existing main event. eventName, eventId", str3, l);
                                    return null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursor2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                        if (pairCreate != null || pairCreate.first == null) {
                            this.a.aT().d.c("Extra parameter without existing main event. eventName, eventId", str3, l);
                        } else {
                            this.b = (lin) pairCreate.first;
                            this.d = ((Long) pairCreate.second).longValue();
                            this.a.u();
                            this.c = (Long) lfx.ac(this.b, "_eid");
                        }
                    }
                    long j = this.d - 1;
                    this.d = j;
                    lbo lboVar2 = this.a;
                    if (j <= 0) {
                        lgp lgpVarV2 = lboVar2.v();
                        lgpVarV2.o();
                        lgpVarV2.aT().k.b("Clearing complex main event info. appId", str);
                        try {
                            lgpVarV2.e().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                        } catch (SQLiteException e4) {
                            lgpVarV2.aT().c.b("Error clearing complex main event", e4);
                        }
                    } else {
                        lboVar2.v().ak(str, l, this.d, this.b);
                    }
                    List arrayList = new ArrayList();
                    for (lip lipVar : this.b.c) {
                        this.a.u();
                        if (lfx.R(linVar, lipVar.c) == null) {
                            arrayList.add(lipVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        this.a.aT().d.b("No unique parameters in main event. eventName", str3);
                    } else {
                        arrayList.addAll(list);
                        list = arrayList;
                    }
                    str2 = str3;
                }
                return null;
            }
            this.c = l;
            this.b = linVar;
            lboVar.u();
            long jLongValue = ((Long) lfx.af(linVar, "_epc", 0L)).longValue();
            this.d = jLongValue;
            if (jLongValue <= 0) {
                lboVar.aT().d.b("Complex event with zero extra param count. eventName", str2);
            } else {
                lboVar.v().ak(str, l, this.d, linVar);
            }
        }
        aihf builder = linVar.toBuilder();
        builder.copyOnWrite();
        lin linVar2 = (lin) builder.instance;
        str2.getClass();
        linVar2.b |= 1;
        linVar2.d = str2;
        builder.copyOnWrite();
        ((lin) builder.instance).c = lin.emptyProtobufList();
        builder.copyOnWrite();
        lin linVar3 = (lin) builder.instance;
        linVar3.a();
        aifs.addAll(list, linVar3.c);
        return (lin) builder.build();
    }
}
