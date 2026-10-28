package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class caa extends Thread {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ cab b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caa(cab cabVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = conditionVariable;
        this.b = cabVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027c A[Catch: all -> 0x02ce, LOOP:0: B:100:0x0276->B:102:0x027c, LOOP_END, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0005, B:6:0x0012, B:10:0x001b, B:12:0x0023, B:122:0x02ca, B:13:0x003f, B:16:0x004b, B:21:0x0071, B:23:0x0096, B:25:0x009a, B:27:0x00a4, B:36:0x00da, B:73:0x018f, B:74:0x01a0, B:95:0x0241, B:97:0x0245, B:98:0x024e, B:99:0x0266, B:100:0x0276, B:102:0x027c, B:104:0x0286, B:107:0x028b, B:44:0x00f4, B:46:0x00fc, B:72:0x018a, B:62:0x016c, B:68:0x017d, B:69:0x0182, B:75:0x01a5, B:79:0x01b8, B:80:0x01bb, B:82:0x01d3, B:84:0x01e3, B:86:0x01e8, B:87:0x01eb, B:88:0x01ec, B:94:0x023e, B:116:0x029f, B:115:0x029c, B:118:0x02a1, B:119:0x02ac, B:121:0x02ae, B:19:0x0053, B:9:0x0017), top: B:139:0x0005, inners: #3, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0245 A[Catch: IOException -> 0x02ad, all -> 0x02ce, TryCatch #5 {IOException -> 0x02ad, blocks: (B:21:0x0071, B:23:0x0096, B:25:0x009a, B:27:0x00a4, B:36:0x00da, B:73:0x018f, B:74:0x01a0, B:95:0x0241, B:97:0x0245, B:98:0x024e, B:44:0x00f4, B:46:0x00fc, B:72:0x018a, B:62:0x016c, B:68:0x017d, B:69:0x0182, B:75:0x01a5, B:79:0x01b8, B:80:0x01bb, B:82:0x01d3, B:84:0x01e3, B:86:0x01e8, B:87:0x01eb, B:88:0x01ec, B:94:0x023e, B:116:0x029f, B:115:0x029c, B:118:0x02a1, B:119:0x02ac), top: B:138:0x0071, outer: #6 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        bzv bzvVar;
        bzw bzwVar;
        agqr it;
        bzv bzvVar2;
        bzv bzvVar3;
        bzv bzvVar4;
        DataInputStream dataInputStream;
        bzv bzvVar5;
        bzy bzyVarC;
        cab cabVar = this.b;
        synchronized (cabVar) {
            this.a.open();
            File file = cabVar.a;
            if (!file.exists()) {
                try {
                    cab.j(file);
                } catch (bzj e) {
                    cabVar.e = e;
                }
            }
            File file2 = cabVar.a;
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles == null) {
                String strConcat = "Failed to list cache directory files: ".concat(String.valueOf(String.valueOf(file2)));
                bvx.c("SimpleCache", strConcat);
                cabVar.e = new bzj(strConcat);
            } else {
                long jH = cab.h(fileArrListFiles);
                cabVar.d = jH;
                if (jH == -1) {
                    try {
                        jH = rpi.J(file2);
                        cabVar.d = jH;
                    } catch (IOException e2) {
                        String strConcat2 = "Failed to create cache UID: ".concat(String.valueOf(String.valueOf(cabVar.a)));
                        bvx.d("SimpleCache", strConcat2, e2);
                        cabVar.e = new bzj(strConcat2, e2);
                    }
                }
                try {
                    bzw bzwVar2 = cabVar.b;
                    bzv bzvVar6 = bzwVar2.c;
                    ((bzt) bzvVar6).d = Long.toHexString(jH);
                    ((bzt) bzvVar6).e = bzt.a(((bzt) bzvVar6).d);
                    int i = 2;
                    DataInputStream dataInputStream2 = null;
                    int i2 = 0;
                    if (bzvVar6.f() || (bzvVar2 = bzwVar2.d) == null || !((bzu) bzvVar2).b.j()) {
                        HashMap map = bzwVar2.a;
                        SparseArray sparseArray = bzwVar2.b;
                        ahno.O(((bzt) bzvVar6).c.size() == 0);
                        try {
                            bxo bxoVar = ((bzt) bzvVar6).b;
                            SQLiteDatabase readableDatabase = bxoVar.getReadableDatabase();
                            String str = ((bzt) bzvVar6).d;
                            str.getClass();
                            if (bxq.a(readableDatabase, 1, str) != 1) {
                                SQLiteDatabase writableDatabase = bxoVar.getWritableDatabase();
                                writableDatabase.beginTransactionNonExclusive();
                                try {
                                    ((bzt) bzvVar6).c(writableDatabase);
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                } catch (Throwable th) {
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            SQLiteDatabase readableDatabase2 = ((bzt) bzvVar6).b.getReadableDatabase();
                            String str2 = ((bzt) bzvVar6).e;
                            str2.getClass();
                            Cursor cursorQuery = readableDatabase2.query(str2, bzt.a, null, null, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    int i3 = cursorQuery.getInt(0);
                                    String string = cursorQuery.getString(1);
                                    string.getClass();
                                    bzs bzsVar = new bzs(i3, string, bzw.c(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2)))));
                                    String str3 = bzsVar.b;
                                    map.put(str3, bzsVar);
                                    sparseArray.put(bzsVar.a, str3);
                                } catch (Throwable th2) {
                                    if (cursorQuery == null) {
                                        throw th2;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e3) {
                            map.clear();
                            sparseArray.clear();
                            throw new bxn(e3);
                        }
                    } else {
                        bzv bzvVar7 = bzwVar2.d;
                        HashMap map2 = bzwVar2.a;
                        SparseArray sparseArray2 = bzwVar2.b;
                        boolean z = ((bzu) bzvVar7).a;
                        ahno.O(true);
                        qv qvVar = ((bzu) bzvVar7).b;
                        if (qvVar.j()) {
                            try {
                                dataInputStream = new DataInputStream(new BufferedInputStream(qvVar.f()));
                                try {
                                    try {
                                        int i4 = dataInputStream.readInt();
                                        if (i4 < 0 || i4 > 2) {
                                            bzvVar3 = bzvVar7;
                                            bzvVar4 = bzvVar6;
                                            int i5 = bwp.a;
                                            afxw.h(dataInputStream);
                                        } else {
                                            if ((dataInputStream.readInt() & 1) != 0) {
                                                int i6 = bwp.a;
                                                afxw.h(dataInputStream);
                                            } else {
                                                int i7 = dataInputStream.readInt();
                                                int iAk = 0;
                                                while (i2 < i7) {
                                                    int i8 = dataInputStream.readInt();
                                                    String utf = dataInputStream.readUTF();
                                                    if (i4 < i) {
                                                        bzvVar4 = bzvVar6;
                                                        try {
                                                            long j = dataInputStream.readLong();
                                                            bzvVar3 = bzvVar7;
                                                            try {
                                                                eol eolVar = new eol((char[]) null);
                                                                eolVar.i(j);
                                                                bzyVarC = bzy.a.b(eolVar);
                                                            } catch (IOException unused) {
                                                                if (dataInputStream != null) {
                                                                    int i9 = bwp.a;
                                                                    afxw.h(dataInputStream);
                                                                }
                                                                map2.clear();
                                                                sparseArray2.clear();
                                                                ((bzu) bzvVar3).b.h();
                                                                bzvVar5 = bzvVar4;
                                                                bzvVar5.e(map2);
                                                                bzvVar = bzwVar2.d;
                                                                if (bzvVar != null) {
                                                                    ((bzu) bzvVar).b.h();
                                                                    bzwVar2.d = null;
                                                                }
                                                                bzq bzqVar = cabVar.c;
                                                                bzqVar.c(cabVar.d);
                                                                Map mapA = bzqVar.a();
                                                                cabVar.k(cabVar.a, true, fileArrListFiles, mapA);
                                                                bzqVar.e(mapA.keySet());
                                                                bzwVar = cabVar.b;
                                                                it = agkz.n(bzwVar.a.keySet()).iterator();
                                                                while (it.hasNext()) {
                                                                    bzwVar.d((String) it.next());
                                                                }
                                                                bzwVar.e();
                                                            }
                                                        } catch (IOException unused2) {
                                                            bzvVar3 = bzvVar7;
                                                        }
                                                    } else {
                                                        bzvVar3 = bzvVar7;
                                                        bzvVar4 = bzvVar6;
                                                        bzyVarC = bzw.c(dataInputStream);
                                                    }
                                                    bzs bzsVar2 = new bzs(i8, utf, bzyVarC);
                                                    String str4 = bzsVar2.b;
                                                    map2.put(str4, bzsVar2);
                                                    int i10 = bzsVar2.a;
                                                    sparseArray2.put(i10, str4);
                                                    int iHashCode = ((i10 * 31) + str4.hashCode()) * 31;
                                                    bzy bzyVar = bzsVar2.e;
                                                    iAk += iHashCode + (i4 < 2 ? a.ak(bzyVar.a()) : bzyVar.hashCode());
                                                    i2++;
                                                    bzvVar6 = bzvVar4;
                                                    bzvVar7 = bzvVar3;
                                                    i = 2;
                                                }
                                                int i11 = dataInputStream.readInt();
                                                int i12 = dataInputStream.read();
                                                if (i11 == iAk && i12 == -1) {
                                                    int i13 = bwp.a;
                                                    afxw.h(dataInputStream);
                                                    bzvVar5 = bzvVar6;
                                                } else {
                                                    int i14 = bwp.a;
                                                    afxw.h(dataInputStream);
                                                }
                                            }
                                            bzvVar3 = bzvVar7;
                                            bzvVar4 = bzvVar6;
                                        }
                                    } catch (IOException unused3) {
                                        bzvVar3 = bzvVar7;
                                        bzvVar4 = bzvVar6;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    dataInputStream2 = dataInputStream;
                                    if (dataInputStream2 != null) {
                                        int i15 = bwp.a;
                                        afxw.h(dataInputStream2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused4) {
                                bzvVar3 = bzvVar7;
                                bzvVar4 = bzvVar6;
                                dataInputStream = null;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            map2.clear();
                            sparseArray2.clear();
                            ((bzu) bzvVar3).b.h();
                            bzvVar5 = bzvVar4;
                        } else {
                            bzvVar5 = bzvVar6;
                        }
                        bzvVar5.e(map2);
                    }
                    bzvVar = bzwVar2.d;
                    if (bzvVar != null) {
                        ((bzu) bzvVar).b.h();
                        bzwVar2.d = null;
                    }
                    bzq bzqVar2 = cabVar.c;
                    bzqVar2.c(cabVar.d);
                    Map mapA2 = bzqVar2.a();
                    cabVar.k(cabVar.a, true, fileArrListFiles, mapA2);
                    bzqVar2.e(mapA2.keySet());
                    bzwVar = cabVar.b;
                    it = agkz.n(bzwVar.a.keySet()).iterator();
                    while (it.hasNext()) {
                        bzwVar.d((String) it.next());
                    }
                    try {
                        bzwVar.e();
                    } catch (IOException e4) {
                        bvx.d("SimpleCache", "Storing index file failed", e4);
                    }
                } catch (IOException e5) {
                    String strConcat3 = "Failed to initialize cache indices: ".concat(String.valueOf(String.valueOf(cabVar.a)));
                    bvx.d("SimpleCache", strConcat3, e5);
                    cabVar.e = new bzj(strConcat3, e5);
                }
            }
        }
    }
}
