package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aagg {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineVideosDatabaseCache");
    public final Executor b;
    public final aadc c;
    public final aaev d;
    public final aafj e;
    public final ConditionVariable f;
    public final List g;
    public final avlr h;
    public volatile aagn i;
    public final abxu j;
    public final afip k;
    private final aafw l;
    private final boolean m;
    private final aalv n;
    private volatile boolean o;
    private final vxz p;
    private final axfd q;

    public aagg(Executor executor, aadc aadcVar, aaev aaevVar, afip afipVar, aafw aafwVar, aafj aafjVar, abxu abxuVar, aagn aagnVar, axfd axfdVar, Set set, avlr avlrVar, vxz vxzVar, aauk aaukVar, aalv aalvVar) {
        this.b = executor;
        this.c = aadcVar;
        this.d = aaevVar;
        this.k = afipVar;
        this.l = aafwVar;
        this.e = aafjVar;
        this.j = abxuVar;
        this.i = aagnVar;
        this.q = axfdVar;
        this.h = avlrVar;
        this.p = vxzVar;
        this.n = aalvVar;
        aaukVar.M();
        this.m = aaukVar.b.l(232, 45842313L, false);
        this.f = new ConditionVariable();
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(set);
        this.o = false;
        aafwVar.b(new aage(this, 0));
        aafjVar.l(new aaes(this, 2));
        abxuVar.h(new aagf(this, 0));
    }

    static aamc p(aaml aamlVar, List list, int i) {
        if (aamlVar == null) {
            return null;
        }
        aamc aamcVarC = i != 2 ? aamlVar.c(list, false) : null;
        return (aamcVarC != null || i == 3) ? aamcVarC : aamlVar.c(list, true);
    }

    private final String x(aaml aamlVar, aamc aamcVar) {
        String str;
        aagk aagkVarM;
        if (aamlVar == null) {
            return null;
        }
        if (aamcVar == null) {
            return aamlVar.m;
        }
        String str2 = aamlVar.m;
        if (str2 != null || (str = aamcVar.a) == null || (aagkVarM = this.i.m(aamlVar.g())) == null) {
            return str2;
        }
        aamk aamkVarD = aamlVar.d();
        aamkVarD.e = str;
        aagkVarM.g(aamkVarD.a());
        aafw aafwVar = this.l;
        String strG = aamlVar.g();
        int iA = aamlVar.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("storage_id", str);
        long jUpdate = aafwVar.d().update("streams", contentValues, "video_id = ? AND itag = ?", new String[]{strG, Integer.toString(iA)});
        if (jUpdate == 1) {
            return str;
        }
        throw new SQLException(a.cf(jUpdate, "Update stream transfer_started_timestamp affected ", " rows"));
    }

    private static final boolean y(List list, String str) {
        if (str == null) {
            return false;
        }
        return Collection.EL.stream(list).anyMatch(new xdo(str, 20));
    }

    public final aagn a() {
        o();
        return this.i;
    }

    public final java.util.Collection b() {
        java.util.Collection collectionValues;
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            collectionValues = aagnVarA.c.values();
        }
        return collectionValues;
    }

    public final List c() {
        aagn aagnVarA = a();
        LinkedList linkedList = new LinkedList();
        if (aagnVarA.l) {
            Iterator it = aagnVarA.b.values().iterator();
            while (it.hasNext()) {
                linkedList.add(((aagl) it.next()).e());
            }
        } else {
            synchronized (aagnVarA.k) {
                Iterator it2 = aagnVarA.b.values().iterator();
                while (it2.hasNext()) {
                    linkedList.add(((aagl) it2.next()).e());
                }
            }
        }
        return linkedList;
    }

    public final Set d(String str) {
        Set setV;
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            setV = tym.V(aagnVarA.h, str);
        }
        return setV;
    }

    public final void e(String str) {
        a().c(str);
    }

    public final void f(String str) {
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            typ.f(str);
            aagl aaglVar = (aagl) aagnVarA.b.get(str);
            if (aaglVar != null) {
                aaglVar.f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:237:0x0681 A[Catch: all -> 0x06f1, TryCatch #7 {all -> 0x06f1, blocks: (B:53:0x0290, B:54:0x0301, B:56:0x030d, B:57:0x031a, B:59:0x0321, B:61:0x032b, B:63:0x0333, B:66:0x0342, B:68:0x0346, B:70:0x034e, B:71:0x0354, B:74:0x035d, B:64:0x0339, B:136:0x04eb, B:137:0x04f1, B:139:0x04fb, B:141:0x0501, B:143:0x051b, B:145:0x051f, B:154:0x0541, B:156:0x054d, B:159:0x0555, B:161:0x0558, B:162:0x055c, B:165:0x0565, B:167:0x0577, B:174:0x059a, B:176:0x05aa, B:180:0x05c4, B:187:0x05d0, B:189:0x05e7, B:191:0x05fb, B:193:0x0604, B:195:0x060d, B:197:0x0616, B:199:0x0620, B:200:0x0626, B:237:0x0681, B:239:0x068f, B:235:0x0669), top: B:288:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x068f A[Catch: all -> 0x06f1, TRY_LEAVE, TryCatch #7 {all -> 0x06f1, blocks: (B:53:0x0290, B:54:0x0301, B:56:0x030d, B:57:0x031a, B:59:0x0321, B:61:0x032b, B:63:0x0333, B:66:0x0342, B:68:0x0346, B:70:0x034e, B:71:0x0354, B:74:0x035d, B:64:0x0339, B:136:0x04eb, B:137:0x04f1, B:139:0x04fb, B:141:0x0501, B:143:0x051b, B:145:0x051f, B:154:0x0541, B:156:0x054d, B:159:0x0555, B:161:0x0558, B:162:0x055c, B:165:0x0565, B:167:0x0577, B:174:0x059a, B:176:0x05aa, B:180:0x05c4, B:187:0x05d0, B:189:0x05e7, B:191:0x05fb, B:193:0x0604, B:195:0x060d, B:197:0x0616, B:199:0x0620, B:200:0x0626, B:237:0x0681, B:239:0x068f, B:235:0x0669), top: B:288:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x069b A[Catch: all -> 0x06d3, TryCatch #21 {all -> 0x06d3, blocks: (B:241:0x0694, B:242:0x069b, B:244:0x06a1, B:245:0x06ae), top: B:313:0x0694 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x06a1 A[Catch: all -> 0x06d3, TryCatch #21 {all -> 0x06d3, blocks: (B:241:0x0694, B:242:0x069b, B:244:0x06a1, B:245:0x06ae), top: B:313:0x0694 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x06ae A[Catch: all -> 0x06d3, TRY_LEAVE, TryCatch #21 {all -> 0x06d3, blocks: (B:241:0x0694, B:242:0x069b, B:244:0x06a1, B:245:0x06ae), top: B:313:0x0694 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x06d5  */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [awmd, java.lang.Object] */
    public final synchronized void g() {
        Cursor cursor;
        HashMap map;
        List list;
        boolean z;
        aaml aamlVar;
        aaml aamlVar2;
        aiik aiikVar;
        aaml aamlVarA;
        String strG;
        Pair pair;
        String str;
        int i;
        aagl aaglVar;
        int i2;
        int i3;
        wjb wjbVar;
        if (this.o) {
            return;
        }
        this.f.close();
        try {
            try {
                SQLiteDatabase sQLiteDatabaseC = this.d.c();
                long jC = this.p.c(13, 45426867L, 0L);
                Cursor cursorQuery = jC > 0 ? sQLiteDatabaseC.query("videosV2", null, "media_status != ? AND (player_response_proto IS NULL OR length(player_response_proto) <= " + jC + ')', new String[]{Integer.toString(aamg.DELETED.p)}, null, null, null) : sQLiteDatabaseC.query("videosV2", null, "media_status != ?", new String[]{Integer.toString(aamg.DELETED.p)}, null, null, null);
                try {
                    axfd axfdVar = this.q;
                    aalf aalfVar = (aalf) axfdVar.a.io();
                    aalfVar.getClass();
                    axfd axfdVar2 = (axfd) axfdVar.b.io();
                    axfdVar2.getClass();
                    wjb wjbVar2 = (wjb) axfdVar.c.io();
                    wjbVar2.getClass();
                    aauk aaukVar = (aauk) axfdVar.d.io();
                    aaukVar.getClass();
                    tqj tqjVar = (tqj) axfdVar.e.io();
                    tqjVar.getClass();
                    cursorQuery.getClass();
                    aaukVar.M();
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("offline_video_data_proto");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("deleted");
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("channel_id");
                    int columnIndex = cursorQuery.getColumnIndex("video_id");
                    int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("player_response_proto");
                    int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("preferred_stream_quality");
                    int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("audio_track_id");
                    SQLiteDatabase sQLiteDatabase = sQLiteDatabaseC;
                    int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("offline_source_ve_type");
                    aalf aalfVar2 = aalfVar;
                    int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("player_response_tracking_params");
                    int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("saved_timestamp");
                    int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow("last_refresh_timestamp");
                    int columnIndexOrThrow12 = cursorQuery.getColumnIndexOrThrow("last_playback_timestamp");
                    int columnIndexOrThrow13 = cursorQuery.getColumnIndexOrThrow("last_playback_position_timestamp");
                    int columnIndexOrThrow14 = cursorQuery.getColumnIndexOrThrow("last_playback_position_updated_timestamp");
                    int columnIndexOrThrow15 = cursorQuery.getColumnIndexOrThrow("media_status");
                    int columnIndexOrThrow16 = cursorQuery.getColumnIndexOrThrow("stream_transfer_condition");
                    int columnIndexOrThrow17 = cursorQuery.getColumnIndexOrThrow("video_added_timestamp");
                    int columnIndexOrThrow18 = cursorQuery.getColumnIndexOrThrow("streams_timestamp");
                    aagn aagnVar = this.i;
                    while (cursorQuery.moveToNext()) {
                        int i4 = columnIndexOrThrow18;
                        aagn aagnVar2 = aagnVar;
                        aalf aalfVar3 = aalfVar2;
                        int i5 = columnIndexOrThrow9;
                        int i6 = columnIndexOrThrow10;
                        int i7 = columnIndexOrThrow11;
                        int i8 = columnIndexOrThrow12;
                        int i9 = columnIndexOrThrow13;
                        int i10 = columnIndexOrThrow14;
                        wjb wjbVar3 = wjbVar2;
                        int i11 = columnIndexOrThrow5;
                        int i12 = columnIndexOrThrow15;
                        int i13 = columnIndexOrThrow17;
                        aamo aamoVarA = aafz.a(cursorQuery, aalfVar3, axfdVar2, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndex);
                        int i14 = cursorQuery.getInt(columnIndexOrThrow6);
                        cursorQuery.getString(columnIndexOrThrow7);
                        int i15 = cursorQuery.getInt(columnIndexOrThrow8);
                        byte[] blob = vzh.b;
                        try {
                            blob = cursorQuery.getBlob(i5);
                        } catch (SQLiteException unused) {
                        }
                        byte[] bArr = blob;
                        int i16 = columnIndexOrThrow8;
                        int i17 = columnIndexOrThrow16;
                        aagl aaglVarO = aagnVar2.o(aamoVarA, aaus.c(i14), i15, bArr, aamg.a(cursorQuery.getInt(i12)), aamn.a(cursorQuery.getInt(i17)), cursorQuery.getLong(i13));
                        int i18 = i11;
                        wjf wjfVarAX = zik.aX(cursorQuery, i18, tqjVar);
                        if (wjfVarAX != null) {
                            if (aaukVar.o()) {
                                wjbVar = wjbVar3;
                                wjfVarAX = isi.J(wjfVarAX, wjbVar);
                            } else {
                                wjbVar = wjbVar3;
                            }
                            if (aaukVar.x()) {
                                wjfVarAX = isi.H(wjfVarAX, wjbVar);
                            }
                            wjbVar3 = wjbVar;
                            aaglVarO.l(wjfVarAX, cursorQuery.getLong(i6), cursorQuery.getLong(i7));
                            i7 = i7;
                            aaglVar = aaglVarO;
                            i6 = i6;
                            i2 = i8;
                            if (!cursorQuery.isNull(i2)) {
                                aaglVar.j(cursorQuery.getLong(i2));
                            }
                        } else {
                            i18 = i18;
                            aaglVar = aaglVarO;
                            i2 = i8;
                        }
                        if (!cursorQuery.isNull(i9)) {
                            aaglVar.h(cursorQuery.getLong(i9));
                        }
                        if (aaukVar.u()) {
                            i3 = i10;
                            if (!cursorQuery.isNull(i3)) {
                                aaglVar.i(Instant.ofEpochMilli(cursorQuery.getLong(i3)));
                            }
                        } else {
                            i3 = i10;
                        }
                        int i19 = i2;
                        aaglVar.o(cursorQuery.getLong(i4));
                        columnIndexOrThrow18 = i4;
                        columnIndexOrThrow15 = i12;
                        columnIndexOrThrow17 = i13;
                        wjbVar2 = wjbVar3;
                        aalfVar2 = aalfVar3;
                        columnIndexOrThrow16 = i17;
                        columnIndexOrThrow8 = i16;
                        axfdVar2 = axfdVar2;
                        columnIndexOrThrow2 = columnIndexOrThrow2;
                        columnIndexOrThrow5 = i18;
                        columnIndexOrThrow10 = i6;
                        columnIndexOrThrow11 = i7;
                        columnIndexOrThrow12 = i19;
                        columnIndexOrThrow14 = i3;
                        columnIndexOrThrow9 = i5;
                        columnIndexOrThrow = columnIndexOrThrow;
                        aagnVar = aagnVar2;
                        columnIndexOrThrow13 = i9;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    Iterator it = this.e.j().iterator();
                    while (it.hasNext()) {
                        this.i.c(((aamo) it.next()).d());
                    }
                    aafw aafwVar = this.l;
                    Cursor cursorQuery2 = aafwVar.d().query("streams", aafw.a, null, null, null, null, null, null);
                    try {
                        Key key = aafwVar.b;
                        int columnIndexOrThrow19 = cursorQuery2.getColumnIndexOrThrow("video_id");
                        int columnIndexOrThrow20 = cursorQuery2.getColumnIndexOrThrow("format_stream_proto");
                        int columnIndexOrThrow21 = cursorQuery2.getColumnIndexOrThrow("duration_millis");
                        int columnIndexOrThrow22 = cursorQuery2.getColumnIndexOrThrow("audio_only");
                        int columnIndexOrThrow23 = cursorQuery2.getColumnIndexOrThrow("bytes_transferred");
                        int columnIndexOrThrow24 = cursorQuery2.getColumnIndexOrThrow("stream_status");
                        int columnIndexOrThrow25 = cursorQuery2.getColumnIndexOrThrow("stream_status_timestamp");
                        int columnIndexOrThrow26 = cursorQuery2.getColumnIndexOrThrow("storage_format");
                        int columnIndexOrThrow27 = cursorQuery2.getColumnIndexOrThrow("wrapped_key");
                        int columnIndexOrThrow28 = cursorQuery2.getColumnIndexOrThrow("disco_key_iv");
                        int columnIndexOrThrow29 = cursorQuery2.getColumnIndexOrThrow("disco_key");
                        int columnIndexOrThrow30 = cursorQuery2.getColumnIndexOrThrow("disco_nonce_text");
                        int i20 = columnIndexOrThrow27;
                        int columnIndexOrThrow31 = cursorQuery2.getColumnIndexOrThrow("encryption_key_type");
                        int columnIndexOrThrow32 = cursorQuery2.getColumnIndexOrThrow("ytb_uri");
                        int columnIndexOrThrow33 = cursorQuery2.getColumnIndexOrThrow("storage_id");
                        int columnIndexOrThrow34 = cursorQuery2.getColumnIndexOrThrow("expired_stream");
                        HashMap map2 = new HashMap();
                        while (true) {
                            map = map2;
                            columnIndexOrThrow22 = columnIndexOrThrow22;
                            list = null;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                            }
                            String string = cursorQuery2.getString(columnIndexOrThrow19);
                            try {
                                columnIndexOrThrow19 = columnIndexOrThrow19;
                                try {
                                    columnIndexOrThrow20 = columnIndexOrThrow20;
                                    try {
                                        alaw alawVar = (alaw) ((aihh) ((aihh) alaw.b.createBuilder()).mergeFrom(cursorQuery2.getBlob(columnIndexOrThrow20), ExtensionRegistryLite.getGeneratedRegistry())).build();
                                        cursorQuery2.getLong(columnIndexOrThrow21);
                                        byte[] blob2 = cursorQuery2.getBlob(columnIndexOrThrow30);
                                        if (blob2 != null) {
                                            try {
                                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                                try {
                                                    str = new String(blob2, StandardCharsets.UTF_8);
                                                } catch (aiik e) {
                                                    e = e;
                                                    aiikVar = e;
                                                    key = key;
                                                    columnIndexOrThrow28 = columnIndexOrThrow28;
                                                    columnIndexOrThrow29 = columnIndexOrThrow29;
                                                    i20 = i20;
                                                    columnIndexOrThrow31 = columnIndexOrThrow31;
                                                    columnIndexOrThrow32 = columnIndexOrThrow32;
                                                    columnIndexOrThrow33 = columnIndexOrThrow33;
                                                    columnIndexOrThrow34 = columnIndexOrThrow34;
                                                    ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                    aamlVarA = null;
                                                    if (aamlVarA != null) {
                                                        strG = aamlVarA.g();
                                                        map2 = map;
                                                        pair = (Pair) map2.get(strG);
                                                        if (pair == null) {
                                                            cursor = cursorQuery2;
                                                            try {
                                                                map2.put(strG, new Pair(aamlVarA, null));
                                                            } catch (Throwable th) {
                                                                th = th;
                                                            }
                                                        } else {
                                                            cursor = cursorQuery2;
                                                            if (pair.first == null) {
                                                                map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                            } else {
                                                                map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                            }
                                                        }
                                                        cursorQuery2 = cursor;
                                                    } else {
                                                        map2 = map;
                                                    }
                                                    key = key;
                                                }
                                            } catch (aiik e2) {
                                                e = e2;
                                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                            }
                                        } else {
                                            columnIndexOrThrow21 = columnIndexOrThrow21;
                                            str = null;
                                        }
                                        try {
                                            byte[] blob3 = cursorQuery2.getBlob(columnIndexOrThrow28);
                                            byte[] blob4 = cursorQuery2.getBlob(columnIndexOrThrow29);
                                            columnIndexOrThrow28 = columnIndexOrThrow28;
                                            try {
                                                aihf aihfVarCreateBuilder = atxq.a.createBuilder();
                                                if (blob4 != null) {
                                                    columnIndexOrThrow29 = columnIndexOrThrow29;
                                                    try {
                                                        if (blob4.length > 0) {
                                                            try {
                                                                aihfVarCreateBuilder.mergeFrom(dov.aj(blob3, blob4, key), ExtensionRegistryLite.getGeneratedRegistry());
                                                                key = key;
                                                            } catch (aiik e3) {
                                                                key = key;
                                                                try {
                                                                    ((agrc) ((agrc) ((agrc) aaft.a.b()).j(e3)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", 184, "OfflineStreamCursorReader.java")).t("Failed to parse disco key.");
                                                                } catch (aiik e4) {
                                                                    e = e4;
                                                                    aiikVar = e;
                                                                    i20 = i20;
                                                                    columnIndexOrThrow31 = columnIndexOrThrow31;
                                                                    columnIndexOrThrow32 = columnIndexOrThrow32;
                                                                    columnIndexOrThrow33 = columnIndexOrThrow33;
                                                                    columnIndexOrThrow34 = columnIndexOrThrow34;
                                                                    ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                                    aamlVarA = null;
                                                                }
                                                            }
                                                        } else {
                                                            key = key;
                                                        }
                                                    } catch (aiik e5) {
                                                        e = e5;
                                                        key = key;
                                                    }
                                                } else {
                                                    key = key;
                                                    columnIndexOrThrow29 = columnIndexOrThrow29;
                                                }
                                                try {
                                                    aamk aamkVarE = aaml.e();
                                                    aamkVarE.e(new wgs(alawVar, string, false, null));
                                                    try {
                                                        aamkVarE.b(tbd.e(cursorQuery2, columnIndexOrThrow22, false));
                                                        aamkVarE.c(cursorQuery2.getLong(columnIndexOrThrow23));
                                                        int i21 = cursorQuery2.getInt(columnIndexOrThrow24);
                                                        int[] iArr = aaml.b;
                                                        columnIndexOrThrow22 = columnIndexOrThrow22;
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= 5) {
                                                                i = 0;
                                                                break;
                                                            }
                                                            int i23 = iArr[i22];
                                                            if (i23 == i21) {
                                                                i = i23;
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                        aamkVarE.h(i);
                                                        aamkVarE.i(cursorQuery2.getLong(columnIndexOrThrow25));
                                                        aamkVarE.j(a.aV(cursorQuery2.getInt(columnIndexOrThrow26)));
                                                        i20 = i20;
                                                        try {
                                                            aamkVarE.a = cursorQuery2.getBlob(i20);
                                                            aamkVarE.b = blob3;
                                                            aamkVarE.c = (atxq) aihfVarCreateBuilder.build();
                                                            aamkVarE.d = str;
                                                            columnIndexOrThrow31 = columnIndexOrThrow31;
                                                            try {
                                                                aamkVarE.f(cursorQuery2.getInt(columnIndexOrThrow31));
                                                                columnIndexOrThrow33 = columnIndexOrThrow33;
                                                                try {
                                                                    aamkVarE.e = cursorQuery2.getString(columnIndexOrThrow33);
                                                                    columnIndexOrThrow34 = columnIndexOrThrow34;
                                                                    try {
                                                                        aamkVarE.g(tbd.e(cursorQuery2, columnIndexOrThrow34, false));
                                                                        columnIndexOrThrow32 = columnIndexOrThrow32;
                                                                        try {
                                                                            String string2 = cursorQuery2.getString(columnIndexOrThrow32);
                                                                            if (!TextUtils.isEmpty(string2)) {
                                                                                aamkVarE.f = Uri.parse(string2);
                                                                            }
                                                                            aamlVarA = aamkVarE.a();
                                                                        } catch (aiik e6) {
                                                                            e = e6;
                                                                            aiikVar = e;
                                                                            ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                                            aamlVarA = null;
                                                                        }
                                                                    } catch (aiik e7) {
                                                                        e = e7;
                                                                        columnIndexOrThrow32 = columnIndexOrThrow32;
                                                                    }
                                                                } catch (aiik e8) {
                                                                    e = e8;
                                                                    columnIndexOrThrow34 = columnIndexOrThrow34;
                                                                    aiikVar = e;
                                                                    ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                                    aamlVarA = null;
                                                                    if (aamlVarA != null) {
                                                                        strG = aamlVarA.g();
                                                                        map2 = map;
                                                                        pair = (Pair) map2.get(strG);
                                                                        if (pair == null) {
                                                                            cursor = cursorQuery2;
                                                                            map2.put(strG, new Pair(aamlVarA, null));
                                                                        } else {
                                                                            cursor = cursorQuery2;
                                                                            if (pair.first == null) {
                                                                                map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                                            } else {
                                                                                map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                                            }
                                                                        }
                                                                        cursorQuery2 = cursor;
                                                                    } else {
                                                                        map2 = map;
                                                                    }
                                                                    key = key;
                                                                }
                                                            } catch (aiik e9) {
                                                                e = e9;
                                                                columnIndexOrThrow33 = columnIndexOrThrow33;
                                                                columnIndexOrThrow34 = columnIndexOrThrow34;
                                                                aiikVar = e;
                                                                ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                                aamlVarA = null;
                                                                if (aamlVarA != null) {
                                                                    strG = aamlVarA.g();
                                                                    map2 = map;
                                                                    pair = (Pair) map2.get(strG);
                                                                    if (pair == null) {
                                                                        cursor = cursorQuery2;
                                                                        map2.put(strG, new Pair(aamlVarA, null));
                                                                    } else {
                                                                        cursor = cursorQuery2;
                                                                        if (pair.first == null) {
                                                                            map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                                        } else {
                                                                            map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                                        }
                                                                    }
                                                                    cursorQuery2 = cursor;
                                                                } else {
                                                                    map2 = map;
                                                                }
                                                                key = key;
                                                            }
                                                        } catch (aiik e10) {
                                                            e = e10;
                                                            columnIndexOrThrow31 = columnIndexOrThrow31;
                                                            columnIndexOrThrow33 = columnIndexOrThrow33;
                                                            columnIndexOrThrow34 = columnIndexOrThrow34;
                                                            aiikVar = e;
                                                            ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                            aamlVarA = null;
                                                            if (aamlVarA != null) {
                                                                strG = aamlVarA.g();
                                                                map2 = map;
                                                                pair = (Pair) map2.get(strG);
                                                                if (pair == null) {
                                                                    cursor = cursorQuery2;
                                                                    map2.put(strG, new Pair(aamlVarA, null));
                                                                } else {
                                                                    cursor = cursorQuery2;
                                                                    if (pair.first == null) {
                                                                        map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                                    } else {
                                                                        map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                                    }
                                                                }
                                                                cursorQuery2 = cursor;
                                                            } else {
                                                                map2 = map;
                                                            }
                                                            key = key;
                                                        }
                                                    } catch (aiik e11) {
                                                        e = e11;
                                                        columnIndexOrThrow22 = columnIndexOrThrow22;
                                                        i20 = i20;
                                                        columnIndexOrThrow31 = columnIndexOrThrow31;
                                                        columnIndexOrThrow33 = columnIndexOrThrow33;
                                                        columnIndexOrThrow34 = columnIndexOrThrow34;
                                                        aiikVar = e;
                                                        ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                        aamlVarA = null;
                                                        if (aamlVarA != null) {
                                                            strG = aamlVarA.g();
                                                            map2 = map;
                                                            pair = (Pair) map2.get(strG);
                                                            if (pair == null) {
                                                                cursor = cursorQuery2;
                                                                map2.put(strG, new Pair(aamlVarA, null));
                                                            } else {
                                                                cursor = cursorQuery2;
                                                                if (pair.first == null) {
                                                                    map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                                } else {
                                                                    map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                                }
                                                            }
                                                            cursorQuery2 = cursor;
                                                        } else {
                                                            map2 = map;
                                                        }
                                                        key = key;
                                                    }
                                                } catch (aiik e12) {
                                                    e = e12;
                                                }
                                            } catch (aiik e13) {
                                                e = e13;
                                                key = key;
                                                columnIndexOrThrow29 = columnIndexOrThrow29;
                                                i20 = i20;
                                                columnIndexOrThrow31 = columnIndexOrThrow31;
                                                columnIndexOrThrow33 = columnIndexOrThrow33;
                                                columnIndexOrThrow34 = columnIndexOrThrow34;
                                                aiikVar = e;
                                                ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                                aamlVarA = null;
                                                if (aamlVarA != null) {
                                                    strG = aamlVarA.g();
                                                    map2 = map;
                                                    pair = (Pair) map2.get(strG);
                                                    if (pair == null) {
                                                        cursor = cursorQuery2;
                                                        map2.put(strG, new Pair(aamlVarA, null));
                                                    } else {
                                                        cursor = cursorQuery2;
                                                        if (pair.first == null) {
                                                            map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                        } else {
                                                            map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                        }
                                                    }
                                                    cursorQuery2 = cursor;
                                                } else {
                                                    map2 = map;
                                                }
                                                key = key;
                                            }
                                        } catch (aiik e14) {
                                            e = e14;
                                            key = key;
                                            columnIndexOrThrow28 = columnIndexOrThrow28;
                                            columnIndexOrThrow29 = columnIndexOrThrow29;
                                            i20 = i20;
                                            columnIndexOrThrow31 = columnIndexOrThrow31;
                                            columnIndexOrThrow33 = columnIndexOrThrow33;
                                            columnIndexOrThrow34 = columnIndexOrThrow34;
                                            aiikVar = e;
                                            ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                            aamlVarA = null;
                                            if (aamlVarA != null) {
                                                strG = aamlVarA.g();
                                                map2 = map;
                                                pair = (Pair) map2.get(strG);
                                                if (pair == null) {
                                                    cursor = cursorQuery2;
                                                    map2.put(strG, new Pair(aamlVarA, null));
                                                } else {
                                                    cursor = cursorQuery2;
                                                    if (pair.first == null) {
                                                        map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                    } else {
                                                        map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                    }
                                                }
                                                cursorQuery2 = cursor;
                                            } else {
                                                map2 = map;
                                            }
                                            key = key;
                                        }
                                    } catch (aiik e15) {
                                        e = e15;
                                        key = key;
                                        columnIndexOrThrow21 = columnIndexOrThrow21;
                                        columnIndexOrThrow28 = columnIndexOrThrow28;
                                        columnIndexOrThrow29 = columnIndexOrThrow29;
                                        i20 = i20;
                                        columnIndexOrThrow31 = columnIndexOrThrow31;
                                        columnIndexOrThrow33 = columnIndexOrThrow33;
                                        columnIndexOrThrow34 = columnIndexOrThrow34;
                                        aiikVar = e;
                                        ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                        aamlVarA = null;
                                        if (aamlVarA != null) {
                                            strG = aamlVarA.g();
                                            map2 = map;
                                            pair = (Pair) map2.get(strG);
                                            if (pair == null) {
                                                cursor = cursorQuery2;
                                                map2.put(strG, new Pair(aamlVarA, null));
                                            } else {
                                                cursor = cursorQuery2;
                                                if (pair.first == null) {
                                                    map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                                } else {
                                                    map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                                }
                                            }
                                            cursorQuery2 = cursor;
                                        } else {
                                            map2 = map;
                                        }
                                        key = key;
                                    }
                                } catch (aiik e16) {
                                    e = e16;
                                    columnIndexOrThrow20 = columnIndexOrThrow20;
                                    columnIndexOrThrow21 = columnIndexOrThrow21;
                                    columnIndexOrThrow28 = columnIndexOrThrow28;
                                    columnIndexOrThrow29 = columnIndexOrThrow29;
                                    i20 = i20;
                                    columnIndexOrThrow31 = columnIndexOrThrow31;
                                    columnIndexOrThrow33 = columnIndexOrThrow33;
                                    columnIndexOrThrow34 = columnIndexOrThrow34;
                                    aiikVar = e;
                                    ((agrc) ((agrc) ((agrc) aaft.a.b()).j(aiikVar)).k("com/google/android/libraries/youtube/offline/database/OfflineStreamCursorReader", "readStreamInPlace", (char) 215, "OfflineStreamCursorReader.java")).w("Error reading stream for video %s", string);
                                    aamlVarA = null;
                                    if (aamlVarA != null) {
                                        strG = aamlVarA.g();
                                        map2 = map;
                                        pair = (Pair) map2.get(strG);
                                        if (pair == null) {
                                            cursor = cursorQuery2;
                                            map2.put(strG, new Pair(aamlVarA, null));
                                        } else {
                                            cursor = cursorQuery2;
                                            if (pair.first == null) {
                                                map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                            } else {
                                                map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                            }
                                        }
                                        cursorQuery2 = cursor;
                                    } else {
                                        map2 = map;
                                    }
                                    key = key;
                                }
                            } catch (aiik e17) {
                                e = e17;
                                columnIndexOrThrow19 = columnIndexOrThrow19;
                            }
                            if (aamlVarA != null) {
                                strG = aamlVarA.g();
                                map2 = map;
                                pair = (Pair) map2.get(strG);
                                if (pair == null) {
                                    cursor = cursorQuery2;
                                    map2.put(strG, new Pair(aamlVarA, null));
                                } else {
                                    cursor = cursorQuery2;
                                    if (pair.first == null) {
                                        map2.put(strG, new Pair(aamlVarA, (aaml) pair.second));
                                    } else {
                                        map2.put(strG, new Pair((aaml) pair.first, aamlVarA));
                                    }
                                }
                                cursorQuery2 = cursor;
                            } else {
                                map2 = map;
                            }
                            key = key;
                            cursor.close();
                            throw th;
                        }
                        ArrayList<aamm> arrayList = new ArrayList();
                        Iterator it2 = map.values().iterator();
                        while (true) {
                            z = true;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Pair pair2 = (Pair) it2.next();
                            if (pair2.first == null) {
                                aamlVar = null;
                                aamlVar2 = null;
                            } else if (((aaml) pair2.first).d) {
                                aamlVar = (aaml) pair2.first;
                                aamlVar2 = null;
                            } else {
                                aamlVar2 = (aaml) pair2.first;
                                aamlVar = null;
                            }
                            if (pair2.second != null) {
                                if (((aaml) pair2.second).d) {
                                    aamlVar = (aaml) pair2.second;
                                } else {
                                    aamlVar2 = (aaml) pair2.second;
                                }
                            }
                            if (aamlVar2 != null || aamlVar != null) {
                                arrayList.add(new aamm(aamlVar2, aamlVar, true, false));
                            }
                        }
                        cursorQuery2.close();
                        for (aamm aammVar : arrayList) {
                            for (hzo hzoVar : this.g) {
                            }
                            aagn aagnVar3 = this.i;
                            String strF = aammVar.f();
                            aaml aamlVar3 = aammVar.a;
                            aaml aamlVar4 = aammVar.b;
                            synchronized (aagnVar3.k) {
                                try {
                                    aagnVar3.a.put(strF, new aagk(aagnVar3, aamlVar3, aamlVar4));
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        aafj aafjVar = this.e;
                        for (aamh aamhVar : aafjVar.i()) {
                            ArrayList arrayList2 = new ArrayList();
                            String str2 = aamhVar.a;
                            List list2 = list;
                            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                            Cursor cursorQuery3 = sQLiteDatabase2.query("playlist_video", new String[]{"playlist_id", "video_id"}, "playlist_id=?", new String[]{str2}, null, null, "index_in_playlist ASC");
                            try {
                                int columnIndexOrThrow35 = cursorQuery3.getColumnIndexOrThrow("video_id");
                                while (cursorQuery3.moveToNext()) {
                                    String string3 = cursorQuery3.getString(columnIndexOrThrow35);
                                    this.i.d(str2, string3);
                                    arrayList2.add(string3);
                                }
                                cursorQuery3.close();
                                this.i.f(aamhVar, arrayList2, aaus.c(aafjVar.b(str2)), aafjVar.a(str2), aafjVar.c(str2), aafjVar.d(str2), aafjVar.g(str2));
                                sQLiteDatabase = sQLiteDatabase2;
                                list = list2;
                            } catch (Throwable th3) {
                                cursorQuery3.close();
                                throw th3;
                            }
                        }
                        List list3 = list;
                        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
                        abxu abxuVar = this.j;
                        for (aamq aamqVar : abxuVar.f()) {
                            ArrayList arrayList3 = new ArrayList();
                            String str3 = aamqVar.b;
                            Cursor cursorQuery4 = sQLiteDatabase3.query("video_list_videos", new String[]{"video_list_id", "video_id"}, "video_list_id=?", new String[]{str3}, null, null, "index_in_video_list ASC");
                            try {
                                int columnIndexOrThrow36 = cursorQuery4.getColumnIndexOrThrow("video_id");
                                while (cursorQuery4.moveToNext()) {
                                    String string4 = cursorQuery4.getString(columnIndexOrThrow36);
                                    this.i.e(str3, string4);
                                    arrayList3.add(string4);
                                }
                                cursorQuery4.close();
                                ArrayList arrayList4 = new ArrayList();
                                Cursor cursorQuery5 = sQLiteDatabase3.query("final_video_list_video_ids", new String[]{"video_list_id", "video_id"}, "video_list_id=?", new String[]{str3}, null, null, "index_in_video_list ASC");
                                SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase3;
                                try {
                                    int columnIndexOrThrow37 = cursorQuery5.getColumnIndexOrThrow("video_id");
                                    while (cursorQuery5.moveToNext()) {
                                        arrayList4.add(cursorQuery5.getString(columnIndexOrThrow37));
                                    }
                                    cursorQuery5.close();
                                    aogf aogfVarC = abxuVar.c(str3);
                                    boolean zIsEmpty = arrayList4.isEmpty();
                                    aagn aagnVar4 = this.i;
                                    if (zIsEmpty) {
                                        aagnVar4.g(aamqVar, arrayList3, list3, aogfVarC);
                                    } else {
                                        aagnVar4.g(aamqVar, arrayList3, arrayList4, aogfVarC);
                                    }
                                    sQLiteDatabase3 = sQLiteDatabase4;
                                    z = true;
                                } catch (Throwable th4) {
                                    cursorQuery5.close();
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                cursorQuery4.close();
                                throw th5;
                            }
                        }
                        this.o = z;
                        this.f.open();
                    } catch (Throwable th6) {
                        th = th6;
                        cursor = cursorQuery2;
                    }
                } catch (Throwable th7) {
                    if (cursorQuery == null) {
                        throw th7;
                    }
                    try {
                        cursorQuery.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            } catch (SQLException e18) {
                this.n.g(aauj.a(e18));
                throw e18;
            }
        } catch (Throwable th9) {
            this.f.open();
            throw th9;
        }
    }

    public final void h(aamh aamhVar, List list, aohx aohxVar, int i, long j, long j2, aogf aogfVar) {
        a().f(aamhVar, list, aohxVar, i, j, j2, aogfVar);
    }

    public final void i(aaml aamlVar) {
        for (hzo hzoVar : this.g) {
        }
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            ConcurrentHashMap concurrentHashMap = aagnVarA.a;
            if (concurrentHashMap.get(aamlVar.g()) != null) {
                aagnVarA.j(aamlVar);
            } else {
                boolean z = aamlVar.d;
                concurrentHashMap.put(aamlVar.g(), new aagk(aagnVarA, true != z ? aamlVar : null, true != z ? null : aamlVar));
            }
        }
    }

    public final void j(aamq aamqVar, List list, List list2, aogf aogfVar) {
        a().g(aamqVar, list, list2, aogfVar);
    }

    public final void k(aamo aamoVar, String str, aohx aohxVar, int i, byte[] bArr, aamn aamnVar, boolean z, aamg aamgVar) {
        if (z) {
            w(aamoVar, aohxVar, i, bArr, aamgVar, aamnVar, this.k.J(aamoVar.d()));
        }
        a().d(str, aamoVar.d());
    }

    public final void l(String str) {
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            typ.f(str);
            aagnVarA.c.remove(str);
            Set set = (Set) aagnVarA.g.remove(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    tym.X(aagnVarA.f, (String) it.next(), str);
                }
            }
        }
    }

    public final void m(String str) {
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            typ.f(str);
            aagnVarA.a.remove(str);
        }
        for (hzo hzoVar : this.g) {
        }
    }

    public final void n(String str) {
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            typ.f(str);
            aagl aaglVar = (aagl) aagnVarA.b.remove(str);
            aagnVarA.e.remove(str);
            if (aaglVar != null) {
                aagnVarA.m.b(aaglVar);
            }
        }
        for (hzo hzoVar : this.g) {
        }
    }

    public final void o() {
        this.f.block();
    }

    public final aagj q(String str) {
        return a().l(str);
    }

    public final aagk r(String str) {
        return a().m(str);
    }

    public final aagl s(String str) {
        return a().n(str);
    }

    public final aagm t(String str) {
        aagm aagmVar;
        aagn aagnVarA = a();
        synchronized (aagnVarA.k) {
            typ.f(str);
            aagmVar = (aagm) aagnVarA.d.get(str);
        }
        return aagmVar;
    }

    public final void u(aagl aaglVar, List list) {
        int i;
        aagk aagkVarM = this.i.m(aaglVar.c().d());
        if (aagkVarM != null) {
            boolean z = this.m;
            aaml aamlVarC = aagkVarM.c();
            aaml aamlVarA = aagkVarM.a();
            boolean z2 = true;
            if (z) {
                i = 1;
            } else {
                i = true != aaglVar.e().k() ? 3 : 2;
            }
            aamc aamcVarP = p(aamlVarC, list, i);
            aamc aamcVarP2 = p(aamlVarA, list, i);
            String strX = x(aamlVarC, aamcVarP);
            String strX2 = x(aamlVarA, aamcVarP2);
            boolean z3 = aamlVarC == null || aamcVarP != null;
            boolean z4 = aamlVarA == null || aamcVarP2 != null;
            boolean z5 = (aamlVarC == null || y(list, strX)) ? false : true;
            boolean z6 = (aamlVarA == null || y(list, strX2)) ? false : true;
            boolean z7 = z3 && z4;
            if (!z5 && !z6) {
                z2 = false;
            }
            synchronized (aagkVarM.e.k) {
                aagkVarM.c = z7;
                aagkVarM.d = z2;
                aagkVarM.e();
                aagkVarM.f(aagkVarM.b);
            }
        }
    }

    public final SQLiteDatabase v() {
        o();
        return this.d.c();
    }

    final void w(aamo aamoVar, aohx aohxVar, int i, byte[] bArr, aamg aamgVar, aamn aamnVar, long j) {
        a().o(aamoVar, aohxVar, i, bArr, aamgVar, aamnVar, j);
        for (hzo hzoVar : this.g) {
            aamoVar.d();
            ((aalt) ((aado) hzoVar.a).m.io()).a();
        }
    }
}
