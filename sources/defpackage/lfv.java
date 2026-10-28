package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfv implements leb {
    private static volatile lfv w;
    private boolean B;
    private boolean C;
    private FileLock D;
    private FileChannel E;
    private final Map F;
    private final Map G;
    private final Map H;
    private lhf I;
    private String J;
    private lbw K;
    public final ldo a;
    public lgp b;
    public ldf c;
    public lhq d;
    public lbo e;
    public lew f;
    public lfh g;
    public final lgv i;
    public final ldr j;
    long l;
    public List m;
    public int n;
    public int o;
    public boolean p;
    public List q;
    public List r;
    public long u;
    public elq v;
    private final lde x;
    private final lfx y;
    private boolean z;
    public final AtomicBoolean k = new AtomicBoolean(false);
    private long A = -4611686018427387904L;
    public final Map t = new HashMap();
    private final lfz L = new lft(this);
    long s = -1;
    public final lfp h = new lfp(this);

    public lfv(lqa lqaVar) {
        this.j = ldr.h((Context) lqaVar.a, null, null, null);
        lfx lfxVar = new lfx(this);
        lfxVar.x();
        this.y = lfxVar;
        lde ldeVar = new lde(this);
        ldeVar.x();
        this.x = ldeVar;
        ldo ldoVar = new ldo(this);
        ldoVar.x();
        this.a = ldoVar;
        this.i = new lgw(this);
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new HashMap();
        aU().j(new lei(this, 8, null));
    }

    private final Map aA(lin linVar) {
        Object objU;
        HashMap map = new HashMap();
        q();
        HashMap map2 = new HashMap();
        for (lip lipVar : linVar.c) {
            if (lipVar.c.startsWith("gad_") && (objU = lfx.U(lipVar)) != null) {
                map2.put(lipVar.c, objU);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final void aB(String str, String str2) {
        A();
        if (i().F(null, lcl.aT)) {
            ((lgw) this.i).a(str, "sgtm", str2, 1);
        } else {
            v().T(str, "sgtm", str2, 1L, 0L);
        }
    }

    private final boolean aC() {
        A();
        D();
        return (v().c("select count(1) > 0 from raw_events", null) == 0 && TextUtils.isEmpty(v().q())) ? false : true;
    }

    private final boolean aD(String str) {
        return aE(str, "purchase") && aE(str, "_iap") && aE(str, "ecommerce_purchase");
    }

    private final boolean aE(String str, String str2) {
        lca lcaVarJ = v().j("events", str, str2);
        return lcaVarJ == null || lcaVarJ.c < 1;
    }

    private static final boolean aF(liq liqVar) {
        Iterator it = liqVar.c.iterator();
        while (it.hasNext()) {
            if ((((lir) it.next()).b & Integer.MIN_VALUE) != 0) {
                return true;
            }
        }
        return false;
    }

    private static final Boolean aG(lbg lbgVar) {
        Boolean bool = lbgVar.p;
        String str = lbgVar.C;
        if (TextUtils.isEmpty(str)) {
            return bool;
        }
        int iOrdinal = ((lge) kjc.y(str).a).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal != 2) {
            return iOrdinal == 3 ? Boolean.FALSE : bool;
        }
        return Boolean.TRUE;
    }

    private static final boolean aH(String str) {
        return str.equals("purchase") || str.equals("_iap") || str.equals("ecommerce_purchase") || str.equals("in_app_purchase");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0199 A[EDGE_INSN: B:110:0x0199->B:55:0x0199 BREAK  A[LOOP:0: B:35:0x00dc->B:58:0x01a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[Catch: SQLiteException -> 0x01c8, all -> 0x01ce, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x01c8, blocks: (B:28:0x00b6, B:30:0x00c1, B:29:0x00bd), top: B:99:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd A[Catch: SQLiteException -> 0x01c8, all -> 0x01ce, TryCatch #0 {SQLiteException -> 0x01c8, blocks: (B:28:0x00b6, B:30:0x00c1, B:29:0x00bd), top: B:99:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea A[Catch: all -> 0x01be, SQLiteException -> 0x01c1, TryCatch #2 {SQLiteException -> 0x01c1, blocks: (B:32:0x00d4, B:35:0x00dc, B:40:0x00f5, B:38:0x00ea), top: B:103:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5 A[Catch: all -> 0x01be, SQLiteException -> 0x01c1, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x01c1, blocks: (B:32:0x00d4, B:35:0x00dc, B:40:0x00f5, B:38:0x00ea), top: B:103:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0175 A[Catch: SQLiteException -> 0x01bc, all -> 0x01be, TryCatch #5 {SQLiteException -> 0x01bc, blocks: (B:53:0x0193, B:55:0x0199, B:43:0x0112, B:45:0x0156, B:47:0x015c, B:48:0x016f, B:50:0x0175, B:52:0x018a, B:59:0x01af), top: B:109:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0188  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4 A[LOOP:0: B:35:0x00dc->B:58:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x01af A[Catch: SQLiteException -> 0x01bc, all -> 0x01be, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x01bc, blocks: (B:53:0x0193, B:55:0x0199, B:43:0x0112, B:45:0x0156, B:47:0x015c, B:48:0x016f, B:50:0x0175, B:52:0x018a, B:59:0x01af), top: B:109:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8 A[PHI: r17 r18
      0x01b8: PHI (r17v11 lbd) = (r17v17 lbd), (r3v27 lbd) binds: [B:60:0x01b6, B:57:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r18v11 long) = (r18v17 long), (r4v12 long) binds: [B:60:0x01b6, B:57:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0223  */
    /* JADX WARN: Code duplicated, block: B:91:0x0232  */
    /* JADX WARN: Code duplicated, block: B:94:0x023f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0247  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [lgp] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v4, types: [lbd] */
    /* JADX WARN: Type inference failed for: r3v25, types: [long] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [lbd] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [long] */
    private final void aI(aihf aihfVar) throws Throwable {
        lbd lbdVarH;
        lgp lgpVarV;
        List arrayList;
        ?? r17;
        ?? r18;
        String str;
        int i;
        lir lirVar;
        aiie aiieVar;
        ?? E;
        int i2;
        String[] strArr;
        String str2;
        ?? r19;
        ?? r110;
        Cursor cursor;
        lgp lgpVar;
        ?? r111;
        ?? r112;
        ?? r113;
        ?? r114;
        boolean zF;
        String[] strArr2;
        int i3;
        Cursor cursorQuery;
        lbd lbdVar;
        long j;
        long j2;
        lbd lbdVar2;
        int i4;
        String string;
        String str3;
        String string2;
        aihf aihfVarCreateBuilder;
        boolean z;
        int i5;
        A();
        String str4 = ((lir) aihfVar.instance).r;
        if (TextUtils.isEmpty(str4) || (lbdVarH = v().h(str4)) == null) {
            return;
        }
        aV();
        long jCurrentTimeMillis = System.currentTimeMillis();
        aV();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jE = i().E(str4, lcl.az);
        int i6 = ((jElapsedRealtime - this.A) > jE ? 1 : ((jElapsedRealtime - this.A) == jE ? 0 : -1)) ^ (-1);
        int i7 = i6 >>> 31;
        String str5 = jCurrentTimeMillis - lbdVarH.n() < jE ? "" : str4;
        if (!str5.isEmpty()) {
            lgpVarV = v();
            lgpVarV.o();
            lgpVarV.w();
            arrayList = new ArrayList();
            try {
                E = lgpVarV.e();
                if (i7 != 0 || str5.isEmpty()) {
                    i2 = 0;
                    strArr = new String[]{str5};
                    str2 = "app_id = ?";
                } else {
                    i2 = 0;
                    strArr = new String[]{str5, ""};
                    str2 = "app_id IN (?, ?)";
                }
                r19 = strArr;
                r110 = str2;
                E.beginTransaction();
                try {
                    try {
                        zF = lgpVarV.G().F(str5, lcl.bl);
                        str = str5;
                        lgpVar = lgpVarV;
                        i = i7;
                        try {
                            if (zF) {
                                strArr2 = new String[]{"signal_name", "metadata", "count", "app_id", "sum"};
                            } else {
                                strArr2 = new String[]{"signal_name", "metadata", "count", "app_id"};
                            }
                            String[] strArr3 = strArr2;
                            i3 = 2;
                            cursorQuery = E.query("diagnostic_signals", strArr3, r110, r19, null, null, "rowid", null);
                            try {
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            i4 = i2;
                                            lbdVarH = lbdVarH;
                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                            while (true) {
                                                string = cursorQuery.getString(i4);
                                                if (cursorQuery.isNull(1)) {
                                                    str3 = "";
                                                } else {
                                                    String string3 = cursorQuery.getString(1);
                                                    kro.l(string3);
                                                    str3 = string3;
                                                }
                                                if (string == null) {
                                                    lgpVar.aT().c.b("Read null value from diagnostic signals table, ignoring it. appId", lcz.a(str));
                                                    z = zF;
                                                    i5 = 2;
                                                } else {
                                                    long j3 = cursorQuery.getLong(i3);
                                                    string2 = cursorQuery.getString(3);
                                                    aihfVarCreateBuilder = lhr.a.createBuilder();
                                                    aihfVarCreateBuilder.copyOnWrite();
                                                    lhr lhrVar = (lhr) aihfVarCreateBuilder.instance;
                                                    z = zF;
                                                    lhrVar.b |= 1;
                                                    lhrVar.c = string;
                                                    aihfVarCreateBuilder.copyOnWrite();
                                                    lhr lhrVar2 = (lhr) aihfVarCreateBuilder.instance;
                                                    lhrVar2.b |= 8;
                                                    lhrVar2.f = j3;
                                                    aihfVarCreateBuilder.copyOnWrite();
                                                    lhr lhrVar3 = (lhr) aihfVarCreateBuilder.instance;
                                                    lhrVar3.b |= 4;
                                                    lhrVar3.e = str3;
                                                    if (z && !cursorQuery.isNull(4)) {
                                                        long j4 = cursorQuery.getLong(4);
                                                        aihfVarCreateBuilder.copyOnWrite();
                                                        lhr lhrVar4 = (lhr) aihfVarCreateBuilder.instance;
                                                        lhrVar4.b |= 16;
                                                        lhrVar4.g = j4;
                                                    }
                                                    if (TextUtils.isEmpty(string2)) {
                                                        aihfVarCreateBuilder.copyOnWrite();
                                                        lhr lhrVar5 = (lhr) aihfVarCreateBuilder.instance;
                                                        i5 = 2;
                                                        lhrVar5.b |= 2;
                                                        lhrVar5.d = true;
                                                    } else {
                                                        i5 = 2;
                                                    }
                                                    arrayList.add((lhr) aihfVarCreateBuilder.build());
                                                }
                                                if (!cursorQuery.moveToNext()) {
                                                    break;
                                                }
                                                i3 = i5;
                                                lbdVarH = lbdVarH;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                zF = z;
                                                i4 = 0;
                                            }
                                            E.delete("diagnostic_signals", r110, r19);
                                            E.setTransactionSuccessful();
                                            r114 = lbdVarH;
                                            r113 = jCurrentTimeMillis;
                                            if (cursorQuery != null) {
                                                lbdVar2 = lbdVarH;
                                                j2 = jCurrentTimeMillis;
                                                lbdVar2 = lbdVar;
                                                j2 = j;
                                                r114 = lbdVar;
                                                r113 = j;
                                                cursorQuery.close();
                                                r114 = lbdVar2;
                                                r113 = j2;
                                            }
                                        } else {
                                            lbdVar = lbdVarH;
                                            j = jCurrentTimeMillis;
                                            E.setTransactionSuccessful();
                                            if (cursorQuery != null) {
                                                lbdVar2 = lbdVar;
                                                j2 = j;
                                                r114 = lbdVar;
                                                r113 = j;
                                                cursorQuery.close();
                                                r114 = lbdVar2;
                                                r113 = j2;
                                            }
                                        }
                                    } catch (SQLiteException e) {
                                        e = e;
                                        cursor = cursorQuery;
                                        r112 = r110;
                                        r111 = r19;
                                        try {
                                            lgpVar.aT().c.c("Error querying or deleting diagnostic signals. appId", lcz.a(str), e);
                                            arrayList = Collections.EMPTY_LIST;
                                            r114 = r112;
                                            r113 = r111;
                                            if (cursor != null) {
                                                cursor.close();
                                                r114 = r112;
                                                r113 = r111;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            E.endTransaction();
                                            throw th;
                                        }
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    r110 = lbdVarH;
                                    r19 = jCurrentTimeMillis;
                                }
                                lbdVar2 = lbdVar;
                                j2 = j;
                                r114 = lbdVar;
                                r113 = j;
                                E.endTransaction();
                                r17 = r114;
                                r18 = r113;
                                if (!arrayList.isEmpty()) {
                                    aihfVar.copyOnWrite();
                                    lirVar = (lir) aihfVar.instance;
                                    aiieVar = lirVar.ae;
                                    if (!aiieVar.c()) {
                                        lirVar.ae = aihn.mutableCopy(aiieVar);
                                    }
                                    aifs.addAll(arrayList, lirVar.ae);
                                }
                                if (i != 0) {
                                    this.A = jElapsedRealtime;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                E.endTransaction();
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursor = null;
                            r112 = lbdVarH;
                            r111 = jCurrentTimeMillis;
                            lgpVar.aT().c.c("Error querying or deleting diagnostic signals. appId", lcz.a(str), e);
                            arrayList = Collections.EMPTY_LIST;
                            r114 = r112;
                            r113 = r111;
                            if (cursor != null) {
                                cursor.close();
                                r114 = r112;
                                r113 = r111;
                            }
                            lbdVar2 = lbdVar;
                            j2 = j;
                            r114 = lbdVar;
                            r113 = j;
                            E.endTransaction();
                            r17 = r114;
                            r18 = r113;
                            if (!arrayList.isEmpty()) {
                                aihfVar.copyOnWrite();
                                lirVar = (lir) aihfVar.instance;
                                aiieVar = lirVar.ae;
                                if (!aiieVar.c()) {
                                    lirVar.ae = aihn.mutableCopy(aiieVar);
                                }
                                aifs.addAll(arrayList, lirVar.ae);
                            }
                            if (i != 0) {
                                this.A = jElapsedRealtime;
                            }
                            if (str.isEmpty()) {
                            }
                            ?? r2 = r17;
                            r2.ac(r18);
                            v().an(r2, false);
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        str = str5;
                        lgpVar = lgpVarV;
                        i = i7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            } catch (SQLiteException e5) {
                r17 = lbdVarH;
                r18 = jCurrentTimeMillis;
                str = str5;
                i = i7;
                lgpVarV.aT().c.c("Error opening database for diagnostic signals. appId", lcz.a(str), e5);
                arrayList = Collections.EMPTY_LIST;
            }
        } else if (i6 < 0) {
            i7 = 1;
            lgpVarV = v();
            lgpVarV.o();
            lgpVarV.w();
            arrayList = new ArrayList();
            E = lgpVarV.e();
            if (i7 != 0) {
                i2 = 0;
                strArr = new String[]{str5};
                str2 = "app_id = ?";
            } else {
                i2 = 0;
                strArr = new String[]{str5};
                str2 = "app_id = ?";
            }
            r19 = strArr;
            r110 = str2;
            E.beginTransaction();
            zF = lgpVarV.G().F(str5, lcl.bl);
            str = str5;
            lgpVar = lgpVarV;
            i = i7;
            if (zF) {
                strArr2 = new String[]{"signal_name", "metadata", "count", "app_id", "sum"};
            } else {
                strArr2 = new String[]{"signal_name", "metadata", "count", "app_id"};
            }
            String[] strArr4 = strArr2;
            i3 = 2;
            cursorQuery = E.query("diagnostic_signals", strArr4, r110, r19, null, null, "rowid", null);
            if (cursorQuery.moveToFirst()) {
                i4 = i2;
                lbdVarH = lbdVarH;
                jCurrentTimeMillis = jCurrentTimeMillis;
                while (true) {
                    string = cursorQuery.getString(i4);
                    if (cursorQuery.isNull(1)) {
                        str3 = "";
                    } else {
                        String string4 = cursorQuery.getString(1);
                        kro.l(string4);
                        str3 = string4;
                    }
                    if (string == null) {
                        lgpVar.aT().c.b("Read null value from diagnostic signals table, ignoring it. appId", lcz.a(str));
                        z = zF;
                        i5 = 2;
                    } else {
                        long j5 = cursorQuery.getLong(i3);
                        string2 = cursorQuery.getString(3);
                        aihfVarCreateBuilder = lhr.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        lhr lhrVar6 = (lhr) aihfVarCreateBuilder.instance;
                        z = zF;
                        lhrVar6.b |= 1;
                        lhrVar6.c = string;
                        aihfVarCreateBuilder.copyOnWrite();
                        lhr lhrVar7 = (lhr) aihfVarCreateBuilder.instance;
                        lhrVar7.b |= 8;
                        lhrVar7.f = j5;
                        aihfVarCreateBuilder.copyOnWrite();
                        lhr lhrVar8 = (lhr) aihfVarCreateBuilder.instance;
                        lhrVar8.b |= 4;
                        lhrVar8.e = str3;
                        if (z) {
                            long j6 = cursorQuery.getLong(4);
                            aihfVarCreateBuilder.copyOnWrite();
                            lhr lhrVar9 = (lhr) aihfVarCreateBuilder.instance;
                            lhrVar9.b |= 16;
                            lhrVar9.g = j6;
                        }
                        if (TextUtils.isEmpty(string2)) {
                            aihfVarCreateBuilder.copyOnWrite();
                            lhr lhrVar10 = (lhr) aihfVarCreateBuilder.instance;
                            i5 = 2;
                            lhrVar10.b |= 2;
                            lhrVar10.d = true;
                        } else {
                            i5 = 2;
                        }
                        arrayList.add((lhr) aihfVarCreateBuilder.build());
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    i3 = i5;
                    lbdVarH = lbdVarH;
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    zF = z;
                    i4 = 0;
                }
                E.delete("diagnostic_signals", r110, r19);
                E.setTransactionSuccessful();
                r114 = lbdVarH;
                r113 = jCurrentTimeMillis;
                if (cursorQuery != null) {
                    lbdVar2 = lbdVarH;
                    j2 = jCurrentTimeMillis;
                    lbdVar2 = lbdVar;
                    j2 = j;
                    r114 = lbdVar;
                    r113 = j;
                    cursorQuery.close();
                    r114 = lbdVar2;
                    r113 = j2;
                }
            } else {
                lbdVar = lbdVarH;
                j = jCurrentTimeMillis;
                E.setTransactionSuccessful();
                if (cursorQuery != null) {
                    lbdVar2 = lbdVar;
                    j2 = j;
                    r114 = lbdVar;
                    r113 = j;
                    cursorQuery.close();
                    r114 = lbdVar2;
                    r113 = j2;
                }
            }
            lbdVar2 = lbdVar;
            j2 = j;
            r114 = lbdVar;
            r113 = j;
            E.endTransaction();
            r17 = r114;
            r18 = r113;
            if (!arrayList.isEmpty()) {
                aihfVar.copyOnWrite();
                lirVar = (lir) aihfVar.instance;
                aiieVar = lirVar.ae;
                if (!aiieVar.c()) {
                    lirVar.ae = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(arrayList, lirVar.ae);
            }
            if (i != 0) {
                this.A = jElapsedRealtime;
            }
        } else {
            r17 = lbdVarH;
            r18 = jCurrentTimeMillis;
            str = str5;
        }
        if (str.isEmpty()) {
            ?? r3 = r17;
            r3.ac(r18);
            v().an(r3, false);
        }
    }

    private final void aJ(aihf aihfVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(((lin) aihfVar.instance).c));
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((lip) arrayList.get(i)).c)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            double d = aihfVar.C(i).g * 1000000.0d;
            if (d == 0.0d) {
                d = aihfVar.C(i).e * 1000000.0d;
            }
            if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
                aT().f.c(a.bT(str, "Data lost. Purchase ", " is too big. appId"), lcz.a(str2), Double.valueOf(d));
                return;
            }
            aihfVar.E(i);
            aihf aihfVarCreateBuilder = lip.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            lip lipVar = (lip) aihfVarCreateBuilder.instance;
            lipVar.b |= 1;
            lipVar.c = str;
            long jRound = Math.round(d);
            aihfVarCreateBuilder.copyOnWrite();
            lip lipVar2 = (lip) aihfVarCreateBuilder.instance;
            lipVar2.b |= 4;
            lipVar2.e = jRound;
            aihfVar.D((lip) aihfVarCreateBuilder.build());
        }
    }

    private final void aK(String str, aihf aihfVar) {
        A();
        D();
        lbd lbdVarH = v().h(str);
        if (lbdVarH == null) {
            aT().c.b("Cannot fix consent fields without appInfo. appId", lcz.a(str));
        } else {
            al(lbdVarH, aihfVar);
        }
    }

    private final void aL(aihf aihfVar, long j, boolean z) {
        aaqp aaqpVar;
        lgp lgpVarV = v();
        String str = ((lir) aihfVar.instance).r;
        String str2 = true != z ? "_lte" : "_se";
        aaqp aaqpVarAp = lgpVarV.ap(str, str2);
        if (aaqpVarAp != null) {
            String str3 = ((lir) aihfVar.instance).r;
            aV();
            aaqpVar = new aaqp(str3, "auto", str2, System.currentTimeMillis(), Long.valueOf(((Long) aaqpVarAp.c).longValue() + j));
        } else {
            String str4 = ((lir) aihfVar.instance).r;
            aV();
            aaqpVar = new aaqp(str4, "auto", str2, System.currentTimeMillis(), Long.valueOf(j));
        }
        aihf aihfVarCreateBuilder = lix.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        lix lixVar = (lix) aihfVarCreateBuilder.instance;
        lixVar.b |= 2;
        lixVar.d = str2;
        aV();
        long jCurrentTimeMillis = System.currentTimeMillis();
        aihfVarCreateBuilder.copyOnWrite();
        lix lixVar2 = (lix) aihfVarCreateBuilder.instance;
        lixVar2.b |= 1;
        lixVar2.c = jCurrentTimeMillis;
        Object obj = aaqpVar.c;
        long jLongValue = ((Long) obj).longValue();
        aihfVarCreateBuilder.copyOnWrite();
        lix lixVar3 = (lix) aihfVarCreateBuilder.instance;
        lixVar3.b |= 8;
        lixVar3.f = jLongValue;
        lix lixVar4 = (lix) aihfVarCreateBuilder.build();
        int iW = lfx.W(aihfVar, str2);
        if (iW >= 0) {
            aihfVar.copyOnWrite();
            lir lirVar = (lir) aihfVar.instance;
            lixVar4.getClass();
            lirVar.b();
            lirVar.f.set(iW, lixVar4);
        } else {
            aihfVar.K(lixVar4);
        }
        if (j > 0) {
            v().aq(aaqpVar);
            aT().k.c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj);
        }
    }

    private final void aM(Bundle bundle, aihf aihfVar) {
        aihfVar.copyOnWrite();
        lin linVar = (lin) aihfVar.instance;
        lin linVar2 = lin.a;
        linVar.c = lin.emptyProtobufList();
        lfx lfxVarQ = q();
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            aihf aihfVarCreateBuilder = lip.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            lip lipVar = (lip) aihfVarCreateBuilder.instance;
            str.getClass();
            lipVar.b |= 1;
            lipVar.c = str;
            Object obj = bundle.get(str);
            if (obj != null) {
                lfxVarQ.X(aihfVarCreateBuilder, obj);
                arrayList.add((lip) aihfVarCreateBuilder.build());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aihfVar.D((lip) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x021a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0225  */
    /* JADX WARN: Code duplicated, block: B:75:0x0241  */
    /* JADX WARN: Code duplicated, block: B:77:0x0256  */
    /* JADX WARN: Code duplicated, block: B:79:0x025d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0262  */
    /* JADX WARN: Code duplicated, block: B:83:0x0273  */
    /* JADX WARN: Code duplicated, block: B:85:0x0296  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b2  */
    private final void aN(aihf aihfVar, lhk lhkVar) {
        Integer num;
        int iIntValue;
        lca lcaVarA;
        Long l;
        boolean z;
        Boolean boolValueOf;
        long j;
        boolean z2;
        Long l2;
        long jLongValue;
        Long lValueOf;
        boolean z3;
        Long lValueOf2;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        SecureRandom secureRandomB = r().B();
        for (int i = 0; i < ((lir) aihfVar.instance).e.size(); i++) {
            aihf builder = aihfVar.H(i).toBuilder();
            long j2 = 1;
            if (((lin) builder.instance).d.equals("_ep")) {
                q();
                String str = (String) lfx.ac((lin) builder.build(), "_en");
                lca lcaVarJ = (lca) map.get(str);
                if (lcaVarJ == null) {
                    lgp lgpVarV = v();
                    String str2 = lhkVar.a.r;
                    kro.l(str);
                    lcaVarJ = lgpVarV.j("events", str2, str);
                    if (lcaVarJ != null) {
                        map.put(str, lcaVarJ);
                    }
                }
                if (lcaVarJ != null && lcaVarJ.i == null) {
                    Long l3 = lcaVarJ.j;
                    if (l3 != null && l3.longValue() > 1) {
                        q();
                        lfx.Z(builder, "_sr", l3);
                    }
                    Boolean bool = lcaVarJ.k;
                    if (bool != null && bool.booleanValue()) {
                        q();
                        lfx.Z(builder, "_efs", 1L);
                    }
                    arrayList.add((lin) builder.build());
                }
                aihfVar.bl(i, builder);
            } else {
                ldo ldoVarO = o();
                String str3 = lhkVar.a.r;
                String strA = ldoVarO.a(str3, "measurement.account.time_zone_offset_minutes");
                long j3 = 0;
                if (!TextUtils.isEmpty(strA)) {
                    try {
                        j3 = Long.parseLong(strA);
                    } catch (NumberFormatException e) {
                        ldoVarO.aT().f.c("Unable to parse timezone offset. appId", lcz.a(str3), e);
                    }
                }
                r();
                long j4 = j3 * 60000;
                long j5 = ((lin) builder.instance).e + j4;
                Long l4 = 1L;
                Iterator it = ((lin) builder.build()).c.iterator();
                while (true) {
                    long j6 = j2;
                    if (it.hasNext()) {
                        lip lipVar = (lip) it.next();
                        Iterator it2 = it;
                        if ("_dbg".equals(lipVar.c)) {
                            if (l4.equals(Long.valueOf(lipVar.e))) {
                                iIntValue = 1;
                            }
                            if (iIntValue <= 0) {
                                aT().f.c("Sample rate must be positive. event, rate", ((lin) builder.instance).d, Integer.valueOf(iIntValue));
                                arrayList.add((lin) builder.build());
                                aihfVar.bl(i, builder);
                            } else {
                                lcaVarA = (lca) map.get(((lin) builder.instance).d);
                                if (lcaVarA == null && (lcaVarA = v().j("events", lhkVar.a.r, ((lin) builder.instance).d)) == null) {
                                    aT().f.c("Event being bundled has no eventAggregate. appId, eventName", lhkVar.a.r, ((lin) builder.instance).d);
                                    String str4 = lhkVar.a.r;
                                    lin linVar = (lin) builder.instance;
                                    lcaVarA = new lca(str4, linVar.d, 1L, 1L, 1L, linVar.e, 0L, null, null, null, null);
                                }
                                q();
                                l = (Long) lfx.ac((lin) builder.build(), "_eid");
                                if (l != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolValueOf = Boolean.valueOf(z);
                                if (iIntValue == 1) {
                                    arrayList.add((lin) builder.build());
                                    boolValueOf.getClass();
                                    if (z && (lcaVarA.i != null || lcaVarA.j != null || lcaVarA.k != null)) {
                                        map.put(((lin) builder.instance).d, lcaVarA.a(null, null, null));
                                    }
                                    aihfVar.bl(i, builder);
                                } else {
                                    j = j5 / 86400000;
                                    if (secureRandomB.nextInt(iIntValue) == 0) {
                                        z3 = z;
                                        q();
                                        lValueOf2 = Long.valueOf(iIntValue);
                                        lfx.Z(builder, "_sr", lValueOf2);
                                        arrayList.add((lin) builder.build());
                                        boolValueOf.getClass();
                                        if (z3) {
                                            lcaVarA = lcaVarA.a(null, lValueOf2, null);
                                        }
                                        lin linVar2 = (lin) builder.instance;
                                        map.put(linVar2.d, lcaVarA.b(linVar2.e, j));
                                    } else {
                                        z2 = z;
                                        l2 = lcaVarA.h;
                                        if (l2 != null) {
                                            jLongValue = l2.longValue();
                                        } else {
                                            r();
                                            jLongValue = (((lin) builder.instance).f + j4) / 86400000;
                                        }
                                        if (jLongValue != j) {
                                            q();
                                            lfx.Z(builder, "_efs", Long.valueOf(j6));
                                            q();
                                            lValueOf = Long.valueOf(iIntValue);
                                            lfx.Z(builder, "_sr", lValueOf);
                                            arrayList.add((lin) builder.build());
                                            boolValueOf.getClass();
                                            if (z2) {
                                                lcaVarA = lcaVarA.a(null, lValueOf, Boolean.TRUE);
                                            }
                                            lin linVar3 = (lin) builder.instance;
                                            map.put(linVar3.d, lcaVarA.b(linVar3.e, j));
                                        } else {
                                            boolValueOf.getClass();
                                            if (z2) {
                                                map.put(((lin) builder.instance).d, lcaVarA.a(l, null, null));
                                            }
                                        }
                                    }
                                    aihfVar.bl(i, builder);
                                }
                            }
                        } else {
                            j2 = j6;
                            it = it2;
                        }
                    }
                    ldo ldoVarO2 = o();
                    String str5 = lhkVar.a.r;
                    String str6 = ((lin) builder.instance).d;
                    ldoVarO2.o();
                    ldoVarO2.h(str5);
                    Map map2 = (Map) ldoVarO2.g.get(str5);
                    if (map2 == null || (num = (Integer) map2.get(str6)) == null) {
                        iIntValue = 1;
                    } else {
                        iIntValue = num.intValue();
                    }
                    if (iIntValue <= 0) {
                        aT().f.c("Sample rate must be positive. event, rate", ((lin) builder.instance).d, Integer.valueOf(iIntValue));
                        arrayList.add((lin) builder.build());
                        aihfVar.bl(i, builder);
                    } else {
                        lcaVarA = (lca) map.get(((lin) builder.instance).d);
                        if (lcaVarA == null) {
                            aT().f.c("Event being bundled has no eventAggregate. appId, eventName", lhkVar.a.r, ((lin) builder.instance).d);
                            String str7 = lhkVar.a.r;
                            lin linVar4 = (lin) builder.instance;
                            lcaVarA = new lca(str7, linVar4.d, 1L, 1L, 1L, linVar4.e, 0L, null, null, null, null);
                        }
                        q();
                        l = (Long) lfx.ac((lin) builder.build(), "_eid");
                        if (l != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolValueOf = Boolean.valueOf(z);
                        if (iIntValue == 1) {
                            arrayList.add((lin) builder.build());
                            boolValueOf.getClass();
                            if (z) {
                                map.put(((lin) builder.instance).d, lcaVarA.a(null, null, null));
                            }
                            aihfVar.bl(i, builder);
                        } else {
                            j = j5 / 86400000;
                            if (secureRandomB.nextInt(iIntValue) == 0) {
                                z3 = z;
                                q();
                                lValueOf2 = Long.valueOf(iIntValue);
                                lfx.Z(builder, "_sr", lValueOf2);
                                arrayList.add((lin) builder.build());
                                boolValueOf.getClass();
                                if (z3) {
                                    lcaVarA = lcaVarA.a(null, lValueOf2, null);
                                }
                                lin linVar5 = (lin) builder.instance;
                                map.put(linVar5.d, lcaVarA.b(linVar5.e, j));
                            } else {
                                z2 = z;
                                l2 = lcaVarA.h;
                                if (l2 != null) {
                                    jLongValue = l2.longValue();
                                } else {
                                    r();
                                    jLongValue = (((lin) builder.instance).f + j4) / 86400000;
                                }
                                if (jLongValue != j) {
                                    q();
                                    lfx.Z(builder, "_efs", Long.valueOf(j6));
                                    q();
                                    lValueOf = Long.valueOf(iIntValue);
                                    lfx.Z(builder, "_sr", lValueOf);
                                    arrayList.add((lin) builder.build());
                                    boolValueOf.getClass();
                                    if (z2) {
                                        lcaVarA = lcaVarA.a(null, lValueOf, Boolean.TRUE);
                                    }
                                    lin linVar6 = (lin) builder.instance;
                                    map.put(linVar6.d, lcaVarA.b(linVar6.e, j));
                                } else {
                                    boolValueOf.getClass();
                                    if (z2) {
                                        map.put(((lin) builder.instance).d, lcaVarA.a(l, null, null));
                                    }
                                }
                            }
                            aihfVar.bl(i, builder);
                        }
                    }
                }
            }
        }
        if (arrayList.size() < ((lir) aihfVar.instance).e.size()) {
            aihfVar.copyOnWrite();
            ((lir) aihfVar.instance).e = lir.emptyProtobufList();
            aihfVar.J(arrayList);
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            v().aa("events", (lca) ((Map.Entry) it3.next()).getValue());
        }
    }

    private final void aO(lip lipVar, aihf aihfVar, String str, Bundle bundle) {
        aiie aiieVar = lipVar.h;
        Bundle[] bundleArr = new Bundle[aiieVar.size()];
        for (int i = 0; i < aiieVar.size(); i++) {
            lip lipVar2 = (lip) aiieVar.get(i);
            q();
            Bundle bundleQ = lfx.Q(lipVar2.h);
            Iterator it = lipVar2.h.iterator();
            while (it.hasNext()) {
                ap(((lin) aihfVar.instance).d, ((lip) it.next()).toBuilder(), bundleQ, str);
            }
            bundleArr[i] = bundleQ;
        }
        bundle.putParcelableArray("items", bundleArr);
    }

    private final boolean aP(aihf aihfVar, aihf aihfVar2) {
        kro.c("_e".equals(((lin) aihfVar.instance).d));
        q();
        lip lipVarR = lfx.R((lin) aihfVar.build(), "_sc");
        String str = lipVarR == null ? null : lipVarR.d;
        q();
        lip lipVarR2 = lfx.R((lin) aihfVar2.build(), "_pc");
        String str2 = lipVarR2 != null ? lipVarR2.d : null;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        kro.c("_e".equals(((lin) aihfVar.instance).d));
        q();
        lip lipVarR3 = lfx.R((lin) aihfVar.build(), "_et");
        if (lipVarR3 != null && (lipVarR3.b & 4) != 0) {
            long j = lipVarR3.e;
            if (j > 0) {
                q();
                lip lipVarR4 = lfx.R((lin) aihfVar2.build(), "_et");
                if (lipVarR4 != null) {
                    long j2 = lipVarR4.e;
                    if (j2 > 0) {
                        j += j2;
                    }
                }
                q();
                lfx.Z(aihfVar2, "_et", Long.valueOf(j));
                q();
                lfx.Z(aihfVar, "_fr", 1L);
            }
        }
        return true;
    }

    private static final void aQ(aihf aihfVar) {
        aihfVar.copyOnWrite();
        lir lirVar = (lir) aihfVar.instance;
        lir lirVar2 = lir.a;
        lirVar.b |= 4;
        lirVar.h = Long.MAX_VALUE;
        aihfVar.copyOnWrite();
        lir lirVar3 = (lir) aihfVar.instance;
        lirVar3.b |= 8;
        lirVar3.i = Long.MIN_VALUE;
        for (int i = 0; i < ((lir) aihfVar.instance).e.size(); i++) {
            lin linVarH = aihfVar.H(i);
            long j = linVarH.e;
            if (j < ((lir) aihfVar.instance).h) {
                aihfVar.copyOnWrite();
                lir lirVar4 = (lir) aihfVar.instance;
                lirVar4.b |= 4;
                lirVar4.h = j;
            }
            long j2 = linVarH.e;
            if (j2 > ((lir) aihfVar.instance).i) {
                aihfVar.copyOnWrite();
                lir lirVar5 = (lir) aihfVar.instance;
                lirVar5.b |= 8;
                lirVar5.i = j2;
            }
        }
    }

    private static final void aR(aihf aihfVar) {
        lin linVar = (lin) aihfVar.instance;
        if ("_iap".equals(linVar.d)) {
            ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(linVar.c));
            for (int i = 0; i < arrayList.size(); i++) {
                if ("quantity".equals(((lip) arrayList.get(i)).c)) {
                    return;
                }
            }
            aihf aihfVarCreateBuilder = lip.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            lip lipVar = (lip) aihfVarCreateBuilder.instance;
            lipVar.b |= 1;
            lipVar.c = "quantity";
            aihfVarCreateBuilder.copyOnWrite();
            lip lipVar2 = (lip) aihfVarCreateBuilder.instance;
            lipVar2.b |= 4;
            lipVar2.e = 1L;
            aihfVar.D((lip) aihfVarCreateBuilder.build());
        }
    }

    public static final boolean ah(lbg lbgVar) {
        return !TextUtils.isEmpty(lbgVar.b);
    }

    public static final void ai(lfo lfoVar) {
        if (lfoVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!lfoVar.y()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(lfoVar.getClass()))));
        }
    }

    static final void ar(aihf aihfVar, lgh lghVar) {
        if (!lghVar.m()) {
            aihfVar.copyOnWrite();
            lir lirVar = (lir) aihfVar.instance;
            lir lirVar2 = lir.a;
            lirVar.b &= -65537;
            lir lirVar3 = lir.a;
            lirVar.v = lirVar3.v;
            aihfVar.copyOnWrite();
            lir lirVar4 = (lir) aihfVar.instance;
            lirVar4.b &= -131073;
            lirVar4.w = false;
            aihfVar.copyOnWrite();
            lir lirVar5 = (lir) aihfVar.instance;
            lirVar5.b &= Alert.DURATION_SHOW_INDEFINITELY;
            lirVar5.I = lirVar3.I;
        }
        if (lghVar.o()) {
            return;
        }
        aihfVar.copyOnWrite();
        lir lirVar6 = (lir) aihfVar.instance;
        lir lirVar7 = lir.a;
        lirVar6.b &= -262145;
        lir lirVar8 = lir.a;
        lirVar6.x = lirVar8.x;
        aihfVar.copyOnWrite();
        lir lirVar9 = (lir) aihfVar.instance;
        lirVar9.c &= -8193;
        lirVar9.P = lirVar8.P;
    }

    static final void as(aihf aihfVar, int i, String str) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lin) aihfVar.instance).c);
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            if ("_err".equals(((lip) listUnmodifiableList.get(i2)).c)) {
                return;
            }
        }
        lip lipVar = lip.a;
        aihf aihfVarCreateBuilder = lipVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        lip lipVar2 = (lip) aihfVarCreateBuilder.instance;
        lipVar2.b |= 1;
        lipVar2.c = "_err";
        long j = i;
        Long.valueOf(j).getClass();
        aihfVarCreateBuilder.copyOnWrite();
        lip lipVar3 = (lip) aihfVarCreateBuilder.instance;
        lipVar3.b |= 4;
        lipVar3.e = j;
        lip lipVar4 = (lip) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = lipVar.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        lip lipVar5 = (lip) aihfVarCreateBuilder2.instance;
        lipVar5.b |= 1;
        lipVar5.c = "_ev";
        aihfVarCreateBuilder2.copyOnWrite();
        lip lipVar6 = (lip) aihfVarCreateBuilder2.instance;
        lipVar6.b |= 2;
        lipVar6.d = str;
        lip lipVar7 = (lip) aihfVarCreateBuilder2.build();
        aihfVar.D(lipVar4);
        aihfVar.D(lipVar7);
    }

    static final void at(aihf aihfVar) {
        String str = ((lin) aihfVar.instance).d;
        if ("_f".equals(str) || "_v".equals(str)) {
            for (int i = 0; i < ((lin) aihfVar.instance).c.size(); i++) {
                lip lipVarC = aihfVar.C(i);
                if ("_elt".equals(lipVarC.c)) {
                    long j = lipVarC.e;
                    aihfVar.copyOnWrite();
                    lin linVar = (lin) aihfVar.instance;
                    linVar.b |= 16;
                    linVar.h = j;
                    aihfVar.E(i);
                    return;
                }
            }
        }
    }

    static final void au(aihf aihfVar, String str) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lin) aihfVar.instance).c);
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            if (str.equals(((lip) listUnmodifiableList.get(i)).c)) {
                aihfVar.E(i);
                return;
            }
        }
    }

    private final int av(String str, lgc lgcVar) {
        lgg lggVar;
        lge lgeVarC;
        ldo ldoVar = this.a;
        if (ldoVar.d(str) == null) {
            lgcVar.b(lgg.AD_PERSONALIZATION, lgb.FAILSAFE);
            return 1;
        }
        lbd lbdVarH = v().h(str);
        if (lbdVarH == null || kjc.y(lbdVarH.D()).a != lge.POLICY || (lgeVarC = ldoVar.c(str, (lggVar = lgg.AD_PERSONALIZATION))) == lge.UNINITIALIZED) {
            lgg lggVar2 = lgg.AD_PERSONALIZATION;
            lgcVar.b(lggVar2, lgb.REMOTE_DEFAULT);
            if (!ldoVar.k(str, lggVar2)) {
                return 1;
            }
        } else {
            lgcVar.b(lggVar, lgb.REMOTE_ENFORCED_DEFAULT);
            if (lgeVarC != lge.GRANTED) {
                return 1;
            }
        }
        return 0;
    }

    private final lbw aw() {
        if (this.K == null) {
            this.K = new lfs(this, this.j);
        }
        return this.K;
    }

    private final liq ax(liq liqVar, String str) {
        A();
        D();
        aihf aihfVarCreateBuilder = liq.a.createBuilder();
        aT().k.b("[sgtm] Processing Google Signal, sgtmJoinId:", str);
        aihfVarCreateBuilder.copyOnWrite();
        liq liqVar2 = (liq) aihfVarCreateBuilder.instance;
        str.getClass();
        liqVar2.b |= 1;
        liqVar2.d = str;
        for (lir lirVar : liqVar.c) {
            aihf aihfVarCreateBuilder2 = lir.a.createBuilder();
            String str2 = lirVar.I;
            aihfVarCreateBuilder2.copyOnWrite();
            lir lirVar2 = (lir) aihfVarCreateBuilder2.instance;
            str2.getClass();
            lirVar2.b |= Integer.MIN_VALUE;
            lirVar2.I = str2;
            int i = lirVar.Y;
            aihfVarCreateBuilder2.copyOnWrite();
            lir lirVar3 = (lir) aihfVarCreateBuilder2.instance;
            lirVar3.c |= 8388608;
            lirVar3.Y = i;
            aihfVarCreateBuilder.bi(aihfVarCreateBuilder2);
        }
        return (liq) aihfVarCreateBuilder.build();
    }

    private final liq ay(String str, liq liqVar, String str2) {
        A();
        D();
        aihf aihfVarCreateBuilder = liq.a.createBuilder(liqVar);
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            liq liqVar2 = (liq) aihfVarCreateBuilder.instance;
            str2.getClass();
            liqVar2.b |= 1;
            liqVar2.d = str2;
        }
        String strG = o().g(str);
        if (!TextUtils.isEmpty(strG)) {
            aihfVarCreateBuilder.copyOnWrite();
            liq liqVar3 = (liq) aihfVarCreateBuilder.instance;
            strG.getClass();
            liqVar3.b |= 2;
            liqVar3.e = strG;
        }
        ArrayList arrayList = new ArrayList();
        for (lir lirVar : liqVar.c) {
            lir lirVar2 = lir.a;
            aihf aihfVarCreateBuilder2 = lirVar2.createBuilder(lirVar);
            aihfVarCreateBuilder2.copyOnWrite();
            lir lirVar3 = (lir) aihfVarCreateBuilder2.instance;
            lirVar3.b &= Alert.DURATION_SHOW_INDEFINITELY;
            lirVar3.I = lirVar2.I;
            arrayList.add((lir) aihfVarCreateBuilder2.build());
        }
        aihfVarCreateBuilder.copyOnWrite();
        ((liq) aihfVarCreateBuilder.instance).c = liq.emptyProtobufList();
        aihfVarCreateBuilder.G(arrayList);
        aT().k.b("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str2) ? "null" : ((liq) aihfVarCreateBuilder.instance).d);
        return (liq) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    private final Boolean az(lbd lbdVar) {
        Boolean bool;
        try {
            if (lbdVar.c() != -2147483648L) {
                if (lbdVar.c() == kte.b(aS()).g(lbdVar.w(), 0).versionCode) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
            } else {
                String str = kte.b(aS()).g(lbdVar.w(), 0).versionName;
                String strZ = lbdVar.z();
                if (strZ == null || !strZ.equals(str)) {
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
            }
            return bool;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static lfv p(Context context) {
        kro.l(context.getApplicationContext());
        if (w == null) {
            synchronized (lfv.class) {
                if (w == null) {
                    w = new lfv(new lqa(context));
                }
            }
        }
        return w;
    }

    public final void A() {
        aU().o();
    }

    public final void B() {
        A();
        D();
        if (this.z) {
            return;
        }
        this.z = true;
        if (ag()) {
            FileChannel fileChannel = this.E;
            A();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                aT().c.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        aT().f.b("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    aT().c.b("Failed to read from channel", e);
                }
            }
            int iT = this.j.e().t();
            A();
            if (i > iT) {
                aT().c.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iT));
                return;
            }
            if (i < iT) {
                FileChannel fileChannel2 = this.E;
                A();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    aT().c.a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iT);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            aT().c.b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        aT().k.c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iT));
                        return;
                    } catch (IOException e2) {
                        aT().c.b("Failed to write to channel", e2);
                    }
                }
                aT().c.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iT));
            }
        }
    }

    public final void D() {
        if (!this.k.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void E() {
        A();
        if (this.B || this.p || this.C) {
            aT().k.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.B), Boolean.valueOf(this.p), Boolean.valueOf(this.C));
            return;
        }
        aT().k.a("Stopping uploading service(s)");
        List list = this.m;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            List list2 = this.m;
            kro.l(list2);
            list2.clear();
        }
    }

    final void F(lbd lbdVar) {
        A();
        if (TextUtils.isEmpty(lbdVar.B())) {
            String strW = lbdVar.w();
            kro.l(strW);
            K(strW, 204, null, null, null);
            return;
        }
        String strW2 = lbdVar.w();
        kro.l(strW2);
        aT().k.b("Fetching remote configuration", strW2);
        lie lieVarE = o().e(strW2);
        ldo ldoVarO = o();
        ldoVarO.o();
        String str = (String) ldoVarO.i.get(strW2);
        afv afvVar = null;
        if (lieVarE != null) {
            if (!TextUtils.isEmpty(str)) {
                afv afvVar2 = new afv();
                afvVar2.put("If-Modified-Since", str);
                afvVar = afvVar2;
            }
            ldo ldoVarO2 = o();
            ldoVarO2.o();
            String str2 = (String) ldoVarO2.j.get(strW2);
            if (!TextUtils.isEmpty(str2)) {
                if (afvVar == null) {
                    afvVar = new afv();
                }
                afvVar.put("If-None-Match", str2);
            }
        }
        this.B = true;
        l().a(lbdVar, afvVar, new ldb() { // from class: lfq
            @Override // defpackage.ldb
            public final void a(String str3, int i, Throwable th, byte[] bArr, Map map) {
                this.a.K(str3, i, th, bArr, map);
            }
        });
    }

    final void G(lbg lbgVar, long j) {
        lgp lgpVarV = v();
        String str = lbgVar.a;
        kro.l(str);
        lbd lbdVarH = lgpVarV.h(str);
        if (lbdVarH != null) {
            r();
            if (lga.aD(lbgVar.b, lbdVarH.B())) {
                aT().f.b("New GMP App Id passed in. Removing cached database data. appId", lcz.a(lbdVarH.w()));
                lgp lgpVarV2 = v();
                String strW = lbdVarH.w();
                lgpVarV2.w();
                lgpVarV2.o();
                kro.i(strW);
                try {
                    SQLiteDatabase sQLiteDatabaseE = lgpVarV2.e();
                    String[] strArr = {strW};
                    int iDelete = sQLiteDatabaseE.delete("events", "app_id=?", strArr) + sQLiteDatabaseE.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseE.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseE.delete("apps", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseE.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseE.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseE.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseE.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseE.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseE.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseE.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete > 0) {
                        lgpVarV2.aT().k.c("Deleted application data. app, records", strW, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e) {
                    lgpVarV2.aT().c.c("Error deleting application data. appId, error", lcz.a(strW), e);
                }
                lbdVarH = null;
            }
        }
        if (lbdVarH != null) {
            boolean z = (lbdVarH.c() == -2147483648L || lbdVarH.c() == lbgVar.j) ? false : true;
            String strZ = lbdVarH.z();
            if (z || ((lbdVarH.c() != -2147483648L || strZ == null || strZ.equals(lbgVar.c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strZ);
                J(new lcd("_au", new lcc(bundle), "auto", j, 0L), lbgVar);
            }
        }
    }

    final void H(lcd lcdVar, lbg lbgVar) {
        List<lbq> listA;
        List listA2;
        List<lbq> listA3;
        long j;
        String str;
        kro.l(lbgVar);
        String str2 = lbgVar.a;
        kro.i(str2);
        A();
        D();
        long j2 = lcdVar.d;
        long j3 = lcdVar.e;
        lda ldaVarB = lda.b(lcdVar);
        A();
        lhf lhfVar = this.I;
        if (lhfVar == null || (str = this.J) == null || !str.equals(str2)) {
            lhfVar = null;
        }
        lga.N(lhfVar, ldaVarB.e, false);
        lcd lcdVarA = ldaVarB.a();
        q();
        if (lfx.ab(lbgVar)) {
            if (!lbgVar.h) {
                e(lbgVar);
                return;
            }
            List list = lbgVar.r;
            if (list != null) {
                String str3 = lcdVarA.a;
                if (!list.contains(str3)) {
                    aT().j.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, lcdVarA.c);
                    if (i().F(str2, lcl.aR) && i().F(str2, lcl.aV)) {
                        v().T(str2, "event_dropped_count", "not_safelisted", 1L, 0L);
                        return;
                    }
                    return;
                }
                Bundle bundleA = lcdVarA.b.a();
                bundleA.putLong("ga_safelisted", 1L);
                lcdVarA = new lcd(str3, new lcc(bundleA), lcdVarA.c, lcdVarA.d, lcdVarA.e);
            }
            v().F();
            try {
                String str4 = lcdVarA.a;
                if ("_s".equals(str4) && !v().ad(str2, "_s") && lcdVarA.b.b("_sid").longValue() != 0) {
                    if (v().ad(str2, "_f") || v().ad(str2, "_v")) {
                        v().E(str2, null, "_sid", d(str2, lcdVarA));
                    } else {
                        lgp lgpVarV = v();
                        aV();
                        lgpVarV.E(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", d(str2, lcdVarA));
                    }
                }
                lgp lgpVarV2 = v();
                kro.i(str2);
                lgpVarV2.o();
                lgpVarV2.w();
                int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i < 0) {
                    lgpVarV2.aT().f.c("Invalid time querying timed out conditional properties", lcz.a(str2), Long.valueOf(j2));
                    listA = Collections.EMPTY_LIST;
                } else {
                    listA = lgpVarV2.A("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (lbq lbqVar : listA) {
                    if (lbqVar != null) {
                        aT().k.d("User property timed out", lbqVar.a, k().e(lbqVar.c.b), lbqVar.c.a());
                        lcd lcdVar2 = lbqVar.g;
                        if (lcdVar2 != null) {
                            j = j2;
                            ac(new lcd(lcdVar2, j, j3), lbgVar);
                        } else {
                            j = j2;
                        }
                        v().aj(str2, lbqVar.c.b);
                        j2 = j;
                    }
                }
                long j4 = j2;
                lgp lgpVarV3 = v();
                kro.i(str2);
                lgpVarV3.o();
                lgpVarV3.w();
                if (i < 0) {
                    lgpVarV3.aT().f.c("Invalid time querying expired conditional properties", lcz.a(str2), Long.valueOf(j4));
                    listA2 = Collections.EMPTY_LIST;
                } else {
                    listA2 = lgpVarV3.A("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j4)});
                }
                ArrayList arrayList = new ArrayList(listA2.size());
                Iterator it = listA2.iterator();
                while (it.hasNext()) {
                    lbq lbqVar2 = (lbq) it.next();
                    if (lbqVar2 != null) {
                        Iterator it2 = it;
                        int i2 = i;
                        aT().k.d("User property expired", lbqVar2.a, k().e(lbqVar2.c.b), lbqVar2.c.a());
                        v().W(str2, lbqVar2.c.b);
                        lcd lcdVar3 = lbqVar2.k;
                        if (lcdVar3 != null) {
                            arrayList.add(lcdVar3);
                        }
                        v().aj(str2, lbqVar2.c.b);
                        it = it2;
                        i = i2;
                    }
                }
                int i3 = i;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ac(new lcd((lcd) it3.next(), j4, j3), lbgVar);
                    j3 = j3;
                }
                long j5 = j3;
                lgp lgpVarV4 = v();
                kro.i(str2);
                kro.i(str4);
                lgpVarV4.o();
                lgpVarV4.w();
                if (i3 < 0) {
                    lgpVarV4.aT().f.d("Invalid time querying triggered conditional properties", lcz.a(str2), lgpVarV4.I().c(str4), Long.valueOf(j4));
                    listA3 = Collections.EMPTY_LIST;
                } else {
                    listA3 = lgpVarV4.A("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j4)});
                }
                ArrayList arrayList2 = new ArrayList(listA3.size());
                for (lbq lbqVar3 : listA3) {
                    if (lbqVar3 != null) {
                        lfy lfyVar = lbqVar3.c;
                        String str5 = lbqVar3.a;
                        kro.l(str5);
                        long j6 = j4;
                        String str6 = lbqVar3.b;
                        String str7 = lfyVar.b;
                        Object objA = lfyVar.a();
                        kro.l(objA);
                        aaqp aaqpVar = new aaqp(str5, str6, str7, j6, objA);
                        j4 = j6;
                        if (v().aq(aaqpVar)) {
                            aT().k.d("User property triggered", lbqVar3.a, k().e((String) aaqpVar.d), aaqpVar.c);
                        } else {
                            aT().c.d("Too many active user properties, ignoring", lcz.a(lbqVar3.a), k().e((String) aaqpVar.d), aaqpVar.c);
                        }
                        lcd lcdVar4 = lbqVar3.i;
                        if (lcdVar4 != null) {
                            arrayList2.add(lcdVar4);
                        }
                        lbqVar3.c = new lfy(aaqpVar);
                        lbqVar3.e = true;
                        v().af(lbqVar3);
                    }
                }
                ac(lcdVarA, lbgVar);
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    long j7 = j5;
                    ac(new lcd((lcd) it4.next(), j4, j7), lbgVar);
                    j5 = j7;
                }
                v().Y();
            } finally {
                v().S();
            }
        }
    }

    public final void I(lcd lcdVar, String str) {
        lbd lbdVarH = v().h(str);
        if (lbdVarH == null || TextUtils.isEmpty(lbdVarH.z())) {
            aT().j.b("No app data available; dropping event", str);
            return;
        }
        Boolean boolAz = az(lbdVarH);
        if (boolAz == null) {
            if (!"_ui".equals(lcdVar.a)) {
                aT().f.b("Could not find package. appId", lcz.a(str));
            }
        } else if (!boolAz.booleanValue()) {
            aT().c.b("App version does not match; dropping event. appId", lcz.a(str));
            return;
        }
        J(lcdVar, new lbg(str, lbdVarH.B(), lbdVarH.z(), lbdVarH.c(), lbdVarH.y(), lbdVarH.i(), lbdVarH.f(), (String) null, lbdVarH.au(), false, lbdVarH.A(), 0L, 0, lbdVarH.as(), false, lbdVarH.s(), lbdVarH.g(), lbdVarH.G(), u(str).l(), "", (String) null, lbdVarH.aw(), lbdVarH.r(), u(str).d, t(str).c, lbdVarH.a(), lbdVarH.d(), lbdVarH.F(), lbdVarH.D(), 0L, lbdVarH.b(), 0L, lbdVarH.o(), lbdVarH.at(), lbdVarH.q()));
    }

    final void J(lcd lcdVar, lbg lbgVar) {
        String str = lbgVar.a;
        kro.i(str);
        lda ldaVarB = lda.b(lcdVar);
        r().O(ldaVarB.e, v().g(str));
        r().Q(ldaVarB, i().f(str));
        lcd lcdVarA = ldaVarB.a();
        if (!i().F(null, lcl.aP) && "_cmp".equals(lcdVarA.a)) {
            lcc lccVar = lcdVarA.b;
            if ("referrer API v2".equals(lccVar.d("_cis"))) {
                String strD = lccVar.d("gclid");
                if (!TextUtils.isEmpty(strD)) {
                    Y(new lfy("_lgclid", lcdVarA.d, strD, "auto"), lbgVar);
                }
            }
        }
        H(lcdVarA, lbgVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[PHI: r9
      0x0045: PHI (r9v11 int) = (r9v2 int), (r9v0 int) binds: [B:12:0x0041, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002c, B:16:0x0048, B:51:0x0150, B:20:0x0060, B:25:0x00b0, B:24:0x00a2, B:26:0x00b5, B:29:0x00cb, B:36:0x00eb, B:38:0x00fe, B:40:0x0119, B:42:0x0123, B:44:0x0129, B:45:0x012d, B:47:0x0137, B:49:0x0145, B:50:0x014d, B:39:0x010a, B:32:0x00d7, B:34:0x00e1), top: B:61:0x002c, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x010a A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002c, B:16:0x0048, B:51:0x0150, B:20:0x0060, B:25:0x00b0, B:24:0x00a2, B:26:0x00b5, B:29:0x00cb, B:36:0x00eb, B:38:0x00fe, B:40:0x0119, B:42:0x0123, B:44:0x0129, B:45:0x012d, B:47:0x0137, B:49:0x0145, B:50:0x014d, B:39:0x010a, B:32:0x00d7, B:34:0x00e1), top: B:61:0x002c, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012d A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002c, B:16:0x0048, B:51:0x0150, B:20:0x0060, B:25:0x00b0, B:24:0x00a2, B:26:0x00b5, B:29:0x00cb, B:36:0x00eb, B:38:0x00fe, B:40:0x0119, B:42:0x0123, B:44:0x0129, B:45:0x012d, B:47:0x0137, B:49:0x0145, B:50:0x014d, B:39:0x010a, B:32:0x00d7, B:34:0x00e1), top: B:61:0x002c, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0137 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002c, B:16:0x0048, B:51:0x0150, B:20:0x0060, B:25:0x00b0, B:24:0x00a2, B:26:0x00b5, B:29:0x00cb, B:36:0x00eb, B:38:0x00fe, B:40:0x0119, B:42:0x0123, B:44:0x0129, B:45:0x012d, B:47:0x0137, B:49:0x0145, B:50:0x014d, B:39:0x010a, B:32:0x00d7, B:34:0x00e1), top: B:61:0x002c, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x014d A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002c, B:16:0x0048, B:51:0x0150, B:20:0x0060, B:25:0x00b0, B:24:0x00a2, B:26:0x00b5, B:29:0x00cb, B:36:0x00eb, B:38:0x00fe, B:40:0x0119, B:42:0x0123, B:44:0x0129, B:45:0x012d, B:47:0x0137, B:49:0x0145, B:50:0x014d, B:39:0x010a, B:32:0x00d7, B:34:0x00e1), top: B:61:0x002c, outer: #1 }] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (o().q(r8, null, null, null) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void K(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.K(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f6 A[Catch: SQLiteException -> 0x0309, all -> 0x0335, TryCatch #2 {SQLiteException -> 0x0309, blocks: (B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131), top: B:115:0x0106, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0194 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1 A[Catch: all -> 0x0335, PHI: r0
      0x00f1: PHI (r0v2 int) = (r0v0 int), (r0v38 int) binds: [B:7:0x002b, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0335, blocks: (B:4:0x0013, B:6:0x0018, B:14:0x0038, B:19:0x0080, B:21:0x0090, B:23:0x0096, B:25:0x00bd, B:26:0x00c8, B:29:0x00d9, B:30:0x00e4, B:31:0x00e9, B:32:0x00f0, B:18:0x0072, B:33:0x00f1, B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131, B:106:0x030a), top: B:116:0x0013, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0120 A[Catch: SQLiteException -> 0x0309, all -> 0x0335, TryCatch #2 {SQLiteException -> 0x0309, blocks: (B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131), top: B:115:0x0106, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0131 A[Catch: SQLiteException -> 0x0309, all -> 0x0335, TryCatch #2 {SQLiteException -> 0x0309, blocks: (B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131), top: B:115:0x0106, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0151 A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x015b A[Catch: all -> 0x0300, LOOP:0: B:44:0x0155->B:46:0x015b, LOOP_END, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x018b A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x019a A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0262 A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0282 A[Catch: all -> 0x0300, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x029b A[Catch: all -> 0x0300, TRY_LEAVE, TryCatch #0 {all -> 0x0300, blocks: (B:41:0x0143, B:43:0x0151, B:44:0x0155, B:46:0x015b, B:77:0x0291, B:78:0x0295, B:80:0x029b, B:81:0x02a2, B:84:0x02af, B:86:0x02b3, B:88:0x02b9, B:89:0x02ba, B:48:0x018b, B:49:0x0194, B:51:0x019a, B:53:0x01af, B:57:0x01d2, B:59:0x01da, B:60:0x01e4, B:61:0x01e8, B:63:0x01ee, B:65:0x0203, B:67:0x0231, B:71:0x0241, B:72:0x0247, B:74:0x0262, B:76:0x0282), top: B:112:0x0143, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02d4 A[Catch: SQLiteException -> 0x0309, all -> 0x0335, TryCatch #2 {SQLiteException -> 0x0309, blocks: (B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131), top: B:115:0x0106, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02e2 A[Catch: SQLiteException -> 0x0309, all -> 0x0335, TryCatch #2 {SQLiteException -> 0x0309, blocks: (B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131), top: B:115:0x0106, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02ec A[Catch: SQLiteException -> 0x0309, all -> 0x0335, TryCatch #2 {SQLiteException -> 0x0309, blocks: (B:35:0x0106, B:36:0x0114, B:38:0x0120, B:40:0x013c, B:90:0x02c1, B:92:0x02d4, B:94:0x02de, B:101:0x02fb, B:95:0x02e2, B:97:0x02ec, B:99:0x02f2, B:100:0x02f6, B:103:0x0301, B:104:0x0308, B:39:0x0131), top: B:115:0x0106, outer: #3 }] */
    final void L(boolean z, int i, Throwable th, byte[] bArr, String str, List list, Map map) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map2;
        Iterator it;
        Iterator it2;
        String str2;
        List listAi;
        long j;
        liq liqVar;
        sdo sdoVar;
        Object obj;
        liq liqVar2;
        sdo sdoVar2;
        Object obj2;
        Iterator it3;
        int i2 = i;
        String str3 = str;
        A();
        D();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.p = false;
                E();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        q().B(map);
        List<Long> list2 = this.q;
        kro.l(list2);
        this.q = null;
        if (z) {
            if (i2 == 200) {
                if (th != null) {
                    lcx lcxVar = aT().k;
                    numValueOf = Integer.valueOf(i2);
                    lcxVar.c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                    if (z) {
                        ldi ldiVar = this.g.d;
                        aV();
                        ldiVar.b(System.currentTimeMillis());
                    }
                    this.g.e.b(0L);
                    V();
                    if (z) {
                        aT().k.c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        aT().k.a("Purged empty bundles");
                    }
                    v().F();
                    if (i().F(str3, lcl.O)) {
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            Pair pair = (Pair) it3.next();
                            liq liqVar3 = (liq) pair.first;
                            sdo sdoVar3 = (sdo) pair.second;
                            v().a(str3, liqVar3, (String) sdoVar3.a, sdoVar3.o(), (lho) sdoVar3.d, null);
                            str3 = str;
                        }
                        str2 = str;
                    } else {
                        map2 = new HashMap();
                        it = list.iterator();
                        while (it.hasNext()) {
                            Pair pair2 = (Pair) it.next();
                            liqVar2 = (liq) pair2.first;
                            sdoVar2 = (sdo) pair2.second;
                            obj2 = sdoVar2.d;
                            if (obj2 != lho.SGTM_CLIENT) {
                                long jA = v().a(str, liqVar2, (String) sdoVar2.a, sdoVar2.o(), (lho) obj2, null);
                                if (obj2 != lho.GOOGLE_SIGNAL_PENDING) {
                                }
                            }
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            Pair pair3 = (Pair) it2.next();
                            liqVar = (liq) pair3.first;
                            sdoVar = (sdo) pair3.second;
                            obj = sdoVar.d;
                            if (obj == lho.SGTM_CLIENT) {
                                long jA2 = v().a(str, liqVar, (String) sdoVar.a, sdoVar.o(), (lho) obj, (Long) map2.get(liqVar.d));
                                if (!i().F(null, lcl.aR)) {
                                }
                            }
                        }
                        str2 = str;
                        listAi = v().ai(str2, lfm.a(lho.SGTM_CLIENT), 1);
                        if (!listAi.isEmpty()) {
                            j = ((lfw) listAi.get(0)).g;
                            aV();
                            if (System.currentTimeMillis() > ((Long) lcl.Q.b(null)).longValue() + j) {
                                aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str2, Long.valueOf(j));
                            }
                        }
                    }
                    for (Long l : list2) {
                        v().O(l.longValue());
                    }
                    v().Y();
                    v().S();
                    this.r = null;
                    if (!l().c()) {
                        if (l().c()) {
                            this.s = -1L;
                            V();
                        } else {
                            this.s = -1L;
                            V();
                        }
                    } else if (l().c()) {
                        this.s = -1L;
                        V();
                    } else {
                        this.s = -1L;
                        V();
                    }
                    this.l = 0L;
                }
            } else if (i2 == 204) {
                i2 = 204;
                if (th != null) {
                    lcx lcxVar2 = aT().k;
                    numValueOf = Integer.valueOf(i2);
                    lcxVar2.c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                    if (z) {
                        ldi ldiVar2 = this.g.d;
                        aV();
                        ldiVar2.b(System.currentTimeMillis());
                    }
                    this.g.e.b(0L);
                    V();
                    if (z) {
                        aT().k.c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        aT().k.a("Purged empty bundles");
                    }
                    v().F();
                    if (i().F(str3, lcl.O)) {
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            Pair pair4 = (Pair) it3.next();
                            liq liqVar4 = (liq) pair4.first;
                            sdo sdoVar4 = (sdo) pair4.second;
                            v().a(str3, liqVar4, (String) sdoVar4.a, sdoVar4.o(), (lho) sdoVar4.d, null);
                            str3 = str;
                        }
                        str2 = str;
                    } else {
                        map2 = new HashMap();
                        it = list.iterator();
                        while (it.hasNext()) {
                            Pair pair5 = (Pair) it.next();
                            liqVar2 = (liq) pair5.first;
                            sdoVar2 = (sdo) pair5.second;
                            obj2 = sdoVar2.d;
                            if (obj2 != lho.SGTM_CLIENT) {
                                long jA3 = v().a(str, liqVar2, (String) sdoVar2.a, sdoVar2.o(), (lho) obj2, null);
                                if (obj2 != lho.GOOGLE_SIGNAL_PENDING) {
                                }
                            }
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            Pair pair6 = (Pair) it2.next();
                            liqVar = (liq) pair6.first;
                            sdoVar = (sdo) pair6.second;
                            obj = sdoVar.d;
                            if (obj == lho.SGTM_CLIENT) {
                                long jA4 = v().a(str, liqVar, (String) sdoVar.a, sdoVar.o(), (lho) obj, (Long) map2.get(liqVar.d));
                                if (!i().F(null, lcl.aR)) {
                                }
                            }
                        }
                        str2 = str;
                        listAi = v().ai(str2, lfm.a(lho.SGTM_CLIENT), 1);
                        if (!listAi.isEmpty()) {
                            j = ((lfw) listAi.get(0)).g;
                            aV();
                            if (System.currentTimeMillis() > ((Long) lcl.Q.b(null)).longValue() + j) {
                                aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str2, Long.valueOf(j));
                            }
                        }
                    }
                    while (r2.hasNext()) {
                        v().O(l.longValue());
                    }
                    v().Y();
                    v().S();
                    this.r = null;
                    if (!l().c()) {
                        if (l().c()) {
                            this.s = -1L;
                            V();
                        } else {
                            this.s = -1L;
                            V();
                        }
                    } else if (l().c()) {
                        this.s = -1L;
                        V();
                    } else {
                        this.s = -1L;
                        V();
                    }
                    this.l = 0L;
                }
            }
            String str4 = new String(bArr2, StandardCharsets.UTF_8);
            aT().h.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str4.substring(0, Math.min(32, str4.length())));
            ldi ldiVar3 = this.g.e;
            aV();
            ldiVar3.b(System.currentTimeMillis());
            if (i2 == 503 || i2 == 429) {
                ldi ldiVar4 = this.g.c;
                aV();
                ldiVar4.b(System.currentTimeMillis());
            }
            lgp lgpVarV = v();
            lgpVarV.o();
            lgpVarV.w();
            if (list2.size() == 0) {
                throw new IllegalArgumentException("Given Integer is zero");
            }
            if (lgpVarV.ae()) {
                String str5 = "(" + TextUtils.join(",", list2) + ')';
                if (lgpVarV.c(a.bT(str5, "SELECT COUNT(1) FROM queue WHERE rowid IN ", " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                    lgpVarV.aT().f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
                }
                try {
                    lgpVarV.e().execSQL(a.bT(str5, "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ", " AND (retry_count IS NULL OR retry_count < 2147483647)"));
                } catch (SQLiteException e) {
                    lgpVarV.aT().c.b("Error incrementing retry count. error", e);
                }
            }
            V();
        } else {
            lcx lcxVar3 = aT().k;
            numValueOf = Integer.valueOf(i2);
            lcxVar3.c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
            if (z) {
                try {
                    ldi ldiVar5 = this.g.d;
                    aV();
                    ldiVar5.b(System.currentTimeMillis());
                } catch (SQLiteException e2) {
                    aT().c.b("Database error while trying to delete uploaded bundles", e2);
                    aV();
                    this.l = SystemClock.elapsedRealtime();
                    aT().k.b("Disable upload, time", Long.valueOf(this.l));
                }
            }
            this.g.e.b(0L);
            V();
            if (z) {
                aT().k.c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
            } else {
                aT().k.a("Purged empty bundles");
            }
            v().F();
            try {
                if (i().F(str3, lcl.O)) {
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        Pair pair7 = (Pair) it3.next();
                        liq liqVar5 = (liq) pair7.first;
                        sdo sdoVar5 = (sdo) pair7.second;
                        v().a(str3, liqVar5, (String) sdoVar5.a, sdoVar5.o(), (lho) sdoVar5.d, null);
                        str3 = str;
                    }
                    str2 = str;
                } else {
                    map2 = new HashMap();
                    it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair8 = (Pair) it.next();
                        liqVar2 = (liq) pair8.first;
                        sdoVar2 = (sdo) pair8.second;
                        obj2 = sdoVar2.d;
                        if (obj2 != lho.SGTM_CLIENT) {
                            long jA5 = v().a(str, liqVar2, (String) sdoVar2.a, sdoVar2.o(), (lho) obj2, null);
                            if (obj2 != lho.GOOGLE_SIGNAL_PENDING && jA5 != -1 && !liqVar2.d.isEmpty()) {
                                map2.put(liqVar2.d, Long.valueOf(jA5));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair9 = (Pair) it2.next();
                        liqVar = (liq) pair9.first;
                        sdoVar = (sdo) pair9.second;
                        obj = sdoVar.d;
                        if (obj == lho.SGTM_CLIENT) {
                            long jA6 = v().a(str, liqVar, (String) sdoVar.a, sdoVar.o(), (lho) obj, (Long) map2.get(liqVar.d));
                            if (!i().F(null, lcl.aR) && i().F(null, lcl.bb) && jA6 != -1) {
                                aB(str, "queued_batches");
                            }
                        }
                    }
                    str2 = str;
                    listAi = v().ai(str2, lfm.a(lho.SGTM_CLIENT), 1);
                    if (!listAi.isEmpty()) {
                        j = ((lfw) listAi.get(0)).g;
                        aV();
                        if (System.currentTimeMillis() > ((Long) lcl.Q.b(null)).longValue() + j) {
                            aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str2, Long.valueOf(j));
                        }
                    }
                }
                while (r2.hasNext()) {
                    try {
                        v().O(l.longValue());
                    } catch (SQLiteException e3) {
                        List list3 = this.r;
                        if (list3 == null || !list3.contains(l)) {
                            throw e3;
                        }
                    }
                }
                v().Y();
                v().S();
                this.r = null;
                if (!l().c() && v().ac(str2)) {
                    ab(str2);
                } else if (l().c() || !aC()) {
                    this.s = -1L;
                    V();
                } else {
                    Z();
                }
                this.l = 0L;
            } catch (Throwable th3) {
                v().S();
                throw th3;
            }
        }
        this.p = false;
        E();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d1 A[Catch: SQLiteException -> 0x0346, all -> 0x0448, TRY_ENTER, TryCatch #4 {all -> 0x0448, blocks: (B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:191:0x02bb, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02f2 A[Catch: SQLiteException -> 0x0346, all -> 0x0448, TRY_LEAVE, TryCatch #4 {all -> 0x0448, blocks: (B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:191:0x02bb, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0302  */
    /* JADX WARN: Code duplicated, block: B:105:0x0305  */
    /* JADX WARN: Code duplicated, block: B:108:0x032b A[Catch: SQLiteException -> 0x0344, all -> 0x0448, TRY_LEAVE, TryCatch #4 {all -> 0x0448, blocks: (B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:191:0x02bb, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0340 A[Catch: SQLiteException -> 0x0344, all -> 0x0448, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0448, blocks: (B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:191:0x02bb, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x036b A[Catch: all -> 0x044f, TRY_LEAVE, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x03a1 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x03de  */
    /* JADX WARN: Code duplicated, block: B:155:0x0401 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0409 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x040f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0417 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0420 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0454 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0488 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x04ad A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x04b4 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:164:0x0420, B:165:0x0423, B:178:0x04d2, B:147:0x03da, B:150:0x03e0, B:155:0x0401, B:157:0x0409, B:159:0x0411, B:161:0x0417, B:153:0x03ef, B:167:0x0449, B:168:0x044e, B:171:0x0454, B:173:0x0488, B:174:0x048b, B:175:0x04ad, B:177:0x04b4, B:97:0x02bb, B:100:0x02d1, B:102:0x02f2, B:106:0x0307, B:108:0x032b, B:111:0x0340, B:120:0x034d), top: B:187:0x012a, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0103 A[Catch: all -> 0x04e3, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: all -> 0x04e3, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0113 A[Catch: all -> 0x04e3, TRY_ENTER, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x011f A[Catch: all -> 0x04e3, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012c A[Catch: all -> 0x04e3, TRY_LEAVE, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0143 A[Catch: all -> 0x04e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0167 A[Catch: all -> 0x044f, TRY_LEAVE, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0176 A[Catch: all -> 0x04e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x04e3, blocks: (B:23:0x00a1, B:25:0x00af, B:42:0x00f6, B:44:0x0103, B:46:0x010c, B:49:0x0113, B:52:0x012c, B:55:0x0143, B:61:0x0176, B:50:0x011f, B:45:0x0109, B:30:0x00c2, B:34:0x00d2, B:36:0x00e1, B:38:0x00eb, B:41:0x00f3), top: B:188:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0242 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0252 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x028d A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:57:0x0161, B:59:0x0167, B:91:0x0265, B:93:0x028d, B:94:0x0290, B:109:0x033a, B:122:0x0361, B:124:0x036b, B:127:0x0380, B:132:0x03a1, B:134:0x03a9, B:138:0x03b5, B:141:0x03c1, B:145:0x03cd, B:130:0x038f, B:121:0x035c, B:64:0x018b, B:66:0x01b6, B:67:0x01c9, B:69:0x01d2, B:71:0x01d8, B:73:0x01e2, B:75:0x01ec, B:77:0x01f2, B:79:0x01f8, B:80:0x01fd, B:84:0x0219, B:87:0x021e, B:88:0x0232, B:89:0x0242, B:90:0x0252), top: B:199:0x0161, inners: #5, #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [lfv] */
    /* JADX WARN: Type inference failed for: r7v12, types: [lfv] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [lfv] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [lfv] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    final void M(lbg lbgVar) throws Throwable {
        long j;
        long j2;
        lca lcaVarJ;
        boolean z;
        lfv lfvVar;
        long j3;
        ?? r7;
        long j4;
        Bundle bundle;
        long j5;
        elq elqVar;
        Object obj;
        Intent intent;
        String str;
        PackageManager packageManager;
        String str2;
        List<ResolveInfo> listQueryIntentServices;
        Bundle bundle2;
        long j6;
        String str3;
        lgp lgpVarV;
        SQLiteDatabase sQLiteDatabaseE;
        String str4;
        long jD;
        long j7;
        PackageInfo packageInfoG;
        ApplicationInfo applicationInfoF;
        long j8;
        boolean z2;
        long j9;
        ContentValues contentValues;
        ContentValues contentValues2;
        ?? r8 = "_uwa";
        A();
        D();
        kro.l(lbgVar);
        String str5 = lbgVar.a;
        kro.i(str5);
        if (!ah(lbgVar)) {
            return;
        }
        lbd lbdVarH = v().h(str5);
        if (lbdVarH != null && TextUtils.isEmpty(lbdVarH.B()) && !TextUtils.isEmpty(lbgVar.b)) {
            lbdVarH.R(0L);
            v().an(lbdVarH, false);
            ldo ldoVarO = o();
            ldoVarO.o();
            ldoVarO.f.remove(str5);
        }
        if (!lbgVar.h) {
            e(lbgVar);
            return;
        }
        long jCurrentTimeMillis = lbgVar.l;
        long jElapsedRealtime = lbgVar.F;
        if (jCurrentTimeMillis == 0) {
            aV();
            jCurrentTimeMillis = System.currentTimeMillis();
            aV();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        long j10 = jElapsedRealtime;
        long j11 = jCurrentTimeMillis;
        int i = lbgVar.m;
        if (i != 0 && i != 1) {
            aT().f.c("Incorrect app type, assuming installed app. appId, appType", lcz.a(str5), Integer.valueOf(i));
            i = 0;
        }
        v().F();
        try {
            aaqp aaqpVarAp = v().ap(str5, "_npa");
            Boolean boolAG = aG(lbgVar);
            try {
                if (aaqpVarAp != null) {
                    j = 1;
                    if (!"auto".equals(aaqpVarAp.e)) {
                        j2 = j11;
                    }
                    if (i().F(null, lcl.aO)) {
                        G(lbgVar, lbgVar.D);
                    } else {
                        G(lbgVar, j2);
                    }
                    e(lbgVar);
                    if (i == 0) {
                        lcaVarJ = v().j("events", str5, "_f");
                        z = false;
                    } else {
                        lcaVarJ = v().j("events", str5, "_v");
                        z = true;
                    }
                    if (lcaVarJ == null) {
                        j4 = ((j2 / 3600000) + j) * 3600000;
                        if (z) {
                            lfv lfvVar2 = this;
                            long j12 = j2;
                            lfvVar2.Y(new lfy("_fvt", j12, Long.valueOf(j4), "auto"), lbgVar);
                            lfvVar2.A();
                            lfvVar2.D();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (lbgVar.o) {
                                bundle.putLong("_dac", 1L);
                            }
                            lfvVar2.aV();
                            bundle.putLong("_elt", System.currentTimeMillis());
                            lfvVar2.J(new lcd("_v", new lcc(bundle), "auto", j12, j10), lbgVar);
                            r7 = lfvVar2;
                        } else {
                            Long lValueOf = Long.valueOf(j4);
                            j5 = j2;
                            Y(new lfy("_fot", j5, lValueOf, "auto"), lbgVar);
                            A();
                            elqVar = this.v;
                            kro.l(elqVar);
                            if (str5 != null) {
                                try {
                                    if (str5.isEmpty()) {
                                        str2 = "first_open_count";
                                        str = "_elt";
                                        ((ldr) elqVar.a).aT().g.a("Install Referrer Reporter was called with invalid app package name");
                                    } else {
                                        obj = elqVar.a;
                                        ((ldr) obj).r();
                                        if (elqVar.i()) {
                                            ldm ldmVar = new ldm(elqVar, str5);
                                            ((ldr) obj).r();
                                            str = "_elt";
                                            intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            Context context = ((ldr) obj).a;
                                            packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                ((ldr) obj).aT().g.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                                str2 = "first_open_count";
                                            } else {
                                                str2 = "first_open_count";
                                                listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (listQueryIntentServices != null || listQueryIntentServices.isEmpty()) {
                                                    ((ldr) elqVar.a).aT().i.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ResolveInfo resolveInfo = listQueryIntentServices.get(0);
                                                    if (resolveInfo.serviceInfo != null) {
                                                        String str6 = resolveInfo.serviceInfo.packageName;
                                                        if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str6) && elqVar.i()) {
                                                            try {
                                                                ((ldr) obj).aT().k.b("Install Referrer Service is", ksp.a().c(context, new Intent(intent), ldmVar, 1) ? "available" : "not available");
                                                            } catch (RuntimeException e) {
                                                                ((ldr) elqVar.a).aT().c.b("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                            }
                                                        } else {
                                                            ((ldr) elqVar.a).aT().f.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            ((ldr) obj).aT().i.a("Install Referrer Reporter is not available");
                                            str2 = "first_open_count";
                                            str = "_elt";
                                        }
                                    }
                                    A();
                                    D();
                                    bundle2 = new Bundle();
                                    j6 = j;
                                    bundle2.putLong("_c", j6);
                                    bundle2.putLong("_r", j6);
                                    bundle2.putLong("_uwa", 0L);
                                    bundle2.putLong("_pfo", 0L);
                                    bundle2.putLong("_sys", 0L);
                                    bundle2.putLong("_sysu", 0L);
                                    bundle2.putLong("_et", j6);
                                    if (lbgVar.o) {
                                        bundle2.putLong("_dac", j6);
                                    }
                                    str3 = lbgVar.a;
                                    kro.l(str3);
                                    lgpVarV = v();
                                    kro.i(str3);
                                    lgpVarV.o();
                                    lgpVarV.w();
                                    kro.i(str3);
                                    kro.i(str2);
                                    lgpVarV.o();
                                    lgpVarV.w();
                                    sQLiteDatabaseE = lgpVarV.e();
                                    sQLiteDatabaseE.beginTransaction();
                                    str4 = str2;
                                    try {
                                        try {
                                            jD = lgpVarV.d(a.bT(str4, "select ", " from app2 where app_id=?"), new String[]{str3}, -1L);
                                            try {
                                                if (jD == -1) {
                                                    contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str3);
                                                    j9 = -1;
                                                    contentValues2.put(str4, (Integer) 0);
                                                    contentValues2.put("previous_install_count", (Integer) 0);
                                                    if (sQLiteDatabaseE.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                                                        lgpVarV.aT().c.c("Failed to insert column (got -1). appId", lcz.a(str3), str4);
                                                    } else {
                                                        jD = 0;
                                                    }
                                                    sQLiteDatabaseE.endTransaction();
                                                    j7 = j9;
                                                    if (aS().getPackageManager() == null) {
                                                        aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                                        r8 = this;
                                                    } else {
                                                        try {
                                                            packageInfoG = kte.b(aS()).g(str3, 0);
                                                        } catch (PackageManager.NameNotFoundException e2) {
                                                            aT().c.c("Package info is null, first open report might be inaccurate. appId", lcz.a(str3), e2);
                                                            packageInfoG = null;
                                                        }
                                                        if (packageInfoG != null || packageInfoG.firstInstallTime == 0) {
                                                            r8 = this;
                                                        } else {
                                                            if (packageInfoG.firstInstallTime == packageInfoG.lastUpdateTime) {
                                                                z2 = true;
                                                            } else if (j7 == 0) {
                                                                bundle2.putLong("_uwa", 1L);
                                                                z2 = false;
                                                                j7 = 0;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            lfv lfvVar3 = this;
                                                            lfvVar3.Y(new lfy("_fi", j5, Long.valueOf(true != z2 ? 0L : 1L), "auto"), lbgVar);
                                                            r8 = lfvVar3;
                                                        }
                                                        try {
                                                            applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                                        } catch (PackageManager.NameNotFoundException e3) {
                                                            r8.aT().c.c("Application info is null, first open report might be inaccurate. appId", lcz.a(str3), e3);
                                                            applicationInfoF = null;
                                                        }
                                                        if (applicationInfoF != null) {
                                                            if ((applicationInfoF.flags & 1) != 0) {
                                                                j8 = 1;
                                                                bundle2.putLong("_sys", 1L);
                                                            } else {
                                                                j8 = 1;
                                                            }
                                                            if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                                                bundle2.putLong("_sysu", j8);
                                                            }
                                                        }
                                                    }
                                                    if (j7 >= 0) {
                                                        bundle2.putLong("_pfo", j7);
                                                    }
                                                    r8.aV();
                                                    bundle2.putLong(str, System.currentTimeMillis());
                                                    r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                                    r7 = r8;
                                                } else {
                                                    j9 = -1;
                                                }
                                                contentValues = new ContentValues();
                                                contentValues.put("app_id", str3);
                                                contentValues.put(str4, Long.valueOf(jD + 1));
                                                if (sQLiteDatabaseE.update("app2", contentValues, "app_id = ?", new String[]{str3}) == 0) {
                                                    lgpVarV.aT().c.c("Failed to update column (got 0). appId", lcz.a(str3), str4);
                                                    sQLiteDatabaseE.endTransaction();
                                                    j7 = j9;
                                                    if (aS().getPackageManager() == null) {
                                                        aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                                        r8 = this;
                                                    } else {
                                                        packageInfoG = kte.b(aS()).g(str3, 0);
                                                        if (packageInfoG != null) {
                                                            r8 = this;
                                                        } else {
                                                            r8 = this;
                                                        }
                                                        applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                                        if (applicationInfoF != null) {
                                                            if ((applicationInfoF.flags & 1) != 0) {
                                                                j8 = 1;
                                                                bundle2.putLong("_sys", 1L);
                                                            } else {
                                                                j8 = 1;
                                                            }
                                                            if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                                                bundle2.putLong("_sysu", j8);
                                                            }
                                                        }
                                                    }
                                                    if (j7 >= 0) {
                                                        bundle2.putLong("_pfo", j7);
                                                    }
                                                    r8.aV();
                                                    bundle2.putLong(str, System.currentTimeMillis());
                                                    r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                                    r7 = r8;
                                                } else {
                                                    sQLiteDatabaseE.setTransactionSuccessful();
                                                    sQLiteDatabaseE.endTransaction();
                                                    j7 = jD;
                                                    if (aS().getPackageManager() == null) {
                                                        aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                                        r8 = this;
                                                    } else {
                                                        packageInfoG = kte.b(aS()).g(str3, 0);
                                                        if (packageInfoG != null) {
                                                            r8 = this;
                                                        } else {
                                                            r8 = this;
                                                        }
                                                        applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                                        if (applicationInfoF != null) {
                                                            if ((applicationInfoF.flags & 1) != 0) {
                                                                j8 = 1;
                                                                bundle2.putLong("_sys", 1L);
                                                            } else {
                                                                j8 = 1;
                                                            }
                                                            if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                                                bundle2.putLong("_sysu", j8);
                                                            }
                                                        }
                                                    }
                                                    if (j7 >= 0) {
                                                        bundle2.putLong("_pfo", j7);
                                                    }
                                                    r8.aV();
                                                    bundle2.putLong(str, System.currentTimeMillis());
                                                    r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                                    r7 = r8;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                lgpVarV.aT().c.d("Error inserting column. appId", lcz.a(str3), str4, e);
                                            }
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            jD = 0;
                                        }
                                    } catch (Throwable th) {
                                        sQLiteDatabaseE.endTransaction();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r8 = this;
                                    r8.v().S();
                                    throw th;
                                }
                            } else {
                                str2 = "first_open_count";
                                str = "_elt";
                                ((ldr) elqVar.a).aT().g.a("Install Referrer Reporter was called with invalid app package name");
                                A();
                                D();
                                bundle2 = new Bundle();
                                j6 = j;
                                bundle2.putLong("_c", j6);
                                bundle2.putLong("_r", j6);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", j6);
                                if (lbgVar.o) {
                                    bundle2.putLong("_dac", j6);
                                }
                                str3 = lbgVar.a;
                                kro.l(str3);
                                lgpVarV = v();
                                kro.i(str3);
                                lgpVarV.o();
                                lgpVarV.w();
                                kro.i(str3);
                                kro.i(str2);
                                lgpVarV.o();
                                lgpVarV.w();
                                sQLiteDatabaseE = lgpVarV.e();
                                sQLiteDatabaseE.beginTransaction();
                                str4 = str2;
                                jD = lgpVarV.d(a.bT(str4, "select ", " from app2 where app_id=?"), new String[]{str3}, -1L);
                                if (jD == -1) {
                                    contentValues2 = new ContentValues();
                                    contentValues2.put("app_id", str3);
                                    j9 = -1;
                                    contentValues2.put(str4, (Integer) 0);
                                    contentValues2.put("previous_install_count", (Integer) 0);
                                    if (sQLiteDatabaseE.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                                        lgpVarV.aT().c.c("Failed to insert column (got -1). appId", lcz.a(str3), str4);
                                    } else {
                                        jD = 0;
                                    }
                                    sQLiteDatabaseE.endTransaction();
                                    j7 = j9;
                                    if (aS().getPackageManager() == null) {
                                        aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                        r8 = this;
                                    } else {
                                        packageInfoG = kte.b(aS()).g(str3, 0);
                                        if (packageInfoG != null) {
                                            r8 = this;
                                        } else {
                                            r8 = this;
                                        }
                                        applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                        if (applicationInfoF != null) {
                                            if ((applicationInfoF.flags & 1) != 0) {
                                                j8 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j8 = 1;
                                            }
                                            if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                                bundle2.putLong("_sysu", j8);
                                            }
                                        }
                                    }
                                    if (j7 >= 0) {
                                        bundle2.putLong("_pfo", j7);
                                    }
                                    r8.aV();
                                    bundle2.putLong(str, System.currentTimeMillis());
                                    r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                    r7 = r8;
                                } else {
                                    j9 = -1;
                                }
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str3);
                                contentValues.put(str4, Long.valueOf(jD + 1));
                                if (sQLiteDatabaseE.update("app2", contentValues, "app_id = ?", new String[]{str3}) == 0) {
                                    lgpVarV.aT().c.c("Failed to update column (got 0). appId", lcz.a(str3), str4);
                                    sQLiteDatabaseE.endTransaction();
                                    j7 = j9;
                                    if (aS().getPackageManager() == null) {
                                        aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                        r8 = this;
                                    } else {
                                        packageInfoG = kte.b(aS()).g(str3, 0);
                                        if (packageInfoG != null) {
                                            r8 = this;
                                        } else {
                                            r8 = this;
                                        }
                                        applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                        if (applicationInfoF != null) {
                                            if ((applicationInfoF.flags & 1) != 0) {
                                                j8 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j8 = 1;
                                            }
                                            if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                                bundle2.putLong("_sysu", j8);
                                            }
                                        }
                                    }
                                    if (j7 >= 0) {
                                        bundle2.putLong("_pfo", j7);
                                    }
                                    r8.aV();
                                    bundle2.putLong(str, System.currentTimeMillis());
                                    r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                    r7 = r8;
                                } else {
                                    sQLiteDatabaseE.setTransactionSuccessful();
                                    sQLiteDatabaseE.endTransaction();
                                    j7 = jD;
                                    if (aS().getPackageManager() == null) {
                                        aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                        r8 = this;
                                    } else {
                                        packageInfoG = kte.b(aS()).g(str3, 0);
                                        if (packageInfoG != null) {
                                            r8 = this;
                                        } else {
                                            r8 = this;
                                        }
                                        applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                        if (applicationInfoF != null) {
                                            if ((applicationInfoF.flags & 1) != 0) {
                                                j8 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j8 = 1;
                                            }
                                            if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                                bundle2.putLong("_sysu", j8);
                                            }
                                        }
                                    }
                                    if (j7 >= 0) {
                                        bundle2.putLong("_pfo", j7);
                                    }
                                    r8.aV();
                                    bundle2.putLong(str, System.currentTimeMillis());
                                    r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                    r7 = r8;
                                }
                            }
                        }
                    } else {
                        lfvVar = this;
                        j3 = j2;
                        if (lbgVar.i) {
                            r7 = lfvVar;
                            lfvVar.J(new lcd("_cd", new lcc(new Bundle()), "auto", j3, 0L), lbgVar);
                            r7 = lfvVar;
                        }
                    }
                    r7 = lfvVar;
                    r7.v().Y();
                    r7.v().S();
                    return;
                }
                j = 1;
                if (lcaVarJ == null) {
                    j4 = ((j2 / 3600000) + j) * 3600000;
                    if (z) {
                        Long lValueOf2 = Long.valueOf(j4);
                        j5 = j2;
                        Y(new lfy("_fot", j5, lValueOf2, "auto"), lbgVar);
                        A();
                        elqVar = this.v;
                        kro.l(elqVar);
                        if (str5 != null) {
                            if (str5.isEmpty()) {
                                obj = elqVar.a;
                                ((ldr) obj).r();
                                if (elqVar.i()) {
                                    ((ldr) obj).aT().i.a("Install Referrer Reporter is not available");
                                    str2 = "first_open_count";
                                    str = "_elt";
                                } else {
                                    ldm ldmVar2 = new ldm(elqVar, str5);
                                    ((ldr) obj).r();
                                    str = "_elt";
                                    intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    Context context2 = ((ldr) obj).a;
                                    packageManager = context2.getPackageManager();
                                    if (packageManager == null) {
                                        ((ldr) obj).aT().g.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                        str2 = "first_open_count";
                                    } else {
                                        str2 = "first_open_count";
                                        listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices != null) {
                                            ((ldr) elqVar.a).aT().i.a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ((ldr) elqVar.a).aT().i.a("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    }
                                }
                            } else {
                                str2 = "first_open_count";
                                str = "_elt";
                                ((ldr) elqVar.a).aT().g.a("Install Referrer Reporter was called with invalid app package name");
                            }
                            A();
                            D();
                            bundle2 = new Bundle();
                            j6 = j;
                            bundle2.putLong("_c", j6);
                            bundle2.putLong("_r", j6);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j6);
                            if (lbgVar.o) {
                                bundle2.putLong("_dac", j6);
                            }
                            str3 = lbgVar.a;
                            kro.l(str3);
                            lgpVarV = v();
                            kro.i(str3);
                            lgpVarV.o();
                            lgpVarV.w();
                            kro.i(str3);
                            kro.i(str2);
                            lgpVarV.o();
                            lgpVarV.w();
                            sQLiteDatabaseE = lgpVarV.e();
                            sQLiteDatabaseE.beginTransaction();
                            str4 = str2;
                            jD = lgpVarV.d(a.bT(str4, "select ", " from app2 where app_id=?"), new String[]{str3}, -1L);
                            if (jD == -1) {
                                contentValues2 = new ContentValues();
                                contentValues2.put("app_id", str3);
                                j9 = -1;
                                contentValues2.put(str4, (Integer) 0);
                                contentValues2.put("previous_install_count", (Integer) 0);
                                if (sQLiteDatabaseE.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                                    lgpVarV.aT().c.c("Failed to insert column (got -1). appId", lcz.a(str3), str4);
                                } else {
                                    jD = 0;
                                }
                                sQLiteDatabaseE.endTransaction();
                                j7 = j9;
                                if (aS().getPackageManager() == null) {
                                    aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                    r8 = this;
                                } else {
                                    packageInfoG = kte.b(aS()).g(str3, 0);
                                    if (packageInfoG != null) {
                                        r8 = this;
                                    } else {
                                        r8 = this;
                                    }
                                    applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                    if (applicationInfoF != null) {
                                        if ((applicationInfoF.flags & 1) != 0) {
                                            j8 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j8 = 1;
                                        }
                                        if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                            bundle2.putLong("_sysu", j8);
                                        }
                                    }
                                }
                                if (j7 >= 0) {
                                    bundle2.putLong("_pfo", j7);
                                }
                                r8.aV();
                                bundle2.putLong(str, System.currentTimeMillis());
                                r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                r7 = r8;
                            } else {
                                j9 = -1;
                            }
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str3);
                            contentValues.put(str4, Long.valueOf(jD + 1));
                            if (sQLiteDatabaseE.update("app2", contentValues, "app_id = ?", new String[]{str3}) == 0) {
                                lgpVarV.aT().c.c("Failed to update column (got 0). appId", lcz.a(str3), str4);
                                sQLiteDatabaseE.endTransaction();
                                j7 = j9;
                                if (aS().getPackageManager() == null) {
                                    aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                    r8 = this;
                                } else {
                                    packageInfoG = kte.b(aS()).g(str3, 0);
                                    if (packageInfoG != null) {
                                        r8 = this;
                                    } else {
                                        r8 = this;
                                    }
                                    applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                    if (applicationInfoF != null) {
                                        if ((applicationInfoF.flags & 1) != 0) {
                                            j8 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j8 = 1;
                                        }
                                        if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                            bundle2.putLong("_sysu", j8);
                                        }
                                    }
                                }
                                if (j7 >= 0) {
                                    bundle2.putLong("_pfo", j7);
                                }
                                r8.aV();
                                bundle2.putLong(str, System.currentTimeMillis());
                                r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                r7 = r8;
                            } else {
                                sQLiteDatabaseE.setTransactionSuccessful();
                                sQLiteDatabaseE.endTransaction();
                                j7 = jD;
                                if (aS().getPackageManager() == null) {
                                    aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                    r8 = this;
                                } else {
                                    packageInfoG = kte.b(aS()).g(str3, 0);
                                    if (packageInfoG != null) {
                                        r8 = this;
                                    } else {
                                        r8 = this;
                                    }
                                    applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                    if (applicationInfoF != null) {
                                        if ((applicationInfoF.flags & 1) != 0) {
                                            j8 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j8 = 1;
                                        }
                                        if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                            bundle2.putLong("_sysu", j8);
                                        }
                                    }
                                }
                                if (j7 >= 0) {
                                    bundle2.putLong("_pfo", j7);
                                }
                                r8.aV();
                                bundle2.putLong(str, System.currentTimeMillis());
                                r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                r7 = r8;
                            }
                        } else {
                            str2 = "first_open_count";
                            str = "_elt";
                            ((ldr) elqVar.a).aT().g.a("Install Referrer Reporter was called with invalid app package name");
                            A();
                            D();
                            bundle2 = new Bundle();
                            j6 = j;
                            bundle2.putLong("_c", j6);
                            bundle2.putLong("_r", j6);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j6);
                            if (lbgVar.o) {
                                bundle2.putLong("_dac", j6);
                            }
                            str3 = lbgVar.a;
                            kro.l(str3);
                            lgpVarV = v();
                            kro.i(str3);
                            lgpVarV.o();
                            lgpVarV.w();
                            kro.i(str3);
                            kro.i(str2);
                            lgpVarV.o();
                            lgpVarV.w();
                            sQLiteDatabaseE = lgpVarV.e();
                            sQLiteDatabaseE.beginTransaction();
                            str4 = str2;
                            jD = lgpVarV.d(a.bT(str4, "select ", " from app2 where app_id=?"), new String[]{str3}, -1L);
                            if (jD == -1) {
                                contentValues2 = new ContentValues();
                                contentValues2.put("app_id", str3);
                                j9 = -1;
                                contentValues2.put(str4, (Integer) 0);
                                contentValues2.put("previous_install_count", (Integer) 0);
                                if (sQLiteDatabaseE.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                                    lgpVarV.aT().c.c("Failed to insert column (got -1). appId", lcz.a(str3), str4);
                                } else {
                                    jD = 0;
                                }
                                sQLiteDatabaseE.endTransaction();
                                j7 = j9;
                                if (aS().getPackageManager() == null) {
                                    aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                    r8 = this;
                                } else {
                                    packageInfoG = kte.b(aS()).g(str3, 0);
                                    if (packageInfoG != null) {
                                        r8 = this;
                                    } else {
                                        r8 = this;
                                    }
                                    applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                    if (applicationInfoF != null) {
                                        if ((applicationInfoF.flags & 1) != 0) {
                                            j8 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j8 = 1;
                                        }
                                        if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                            bundle2.putLong("_sysu", j8);
                                        }
                                    }
                                }
                                if (j7 >= 0) {
                                    bundle2.putLong("_pfo", j7);
                                }
                                r8.aV();
                                bundle2.putLong(str, System.currentTimeMillis());
                                r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                r7 = r8;
                            } else {
                                j9 = -1;
                            }
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str3);
                            contentValues.put(str4, Long.valueOf(jD + 1));
                            if (sQLiteDatabaseE.update("app2", contentValues, "app_id = ?", new String[]{str3}) == 0) {
                                lgpVarV.aT().c.c("Failed to update column (got 0). appId", lcz.a(str3), str4);
                                sQLiteDatabaseE.endTransaction();
                                j7 = j9;
                                if (aS().getPackageManager() == null) {
                                    aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                    r8 = this;
                                } else {
                                    packageInfoG = kte.b(aS()).g(str3, 0);
                                    if (packageInfoG != null) {
                                        r8 = this;
                                    } else {
                                        r8 = this;
                                    }
                                    applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                    if (applicationInfoF != null) {
                                        if ((applicationInfoF.flags & 1) != 0) {
                                            j8 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j8 = 1;
                                        }
                                        if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                            bundle2.putLong("_sysu", j8);
                                        }
                                    }
                                }
                                if (j7 >= 0) {
                                    bundle2.putLong("_pfo", j7);
                                }
                                r8.aV();
                                bundle2.putLong(str, System.currentTimeMillis());
                                r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                r7 = r8;
                            } else {
                                sQLiteDatabaseE.setTransactionSuccessful();
                                sQLiteDatabaseE.endTransaction();
                                j7 = jD;
                                if (aS().getPackageManager() == null) {
                                    aT().c.b("PackageManager is null, first open report might be inaccurate. appId", lcz.a(str3));
                                    r8 = this;
                                } else {
                                    packageInfoG = kte.b(aS()).g(str3, 0);
                                    if (packageInfoG != null) {
                                        r8 = this;
                                    } else {
                                        r8 = this;
                                    }
                                    applicationInfoF = kte.b(r8.aS()).f(str3, 0);
                                    if (applicationInfoF != null) {
                                        if ((applicationInfoF.flags & 1) != 0) {
                                            j8 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j8 = 1;
                                        }
                                        if ((applicationInfoF.flags & SemanticState.Focused) != 0) {
                                            bundle2.putLong("_sysu", j8);
                                        }
                                    }
                                }
                                if (j7 >= 0) {
                                    bundle2.putLong("_pfo", j7);
                                }
                                r8.aV();
                                bundle2.putLong(str, System.currentTimeMillis());
                                r8.J(new lcd("_f", new lcc(bundle2), "auto", j5, j10), lbgVar);
                                r7 = r8;
                            }
                        }
                    } else {
                        lfv lfvVar4 = this;
                        long j13 = j2;
                        lfvVar4.Y(new lfy("_fvt", j13, Long.valueOf(j4), "auto"), lbgVar);
                        lfvVar4.A();
                        lfvVar4.D();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (lbgVar.o) {
                            bundle.putLong("_dac", 1L);
                        }
                        lfvVar4.aV();
                        bundle.putLong("_elt", System.currentTimeMillis());
                        lfvVar4.J(new lcd("_v", new lcc(bundle), "auto", j13, j10), lbgVar);
                        r7 = lfvVar4;
                    }
                } else {
                    lfvVar = this;
                    j3 = j2;
                    if (lbgVar.i) {
                        r7 = lfvVar;
                        lfvVar.J(new lcd("_cd", new lcc(new Bundle()), "auto", j3, 0L), lbgVar);
                        r7 = lfvVar;
                    }
                }
                r7 = lfvVar;
                r7.v().Y();
                r7.v().S();
                return;
            } catch (Throwable th3) {
                th = th3;
            }
            if (boolAG != null) {
                lfy lfyVar = new lfy("_npa", j11, Long.valueOf(true != boolAG.booleanValue() ? 0L : j), "auto");
                j2 = j11;
                if (aaqpVarAp == null || !aaqpVarAp.c.equals(lfyVar.d)) {
                    Y(lfyVar, lbgVar);
                }
            } else {
                j2 = j11;
                if (aaqpVarAp != null) {
                    O("_npa", lbgVar);
                }
            }
            if (i().F(null, lcl.aO)) {
                G(lbgVar, lbgVar.D);
            } else {
                G(lbgVar, j2);
            }
            e(lbgVar);
            if (i == 0) {
                lcaVarJ = v().j("events", str5, "_f");
                z = false;
            } else {
                lcaVarJ = v().j("events", str5, "_v");
                z = true;
            }
        } catch (Throwable th4) {
            th = th4;
            r8 = this;
        }
    }

    public final void N(lbq lbqVar, lbg lbgVar) {
        kro.i(lbqVar.a);
        kro.l(lbqVar.c);
        kro.i(lbqVar.c.b);
        A();
        D();
        if (ah(lbgVar)) {
            if (!lbgVar.h) {
                e(lbgVar);
                return;
            }
            v().F();
            try {
                e(lbgVar);
                String str = lbqVar.a;
                kro.l(str);
                lbq lbqVarI = v().i(str, lbqVar.c.b);
                if (lbqVarI != null) {
                    aT().j.c("Removing conditional user property", lbqVar.a, k().e(lbqVar.c.b));
                    v().aj(str, lbqVar.c.b);
                    if (lbqVarI.e) {
                        v().W(str, lbqVar.c.b);
                    }
                    lcd lcdVar = lbqVar.k;
                    if (lcdVar != null) {
                        lcc lccVar = lcdVar.b;
                        Bundle bundleA = lccVar != null ? lccVar.a() : null;
                        lcd lcdVarAq = r().aq(str, lcdVar.a, bundleA, lbqVarI.b, lcdVar.d, lcdVar.e, true, i().F(null, lcl.aT) ? this.i : lgv.a);
                        kro.l(lcdVarAq);
                        ac(lcdVarAq, lbgVar);
                    }
                } else {
                    aT().f.c("Conditional user property doesn't exist", lcz.a(lbqVar.a), k().e(lbqVar.c.b));
                }
                v().Y();
            } finally {
                v().S();
            }
        }
    }

    public final void O(String str, lbg lbgVar) {
        A();
        D();
        if (ah(lbgVar)) {
            if (!lbgVar.h) {
                e(lbgVar);
                return;
            }
            Boolean boolAG = aG(lbgVar);
            if ("_npa".equals(str) && boolAG != null) {
                aT().j.a("Falling back to manifest metadata value for ad personalization");
                aV();
                Y(new lfy("_npa", System.currentTimeMillis(), Long.valueOf(true != boolAG.booleanValue() ? 0L : 1L), "auto"), lbgVar);
                return;
            }
            aT().j.b("Removing user property", k().e(str));
            v().F();
            try {
                e(lbgVar);
                if ("_id".equals(str)) {
                    lgp lgpVarV = v();
                    String str2 = lbgVar.a;
                    kro.l(str2);
                    lgpVarV.W(str2, "_lair");
                }
                lgp lgpVarV2 = v();
                String str3 = lbgVar.a;
                kro.l(str3);
                lgpVarV2.W(str3, str);
                v().Y();
                aT().j.b("User property removed", k().e(str));
            } finally {
                v().S();
            }
        }
    }

    public final void P() {
        A();
        if (aw().d() || v().ai(null, lfm.a(lho.SGTM_CLIENT), 1).isEmpty()) {
            return;
        }
        aV();
        long jMax = Math.max(0L, ((Long) lcl.P.b(null)).longValue() - (SystemClock.elapsedRealtime() - this.u));
        aT().k.b("[sgtm] Scheduling process next sGTM batch runnable, delay in ms", Long.valueOf(jMax));
        aw().c(jMax);
    }

    final void Q(lbg lbgVar) {
        A();
        D();
        String str = lbgVar.a;
        kro.i(str);
        lgd lgdVarB = lgd.b(lbgVar.y);
        aT().k.c("Setting DMA consent for package", str, lgdVarB);
        A();
        D();
        lge lgeVarC = lgd.a(c(str), 100).c();
        this.G.put(str, lgdVarB);
        lgp lgpVarV = v();
        kro.l(str);
        kro.l(lgdVarB);
        lgpVarV.o();
        lgpVarV.w();
        lgh lghVarM = lgpVarV.m(str);
        lgh lghVar = lgh.a;
        if (lghVarM == lghVar) {
            lgpVarV.ab(str, lghVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", lgdVarB.c);
        lgpVarV.ao(contentValues);
        lge lgeVarC2 = lgd.a(c(str), 100).c();
        A();
        D();
        lge lgeVar = lge.DENIED;
        boolean z = lgeVarC == lgeVar && lgeVarC2 == lge.GRANTED;
        boolean z2 = lgeVarC == lge.GRANTED && lgeVarC2 == lgeVar;
        if (z || z2) {
            aT().k.b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (v().ag(a(), str, 1L, false, false, false, false, false, false).g < i().C(str, lcl.av)) {
                bundle.putLong("_r", 1L);
                aT().k.c("_dcu realtime event count", str, Long.valueOf(v().ag(a(), str, 1L, false, false, false, false, false, true).g));
            }
            this.L.a(str, "_dcu", bundle);
        }
    }

    public final void R(String str, lhf lhfVar) {
        A();
        String str2 = this.J;
        if (str2 == null || str2.equals(str) || lhfVar != null) {
            this.J = str;
            this.I = lhfVar;
        }
    }

    public final void S(lbg lbgVar) {
        A();
        D();
        String str = lbgVar.a;
        kro.i(str);
        lgh lghVarG = lgh.g(lbgVar.s, lbgVar.x);
        u(str);
        aT().k.c("Setting storage consent for package", str, lghVarG);
        W(str, lghVarG);
    }

    final void T(List list) {
        kro.c(!list.isEmpty());
        if (this.q != null) {
            aT().c.a("Set uploading progress before finishing the previous upload");
        } else {
            this.q = new ArrayList(list);
        }
    }

    public final void U(lbq lbqVar, lbg lbgVar) {
        lcd lcdVar;
        kro.i(lbqVar.a);
        kro.l(lbqVar.b);
        kro.l(lbqVar.c);
        kro.i(lbqVar.c.b);
        A();
        D();
        if (ah(lbgVar)) {
            if (!lbgVar.h) {
                e(lbgVar);
                return;
            }
            lbq lbqVar2 = new lbq(lbqVar);
            boolean z = false;
            lbqVar2.e = false;
            v().F();
            try {
                lgp lgpVarV = v();
                String str = lbqVar2.a;
                kro.l(str);
                lbq lbqVarI = lgpVarV.i(str, lbqVar2.c.b);
                if (lbqVarI != null && !lbqVarI.b.equals(lbqVar2.b)) {
                    aT().f.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", k().e(lbqVar2.c.b), lbqVar2.b, lbqVarI.b);
                }
                if (lbqVarI != null && lbqVarI.e) {
                    lbqVar2.b = lbqVarI.b;
                    lbqVar2.d = lbqVarI.d;
                    lbqVar2.h = lbqVarI.h;
                    lbqVar2.f = lbqVarI.f;
                    lbqVar2.i = lbqVarI.i;
                    lbqVar2.e = true;
                    lfy lfyVar = lbqVar2.c;
                    lbqVar2.c = new lfy(lfyVar.b, lbqVarI.c.c, lfyVar.a(), lbqVarI.c.f);
                } else if (TextUtils.isEmpty(lbqVar2.f)) {
                    lfy lfyVar2 = lbqVar2.c;
                    lbqVar2.c = new lfy(lfyVar2.b, lbqVar2.d, lfyVar2.a(), lbqVar2.c.f);
                    lbqVar2.e = true;
                    z = true;
                }
                if (lbqVar2.e) {
                    lfy lfyVar3 = lbqVar2.c;
                    String str2 = lbqVar2.a;
                    kro.l(str2);
                    String str3 = lbqVar2.b;
                    String str4 = lfyVar3.b;
                    long j = lfyVar3.c;
                    Object objA = lfyVar3.a();
                    kro.l(objA);
                    aaqp aaqpVar = new aaqp(str2, str3, str4, j, objA);
                    if (v().aq(aaqpVar)) {
                        aT().j.d("User property updated immediately", lbqVar2.a, k().e((String) aaqpVar.d), aaqpVar.c);
                    } else {
                        aT().c.d("(2)Too many active user properties, ignoring", lcz.a(lbqVar2.a), k().e((String) aaqpVar.d), aaqpVar.c);
                    }
                    if (z && (lcdVar = lbqVar2.i) != null) {
                        ac(new lcd(lcdVar, lbqVar2.d, 0L), lbgVar);
                    }
                }
                if (v().af(lbqVar2)) {
                    aT().j.d("Conditional property added", lbqVar2.a, k().e(lbqVar2.c.b), lbqVar2.c.a());
                } else {
                    aT().c.d("Too many conditional properties, ignoring", lcz.a(lbqVar2.a), k().e(lbqVar2.c.b), lbqVar2.c.a());
                }
                v().Y();
            } finally {
                v().S();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0335  */
    public final void V() {
        long jMax;
        long jMax2;
        int iIntValue;
        A();
        D();
        if (this.l > 0) {
            aV();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.l);
            if (jAbs > 0) {
                aT().k.b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                m().c();
                w().e();
                return;
            }
            this.l = 0L;
        }
        if (!this.j.y() || !aC()) {
            aT().k.a("Nothing to upload or uploading impossible");
            m().c();
            w().e();
            return;
        }
        aV();
        long jCurrentTimeMillis = System.currentTimeMillis();
        i();
        long jMax3 = Math.max(0L, ((Long) lcl.Z.b(null)).longValue());
        boolean z = (v().c("select count(1) > 0 from raw_events where realtime = 1", null) == 0 && v().c("select count(1) > 0 from queue where has_realtime = 1", null) == 0) ? false : true;
        if (z) {
            String strB = i().B("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strB) || ".none.".equals(strB)) {
                i();
                jMax = Math.max(0L, ((Long) lcl.T.b(null)).longValue());
            } else {
                i();
                jMax = Math.max(0L, ((Long) lcl.U.b(null)).longValue());
            }
        } else {
            i();
            jMax = Math.max(0L, ((Long) lcl.S.b(null)).longValue());
        }
        long jA = this.g.d.a();
        long jA2 = this.g.e.a();
        long jMax4 = Math.max(v().d("select max(bundle_end_timestamp) from queue", null, 0L), v().d("select max(timestamp) from raw_events", null, 0L));
        if (jMax4 == 0) {
            jMax2 = 0;
            break;
        }
        long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
        long jAbs3 = jCurrentTimeMillis - Math.abs(jA - jCurrentTimeMillis);
        long jAbs4 = jCurrentTimeMillis - Math.abs(jA2 - jCurrentTimeMillis);
        jMax2 = jMax3 + jAbs2;
        long jMax5 = Math.max(jAbs3, jAbs4);
        if (z && jMax5 > 0) {
            jMax2 = Math.min(jAbs2, jMax5) + jMax;
        }
        q();
        if (!lfx.ad(jMax5, jMax)) {
            jMax2 = jMax5 + jMax;
        }
        if (jAbs4 != 0 && jAbs4 >= jAbs2) {
            int i = 0;
            while (true) {
                i();
                if (i >= Math.min(20, Math.max(0, ((Integer) lcl.ab.b(null)).intValue()))) {
                    jMax2 = 0;
                    break;
                }
                i();
                jMax2 += Math.max(0L, ((Long) lcl.aa.b(null)).longValue()) * (1 << i);
                if (jMax2 > jAbs4) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (jMax2 == 0) {
            aT().k.a("Next upload time is 0");
            m().c();
            w().e();
            return;
        }
        if (!l().c()) {
            aT().k.a("No network");
            ldf ldfVarM = m();
            lfv lfvVar = ldfVarM.a;
            lfvVar.D();
            lfvVar.A();
            if (!ldfVarM.b) {
                ldfVarM.a().registerReceiver(ldfVarM, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                ldfVarM.c = lfvVar.l().c();
                ldfVarM.b().k.b("Registering connectivity change receiver. Network connected", Boolean.valueOf(ldfVarM.c));
                ldfVarM.b = true;
            }
            w().e();
            return;
        }
        long jA3 = this.g.c.a();
        i();
        long jMax6 = Math.max(0L, ((Long) lcl.R.b(null)).longValue());
        q();
        if (!lfx.ad(jA3, jMax6)) {
            jMax2 = Math.max(jMax2, jA3 + jMax6);
        }
        m().c();
        aV();
        long jCurrentTimeMillis2 = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            i();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) lcl.V.b(null)).longValue());
            ldi ldiVar = this.g.d;
            aV();
            ldiVar.b(System.currentTimeMillis());
        }
        lcx lcxVar = aT().k;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis2);
        lcxVar.b("Upload scheduled in approximately ms", lValueOf);
        lhq lhqVarW = w();
        lhqVarW.w();
        Context contextAS = lhqVarW.aS();
        if (!lga.ao(contextAS)) {
            lhqVarW.aT().j.a("Receiver not registered/enabled");
        }
        if (!lga.au(contextAS)) {
            lhqVarW.aT().j.a("Service not registered/enabled");
        }
        lhqVarW.e();
        lhqVarW.aT().k.b("Scheduling upload, millis", lValueOf);
        SystemClock.elapsedRealtime();
        if (jCurrentTimeMillis2 < lbt.z() && !lhqVarW.d().d()) {
            lhqVarW.d().c(jCurrentTimeMillis2);
        }
        Context contextAS2 = lhqVarW.aS();
        ComponentName componentName = new ComponentName(contextAS2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iA = lhqVarW.a();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(iA, componentName).setMinimumLatency(jCurrentTimeMillis2).setOverrideDeadline(jCurrentTimeMillis2 << 1).setExtras(persistableBundle).build();
        Method method = kyh.a;
        JobScheduler jobScheduler = (JobScheduler) contextAS2.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (kyh.a == null || contextAS2.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfoBuild);
            return;
        }
        Method method2 = kyh.b;
        if (method2 != null) {
            try {
                Integer num = (Integer) method2.invoke(UserHandle.class, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        } else {
            iIntValue = 0;
        }
        Method method3 = kyh.a;
        if (method3 != null) {
            try {
                Integer num2 = (Integer) method3.invoke(jobScheduler, jobInfoBuild, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm");
                if (num2 != null) {
                    num2.intValue();
                    return;
                }
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
            }
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    final void W(String str, lgh lghVar) {
        A();
        D();
        this.F.put(str, lghVar);
        v().ab(str, lghVar);
    }

    final void X(String str, boolean z, Long l, Long l2) {
        lbd lbdVarH = v().h(str);
        if (lbdVarH != null) {
            lbdVarH.ap(z);
            lbdVarH.aq(l);
            lbdVarH.ar(l2);
            if (lbdVarH.av()) {
                v().an(lbdVarH, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    public final void Y(lfy lfyVar, lbg lbgVar) {
        aaqp aaqpVarAp;
        lca lcaVarJ;
        long jLongValue;
        A();
        D();
        if (ah(lbgVar)) {
            if (!lbgVar.h) {
                e(lbgVar);
                return;
            }
            lga lgaVarR = r();
            String str = lfyVar.b;
            int iJ = lgaVarR.j(str);
            int length = 0;
            if (iJ != 0) {
                r();
                i();
                r().R(this.L, lbgVar.a, iJ, "_ev", lga.aA(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int iC = r().c(str, lfyVar.a());
            if (iC != 0) {
                r();
                i();
                String strAA = lga.aA(str, 24, true);
                Object objA = lfyVar.a();
                if (objA != null && ((objA instanceof String) || (objA instanceof CharSequence))) {
                    length = objA.toString().length();
                }
                r().R(this.L, lbgVar.a, iC, "_ev", strAA, length);
                return;
            }
            Object objW = r().w(str, lfyVar.a());
            if (objW != null) {
                if ("_sid".equals(str)) {
                    long j = lfyVar.c;
                    String str2 = lfyVar.f;
                    String str3 = lbgVar.a;
                    kro.l(str3);
                    aaqp aaqpVarAp2 = v().ap(str3, "_sno");
                    if (aaqpVarAp2 != null) {
                        Object obj = aaqpVarAp2.c;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            aT().f.b("Retrieved last session number from database does not contain a valid (long) value", aaqpVarAp2.c);
                            lcaVarJ = v().j("events", str3, "_s");
                            if (lcaVarJ != null) {
                                lcx lcxVar = aT().k;
                                long j2 = lcaVarJ.c;
                                lcxVar.b("Backfill the session number. Last used session number", Long.valueOf(j2));
                                jLongValue = j2;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        lcaVarJ = v().j("events", str3, "_s");
                        if (lcaVarJ != null) {
                            lcx lcxVar2 = aT().k;
                            long j3 = lcaVarJ.c;
                            lcxVar2.b("Backfill the session number. Last used session number", Long.valueOf(j3));
                            jLongValue = j3;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    Y(new lfy("_sno", j, Long.valueOf(jLongValue + 1), str2), lbgVar);
                }
                String str4 = lbgVar.a;
                kro.l(str4);
                String str5 = lfyVar.f;
                kro.l(str5);
                aaqp aaqpVar = new aaqp(str4, str5, str, lfyVar.c, objW);
                lcx lcxVar3 = aT().k;
                lcu lcuVarK = k();
                Object obj2 = aaqpVar.d;
                lcxVar3.c("Setting user property", lcuVarK.e((String) obj2), objW);
                v().F();
                try {
                    if ("_id".equals(obj2) && (aaqpVarAp = v().ap(str4, "_id")) != null && !aaqpVar.c.equals(aaqpVarAp.c)) {
                        v().W(str4, "_lair");
                    }
                    e(lbgVar);
                    boolean zAq = v().aq(aaqpVar);
                    if ("_sid".equals(str)) {
                        long jC = q().c(lbgVar.u);
                        lbd lbdVarH = v().h(str4);
                        if (lbdVarH != null) {
                            lbdVarH.ak(jC);
                            if (lbdVarH.av()) {
                                v().an(lbdVarH, false);
                            }
                        }
                    }
                    v().Y();
                    if (!zAq) {
                        aT().c.c("Too many unique user properties are set. Ignoring user property", k().e((String) obj2), aaqpVar.c);
                        r().R(this.L, str4, 9, null, null, 0);
                    }
                } finally {
                    v().S();
                }
            }
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:82:0x017f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lfv] */
    /* JADX WARN: Type inference failed for: r1v10, types: [long] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    public final void Z() {
        SQLiteException e;
        Cursor cursorRawQuery;
        boolean zIsEmpty;
        lbd lbdVarH;
        A();
        D();
        this.C = true;
        try {
            aW();
            Boolean bool = this.j.k().c;
            if (bool == null) {
                aT().f.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                aT().c.a("Upload called in the client side when service should be used");
            } else if (this.l > 0) {
                V();
            } else if (af()) {
                aT().k.a("Uploading requested multiple times");
            } else if (l().c()) {
                aV();
                ?? CurrentTimeMillis = System.currentTimeMillis();
                ?? r7 = 0;
                cursorRawQuery = null;
                Cursor cursorRawQuery2 = null;
                string = null;
                string = null;
                string = null;
                String string = null;
                int iC = i().C(null, lcl.as);
                i();
                long jU = CurrentTimeMillis - lbt.u();
                for (int i = 0; i < iC && ad(null, jU); i++) {
                }
                A();
                P();
                long jA = this.g.d.a();
                if (jA != 0) {
                    aT().j.b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(CurrentTimeMillis - jA)));
                }
                String strQ = v().q();
                long j = -1;
                if (TextUtils.isEmpty(strQ)) {
                    try {
                        this.s = -1L;
                        lgp lgpVarV = v();
                        i();
                        long jU2 = CurrentTimeMillis - lbt.u();
                        lgpVarV.o();
                        lgpVarV.w();
                        try {
                            cursorRawQuery = lgpVarV.e().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jU2)});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                } else {
                                    lgpVarV.aT().k.a("No expired configs for apps with pending events");
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                lgpVarV.aT().c.b("Error selecting expired configs", e);
                                if (cursorRawQuery != null) {
                                }
                                zIsEmpty = TextUtils.isEmpty(string);
                                CurrentTimeMillis = zIsEmpty;
                                if (!zIsEmpty) {
                                    CurrentTimeMillis = lbdVarH;
                                    F(lbdVarH);
                                    CurrentTimeMillis = lbdVarH;
                                }
                                CurrentTimeMillis = lbdVarH;
                                this.C = false;
                                E();
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                        zIsEmpty = TextUtils.isEmpty(string);
                        CurrentTimeMillis = zIsEmpty;
                        if (!zIsEmpty && (lbdVarH = v().h(string)) != null) {
                            CurrentTimeMillis = lbdVarH;
                            F(lbdVarH);
                            CurrentTimeMillis = lbdVarH;
                        }
                        CurrentTimeMillis = lbdVarH;
                    } catch (Throwable th2) {
                        th = th2;
                        r7 = CurrentTimeMillis;
                    }
                } else {
                    if (this.s == -1) {
                        lgp lgpVarV2 = v();
                        try {
                            try {
                                cursorRawQuery2 = lgpVarV2.e().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                if (cursorRawQuery2.moveToFirst()) {
                                    j = cursorRawQuery2.getLong(0);
                                    if (cursorRawQuery2 != null) {
                                        cursorRawQuery2.close();
                                    }
                                } else if (cursorRawQuery2 != null) {
                                    cursorRawQuery2.close();
                                }
                            } catch (SQLiteException e4) {
                                lgpVarV2.aT().c.b("Error querying raw events", e4);
                                if (cursorRawQuery2 != null) {
                                }
                                this.s = j;
                                aa(strQ, CurrentTimeMillis);
                            }
                            this.s = j;
                        } catch (Throwable th3) {
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                            throw th3;
                        }
                    }
                    aa(strQ, CurrentTimeMillis);
                }
            } else {
                aT().k.a("Network not connected, ignoring upload request");
                V();
            }
            this.C = false;
            E();
        } catch (Throwable th4) {
            this.C = false;
            E();
            throw th4;
        }
    }

    final long a() {
        aV();
        long jCurrentTimeMillis = System.currentTimeMillis();
        lfh lfhVar = this.g;
        lfhVar.w();
        lfhVar.o();
        ldi ldiVar = lfhVar.f;
        long jA = ldiVar.a();
        if (jA == 0) {
            jA = ((long) lfhVar.L().B().nextInt(86400000)) + 1;
            ldiVar.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    @Override // defpackage.leb
    public final Context aS() {
        return this.j.a;
    }

    @Override // defpackage.leb
    public final lcz aT() {
        ldr ldrVar = this.j;
        kro.l(ldrVar);
        return ldrVar.aT();
    }

    @Override // defpackage.leb
    public final lha aU() {
        ldr ldrVar = this.j;
        kro.l(ldrVar);
        return ldrVar.aU();
    }

    @Override // defpackage.leb
    public final ksr aV() {
        ldr ldrVar = this.j;
        kro.l(ldrVar);
        return ldrVar.x;
    }

    @Override // defpackage.leb
    public final void aW() {
        aedj aedjVar = this.j.y;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f8 A[PHI: r0 r5 r23
      0x01f8: PHI (r0v120 java.util.List) = (r0v7 java.util.List), (r0v142 java.util.List) binds: [B:104:0x01f6, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r5v57 android.database.Cursor) = (r5v1 android.database.Cursor), (r5v59 android.database.Cursor) binds: [B:104:0x01f6, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r23v4 long) = (r23v2 long), (r23v5 long) binds: [B:104:0x01f6, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    /* JADX WARN: Code duplicated, block: B:110:0x020d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0219  */
    /* JADX WARN: Code duplicated, block: B:118:0x0235  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:129:0x025e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0270  */
    /* JADX WARN: Code duplicated, block: B:137:0x029e  */
    /* JADX WARN: Code duplicated, block: B:140:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:145:0x0333  */
    /* JADX WARN: Code duplicated, block: B:147:0x033b  */
    /* JADX WARN: Code duplicated, block: B:150:0x035d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0386  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:163:0x03de  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:170:0x0425  */
    /* JADX WARN: Code duplicated, block: B:174:0x0438  */
    /* JADX WARN: Code duplicated, block: B:177:0x0449  */
    /* JADX WARN: Code duplicated, block: B:182:0x0465  */
    /* JADX WARN: Code duplicated, block: B:184:0x0477  */
    /* JADX WARN: Code duplicated, block: B:187:0x048d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0499  */
    /* JADX WARN: Code duplicated, block: B:192:0x04be  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:199:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:201:0x0520  */
    /* JADX WARN: Code duplicated, block: B:203:0x0526  */
    /* JADX WARN: Code duplicated, block: B:205:0x0532  */
    /* JADX WARN: Code duplicated, block: B:206:0x053b  */
    /* JADX WARN: Code duplicated, block: B:210:0x054f A[LOOP:4: B:208:0x0547->B:210:0x054f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x059c A[Catch: all -> 0x06b3, TryCatch #9 {all -> 0x06b3, blocks: (B:213:0x0596, B:215:0x059c, B:217:0x05c6, B:220:0x05cf, B:222:0x05fa, B:226:0x060a, B:227:0x060f, B:229:0x0627, B:231:0x0641, B:232:0x0650, B:233:0x0654, B:235:0x065a, B:236:0x066c), top: B:320:0x0596, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x05c6 A[Catch: all -> 0x06b3, TryCatch #9 {all -> 0x06b3, blocks: (B:213:0x0596, B:215:0x059c, B:217:0x05c6, B:220:0x05cf, B:222:0x05fa, B:226:0x060a, B:227:0x060f, B:229:0x0627, B:231:0x0641, B:232:0x0650, B:233:0x0654, B:235:0x065a, B:236:0x066c), top: B:320:0x0596, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:222:0x05fa A[Catch: all -> 0x06b3, TryCatch #9 {all -> 0x06b3, blocks: (B:213:0x0596, B:215:0x059c, B:217:0x05c6, B:220:0x05cf, B:222:0x05fa, B:226:0x060a, B:227:0x060f, B:229:0x0627, B:231:0x0641, B:232:0x0650, B:233:0x0654, B:235:0x065a, B:236:0x066c), top: B:320:0x0596, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0627 A[Catch: all -> 0x06b3, TryCatch #9 {all -> 0x06b3, blocks: (B:213:0x0596, B:215:0x059c, B:217:0x05c6, B:220:0x05cf, B:222:0x05fa, B:226:0x060a, B:227:0x060f, B:229:0x0627, B:231:0x0641, B:232:0x0650, B:233:0x0654, B:235:0x065a, B:236:0x066c), top: B:320:0x0596, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0641 A[Catch: all -> 0x06b3, TryCatch #9 {all -> 0x06b3, blocks: (B:213:0x0596, B:215:0x059c, B:217:0x05c6, B:220:0x05cf, B:222:0x05fa, B:226:0x060a, B:227:0x060f, B:229:0x0627, B:231:0x0641, B:232:0x0650, B:233:0x0654, B:235:0x065a, B:236:0x066c), top: B:320:0x0596, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x065a A[Catch: all -> 0x06b3, LOOP:5: B:233:0x0654->B:235:0x065a, LOOP_END, TryCatch #9 {all -> 0x06b3, blocks: (B:213:0x0596, B:215:0x059c, B:217:0x05c6, B:220:0x05cf, B:222:0x05fa, B:226:0x060a, B:227:0x060f, B:229:0x0627, B:231:0x0641, B:232:0x0650, B:233:0x0654, B:235:0x065a, B:236:0x066c), top: B:320:0x0596, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0689  */
    /* JADX WARN: Code duplicated, block: B:241:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:249:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:251:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:253:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:254:0x0704  */
    /* JADX WARN: Code duplicated, block: B:257:0x070b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0723  */
    /* JADX WARN: Code duplicated, block: B:262:0x0730  */
    /* JADX WARN: Code duplicated, block: B:263:0x0732  */
    /* JADX WARN: Code duplicated, block: B:266:0x0737 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x0739  */
    /* JADX WARN: Code duplicated, block: B:268:0x073a A[PHI: r5
      0x073a: PHI (r5v8 boolean) = (r5v7 boolean), (r5v14 boolean) binds: [B:265:0x0735, B:267:0x0739] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:270:0x0746  */
    /* JADX WARN: Code duplicated, block: B:271:0x074f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0760  */
    /* JADX WARN: Code duplicated, block: B:276:0x0777  */
    /* JADX WARN: Code duplicated, block: B:279:0x0784 A[LOOP:6: B:277:0x077c->B:279:0x0784, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:283:0x0800  */
    /* JADX WARN: Code duplicated, block: B:286:0x0814  */
    /* JADX WARN: Code duplicated, block: B:288:0x081f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0828  */
    /* JADX WARN: Code duplicated, block: B:292:0x0840  */
    /* JADX WARN: Code duplicated, block: B:324:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:? A[LOOP:0: B:119:0x0239->B:326:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x027e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
    final void aa(String str, long j) throws Throwable {
        Cursor cursor;
        long j2;
        Cursor cursorQuery;
        List listSubList;
        aihf aihfVarCreateBuilder;
        int size;
        List arrayList;
        boolean z;
        boolean zM;
        boolean zO;
        boolean zF;
        lfp lfpVar;
        sdo sdoVarG;
        int i;
        liq liqVarAy;
        List arrayList2;
        String str2;
        Object obj;
        boolean z2;
        String string;
        aihf builder;
        int i2;
        String str3;
        Object obj2;
        String strM;
        Object obj3;
        lho lhoVar;
        String string2;
        String string3;
        liq liqVarAy2;
        aihf builder2;
        int i3;
        Object obj4;
        Object obj5;
        List listAi;
        Iterator it;
        Object obj6;
        long j3;
        aihf builder3;
        boolean z3;
        lir lirVar;
        String str4;
        ArrayList arrayList3;
        Iterator it2;
        Long lValueOf;
        Long lValueOf2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        lin linVar;
        String str5;
        lip lipVarR;
        lip lipVarR2;
        Object obj7;
        Iterator it3;
        String str6;
        int i4;
        lir lirVar2;
        lir lirVar3;
        long j4;
        long j5;
        int iC = i().C(str, lcl.h);
        int i5 = 0;
        int iMax = Math.max(0, i().C(str, lcl.i));
        lgp lgpVarV = v();
        lgpVarV.o();
        lgpVarV.w();
        int i6 = 1;
        kro.c(iC > 0);
        kro.c(iMax > 0);
        kro.i(str);
        try {
            try {
                j2 = -1;
                try {
                    cursorQuery = lgpVarV.e().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(iC));
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList4 = new ArrayList();
                                int length = 0;
                                while (true) {
                                    long j6 = cursorQuery.getLong(i5);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i6);
                                        lfx lfxVarU = lgpVarV.u();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[SemanticState.ReadOnly];
                                            while (true) {
                                                int i7 = gZIPInputStream.read(bArr);
                                                if (i7 <= 0) {
                                                    break;
                                                }
                                                lgpVarV = lgpVarV;
                                                long j7 = j6;
                                                try {
                                                    byteArrayOutputStream.write(bArr, 0, i7);
                                                    lgpVarV = lgpVarV;
                                                    j6 = j7;
                                                } catch (IOException e) {
                                                    e = e;
                                                }
                                                try {
                                                    lfxVarU.aT().c.b("Failed to ungzip content", e);
                                                    throw e;
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    lgpVarV.aT().c.c("Failed to unzip queued bundle. appId", lcz.a(str), e);
                                                    if (cursorQuery.moveToNext()) {
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    listSubList = arrayList4;
                                                    if (listSubList.isEmpty()) {
                                                        aT().k.b("No bundles to upload. appId", str);
                                                        return;
                                                    }
                                                    if (!i().F(str, lcl.M)) {
                                                    }
                                                    if (u(str).m()) {
                                                        it3 = listSubList.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                str6 = null;
                                                                break;
                                                            }
                                                            lirVar3 = (lir) ((Pair) it3.next()).first;
                                                            if (!lirVar3.v.isEmpty()) {
                                                                str6 = lirVar3.v;
                                                                break;
                                                            }
                                                        }
                                                        if (str6 != null) {
                                                            while (i4 < listSubList.size()) {
                                                                lirVar2 = (lir) ((Pair) listSubList.get(i4)).first;
                                                                if (lirVar2.v.isEmpty()) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    aihfVarCreateBuilder = liq.a.createBuilder();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (i().n(str)) {
                                                        z = false;
                                                    } else {
                                                        z = false;
                                                    }
                                                    zM = u(str).m();
                                                    zO = u(str).o();
                                                    autm.c();
                                                    zF = i().F(str, lcl.aM);
                                                    lfpVar = this.h;
                                                    sdoVarG = lfpVar.g(str);
                                                    i = 0;
                                                    while (i < size) {
                                                        builder3 = ((lir) ((Pair) listSubList.get(i)).first).toBuilder();
                                                        List list = listSubList;
                                                        arrayList.add((Long) ((Pair) listSubList.get(i)).second);
                                                        i();
                                                        builder3.copyOnWrite();
                                                        lir lirVar4 = (lir) builder3.instance;
                                                        int i8 = size;
                                                        lirVar4.b |= 32768;
                                                        z3 = z;
                                                        lirVar4.u = 192008L;
                                                        builder3.copyOnWrite();
                                                        lir lirVar5 = (lir) builder3.instance;
                                                        lirVar5.b |= 2;
                                                        lirVar5.g = j;
                                                        aW();
                                                        builder3.copyOnWrite();
                                                        lirVar = (lir) builder3.instance;
                                                        lirVar.b |= 8388608;
                                                        lirVar.C = false;
                                                        if (!z3) {
                                                            if (!lirVar.I.isEmpty()) {
                                                                aT().k.b("dsid is cleared since it's not enabled to upload", str);
                                                            }
                                                            builder3.copyOnWrite();
                                                            lir lirVar6 = (lir) builder3.instance;
                                                            lirVar6.b &= Alert.DURATION_SHOW_INDEFINITELY;
                                                            lirVar6.I = lir.a.I;
                                                        }
                                                        if (!zM) {
                                                            builder3.copyOnWrite();
                                                            lir lirVar7 = (lir) builder3.instance;
                                                            lirVar7.b &= -65537;
                                                            lirVar7.v = lir.a.v;
                                                            builder3.copyOnWrite();
                                                            lir lirVar8 = (lir) builder3.instance;
                                                            lirVar8.b &= -131073;
                                                            lirVar8.w = false;
                                                        }
                                                        if (!zO) {
                                                            builder3.copyOnWrite();
                                                            lir lirVar9 = (lir) builder3.instance;
                                                            lirVar9.b &= -262145;
                                                            lirVar9.x = lir.a.x;
                                                        }
                                                        ak(str, builder3);
                                                        if (!zF) {
                                                            builder3.copyOnWrite();
                                                            lir lirVar10 = (lir) builder3.instance;
                                                            lirVar10.c &= -8193;
                                                            lirVar10.P = lir.a.P;
                                                        }
                                                        if (!zO) {
                                                            builder3.copyOnWrite();
                                                            ((lir) builder3.instance).D = lir.emptyProtobufList();
                                                        }
                                                        str4 = ((lir) builder3.instance).v;
                                                        if (TextUtils.isEmpty(str4)) {
                                                            arrayList3 = new ArrayList(DesugarCollections.unmodifiableList(((lir) builder3.instance).e));
                                                            it2 = arrayList3.iterator();
                                                            lValueOf = null;
                                                            lValueOf2 = null;
                                                            z4 = false;
                                                            z5 = false;
                                                            while (it2.hasNext()) {
                                                                zM = zM;
                                                                linVar = (lin) it2.next();
                                                                zO = zO;
                                                                str5 = linVar.d;
                                                                zF = zF;
                                                                if ("_fx".equals(str5)) {
                                                                    it2.remove();
                                                                    z4 = true;
                                                                } else if ("_f".equals(str5)) {
                                                                    q();
                                                                    lipVarR = lfx.R(linVar, "_pfo");
                                                                    if (lipVarR != null) {
                                                                        lValueOf2 = Long.valueOf(lipVarR.e);
                                                                    }
                                                                    q();
                                                                    lipVarR2 = lfx.R(linVar, "_uwa");
                                                                    if (lipVarR2 != null) {
                                                                        lValueOf = Long.valueOf(lipVarR2.e);
                                                                    }
                                                                } else {
                                                                    zO = zO;
                                                                    zM = zM;
                                                                    zF = zF;
                                                                }
                                                                z5 = true;
                                                            }
                                                            z6 = zM;
                                                            z7 = zO;
                                                            z8 = zF;
                                                            if (z4) {
                                                                builder3.copyOnWrite();
                                                                ((lir) builder3.instance).e = lir.emptyProtobufList();
                                                                builder3.J(arrayList3);
                                                            }
                                                            if (z5) {
                                                                X(((lir) builder3.instance).r, true, lValueOf2, lValueOf);
                                                            }
                                                        } else {
                                                            arrayList3 = new ArrayList(DesugarCollections.unmodifiableList(((lir) builder3.instance).e));
                                                            it2 = arrayList3.iterator();
                                                            lValueOf = null;
                                                            lValueOf2 = null;
                                                            z4 = false;
                                                            z5 = false;
                                                            while (it2.hasNext()) {
                                                                zM = zM;
                                                                linVar = (lin) it2.next();
                                                                zO = zO;
                                                                str5 = linVar.d;
                                                                zF = zF;
                                                                if ("_fx".equals(str5)) {
                                                                    it2.remove();
                                                                    z4 = true;
                                                                } else if ("_f".equals(str5)) {
                                                                    q();
                                                                    lipVarR = lfx.R(linVar, "_pfo");
                                                                    if (lipVarR != null) {
                                                                        lValueOf2 = Long.valueOf(lipVarR.e);
                                                                    }
                                                                    q();
                                                                    lipVarR2 = lfx.R(linVar, "_uwa");
                                                                    if (lipVarR2 != null) {
                                                                        lValueOf = Long.valueOf(lipVarR2.e);
                                                                    }
                                                                } else {
                                                                    zO = zO;
                                                                    zM = zM;
                                                                    zF = zF;
                                                                }
                                                                z5 = true;
                                                            }
                                                            z6 = zM;
                                                            z7 = zO;
                                                            z8 = zF;
                                                            if (z4) {
                                                                builder3.copyOnWrite();
                                                                ((lir) builder3.instance).e = lir.emptyProtobufList();
                                                                builder3.J(arrayList3);
                                                            }
                                                            if (z5) {
                                                                X(((lir) builder3.instance).r, true, lValueOf2, lValueOf);
                                                            }
                                                        }
                                                        if (((lir) builder3.instance).e.size() != 0) {
                                                            if (i().F(str, lcl.aA)) {
                                                                long jD = q().d(((lir) builder3.build()).toByteArray());
                                                                builder3.copyOnWrite();
                                                                lir lirVar11 = (lir) builder3.instance;
                                                                lirVar11.c |= 32;
                                                                lirVar11.N = jD;
                                                            }
                                                            obj7 = sdoVarG.b;
                                                            if (obj7 != null) {
                                                                builder3.copyOnWrite();
                                                                lir lirVar12 = (lir) builder3.instance;
                                                                lirVar12.aa = (liw) obj7;
                                                                lirVar12.c |= 67108864;
                                                            }
                                                            aihfVarCreateBuilder.bi(builder3);
                                                        }
                                                        i++;
                                                        size = i8;
                                                        listSubList = list;
                                                        z = z3;
                                                        zO = z7;
                                                        zM = z6;
                                                        zF = z8;
                                                    }
                                                    if (((liq) aihfVarCreateBuilder.instance).c.size() == 0) {
                                                        T(arrayList);
                                                        L(false, 204, null, null, str, Collections.EMPTY_LIST, null);
                                                        return;
                                                    }
                                                    liqVarAy = (liq) aihfVarCreateBuilder.build();
                                                    arrayList2 = new ArrayList();
                                                    str2 = "com.google.android.gms.measurement.BATCHES_AVAILABLE";
                                                    if (i().F(str, lcl.O)) {
                                                        obj3 = sdoVarG.d;
                                                        lhoVar = lho.SGTM_CLIENT;
                                                        if (obj3 == lhoVar) {
                                                            A();
                                                            D();
                                                            if (aF(liqVarAy)) {
                                                                string3 = UUID.randomUUID().toString();
                                                            } else {
                                                                string3 = null;
                                                            }
                                                            liqVarAy2 = ay(str, liqVarAy, string3);
                                                            builder2 = liqVarAy2.toBuilder();
                                                            i3 = 0;
                                                            while (i3 < liqVarAy2.c.size()) {
                                                                aihf builder4 = ((lir) liqVarAy2.c.get(i3)).toBuilder();
                                                                builder4.copyOnWrite();
                                                                Object obj8 = obj3;
                                                                lir lirVar13 = (lir) builder4.instance;
                                                                lirVar13.b &= -3;
                                                                lirVar13.g = 0L;
                                                                builder4.copyOnWrite();
                                                                lir lirVar14 = (lir) builder4.instance;
                                                                lirVar14.c |= 134217728;
                                                                lirVar14.ab = j;
                                                                builder2.bj(i3, builder4);
                                                                i3++;
                                                                liqVarAy2 = liqVarAy2;
                                                                obj3 = obj8;
                                                                lhoVar = lhoVar;
                                                            }
                                                            obj4 = obj3;
                                                            lho lhoVar2 = lhoVar;
                                                            try {
                                                                v().F();
                                                                try {
                                                                    if (!TextUtils.isEmpty(string3)) {
                                                                        liq liqVarAx = ax(liqVarAy, string3);
                                                                        sdo sdoVarE = lfpVar.e(str, true);
                                                                        obj5 = obj4;
                                                                        long jA = v().a(str, liqVarAx, (String) sdoVarE.a, sdoVarE.o(), (lho) sdoVarE.d, null);
                                                                        Long lValueOf3 = jA != j2 ? Long.valueOf(jA) : null;
                                                                        long jA2 = v().a(str, (liq) builder2.build(), (String) sdoVarG.a, sdoVarG.o(), (lho) obj5, lValueOf3);
                                                                        if (i().F(null, lcl.aR)) {
                                                                            aB(str, "queued_batches");
                                                                        }
                                                                        listAi = v().ai(str, lfm.a(lhoVar2), 1);
                                                                        if (!listAi.isEmpty()) {
                                                                            j3 = ((lfw) listAi.get(0)).g;
                                                                            if (j > ((Long) lcl.Q.b(null)).longValue() + j3) {
                                                                                aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j3));
                                                                            }
                                                                        }
                                                                        it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            v().O(((Long) it.next()).longValue());
                                                                        }
                                                                        v().Y();
                                                                        v().S();
                                                                        this.l = 0L;
                                                                        obj6 = sdoVarG.a;
                                                                        if (ae(str, (String) obj6)) {
                                                                            aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                                                            Intent intent = new Intent();
                                                                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                            intent.setPackage(str);
                                                                            rpi.D(aS(), intent);
                                                                        } else {
                                                                            aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj6);
                                                                        }
                                                                        aU().j(new lei(this, 7));
                                                                        return;
                                                                    }
                                                                    obj5 = obj4;
                                                                    long jA3 = v().a(str, (liq) builder2.build(), (String) sdoVarG.a, sdoVarG.o(), (lho) obj5, lValueOf3);
                                                                    if (i().F(null, lcl.aR)) {
                                                                        aB(str, "queued_batches");
                                                                    }
                                                                    listAi = v().ai(str, lfm.a(lhoVar2), 1);
                                                                    if (!listAi.isEmpty()) {
                                                                        j3 = ((lfw) listAi.get(0)).g;
                                                                        if (j > ((Long) lcl.Q.b(null)).longValue() + j3) {
                                                                            aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j3));
                                                                        }
                                                                    }
                                                                    it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        v().O(((Long) it.next()).longValue());
                                                                    }
                                                                    v().Y();
                                                                    v().S();
                                                                    this.l = 0L;
                                                                    obj6 = sdoVarG.a;
                                                                    if (ae(str, (String) obj6)) {
                                                                        aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                                                        Intent intent2 = new Intent();
                                                                        intent2.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                        intent2.setPackage(str);
                                                                        rpi.D(aS(), intent2);
                                                                    } else {
                                                                        aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj6);
                                                                    }
                                                                    aU().j(new lei(this, 7));
                                                                    return;
                                                                } catch (Throwable th) {
                                                                    v().S();
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e3) {
                                                                aT().c.b("Database error while trying to delete queued bundles", e3);
                                                                aV();
                                                                this.l = SystemClock.elapsedRealtime();
                                                                aT().k.b("Disable upload, time", Long.valueOf(this.l));
                                                            }
                                                        } else if (obj3 == lho.SGTM) {
                                                            if (aF(liqVarAy)) {
                                                                string2 = UUID.randomUUID().toString();
                                                            } else {
                                                                string2 = null;
                                                            }
                                                            if (!TextUtils.isEmpty(string2)) {
                                                                arrayList2.add(Pair.create(ax(liqVarAy, string2), lfpVar.e(str, false)));
                                                            }
                                                            liqVarAy = ay(str, liqVarAy, string2);
                                                        }
                                                    } else {
                                                        obj = sdoVarG.d;
                                                        if (obj == lho.SGTM_CLIENT) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (obj == lho.SGTM) {
                                                            if (aF((liq) aihfVarCreateBuilder.build())) {
                                                                string = UUID.randomUUID().toString();
                                                            } else {
                                                                string = null;
                                                            }
                                                            liqVarAy = ay(str, (liq) aihfVarCreateBuilder.build(), string);
                                                            if (!TextUtils.isEmpty(string)) {
                                                                arrayList2.add(Pair.create(ax((liq) aihfVarCreateBuilder.build(), string), lfpVar.e(str, z2)));
                                                            }
                                                            if (z2) {
                                                                builder = liqVarAy.toBuilder();
                                                                i2 = 0;
                                                                while (i2 < liqVarAy.c.size()) {
                                                                    aihf builder5 = ((lir) liqVarAy.c.get(i2)).toBuilder();
                                                                    builder5.copyOnWrite();
                                                                    lir lirVar15 = (lir) builder5.instance;
                                                                    lirVar15.b &= -3;
                                                                    lirVar15.g = 0L;
                                                                    builder5.copyOnWrite();
                                                                    lir lirVar16 = (lir) builder5.instance;
                                                                    lirVar16.c |= 134217728;
                                                                    lirVar16.ab = j;
                                                                    builder.bj(i2, builder5);
                                                                    i2++;
                                                                    str2 = str2;
                                                                }
                                                                str3 = str2;
                                                                arrayList2.add(Pair.create((liq) builder.build(), sdoVarG));
                                                                T(arrayList);
                                                                L(false, 204, null, null, str, arrayList2, null);
                                                                obj2 = sdoVarG.a;
                                                                if (ae(str, (String) obj2)) {
                                                                    aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj2);
                                                                    return;
                                                                }
                                                                aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                                                Intent intent3 = new Intent();
                                                                intent3.setAction(str3);
                                                                intent3.setPackage(str);
                                                                rpi.D(aS(), intent3);
                                                                return;
                                                            }
                                                        } else if (z2) {
                                                            z2 = true;
                                                            if (aF((liq) aihfVarCreateBuilder.build())) {
                                                                string = UUID.randomUUID().toString();
                                                            } else {
                                                                string = null;
                                                            }
                                                            liqVarAy = ay(str, (liq) aihfVarCreateBuilder.build(), string);
                                                            if (!TextUtils.isEmpty(string)) {
                                                                arrayList2.add(Pair.create(ax((liq) aihfVarCreateBuilder.build(), string), lfpVar.e(str, z2)));
                                                            }
                                                            if (z2) {
                                                                builder = liqVarAy.toBuilder();
                                                                i2 = 0;
                                                                while (i2 < liqVarAy.c.size()) {
                                                                    aihf builder6 = ((lir) liqVarAy.c.get(i2)).toBuilder();
                                                                    builder6.copyOnWrite();
                                                                    lir lirVar17 = (lir) builder6.instance;
                                                                    lirVar17.b &= -3;
                                                                    lirVar17.g = 0L;
                                                                    builder6.copyOnWrite();
                                                                    lir lirVar18 = (lir) builder6.instance;
                                                                    lirVar18.c |= 134217728;
                                                                    lirVar18.ab = j;
                                                                    builder.bj(i2, builder6);
                                                                    i2++;
                                                                    str2 = str2;
                                                                }
                                                                str3 = str2;
                                                                arrayList2.add(Pair.create((liq) builder.build(), sdoVarG));
                                                                T(arrayList);
                                                                L(false, 204, null, null, str, arrayList2, null);
                                                                obj2 = sdoVarG.a;
                                                                if (ae(str, (String) obj2)) {
                                                                    aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj2);
                                                                    return;
                                                                }
                                                                aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                                                Intent intent4 = new Intent();
                                                                intent4.setAction(str3);
                                                                intent4.setPackage(str);
                                                                rpi.D(aS(), intent4);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if (l().c()) {
                                                        if (aT().i(2)) {
                                                            strM = q().m(liqVarAy);
                                                        } else {
                                                            strM = null;
                                                        }
                                                        q();
                                                        byte[] byteArray = liqVarAy.toByteArray();
                                                        T(arrayList);
                                                        if (i().F(null, lcl.aR)) {
                                                            aB(str, "service_upload");
                                                        }
                                                        this.g.e.b(j);
                                                        aT().k.d("Uploading data. app, uncompressed size, data", str, Integer.valueOf(byteArray.length), strM);
                                                        this.p = true;
                                                        l().d(str, sdoVarG, liqVarAy, new lfr(this, str, arrayList2, 1));
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                            if (!arrayList4.isEmpty() && byteArray2.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                aihf aihfVar = (aihf) lfx.l(lir.a.createBuilder(), byteArray2);
                                                if (arrayList4.isEmpty()) {
                                                    lgpVarV = lgpVarV;
                                                    j6 = j6;
                                                } else {
                                                    lir lirVar19 = (lir) ((Pair) arrayList4.get(0)).first;
                                                    lir lirVar20 = (lir) aihfVar.build();
                                                    lgpVarV = lgpVarV;
                                                    try {
                                                        if (!lirVar19.O.equals(lirVar20.O) || !lirVar19.T.equals(lirVar20.T) || lirVar19.U != lirVar20.U || !lirVar19.V.equals(lirVar20.V)) {
                                                            break;
                                                        }
                                                        Iterator it4 = lirVar19.f.iterator();
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                j4 = -1;
                                                                break;
                                                            }
                                                            lix lixVar = (lix) it4.next();
                                                            Iterator it5 = it4;
                                                            if ("_npa".equals(lixVar.d)) {
                                                                j4 = lixVar.f;
                                                                break;
                                                            }
                                                            it4 = it5;
                                                        }
                                                        Iterator it6 = lirVar20.f.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                j5 = -1;
                                                                break;
                                                            }
                                                            lix lixVar2 = (lix) it6.next();
                                                            if ("_npa".equals(lixVar2.d)) {
                                                                j5 = lixVar2.f;
                                                                break;
                                                            }
                                                        }
                                                        if (j4 != j5) {
                                                            break;
                                                        }
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        lgpVarV.aT().c.c("Error querying bundles. appId", lcz.a(str), e);
                                                        listSubList = Collections.EMPTY_LIST;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i9 = cursorQuery.getInt(2);
                                                    aihfVar.copyOnWrite();
                                                    lir lirVar21 = (lir) aihfVar.instance;
                                                    lirVar21.c |= 2;
                                                    lirVar21.J = i9;
                                                }
                                                length += byteArray2.length;
                                                arrayList4.add(Pair.create((lir) aihfVar.build(), Long.valueOf(j6)));
                                            } catch (IOException e5) {
                                                lgpVarV = lgpVarV;
                                                lgpVarV.aT().c.c("Failed to merge queued bundle. appId", lcz.a(str), e5);
                                            }
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            } else {
                                                lgpVarV = lgpVarV;
                                                i5 = 0;
                                                i6 = 1;
                                            }
                                        } catch (IOException e6) {
                                            e = e6;
                                            lgpVarV = lgpVarV;
                                        }
                                    } catch (IOException e7) {
                                        e = e7;
                                        lgpVarV = lgpVarV;
                                    }
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                listSubList = arrayList4;
                            } else {
                                listSubList = Collections.EMPTY_LIST;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            lgpVarV = lgpVarV;
                        }
                        if (listSubList.isEmpty()) {
                            aT().k.b("No bundles to upload. appId", str);
                            return;
                        }
                        if (!i().F(str, lcl.M) && af()) {
                            aT().k.a("Uploading requested multiple times");
                            return;
                        }
                        if (u(str).m()) {
                            it3 = listSubList.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    str6 = null;
                                    break;
                                }
                                lirVar3 = (lir) ((Pair) it3.next()).first;
                                if (!lirVar3.v.isEmpty()) {
                                    str6 = lirVar3.v;
                                    break;
                                }
                            }
                            if (str6 != null) {
                                for (i4 = 0; i4 < listSubList.size(); i4++) {
                                    lirVar2 = (lir) ((Pair) listSubList.get(i4)).first;
                                    if (lirVar2.v.isEmpty() && !lirVar2.v.equals(str6)) {
                                        listSubList = listSubList.subList(0, i4);
                                        break;
                                    }
                                }
                            }
                        }
                        aihfVarCreateBuilder = liq.a.createBuilder();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (i().n(str) || !u(str).m()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        zM = u(str).m();
                        zO = u(str).o();
                        autm.c();
                        zF = i().F(str, lcl.aM);
                        lfpVar = this.h;
                        sdoVarG = lfpVar.g(str);
                        i = 0;
                        while (i < size) {
                            builder3 = ((lir) ((Pair) listSubList.get(i)).first).toBuilder();
                            List list2 = listSubList;
                            arrayList.add((Long) ((Pair) listSubList.get(i)).second);
                            i();
                            builder3.copyOnWrite();
                            lir lirVar22 = (lir) builder3.instance;
                            int i10 = size;
                            lirVar22.b |= 32768;
                            z3 = z;
                            lirVar22.u = 192008L;
                            builder3.copyOnWrite();
                            lir lirVar23 = (lir) builder3.instance;
                            lirVar23.b |= 2;
                            lirVar23.g = j;
                            aW();
                            builder3.copyOnWrite();
                            lirVar = (lir) builder3.instance;
                            lirVar.b |= 8388608;
                            lirVar.C = false;
                            if (!z3) {
                                if (!lirVar.I.isEmpty()) {
                                    aT().k.b("dsid is cleared since it's not enabled to upload", str);
                                }
                                builder3.copyOnWrite();
                                lir lirVar24 = (lir) builder3.instance;
                                lirVar24.b &= Alert.DURATION_SHOW_INDEFINITELY;
                                lirVar24.I = lir.a.I;
                            }
                            if (!zM) {
                                builder3.copyOnWrite();
                                lir lirVar25 = (lir) builder3.instance;
                                lirVar25.b &= -65537;
                                lirVar25.v = lir.a.v;
                                builder3.copyOnWrite();
                                lir lirVar26 = (lir) builder3.instance;
                                lirVar26.b &= -131073;
                                lirVar26.w = false;
                            }
                            if (!zO) {
                                builder3.copyOnWrite();
                                lir lirVar27 = (lir) builder3.instance;
                                lirVar27.b &= -262145;
                                lirVar27.x = lir.a.x;
                            }
                            ak(str, builder3);
                            if (!zF) {
                                builder3.copyOnWrite();
                                lir lirVar110 = (lir) builder3.instance;
                                lirVar110.c &= -8193;
                                lirVar110.P = lir.a.P;
                            }
                            if (!zO) {
                                builder3.copyOnWrite();
                                ((lir) builder3.instance).D = lir.emptyProtobufList();
                            }
                            str4 = ((lir) builder3.instance).v;
                            if (TextUtils.isEmpty(str4) || str4.equals("00000000-0000-0000-0000-000000000000")) {
                                arrayList3 = new ArrayList(DesugarCollections.unmodifiableList(((lir) builder3.instance).e));
                                it2 = arrayList3.iterator();
                                lValueOf = null;
                                lValueOf2 = null;
                                z4 = false;
                                z5 = false;
                                while (it2.hasNext()) {
                                    zM = zM;
                                    linVar = (lin) it2.next();
                                    zO = zO;
                                    str5 = linVar.d;
                                    zF = zF;
                                    if ("_fx".equals(str5)) {
                                        it2.remove();
                                        z4 = true;
                                    } else if ("_f".equals(str5)) {
                                        q();
                                        lipVarR = lfx.R(linVar, "_pfo");
                                        if (lipVarR != null) {
                                            lValueOf2 = Long.valueOf(lipVarR.e);
                                        }
                                        q();
                                        lipVarR2 = lfx.R(linVar, "_uwa");
                                        if (lipVarR2 != null) {
                                            lValueOf = Long.valueOf(lipVarR2.e);
                                        }
                                    } else {
                                        zO = zO;
                                        zM = zM;
                                        zF = zF;
                                    }
                                    z5 = true;
                                }
                                z6 = zM;
                                z7 = zO;
                                z8 = zF;
                                if (z4) {
                                    builder3.copyOnWrite();
                                    ((lir) builder3.instance).e = lir.emptyProtobufList();
                                    builder3.J(arrayList3);
                                }
                                if (z5) {
                                    X(((lir) builder3.instance).r, true, lValueOf2, lValueOf);
                                }
                            } else {
                                z6 = zM;
                                z7 = zO;
                                z8 = zF;
                            }
                            if (((lir) builder3.instance).e.size() != 0) {
                                if (i().F(str, lcl.aA)) {
                                    long jD2 = q().d(((lir) builder3.build()).toByteArray());
                                    builder3.copyOnWrite();
                                    lir lirVar111 = (lir) builder3.instance;
                                    lirVar111.c |= 32;
                                    lirVar111.N = jD2;
                                }
                                obj7 = sdoVarG.b;
                                if (obj7 != null) {
                                    builder3.copyOnWrite();
                                    lir lirVar112 = (lir) builder3.instance;
                                    lirVar112.aa = (liw) obj7;
                                    lirVar112.c |= 67108864;
                                }
                                aihfVarCreateBuilder.bi(builder3);
                            }
                            i++;
                            size = i10;
                            listSubList = list2;
                            z = z3;
                            zO = z7;
                            zM = z6;
                            zF = z8;
                        }
                        if (((liq) aihfVarCreateBuilder.instance).c.size() == 0) {
                            T(arrayList);
                            L(false, 204, null, null, str, Collections.EMPTY_LIST, null);
                            return;
                        }
                        liqVarAy = (liq) aihfVarCreateBuilder.build();
                        arrayList2 = new ArrayList();
                        str2 = "com.google.android.gms.measurement.BATCHES_AVAILABLE";
                        if (i().F(str, lcl.O)) {
                            obj3 = sdoVarG.d;
                            lhoVar = lho.SGTM_CLIENT;
                            if (obj3 == lhoVar) {
                                A();
                                D();
                                if (aF(liqVarAy)) {
                                    string3 = UUID.randomUUID().toString();
                                } else {
                                    string3 = null;
                                }
                                liqVarAy2 = ay(str, liqVarAy, string3);
                                builder2 = liqVarAy2.toBuilder();
                                i3 = 0;
                                while (i3 < liqVarAy2.c.size()) {
                                    aihf builder7 = ((lir) liqVarAy2.c.get(i3)).toBuilder();
                                    builder7.copyOnWrite();
                                    Object obj9 = obj3;
                                    lir lirVar113 = (lir) builder7.instance;
                                    lirVar113.b &= -3;
                                    lirVar113.g = 0L;
                                    builder7.copyOnWrite();
                                    lir lirVar114 = (lir) builder7.instance;
                                    lirVar114.c |= 134217728;
                                    lirVar114.ab = j;
                                    builder2.bj(i3, builder7);
                                    i3++;
                                    liqVarAy2 = liqVarAy2;
                                    obj3 = obj9;
                                    lhoVar = lhoVar;
                                }
                                obj4 = obj3;
                                lho lhoVar3 = lhoVar;
                                v().F();
                                if (!TextUtils.isEmpty(string3)) {
                                    liq liqVarAx2 = ax(liqVarAy, string3);
                                    sdo sdoVarE2 = lfpVar.e(str, true);
                                    obj5 = obj4;
                                    long jA4 = v().a(str, liqVarAx2, (String) sdoVarE2.a, sdoVarE2.o(), (lho) sdoVarE2.d, null);
                                    if (jA4 != j2) {
                                    }
                                    long jA5 = v().a(str, (liq) builder2.build(), (String) sdoVarG.a, sdoVarG.o(), (lho) obj5, lValueOf3);
                                    if (i().F(null, lcl.aR) && i().F(null, lcl.bb) && jA5 != j2) {
                                        aB(str, "queued_batches");
                                    }
                                    listAi = v().ai(str, lfm.a(lhoVar3), 1);
                                    if (!listAi.isEmpty()) {
                                        j3 = ((lfw) listAi.get(0)).g;
                                        if (j > ((Long) lcl.Q.b(null)).longValue() + j3) {
                                            aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j3));
                                        }
                                    }
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        v().O(((Long) it.next()).longValue());
                                    }
                                    v().Y();
                                    v().S();
                                    this.l = 0L;
                                    obj6 = sdoVarG.a;
                                    if (ae(str, (String) obj6)) {
                                        aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                        Intent intent5 = new Intent();
                                        intent5.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        intent5.setPackage(str);
                                        rpi.D(aS(), intent5);
                                    } else {
                                        aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj6);
                                    }
                                    aU().j(new lei(this, 7));
                                    return;
                                }
                                obj5 = obj4;
                                long jA6 = v().a(str, (liq) builder2.build(), (String) sdoVarG.a, sdoVarG.o(), (lho) obj5, lValueOf3);
                                if (i().F(null, lcl.aR)) {
                                    aB(str, "queued_batches");
                                }
                                listAi = v().ai(str, lfm.a(lhoVar3), 1);
                                if (!listAi.isEmpty()) {
                                    j3 = ((lfw) listAi.get(0)).g;
                                    if (j > ((Long) lcl.Q.b(null)).longValue() + j3) {
                                        aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j3));
                                    }
                                }
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    v().O(((Long) it.next()).longValue());
                                }
                                v().Y();
                                v().S();
                                this.l = 0L;
                                obj6 = sdoVarG.a;
                                if (ae(str, (String) obj6)) {
                                    aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                    Intent intent6 = new Intent();
                                    intent6.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent6.setPackage(str);
                                    rpi.D(aS(), intent6);
                                } else {
                                    aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj6);
                                }
                                aU().j(new lei(this, 7));
                                return;
                            }
                            if (obj3 == lho.SGTM) {
                                if (aF(liqVarAy)) {
                                    string2 = UUID.randomUUID().toString();
                                } else {
                                    string2 = null;
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    arrayList2.add(Pair.create(ax(liqVarAy, string2), lfpVar.e(str, false)));
                                }
                                liqVarAy = ay(str, liqVarAy, string2);
                            }
                        } else {
                            obj = sdoVarG.d;
                            if (obj == lho.SGTM_CLIENT) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (obj == lho.SGTM) {
                                if (aF((liq) aihfVarCreateBuilder.build())) {
                                    string = UUID.randomUUID().toString();
                                } else {
                                    string = null;
                                }
                                liqVarAy = ay(str, (liq) aihfVarCreateBuilder.build(), string);
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList2.add(Pair.create(ax((liq) aihfVarCreateBuilder.build(), string), lfpVar.e(str, z2)));
                                }
                                if (z2) {
                                    builder = liqVarAy.toBuilder();
                                    i2 = 0;
                                    while (i2 < liqVarAy.c.size()) {
                                        aihf builder8 = ((lir) liqVarAy.c.get(i2)).toBuilder();
                                        builder8.copyOnWrite();
                                        lir lirVar115 = (lir) builder8.instance;
                                        lirVar115.b &= -3;
                                        lirVar115.g = 0L;
                                        builder8.copyOnWrite();
                                        lir lirVar116 = (lir) builder8.instance;
                                        lirVar116.c |= 134217728;
                                        lirVar116.ab = j;
                                        builder.bj(i2, builder8);
                                        i2++;
                                        str2 = str2;
                                    }
                                    str3 = str2;
                                    arrayList2.add(Pair.create((liq) builder.build(), sdoVarG));
                                    T(arrayList);
                                    L(false, 204, null, null, str, arrayList2, null);
                                    obj2 = sdoVarG.a;
                                    if (ae(str, (String) obj2)) {
                                        aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj2);
                                        return;
                                    }
                                    aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                    Intent intent7 = new Intent();
                                    intent7.setAction(str3);
                                    intent7.setPackage(str);
                                    rpi.D(aS(), intent7);
                                    return;
                                }
                            } else if (z2) {
                                z2 = true;
                                if (aF((liq) aihfVarCreateBuilder.build())) {
                                    string = UUID.randomUUID().toString();
                                } else {
                                    string = null;
                                }
                                liqVarAy = ay(str, (liq) aihfVarCreateBuilder.build(), string);
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList2.add(Pair.create(ax((liq) aihfVarCreateBuilder.build(), string), lfpVar.e(str, z2)));
                                }
                                if (z2) {
                                    builder = liqVarAy.toBuilder();
                                    i2 = 0;
                                    while (i2 < liqVarAy.c.size()) {
                                        aihf builder9 = ((lir) liqVarAy.c.get(i2)).toBuilder();
                                        builder9.copyOnWrite();
                                        lir lirVar117 = (lir) builder9.instance;
                                        lirVar117.b &= -3;
                                        lirVar117.g = 0L;
                                        builder9.copyOnWrite();
                                        lir lirVar118 = (lir) builder9.instance;
                                        lirVar118.c |= 134217728;
                                        lirVar118.ab = j;
                                        builder.bj(i2, builder9);
                                        i2++;
                                        str2 = str2;
                                    }
                                    str3 = str2;
                                    arrayList2.add(Pair.create((liq) builder.build(), sdoVarG));
                                    T(arrayList);
                                    L(false, 204, null, null, str, arrayList2, null);
                                    obj2 = sdoVarG.a;
                                    if (ae(str, (String) obj2)) {
                                        aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj2);
                                        return;
                                    }
                                    aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                    Intent intent8 = new Intent();
                                    intent8.setAction(str3);
                                    intent8.setPackage(str);
                                    rpi.D(aS(), intent8);
                                    return;
                                }
                            }
                        }
                        if (l().c()) {
                            if (aT().i(2)) {
                                strM = q().m(liqVarAy);
                            } else {
                                strM = null;
                            }
                            q();
                            byte[] byteArray3 = liqVarAy.toByteArray();
                            T(arrayList);
                            if (i().F(null, lcl.aR) && i().F(null, lcl.bb) && sdoVarG.d == lho.SGTM) {
                                aB(str, "service_upload");
                            }
                            this.g.e.b(j);
                            aT().k.d("Uploading data. app, uncompressed size, data", str, Integer.valueOf(byteArray3.length), strM);
                            this.p = true;
                            l().d(str, sdoVarG, liqVarAy, new lfr(this, str, arrayList2, 1));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    cursorQuery = null;
                    lgpVarV.aT().c.c("Error querying bundles. appId", lcz.a(str), e);
                    listSubList = Collections.EMPTY_LIST;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (listSubList.isEmpty()) {
                        aT().k.b("No bundles to upload. appId", str);
                        return;
                    }
                    if (!i().F(str, lcl.M)) {
                    }
                    if (u(str).m()) {
                        it3 = listSubList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                str6 = null;
                                break;
                            }
                            lirVar3 = (lir) ((Pair) it3.next()).first;
                            if (!lirVar3.v.isEmpty()) {
                                str6 = lirVar3.v;
                                break;
                            }
                        }
                        if (str6 != null) {
                            while (i4 < listSubList.size()) {
                                lirVar2 = (lir) ((Pair) listSubList.get(i4)).first;
                                if (lirVar2.v.isEmpty()) {
                                }
                            }
                        }
                    }
                    aihfVarCreateBuilder = liq.a.createBuilder();
                    size = listSubList.size();
                    arrayList = new ArrayList(listSubList.size());
                    if (i().n(str)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zM = u(str).m();
                    zO = u(str).o();
                    autm.c();
                    zF = i().F(str, lcl.aM);
                    lfpVar = this.h;
                    sdoVarG = lfpVar.g(str);
                    i = 0;
                    while (i < size) {
                        builder3 = ((lir) ((Pair) listSubList.get(i)).first).toBuilder();
                        List list3 = listSubList;
                        arrayList.add((Long) ((Pair) listSubList.get(i)).second);
                        i();
                        builder3.copyOnWrite();
                        lir lirVar28 = (lir) builder3.instance;
                        int i11 = size;
                        lirVar28.b |= 32768;
                        z3 = z;
                        lirVar28.u = 192008L;
                        builder3.copyOnWrite();
                        lir lirVar29 = (lir) builder3.instance;
                        lirVar29.b |= 2;
                        lirVar29.g = j;
                        aW();
                        builder3.copyOnWrite();
                        lirVar = (lir) builder3.instance;
                        lirVar.b |= 8388608;
                        lirVar.C = false;
                        if (!z3) {
                            if (!lirVar.I.isEmpty()) {
                                aT().k.b("dsid is cleared since it's not enabled to upload", str);
                            }
                            builder3.copyOnWrite();
                            lir lirVar210 = (lir) builder3.instance;
                            lirVar210.b &= Alert.DURATION_SHOW_INDEFINITELY;
                            lirVar210.I = lir.a.I;
                        }
                        if (!zM) {
                            builder3.copyOnWrite();
                            lir lirVar211 = (lir) builder3.instance;
                            lirVar211.b &= -65537;
                            lirVar211.v = lir.a.v;
                            builder3.copyOnWrite();
                            lir lirVar212 = (lir) builder3.instance;
                            lirVar212.b &= -131073;
                            lirVar212.w = false;
                        }
                        if (!zO) {
                            builder3.copyOnWrite();
                            lir lirVar213 = (lir) builder3.instance;
                            lirVar213.b &= -262145;
                            lirVar213.x = lir.a.x;
                        }
                        ak(str, builder3);
                        if (!zF) {
                            builder3.copyOnWrite();
                            lir lirVar119 = (lir) builder3.instance;
                            lirVar119.c &= -8193;
                            lirVar119.P = lir.a.P;
                        }
                        if (!zO) {
                            builder3.copyOnWrite();
                            ((lir) builder3.instance).D = lir.emptyProtobufList();
                        }
                        str4 = ((lir) builder3.instance).v;
                        if (TextUtils.isEmpty(str4)) {
                            arrayList3 = new ArrayList(DesugarCollections.unmodifiableList(((lir) builder3.instance).e));
                            it2 = arrayList3.iterator();
                            lValueOf = null;
                            lValueOf2 = null;
                            z4 = false;
                            z5 = false;
                            while (it2.hasNext()) {
                                zM = zM;
                                linVar = (lin) it2.next();
                                zO = zO;
                                str5 = linVar.d;
                                zF = zF;
                                if ("_fx".equals(str5)) {
                                    it2.remove();
                                    z4 = true;
                                } else if ("_f".equals(str5)) {
                                    q();
                                    lipVarR = lfx.R(linVar, "_pfo");
                                    if (lipVarR != null) {
                                        lValueOf2 = Long.valueOf(lipVarR.e);
                                    }
                                    q();
                                    lipVarR2 = lfx.R(linVar, "_uwa");
                                    if (lipVarR2 != null) {
                                        lValueOf = Long.valueOf(lipVarR2.e);
                                    }
                                } else {
                                    zO = zO;
                                    zM = zM;
                                    zF = zF;
                                }
                                z5 = true;
                            }
                            z6 = zM;
                            z7 = zO;
                            z8 = zF;
                            if (z4) {
                                builder3.copyOnWrite();
                                ((lir) builder3.instance).e = lir.emptyProtobufList();
                                builder3.J(arrayList3);
                            }
                            if (z5) {
                                X(((lir) builder3.instance).r, true, lValueOf2, lValueOf);
                            }
                        } else {
                            arrayList3 = new ArrayList(DesugarCollections.unmodifiableList(((lir) builder3.instance).e));
                            it2 = arrayList3.iterator();
                            lValueOf = null;
                            lValueOf2 = null;
                            z4 = false;
                            z5 = false;
                            while (it2.hasNext()) {
                                zM = zM;
                                linVar = (lin) it2.next();
                                zO = zO;
                                str5 = linVar.d;
                                zF = zF;
                                if ("_fx".equals(str5)) {
                                    it2.remove();
                                    z4 = true;
                                } else if ("_f".equals(str5)) {
                                    q();
                                    lipVarR = lfx.R(linVar, "_pfo");
                                    if (lipVarR != null) {
                                        lValueOf2 = Long.valueOf(lipVarR.e);
                                    }
                                    q();
                                    lipVarR2 = lfx.R(linVar, "_uwa");
                                    if (lipVarR2 != null) {
                                        lValueOf = Long.valueOf(lipVarR2.e);
                                    }
                                } else {
                                    zO = zO;
                                    zM = zM;
                                    zF = zF;
                                }
                                z5 = true;
                            }
                            z6 = zM;
                            z7 = zO;
                            z8 = zF;
                            if (z4) {
                                builder3.copyOnWrite();
                                ((lir) builder3.instance).e = lir.emptyProtobufList();
                                builder3.J(arrayList3);
                            }
                            if (z5) {
                                X(((lir) builder3.instance).r, true, lValueOf2, lValueOf);
                            }
                        }
                        if (((lir) builder3.instance).e.size() != 0) {
                            if (i().F(str, lcl.aA)) {
                                long jD3 = q().d(((lir) builder3.build()).toByteArray());
                                builder3.copyOnWrite();
                                lir lirVar1110 = (lir) builder3.instance;
                                lirVar1110.c |= 32;
                                lirVar1110.N = jD3;
                            }
                            obj7 = sdoVarG.b;
                            if (obj7 != null) {
                                builder3.copyOnWrite();
                                lir lirVar1111 = (lir) builder3.instance;
                                lirVar1111.aa = (liw) obj7;
                                lirVar1111.c |= 67108864;
                            }
                            aihfVarCreateBuilder.bi(builder3);
                        }
                        i++;
                        size = i11;
                        listSubList = list3;
                        z = z3;
                        zO = z7;
                        zM = z6;
                        zF = z8;
                    }
                    if (((liq) aihfVarCreateBuilder.instance).c.size() == 0) {
                        T(arrayList);
                        L(false, 204, null, null, str, Collections.EMPTY_LIST, null);
                        return;
                    }
                    liqVarAy = (liq) aihfVarCreateBuilder.build();
                    arrayList2 = new ArrayList();
                    str2 = "com.google.android.gms.measurement.BATCHES_AVAILABLE";
                    if (i().F(str, lcl.O)) {
                        obj3 = sdoVarG.d;
                        lhoVar = lho.SGTM_CLIENT;
                        if (obj3 == lhoVar) {
                            A();
                            D();
                            if (aF(liqVarAy)) {
                                string3 = UUID.randomUUID().toString();
                            } else {
                                string3 = null;
                            }
                            liqVarAy2 = ay(str, liqVarAy, string3);
                            builder2 = liqVarAy2.toBuilder();
                            i3 = 0;
                            while (i3 < liqVarAy2.c.size()) {
                                aihf builder10 = ((lir) liqVarAy2.c.get(i3)).toBuilder();
                                builder10.copyOnWrite();
                                Object obj10 = obj3;
                                lir lirVar1112 = (lir) builder10.instance;
                                lirVar1112.b &= -3;
                                lirVar1112.g = 0L;
                                builder10.copyOnWrite();
                                lir lirVar1113 = (lir) builder10.instance;
                                lirVar1113.c |= 134217728;
                                lirVar1113.ab = j;
                                builder2.bj(i3, builder10);
                                i3++;
                                liqVarAy2 = liqVarAy2;
                                obj3 = obj10;
                                lhoVar = lhoVar;
                            }
                            obj4 = obj3;
                            lho lhoVar4 = lhoVar;
                            v().F();
                            if (!TextUtils.isEmpty(string3)) {
                                liq liqVarAx3 = ax(liqVarAy, string3);
                                sdo sdoVarE3 = lfpVar.e(str, true);
                                obj5 = obj4;
                                long jA7 = v().a(str, liqVarAx3, (String) sdoVarE3.a, sdoVarE3.o(), (lho) sdoVarE3.d, null);
                                if (jA7 != j2) {
                                }
                                long jA8 = v().a(str, (liq) builder2.build(), (String) sdoVarG.a, sdoVarG.o(), (lho) obj5, lValueOf3);
                                if (i().F(null, lcl.aR)) {
                                    aB(str, "queued_batches");
                                }
                                listAi = v().ai(str, lfm.a(lhoVar4), 1);
                                if (!listAi.isEmpty()) {
                                    j3 = ((lfw) listAi.get(0)).g;
                                    if (j > ((Long) lcl.Q.b(null)).longValue() + j3) {
                                        aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j3));
                                    }
                                }
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    v().O(((Long) it.next()).longValue());
                                }
                                v().Y();
                                v().S();
                                this.l = 0L;
                                obj6 = sdoVarG.a;
                                if (ae(str, (String) obj6)) {
                                    aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                    Intent intent9 = new Intent();
                                    intent9.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent9.setPackage(str);
                                    rpi.D(aS(), intent9);
                                } else {
                                    aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj6);
                                }
                                aU().j(new lei(this, 7));
                                return;
                            }
                            obj5 = obj4;
                            long jA9 = v().a(str, (liq) builder2.build(), (String) sdoVarG.a, sdoVarG.o(), (lho) obj5, lValueOf3);
                            if (i().F(null, lcl.aR)) {
                                aB(str, "queued_batches");
                            }
                            listAi = v().ai(str, lfm.a(lhoVar4), 1);
                            if (!listAi.isEmpty()) {
                                j3 = ((lfw) listAi.get(0)).g;
                                if (j > ((Long) lcl.Q.b(null)).longValue() + j3) {
                                    aT().f.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j3));
                                }
                            }
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                v().O(((Long) it.next()).longValue());
                            }
                            v().Y();
                            v().S();
                            this.l = 0L;
                            obj6 = sdoVarG.a;
                            if (ae(str, (String) obj6)) {
                                aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                Intent intent10 = new Intent();
                                intent10.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                intent10.setPackage(str);
                                rpi.D(aS(), intent10);
                            } else {
                                aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj6);
                            }
                            aU().j(new lei(this, 7));
                            return;
                        }
                        if (obj3 == lho.SGTM) {
                            if (aF(liqVarAy)) {
                                string2 = UUID.randomUUID().toString();
                            } else {
                                string2 = null;
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                arrayList2.add(Pair.create(ax(liqVarAy, string2), lfpVar.e(str, false)));
                            }
                            liqVarAy = ay(str, liqVarAy, string2);
                        }
                    } else {
                        obj = sdoVarG.d;
                        if (obj == lho.SGTM_CLIENT) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (obj == lho.SGTM) {
                            if (aF((liq) aihfVarCreateBuilder.build())) {
                                string = UUID.randomUUID().toString();
                            } else {
                                string = null;
                            }
                            liqVarAy = ay(str, (liq) aihfVarCreateBuilder.build(), string);
                            if (!TextUtils.isEmpty(string)) {
                                arrayList2.add(Pair.create(ax((liq) aihfVarCreateBuilder.build(), string), lfpVar.e(str, z2)));
                            }
                            if (z2) {
                                builder = liqVarAy.toBuilder();
                                i2 = 0;
                                while (i2 < liqVarAy.c.size()) {
                                    aihf builder11 = ((lir) liqVarAy.c.get(i2)).toBuilder();
                                    builder11.copyOnWrite();
                                    lir lirVar1114 = (lir) builder11.instance;
                                    lirVar1114.b &= -3;
                                    lirVar1114.g = 0L;
                                    builder11.copyOnWrite();
                                    lir lirVar1115 = (lir) builder11.instance;
                                    lirVar1115.c |= 134217728;
                                    lirVar1115.ab = j;
                                    builder.bj(i2, builder11);
                                    i2++;
                                    str2 = str2;
                                }
                                str3 = str2;
                                arrayList2.add(Pair.create((liq) builder.build(), sdoVarG));
                                T(arrayList);
                                L(false, 204, null, null, str, arrayList2, null);
                                obj2 = sdoVarG.a;
                                if (ae(str, (String) obj2)) {
                                    aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj2);
                                    return;
                                }
                                aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                Intent intent11 = new Intent();
                                intent11.setAction(str3);
                                intent11.setPackage(str);
                                rpi.D(aS(), intent11);
                                return;
                            }
                        } else if (z2) {
                            z2 = true;
                            if (aF((liq) aihfVarCreateBuilder.build())) {
                                string = UUID.randomUUID().toString();
                            } else {
                                string = null;
                            }
                            liqVarAy = ay(str, (liq) aihfVarCreateBuilder.build(), string);
                            if (!TextUtils.isEmpty(string)) {
                                arrayList2.add(Pair.create(ax((liq) aihfVarCreateBuilder.build(), string), lfpVar.e(str, z2)));
                            }
                            if (z2) {
                                builder = liqVarAy.toBuilder();
                                i2 = 0;
                                while (i2 < liqVarAy.c.size()) {
                                    aihf builder12 = ((lir) liqVarAy.c.get(i2)).toBuilder();
                                    builder12.copyOnWrite();
                                    lir lirVar1116 = (lir) builder12.instance;
                                    lirVar1116.b &= -3;
                                    lirVar1116.g = 0L;
                                    builder12.copyOnWrite();
                                    lir lirVar1117 = (lir) builder12.instance;
                                    lirVar1117.c |= 134217728;
                                    lirVar1117.ab = j;
                                    builder.bj(i2, builder12);
                                    i2++;
                                    str2 = str2;
                                }
                                str3 = str2;
                                arrayList2.add(Pair.create((liq) builder.build(), sdoVarG));
                                T(arrayList);
                                L(false, 204, null, null, str, arrayList2, null);
                                obj2 = sdoVarG.a;
                                if (ae(str, (String) obj2)) {
                                    aT().k.c("[sgtm] sgtm destination is not ready. appId, url", str, obj2);
                                    return;
                                }
                                aT().k.b("[sgtm] Sending sgtm batches available notification to app", str);
                                Intent intent12 = new Intent();
                                intent12.setAction(str3);
                                intent12.setPackage(str);
                                rpi.D(aS(), intent12);
                                return;
                            }
                        }
                    }
                    if (l().c()) {
                        if (aT().i(2)) {
                            strM = q().m(liqVarAy);
                        } else {
                            strM = null;
                        }
                        q();
                        byte[] byteArray4 = liqVarAy.toByteArray();
                        T(arrayList);
                        if (i().F(null, lcl.aR)) {
                            aB(str, "service_upload");
                        }
                        this.g.e.b(j);
                        aT().k.d("Uploading data. app, uncompressed size, data", str, Integer.valueOf(byteArray4.length), strM);
                        this.p = true;
                        l().d(str, sdoVarG, liqVarAy, new lfr(this, str, arrayList2, 1));
                    }
                }
            } catch (SQLiteException e10) {
                e = e10;
                j2 = -1;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    final void ab(String str) {
        liq liqVar;
        A();
        D();
        this.C = true;
        try {
            aW();
            Boolean bool = this.j.k().c;
            if (bool == null) {
                aT().f.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                aT().c.a("Upload called in the client side when service should be used");
            } else if (this.l > 0) {
                V();
            } else if (!l().c()) {
                aT().k.a("Network not connected, ignoring upload request");
                V();
            } else if (v().ac(str)) {
                lgp lgpVarV = v();
                kro.i(str);
                lgpVarV.o();
                lgpVarV.w();
                List listAi = lgpVarV.ai(str, lfm.a(lho.GOOGLE_SIGNAL), 1);
                lfw lfwVar = listAi.isEmpty() ? null : (lfw) listAi.get(0);
                if (lfwVar != null && (liqVar = lfwVar.c) != null) {
                    lcx lcxVar = aT().k;
                    lho lhoVar = lfwVar.f;
                    String str2 = lfwVar.d;
                    lcxVar.d("[sgtm] Uploading data from upload queue. appId, type, url", str, lhoVar, str2);
                    byte[] byteArray = liqVar.toByteArray();
                    if (aT().i(2)) {
                        aT().k.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(byteArray.length), q().m(liqVar));
                    }
                    sdo sdoVar = new sdo(str2, lfwVar.e, lhoVar, (liw) null);
                    this.p = true;
                    l().d(str, sdoVar, liqVar, new lfr(this, str, lfwVar, 0));
                }
            } else {
                aT().k.b("[sgtm] Upload queue has no batches for appId", str);
            }
        } finally {
            this.C = false;
            E();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x035b A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x036b A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0379 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03bf A[Catch: all -> 0x0d4d, TRY_LEAVE, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0421 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x044f  */
    /* JADX WARN: Code duplicated, block: B:127:0x046a  */
    /* JADX WARN: Code duplicated, block: B:128:0x046d A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x047a A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x04d4 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x04d9 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x04ee A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0512 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0514 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x052b A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0530 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x055b A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x057f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0586 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:162:0x05a7 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x05c5 A[Catch: all -> 0x0d4d, TRY_LEAVE, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x05e2 A[Catch: all -> 0x0d4d, TRY_ENTER, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x05fe A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0610 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0661 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x06a3 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x06c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x06d0 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0705 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0744 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x07bb A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x07d5 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x07ef A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0809 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0824 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0851 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0867  */
    /* JADX WARN: Code duplicated, block: B:220:0x089b A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x08f1 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:251:0x0a36 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x0a46 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x0a62 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0aa8 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:264:0x0ac7 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x0af2 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x0b18 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x0b8a A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:281:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:289:0x0c1f A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x0c56 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x0ccd A[Catch: SQLiteException -> 0x0ce2, all -> 0x0d4d, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0ce2, blocks: (B:299:0x0cbc, B:301:0x0ccd), top: B:324:0x0cbc, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0cdd  */
    /* JADX WARN: Code duplicated, block: B:349:0x0c2a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0c29 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:? A[LOOP:4: B:287:0x0c19->B:351:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x02fd A[Catch: all -> 0x0d4d, TRY_ENTER, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0317 A[Catch: all -> 0x0d4d, TryCatch #5 {all -> 0x0d4d, blocks: (B:76:0x02bb, B:79:0x02ca, B:81:0x02d2, B:85:0x02db, B:125:0x0459, B:134:0x048d, B:136:0x04d4, B:138:0x04d9, B:140:0x04ee, B:142:0x04fa, B:143:0x0509, B:145:0x0514, B:147:0x052b, B:149:0x0530, B:150:0x0545, B:152:0x055b, B:154:0x0567, B:155:0x0576, B:158:0x0586, B:162:0x05a7, B:163:0x05bc, B:164:0x05c5, B:167:0x05e2, B:168:0x05f6, B:170:0x05fe, B:172:0x060a, B:174:0x0610, B:175:0x0617, B:176:0x0624, B:182:0x0661, B:183:0x0674, B:185:0x06a3, B:188:0x06c5, B:190:0x06d0, B:192:0x0705, B:194:0x0711, B:197:0x0727, B:199:0x076f, B:201:0x07bb, B:202:0x07cd, B:204:0x07d5, B:205:0x07e7, B:207:0x07ef, B:208:0x0801, B:210:0x0809, B:211:0x081b, B:213:0x0824, B:214:0x0836, B:216:0x0851, B:218:0x0869, B:220:0x089b, B:221:0x08ab, B:223:0x08f1, B:225:0x08f5, B:228:0x0907, B:230:0x0924, B:231:0x093c, B:233:0x0946, B:235:0x0952, B:237:0x095c, B:239:0x0962, B:241:0x0972, B:243:0x0990, B:245:0x0996, B:246:0x099f, B:249:0x09b7, B:251:0x0a36, B:252:0x0a3c, B:254:0x0a46, B:256:0x0a62, B:257:0x0a6b, B:259:0x0aa8, B:260:0x0ab7, B:262:0x0ac1, B:264:0x0ac7, B:266:0x0ad1, B:267:0x0ae8, B:269:0x0af2, B:270:0x0b09, B:271:0x0b12, B:273:0x0b18, B:275:0x0b8a, B:277:0x0b94, B:279:0x0ba6, B:284:0x0bc4, B:285:0x0c03, B:286:0x0c0e, B:287:0x0c19, B:289:0x0c1f, B:298:0x0c69, B:299:0x0cbc, B:301:0x0ccd, B:313:0x0d1e, B:304:0x0cdf, B:306:0x0ce3, B:292:0x0c2a, B:294:0x0c56, B:309:0x0cf6, B:310:0x0d07, B:312:0x0d09, B:198:0x0744, B:179:0x064c, B:128:0x046d, B:129:0x0474, B:131:0x047a, B:133:0x0486, B:90:0x02f1, B:93:0x02fd, B:95:0x0317, B:101:0x0333, B:106:0x0365, B:108:0x036b, B:110:0x0379, B:112:0x038f, B:114:0x0395, B:121:0x0417, B:123:0x0421, B:115:0x03bf, B:116:0x03e3, B:120:0x0405, B:119:0x03f6, B:104:0x033f, B:105:0x035b), top: B:328:0x02bb, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0325  */
    final void ac(lcd lcdVar, lbg lbgVar) {
        lcc lccVar;
        String strD;
        long jLongValue;
        String upperCase;
        String strConcat;
        String str;
        aaqp aaqpVarAp;
        lgp lgpVarV;
        aaqp aaqpVar;
        double dLongValue;
        String str2;
        boolean zAn;
        boolean zEquals;
        lcc lccVar2;
        lcb lcbVar;
        long length;
        Object objC;
        byte[] bArr;
        String str3;
        lgl lglVarAg;
        long j;
        long jW;
        Bundle bundleA;
        lgp lgpVarV2;
        long jDelete;
        lbz lbzVar;
        ldr ldrVar;
        String str4;
        lca lcaVarJ;
        lbz lbzVar2;
        lca lcaVar;
        String str5;
        aihf aihfVarCreateBuilder;
        String str6;
        String str7;
        String str8;
        long j2;
        long j3;
        String str9;
        String str10;
        long j4;
        long j5;
        lgh lghVarH;
        long j6;
        lbd lbdVarH;
        int i;
        List listB;
        int i2;
        lgp lgpVarV3;
        lir lirVar;
        lgp lgpVarV4;
        lcb lcbVar2;
        boolean zM;
        int i3;
        String str11;
        ContentValues contentValues;
        String str12;
        String str13;
        boolean z;
        lbd lbdVarH2;
        lgp lgpVarV5;
        aaqp aaqpVarAp2;
        Object obj;
        long jMax;
        long jIntValue;
        String string;
        String string2;
        int i4;
        String str14;
        Object obj2;
        String str15 = "app_id";
        kro.l(lbgVar);
        String str16 = lbgVar.a;
        kro.i(str16);
        long jNanoTime = System.nanoTime();
        A();
        D();
        q();
        if (lfx.ab(lbgVar)) {
            if (!lbgVar.h) {
                e(lbgVar);
                return;
            }
            boolean zF = i().F(str16, lcl.aR);
            ldo ldoVarO = o();
            String str17 = lcdVar.a;
            if (ldoVarO.n(str16, str17)) {
                if (zF && i().F(str16, lcl.aU)) {
                    str14 = "_err";
                    obj2 = null;
                    v().T(str16, "event_dropped_count", "blocklisted", 1L, 0L);
                } else {
                    str14 = "_err";
                    obj2 = null;
                }
                aT().f.c("Dropping blocked event. appId", lcz.a(str16), k().c(str17));
                if (!o().j(str16) && !o().p(str16)) {
                    if (str14.equals(str17)) {
                        return;
                    }
                    r().R(this.L, str16, 11, "_ev", str17, 0);
                    return;
                }
                lbd lbdVarH3 = v().h(str16);
                if (lbdVarH3 != null) {
                    long jMax2 = Math.max(lbdVarH3.h(), lbdVarH3.e());
                    aV();
                    long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                    i();
                    if (jAbs > ((Long) lcl.Y.b(obj2)).longValue()) {
                        aT().j.a("Fetching config for blocked app");
                        F(lbdVarH3);
                        return;
                    }
                    return;
                }
                return;
            }
            String str18 = "_sid";
            String str19 = "_sno";
            if (((Boolean) lcl.bg.b(null)).booleanValue() && lbgVar.H) {
                if (lcdVar.d - lbgVar.I > lbgVar.G) {
                    aT().k.a("Current session is expired, remove the session number, ID, and engagement time");
                    v().W(str16, "_sid");
                    v().W(str16, "_sno");
                    v().W(str16, "_se");
                }
            }
            lda ldaVarB = lda.b(lcdVar);
            r().Q(ldaVarB, i().f(str16));
            int iD = i().D(str16, lcl.aq, 10, 35);
            Bundle bundle = ldaVarB.e;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            while (it.hasNext()) {
                String str20 = (String) it.next();
                if ("items".equals(str20)) {
                    lga lgaVarR = r();
                    String str21 = str18;
                    Parcelable[] parcelableArrK = aie.k(bundle, str20, Parcelable.class);
                    kro.l(parcelableArrK);
                    int length2 = parcelableArrK.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        int i6 = i5;
                        Bundle bundle2 = (Bundle) parcelableArrK[i5];
                        String str22 = str19;
                        Bundle bundle3 = bundle;
                        Iterator it2 = new TreeSet(bundle2.keySet()).iterator();
                        int i7 = 0;
                        boolean z2 = false;
                        while (it2.hasNext()) {
                            it2 = it2;
                            String str23 = (String) it2.next();
                            if (lga.an(str23)) {
                                i4 = i7;
                                if (!lga.ab(str23, led.d)) {
                                    i7 = i4 + 1;
                                    if (i7 > iD) {
                                        if (!z2) {
                                            lgaVarR.aT().e.c(a.bP(iD, "Param can't contain more than ", " item-scoped custom parameters"), lgaVarR.I().d(str23), lgaVarR.I().b(bundle2));
                                        }
                                        lga.av(bundle2, 28);
                                        bundle2.remove(str23);
                                        i7 = i7;
                                        it = it;
                                        length2 = length2;
                                        iD = iD;
                                        z2 = true;
                                    }
                                }
                            } else {
                                i4 = i7;
                            }
                            i7 = i4;
                            it = it;
                            length2 = length2;
                            iD = iD;
                        }
                        i5 = i6 + 1;
                        str19 = str22;
                        bundle = bundle3;
                    }
                    str18 = str21;
                }
            }
            String str24 = str18;
            String str25 = str19;
            lcd lcdVarA = ldaVarB.a();
            if (aT().i(2)) {
                lcx lcxVar = aT().k;
                lcu lcuVarK = k();
                hhc hhcVar = lcuVarK.d;
                if (hhcVar.c()) {
                    StringBuilder sb = new StringBuilder("origin=");
                    sb.append(lcdVarA.c);
                    sb.append(",name=");
                    sb.append(lcuVarK.c(lcdVarA.a));
                    sb.append(",params=");
                    lcc lccVar3 = lcdVarA.b;
                    if (lccVar3 == null) {
                        string = null;
                    } else {
                        string = !hhcVar.c() ? lccVar3.toString() : lcuVarK.b(lccVar3.a());
                    }
                    sb.append(string);
                    string2 = sb.toString();
                } else {
                    string2 = lcdVarA.toString();
                }
                lcxVar.b("Logging event", string2);
            }
            v().F();
            try {
                e(lbgVar);
                String str26 = lcdVarA.a;
                boolean z3 = "ecommerce_purchase".equals(str26) || "purchase".equals(str26) || "refund".equals(str26);
                if ("_iap".equals(str26)) {
                    lccVar = lcdVarA.b;
                    strD = lccVar.d("currency");
                    if (z3) {
                        double d = lccVar.a.getDouble("value");
                        Double.valueOf(d).getClass();
                        dLongValue = d * 1000000.0d;
                        if (dLongValue == 0.0d) {
                            dLongValue = lccVar.b("value").longValue() * 1000000.0d;
                        }
                        if (dLongValue <= 9.223372036854776E18d || dLongValue < -9.223372036854776E18d) {
                            aT().f.c("Data lost. Currency value is too big. appId", lcz.a(str16), Double.valueOf(dLongValue));
                            v().Y();
                        } else {
                            jLongValue = Math.round(dLongValue);
                            if ("refund".equals(str26)) {
                                jLongValue = -jLongValue;
                            }
                        }
                    } else {
                        str16 = str16;
                        jLongValue = lccVar.b("value").longValue();
                    }
                    if (TextUtils.isEmpty(strD)) {
                        str15 = "app_id";
                        str24 = str24;
                        str16 = str16;
                        str25 = str25;
                        str2 = lcdVarA.a;
                        zAn = lga.an(str2);
                        zEquals = "_err".equals(str2);
                        r();
                        lccVar2 = lcdVarA.b;
                        if (lccVar2 == null) {
                            length = 0;
                        } else {
                            lcbVar = new lcb(lccVar2);
                            length = 0;
                            while (lcbVar.hasNext()) {
                                objC = lccVar2.c(lcbVar.next());
                                if (objC instanceof Parcelable[]) {
                                    length += (long) ((Parcelable[]) objC).length;
                                }
                            }
                        }
                        bArr = null;
                        str3 = str16;
                        lglVarAg = v().ag(a(), str3, length + 1, true, zAn, false, zEquals, false, false);
                        j = lglVarAg.c;
                        i();
                        jW = j - lbt.w();
                        if (jW > 0) {
                            if (jW % 1000 == 1) {
                                aT().c.c("Data loss. Too many events logged. appId, count", lcz.a(str3), Long.valueOf(j));
                            }
                            if (zF) {
                                v().T(str3, "event_dropped_count", "quota_exceeded", 1L, 0L);
                            }
                            v().Y();
                        } else if (zAn) {
                            long j7 = lglVarAg.b;
                            i();
                            jIntValue = j7 - ((long) ((Integer) lcl.n.b(null)).intValue());
                            if (jIntValue > 0) {
                                if (jIntValue % 1000 == 1) {
                                    aT().c.c("Data loss. Too many public events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.b));
                                }
                                r().R(this.L, str3, 16, "_ev", lcdVarA.a, 0);
                                if (zF) {
                                    v().T(str3, "event_dropped_count", "quota_exceeded", 1L, 0L);
                                }
                                v().Y();
                            } else {
                                if (zEquals) {
                                    bundleA = lccVar2.a();
                                    r().S(bundleA, "_o", lcdVarA.c);
                                    if (r().ak(str3, lbgVar.B)) {
                                        r().S(bundleA, "_dbg", 1L);
                                        r().S(bundleA, "_r", 1L);
                                    }
                                    if ("_s".equals(str2)) {
                                        obj = aaqpVarAp2.c;
                                        if (obj instanceof Long) {
                                            r().S(bundleA, str25, obj);
                                        }
                                    }
                                    lgpVarV2 = v();
                                    kro.i(str3);
                                    lgpVarV2.o();
                                    lgpVarV2.w();
                                    jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                    if (jDelete > 0) {
                                        aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                    }
                                    ldrVar = this.j;
                                    lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                    lgp lgpVarV6 = v();
                                    str4 = lbzVar.b;
                                    lcaVarJ = lgpVarV6.j("events", str3, str4);
                                    if (lcaVarJ == null) {
                                        lgpVarV5 = v();
                                        kro.i(str3);
                                        if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                            r();
                                            if (!lga.ab(str4, lec.c)) {
                                                aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                                r().R(this.L, str3, 8, null, null, 0);
                                                if (zF) {
                                                    aU().j(new lfa(this, str3, 9, bArr));
                                                }
                                            }
                                        }
                                        lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                        lbzVar2 = lbzVar;
                                    } else {
                                        lbz lbzVar3 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                        lca lcaVarC = lcaVarJ.c(lbzVar3.d);
                                        lbzVar2 = lbzVar3;
                                        lcaVar = lcaVarC;
                                    }
                                    v().aa("events", lcaVar);
                                    A();
                                    D();
                                    kro.l(lbgVar);
                                    String str27 = lbzVar2.a;
                                    kro.i(str27);
                                    str5 = lbgVar.a;
                                    kro.c(str27.equals(str5));
                                    lir lirVar2 = lir.a;
                                    aihfVarCreateBuilder = lirVar2.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar3 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar3.b |= 1;
                                    lirVar3.d = 1;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar4 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar4.b |= 64;
                                    lirVar4.l = "android";
                                    if (!TextUtils.isEmpty(str5)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar5 = (lir) aihfVarCreateBuilder.instance;
                                        str5.getClass();
                                        lirVar5.b |= SemanticState.Obscured;
                                        lirVar5.r = str5;
                                    }
                                    str6 = lbgVar.d;
                                    if (!TextUtils.isEmpty(str6)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar6 = (lir) aihfVarCreateBuilder.instance;
                                        str6.getClass();
                                        lirVar6.b |= SemanticState.Modal;
                                        lirVar6.q = str6;
                                    }
                                    str7 = lbgVar.c;
                                    if (!TextUtils.isEmpty(str7)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar7 = (lir) aihfVarCreateBuilder.instance;
                                        str7.getClass();
                                        lirVar7.b |= SemanticState.Multiline;
                                        lirVar7.s = str7;
                                    }
                                    str8 = lbgVar.u;
                                    if (!TextUtils.isEmpty(str8)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar8 = (lir) aihfVarCreateBuilder.instance;
                                        str8.getClass();
                                        lirVar8.c |= SemanticState.Multiline;
                                        lirVar8.P = str8;
                                    }
                                    j2 = lbgVar.j;
                                    if (j2 != -2147483648L) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar9 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar9.b |= 33554432;
                                        lirVar9.F = (int) j2;
                                    }
                                    j3 = lbgVar.e;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar10 = (lir) aihfVarCreateBuilder.instance;
                                    str9 = str8;
                                    lirVar10.b |= 16384;
                                    lirVar10.t = j3;
                                    str10 = lbgVar.b;
                                    if (!TextUtils.isEmpty(str10)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar11 = (lir) aihfVarCreateBuilder.instance;
                                        str10.getClass();
                                        lirVar11.b |= 4194304;
                                        lirVar11.B = str10;
                                    }
                                    kro.l(str5);
                                    lgh lghVarU = u(str5);
                                    String str28 = lbgVar.s;
                                    String strK = lghVarU.h(lgh.g(str28, 100)).k();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar12 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar12.c |= SemanticState.Focused;
                                    lirVar12.O = strK;
                                    j4 = lbgVar.f;
                                    if (j4 != 0) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar13 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar13.b |= 524288;
                                        lirVar13.y = j4;
                                    }
                                    j5 = lbgVar.q;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar14 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar14.c |= 16;
                                    lirVar14.M = j5;
                                    i();
                                    String str29 = (String) aurg.a.io();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar15 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar15.c |= 1073741824;
                                    lirVar15.ad = str29;
                                    kro.l(str5);
                                    lghVarH = u(str5).h(lgh.g(str28, 100));
                                    if (lghVarH.m()) {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    } else {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    }
                                    String strB = j().b();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar16 = (lir) aihfVarCreateBuilder.instance;
                                    strB.getClass();
                                    lirVar16.b |= SemanticState.Hidden;
                                    lirVar16.n = strB;
                                    String strC = j().c();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar17 = (lir) aihfVarCreateBuilder.instance;
                                    strC.getClass();
                                    lirVar17.b |= SemanticState.Focused;
                                    lirVar17.m = strC;
                                    int iA = (int) j().a();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar18 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar18.b |= SemanticState.ReadOnly;
                                    lirVar18.p = iA;
                                    String strD2 = j().d();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar19 = (lir) aihfVarCreateBuilder.instance;
                                    strD2.getClass();
                                    lirVar19.b |= SemanticState.LiveRegion;
                                    lirVar19.o = strD2;
                                    long j8 = lbgVar.w;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar20 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar20.c |= 32768;
                                    lirVar20.S = j8;
                                    if (r38.w()) {
                                        String str30 = ((lir) aihfVarCreateBuilder.instance).r;
                                    }
                                    lbdVarH = v().h(str5);
                                    if (lbdVarH == null) {
                                        lbdVarH = new lbd(ldrVar, str5);
                                        lbdVarH.M(x(lghVarH));
                                        lbdVarH.V(lbgVar.k);
                                        lbdVarH.W(str10);
                                        if (lghVarH.m()) {
                                            lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                        }
                                        lbdVarH.aa(0L);
                                        lbdVarH.ab(0L);
                                        lbdVarH.Z(0L);
                                        lbdVarH.O(str7);
                                        lbdVarH.P(j2);
                                        lbdVarH.N(str6);
                                        lbdVarH.X(j3);
                                        lbdVarH.S(j4);
                                        lbdVarH.ae(lbgVar.h);
                                        lbdVarH.T(j6);
                                        if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                            lbdVarH.ad(lbgVar.G);
                                            lbdVarH.L(lbgVar.H);
                                            lbdVarH.al(lbgVar.I);
                                        }
                                        i = 0;
                                        v().an(lbdVarH, false);
                                    } else {
                                        i = 0;
                                    }
                                    if (lghVarH.o()) {
                                        String strX = lbdVarH.x();
                                        kro.l(strX);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar21 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar21.b |= 262144;
                                        lirVar21.x = strX;
                                    }
                                    if (!TextUtils.isEmpty(lbdVarH.A())) {
                                        String strA = lbdVarH.A();
                                        kro.l(strA);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar22 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar22.b |= 16777216;
                                        lirVar22.E = strA;
                                    }
                                    listB = v().B(str5);
                                    i2 = i;
                                    while (i2 < listB.size()) {
                                        aihf aihfVarCreateBuilder2 = lix.a.createBuilder();
                                        Object obj3 = ((aaqp) listB.get(i2)).d;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        lix lixVar = (lix) aihfVarCreateBuilder2.instance;
                                        obj3.getClass();
                                        lixVar.b |= 2;
                                        lixVar.d = (String) obj3;
                                        long j9 = ((aaqp) listB.get(i2)).a;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        lix lixVar2 = (lix) aihfVarCreateBuilder2.instance;
                                        lixVar2.b |= 1;
                                        lixVar2.c = j9;
                                        q().Y(aihfVarCreateBuilder2, ((aaqp) listB.get(i2)).c);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar23 = (lir) aihfVarCreateBuilder.instance;
                                        lix lixVar3 = (lix) aihfVarCreateBuilder2.build();
                                        lixVar3.getClass();
                                        lirVar23.b();
                                        lirVar23.f.add(lixVar3);
                                        str12 = str24;
                                        if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                            str13 = str9;
                                        } else {
                                            str13 = str9;
                                        }
                                        i2++;
                                        str24 = str12;
                                        str9 = str13;
                                    }
                                    lgpVarV3 = v();
                                    lirVar = (lir) aihfVarCreateBuilder.build();
                                    lgpVarV3.o();
                                    lgpVarV3.w();
                                    kro.l(lirVar);
                                    kro.i(lirVar.r);
                                    byte[] byteArray = lirVar.toByteArray();
                                    long jD = lgpVarV3.u().d(byteArray);
                                    ContentValues contentValues2 = new ContentValues();
                                    String str31 = str15;
                                    contentValues2.put(str31, lirVar.r);
                                    contentValues2.put("metadata_fingerprint", Long.valueOf(jD));
                                    contentValues2.put("metadata", byteArray);
                                    lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    lgpVarV4 = v();
                                    lcbVar2 = new lcb(lbzVar2.g);
                                    while (true) {
                                        if (lcbVar2.hasNext()) {
                                            ldo ldoVarO2 = o();
                                            String str32 = lbzVar2.a;
                                            zM = ldoVarO2.m(str32, lbzVar2.b);
                                            lgl lglVarAg2 = v().ag(a(), str32, 1L, false, false, false, false, false, false);
                                            if (zM) {
                                            }
                                            i3 = i;
                                            break;
                                        }
                                        if ("_r".equals(lcbVar2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    lgpVarV4.o();
                                    lgpVarV4.w();
                                    str11 = lbzVar2.a;
                                    kro.i(str11);
                                    byte[] byteArray2 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                    contentValues = new ContentValues();
                                    contentValues.put(str31, str11);
                                    contentValues.put("name", lbzVar2.b);
                                    contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jD));
                                    contentValues.put("data", byteArray2);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                    if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                        lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                    } else {
                                        this.l = 0L;
                                    }
                                    v().Y();
                                    v().S();
                                    V();
                                    aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                    return;
                                }
                                jMax = lglVarAg.e - ((long) Math.max(0, Math.min(1000000, i().C(lbgVar.a, lcl.m))));
                                if (jMax <= 0) {
                                    bundleA = lccVar2.a();
                                    r().S(bundleA, "_o", lcdVarA.c);
                                    if (r().ak(str3, lbgVar.B)) {
                                        r().S(bundleA, "_dbg", 1L);
                                        r().S(bundleA, "_r", 1L);
                                    }
                                    if ("_s".equals(str2)) {
                                        obj = aaqpVarAp2.c;
                                        if (obj instanceof Long) {
                                            r().S(bundleA, str25, obj);
                                        }
                                    }
                                    lgpVarV2 = v();
                                    kro.i(str3);
                                    lgpVarV2.o();
                                    lgpVarV2.w();
                                    jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                    if (jDelete > 0) {
                                        aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                    }
                                    ldrVar = this.j;
                                    lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                    lgp lgpVarV7 = v();
                                    str4 = lbzVar.b;
                                    lcaVarJ = lgpVarV7.j("events", str3, str4);
                                    if (lcaVarJ == null) {
                                        lgpVarV5 = v();
                                        kro.i(str3);
                                        if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                            r();
                                            if (!lga.ab(str4, lec.c)) {
                                                aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                                r().R(this.L, str3, 8, null, null, 0);
                                                if (zF) {
                                                    aU().j(new lfa(this, str3, 9, bArr));
                                                }
                                            }
                                        }
                                        lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                        lbzVar2 = lbzVar;
                                    } else {
                                        lbz lbzVar4 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                        lca lcaVarC2 = lcaVarJ.c(lbzVar4.d);
                                        lbzVar2 = lbzVar4;
                                        lcaVar = lcaVarC2;
                                    }
                                    v().aa("events", lcaVar);
                                    A();
                                    D();
                                    kro.l(lbgVar);
                                    String str210 = lbzVar2.a;
                                    kro.i(str210);
                                    str5 = lbgVar.a;
                                    kro.c(str210.equals(str5));
                                    lir lirVar24 = lir.a;
                                    aihfVarCreateBuilder = lirVar24.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar25 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar25.b |= 1;
                                    lirVar25.d = 1;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar26 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar26.b |= 64;
                                    lirVar26.l = "android";
                                    if (!TextUtils.isEmpty(str5)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar27 = (lir) aihfVarCreateBuilder.instance;
                                        str5.getClass();
                                        lirVar27.b |= SemanticState.Obscured;
                                        lirVar27.r = str5;
                                    }
                                    str6 = lbgVar.d;
                                    if (!TextUtils.isEmpty(str6)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar28 = (lir) aihfVarCreateBuilder.instance;
                                        str6.getClass();
                                        lirVar28.b |= SemanticState.Modal;
                                        lirVar28.q = str6;
                                    }
                                    str7 = lbgVar.c;
                                    if (!TextUtils.isEmpty(str7)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar29 = (lir) aihfVarCreateBuilder.instance;
                                        str7.getClass();
                                        lirVar29.b |= SemanticState.Multiline;
                                        lirVar29.s = str7;
                                    }
                                    str8 = lbgVar.u;
                                    if (!TextUtils.isEmpty(str8)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar30 = (lir) aihfVarCreateBuilder.instance;
                                        str8.getClass();
                                        lirVar30.c |= SemanticState.Multiline;
                                        lirVar30.P = str8;
                                    }
                                    j2 = lbgVar.j;
                                    if (j2 != -2147483648L) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar31 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar31.b |= 33554432;
                                        lirVar31.F = (int) j2;
                                    }
                                    j3 = lbgVar.e;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar110 = (lir) aihfVarCreateBuilder.instance;
                                    str9 = str8;
                                    lirVar110.b |= 16384;
                                    lirVar110.t = j3;
                                    str10 = lbgVar.b;
                                    if (!TextUtils.isEmpty(str10)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar111 = (lir) aihfVarCreateBuilder.instance;
                                        str10.getClass();
                                        lirVar111.b |= 4194304;
                                        lirVar111.B = str10;
                                    }
                                    kro.l(str5);
                                    lgh lghVarU2 = u(str5);
                                    String str211 = lbgVar.s;
                                    String strK2 = lghVarU2.h(lgh.g(str211, 100)).k();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar112.c |= SemanticState.Focused;
                                    lirVar112.O = strK2;
                                    j4 = lbgVar.f;
                                    if (j4 != 0) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar113 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar113.b |= 524288;
                                        lirVar113.y = j4;
                                    }
                                    j5 = lbgVar.q;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar114 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar114.c |= 16;
                                    lirVar114.M = j5;
                                    i();
                                    String str212 = (String) aurg.a.io();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar115 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar115.c |= 1073741824;
                                    lirVar115.ad = str212;
                                    kro.l(str5);
                                    lghVarH = u(str5).h(lgh.g(str211, 100));
                                    if (lghVarH.m()) {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    } else {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    }
                                    String strB2 = j().b();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar116 = (lir) aihfVarCreateBuilder.instance;
                                    strB2.getClass();
                                    lirVar116.b |= SemanticState.Hidden;
                                    lirVar116.n = strB2;
                                    String strC2 = j().c();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar117 = (lir) aihfVarCreateBuilder.instance;
                                    strC2.getClass();
                                    lirVar117.b |= SemanticState.Focused;
                                    lirVar117.m = strC2;
                                    int iA2 = (int) j().a();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar118 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar118.b |= SemanticState.ReadOnly;
                                    lirVar118.p = iA2;
                                    String strD3 = j().d();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar119 = (lir) aihfVarCreateBuilder.instance;
                                    strD3.getClass();
                                    lirVar119.b |= SemanticState.LiveRegion;
                                    lirVar119.o = strD3;
                                    long j10 = lbgVar.w;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar210 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar210.c |= 32768;
                                    lirVar210.S = j10;
                                    if (r38.w()) {
                                        String str33 = ((lir) aihfVarCreateBuilder.instance).r;
                                    }
                                    lbdVarH = v().h(str5);
                                    if (lbdVarH == null) {
                                        lbdVarH = new lbd(ldrVar, str5);
                                        lbdVarH.M(x(lghVarH));
                                        lbdVarH.V(lbgVar.k);
                                        lbdVarH.W(str10);
                                        if (lghVarH.m()) {
                                            lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                        }
                                        lbdVarH.aa(0L);
                                        lbdVarH.ab(0L);
                                        lbdVarH.Z(0L);
                                        lbdVarH.O(str7);
                                        lbdVarH.P(j2);
                                        lbdVarH.N(str6);
                                        lbdVarH.X(j3);
                                        lbdVarH.S(j4);
                                        lbdVarH.ae(lbgVar.h);
                                        lbdVarH.T(j6);
                                        if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                            lbdVarH.ad(lbgVar.G);
                                            lbdVarH.L(lbgVar.H);
                                            lbdVarH.al(lbgVar.I);
                                        }
                                        i = 0;
                                        v().an(lbdVarH, false);
                                    } else {
                                        i = 0;
                                    }
                                    if (lghVarH.o()) {
                                        String strX2 = lbdVarH.x();
                                        kro.l(strX2);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar211.b |= 262144;
                                        lirVar211.x = strX2;
                                    }
                                    if (!TextUtils.isEmpty(lbdVarH.A())) {
                                        String strA2 = lbdVarH.A();
                                        kro.l(strA2);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar212 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar212.b |= 16777216;
                                        lirVar212.E = strA2;
                                    }
                                    listB = v().B(str5);
                                    i2 = i;
                                    while (i2 < listB.size()) {
                                        aihf aihfVarCreateBuilder3 = lix.a.createBuilder();
                                        Object obj4 = ((aaqp) listB.get(i2)).d;
                                        aihfVarCreateBuilder3.copyOnWrite();
                                        lix lixVar4 = (lix) aihfVarCreateBuilder3.instance;
                                        obj4.getClass();
                                        lixVar4.b |= 2;
                                        lixVar4.d = (String) obj4;
                                        long j11 = ((aaqp) listB.get(i2)).a;
                                        aihfVarCreateBuilder3.copyOnWrite();
                                        lix lixVar5 = (lix) aihfVarCreateBuilder3.instance;
                                        lixVar5.b |= 1;
                                        lixVar5.c = j11;
                                        q().Y(aihfVarCreateBuilder3, ((aaqp) listB.get(i2)).c);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar213 = (lir) aihfVarCreateBuilder.instance;
                                        lix lixVar6 = (lix) aihfVarCreateBuilder3.build();
                                        lixVar6.getClass();
                                        lirVar213.b();
                                        lirVar213.f.add(lixVar6);
                                        str12 = str24;
                                        if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                            str13 = str9;
                                        } else {
                                            str13 = str9;
                                        }
                                        i2++;
                                        str24 = str12;
                                        str9 = str13;
                                    }
                                    lgpVarV3 = v();
                                    lirVar = (lir) aihfVarCreateBuilder.build();
                                    lgpVarV3.o();
                                    lgpVarV3.w();
                                    kro.l(lirVar);
                                    kro.i(lirVar.r);
                                    byte[] byteArray3 = lirVar.toByteArray();
                                    long jD2 = lgpVarV3.u().d(byteArray3);
                                    ContentValues contentValues3 = new ContentValues();
                                    String str34 = str15;
                                    contentValues3.put(str34, lirVar.r);
                                    contentValues3.put("metadata_fingerprint", Long.valueOf(jD2));
                                    contentValues3.put("metadata", byteArray3);
                                    lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                                    lgpVarV4 = v();
                                    lcbVar2 = new lcb(lbzVar2.g);
                                    while (true) {
                                        if (lcbVar2.hasNext()) {
                                            ldo ldoVarO3 = o();
                                            String str35 = lbzVar2.a;
                                            zM = ldoVarO3.m(str35, lbzVar2.b);
                                            lgl lglVarAg3 = v().ag(a(), str35, 1L, false, false, false, false, false, false);
                                            if (zM) {
                                            }
                                            i3 = i;
                                            break;
                                        }
                                        if ("_r".equals(lcbVar2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    lgpVarV4.o();
                                    lgpVarV4.w();
                                    str11 = lbzVar2.a;
                                    kro.i(str11);
                                    byte[] byteArray4 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                    contentValues = new ContentValues();
                                    contentValues.put(str34, str11);
                                    contentValues.put("name", lbzVar2.b);
                                    contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jD2));
                                    contentValues.put("data", byteArray4);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                    if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                        lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                    } else {
                                        this.l = 0L;
                                    }
                                    v().Y();
                                    v().S();
                                    V();
                                    aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                    return;
                                }
                                if (jMax == 1) {
                                    aT().c.c("Too many error events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.e));
                                }
                                v().Y();
                            }
                        } else {
                            if (zEquals) {
                                bundleA = lccVar2.a();
                                r().S(bundleA, "_o", lcdVarA.c);
                                if (r().ak(str3, lbgVar.B)) {
                                    r().S(bundleA, "_dbg", 1L);
                                    r().S(bundleA, "_r", 1L);
                                }
                                if ("_s".equals(str2)) {
                                    obj = aaqpVarAp2.c;
                                    if (obj instanceof Long) {
                                        r().S(bundleA, str25, obj);
                                    }
                                }
                                lgpVarV2 = v();
                                kro.i(str3);
                                lgpVarV2.o();
                                lgpVarV2.w();
                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                if (jDelete > 0) {
                                    aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                }
                                ldrVar = this.j;
                                lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                lgp lgpVarV8 = v();
                                str4 = lbzVar.b;
                                lcaVarJ = lgpVarV8.j("events", str3, str4);
                                if (lcaVarJ == null) {
                                    lgpVarV5 = v();
                                    kro.i(str3);
                                    if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                        r();
                                        if (!lga.ab(str4, lec.c)) {
                                            aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                            r().R(this.L, str3, 8, null, null, 0);
                                            if (zF) {
                                                aU().j(new lfa(this, str3, 9, bArr));
                                            }
                                        }
                                    }
                                    lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                    lbzVar2 = lbzVar;
                                } else {
                                    lbz lbzVar5 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                    lca lcaVarC3 = lcaVarJ.c(lbzVar5.d);
                                    lbzVar2 = lbzVar5;
                                    lcaVar = lcaVarC3;
                                }
                                v().aa("events", lcaVar);
                                A();
                                D();
                                kro.l(lbgVar);
                                String str213 = lbzVar2.a;
                                kro.i(str213);
                                str5 = lbgVar.a;
                                kro.c(str213.equals(str5));
                                lir lirVar214 = lir.a;
                                aihfVarCreateBuilder = lirVar214.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar215 = (lir) aihfVarCreateBuilder.instance;
                                lirVar215.b |= 1;
                                lirVar215.d = 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar216 = (lir) aihfVarCreateBuilder.instance;
                                lirVar216.b |= 64;
                                lirVar216.l = "android";
                                if (!TextUtils.isEmpty(str5)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar217 = (lir) aihfVarCreateBuilder.instance;
                                    str5.getClass();
                                    lirVar217.b |= SemanticState.Obscured;
                                    lirVar217.r = str5;
                                }
                                str6 = lbgVar.d;
                                if (!TextUtils.isEmpty(str6)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar218 = (lir) aihfVarCreateBuilder.instance;
                                    str6.getClass();
                                    lirVar218.b |= SemanticState.Modal;
                                    lirVar218.q = str6;
                                }
                                str7 = lbgVar.c;
                                if (!TextUtils.isEmpty(str7)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar219 = (lir) aihfVarCreateBuilder.instance;
                                    str7.getClass();
                                    lirVar219.b |= SemanticState.Multiline;
                                    lirVar219.s = str7;
                                }
                                str8 = lbgVar.u;
                                if (!TextUtils.isEmpty(str8)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar32 = (lir) aihfVarCreateBuilder.instance;
                                    str8.getClass();
                                    lirVar32.c |= SemanticState.Multiline;
                                    lirVar32.P = str8;
                                }
                                j2 = lbgVar.j;
                                if (j2 != -2147483648L) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar33 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar33.b |= 33554432;
                                    lirVar33.F = (int) j2;
                                }
                                j3 = lbgVar.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1110 = (lir) aihfVarCreateBuilder.instance;
                                str9 = str8;
                                lirVar1110.b |= 16384;
                                lirVar1110.t = j3;
                                str10 = lbgVar.b;
                                if (!TextUtils.isEmpty(str10)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111 = (lir) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    lirVar1111.b |= 4194304;
                                    lirVar1111.B = str10;
                                }
                                kro.l(str5);
                                lgh lghVarU3 = u(str5);
                                String str214 = lbgVar.s;
                                String strK3 = lghVarU3.h(lgh.g(str214, 100)).k();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1112.c |= SemanticState.Focused;
                                lirVar1112.O = strK3;
                                j4 = lbgVar.f;
                                if (j4 != 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1113 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar1113.b |= 524288;
                                    lirVar1113.y = j4;
                                }
                                j5 = lbgVar.q;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1114 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1114.c |= 16;
                                lirVar1114.M = j5;
                                i();
                                String str215 = (String) aurg.a.io();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1115.c |= 1073741824;
                                lirVar1115.ad = str215;
                                kro.l(str5);
                                lghVarH = u(str5).h(lgh.g(str214, 100));
                                if (lghVarH.m()) {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                } else {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                }
                                String strB3 = j().b();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1116 = (lir) aihfVarCreateBuilder.instance;
                                strB3.getClass();
                                lirVar1116.b |= SemanticState.Hidden;
                                lirVar1116.n = strB3;
                                String strC3 = j().c();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1117 = (lir) aihfVarCreateBuilder.instance;
                                strC3.getClass();
                                lirVar1117.b |= SemanticState.Focused;
                                lirVar1117.m = strC3;
                                int iA3 = (int) j().a();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1118 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1118.b |= SemanticState.ReadOnly;
                                lirVar1118.p = iA3;
                                String strD4 = j().d();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1119 = (lir) aihfVarCreateBuilder.instance;
                                strD4.getClass();
                                lirVar1119.b |= SemanticState.LiveRegion;
                                lirVar1119.o = strD4;
                                long j12 = lbgVar.w;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2110 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2110.c |= 32768;
                                lirVar2110.S = j12;
                                if (r38.w()) {
                                    String str36 = ((lir) aihfVarCreateBuilder.instance).r;
                                }
                                lbdVarH = v().h(str5);
                                if (lbdVarH == null) {
                                    lbdVarH = new lbd(ldrVar, str5);
                                    lbdVarH.M(x(lghVarH));
                                    lbdVarH.V(lbgVar.k);
                                    lbdVarH.W(str10);
                                    if (lghVarH.m()) {
                                        lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                    }
                                    lbdVarH.aa(0L);
                                    lbdVarH.ab(0L);
                                    lbdVarH.Z(0L);
                                    lbdVarH.O(str7);
                                    lbdVarH.P(j2);
                                    lbdVarH.N(str6);
                                    lbdVarH.X(j3);
                                    lbdVarH.S(j4);
                                    lbdVarH.ae(lbgVar.h);
                                    lbdVarH.T(j6);
                                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                        lbdVarH.ad(lbgVar.G);
                                        lbdVarH.L(lbgVar.H);
                                        lbdVarH.al(lbgVar.I);
                                    }
                                    i = 0;
                                    v().an(lbdVarH, false);
                                } else {
                                    i = 0;
                                }
                                if (lghVarH.o()) {
                                    String strX3 = lbdVarH.x();
                                    kro.l(strX3);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar2111.b |= 262144;
                                    lirVar2111.x = strX3;
                                }
                                if (!TextUtils.isEmpty(lbdVarH.A())) {
                                    String strA3 = lbdVarH.A();
                                    kro.l(strA3);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar2112.b |= 16777216;
                                    lirVar2112.E = strA3;
                                }
                                listB = v().B(str5);
                                i2 = i;
                                while (i2 < listB.size()) {
                                    aihf aihfVarCreateBuilder4 = lix.a.createBuilder();
                                    Object obj5 = ((aaqp) listB.get(i2)).d;
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    lix lixVar7 = (lix) aihfVarCreateBuilder4.instance;
                                    obj5.getClass();
                                    lixVar7.b |= 2;
                                    lixVar7.d = (String) obj5;
                                    long j13 = ((aaqp) listB.get(i2)).a;
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    lix lixVar8 = (lix) aihfVarCreateBuilder4.instance;
                                    lixVar8.b |= 1;
                                    lixVar8.c = j13;
                                    q().Y(aihfVarCreateBuilder4, ((aaqp) listB.get(i2)).c);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2113 = (lir) aihfVarCreateBuilder.instance;
                                    lix lixVar9 = (lix) aihfVarCreateBuilder4.build();
                                    lixVar9.getClass();
                                    lirVar2113.b();
                                    lirVar2113.f.add(lixVar9);
                                    str12 = str24;
                                    if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                        str13 = str9;
                                    } else {
                                        str13 = str9;
                                    }
                                    i2++;
                                    str24 = str12;
                                    str9 = str13;
                                }
                                lgpVarV3 = v();
                                lirVar = (lir) aihfVarCreateBuilder.build();
                                lgpVarV3.o();
                                lgpVarV3.w();
                                kro.l(lirVar);
                                kro.i(lirVar.r);
                                byte[] byteArray5 = lirVar.toByteArray();
                                long jD3 = lgpVarV3.u().d(byteArray5);
                                ContentValues contentValues4 = new ContentValues();
                                String str37 = str15;
                                contentValues4.put(str37, lirVar.r);
                                contentValues4.put("metadata_fingerprint", Long.valueOf(jD3));
                                contentValues4.put("metadata", byteArray5);
                                lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                                lgpVarV4 = v();
                                lcbVar2 = new lcb(lbzVar2.g);
                                while (true) {
                                    if (lcbVar2.hasNext()) {
                                        ldo ldoVarO4 = o();
                                        String str38 = lbzVar2.a;
                                        zM = ldoVarO4.m(str38, lbzVar2.b);
                                        lgl lglVarAg4 = v().ag(a(), str38, 1L, false, false, false, false, false, false);
                                        if (zM) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(lcbVar2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lgpVarV4.o();
                                lgpVarV4.w();
                                str11 = lbzVar2.a;
                                kro.i(str11);
                                byte[] byteArray6 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                contentValues = new ContentValues();
                                contentValues.put(str37, str11);
                                contentValues.put("name", lbzVar2.b);
                                contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jD3));
                                contentValues.put("data", byteArray6);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                } else {
                                    this.l = 0L;
                                }
                                v().Y();
                                v().S();
                                V();
                                aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            jMax = lglVarAg.e - ((long) Math.max(0, Math.min(1000000, i().C(lbgVar.a, lcl.m))));
                            if (jMax <= 0) {
                                bundleA = lccVar2.a();
                                r().S(bundleA, "_o", lcdVarA.c);
                                if (r().ak(str3, lbgVar.B)) {
                                    r().S(bundleA, "_dbg", 1L);
                                    r().S(bundleA, "_r", 1L);
                                }
                                if ("_s".equals(str2)) {
                                    obj = aaqpVarAp2.c;
                                    if (obj instanceof Long) {
                                        r().S(bundleA, str25, obj);
                                    }
                                }
                                lgpVarV2 = v();
                                kro.i(str3);
                                lgpVarV2.o();
                                lgpVarV2.w();
                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                if (jDelete > 0) {
                                    aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                }
                                ldrVar = this.j;
                                lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                lgp lgpVarV9 = v();
                                str4 = lbzVar.b;
                                lcaVarJ = lgpVarV9.j("events", str3, str4);
                                if (lcaVarJ == null) {
                                    lgpVarV5 = v();
                                    kro.i(str3);
                                    if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                        r();
                                        if (!lga.ab(str4, lec.c)) {
                                            aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                            r().R(this.L, str3, 8, null, null, 0);
                                            if (zF) {
                                                aU().j(new lfa(this, str3, 9, bArr));
                                            }
                                        }
                                    }
                                    lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                    lbzVar2 = lbzVar;
                                } else {
                                    lbz lbzVar6 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                    lca lcaVarC4 = lcaVarJ.c(lbzVar6.d);
                                    lbzVar2 = lbzVar6;
                                    lcaVar = lcaVarC4;
                                }
                                v().aa("events", lcaVar);
                                A();
                                D();
                                kro.l(lbgVar);
                                String str216 = lbzVar2.a;
                                kro.i(str216);
                                str5 = lbgVar.a;
                                kro.c(str216.equals(str5));
                                lir lirVar2114 = lir.a;
                                aihfVarCreateBuilder = lirVar2114.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2115.b |= 1;
                                lirVar2115.d = 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2116 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2116.b |= 64;
                                lirVar2116.l = "android";
                                if (!TextUtils.isEmpty(str5)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2117 = (lir) aihfVarCreateBuilder.instance;
                                    str5.getClass();
                                    lirVar2117.b |= SemanticState.Obscured;
                                    lirVar2117.r = str5;
                                }
                                str6 = lbgVar.d;
                                if (!TextUtils.isEmpty(str6)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2118 = (lir) aihfVarCreateBuilder.instance;
                                    str6.getClass();
                                    lirVar2118.b |= SemanticState.Modal;
                                    lirVar2118.q = str6;
                                }
                                str7 = lbgVar.c;
                                if (!TextUtils.isEmpty(str7)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2119 = (lir) aihfVarCreateBuilder.instance;
                                    str7.getClass();
                                    lirVar2119.b |= SemanticState.Multiline;
                                    lirVar2119.s = str7;
                                }
                                str8 = lbgVar.u;
                                if (!TextUtils.isEmpty(str8)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar34 = (lir) aihfVarCreateBuilder.instance;
                                    str8.getClass();
                                    lirVar34.c |= SemanticState.Multiline;
                                    lirVar34.P = str8;
                                }
                                j2 = lbgVar.j;
                                if (j2 != -2147483648L) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar35 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar35.b |= 33554432;
                                    lirVar35.F = (int) j2;
                                }
                                j3 = lbgVar.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11110 = (lir) aihfVarCreateBuilder.instance;
                                str9 = str8;
                                lirVar11110.b |= 16384;
                                lirVar11110.t = j3;
                                str10 = lbgVar.b;
                                if (!TextUtils.isEmpty(str10)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar11111 = (lir) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    lirVar11111.b |= 4194304;
                                    lirVar11111.B = str10;
                                }
                                kro.l(str5);
                                lgh lghVarU4 = u(str5);
                                String str217 = lbgVar.s;
                                String strK4 = lghVarU4.h(lgh.g(str217, 100)).k();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11112.c |= SemanticState.Focused;
                                lirVar11112.O = strK4;
                                j4 = lbgVar.f;
                                if (j4 != 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar11113 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar11113.b |= 524288;
                                    lirVar11113.y = j4;
                                }
                                j5 = lbgVar.q;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11114 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11114.c |= 16;
                                lirVar11114.M = j5;
                                i();
                                String str218 = (String) aurg.a.io();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11115.c |= 1073741824;
                                lirVar11115.ad = str218;
                                kro.l(str5);
                                lghVarH = u(str5).h(lgh.g(str217, 100));
                                if (lghVarH.m()) {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                } else {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                }
                                String strB4 = j().b();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11116 = (lir) aihfVarCreateBuilder.instance;
                                strB4.getClass();
                                lirVar11116.b |= SemanticState.Hidden;
                                lirVar11116.n = strB4;
                                String strC4 = j().c();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11117 = (lir) aihfVarCreateBuilder.instance;
                                strC4.getClass();
                                lirVar11117.b |= SemanticState.Focused;
                                lirVar11117.m = strC4;
                                int iA4 = (int) j().a();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11118 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11118.b |= SemanticState.ReadOnly;
                                lirVar11118.p = iA4;
                                String strD5 = j().d();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11119 = (lir) aihfVarCreateBuilder.instance;
                                strD5.getClass();
                                lirVar11119.b |= SemanticState.LiveRegion;
                                lirVar11119.o = strD5;
                                long j14 = lbgVar.w;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21110 = (lir) aihfVarCreateBuilder.instance;
                                lirVar21110.c |= 32768;
                                lirVar21110.S = j14;
                                if (r38.w()) {
                                    String str39 = ((lir) aihfVarCreateBuilder.instance).r;
                                }
                                lbdVarH = v().h(str5);
                                if (lbdVarH == null) {
                                    lbdVarH = new lbd(ldrVar, str5);
                                    lbdVarH.M(x(lghVarH));
                                    lbdVarH.V(lbgVar.k);
                                    lbdVarH.W(str10);
                                    if (lghVarH.m()) {
                                        lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                    }
                                    lbdVarH.aa(0L);
                                    lbdVarH.ab(0L);
                                    lbdVarH.Z(0L);
                                    lbdVarH.O(str7);
                                    lbdVarH.P(j2);
                                    lbdVarH.N(str6);
                                    lbdVarH.X(j3);
                                    lbdVarH.S(j4);
                                    lbdVarH.ae(lbgVar.h);
                                    lbdVarH.T(j6);
                                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                        lbdVarH.ad(lbgVar.G);
                                        lbdVarH.L(lbgVar.H);
                                        lbdVarH.al(lbgVar.I);
                                    }
                                    i = 0;
                                    v().an(lbdVarH, false);
                                } else {
                                    i = 0;
                                }
                                if (lghVarH.o()) {
                                    String strX4 = lbdVarH.x();
                                    kro.l(strX4);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21111.b |= 262144;
                                    lirVar21111.x = strX4;
                                }
                                if (!TextUtils.isEmpty(lbdVarH.A())) {
                                    String strA4 = lbdVarH.A();
                                    kro.l(strA4);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21112.b |= 16777216;
                                    lirVar21112.E = strA4;
                                }
                                listB = v().B(str5);
                                i2 = i;
                                while (i2 < listB.size()) {
                                    aihf aihfVarCreateBuilder5 = lix.a.createBuilder();
                                    Object obj6 = ((aaqp) listB.get(i2)).d;
                                    aihfVarCreateBuilder5.copyOnWrite();
                                    lix lixVar10 = (lix) aihfVarCreateBuilder5.instance;
                                    obj6.getClass();
                                    lixVar10.b |= 2;
                                    lixVar10.d = (String) obj6;
                                    long j15 = ((aaqp) listB.get(i2)).a;
                                    aihfVarCreateBuilder5.copyOnWrite();
                                    lix lixVar11 = (lix) aihfVarCreateBuilder5.instance;
                                    lixVar11.b |= 1;
                                    lixVar11.c = j15;
                                    q().Y(aihfVarCreateBuilder5, ((aaqp) listB.get(i2)).c);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21113 = (lir) aihfVarCreateBuilder.instance;
                                    lix lixVar12 = (lix) aihfVarCreateBuilder5.build();
                                    lixVar12.getClass();
                                    lirVar21113.b();
                                    lirVar21113.f.add(lixVar12);
                                    str12 = str24;
                                    if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                        str13 = str9;
                                    } else {
                                        str13 = str9;
                                    }
                                    i2++;
                                    str24 = str12;
                                    str9 = str13;
                                }
                                lgpVarV3 = v();
                                lirVar = (lir) aihfVarCreateBuilder.build();
                                lgpVarV3.o();
                                lgpVarV3.w();
                                kro.l(lirVar);
                                kro.i(lirVar.r);
                                byte[] byteArray7 = lirVar.toByteArray();
                                long jD4 = lgpVarV3.u().d(byteArray7);
                                ContentValues contentValues5 = new ContentValues();
                                String str310 = str15;
                                contentValues5.put(str310, lirVar.r);
                                contentValues5.put("metadata_fingerprint", Long.valueOf(jD4));
                                contentValues5.put("metadata", byteArray7);
                                lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                lgpVarV4 = v();
                                lcbVar2 = new lcb(lbzVar2.g);
                                while (true) {
                                    if (lcbVar2.hasNext()) {
                                        ldo ldoVarO5 = o();
                                        String str311 = lbzVar2.a;
                                        zM = ldoVarO5.m(str311, lbzVar2.b);
                                        lgl lglVarAg5 = v().ag(a(), str311, 1L, false, false, false, false, false, false);
                                        if (zM) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(lcbVar2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lgpVarV4.o();
                                lgpVarV4.w();
                                str11 = lbzVar2.a;
                                kro.i(str11);
                                byte[] byteArray8 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                contentValues = new ContentValues();
                                contentValues.put(str310, str11);
                                contentValues.put("name", lbzVar2.b);
                                contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jD4));
                                contentValues.put("data", byteArray8);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                } else {
                                    this.l = 0L;
                                }
                                v().Y();
                                v().S();
                                V();
                                aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            if (jMax == 1) {
                                aT().c.c("Too many error events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.e));
                            }
                            v().Y();
                        }
                    } else {
                        upperCase = strD.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            strConcat = "_ltv_".concat(String.valueOf(upperCase));
                            str = str16;
                            aaqpVarAp = v().ap(str, strConcat);
                            if (aaqpVarAp == null && (aaqpVarAp.c instanceof Long)) {
                                str16 = str;
                                String str40 = lcdVarA.c;
                                aV();
                                aaqpVar = new aaqp(str16, str40, strConcat, System.currentTimeMillis(), Long.valueOf(((Long) aaqpVarAp.c).longValue() + jLongValue));
                            } else {
                                long j16 = jLongValue;
                                str16 = str;
                                lgpVarV = v();
                                int iC = i().C(str16, lcl.ae) - 1;
                                kro.i(str16);
                                lgpVarV.o();
                                lgpVarV.w();
                                try {
                                    lgpVarV.e().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str16, str16, String.valueOf(iC)});
                                } catch (SQLiteException e) {
                                    lgpVarV.aT().c.c("Error pruning currencies. appId", lcz.a(str16), e);
                                }
                                String str41 = lcdVarA.c;
                                aV();
                                aaqpVar = new aaqp(str16, str41, strConcat, System.currentTimeMillis(), Long.valueOf(j16));
                            }
                            if (!v().aq(aaqpVar)) {
                                aT().c.d("Too many unique user properties are set. Ignoring user property. appId", lcz.a(str16), k().e((String) aaqpVar.d), aaqpVar.c);
                                String str42 = str16;
                                r().R(this.L, str42, 9, null, null, 0);
                                str16 = str42;
                            }
                        } else {
                            str15 = "app_id";
                            str24 = str24;
                            str16 = str16;
                            str25 = str25;
                        }
                        str2 = lcdVarA.a;
                        zAn = lga.an(str2);
                        zEquals = "_err".equals(str2);
                        r();
                        lccVar2 = lcdVarA.b;
                        if (lccVar2 == null) {
                            length = 0;
                        } else {
                            lcbVar = new lcb(lccVar2);
                            length = 0;
                            while (lcbVar.hasNext()) {
                                objC = lccVar2.c(lcbVar.next());
                                if (objC instanceof Parcelable[]) {
                                    length += (long) ((Parcelable[]) objC).length;
                                }
                            }
                        }
                        bArr = null;
                        str3 = str16;
                        lglVarAg = v().ag(a(), str3, length + 1, true, zAn, false, zEquals, false, false);
                        j = lglVarAg.c;
                        i();
                        jW = j - lbt.w();
                        if (jW > 0) {
                            if (jW % 1000 == 1) {
                                aT().c.c("Data loss. Too many events logged. appId, count", lcz.a(str3), Long.valueOf(j));
                            }
                            if (zF && i().F(str3, lcl.aY)) {
                                v().T(str3, "event_dropped_count", "quota_exceeded", 1L, 0L);
                            }
                            v().Y();
                        } else if (zAn) {
                            long j17 = lglVarAg.b;
                            i();
                            jIntValue = j17 - ((long) ((Integer) lcl.n.b(null)).intValue());
                            if (jIntValue > 0) {
                                if (jIntValue % 1000 == 1) {
                                    aT().c.c("Data loss. Too many public events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.b));
                                }
                                r().R(this.L, str3, 16, "_ev", lcdVarA.a, 0);
                                if (zF && i().F(str3, lcl.aY)) {
                                    v().T(str3, "event_dropped_count", "quota_exceeded", 1L, 0L);
                                }
                                v().Y();
                            } else {
                                if (zEquals) {
                                    bundleA = lccVar2.a();
                                    r().S(bundleA, "_o", lcdVarA.c);
                                    if (r().ak(str3, lbgVar.B)) {
                                        r().S(bundleA, "_dbg", 1L);
                                        r().S(bundleA, "_r", 1L);
                                    }
                                    if ("_s".equals(str2)) {
                                        obj = aaqpVarAp2.c;
                                        if (obj instanceof Long) {
                                            r().S(bundleA, str25, obj);
                                        }
                                    }
                                    lgpVarV2 = v();
                                    kro.i(str3);
                                    lgpVarV2.o();
                                    lgpVarV2.w();
                                    jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                    if (jDelete > 0) {
                                        aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                    }
                                    ldrVar = this.j;
                                    lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                    lgp lgpVarV10 = v();
                                    str4 = lbzVar.b;
                                    lcaVarJ = lgpVarV10.j("events", str3, str4);
                                    if (lcaVarJ == null) {
                                        lgpVarV5 = v();
                                        kro.i(str3);
                                        if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                            r();
                                            if (!lga.ab(str4, lec.c)) {
                                                aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                                r().R(this.L, str3, 8, null, null, 0);
                                                if (zF) {
                                                    aU().j(new lfa(this, str3, 9, bArr));
                                                }
                                            }
                                        }
                                        lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                        lbzVar2 = lbzVar;
                                    } else {
                                        lbz lbzVar7 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                        lca lcaVarC5 = lcaVarJ.c(lbzVar7.d);
                                        lbzVar2 = lbzVar7;
                                        lcaVar = lcaVarC5;
                                    }
                                    v().aa("events", lcaVar);
                                    A();
                                    D();
                                    kro.l(lbgVar);
                                    String str219 = lbzVar2.a;
                                    kro.i(str219);
                                    str5 = lbgVar.a;
                                    kro.c(str219.equals(str5));
                                    lir lirVar21114 = lir.a;
                                    aihfVarCreateBuilder = lirVar21114.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21115 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21115.b |= 1;
                                    lirVar21115.d = 1;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21116 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21116.b |= 64;
                                    lirVar21116.l = "android";
                                    if (!TextUtils.isEmpty(str5)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar21117 = (lir) aihfVarCreateBuilder.instance;
                                        str5.getClass();
                                        lirVar21117.b |= SemanticState.Obscured;
                                        lirVar21117.r = str5;
                                    }
                                    str6 = lbgVar.d;
                                    if (!TextUtils.isEmpty(str6)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar21118 = (lir) aihfVarCreateBuilder.instance;
                                        str6.getClass();
                                        lirVar21118.b |= SemanticState.Modal;
                                        lirVar21118.q = str6;
                                    }
                                    str7 = lbgVar.c;
                                    if (!TextUtils.isEmpty(str7)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar21119 = (lir) aihfVarCreateBuilder.instance;
                                        str7.getClass();
                                        lirVar21119.b |= SemanticState.Multiline;
                                        lirVar21119.s = str7;
                                    }
                                    str8 = lbgVar.u;
                                    if (!TextUtils.isEmpty(str8)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar36 = (lir) aihfVarCreateBuilder.instance;
                                        str8.getClass();
                                        lirVar36.c |= SemanticState.Multiline;
                                        lirVar36.P = str8;
                                    }
                                    j2 = lbgVar.j;
                                    if (j2 != -2147483648L) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar37 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar37.b |= 33554432;
                                        lirVar37.F = (int) j2;
                                    }
                                    j3 = lbgVar.e;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111110 = (lir) aihfVarCreateBuilder.instance;
                                    str9 = str8;
                                    lirVar111110.b |= 16384;
                                    lirVar111110.t = j3;
                                    str10 = lbgVar.b;
                                    if (!TextUtils.isEmpty(str10)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar111111 = (lir) aihfVarCreateBuilder.instance;
                                        str10.getClass();
                                        lirVar111111.b |= 4194304;
                                        lirVar111111.B = str10;
                                    }
                                    kro.l(str5);
                                    lgh lghVarU5 = u(str5);
                                    String str2110 = lbgVar.s;
                                    String strK5 = lghVarU5.h(lgh.g(str2110, 100)).k();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar111112.c |= SemanticState.Focused;
                                    lirVar111112.O = strK5;
                                    j4 = lbgVar.f;
                                    if (j4 != 0) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar111113 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar111113.b |= 524288;
                                        lirVar111113.y = j4;
                                    }
                                    j5 = lbgVar.q;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111114 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar111114.c |= 16;
                                    lirVar111114.M = j5;
                                    i();
                                    String str2111 = (String) aurg.a.io();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111115 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar111115.c |= 1073741824;
                                    lirVar111115.ad = str2111;
                                    kro.l(str5);
                                    lghVarH = u(str5).h(lgh.g(str2110, 100));
                                    if (lghVarH.m()) {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    } else {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    }
                                    String strB5 = j().b();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111116 = (lir) aihfVarCreateBuilder.instance;
                                    strB5.getClass();
                                    lirVar111116.b |= SemanticState.Hidden;
                                    lirVar111116.n = strB5;
                                    String strC5 = j().c();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111117 = (lir) aihfVarCreateBuilder.instance;
                                    strC5.getClass();
                                    lirVar111117.b |= SemanticState.Focused;
                                    lirVar111117.m = strC5;
                                    int iA5 = (int) j().a();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111118 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar111118.b |= SemanticState.ReadOnly;
                                    lirVar111118.p = iA5;
                                    String strD6 = j().d();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111119 = (lir) aihfVarCreateBuilder.instance;
                                    strD6.getClass();
                                    lirVar111119.b |= SemanticState.LiveRegion;
                                    lirVar111119.o = strD6;
                                    long j18 = lbgVar.w;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211110 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar211110.c |= 32768;
                                    lirVar211110.S = j18;
                                    if (r38.w()) {
                                        String str312 = ((lir) aihfVarCreateBuilder.instance).r;
                                    }
                                    lbdVarH = v().h(str5);
                                    if (lbdVarH == null) {
                                        lbdVarH = new lbd(ldrVar, str5);
                                        lbdVarH.M(x(lghVarH));
                                        lbdVarH.V(lbgVar.k);
                                        lbdVarH.W(str10);
                                        if (lghVarH.m()) {
                                            lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                        }
                                        lbdVarH.aa(0L);
                                        lbdVarH.ab(0L);
                                        lbdVarH.Z(0L);
                                        lbdVarH.O(str7);
                                        lbdVarH.P(j2);
                                        lbdVarH.N(str6);
                                        lbdVarH.X(j3);
                                        lbdVarH.S(j4);
                                        lbdVarH.ae(lbgVar.h);
                                        lbdVarH.T(j6);
                                        if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                            lbdVarH.ad(lbgVar.G);
                                            lbdVarH.L(lbgVar.H);
                                            lbdVarH.al(lbgVar.I);
                                        }
                                        i = 0;
                                        v().an(lbdVarH, false);
                                    } else {
                                        i = 0;
                                    }
                                    if (lghVarH.o()) {
                                        String strX5 = lbdVarH.x();
                                        kro.l(strX5);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211111 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar211111.b |= 262144;
                                        lirVar211111.x = strX5;
                                    }
                                    if (!TextUtils.isEmpty(lbdVarH.A())) {
                                        String strA5 = lbdVarH.A();
                                        kro.l(strA5);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211112 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar211112.b |= 16777216;
                                        lirVar211112.E = strA5;
                                    }
                                    listB = v().B(str5);
                                    i2 = i;
                                    while (i2 < listB.size()) {
                                        aihf aihfVarCreateBuilder6 = lix.a.createBuilder();
                                        Object obj7 = ((aaqp) listB.get(i2)).d;
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        lix lixVar13 = (lix) aihfVarCreateBuilder6.instance;
                                        obj7.getClass();
                                        lixVar13.b |= 2;
                                        lixVar13.d = (String) obj7;
                                        long j19 = ((aaqp) listB.get(i2)).a;
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        lix lixVar14 = (lix) aihfVarCreateBuilder6.instance;
                                        lixVar14.b |= 1;
                                        lixVar14.c = j19;
                                        q().Y(aihfVarCreateBuilder6, ((aaqp) listB.get(i2)).c);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211113 = (lir) aihfVarCreateBuilder.instance;
                                        lix lixVar15 = (lix) aihfVarCreateBuilder6.build();
                                        lixVar15.getClass();
                                        lirVar211113.b();
                                        lirVar211113.f.add(lixVar15);
                                        str12 = str24;
                                        if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                            str13 = str9;
                                        } else {
                                            str13 = str9;
                                        }
                                        i2++;
                                        str24 = str12;
                                        str9 = str13;
                                    }
                                    lgpVarV3 = v();
                                    lirVar = (lir) aihfVarCreateBuilder.build();
                                    lgpVarV3.o();
                                    lgpVarV3.w();
                                    kro.l(lirVar);
                                    kro.i(lirVar.r);
                                    byte[] byteArray9 = lirVar.toByteArray();
                                    long jD5 = lgpVarV3.u().d(byteArray9);
                                    ContentValues contentValues6 = new ContentValues();
                                    String str313 = str15;
                                    contentValues6.put(str313, lirVar.r);
                                    contentValues6.put("metadata_fingerprint", Long.valueOf(jD5));
                                    contentValues6.put("metadata", byteArray9);
                                    lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                    lgpVarV4 = v();
                                    lcbVar2 = new lcb(lbzVar2.g);
                                    while (true) {
                                        if (lcbVar2.hasNext()) {
                                            ldo ldoVarO6 = o();
                                            String str314 = lbzVar2.a;
                                            zM = ldoVarO6.m(str314, lbzVar2.b);
                                            lgl lglVarAg6 = v().ag(a(), str314, 1L, false, false, false, false, false, false);
                                            if (zM) {
                                            }
                                            i3 = i;
                                            break;
                                        }
                                        if ("_r".equals(lcbVar2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    lgpVarV4.o();
                                    lgpVarV4.w();
                                    str11 = lbzVar2.a;
                                    kro.i(str11);
                                    byte[] byteArray10 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                    contentValues = new ContentValues();
                                    contentValues.put(str313, str11);
                                    contentValues.put("name", lbzVar2.b);
                                    contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jD5));
                                    contentValues.put("data", byteArray10);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                    if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                        lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                    } else {
                                        this.l = 0L;
                                    }
                                    v().Y();
                                    v().S();
                                    V();
                                    aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                    return;
                                }
                                jMax = lglVarAg.e - ((long) Math.max(0, Math.min(1000000, i().C(lbgVar.a, lcl.m))));
                                if (jMax <= 0) {
                                    if (jMax == 1) {
                                        aT().c.c("Too many error events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.e));
                                    }
                                    v().Y();
                                } else {
                                    bundleA = lccVar2.a();
                                    r().S(bundleA, "_o", lcdVarA.c);
                                    if (r().ak(str3, lbgVar.B)) {
                                        r().S(bundleA, "_dbg", 1L);
                                        r().S(bundleA, "_r", 1L);
                                    }
                                    if ("_s".equals(str2) && (aaqpVarAp2 = v().ap(lbgVar.a, str25)) != null) {
                                        obj = aaqpVarAp2.c;
                                        if (obj instanceof Long) {
                                            r().S(bundleA, str25, obj);
                                        }
                                    }
                                    lgpVarV2 = v();
                                    kro.i(str3);
                                    lgpVarV2.o();
                                    lgpVarV2.w();
                                    try {
                                        try {
                                            try {
                                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                                while (true) {
                                                    if (lcbVar2.hasNext()) {
                                                        ldo ldoVarO7 = o();
                                                        String str315 = lbzVar2.a;
                                                        zM = ldoVarO7.m(str315, lbzVar2.b);
                                                        lgl lglVarAg7 = v().ag(a(), str315, 1L, false, false, false, false, false, false);
                                                        if (zM || lglVarAg7.f >= i().h(str315)) {
                                                            i3 = i;
                                                            break;
                                                        }
                                                    } else if ("_r".equals(lcbVar2.next())) {
                                                    }
                                                    i3 = 1;
                                                    break;
                                                }
                                            } catch (SQLiteException e2) {
                                                lgpVarV2.aT().c.c("Error deleting over the limit events. appId", lcz.a(str3), e2);
                                                jDelete = 0;
                                            }
                                            lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                            lgpVarV4 = v();
                                            lcbVar2 = new lcb(lbzVar2.g);
                                            lgpVarV4.o();
                                            lgpVarV4.w();
                                            str11 = lbzVar2.a;
                                            kro.i(str11);
                                            byte[] byteArray11 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                            contentValues = new ContentValues();
                                            contentValues.put(str313, str11);
                                            contentValues.put("name", lbzVar2.b);
                                            contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                            contentValues.put("metadata_fingerprint", Long.valueOf(jD5));
                                            contentValues.put("data", byteArray11);
                                            contentValues.put("realtime", Integer.valueOf(i3));
                                            contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                            try {
                                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                                } else {
                                                    this.l = 0L;
                                                }
                                            } catch (SQLiteException e3) {
                                                lgpVarV4.aT().c.c("Error storing raw event. appId", lcz.a(lbzVar2.a), e3);
                                            }
                                            v().Y();
                                            v().S();
                                            V();
                                            aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                            return;
                                        } catch (SQLiteException e4) {
                                            lgpVarV3.aT().c.c("Error storing raw event metadata. appId", lcz.a(lirVar.r), e4);
                                            throw e4;
                                        }
                                        lgpVarV3 = v();
                                        lirVar = (lir) aihfVarCreateBuilder.build();
                                        lgpVarV3.o();
                                        lgpVarV3.w();
                                        kro.l(lirVar);
                                        kro.i(lirVar.r);
                                        byte[] byteArray12 = lirVar.toByteArray();
                                        long jD6 = lgpVarV3.u().d(byteArray12);
                                        ContentValues contentValues7 = new ContentValues();
                                        String str316 = str15;
                                        contentValues7.put(str316, lirVar.r);
                                        contentValues7.put("metadata_fingerprint", Long.valueOf(jD6));
                                        contentValues7.put("metadata", byteArray12);
                                    } catch (IOException e5) {
                                        aT().c.c("Data loss. Failed to insert raw event metadata. appId", lcz.a(((lir) aihfVarCreateBuilder.instance).r), e5);
                                    }
                                    if (jDelete > 0) {
                                        aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                    }
                                    ldrVar = this.j;
                                    lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                    lgp lgpVarV11 = v();
                                    str4 = lbzVar.b;
                                    lcaVarJ = lgpVarV11.j("events", str3, str4);
                                    if (lcaVarJ == null) {
                                        lgpVarV5 = v();
                                        kro.i(str3);
                                        if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3) && zAn) {
                                            r();
                                            if (!lga.ab(str4, lec.c)) {
                                                aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                                r().R(this.L, str3, 8, null, null, 0);
                                                if (zF && i().F(str3, lcl.aZ)) {
                                                    aU().j(new lfa(this, str3, 9, bArr));
                                                }
                                            }
                                        }
                                        lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                        lbzVar2 = lbzVar;
                                    } else {
                                        lbz lbzVar8 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                        lca lcaVarC6 = lcaVarJ.c(lbzVar8.d);
                                        lbzVar2 = lbzVar8;
                                        lcaVar = lcaVarC6;
                                    }
                                    v().aa("events", lcaVar);
                                    A();
                                    D();
                                    kro.l(lbgVar);
                                    String str2112 = lbzVar2.a;
                                    kro.i(str2112);
                                    str5 = lbgVar.a;
                                    kro.c(str2112.equals(str5));
                                    lir lirVar211114 = lir.a;
                                    aihfVarCreateBuilder = lirVar211114.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211115 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar211115.b |= 1;
                                    lirVar211115.d = 1;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211116 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar211116.b |= 64;
                                    lirVar211116.l = "android";
                                    if (!TextUtils.isEmpty(str5)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211117 = (lir) aihfVarCreateBuilder.instance;
                                        str5.getClass();
                                        lirVar211117.b |= SemanticState.Obscured;
                                        lirVar211117.r = str5;
                                    }
                                    str6 = lbgVar.d;
                                    if (!TextUtils.isEmpty(str6)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211118 = (lir) aihfVarCreateBuilder.instance;
                                        str6.getClass();
                                        lirVar211118.b |= SemanticState.Modal;
                                        lirVar211118.q = str6;
                                    }
                                    str7 = lbgVar.c;
                                    if (!TextUtils.isEmpty(str7)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar211119 = (lir) aihfVarCreateBuilder.instance;
                                        str7.getClass();
                                        lirVar211119.b |= SemanticState.Multiline;
                                        lirVar211119.s = str7;
                                    }
                                    str8 = lbgVar.u;
                                    if (!TextUtils.isEmpty(str8)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar38 = (lir) aihfVarCreateBuilder.instance;
                                        str8.getClass();
                                        lirVar38.c |= SemanticState.Multiline;
                                        lirVar38.P = str8;
                                    }
                                    j2 = lbgVar.j;
                                    if (j2 != -2147483648L) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar39 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar39.b |= 33554432;
                                        lirVar39.F = (int) j2;
                                    }
                                    j3 = lbgVar.e;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111110 = (lir) aihfVarCreateBuilder.instance;
                                    str9 = str8;
                                    lirVar1111110.b |= 16384;
                                    lirVar1111110.t = j3;
                                    str10 = lbgVar.b;
                                    if (!TextUtils.isEmpty(str10)) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar1111111 = (lir) aihfVarCreateBuilder.instance;
                                        str10.getClass();
                                        lirVar1111111.b |= 4194304;
                                        lirVar1111111.B = str10;
                                    }
                                    kro.l(str5);
                                    lgh lghVarU6 = u(str5);
                                    String str2113 = lbgVar.s;
                                    String strK6 = lghVarU6.h(lgh.g(str2113, 100)).k();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar1111112.c |= SemanticState.Focused;
                                    lirVar1111112.O = strK6;
                                    j4 = lbgVar.f;
                                    if (j4 != 0) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar1111113 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar1111113.b |= 524288;
                                        lirVar1111113.y = j4;
                                    }
                                    j5 = lbgVar.q;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111114 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar1111114.c |= 16;
                                    lirVar1111114.M = j5;
                                    i();
                                    String str2114 = (String) aurg.a.io();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111115 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar1111115.c |= 1073741824;
                                    lirVar1111115.ad = str2114;
                                    kro.l(str5);
                                    lghVarH = u(str5).h(lgh.g(str2113, 100));
                                    if (lghVarH.m() || !(z = lbgVar.n)) {
                                        str10 = str10;
                                        lbzVar2 = lbzVar2;
                                        str7 = str7;
                                        j6 = j5;
                                    } else {
                                        Pair pairC = this.g.c(lbgVar, lghVarH);
                                        if (TextUtils.isEmpty((CharSequence) pairC.first) || !z) {
                                            str10 = str10;
                                            lbzVar2 = lbzVar2;
                                            str7 = str7;
                                            j6 = j5;
                                        } else {
                                            String str43 = (String) pairC.first;
                                            aihfVarCreateBuilder.copyOnWrite();
                                            lir lirVar40 = (lir) aihfVarCreateBuilder.instance;
                                            str43.getClass();
                                            j6 = j5;
                                            lirVar40.b |= 65536;
                                            lirVar40.v = str43;
                                            if (pairC.second != null) {
                                                boolean zBooleanValue = ((Boolean) pairC.second).booleanValue();
                                                aihfVarCreateBuilder.copyOnWrite();
                                                lir lirVar41 = (lir) aihfVarCreateBuilder.instance;
                                                lirVar41.b |= 131072;
                                                lirVar41.w = zBooleanValue;
                                            }
                                            if (lbzVar2.b.equals("_fx") || ((String) pairC.first).equals("00000000-0000-0000-0000-000000000000") || (lbdVarH2 = v().h(str5)) == null || !lbdVarH2.ax()) {
                                                str10 = str10;
                                                lbzVar2 = lbzVar2;
                                                str7 = str7;
                                            } else {
                                                X(str5, false, null, null);
                                                Bundle bundle4 = new Bundle();
                                                Long lT = lbdVarH2.t();
                                                if (lT != null) {
                                                    bundle4.putLong("_pfo", Math.max(0L, lT.longValue()));
                                                }
                                                Long lU = lbdVarH2.u();
                                                if (lU != null) {
                                                    bundle4.putLong("_uwa", lU.longValue());
                                                }
                                                bundle4.putLong("_r", 1L);
                                                this.L.a(str5, "_fx", bundle4);
                                            }
                                        }
                                    }
                                    String strB6 = j().b();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111116 = (lir) aihfVarCreateBuilder.instance;
                                    strB6.getClass();
                                    lirVar1111116.b |= SemanticState.Hidden;
                                    lirVar1111116.n = strB6;
                                    String strC6 = j().c();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111117 = (lir) aihfVarCreateBuilder.instance;
                                    strC6.getClass();
                                    lirVar1111117.b |= SemanticState.Focused;
                                    lirVar1111117.m = strC6;
                                    int iA6 = (int) j().a();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111118 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar1111118.b |= SemanticState.ReadOnly;
                                    lirVar1111118.p = iA6;
                                    String strD7 = j().d();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111119 = (lir) aihfVarCreateBuilder.instance;
                                    strD7.getClass();
                                    lirVar1111119.b |= SemanticState.LiveRegion;
                                    lirVar1111119.o = strD7;
                                    long j110 = lbgVar.w;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111110 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar2111110.c |= 32768;
                                    lirVar2111110.S = j110;
                                    if (r38.w()) {
                                        String str317 = ((lir) aihfVarCreateBuilder.instance).r;
                                    }
                                    lbdVarH = v().h(str5);
                                    if (lbdVarH == null) {
                                        lbdVarH = new lbd(ldrVar, str5);
                                        lbdVarH.M(x(lghVarH));
                                        lbdVarH.V(lbgVar.k);
                                        lbdVarH.W(str10);
                                        if (lghVarH.m()) {
                                            lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                        }
                                        lbdVarH.aa(0L);
                                        lbdVarH.ab(0L);
                                        lbdVarH.Z(0L);
                                        lbdVarH.O(str7);
                                        lbdVarH.P(j2);
                                        lbdVarH.N(str6);
                                        lbdVarH.X(j3);
                                        lbdVarH.S(j4);
                                        lbdVarH.ae(lbgVar.h);
                                        lbdVarH.T(j6);
                                        if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                            lbdVarH.ad(lbgVar.G);
                                            lbdVarH.L(lbgVar.H);
                                            lbdVarH.al(lbgVar.I);
                                        }
                                        i = 0;
                                        v().an(lbdVarH, false);
                                    } else {
                                        i = 0;
                                    }
                                    if (lghVarH.o() && !TextUtils.isEmpty(lbdVarH.x())) {
                                        String strX6 = lbdVarH.x();
                                        kro.l(strX6);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar2111111 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar2111111.b |= 262144;
                                        lirVar2111111.x = strX6;
                                    }
                                    if (!TextUtils.isEmpty(lbdVarH.A())) {
                                        String strA6 = lbdVarH.A();
                                        kro.l(strA6);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar2111112 = (lir) aihfVarCreateBuilder.instance;
                                        lirVar2111112.b |= 16777216;
                                        lirVar2111112.E = strA6;
                                    }
                                    listB = v().B(str5);
                                    i2 = i;
                                    while (i2 < listB.size()) {
                                        aihf aihfVarCreateBuilder7 = lix.a.createBuilder();
                                        Object obj8 = ((aaqp) listB.get(i2)).d;
                                        aihfVarCreateBuilder7.copyOnWrite();
                                        lix lixVar16 = (lix) aihfVarCreateBuilder7.instance;
                                        obj8.getClass();
                                        lixVar16.b |= 2;
                                        lixVar16.d = (String) obj8;
                                        long j111 = ((aaqp) listB.get(i2)).a;
                                        aihfVarCreateBuilder7.copyOnWrite();
                                        lix lixVar17 = (lix) aihfVarCreateBuilder7.instance;
                                        lixVar17.b |= 1;
                                        lixVar17.c = j111;
                                        q().Y(aihfVarCreateBuilder7, ((aaqp) listB.get(i2)).c);
                                        aihfVarCreateBuilder.copyOnWrite();
                                        lir lirVar2111113 = (lir) aihfVarCreateBuilder.instance;
                                        lix lixVar18 = (lix) aihfVarCreateBuilder7.build();
                                        lixVar18.getClass();
                                        lirVar2111113.b();
                                        lirVar2111113.f.add(lixVar18);
                                        str12 = str24;
                                        if (str12.equals(((aaqp) listB.get(i2)).d) || lbdVarH.p() == 0) {
                                            str13 = str9;
                                        } else {
                                            str13 = str9;
                                            if (q().c(str13) != lbdVarH.p()) {
                                                aihfVarCreateBuilder.copyOnWrite();
                                                lir lirVar42 = (lir) aihfVarCreateBuilder.instance;
                                                lirVar42.c &= -8193;
                                                lirVar42.P = lirVar211114.P;
                                            }
                                        }
                                        i2++;
                                        str24 = str12;
                                        str9 = str13;
                                    }
                                }
                            }
                        } else {
                            if (zEquals) {
                                bundleA = lccVar2.a();
                                r().S(bundleA, "_o", lcdVarA.c);
                                if (r().ak(str3, lbgVar.B)) {
                                    r().S(bundleA, "_dbg", 1L);
                                    r().S(bundleA, "_r", 1L);
                                }
                                if ("_s".equals(str2)) {
                                    obj = aaqpVarAp2.c;
                                    if (obj instanceof Long) {
                                        r().S(bundleA, str25, obj);
                                    }
                                }
                                lgpVarV2 = v();
                                kro.i(str3);
                                lgpVarV2.o();
                                lgpVarV2.w();
                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                if (jDelete > 0) {
                                    aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                }
                                ldrVar = this.j;
                                lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                lgp lgpVarV12 = v();
                                str4 = lbzVar.b;
                                lcaVarJ = lgpVarV12.j("events", str3, str4);
                                if (lcaVarJ == null) {
                                    lgpVarV5 = v();
                                    kro.i(str3);
                                    if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                        r();
                                        if (!lga.ab(str4, lec.c)) {
                                            aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                            r().R(this.L, str3, 8, null, null, 0);
                                            if (zF) {
                                                aU().j(new lfa(this, str3, 9, bArr));
                                            }
                                        }
                                    }
                                    lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                    lbzVar2 = lbzVar;
                                } else {
                                    lbz lbzVar9 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                    lca lcaVarC7 = lcaVarJ.c(lbzVar9.d);
                                    lbzVar2 = lbzVar9;
                                    lcaVar = lcaVarC7;
                                }
                                v().aa("events", lcaVar);
                                A();
                                D();
                                kro.l(lbgVar);
                                String str2115 = lbzVar2.a;
                                kro.i(str2115);
                                str5 = lbgVar.a;
                                kro.c(str2115.equals(str5));
                                lir lirVar2111114 = lir.a;
                                aihfVarCreateBuilder = lirVar2111114.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111115.b |= 1;
                                lirVar2111115.d = 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111116 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111116.b |= 64;
                                lirVar2111116.l = "android";
                                if (!TextUtils.isEmpty(str5)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111117 = (lir) aihfVarCreateBuilder.instance;
                                    str5.getClass();
                                    lirVar2111117.b |= SemanticState.Obscured;
                                    lirVar2111117.r = str5;
                                }
                                str6 = lbgVar.d;
                                if (!TextUtils.isEmpty(str6)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111118 = (lir) aihfVarCreateBuilder.instance;
                                    str6.getClass();
                                    lirVar2111118.b |= SemanticState.Modal;
                                    lirVar2111118.q = str6;
                                }
                                str7 = lbgVar.c;
                                if (!TextUtils.isEmpty(str7)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111119 = (lir) aihfVarCreateBuilder.instance;
                                    str7.getClass();
                                    lirVar2111119.b |= SemanticState.Multiline;
                                    lirVar2111119.s = str7;
                                }
                                str8 = lbgVar.u;
                                if (!TextUtils.isEmpty(str8)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar310 = (lir) aihfVarCreateBuilder.instance;
                                    str8.getClass();
                                    lirVar310.c |= SemanticState.Multiline;
                                    lirVar310.P = str8;
                                }
                                j2 = lbgVar.j;
                                if (j2 != -2147483648L) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar311 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar311.b |= 33554432;
                                    lirVar311.F = (int) j2;
                                }
                                j3 = lbgVar.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111110 = (lir) aihfVarCreateBuilder.instance;
                                str9 = str8;
                                lirVar11111110.b |= 16384;
                                lirVar11111110.t = j3;
                                str10 = lbgVar.b;
                                if (!TextUtils.isEmpty(str10)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar11111111 = (lir) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    lirVar11111111.b |= 4194304;
                                    lirVar11111111.B = str10;
                                }
                                kro.l(str5);
                                lgh lghVarU7 = u(str5);
                                String str2116 = lbgVar.s;
                                String strK7 = lghVarU7.h(lgh.g(str2116, 100)).k();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111112.c |= SemanticState.Focused;
                                lirVar11111112.O = strK7;
                                j4 = lbgVar.f;
                                if (j4 != 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar11111113 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar11111113.b |= 524288;
                                    lirVar11111113.y = j4;
                                }
                                j5 = lbgVar.q;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111114 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111114.c |= 16;
                                lirVar11111114.M = j5;
                                i();
                                String str2117 = (String) aurg.a.io();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111115.c |= 1073741824;
                                lirVar11111115.ad = str2117;
                                kro.l(str5);
                                lghVarH = u(str5).h(lgh.g(str2116, 100));
                                if (lghVarH.m()) {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                } else {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                }
                                String strB7 = j().b();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111116 = (lir) aihfVarCreateBuilder.instance;
                                strB7.getClass();
                                lirVar11111116.b |= SemanticState.Hidden;
                                lirVar11111116.n = strB7;
                                String strC7 = j().c();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111117 = (lir) aihfVarCreateBuilder.instance;
                                strC7.getClass();
                                lirVar11111117.b |= SemanticState.Focused;
                                lirVar11111117.m = strC7;
                                int iA7 = (int) j().a();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111118 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111118.b |= SemanticState.ReadOnly;
                                lirVar11111118.p = iA7;
                                String strD8 = j().d();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111119 = (lir) aihfVarCreateBuilder.instance;
                                strD8.getClass();
                                lirVar11111119.b |= SemanticState.LiveRegion;
                                lirVar11111119.o = strD8;
                                long j112 = lbgVar.w;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111110 = (lir) aihfVarCreateBuilder.instance;
                                lirVar21111110.c |= 32768;
                                lirVar21111110.S = j112;
                                if (r38.w()) {
                                    String str318 = ((lir) aihfVarCreateBuilder.instance).r;
                                }
                                lbdVarH = v().h(str5);
                                if (lbdVarH == null) {
                                    lbdVarH = new lbd(ldrVar, str5);
                                    lbdVarH.M(x(lghVarH));
                                    lbdVarH.V(lbgVar.k);
                                    lbdVarH.W(str10);
                                    if (lghVarH.m()) {
                                        lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                    }
                                    lbdVarH.aa(0L);
                                    lbdVarH.ab(0L);
                                    lbdVarH.Z(0L);
                                    lbdVarH.O(str7);
                                    lbdVarH.P(j2);
                                    lbdVarH.N(str6);
                                    lbdVarH.X(j3);
                                    lbdVarH.S(j4);
                                    lbdVarH.ae(lbgVar.h);
                                    lbdVarH.T(j6);
                                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                        lbdVarH.ad(lbgVar.G);
                                        lbdVarH.L(lbgVar.H);
                                        lbdVarH.al(lbgVar.I);
                                    }
                                    i = 0;
                                    v().an(lbdVarH, false);
                                } else {
                                    i = 0;
                                }
                                if (lghVarH.o()) {
                                    String strX7 = lbdVarH.x();
                                    kro.l(strX7);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111111 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21111111.b |= 262144;
                                    lirVar21111111.x = strX7;
                                }
                                if (!TextUtils.isEmpty(lbdVarH.A())) {
                                    String strA7 = lbdVarH.A();
                                    kro.l(strA7);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21111112.b |= 16777216;
                                    lirVar21111112.E = strA7;
                                }
                                listB = v().B(str5);
                                i2 = i;
                                while (i2 < listB.size()) {
                                    aihf aihfVarCreateBuilder8 = lix.a.createBuilder();
                                    Object obj9 = ((aaqp) listB.get(i2)).d;
                                    aihfVarCreateBuilder8.copyOnWrite();
                                    lix lixVar19 = (lix) aihfVarCreateBuilder8.instance;
                                    obj9.getClass();
                                    lixVar19.b |= 2;
                                    lixVar19.d = (String) obj9;
                                    long j113 = ((aaqp) listB.get(i2)).a;
                                    aihfVarCreateBuilder8.copyOnWrite();
                                    lix lixVar110 = (lix) aihfVarCreateBuilder8.instance;
                                    lixVar110.b |= 1;
                                    lixVar110.c = j113;
                                    q().Y(aihfVarCreateBuilder8, ((aaqp) listB.get(i2)).c);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111113 = (lir) aihfVarCreateBuilder.instance;
                                    lix lixVar111 = (lix) aihfVarCreateBuilder8.build();
                                    lixVar111.getClass();
                                    lirVar21111113.b();
                                    lirVar21111113.f.add(lixVar111);
                                    str12 = str24;
                                    if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                        str13 = str9;
                                    } else {
                                        str13 = str9;
                                    }
                                    i2++;
                                    str24 = str12;
                                    str9 = str13;
                                }
                                lgpVarV3 = v();
                                lirVar = (lir) aihfVarCreateBuilder.build();
                                lgpVarV3.o();
                                lgpVarV3.w();
                                kro.l(lirVar);
                                kro.i(lirVar.r);
                                byte[] byteArray13 = lirVar.toByteArray();
                                long jD7 = lgpVarV3.u().d(byteArray13);
                                ContentValues contentValues8 = new ContentValues();
                                String str319 = str15;
                                contentValues8.put(str319, lirVar.r);
                                contentValues8.put("metadata_fingerprint", Long.valueOf(jD7));
                                contentValues8.put("metadata", byteArray13);
                                lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                                lgpVarV4 = v();
                                lcbVar2 = new lcb(lbzVar2.g);
                                while (true) {
                                    if (lcbVar2.hasNext()) {
                                        ldo ldoVarO8 = o();
                                        String str3110 = lbzVar2.a;
                                        zM = ldoVarO8.m(str3110, lbzVar2.b);
                                        lgl lglVarAg8 = v().ag(a(), str3110, 1L, false, false, false, false, false, false);
                                        if (zM) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(lcbVar2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lgpVarV4.o();
                                lgpVarV4.w();
                                str11 = lbzVar2.a;
                                kro.i(str11);
                                byte[] byteArray14 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                contentValues = new ContentValues();
                                contentValues.put(str319, str11);
                                contentValues.put("name", lbzVar2.b);
                                contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jD7));
                                contentValues.put("data", byteArray14);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                } else {
                                    this.l = 0L;
                                }
                                v().Y();
                                v().S();
                                V();
                                aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            jMax = lglVarAg.e - ((long) Math.max(0, Math.min(1000000, i().C(lbgVar.a, lcl.m))));
                            if (jMax <= 0) {
                                bundleA = lccVar2.a();
                                r().S(bundleA, "_o", lcdVarA.c);
                                if (r().ak(str3, lbgVar.B)) {
                                    r().S(bundleA, "_dbg", 1L);
                                    r().S(bundleA, "_r", 1L);
                                }
                                if ("_s".equals(str2)) {
                                    obj = aaqpVarAp2.c;
                                    if (obj instanceof Long) {
                                        r().S(bundleA, str25, obj);
                                    }
                                }
                                lgpVarV2 = v();
                                kro.i(str3);
                                lgpVarV2.o();
                                lgpVarV2.w();
                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                if (jDelete > 0) {
                                    aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                }
                                ldrVar = this.j;
                                lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                lgp lgpVarV13 = v();
                                str4 = lbzVar.b;
                                lcaVarJ = lgpVarV13.j("events", str3, str4);
                                if (lcaVarJ == null) {
                                    lgpVarV5 = v();
                                    kro.i(str3);
                                    if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                        r();
                                        if (!lga.ab(str4, lec.c)) {
                                            aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                            r().R(this.L, str3, 8, null, null, 0);
                                            if (zF) {
                                                aU().j(new lfa(this, str3, 9, bArr));
                                            }
                                        }
                                    }
                                    lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                    lbzVar2 = lbzVar;
                                } else {
                                    lbz lbzVar10 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                    lca lcaVarC8 = lcaVarJ.c(lbzVar10.d);
                                    lbzVar2 = lbzVar10;
                                    lcaVar = lcaVarC8;
                                }
                                v().aa("events", lcaVar);
                                A();
                                D();
                                kro.l(lbgVar);
                                String str2118 = lbzVar2.a;
                                kro.i(str2118);
                                str5 = lbgVar.a;
                                kro.c(str2118.equals(str5));
                                lir lirVar21111114 = lir.a;
                                aihfVarCreateBuilder = lirVar21111114.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar21111115.b |= 1;
                                lirVar21111115.d = 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111116 = (lir) aihfVarCreateBuilder.instance;
                                lirVar21111116.b |= 64;
                                lirVar21111116.l = "android";
                                if (!TextUtils.isEmpty(str5)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111117 = (lir) aihfVarCreateBuilder.instance;
                                    str5.getClass();
                                    lirVar21111117.b |= SemanticState.Obscured;
                                    lirVar21111117.r = str5;
                                }
                                str6 = lbgVar.d;
                                if (!TextUtils.isEmpty(str6)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111118 = (lir) aihfVarCreateBuilder.instance;
                                    str6.getClass();
                                    lirVar21111118.b |= SemanticState.Modal;
                                    lirVar21111118.q = str6;
                                }
                                str7 = lbgVar.c;
                                if (!TextUtils.isEmpty(str7)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111119 = (lir) aihfVarCreateBuilder.instance;
                                    str7.getClass();
                                    lirVar21111119.b |= SemanticState.Multiline;
                                    lirVar21111119.s = str7;
                                }
                                str8 = lbgVar.u;
                                if (!TextUtils.isEmpty(str8)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar312 = (lir) aihfVarCreateBuilder.instance;
                                    str8.getClass();
                                    lirVar312.c |= SemanticState.Multiline;
                                    lirVar312.P = str8;
                                }
                                j2 = lbgVar.j;
                                if (j2 != -2147483648L) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar313 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar313.b |= 33554432;
                                    lirVar313.F = (int) j2;
                                }
                                j3 = lbgVar.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111110 = (lir) aihfVarCreateBuilder.instance;
                                str9 = str8;
                                lirVar111111110.b |= 16384;
                                lirVar111111110.t = j3;
                                str10 = lbgVar.b;
                                if (!TextUtils.isEmpty(str10)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111111111 = (lir) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    lirVar111111111.b |= 4194304;
                                    lirVar111111111.B = str10;
                                }
                                kro.l(str5);
                                lgh lghVarU8 = u(str5);
                                String str2119 = lbgVar.s;
                                String strK8 = lghVarU8.h(lgh.g(str2119, 100)).k();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar111111112.c |= SemanticState.Focused;
                                lirVar111111112.O = strK8;
                                j4 = lbgVar.f;
                                if (j4 != 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar111111113 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar111111113.b |= 524288;
                                    lirVar111111113.y = j4;
                                }
                                j5 = lbgVar.q;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111114 = (lir) aihfVarCreateBuilder.instance;
                                lirVar111111114.c |= 16;
                                lirVar111111114.M = j5;
                                i();
                                String str21110 = (String) aurg.a.io();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar111111115.c |= 1073741824;
                                lirVar111111115.ad = str21110;
                                kro.l(str5);
                                lghVarH = u(str5).h(lgh.g(str2119, 100));
                                if (lghVarH.m()) {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                } else {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                }
                                String strB8 = j().b();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111116 = (lir) aihfVarCreateBuilder.instance;
                                strB8.getClass();
                                lirVar111111116.b |= SemanticState.Hidden;
                                lirVar111111116.n = strB8;
                                String strC8 = j().c();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111117 = (lir) aihfVarCreateBuilder.instance;
                                strC8.getClass();
                                lirVar111111117.b |= SemanticState.Focused;
                                lirVar111111117.m = strC8;
                                int iA8 = (int) j().a();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111118 = (lir) aihfVarCreateBuilder.instance;
                                lirVar111111118.b |= SemanticState.ReadOnly;
                                lirVar111111118.p = iA8;
                                String strD9 = j().d();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111119 = (lir) aihfVarCreateBuilder.instance;
                                strD9.getClass();
                                lirVar111111119.b |= SemanticState.LiveRegion;
                                lirVar111111119.o = strD9;
                                long j114 = lbgVar.w;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111110 = (lir) aihfVarCreateBuilder.instance;
                                lirVar211111110.c |= 32768;
                                lirVar211111110.S = j114;
                                if (r38.w()) {
                                    String str3111 = ((lir) aihfVarCreateBuilder.instance).r;
                                }
                                lbdVarH = v().h(str5);
                                if (lbdVarH == null) {
                                    lbdVarH = new lbd(ldrVar, str5);
                                    lbdVarH.M(x(lghVarH));
                                    lbdVarH.V(lbgVar.k);
                                    lbdVarH.W(str10);
                                    if (lghVarH.m()) {
                                        lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                    }
                                    lbdVarH.aa(0L);
                                    lbdVarH.ab(0L);
                                    lbdVarH.Z(0L);
                                    lbdVarH.O(str7);
                                    lbdVarH.P(j2);
                                    lbdVarH.N(str6);
                                    lbdVarH.X(j3);
                                    lbdVarH.S(j4);
                                    lbdVarH.ae(lbgVar.h);
                                    lbdVarH.T(j6);
                                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                        lbdVarH.ad(lbgVar.G);
                                        lbdVarH.L(lbgVar.H);
                                        lbdVarH.al(lbgVar.I);
                                    }
                                    i = 0;
                                    v().an(lbdVarH, false);
                                } else {
                                    i = 0;
                                }
                                if (lghVarH.o()) {
                                    String strX8 = lbdVarH.x();
                                    kro.l(strX8);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211111111 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar211111111.b |= 262144;
                                    lirVar211111111.x = strX8;
                                }
                                if (!TextUtils.isEmpty(lbdVarH.A())) {
                                    String strA8 = lbdVarH.A();
                                    kro.l(strA8);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211111112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar211111112.b |= 16777216;
                                    lirVar211111112.E = strA8;
                                }
                                listB = v().B(str5);
                                i2 = i;
                                while (i2 < listB.size()) {
                                    aihf aihfVarCreateBuilder9 = lix.a.createBuilder();
                                    Object obj10 = ((aaqp) listB.get(i2)).d;
                                    aihfVarCreateBuilder9.copyOnWrite();
                                    lix lixVar112 = (lix) aihfVarCreateBuilder9.instance;
                                    obj10.getClass();
                                    lixVar112.b |= 2;
                                    lixVar112.d = (String) obj10;
                                    long j115 = ((aaqp) listB.get(i2)).a;
                                    aihfVarCreateBuilder9.copyOnWrite();
                                    lix lixVar113 = (lix) aihfVarCreateBuilder9.instance;
                                    lixVar113.b |= 1;
                                    lixVar113.c = j115;
                                    q().Y(aihfVarCreateBuilder9, ((aaqp) listB.get(i2)).c);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211111113 = (lir) aihfVarCreateBuilder.instance;
                                    lix lixVar114 = (lix) aihfVarCreateBuilder9.build();
                                    lixVar114.getClass();
                                    lirVar211111113.b();
                                    lirVar211111113.f.add(lixVar114);
                                    str12 = str24;
                                    if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                        str13 = str9;
                                    } else {
                                        str13 = str9;
                                    }
                                    i2++;
                                    str24 = str12;
                                    str9 = str13;
                                }
                                lgpVarV3 = v();
                                lirVar = (lir) aihfVarCreateBuilder.build();
                                lgpVarV3.o();
                                lgpVarV3.w();
                                kro.l(lirVar);
                                kro.i(lirVar.r);
                                byte[] byteArray15 = lirVar.toByteArray();
                                long jD8 = lgpVarV3.u().d(byteArray15);
                                ContentValues contentValues9 = new ContentValues();
                                String str3112 = str15;
                                contentValues9.put(str3112, lirVar.r);
                                contentValues9.put("metadata_fingerprint", Long.valueOf(jD8));
                                contentValues9.put("metadata", byteArray15);
                                lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                                lgpVarV4 = v();
                                lcbVar2 = new lcb(lbzVar2.g);
                                while (true) {
                                    if (lcbVar2.hasNext()) {
                                        ldo ldoVarO9 = o();
                                        String str3113 = lbzVar2.a;
                                        zM = ldoVarO9.m(str3113, lbzVar2.b);
                                        lgl lglVarAg9 = v().ag(a(), str3113, 1L, false, false, false, false, false, false);
                                        if (zM) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(lcbVar2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lgpVarV4.o();
                                lgpVarV4.w();
                                str11 = lbzVar2.a;
                                kro.i(str11);
                                byte[] byteArray16 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                contentValues = new ContentValues();
                                contentValues.put(str3112, str11);
                                contentValues.put("name", lbzVar2.b);
                                contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jD8));
                                contentValues.put("data", byteArray16);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                } else {
                                    this.l = 0L;
                                }
                                v().Y();
                                v().S();
                                V();
                                aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            if (jMax == 1) {
                                aT().c.c("Too many error events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.e));
                            }
                            v().Y();
                        }
                    }
                } else {
                    if (z3) {
                        z3 = true;
                        lccVar = lcdVarA.b;
                        strD = lccVar.d("currency");
                        if (z3) {
                            double d2 = lccVar.a.getDouble("value");
                            Double.valueOf(d2).getClass();
                            dLongValue = d2 * 1000000.0d;
                            if (dLongValue == 0.0d) {
                                dLongValue = lccVar.b("value").longValue() * 1000000.0d;
                            }
                            if (dLongValue <= 9.223372036854776E18d) {
                            }
                            aT().f.c("Data lost. Currency value is too big. appId", lcz.a(str16), Double.valueOf(dLongValue));
                            v().Y();
                        } else {
                            str16 = str16;
                            jLongValue = lccVar.b("value").longValue();
                        }
                        if (TextUtils.isEmpty(strD)) {
                            upperCase = strD.toUpperCase(Locale.US);
                            if (upperCase.matches("[A-Z]{3}")) {
                                strConcat = "_ltv_".concat(String.valueOf(upperCase));
                                str = str16;
                                aaqpVarAp = v().ap(str, strConcat);
                                if (aaqpVarAp == null) {
                                    long j116 = jLongValue;
                                    str16 = str;
                                    lgpVarV = v();
                                    int iC2 = i().C(str16, lcl.ae) - 1;
                                    kro.i(str16);
                                    lgpVarV.o();
                                    lgpVarV.w();
                                    lgpVarV.e().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str16, str16, String.valueOf(iC2)});
                                    String str44 = lcdVarA.c;
                                    aV();
                                    aaqpVar = new aaqp(str16, str44, strConcat, System.currentTimeMillis(), Long.valueOf(j116));
                                    if (!v().aq(aaqpVar)) {
                                        aT().c.d("Too many unique user properties are set. Ignoring user property. appId", lcz.a(str16), k().e((String) aaqpVar.d), aaqpVar.c);
                                        String str45 = str16;
                                        r().R(this.L, str45, 9, null, null, 0);
                                        str16 = str45;
                                    }
                                } else {
                                    long j117 = jLongValue;
                                    str16 = str;
                                    lgpVarV = v();
                                    int iC3 = i().C(str16, lcl.ae) - 1;
                                    kro.i(str16);
                                    lgpVarV.o();
                                    lgpVarV.w();
                                    lgpVarV.e().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str16, str16, String.valueOf(iC3)});
                                    String str46 = lcdVarA.c;
                                    aV();
                                    aaqpVar = new aaqp(str16, str46, strConcat, System.currentTimeMillis(), Long.valueOf(j117));
                                    if (!v().aq(aaqpVar)) {
                                        aT().c.d("Too many unique user properties are set. Ignoring user property. appId", lcz.a(str16), k().e((String) aaqpVar.d), aaqpVar.c);
                                        String str47 = str16;
                                        r().R(this.L, str47, 9, null, null, 0);
                                        str16 = str47;
                                    }
                                }
                            } else {
                                str15 = "app_id";
                                str24 = str24;
                                str16 = str16;
                                str25 = str25;
                            }
                        } else {
                            str15 = "app_id";
                            str24 = str24;
                            str16 = str16;
                            str25 = str25;
                        }
                    } else {
                        str15 = "app_id";
                        str24 = str24;
                        str25 = str25;
                    }
                    str2 = lcdVarA.a;
                    zAn = lga.an(str2);
                    zEquals = "_err".equals(str2);
                    r();
                    lccVar2 = lcdVarA.b;
                    if (lccVar2 == null) {
                        length = 0;
                    } else {
                        lcbVar = new lcb(lccVar2);
                        length = 0;
                        while (lcbVar.hasNext()) {
                            objC = lccVar2.c(lcbVar.next());
                            if (objC instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objC).length;
                            }
                        }
                    }
                    bArr = null;
                    str3 = str16;
                    lglVarAg = v().ag(a(), str3, length + 1, true, zAn, false, zEquals, false, false);
                    j = lglVarAg.c;
                    i();
                    jW = j - lbt.w();
                    if (jW > 0) {
                        if (jW % 1000 == 1) {
                            aT().c.c("Data loss. Too many events logged. appId, count", lcz.a(str3), Long.valueOf(j));
                        }
                        if (zF) {
                            v().T(str3, "event_dropped_count", "quota_exceeded", 1L, 0L);
                        }
                        v().Y();
                    } else if (zAn) {
                        long j118 = lglVarAg.b;
                        i();
                        jIntValue = j118 - ((long) ((Integer) lcl.n.b(null)).intValue());
                        if (jIntValue > 0) {
                            if (jIntValue % 1000 == 1) {
                                aT().c.c("Data loss. Too many public events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.b));
                            }
                            r().R(this.L, str3, 16, "_ev", lcdVarA.a, 0);
                            if (zF) {
                                v().T(str3, "event_dropped_count", "quota_exceeded", 1L, 0L);
                            }
                            v().Y();
                        } else {
                            if (zEquals) {
                                bundleA = lccVar2.a();
                                r().S(bundleA, "_o", lcdVarA.c);
                                if (r().ak(str3, lbgVar.B)) {
                                    r().S(bundleA, "_dbg", 1L);
                                    r().S(bundleA, "_r", 1L);
                                }
                                if ("_s".equals(str2)) {
                                    obj = aaqpVarAp2.c;
                                    if (obj instanceof Long) {
                                        r().S(bundleA, str25, obj);
                                    }
                                }
                                lgpVarV2 = v();
                                kro.i(str3);
                                lgpVarV2.o();
                                lgpVarV2.w();
                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                if (jDelete > 0) {
                                    aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                }
                                ldrVar = this.j;
                                lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                lgp lgpVarV14 = v();
                                str4 = lbzVar.b;
                                lcaVarJ = lgpVarV14.j("events", str3, str4);
                                if (lcaVarJ == null) {
                                    lgpVarV5 = v();
                                    kro.i(str3);
                                    if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                        r();
                                        if (!lga.ab(str4, lec.c)) {
                                            aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                            r().R(this.L, str3, 8, null, null, 0);
                                            if (zF) {
                                                aU().j(new lfa(this, str3, 9, bArr));
                                            }
                                        }
                                    }
                                    lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                    lbzVar2 = lbzVar;
                                } else {
                                    lbz lbzVar11 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                    lca lcaVarC9 = lcaVarJ.c(lbzVar11.d);
                                    lbzVar2 = lbzVar11;
                                    lcaVar = lcaVarC9;
                                }
                                v().aa("events", lcaVar);
                                A();
                                D();
                                kro.l(lbgVar);
                                String str21111 = lbzVar2.a;
                                kro.i(str21111);
                                str5 = lbgVar.a;
                                kro.c(str21111.equals(str5));
                                lir lirVar211111114 = lir.a;
                                aihfVarCreateBuilder = lirVar211111114.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar211111115.b |= 1;
                                lirVar211111115.d = 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111116 = (lir) aihfVarCreateBuilder.instance;
                                lirVar211111116.b |= 64;
                                lirVar211111116.l = "android";
                                if (!TextUtils.isEmpty(str5)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211111117 = (lir) aihfVarCreateBuilder.instance;
                                    str5.getClass();
                                    lirVar211111117.b |= SemanticState.Obscured;
                                    lirVar211111117.r = str5;
                                }
                                str6 = lbgVar.d;
                                if (!TextUtils.isEmpty(str6)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211111118 = (lir) aihfVarCreateBuilder.instance;
                                    str6.getClass();
                                    lirVar211111118.b |= SemanticState.Modal;
                                    lirVar211111118.q = str6;
                                }
                                str7 = lbgVar.c;
                                if (!TextUtils.isEmpty(str7)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar211111119 = (lir) aihfVarCreateBuilder.instance;
                                    str7.getClass();
                                    lirVar211111119.b |= SemanticState.Multiline;
                                    lirVar211111119.s = str7;
                                }
                                str8 = lbgVar.u;
                                if (!TextUtils.isEmpty(str8)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar314 = (lir) aihfVarCreateBuilder.instance;
                                    str8.getClass();
                                    lirVar314.c |= SemanticState.Multiline;
                                    lirVar314.P = str8;
                                }
                                j2 = lbgVar.j;
                                if (j2 != -2147483648L) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar315 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar315.b |= 33554432;
                                    lirVar315.F = (int) j2;
                                }
                                j3 = lbgVar.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111110 = (lir) aihfVarCreateBuilder.instance;
                                str9 = str8;
                                lirVar1111111110.b |= 16384;
                                lirVar1111111110.t = j3;
                                str10 = lbgVar.b;
                                if (!TextUtils.isEmpty(str10)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111111111 = (lir) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    lirVar1111111111.b |= 4194304;
                                    lirVar1111111111.B = str10;
                                }
                                kro.l(str5);
                                lgh lghVarU9 = u(str5);
                                String str21112 = lbgVar.s;
                                String strK9 = lghVarU9.h(lgh.g(str21112, 100)).k();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1111111112.c |= SemanticState.Focused;
                                lirVar1111111112.O = strK9;
                                j4 = lbgVar.f;
                                if (j4 != 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar1111111113 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar1111111113.b |= 524288;
                                    lirVar1111111113.y = j4;
                                }
                                j5 = lbgVar.q;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111114 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1111111114.c |= 16;
                                lirVar1111111114.M = j5;
                                i();
                                String str21113 = (String) aurg.a.io();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1111111115.c |= 1073741824;
                                lirVar1111111115.ad = str21113;
                                kro.l(str5);
                                lghVarH = u(str5).h(lgh.g(str21112, 100));
                                if (lghVarH.m()) {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                } else {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                }
                                String strB9 = j().b();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111116 = (lir) aihfVarCreateBuilder.instance;
                                strB9.getClass();
                                lirVar1111111116.b |= SemanticState.Hidden;
                                lirVar1111111116.n = strB9;
                                String strC9 = j().c();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111117 = (lir) aihfVarCreateBuilder.instance;
                                strC9.getClass();
                                lirVar1111111117.b |= SemanticState.Focused;
                                lirVar1111111117.m = strC9;
                                int iA9 = (int) j().a();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111118 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1111111118.b |= SemanticState.ReadOnly;
                                lirVar1111111118.p = iA9;
                                String strD10 = j().d();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111119 = (lir) aihfVarCreateBuilder.instance;
                                strD10.getClass();
                                lirVar1111111119.b |= SemanticState.LiveRegion;
                                lirVar1111111119.o = strD10;
                                long j119 = lbgVar.w;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111111110 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111111110.c |= 32768;
                                lirVar2111111110.S = j119;
                                if (r38.w()) {
                                    String str3114 = ((lir) aihfVarCreateBuilder.instance).r;
                                }
                                lbdVarH = v().h(str5);
                                if (lbdVarH == null) {
                                    lbdVarH = new lbd(ldrVar, str5);
                                    lbdVarH.M(x(lghVarH));
                                    lbdVarH.V(lbgVar.k);
                                    lbdVarH.W(str10);
                                    if (lghVarH.m()) {
                                        lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                    }
                                    lbdVarH.aa(0L);
                                    lbdVarH.ab(0L);
                                    lbdVarH.Z(0L);
                                    lbdVarH.O(str7);
                                    lbdVarH.P(j2);
                                    lbdVarH.N(str6);
                                    lbdVarH.X(j3);
                                    lbdVarH.S(j4);
                                    lbdVarH.ae(lbgVar.h);
                                    lbdVarH.T(j6);
                                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                        lbdVarH.ad(lbgVar.G);
                                        lbdVarH.L(lbgVar.H);
                                        lbdVarH.al(lbgVar.I);
                                    }
                                    i = 0;
                                    v().an(lbdVarH, false);
                                } else {
                                    i = 0;
                                }
                                if (lghVarH.o()) {
                                    String strX9 = lbdVarH.x();
                                    kro.l(strX9);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111111111 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar2111111111.b |= 262144;
                                    lirVar2111111111.x = strX9;
                                }
                                if (!TextUtils.isEmpty(lbdVarH.A())) {
                                    String strA9 = lbdVarH.A();
                                    kro.l(strA9);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111111112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar2111111112.b |= 16777216;
                                    lirVar2111111112.E = strA9;
                                }
                                listB = v().B(str5);
                                i2 = i;
                                while (i2 < listB.size()) {
                                    aihf aihfVarCreateBuilder10 = lix.a.createBuilder();
                                    Object obj11 = ((aaqp) listB.get(i2)).d;
                                    aihfVarCreateBuilder10.copyOnWrite();
                                    lix lixVar115 = (lix) aihfVarCreateBuilder10.instance;
                                    obj11.getClass();
                                    lixVar115.b |= 2;
                                    lixVar115.d = (String) obj11;
                                    long j1110 = ((aaqp) listB.get(i2)).a;
                                    aihfVarCreateBuilder10.copyOnWrite();
                                    lix lixVar116 = (lix) aihfVarCreateBuilder10.instance;
                                    lixVar116.b |= 1;
                                    lixVar116.c = j1110;
                                    q().Y(aihfVarCreateBuilder10, ((aaqp) listB.get(i2)).c);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111111113 = (lir) aihfVarCreateBuilder.instance;
                                    lix lixVar117 = (lix) aihfVarCreateBuilder10.build();
                                    lixVar117.getClass();
                                    lirVar2111111113.b();
                                    lirVar2111111113.f.add(lixVar117);
                                    str12 = str24;
                                    if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                        str13 = str9;
                                    } else {
                                        str13 = str9;
                                    }
                                    i2++;
                                    str24 = str12;
                                    str9 = str13;
                                }
                                lgpVarV3 = v();
                                lirVar = (lir) aihfVarCreateBuilder.build();
                                lgpVarV3.o();
                                lgpVarV3.w();
                                kro.l(lirVar);
                                kro.i(lirVar.r);
                                byte[] byteArray17 = lirVar.toByteArray();
                                long jD9 = lgpVarV3.u().d(byteArray17);
                                ContentValues contentValues10 = new ContentValues();
                                String str3115 = str15;
                                contentValues10.put(str3115, lirVar.r);
                                contentValues10.put("metadata_fingerprint", Long.valueOf(jD9));
                                contentValues10.put("metadata", byteArray17);
                                lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
                                lgpVarV4 = v();
                                lcbVar2 = new lcb(lbzVar2.g);
                                while (true) {
                                    if (lcbVar2.hasNext()) {
                                        ldo ldoVarO10 = o();
                                        String str3116 = lbzVar2.a;
                                        zM = ldoVarO10.m(str3116, lbzVar2.b);
                                        lgl lglVarAg10 = v().ag(a(), str3116, 1L, false, false, false, false, false, false);
                                        if (zM) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(lcbVar2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lgpVarV4.o();
                                lgpVarV4.w();
                                str11 = lbzVar2.a;
                                kro.i(str11);
                                byte[] byteArray18 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                contentValues = new ContentValues();
                                contentValues.put(str3115, str11);
                                contentValues.put("name", lbzVar2.b);
                                contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jD9));
                                contentValues.put("data", byteArray18);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                } else {
                                    this.l = 0L;
                                }
                                v().Y();
                                v().S();
                                V();
                                aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            jMax = lglVarAg.e - ((long) Math.max(0, Math.min(1000000, i().C(lbgVar.a, lcl.m))));
                            if (jMax <= 0) {
                                bundleA = lccVar2.a();
                                r().S(bundleA, "_o", lcdVarA.c);
                                if (r().ak(str3, lbgVar.B)) {
                                    r().S(bundleA, "_dbg", 1L);
                                    r().S(bundleA, "_r", 1L);
                                }
                                if ("_s".equals(str2)) {
                                    obj = aaqpVarAp2.c;
                                    if (obj instanceof Long) {
                                        r().S(bundleA, str25, obj);
                                    }
                                }
                                lgpVarV2 = v();
                                kro.i(str3);
                                lgpVarV2.o();
                                lgpVarV2.w();
                                jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                                if (jDelete > 0) {
                                    aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                                }
                                ldrVar = this.j;
                                lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                                lgp lgpVarV15 = v();
                                str4 = lbzVar.b;
                                lcaVarJ = lgpVarV15.j("events", str3, str4);
                                if (lcaVarJ == null) {
                                    lgpVarV5 = v();
                                    kro.i(str3);
                                    if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                        r();
                                        if (!lga.ab(str4, lec.c)) {
                                            aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                            r().R(this.L, str3, 8, null, null, 0);
                                            if (zF) {
                                                aU().j(new lfa(this, str3, 9, bArr));
                                            }
                                        }
                                    }
                                    lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                    lbzVar2 = lbzVar;
                                } else {
                                    lbz lbzVar12 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                    lca lcaVarC10 = lcaVarJ.c(lbzVar12.d);
                                    lbzVar2 = lbzVar12;
                                    lcaVar = lcaVarC10;
                                }
                                v().aa("events", lcaVar);
                                A();
                                D();
                                kro.l(lbgVar);
                                String str21114 = lbzVar2.a;
                                kro.i(str21114);
                                str5 = lbgVar.a;
                                kro.c(str21114.equals(str5));
                                lir lirVar2111111114 = lir.a;
                                aihfVarCreateBuilder = lirVar2111111114.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111111115.b |= 1;
                                lirVar2111111115.d = 1;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111111116 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111111116.b |= 64;
                                lirVar2111111116.l = "android";
                                if (!TextUtils.isEmpty(str5)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111111117 = (lir) aihfVarCreateBuilder.instance;
                                    str5.getClass();
                                    lirVar2111111117.b |= SemanticState.Obscured;
                                    lirVar2111111117.r = str5;
                                }
                                str6 = lbgVar.d;
                                if (!TextUtils.isEmpty(str6)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111111118 = (lir) aihfVarCreateBuilder.instance;
                                    str6.getClass();
                                    lirVar2111111118.b |= SemanticState.Modal;
                                    lirVar2111111118.q = str6;
                                }
                                str7 = lbgVar.c;
                                if (!TextUtils.isEmpty(str7)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar2111111119 = (lir) aihfVarCreateBuilder.instance;
                                    str7.getClass();
                                    lirVar2111111119.b |= SemanticState.Multiline;
                                    lirVar2111111119.s = str7;
                                }
                                str8 = lbgVar.u;
                                if (!TextUtils.isEmpty(str8)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar316 = (lir) aihfVarCreateBuilder.instance;
                                    str8.getClass();
                                    lirVar316.c |= SemanticState.Multiline;
                                    lirVar316.P = str8;
                                }
                                j2 = lbgVar.j;
                                if (j2 != -2147483648L) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar317 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar317.b |= 33554432;
                                    lirVar317.F = (int) j2;
                                }
                                j3 = lbgVar.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111110 = (lir) aihfVarCreateBuilder.instance;
                                str9 = str8;
                                lirVar11111111110.b |= 16384;
                                lirVar11111111110.t = j3;
                                str10 = lbgVar.b;
                                if (!TextUtils.isEmpty(str10)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar11111111111 = (lir) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    lirVar11111111111.b |= 4194304;
                                    lirVar11111111111.B = str10;
                                }
                                kro.l(str5);
                                lgh lghVarU10 = u(str5);
                                String str21115 = lbgVar.s;
                                String strK10 = lghVarU10.h(lgh.g(str21115, 100)).k();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111111112.c |= SemanticState.Focused;
                                lirVar11111111112.O = strK10;
                                j4 = lbgVar.f;
                                if (j4 != 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar11111111113 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar11111111113.b |= 524288;
                                    lirVar11111111113.y = j4;
                                }
                                j5 = lbgVar.q;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111114 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111111114.c |= 16;
                                lirVar11111111114.M = j5;
                                i();
                                String str21116 = (String) aurg.a.io();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111115 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111111115.c |= 1073741824;
                                lirVar11111111115.ad = str21116;
                                kro.l(str5);
                                lghVarH = u(str5).h(lgh.g(str21115, 100));
                                if (lghVarH.m()) {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                } else {
                                    str10 = str10;
                                    lbzVar2 = lbzVar2;
                                    str7 = str7;
                                    j6 = j5;
                                }
                                String strB10 = j().b();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111116 = (lir) aihfVarCreateBuilder.instance;
                                strB10.getClass();
                                lirVar11111111116.b |= SemanticState.Hidden;
                                lirVar11111111116.n = strB10;
                                String strC10 = j().c();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111117 = (lir) aihfVarCreateBuilder.instance;
                                strC10.getClass();
                                lirVar11111111117.b |= SemanticState.Focused;
                                lirVar11111111117.m = strC10;
                                int iA10 = (int) j().a();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111118 = (lir) aihfVarCreateBuilder.instance;
                                lirVar11111111118.b |= SemanticState.ReadOnly;
                                lirVar11111111118.p = iA10;
                                String strD11 = j().d();
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar11111111119 = (lir) aihfVarCreateBuilder.instance;
                                strD11.getClass();
                                lirVar11111111119.b |= SemanticState.LiveRegion;
                                lirVar11111111119.o = strD11;
                                long j1111 = lbgVar.w;
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111111110 = (lir) aihfVarCreateBuilder.instance;
                                lirVar21111111110.c |= 32768;
                                lirVar21111111110.S = j1111;
                                if (r38.w()) {
                                    String str3117 = ((lir) aihfVarCreateBuilder.instance).r;
                                }
                                lbdVarH = v().h(str5);
                                if (lbdVarH == null) {
                                    lbdVarH = new lbd(ldrVar, str5);
                                    lbdVarH.M(x(lghVarH));
                                    lbdVarH.V(lbgVar.k);
                                    lbdVarH.W(str10);
                                    if (lghVarH.m()) {
                                        lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                    }
                                    lbdVarH.aa(0L);
                                    lbdVarH.ab(0L);
                                    lbdVarH.Z(0L);
                                    lbdVarH.O(str7);
                                    lbdVarH.P(j2);
                                    lbdVarH.N(str6);
                                    lbdVarH.X(j3);
                                    lbdVarH.S(j4);
                                    lbdVarH.ae(lbgVar.h);
                                    lbdVarH.T(j6);
                                    if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                        lbdVarH.ad(lbgVar.G);
                                        lbdVarH.L(lbgVar.H);
                                        lbdVarH.al(lbgVar.I);
                                    }
                                    i = 0;
                                    v().an(lbdVarH, false);
                                } else {
                                    i = 0;
                                }
                                if (lghVarH.o()) {
                                    String strX10 = lbdVarH.x();
                                    kro.l(strX10);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111111111 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21111111111.b |= 262144;
                                    lirVar21111111111.x = strX10;
                                }
                                if (!TextUtils.isEmpty(lbdVarH.A())) {
                                    String strA10 = lbdVarH.A();
                                    kro.l(strA10);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111111112 = (lir) aihfVarCreateBuilder.instance;
                                    lirVar21111111112.b |= 16777216;
                                    lirVar21111111112.E = strA10;
                                }
                                listB = v().B(str5);
                                i2 = i;
                                while (i2 < listB.size()) {
                                    aihf aihfVarCreateBuilder11 = lix.a.createBuilder();
                                    Object obj12 = ((aaqp) listB.get(i2)).d;
                                    aihfVarCreateBuilder11.copyOnWrite();
                                    lix lixVar118 = (lix) aihfVarCreateBuilder11.instance;
                                    obj12.getClass();
                                    lixVar118.b |= 2;
                                    lixVar118.d = (String) obj12;
                                    long j1112 = ((aaqp) listB.get(i2)).a;
                                    aihfVarCreateBuilder11.copyOnWrite();
                                    lix lixVar119 = (lix) aihfVarCreateBuilder11.instance;
                                    lixVar119.b |= 1;
                                    lixVar119.c = j1112;
                                    q().Y(aihfVarCreateBuilder11, ((aaqp) listB.get(i2)).c);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lir lirVar21111111113 = (lir) aihfVarCreateBuilder.instance;
                                    lix lixVar1110 = (lix) aihfVarCreateBuilder11.build();
                                    lixVar1110.getClass();
                                    lirVar21111111113.b();
                                    lirVar21111111113.f.add(lixVar1110);
                                    str12 = str24;
                                    if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                        str13 = str9;
                                    } else {
                                        str13 = str9;
                                    }
                                    i2++;
                                    str24 = str12;
                                    str9 = str13;
                                }
                                lgpVarV3 = v();
                                lirVar = (lir) aihfVarCreateBuilder.build();
                                lgpVarV3.o();
                                lgpVarV3.w();
                                kro.l(lirVar);
                                kro.i(lirVar.r);
                                byte[] byteArray19 = lirVar.toByteArray();
                                long jD10 = lgpVarV3.u().d(byteArray19);
                                ContentValues contentValues11 = new ContentValues();
                                String str3118 = str15;
                                contentValues11.put(str3118, lirVar.r);
                                contentValues11.put("metadata_fingerprint", Long.valueOf(jD10));
                                contentValues11.put("metadata", byteArray19);
                                lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
                                lgpVarV4 = v();
                                lcbVar2 = new lcb(lbzVar2.g);
                                while (true) {
                                    if (lcbVar2.hasNext()) {
                                        ldo ldoVarO11 = o();
                                        String str3119 = lbzVar2.a;
                                        zM = ldoVarO11.m(str3119, lbzVar2.b);
                                        lgl lglVarAg11 = v().ag(a(), str3119, 1L, false, false, false, false, false, false);
                                        if (zM) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(lcbVar2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lgpVarV4.o();
                                lgpVarV4.w();
                                str11 = lbzVar2.a;
                                kro.i(str11);
                                byte[] byteArray110 = lgpVarV4.u().k(lbzVar2).toByteArray();
                                contentValues = new ContentValues();
                                contentValues.put(str3118, str11);
                                contentValues.put("name", lbzVar2.b);
                                contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jD10));
                                contentValues.put("data", byteArray110);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                                if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                    lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                                } else {
                                    this.l = 0L;
                                }
                                v().Y();
                                v().S();
                                V();
                                aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            if (jMax == 1) {
                                aT().c.c("Too many error events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.e));
                            }
                            v().Y();
                        }
                    } else {
                        if (zEquals) {
                            bundleA = lccVar2.a();
                            r().S(bundleA, "_o", lcdVarA.c);
                            if (r().ak(str3, lbgVar.B)) {
                                r().S(bundleA, "_dbg", 1L);
                                r().S(bundleA, "_r", 1L);
                            }
                            if ("_s".equals(str2)) {
                                obj = aaqpVarAp2.c;
                                if (obj instanceof Long) {
                                    r().S(bundleA, str25, obj);
                                }
                            }
                            lgpVarV2 = v();
                            kro.i(str3);
                            lgpVarV2.o();
                            lgpVarV2.w();
                            jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                            if (jDelete > 0) {
                                aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                            }
                            ldrVar = this.j;
                            lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                            lgp lgpVarV16 = v();
                            str4 = lbzVar.b;
                            lcaVarJ = lgpVarV16.j("events", str3, str4);
                            if (lcaVarJ == null) {
                                lgpVarV5 = v();
                                kro.i(str3);
                                if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                    r();
                                    if (!lga.ab(str4, lec.c)) {
                                        aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                        r().R(this.L, str3, 8, null, null, 0);
                                        if (zF) {
                                            aU().j(new lfa(this, str3, 9, bArr));
                                        }
                                    }
                                }
                                lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                lbzVar2 = lbzVar;
                            } else {
                                lbz lbzVar13 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                lca lcaVarC11 = lcaVarJ.c(lbzVar13.d);
                                lbzVar2 = lbzVar13;
                                lcaVar = lcaVarC11;
                            }
                            v().aa("events", lcaVar);
                            A();
                            D();
                            kro.l(lbgVar);
                            String str21117 = lbzVar2.a;
                            kro.i(str21117);
                            str5 = lbgVar.a;
                            kro.c(str21117.equals(str5));
                            lir lirVar21111111114 = lir.a;
                            aihfVarCreateBuilder = lirVar21111111114.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar21111111115 = (lir) aihfVarCreateBuilder.instance;
                            lirVar21111111115.b |= 1;
                            lirVar21111111115.d = 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar21111111116 = (lir) aihfVarCreateBuilder.instance;
                            lirVar21111111116.b |= 64;
                            lirVar21111111116.l = "android";
                            if (!TextUtils.isEmpty(str5)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111111117 = (lir) aihfVarCreateBuilder.instance;
                                str5.getClass();
                                lirVar21111111117.b |= SemanticState.Obscured;
                                lirVar21111111117.r = str5;
                            }
                            str6 = lbgVar.d;
                            if (!TextUtils.isEmpty(str6)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111111118 = (lir) aihfVarCreateBuilder.instance;
                                str6.getClass();
                                lirVar21111111118.b |= SemanticState.Modal;
                                lirVar21111111118.q = str6;
                            }
                            str7 = lbgVar.c;
                            if (!TextUtils.isEmpty(str7)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar21111111119 = (lir) aihfVarCreateBuilder.instance;
                                str7.getClass();
                                lirVar21111111119.b |= SemanticState.Multiline;
                                lirVar21111111119.s = str7;
                            }
                            str8 = lbgVar.u;
                            if (!TextUtils.isEmpty(str8)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar318 = (lir) aihfVarCreateBuilder.instance;
                                str8.getClass();
                                lirVar318.c |= SemanticState.Multiline;
                                lirVar318.P = str8;
                            }
                            j2 = lbgVar.j;
                            if (j2 != -2147483648L) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar319 = (lir) aihfVarCreateBuilder.instance;
                                lirVar319.b |= 33554432;
                                lirVar319.F = (int) j2;
                            }
                            j3 = lbgVar.e;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111110 = (lir) aihfVarCreateBuilder.instance;
                            str9 = str8;
                            lirVar111111111110.b |= 16384;
                            lirVar111111111110.t = j3;
                            str10 = lbgVar.b;
                            if (!TextUtils.isEmpty(str10)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111111111 = (lir) aihfVarCreateBuilder.instance;
                                str10.getClass();
                                lirVar111111111111.b |= 4194304;
                                lirVar111111111111.B = str10;
                            }
                            kro.l(str5);
                            lgh lghVarU11 = u(str5);
                            String str21118 = lbgVar.s;
                            String strK11 = lghVarU11.h(lgh.g(str21118, 100)).k();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111112 = (lir) aihfVarCreateBuilder.instance;
                            lirVar111111111112.c |= SemanticState.Focused;
                            lirVar111111111112.O = strK11;
                            j4 = lbgVar.f;
                            if (j4 != 0) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar111111111113 = (lir) aihfVarCreateBuilder.instance;
                                lirVar111111111113.b |= 524288;
                                lirVar111111111113.y = j4;
                            }
                            j5 = lbgVar.q;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111114 = (lir) aihfVarCreateBuilder.instance;
                            lirVar111111111114.c |= 16;
                            lirVar111111111114.M = j5;
                            i();
                            String str21119 = (String) aurg.a.io();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111115 = (lir) aihfVarCreateBuilder.instance;
                            lirVar111111111115.c |= 1073741824;
                            lirVar111111111115.ad = str21119;
                            kro.l(str5);
                            lghVarH = u(str5).h(lgh.g(str21118, 100));
                            if (lghVarH.m()) {
                                str10 = str10;
                                lbzVar2 = lbzVar2;
                                str7 = str7;
                                j6 = j5;
                            } else {
                                str10 = str10;
                                lbzVar2 = lbzVar2;
                                str7 = str7;
                                j6 = j5;
                            }
                            String strB11 = j().b();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111116 = (lir) aihfVarCreateBuilder.instance;
                            strB11.getClass();
                            lirVar111111111116.b |= SemanticState.Hidden;
                            lirVar111111111116.n = strB11;
                            String strC11 = j().c();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111117 = (lir) aihfVarCreateBuilder.instance;
                            strC11.getClass();
                            lirVar111111111117.b |= SemanticState.Focused;
                            lirVar111111111117.m = strC11;
                            int iA11 = (int) j().a();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111118 = (lir) aihfVarCreateBuilder.instance;
                            lirVar111111111118.b |= SemanticState.ReadOnly;
                            lirVar111111111118.p = iA11;
                            String strD12 = j().d();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar111111111119 = (lir) aihfVarCreateBuilder.instance;
                            strD12.getClass();
                            lirVar111111111119.b |= SemanticState.LiveRegion;
                            lirVar111111111119.o = strD12;
                            long j1113 = lbgVar.w;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar211111111110 = (lir) aihfVarCreateBuilder.instance;
                            lirVar211111111110.c |= 32768;
                            lirVar211111111110.S = j1113;
                            if (r38.w()) {
                                String str31110 = ((lir) aihfVarCreateBuilder.instance).r;
                            }
                            lbdVarH = v().h(str5);
                            if (lbdVarH == null) {
                                lbdVarH = new lbd(ldrVar, str5);
                                lbdVarH.M(x(lghVarH));
                                lbdVarH.V(lbgVar.k);
                                lbdVarH.W(str10);
                                if (lghVarH.m()) {
                                    lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                }
                                lbdVarH.aa(0L);
                                lbdVarH.ab(0L);
                                lbdVarH.Z(0L);
                                lbdVarH.O(str7);
                                lbdVarH.P(j2);
                                lbdVarH.N(str6);
                                lbdVarH.X(j3);
                                lbdVarH.S(j4);
                                lbdVarH.ae(lbgVar.h);
                                lbdVarH.T(j6);
                                if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                    lbdVarH.ad(lbgVar.G);
                                    lbdVarH.L(lbgVar.H);
                                    lbdVarH.al(lbgVar.I);
                                }
                                i = 0;
                                v().an(lbdVarH, false);
                            } else {
                                i = 0;
                            }
                            if (lghVarH.o()) {
                                String strX11 = lbdVarH.x();
                                kro.l(strX11);
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111111111 = (lir) aihfVarCreateBuilder.instance;
                                lirVar211111111111.b |= 262144;
                                lirVar211111111111.x = strX11;
                            }
                            if (!TextUtils.isEmpty(lbdVarH.A())) {
                                String strA11 = lbdVarH.A();
                                kro.l(strA11);
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111111112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar211111111112.b |= 16777216;
                                lirVar211111111112.E = strA11;
                            }
                            listB = v().B(str5);
                            i2 = i;
                            while (i2 < listB.size()) {
                                aihf aihfVarCreateBuilder12 = lix.a.createBuilder();
                                Object obj13 = ((aaqp) listB.get(i2)).d;
                                aihfVarCreateBuilder12.copyOnWrite();
                                lix lixVar1111 = (lix) aihfVarCreateBuilder12.instance;
                                obj13.getClass();
                                lixVar1111.b |= 2;
                                lixVar1111.d = (String) obj13;
                                long j1114 = ((aaqp) listB.get(i2)).a;
                                aihfVarCreateBuilder12.copyOnWrite();
                                lix lixVar1112 = (lix) aihfVarCreateBuilder12.instance;
                                lixVar1112.b |= 1;
                                lixVar1112.c = j1114;
                                q().Y(aihfVarCreateBuilder12, ((aaqp) listB.get(i2)).c);
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111111113 = (lir) aihfVarCreateBuilder.instance;
                                lix lixVar1113 = (lix) aihfVarCreateBuilder12.build();
                                lixVar1113.getClass();
                                lirVar211111111113.b();
                                lirVar211111111113.f.add(lixVar1113);
                                str12 = str24;
                                if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                    str13 = str9;
                                } else {
                                    str13 = str9;
                                }
                                i2++;
                                str24 = str12;
                                str9 = str13;
                            }
                            lgpVarV3 = v();
                            lirVar = (lir) aihfVarCreateBuilder.build();
                            lgpVarV3.o();
                            lgpVarV3.w();
                            kro.l(lirVar);
                            kro.i(lirVar.r);
                            byte[] byteArray111 = lirVar.toByteArray();
                            long jD11 = lgpVarV3.u().d(byteArray111);
                            ContentValues contentValues12 = new ContentValues();
                            String str31111 = str15;
                            contentValues12.put(str31111, lirVar.r);
                            contentValues12.put("metadata_fingerprint", Long.valueOf(jD11));
                            contentValues12.put("metadata", byteArray111);
                            lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
                            lgpVarV4 = v();
                            lcbVar2 = new lcb(lbzVar2.g);
                            while (true) {
                                if (lcbVar2.hasNext()) {
                                    ldo ldoVarO12 = o();
                                    String str31112 = lbzVar2.a;
                                    zM = ldoVarO12.m(str31112, lbzVar2.b);
                                    lgl lglVarAg12 = v().ag(a(), str31112, 1L, false, false, false, false, false, false);
                                    if (zM) {
                                    }
                                    i3 = i;
                                    break;
                                }
                                if ("_r".equals(lcbVar2.next())) {
                                }
                                i3 = 1;
                                break;
                            }
                            lgpVarV4.o();
                            lgpVarV4.w();
                            str11 = lbzVar2.a;
                            kro.i(str11);
                            byte[] byteArray112 = lgpVarV4.u().k(lbzVar2).toByteArray();
                            contentValues = new ContentValues();
                            contentValues.put(str31111, str11);
                            contentValues.put("name", lbzVar2.b);
                            contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jD11));
                            contentValues.put("data", byteArray112);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                            if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                            } else {
                                this.l = 0L;
                            }
                            v().Y();
                            v().S();
                            V();
                            aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                            return;
                        }
                        jMax = lglVarAg.e - ((long) Math.max(0, Math.min(1000000, i().C(lbgVar.a, lcl.m))));
                        if (jMax <= 0) {
                            bundleA = lccVar2.a();
                            r().S(bundleA, "_o", lcdVarA.c);
                            if (r().ak(str3, lbgVar.B)) {
                                r().S(bundleA, "_dbg", 1L);
                                r().S(bundleA, "_r", 1L);
                            }
                            if ("_s".equals(str2)) {
                                obj = aaqpVarAp2.c;
                                if (obj instanceof Long) {
                                    r().S(bundleA, str25, obj);
                                }
                            }
                            lgpVarV2 = v();
                            kro.i(str3);
                            lgpVarV2.o();
                            lgpVarV2.w();
                            jDelete = lgpVarV2.e().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, Math.min(1000000, lgpVarV2.G().C(str3, lcl.q))))});
                            if (jDelete > 0) {
                                aT().f.c("Data lost. Too many events stored on disk, deleted. appId", lcz.a(str3), Long.valueOf(jDelete));
                            }
                            ldrVar = this.j;
                            lbzVar = new lbz(ldrVar, lcdVarA.c, str3, lcdVarA.a, lcdVarA.d, lcdVarA.e, 0L, bundleA);
                            lgp lgpVarV17 = v();
                            str4 = lbzVar.b;
                            lcaVarJ = lgpVarV17.j("events", str3, str4);
                            if (lcaVarJ == null) {
                                lgpVarV5 = v();
                                kro.i(str3);
                                if (lgpVarV5.d("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str3}, 0L) >= i().b(str3)) {
                                    r();
                                    if (!lga.ab(str4, lec.c)) {
                                        aT().c.d("Too many event names used, ignoring event. appId, name, supported count", lcz.a(str3), k().c(str4), Integer.valueOf(i().b(str3)));
                                        r().R(this.L, str3, 8, null, null, 0);
                                        if (zF) {
                                            aU().j(new lfa(this, str3, 9, bArr));
                                        }
                                    }
                                }
                                lcaVar = new lca(str3, str4, 0L, 0L, 0L, lbzVar.d, 0L, null, null, null, null);
                                lbzVar2 = lbzVar;
                            } else {
                                lbz lbzVar14 = new lbz(ldrVar, lbzVar.c, lbzVar.a, str4, lbzVar.d, lbzVar.e, lcaVarJ.f, lbzVar.g);
                                lca lcaVarC12 = lcaVarJ.c(lbzVar14.d);
                                lbzVar2 = lbzVar14;
                                lcaVar = lcaVarC12;
                            }
                            v().aa("events", lcaVar);
                            A();
                            D();
                            kro.l(lbgVar);
                            String str211110 = lbzVar2.a;
                            kro.i(str211110);
                            str5 = lbgVar.a;
                            kro.c(str211110.equals(str5));
                            lir lirVar211111111114 = lir.a;
                            aihfVarCreateBuilder = lirVar211111111114.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar211111111115 = (lir) aihfVarCreateBuilder.instance;
                            lirVar211111111115.b |= 1;
                            lirVar211111111115.d = 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar211111111116 = (lir) aihfVarCreateBuilder.instance;
                            lirVar211111111116.b |= 64;
                            lirVar211111111116.l = "android";
                            if (!TextUtils.isEmpty(str5)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111111117 = (lir) aihfVarCreateBuilder.instance;
                                str5.getClass();
                                lirVar211111111117.b |= SemanticState.Obscured;
                                lirVar211111111117.r = str5;
                            }
                            str6 = lbgVar.d;
                            if (!TextUtils.isEmpty(str6)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111111118 = (lir) aihfVarCreateBuilder.instance;
                                str6.getClass();
                                lirVar211111111118.b |= SemanticState.Modal;
                                lirVar211111111118.q = str6;
                            }
                            str7 = lbgVar.c;
                            if (!TextUtils.isEmpty(str7)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar211111111119 = (lir) aihfVarCreateBuilder.instance;
                                str7.getClass();
                                lirVar211111111119.b |= SemanticState.Multiline;
                                lirVar211111111119.s = str7;
                            }
                            str8 = lbgVar.u;
                            if (!TextUtils.isEmpty(str8)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar3110 = (lir) aihfVarCreateBuilder.instance;
                                str8.getClass();
                                lirVar3110.c |= SemanticState.Multiline;
                                lirVar3110.P = str8;
                            }
                            j2 = lbgVar.j;
                            if (j2 != -2147483648L) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar3111 = (lir) aihfVarCreateBuilder.instance;
                                lirVar3111.b |= 33554432;
                                lirVar3111.F = (int) j2;
                            }
                            j3 = lbgVar.e;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111110 = (lir) aihfVarCreateBuilder.instance;
                            str9 = str8;
                            lirVar1111111111110.b |= 16384;
                            lirVar1111111111110.t = j3;
                            str10 = lbgVar.b;
                            if (!TextUtils.isEmpty(str10)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111111111 = (lir) aihfVarCreateBuilder.instance;
                                str10.getClass();
                                lirVar1111111111111.b |= 4194304;
                                lirVar1111111111111.B = str10;
                            }
                            kro.l(str5);
                            lgh lghVarU12 = u(str5);
                            String str211111 = lbgVar.s;
                            String strK12 = lghVarU12.h(lgh.g(str211111, 100)).k();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111112 = (lir) aihfVarCreateBuilder.instance;
                            lirVar1111111111112.c |= SemanticState.Focused;
                            lirVar1111111111112.O = strK12;
                            j4 = lbgVar.f;
                            if (j4 != 0) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar1111111111113 = (lir) aihfVarCreateBuilder.instance;
                                lirVar1111111111113.b |= 524288;
                                lirVar1111111111113.y = j4;
                            }
                            j5 = lbgVar.q;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111114 = (lir) aihfVarCreateBuilder.instance;
                            lirVar1111111111114.c |= 16;
                            lirVar1111111111114.M = j5;
                            i();
                            String str211112 = (String) aurg.a.io();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111115 = (lir) aihfVarCreateBuilder.instance;
                            lirVar1111111111115.c |= 1073741824;
                            lirVar1111111111115.ad = str211112;
                            kro.l(str5);
                            lghVarH = u(str5).h(lgh.g(str211111, 100));
                            if (lghVarH.m()) {
                                str10 = str10;
                                lbzVar2 = lbzVar2;
                                str7 = str7;
                                j6 = j5;
                            } else {
                                str10 = str10;
                                lbzVar2 = lbzVar2;
                                str7 = str7;
                                j6 = j5;
                            }
                            String strB12 = j().b();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111116 = (lir) aihfVarCreateBuilder.instance;
                            strB12.getClass();
                            lirVar1111111111116.b |= SemanticState.Hidden;
                            lirVar1111111111116.n = strB12;
                            String strC12 = j().c();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111117 = (lir) aihfVarCreateBuilder.instance;
                            strC12.getClass();
                            lirVar1111111111117.b |= SemanticState.Focused;
                            lirVar1111111111117.m = strC12;
                            int iA12 = (int) j().a();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111118 = (lir) aihfVarCreateBuilder.instance;
                            lirVar1111111111118.b |= SemanticState.ReadOnly;
                            lirVar1111111111118.p = iA12;
                            String strD13 = j().d();
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar1111111111119 = (lir) aihfVarCreateBuilder.instance;
                            strD13.getClass();
                            lirVar1111111111119.b |= SemanticState.LiveRegion;
                            lirVar1111111111119.o = strD13;
                            long j1115 = lbgVar.w;
                            aihfVarCreateBuilder.copyOnWrite();
                            lir lirVar2111111111110 = (lir) aihfVarCreateBuilder.instance;
                            lirVar2111111111110.c |= 32768;
                            lirVar2111111111110.S = j1115;
                            if (r38.w()) {
                                String str31113 = ((lir) aihfVarCreateBuilder.instance).r;
                            }
                            lbdVarH = v().h(str5);
                            if (lbdVarH == null) {
                                lbdVarH = new lbd(ldrVar, str5);
                                lbdVarH.M(x(lghVarH));
                                lbdVarH.V(lbgVar.k);
                                lbdVarH.W(str10);
                                if (lghVarH.m()) {
                                    lbdVarH.ag(this.g.d(lbgVar, lghVarH));
                                }
                                lbdVarH.aa(0L);
                                lbdVarH.ab(0L);
                                lbdVarH.Z(0L);
                                lbdVarH.O(str7);
                                lbdVarH.P(j2);
                                lbdVarH.N(str6);
                                lbdVarH.X(j3);
                                lbdVarH.S(j4);
                                lbdVarH.ae(lbgVar.h);
                                lbdVarH.T(j6);
                                if (((Boolean) lcl.bg.b(null)).booleanValue()) {
                                    lbdVarH.ad(lbgVar.G);
                                    lbdVarH.L(lbgVar.H);
                                    lbdVarH.al(lbgVar.I);
                                }
                                i = 0;
                                v().an(lbdVarH, false);
                            } else {
                                i = 0;
                            }
                            if (lghVarH.o()) {
                                String strX12 = lbdVarH.x();
                                kro.l(strX12);
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111111111111 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111111111111.b |= 262144;
                                lirVar2111111111111.x = strX12;
                            }
                            if (!TextUtils.isEmpty(lbdVarH.A())) {
                                String strA12 = lbdVarH.A();
                                kro.l(strA12);
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111111111112 = (lir) aihfVarCreateBuilder.instance;
                                lirVar2111111111112.b |= 16777216;
                                lirVar2111111111112.E = strA12;
                            }
                            listB = v().B(str5);
                            i2 = i;
                            while (i2 < listB.size()) {
                                aihf aihfVarCreateBuilder13 = lix.a.createBuilder();
                                Object obj14 = ((aaqp) listB.get(i2)).d;
                                aihfVarCreateBuilder13.copyOnWrite();
                                lix lixVar1114 = (lix) aihfVarCreateBuilder13.instance;
                                obj14.getClass();
                                lixVar1114.b |= 2;
                                lixVar1114.d = (String) obj14;
                                long j1116 = ((aaqp) listB.get(i2)).a;
                                aihfVarCreateBuilder13.copyOnWrite();
                                lix lixVar1115 = (lix) aihfVarCreateBuilder13.instance;
                                lixVar1115.b |= 1;
                                lixVar1115.c = j1116;
                                q().Y(aihfVarCreateBuilder13, ((aaqp) listB.get(i2)).c);
                                aihfVarCreateBuilder.copyOnWrite();
                                lir lirVar2111111111113 = (lir) aihfVarCreateBuilder.instance;
                                lix lixVar1116 = (lix) aihfVarCreateBuilder13.build();
                                lixVar1116.getClass();
                                lirVar2111111111113.b();
                                lirVar2111111111113.f.add(lixVar1116);
                                str12 = str24;
                                if (str12.equals(((aaqp) listB.get(i2)).d)) {
                                    str13 = str9;
                                } else {
                                    str13 = str9;
                                }
                                i2++;
                                str24 = str12;
                                str9 = str13;
                            }
                            lgpVarV3 = v();
                            lirVar = (lir) aihfVarCreateBuilder.build();
                            lgpVarV3.o();
                            lgpVarV3.w();
                            kro.l(lirVar);
                            kro.i(lirVar.r);
                            byte[] byteArray113 = lirVar.toByteArray();
                            long jD12 = lgpVarV3.u().d(byteArray113);
                            ContentValues contentValues13 = new ContentValues();
                            String str31114 = str15;
                            contentValues13.put(str31114, lirVar.r);
                            contentValues13.put("metadata_fingerprint", Long.valueOf(jD12));
                            contentValues13.put("metadata", byteArray113);
                            lgpVarV3.e().insertWithOnConflict("raw_events_metadata", null, contentValues13, 4);
                            lgpVarV4 = v();
                            lcbVar2 = new lcb(lbzVar2.g);
                            while (true) {
                                if (lcbVar2.hasNext()) {
                                    ldo ldoVarO13 = o();
                                    String str31115 = lbzVar2.a;
                                    zM = ldoVarO13.m(str31115, lbzVar2.b);
                                    lgl lglVarAg13 = v().ag(a(), str31115, 1L, false, false, false, false, false, false);
                                    if (zM) {
                                    }
                                    i3 = i;
                                    break;
                                }
                                if ("_r".equals(lcbVar2.next())) {
                                }
                                i3 = 1;
                                break;
                            }
                            lgpVarV4.o();
                            lgpVarV4.w();
                            str11 = lbzVar2.a;
                            kro.i(str11);
                            byte[] byteArray114 = lgpVarV4.u().k(lbzVar2).toByteArray();
                            contentValues = new ContentValues();
                            contentValues.put(str31114, str11);
                            contentValues.put("name", lbzVar2.b);
                            contentValues.put("timestamp", Long.valueOf(lbzVar2.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jD12));
                            contentValues.put("data", byteArray114);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            contentValues.put("elapsed_time", Long.valueOf(lbzVar2.e));
                            if (lgpVarV4.e().insert("raw_events", null, contentValues) == -1) {
                                lgpVarV4.aT().c.b("Failed to insert raw event (got -1). appId", lcz.a(str11));
                            } else {
                                this.l = 0L;
                            }
                            v().Y();
                            v().S();
                            V();
                            aT().k.b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                            return;
                        }
                        if (jMax == 1) {
                            aT().c.c("Too many error events logged. appId, count", lcz.a(str3), Long.valueOf(lglVarAg.e));
                        }
                        v().Y();
                    }
                }
                v().S();
            } catch (Throwable th) {
                v().S();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0289 A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0291  */
    /* JADX WARN: Code duplicated, block: B:104:0x0292 A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a3 A[Catch: all -> 0x0dfb, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02de A[Catch: all -> 0x0dfb, PHI: r11 r25
      0x02de: PHI (r11v38 android.database.Cursor) = 
      (r11v2 android.database.Cursor)
      (r11v42 android.database.Cursor)
      (r11v43 android.database.Cursor)
      (r11v43 android.database.Cursor)
      (r11v57 android.database.Cursor)
     binds: [B:126:0x02dc, B:44:0x00c9, B:114:0x02be, B:50:0x0105, B:31:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r25v4 long) = (r25v2 long), (r25v5 long), (r25v6 long), (r25v6 long), (r25v7 long) binds: [B:126:0x02dc, B:44:0x00c9, B:114:0x02be, B:50:0x0105, B:31:0x008e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:193:0x055c  */
    /* JADX WARN: Code duplicated, block: B:197:0x057b A[Catch: all -> 0x0dfb, TRY_ENTER, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0587 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:200:0x05ad A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:202:0x05b9 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:203:0x05df  */
    /* JADX WARN: Code duplicated, block: B:208:0x0638  */
    /* JADX WARN: Code duplicated, block: B:210:0x063c A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:213:0x06b5 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:214:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:240:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:330:0x09d9 A[PHI: r9 r24
      0x09d9: PHI (r9v26 int) = (r9v25 int), (r9v25 int), (r9v28 int) binds: [B:332:0x09e3, B:334:0x09f2, B:329:0x09d6] A[DONT_GENERATE, DONT_INLINE]
      0x09d9: PHI (r24v5 int) = (r24v4 int), (r24v4 int), (r24v8 int) binds: [B:332:0x09e3, B:334:0x09f2, B:329:0x09d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:355:0x0a58 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:357:0x0a61 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:359:0x0a69 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:360:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:429:0x0d81 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:431:0x0d89 A[Catch: all -> 0x0dfb, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:432:0x0d99  */
    /* JADX WARN: Code duplicated, block: B:436:0x0de2 A[Catch: all -> 0x0dfb, TRY_LEAVE, TryCatch #7 {all -> 0x0dfb, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x0024, B:9:0x0030, B:13:0x003b, B:17:0x0047, B:127:0x02de, B:128:0x02e1, B:130:0x02e5, B:132:0x02eb, B:133:0x0311, B:136:0x0327, B:139:0x034d, B:141:0x035d, B:143:0x036d, B:144:0x0382, B:146:0x03b1, B:148:0x03bf, B:150:0x03cb, B:304:0x0942, B:152:0x03f0, B:154:0x03fc, B:156:0x041b, B:160:0x042a, B:162:0x044b, B:164:0x045d, B:167:0x0487, B:169:0x0493, B:171:0x04a1, B:173:0x04ad, B:175:0x04bb, B:176:0x04c6, B:177:0x04c9, B:179:0x04d7, B:180:0x04f5, B:182:0x0515, B:184:0x052a, B:186:0x0534, B:187:0x053b, B:189:0x0540, B:242:0x07a6, B:243:0x07a9, B:246:0x07b7, B:249:0x07c8, B:251:0x07dd, B:253:0x07e7, B:277:0x0865, B:279:0x086f, B:281:0x0873, B:283:0x0885, B:287:0x08b3, B:284:0x0895, B:286:0x08a2, B:288:0x08c4, B:290:0x08d0, B:291:0x08e2, B:293:0x08ee, B:295:0x08fc, B:297:0x0904, B:301:0x0927, B:298:0x090c, B:300:0x0916, B:302:0x092a, B:303:0x092d, B:257:0x07fc, B:260:0x0808, B:263:0x081b, B:265:0x0832, B:267:0x083c, B:271:0x084c, B:273:0x0856, B:275:0x085e, B:194:0x0561, B:197:0x057b, B:199:0x0587, B:204:0x05e3, B:200:0x05ad, B:202:0x05b9, B:207:0x05ef, B:210:0x063c, B:211:0x0682, B:213:0x06b5, B:215:0x06bb, B:218:0x06c9, B:220:0x06fc, B:221:0x0713, B:223:0x071f, B:225:0x072d, B:230:0x073f, B:226:0x0733, B:234:0x0748, B:238:0x0752, B:239:0x0789, B:310:0x095e, B:312:0x096a, B:345:0x0a2a, B:315:0x0976, B:317:0x098a, B:320:0x099b, B:322:0x09b4, B:324:0x09be, B:344:0x0a21, B:331:0x09dc, B:333:0x09e5, B:336:0x09f6, B:338:0x0a0d, B:340:0x0a17, B:349:0x0a39, B:351:0x0a45, B:353:0x0a4e, B:365:0x0a83, B:355:0x0a58, B:357:0x0a61, B:359:0x0a69, B:362:0x0a73, B:364:0x0a7d, B:366:0x0a86, B:367:0x0a98, B:370:0x0aa0, B:372:0x0ab0, B:373:0x0abd, B:375:0x0ac5, B:379:0x0ae6, B:381:0x0b6e, B:383:0x0b74, B:389:0x0b97, B:391:0x0bf7, B:392:0x0bfa, B:394:0x0c08, B:413:0x0d01, B:415:0x0d0d, B:417:0x0d20, B:418:0x0d23, B:424:0x0d4f, B:426:0x0d59, B:429:0x0d81, B:431:0x0d89, B:433:0x0d9b, B:435:0x0dc8, B:427:0x0d6c, B:421:0x0d34, B:423:0x0d3c, B:395:0x0c1d, B:397:0x0c29, B:399:0x0c33, B:401:0x0c5a, B:406:0x0c68, B:408:0x0c89, B:410:0x0cd5, B:412:0x0cf9, B:411:0x0ce6, B:407:0x0c78, B:400:0x0c47, B:384:0x0b80, B:386:0x0b86, B:388:0x0b8c, B:376:0x0aca, B:378:0x0ad0, B:436:0x0de2, B:106:0x02a3, B:443:0x0df7, B:444:0x0dfa, B:16:0x0045), top: B:454:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:470:0x05eb A[EDGE_INSN: B:470:0x05eb->B:205:0x05eb BREAK  A[LOOP:3: B:194:0x0561->B:204:0x05e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:? A[LOOP:8: B:73:0x0195->B:489:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4 A[Catch: SQLiteException -> 0x02c1, all -> 0x0df3, TryCatch #1 {all -> 0x0df3, blocks: (B:28:0x0086, B:32:0x0090, B:46:0x00d2, B:48:0x00f4, B:51:0x0107, B:52:0x010b, B:53:0x011d, B:55:0x0123, B:56:0x0132, B:61:0x014e, B:70:0x016f, B:125:0x02cd, B:66:0x015d, B:69:0x0165, B:113:0x02af, B:41:0x00c1, B:45:0x00cb), top: B:450:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107 A[Catch: SQLiteException -> 0x02c1, all -> 0x0df3, TRY_LEAVE, TryCatch #1 {all -> 0x0df3, blocks: (B:28:0x0086, B:32:0x0090, B:46:0x00d2, B:48:0x00f4, B:51:0x0107, B:52:0x010b, B:53:0x011d, B:55:0x0123, B:56:0x0132, B:61:0x014e, B:70:0x016f, B:125:0x02cd, B:66:0x015d, B:69:0x0165, B:113:0x02af, B:41:0x00c1, B:45:0x00cb), top: B:450:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123 A[Catch: SQLiteException -> 0x02c1, all -> 0x0df3, TryCatch #1 {all -> 0x0df3, blocks: (B:28:0x0086, B:32:0x0090, B:46:0x00d2, B:48:0x00f4, B:51:0x0107, B:52:0x010b, B:53:0x011d, B:55:0x0123, B:56:0x0132, B:61:0x014e, B:70:0x016f, B:125:0x02cd, B:66:0x015d, B:69:0x0165, B:113:0x02af, B:41:0x00c1, B:45:0x00cb), top: B:450:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e A[Catch: SQLiteException -> 0x02c1, all -> 0x0df3, TryCatch #1 {all -> 0x0df3, blocks: (B:28:0x0086, B:32:0x0090, B:46:0x00d2, B:48:0x00f4, B:51:0x0107, B:52:0x010b, B:53:0x011d, B:55:0x0123, B:56:0x0132, B:61:0x014e, B:70:0x016f, B:125:0x02cd, B:66:0x015d, B:69:0x0165, B:113:0x02af, B:41:0x00c1, B:45:0x00cb), top: B:450:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0155 A[PHI: r9
      0x0155: PHI (r9v94 long) = (r9v1 long), (r9v98 long) binds: [B:57:0x0146, B:60:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0195 A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, LOOP:8: B:73:0x0195->B:489:?, LOOP_START, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0205 A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x022e A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x023e A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x024c A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0260  */
    /* JADX WARN: Code duplicated, block: B:93:0x0262 A[Catch: all -> 0x02a7, SQLiteException -> 0x02ab, TryCatch #10 {SQLiteException -> 0x02ab, all -> 0x02a7, blocks: (B:71:0x018f, B:73:0x0195, B:74:0x01a3, B:76:0x01b0, B:78:0x01fa, B:79:0x0201, B:81:0x0205, B:82:0x020c, B:84:0x0214, B:86:0x022e, B:88:0x023e, B:90:0x024c, B:94:0x0264, B:100:0x0289, B:93:0x0262, B:99:0x027a, B:104:0x0292), top: B:457:0x018f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0278  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0df4: MOVE (r15 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:3573), block:B:441:0x0df4 */
    public final boolean ad(String str, long j) {
        Cursor cursor;
        Cursor cursor2;
        long j2;
        Cursor cursorRawQuery;
        List list;
        boolean z;
        String str2;
        boolean z2;
        aihf aihfVar;
        long j3;
        long j4;
        boolean z3;
        boolean zC;
        lip lipVarR;
        Long lValueOf;
        int i;
        int i2;
        String str3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str4;
        String str5;
        aihf aihfVar2;
        int i5;
        aihf aihfVar3;
        aihf aihfVar4;
        aihf aihfVar5;
        aihf aihfVar6;
        int i6;
        int i7;
        String string;
        long jD;
        String str6;
        String[] strArr;
        Cursor cursorQuery;
        long j5;
        lin linVar;
        long serializedSize;
        lir lirVar;
        String str7;
        String string2 = str;
        v().F();
        try {
            lhk lhkVar = new lhk(this);
            boolean z9 = !TextUtils.isEmpty(string2) && i().F(string2, lcl.M) && i().F(string2, lcl.N) && this.h.a(string2);
            lgp lgpVarV = v();
            long j6 = z9 ? -1L : this.s;
            try {
                lgpVarV.o();
                lgpVarV.w();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseE = lgpVarV.e();
                        try {
                            try {
                                if (TextUtils.isEmpty(string2)) {
                                    j2 = 1000;
                                    cursorRawQuery = sQLiteDatabaseE.rawQuery(a.bT(j6 != -1 ? "rowid <= ? and " : "", "select app_id, metadata_fingerprint from raw_events where ", "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"), j6 != -1 ? new String[]{String.valueOf(j6), String.valueOf(j)} : new String[]{String.valueOf(j)});
                                    if (cursorRawQuery.moveToFirst()) {
                                        string2 = cursorRawQuery.getString(0);
                                        string = cursorRawQuery.getString(1);
                                        cursorRawQuery.close();
                                        cursorRawQuery = sQLiteDatabaseE.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                                        if (cursorRawQuery.moveToFirst()) {
                                            try {
                                                lir lirVar2 = (lir) ((aihf) lfx.l(lir.a.createBuilder(), cursorRawQuery.getBlob(0))).build();
                                                if (cursorRawQuery.moveToNext()) {
                                                    lgpVarV.aT().f.b("Get multiple raw event metadata records, expected one. appId", lcz.a(string2));
                                                }
                                                cursorRawQuery.close();
                                                kro.l(lirVar2);
                                                lhkVar.a = lirVar2;
                                                jD = lgpVarV.d("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{string2, string}, -1L);
                                                if (j6 != -1) {
                                                    if (j6 == -1 && jD != -1) {
                                                        jD = Math.min(j6, jD);
                                                    } else if (j6 != -1) {
                                                        jD = j6;
                                                    }
                                                    str6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                    strArr = new String[]{string2, string, String.valueOf(jD)};
                                                } else if (jD != -1) {
                                                    j6 = -1;
                                                    if (j6 == -1) {
                                                        if (j6 != -1) {
                                                            jD = j6;
                                                        }
                                                    } else if (j6 != -1) {
                                                        jD = j6;
                                                    }
                                                    str6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                    strArr = new String[]{string2, string, String.valueOf(jD)};
                                                } else {
                                                    str6 = "app_id = ? and metadata_fingerprint = ?";
                                                    strArr = new String[]{string2, string};
                                                }
                                                cursorQuery = sQLiteDatabaseE.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str6, strArr, null, null, "rowid", null);
                                                try {
                                                    if (cursorQuery.moveToFirst()) {
                                                        while (true) {
                                                            j5 = cursorQuery.getLong(0);
                                                            byte[] blob = cursorQuery.getBlob(3);
                                                            long j7 = cursorQuery.getLong(4);
                                                            try {
                                                                aihf aihfVar7 = (aihf) lfx.l(lin.a.createBuilder(), blob);
                                                                String string3 = cursorQuery.getString(1);
                                                                aihfVar7.copyOnWrite();
                                                                lin linVar2 = (lin) aihfVar7.instance;
                                                                string3.getClass();
                                                                linVar2.b |= 1;
                                                                linVar2.d = string3;
                                                                long j8 = cursorQuery.getLong(2);
                                                                aihfVar7.copyOnWrite();
                                                                lin linVar3 = (lin) aihfVar7.instance;
                                                                linVar3.b |= 2;
                                                                linVar3.e = j8;
                                                                aihfVar7.copyOnWrite();
                                                                lin linVar4 = (lin) aihfVar7.instance;
                                                                linVar4.b |= 64;
                                                                linVar4.j = j7;
                                                                linVar = (lin) aihfVar7.build();
                                                                kro.l(linVar);
                                                                if (lhkVar.c == null) {
                                                                    lhkVar.c = new ArrayList();
                                                                }
                                                                if (lhkVar.b == null) {
                                                                    lhkVar.b = new ArrayList();
                                                                }
                                                                if (lhkVar.c.isEmpty() || ((((lin) lhkVar.c.get(0)).e / j2) / 60) / 60 == ((linVar.e / j2) / 60) / 60) {
                                                                    serializedSize = lhkVar.d + ((long) linVar.getSerializedSize());
                                                                    if (lhkVar.c.isEmpty()) {
                                                                        lhkVar.d = serializedSize;
                                                                        lhkVar.c.add(linVar);
                                                                        lhkVar.b.add(Long.valueOf(j5));
                                                                        lirVar = lhkVar.a;
                                                                        if (lirVar == null) {
                                                                            str7 = null;
                                                                        } else {
                                                                            str7 = lirVar.r;
                                                                        }
                                                                        if (lhkVar.c.size() >= lhkVar.e.i().g(str7)) {
                                                                            if (!cursorQuery.moveToNext()) {
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        lhkVar.e.i();
                                                                        if (serializedSize < lbt.v()) {
                                                                            lhkVar.d = serializedSize;
                                                                            lhkVar.c.add(linVar);
                                                                            lhkVar.b.add(Long.valueOf(j5));
                                                                            lirVar = lhkVar.a;
                                                                            if (lirVar == null) {
                                                                                str7 = null;
                                                                            } else {
                                                                                str7 = lirVar.r;
                                                                            }
                                                                            if (lhkVar.c.size() >= lhkVar.e.i().g(str7)) {
                                                                                if (!cursorQuery.moveToNext()) {
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                            } catch (IOException e) {
                                                                lgpVarV.aT().c.c("Data loss. Failed to merge raw event. appId", lcz.a(string2), e);
                                                            }
                                                        }
                                                    } else {
                                                        lgpVarV.aT().f.b("Raw event data disappeared while in transaction. appId", lcz.a(string2));
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                    }
                                                } catch (SQLiteException e2) {
                                                    e = e2;
                                                    cursorRawQuery = cursorQuery;
                                                    lgpVarV.aT().c.c("Data loss. Error selecting raw event. appId", lcz.a(string2), e);
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor2 = cursorQuery;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e3) {
                                                lgpVarV.aT().c.c("Data loss. Failed to merge raw event metadata. appId", lcz.a(string2), e3);
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                            }
                                        } else {
                                            lgpVarV.aT().c.b("Raw event metadata record is missing. appId", lcz.a(string2));
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                        }
                                    } else if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                } else {
                                    j2 = 1000;
                                    cursorRawQuery = sQLiteDatabaseE.rawQuery(a.bT(j6 != -1 ? " and rowid <= ?" : "", "select metadata_fingerprint from raw_events where app_id = ?", " order by rowid limit 1;"), j6 != -1 ? new String[]{string2, String.valueOf(j6)} : new String[]{string2});
                                    if (cursorRawQuery.moveToFirst()) {
                                        string = cursorRawQuery.getString(0);
                                        cursorRawQuery.close();
                                        cursorRawQuery = sQLiteDatabaseE.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                                        if (cursorRawQuery.moveToFirst()) {
                                            lgpVarV.aT().c.b("Raw event metadata record is missing. appId", lcz.a(string2));
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                        } else {
                                            lir lirVar3 = (lir) ((aihf) lfx.l(lir.a.createBuilder(), cursorRawQuery.getBlob(0))).build();
                                            if (cursorRawQuery.moveToNext()) {
                                                lgpVarV.aT().f.b("Get multiple raw event metadata records, expected one. appId", lcz.a(string2));
                                            }
                                            cursorRawQuery.close();
                                            kro.l(lirVar3);
                                            lhkVar.a = lirVar3;
                                            jD = lgpVarV.d("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{string2, string}, -1L);
                                            if (j6 != -1) {
                                                if (j6 == -1) {
                                                    if (j6 != -1) {
                                                        jD = j6;
                                                    }
                                                } else if (j6 != -1) {
                                                    jD = j6;
                                                }
                                                str6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                strArr = new String[]{string2, string, String.valueOf(jD)};
                                            } else if (jD != -1) {
                                                j6 = -1;
                                                if (j6 == -1) {
                                                    if (j6 != -1) {
                                                        jD = j6;
                                                    }
                                                } else if (j6 != -1) {
                                                    jD = j6;
                                                }
                                                str6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                strArr = new String[]{string2, string, String.valueOf(jD)};
                                            } else {
                                                str6 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr = new String[]{string2, string};
                                            }
                                            cursorQuery = sQLiteDatabaseE.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str6, strArr, null, null, "rowid", null);
                                            if (cursorQuery.moveToFirst()) {
                                                while (true) {
                                                    j5 = cursorQuery.getLong(0);
                                                    byte[] blob2 = cursorQuery.getBlob(3);
                                                    long j9 = cursorQuery.getLong(4);
                                                    aihf aihfVar8 = (aihf) lfx.l(lin.a.createBuilder(), blob2);
                                                    String string4 = cursorQuery.getString(1);
                                                    aihfVar8.copyOnWrite();
                                                    lin linVar5 = (lin) aihfVar8.instance;
                                                    string4.getClass();
                                                    linVar5.b |= 1;
                                                    linVar5.d = string4;
                                                    long j10 = cursorQuery.getLong(2);
                                                    aihfVar8.copyOnWrite();
                                                    lin linVar6 = (lin) aihfVar8.instance;
                                                    linVar6.b |= 2;
                                                    linVar6.e = j10;
                                                    aihfVar8.copyOnWrite();
                                                    lin linVar7 = (lin) aihfVar8.instance;
                                                    linVar7.b |= 64;
                                                    linVar7.j = j9;
                                                    linVar = (lin) aihfVar8.build();
                                                    kro.l(linVar);
                                                    if (lhkVar.c == null) {
                                                        lhkVar.c = new ArrayList();
                                                    }
                                                    if (lhkVar.b == null) {
                                                        lhkVar.b = new ArrayList();
                                                    }
                                                    if (lhkVar.c.isEmpty()) {
                                                        serializedSize = lhkVar.d + ((long) linVar.getSerializedSize());
                                                        if (lhkVar.c.isEmpty()) {
                                                            lhkVar.e.i();
                                                            if (serializedSize < lbt.v()) {
                                                                lhkVar.d = serializedSize;
                                                                lhkVar.c.add(linVar);
                                                                lhkVar.b.add(Long.valueOf(j5));
                                                                lirVar = lhkVar.a;
                                                                if (lirVar == null) {
                                                                    str7 = null;
                                                                } else {
                                                                    str7 = lirVar.r;
                                                                }
                                                                if (lhkVar.c.size() >= lhkVar.e.i().g(str7)) {
                                                                    if (!cursorQuery.moveToNext()) {
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            lhkVar.d = serializedSize;
                                                            lhkVar.c.add(linVar);
                                                            lhkVar.b.add(Long.valueOf(j5));
                                                            lirVar = lhkVar.a;
                                                            if (lirVar == null) {
                                                                str7 = null;
                                                            } else {
                                                                str7 = lirVar.r;
                                                            }
                                                            if (lhkVar.c.size() >= lhkVar.e.i().g(str7)) {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        serializedSize = lhkVar.d + ((long) linVar.getSerializedSize());
                                                        if (lhkVar.c.isEmpty()) {
                                                            lhkVar.e.i();
                                                            if (serializedSize < lbt.v()) {
                                                                lhkVar.d = serializedSize;
                                                                lhkVar.c.add(linVar);
                                                                lhkVar.b.add(Long.valueOf(j5));
                                                                lirVar = lhkVar.a;
                                                                if (lirVar == null) {
                                                                    str7 = null;
                                                                } else {
                                                                    str7 = lirVar.r;
                                                                }
                                                                if (lhkVar.c.size() >= lhkVar.e.i().g(str7)) {
                                                                    if (!cursorQuery.moveToNext()) {
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            lhkVar.d = serializedSize;
                                                            lhkVar.c.add(linVar);
                                                            lhkVar.b.add(Long.valueOf(j5));
                                                            lirVar = lhkVar.a;
                                                            if (lirVar == null) {
                                                                str7 = null;
                                                            } else {
                                                                str7 = lirVar.r;
                                                            }
                                                            if (lhkVar.c.size() >= lhkVar.e.i().g(str7)) {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                }
                                            } else {
                                                lgpVarV.aT().f.b("Raw event data disappeared while in transaction. appId", lcz.a(string2));
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                            }
                                        }
                                    } else if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                cursorRawQuery = null;
                                lgpVarV.aT().c.c("Data loss. Error selecting raw event. appId", lcz.a(string2), e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                list = lhkVar.c;
                                if (list != null) {
                                    v().Y();
                                    z = false;
                                } else {
                                    v().Y();
                                    z = false;
                                }
                                v().S();
                                return z;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        j2 = 1000;
                    }
                    list = lhkVar.c;
                    if (list != null || list.isEmpty()) {
                        v().Y();
                        z = false;
                    } else {
                        aihf builder = lhkVar.a.toBuilder();
                        builder.copyOnWrite();
                        ((lir) builder.instance).e = lir.emptyProtobufList();
                        boolean zF = i().F(null, lcl.bo);
                        boolean z10 = false;
                        int i8 = 0;
                        int i9 = 0;
                        boolean z11 = false;
                        aihf aihfVar9 = null;
                        aihf aihfVar10 = null;
                        int i10 = -1;
                        int i11 = -1;
                        while (true) {
                            String str8 = "_et";
                            str2 = "_vs";
                            z2 = zF;
                            aihfVar = aihfVar10;
                            boolean z12 = z10;
                            if (i8 >= lhkVar.c.size()) {
                                break;
                            }
                            aihf builder2 = ((lin) lhkVar.c.get(i8)).toBuilder();
                            boolean z13 = z11;
                            if (o().n(lhkVar.a.r, ((lin) builder2.instance).d)) {
                                if (i().F(lhkVar.a.r, lcl.aR) && i().F(lhkVar.a.r, lcl.aU)) {
                                    v().T(lhkVar.a.r, "event_dropped_count", "blocklisted", 1L, 0L);
                                }
                                aT().f.c("Dropping blocked raw event. appId", lcz.a(lhkVar.a.r), k().c(((lin) builder2.instance).d));
                                if (!o().j(lhkVar.a.r) && !o().p(lhkVar.a.r) && !"_err".equals(((lin) builder2.instance).d)) {
                                    r().R(this.L, lhkVar.a.r, 11, "_ev", ((lin) builder2.instance).d, 0);
                                }
                                i6 = i8;
                                i7 = i9;
                                z11 = z13;
                            } else {
                                if (aH(((lin) builder2.instance).d)) {
                                    aihf aihfVarCreateBuilder = lip.a.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lip lipVar = (lip) aihfVarCreateBuilder.instance;
                                    lipVar.b |= 1;
                                    lipVar.c = "_ct";
                                    String str9 = (z12 || !aD(lhkVar.a.r)) ? "returning" : "new";
                                    aihfVarCreateBuilder.copyOnWrite();
                                    lip lipVar2 = (lip) aihfVarCreateBuilder.instance;
                                    lipVar2.b |= 2;
                                    lipVar2.d = str9;
                                    builder2.D((lip) aihfVarCreateBuilder.build());
                                    z12 = true;
                                }
                                if (((lin) builder2.instance).d.equals(lec.a("_ai"))) {
                                    builder2.copyOnWrite();
                                    lin linVar8 = (lin) builder2.instance;
                                    linVar8.b |= 1;
                                    linVar8.d = "_ai";
                                    aT().k.a("Renaming ad_impression to _ai");
                                    if (aT().i(5)) {
                                        for (int i12 = 0; i12 < ((lin) builder2.instance).c.size(); i12++) {
                                            if ("ad_platform".equals(builder2.C(i12).c) && !builder2.C(i12).d.isEmpty() && "admob".equalsIgnoreCase(builder2.C(i12).d)) {
                                                aT().h.a("AdMob ad impression logged from app. Potentially duplicative.");
                                            }
                                        }
                                    }
                                }
                                if (((lin) builder2.instance).d.equals("in_app_purchase")) {
                                    builder2.copyOnWrite();
                                    lin linVar9 = (lin) builder2.instance;
                                    linVar9.b |= 1;
                                    linVar9.d = "_iap";
                                    aT().k.a("Renaming in_app_purchase to _iap");
                                }
                                boolean zM = o().m(lhkVar.a.r, ((lin) builder2.instance).d);
                                if ("_iap".equals(((lin) builder2.instance).d)) {
                                    zM = aq(builder2);
                                    q();
                                    lip lipVarR2 = lfx.R((lin) builder2.build(), "_o");
                                    if (lipVarR2 != null && !"auto".equals(lipVarR2.d)) {
                                        aj(builder2, lhkVar.a.r);
                                    }
                                    aR(builder2);
                                }
                                if (zM) {
                                    z4 = zM;
                                    i4 = 0;
                                    z5 = false;
                                    z6 = false;
                                    while (true) {
                                        z7 = z5;
                                        z8 = z6;
                                        str4 = str8;
                                        str5 = str2;
                                        if (i4 < ((lin) builder2.instance).c.size()) {
                                            break;
                                            break;
                                        }
                                        if ("_c".equals(builder2.C(i4).c)) {
                                            aihf builder3 = builder2.C(i4).toBuilder();
                                            builder3.copyOnWrite();
                                            lip lipVar3 = (lip) builder3.instance;
                                            lipVar3.b |= 4;
                                            lipVar3.e = 1L;
                                            builder2.F(i4, (lip) builder3.build());
                                            z5 = z7;
                                            z6 = true;
                                        } else if ("_r".equals(builder2.C(i4).c)) {
                                            aihf builder4 = builder2.C(i4).toBuilder();
                                            builder4.copyOnWrite();
                                            lip lipVar4 = (lip) builder4.instance;
                                            lipVar4.b |= 4;
                                            lipVar4.e = 1L;
                                            builder2.F(i4, (lip) builder4.build());
                                            z6 = z8;
                                            z5 = true;
                                        } else {
                                            z5 = z7;
                                            z6 = z8;
                                        }
                                        i4++;
                                        str8 = str4;
                                        str2 = str5;
                                    }
                                    if (z8) {
                                    }
                                    if (!z7) {
                                        aT().k.b("Marking event as real-time", k().c(((lin) builder2.instance).d));
                                        aihf aihfVarCreateBuilder2 = lip.a.createBuilder();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        lip lipVar5 = (lip) aihfVarCreateBuilder2.instance;
                                        lipVar5.b |= 1;
                                        lipVar5.c = "_r";
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        lip lipVar6 = (lip) aihfVarCreateBuilder2.instance;
                                        lipVar6.b |= 4;
                                        lipVar6.e = 1L;
                                        builder2.bg(aihfVarCreateBuilder2);
                                    }
                                    if (v().ag(a(), lhkVar.a.r, 1L, false, false, false, false, true, false).f > i().h(lhkVar.a.r)) {
                                        au(builder2, "_r");
                                    } else {
                                        z13 = true;
                                    }
                                    if (!lga.an(((lin) builder2.instance).d)) {
                                    }
                                } else {
                                    q();
                                    if (lfx.V(((lin) builder2.instance).d)) {
                                        z4 = zM;
                                        i4 = 0;
                                        z5 = false;
                                        z6 = false;
                                        while (true) {
                                            z7 = z5;
                                            z8 = z6;
                                            str4 = str8;
                                            str5 = str2;
                                            if (i4 < ((lin) builder2.instance).c.size()) {
                                                break;
                                            }
                                            if ("_c".equals(builder2.C(i4).c)) {
                                                aihf builder5 = builder2.C(i4).toBuilder();
                                                builder5.copyOnWrite();
                                                lip lipVar7 = (lip) builder5.instance;
                                                lipVar7.b |= 4;
                                                lipVar7.e = 1L;
                                                builder2.F(i4, (lip) builder5.build());
                                                z5 = z7;
                                                z6 = true;
                                            } else if ("_r".equals(builder2.C(i4).c)) {
                                                aihf builder6 = builder2.C(i4).toBuilder();
                                                builder6.copyOnWrite();
                                                lip lipVar8 = (lip) builder6.instance;
                                                lipVar8.b |= 4;
                                                lipVar8.e = 1L;
                                                builder2.F(i4, (lip) builder6.build());
                                                z6 = z8;
                                                z5 = true;
                                            } else {
                                                z5 = z7;
                                                z6 = z8;
                                            }
                                            i4++;
                                            str8 = str4;
                                            str2 = str5;
                                        }
                                        if (z8 && z4) {
                                            aT().k.b("Marking event as conversion", k().c(((lin) builder2.instance).d));
                                            aihf aihfVarCreateBuilder3 = lip.a.createBuilder();
                                            aihfVarCreateBuilder3.copyOnWrite();
                                            lip lipVar9 = (lip) aihfVarCreateBuilder3.instance;
                                            lipVar9.b |= 1;
                                            lipVar9.c = "_c";
                                            aihfVarCreateBuilder3.copyOnWrite();
                                            lip lipVar10 = (lip) aihfVarCreateBuilder3.instance;
                                            lipVar10.b |= 4;
                                            lipVar10.e = 1L;
                                            builder2.bg(aihfVarCreateBuilder3);
                                        }
                                        if (!z7) {
                                            aT().k.b("Marking event as real-time", k().c(((lin) builder2.instance).d));
                                            aihf aihfVarCreateBuilder4 = lip.a.createBuilder();
                                            aihfVarCreateBuilder4.copyOnWrite();
                                            lip lipVar11 = (lip) aihfVarCreateBuilder4.instance;
                                            lipVar11.b |= 1;
                                            lipVar11.c = "_r";
                                            aihfVarCreateBuilder4.copyOnWrite();
                                            lip lipVar12 = (lip) aihfVarCreateBuilder4.instance;
                                            lipVar12.b |= 4;
                                            lipVar12.e = 1L;
                                            builder2.bg(aihfVarCreateBuilder4);
                                        }
                                        if (v().ag(a(), lhkVar.a.r, 1L, false, false, false, false, true, false).f > i().h(lhkVar.a.r)) {
                                            au(builder2, "_r");
                                        } else {
                                            z13 = true;
                                        }
                                        if (!lga.an(((lin) builder2.instance).d) && z4 && v().ag(a(), lhkVar.a.r, 1L, false, false, true, false, false, false).d > i().a(lhkVar.a.r)) {
                                            aT().f.b("Too many conversions. Not logging as conversion. appId", lcz.a(lhkVar.a.r));
                                            aihf builder7 = null;
                                            boolean z14 = false;
                                            int i13 = -1;
                                            for (int i14 = 0; i14 < ((lin) builder2.instance).c.size(); i14++) {
                                                lip lipVarC = builder2.C(i14);
                                                aihf aihfVar11 = builder7;
                                                String str10 = lipVarC.c;
                                                if ("_c".equals(str10)) {
                                                    builder7 = lipVarC.toBuilder();
                                                    i13 = i14;
                                                } else if ("_err".equals(str10)) {
                                                    builder7 = aihfVar11;
                                                    z14 = true;
                                                } else {
                                                    builder7 = aihfVar11;
                                                }
                                            }
                                            aihf aihfVar12 = builder7;
                                            if (!z14) {
                                                aihfVar2 = aihfVar12;
                                            } else if (aihfVar12 != null) {
                                                builder2.E(i13);
                                            } else {
                                                aihfVar2 = null;
                                            }
                                            if (aihfVar2 != null) {
                                                aihf aihfVarMo53clone = aihfVar2.mo53clone();
                                                aihfVarMo53clone.copyOnWrite();
                                                lip lipVar13 = (lip) aihfVarMo53clone.instance;
                                                lip lipVar14 = lip.a;
                                                lipVar13.b |= 1;
                                                lipVar13.c = "_err";
                                                aihfVarMo53clone.copyOnWrite();
                                                lip lipVar15 = (lip) aihfVarMo53clone.instance;
                                                lipVar15.b |= 4;
                                                lipVar15.e = 10L;
                                                builder2.F(i13, (lip) aihfVarMo53clone.build());
                                            } else {
                                                aT().c.b("Did not find conversion parameter. appId", lcz.a(lhkVar.a.r));
                                            }
                                        }
                                    } else {
                                        str4 = "_et";
                                        str5 = "_vs";
                                        i11 = i11;
                                        z4 = false;
                                    }
                                }
                                z11 = z13;
                                if (z4) {
                                    aq(builder2);
                                }
                                String str11 = ((lin) builder2.instance).d;
                                if ("_e".equals(str11)) {
                                    if (!z2) {
                                        q();
                                        if (lfx.R((lin) builder2.build(), "_fr") == null) {
                                            if (aihfVar9 != null && Math.abs(((lin) aihfVar9.instance).e - ((lin) builder2.instance).e) <= j2) {
                                                aihf aihfVarMo53clone2 = aihfVar9.mo53clone();
                                                if (aP(builder2, aihfVarMo53clone2)) {
                                                    i5 = i10;
                                                    builder.bl(i5, aihfVarMo53clone2);
                                                    i10 = i5;
                                                    i11 = i11;
                                                    aihfVar6 = null;
                                                    aihfVar5 = null;
                                                }
                                            }
                                            aihfVar6 = aihfVar9;
                                            i10 = i10;
                                            aihfVar5 = builder2;
                                            i11 = i9;
                                        }
                                    }
                                    i5 = i10;
                                    aihfVar3 = aihfVar;
                                    aihfVar6 = aihfVar9;
                                    i10 = i5;
                                    aihfVar5 = aihfVar3;
                                    i11 = i11;
                                } else {
                                    i5 = i10;
                                    if (str5.equals(str11)) {
                                        if (!z2) {
                                            q();
                                            if (lfx.R((lin) builder2.build(), str4) == null) {
                                                if (aihfVar != null) {
                                                    aihfVar4 = aihfVar;
                                                    if (Math.abs(((lin) aihfVar4.instance).e - ((lin) builder2.instance).e) <= j2) {
                                                        aihf aihfVarMo53clone3 = aihfVar4.mo53clone();
                                                        if (aP(aihfVarMo53clone3, builder2)) {
                                                            builder.bl(i11, aihfVarMo53clone3);
                                                            i10 = i5;
                                                            i11 = i11;
                                                            aihfVar6 = null;
                                                            aihfVar5 = null;
                                                        }
                                                    }
                                                } else {
                                                    aihfVar4 = aihfVar;
                                                }
                                                aihfVar5 = aihfVar4;
                                                i11 = i11;
                                                aihfVar6 = builder2;
                                                i10 = i9;
                                            }
                                        }
                                        aihfVar3 = aihfVar;
                                        aihfVar6 = aihfVar9;
                                        i10 = i5;
                                        aihfVar5 = aihfVar3;
                                        i11 = i11;
                                    } else {
                                        aihfVar3 = aihfVar;
                                        if ("_f".equals(str11) || "_v".equals(str11)) {
                                            at(builder2);
                                        }
                                        aihfVar6 = aihfVar9;
                                        i10 = i5;
                                        aihfVar5 = aihfVar3;
                                        i11 = i11;
                                    }
                                }
                                int i15 = ((lin) builder2.instance).b;
                                if ((i15 & 64) != 0 && (i15 & 32) == 0) {
                                    long jE = q().e(((lin) builder2.instance).j);
                                    if (jE != 0) {
                                        builder2.copyOnWrite();
                                        lin linVar10 = (lin) builder2.instance;
                                        linVar10.b |= 32;
                                        linVar10.i = jE;
                                    } else if (i().F(null, lcl.aR)) {
                                        q().D(((lin) builder2.instance).j, lhkVar.a.r);
                                    }
                                    builder2.copyOnWrite();
                                    lin linVar11 = (lin) builder2.instance;
                                    linVar11.b |= 64;
                                    linVar11.j = 0L;
                                }
                                if (((lin) builder2.instance).c.size() != 0) {
                                    q();
                                    Bundle bundleQ = lfx.Q(DesugarCollections.unmodifiableList(((lin) builder2.instance).c));
                                    for (int i16 = 0; i16 < ((lin) builder2.instance).c.size(); i16++) {
                                        lip lipVarC2 = builder2.C(i16);
                                        if (lipVarC2.c.equals("items") && !lipVarC2.h.isEmpty()) {
                                            aO(lipVarC2, builder2, lhkVar.a.r, bundleQ);
                                        } else if (!lipVarC2.c.equals("items")) {
                                            ap(((lin) builder2.instance).d, lipVarC2.toBuilder(), bundleQ, lhkVar.a.r);
                                        }
                                    }
                                    aM(bundleQ, builder2);
                                }
                                i6 = i8;
                                lhkVar.c.set(i6, (lin) builder2.build());
                                builder.bk(builder2);
                                i7 = i9 + 1;
                                aihfVar = aihfVar5;
                                aihfVar9 = aihfVar6;
                            }
                            z10 = z12;
                            i8 = i6 + 1;
                            zF = z2;
                            i9 = i7;
                            aihfVar10 = aihfVar;
                        }
                        int i17 = i9;
                        int i18 = i10;
                        int i19 = i11;
                        boolean z15 = z11;
                        aihf aihfVar13 = aihfVar;
                        if (z2) {
                            int i20 = i18;
                            int i21 = i19;
                            int i22 = 0;
                            while (true) {
                                i = i17;
                                if (i22 >= i) {
                                    break;
                                }
                                String str12 = builder.H(i22).d;
                                if ("_e".equals(str12) || str2.equals(str12)) {
                                    aihf builder8 = builder.H(i22).toBuilder();
                                    String str13 = ((lin) builder8.instance).d;
                                    if ("_e".equals(str13)) {
                                        q();
                                        if (lfx.R((lin) builder8.build(), "_fr") == null) {
                                            if (aihfVar9 != null) {
                                                int i23 = i20;
                                                i17 = i;
                                                if (Math.abs(((lin) aihfVar9.instance).e - ((lin) builder8.instance).e) <= j2) {
                                                    aihf aihfVarMo53clone4 = aihfVar9.mo53clone();
                                                    if (aP(builder8, aihfVarMo53clone4)) {
                                                        i2 = i23;
                                                        builder.bl(i2, aihfVarMo53clone4);
                                                        str3 = str2;
                                                        i20 = i2;
                                                        aihfVar9 = null;
                                                        aihfVar13 = null;
                                                    }
                                                }
                                                i3 = i23;
                                            } else {
                                                i17 = i;
                                                i3 = i20;
                                            }
                                            str3 = str2;
                                            i21 = i22;
                                            i20 = i3;
                                            aihfVar13 = builder8;
                                        } else {
                                            i17 = i;
                                            i2 = i20;
                                            str3 = str2;
                                            i20 = i2;
                                        }
                                    } else {
                                        i17 = i;
                                        i2 = i20;
                                        if (str2.equals(str13)) {
                                            q();
                                            if (lfx.R((lin) builder8.build(), "_et") == null) {
                                                if (aihfVar13 != null) {
                                                    str3 = str2;
                                                    if (Math.abs(((lin) aihfVar13.instance).e - ((lin) builder8.instance).e) <= j2) {
                                                        aihf aihfVarMo53clone5 = aihfVar13.mo53clone();
                                                        if (aP(aihfVarMo53clone5, builder8)) {
                                                            builder.bl(i21, aihfVarMo53clone5);
                                                            i20 = i2;
                                                            aihfVar9 = null;
                                                            aihfVar13 = null;
                                                        }
                                                    }
                                                } else {
                                                    str3 = str2;
                                                }
                                                i20 = i22;
                                                aihfVar9 = builder8;
                                            } else {
                                                str3 = str2;
                                                i20 = i2;
                                            }
                                        } else {
                                            str3 = str2;
                                            i20 = i2;
                                        }
                                    }
                                    builder.N(i22, (lin) builder8.build());
                                } else {
                                    str3 = str2;
                                    i17 = i;
                                }
                                i22++;
                                str2 = str3;
                            }
                            i17 = i;
                        }
                        int i24 = i17;
                        int i25 = 0;
                        long jLongValue = 0;
                        while (i25 < i24) {
                            lin linVarH = builder.H(i25);
                            if ("_e".equals(linVarH.d)) {
                                q();
                                if (lfx.R(linVarH, "_fr") != null) {
                                    builder.L(i25);
                                    i24--;
                                    i25--;
                                } else {
                                    q();
                                    lipVarR = lfx.R(linVarH, "_et");
                                    if (lipVarR != null) {
                                        if ((lipVarR.b & 4) != 0) {
                                            lValueOf = Long.valueOf(lipVarR.e);
                                        } else {
                                            lValueOf = null;
                                        }
                                        if (lValueOf != null && lValueOf.longValue() > 0) {
                                            jLongValue += lValueOf.longValue();
                                        }
                                    }
                                }
                            } else {
                                q();
                                lipVarR = lfx.R(linVarH, "_et");
                                if (lipVarR != null) {
                                    if ((lipVarR.b & 4) != 0) {
                                        lValueOf = Long.valueOf(lipVarR.e);
                                    } else {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        jLongValue += lValueOf.longValue();
                                    }
                                }
                            }
                            i25++;
                        }
                        aL(builder, jLongValue, false);
                        Iterator it = DesugarCollections.unmodifiableList(((lir) builder.instance).e).iterator();
                        while (it.hasNext()) {
                            if ("_s".equals(((lin) it.next()).d)) {
                                v().W(((lir) builder.instance).r, "_se");
                                break;
                            }
                        }
                        if (lfx.W(builder, "_sid") >= 0) {
                            aL(builder, jLongValue, true);
                        } else {
                            int iW = lfx.W(builder, "_se");
                            if (iW >= 0) {
                                builder.M(iW);
                                aT().c.b("Session engagement user property is in the bundle without session ID. appId", lcz.a(lhkVar.a.r));
                            }
                        }
                        aK(lhkVar.a.r, builder);
                        an(lhkVar.a.r, builder);
                        ao(lhkVar.a.r, builder);
                        aQ(builder);
                        builder.copyOnWrite();
                        lir lirVar4 = (lir) builder.instance;
                        lirVar4.b &= -268435457;
                        lir lirVar5 = lir.a;
                        lirVar4.G = lirVar5.G;
                        lgh lghVar = lgh.a;
                        lgh lghVarH = u(lhkVar.a.r).h(lgh.g(lhkVar.a.O, 100));
                        lgh lghVarL = v().l(lhkVar.a.r);
                        lgp lgpVarV2 = v();
                        String str14 = lhkVar.a.r;
                        kro.l(str14);
                        kro.l(lghVarH);
                        lgpVarV2.o();
                        lgpVarV2.w();
                        lgpVarV2.ab(str14, lgpVarV2.m(str14));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str14);
                        contentValues.put("storage_consent_at_bundling", lghVarH.l());
                        lgpVarV2.ao(contentValues);
                        if (!lghVarH.o() && lghVarL.o()) {
                            v().N(lhkVar.a.r);
                        } else if (lghVarH.o() && !lghVarL.o()) {
                            v().X(lhkVar.a.r);
                        }
                        ar(builder, lghVarH);
                        builder.copyOnWrite();
                        ((lir) builder.instance).D = lir.emptyProtobufList();
                        lbo lboVarH = h();
                        lir lirVar6 = (lir) builder.instance;
                        builder.I(lboVarH.a(lirVar6.r, DesugarCollections.unmodifiableList(lirVar6.e), DesugarCollections.unmodifiableList(((lir) builder.instance).f), Long.valueOf(((lir) builder.instance).h), Long.valueOf(((lir) builder.instance).i), !lghVarH.o()));
                        if (i().r(lhkVar.a.r)) {
                            aN(builder, lhkVar);
                        }
                        String str15 = lhkVar.a.r;
                        lbd lbdVarH = v().h(str15);
                        if (lbdVarH == null) {
                            aT().c.b("Bundling raw events w/o app info. appId", lcz.a(lhkVar.a.r));
                        } else if (((lir) builder.instance).e.size() > 0) {
                            long jK = lbdVarH.k();
                            if (jK != 0) {
                                builder.copyOnWrite();
                                lir lirVar7 = (lir) builder.instance;
                                lirVar7.b |= 32;
                                lirVar7.k = jK;
                                j4 = jK;
                                j3 = 0;
                            } else {
                                builder.copyOnWrite();
                                lir lirVar8 = (lir) builder.instance;
                                lirVar8.b &= -33;
                                j3 = 0;
                                lirVar8.k = 0L;
                                j4 = 0;
                            }
                            long jM = lbdVarH.m();
                            if (jM == j3) {
                                jM = j4;
                            }
                            if (jM != j3) {
                                builder.copyOnWrite();
                                lir lirVar9 = (lir) builder.instance;
                                lirVar9.b |= 16;
                                lirVar9.j = jM;
                            } else {
                                builder.copyOnWrite();
                                lir lirVar10 = (lir) builder.instance;
                                lirVar10.b &= -17;
                                lirVar10.j = 0L;
                            }
                            lbdVarH.H(((lir) builder.instance).e.size());
                            int iJ = (int) lbdVarH.j();
                            builder.copyOnWrite();
                            lir lirVar11 = (lir) builder.instance;
                            lirVar11.c |= 8388608;
                            lirVar11.Y = iJ;
                            int iL = (int) lbdVarH.l();
                            builder.copyOnWrite();
                            lir lirVar12 = (lir) builder.instance;
                            lirVar12.b |= 1048576;
                            lirVar12.z = iL;
                            lbdVarH.ab(lirVar12.h);
                            lbdVarH.Z(((lir) builder.instance).i);
                            String strV = lbdVarH.v();
                            if (strV != null) {
                                builder.copyOnWrite();
                                lir lirVar13 = (lir) builder.instance;
                                lirVar13.b |= 2097152;
                                lirVar13.A = strV;
                            } else {
                                builder.copyOnWrite();
                                lir lirVar14 = (lir) builder.instance;
                                lirVar14.b &= -2097153;
                                lirVar14.A = lirVar5.A;
                            }
                            v().an(lbdVarH, false);
                        }
                        if (((lir) builder.instance).e.size() > 0) {
                            aW();
                            if (i().F(lhkVar.a.r, lcl.aR)) {
                                aI(builder);
                            }
                            lie lieVarE = o().e(lhkVar.a.r);
                            if (lieVarE == null) {
                                z3 = true;
                            } else {
                                z3 = true;
                                if ((lieVarE.b & 1) != 0) {
                                    long j11 = lieVarE.c;
                                    builder.copyOnWrite();
                                    lir lirVar15 = (lir) builder.instance;
                                    lirVar15.b |= 536870912;
                                    lirVar15.H = j11;
                                }
                                if (z15) {
                                    zC = z3;
                                } else {
                                    zC = this.h.c(str15);
                                    if (zC) {
                                        aT().k.b("Marking bundle as sGTM realtime. appId", lcz.a(str15));
                                    }
                                }
                                aT().k.d("Bundling raw events. appId, hasRealtimeData, totalEvents", str15, Boolean.valueOf(zC), Integer.valueOf(((lir) builder.instance).e.size()));
                                v().ah((lir) builder.build(), zC);
                            }
                            if (lhkVar.a.B.isEmpty()) {
                                builder.copyOnWrite();
                                lir lirVar16 = (lir) builder.instance;
                                lirVar16.b |= 536870912;
                                lirVar16.H = -1L;
                            } else {
                                aT().f.b("Did not find measurement config or missing version info. appId", lcz.a(lhkVar.a.r));
                            }
                            if (z15) {
                                zC = this.h.c(str15);
                                if (zC) {
                                    aT().k.b("Marking bundle as sGTM realtime. appId", lcz.a(str15));
                                }
                            } else {
                                zC = z3;
                            }
                            aT().k.d("Bundling raw events. appId, hasRealtimeData, totalEvents", str15, Boolean.valueOf(zC), Integer.valueOf(((lir) builder.instance).e.size()));
                            v().ah((lir) builder.build(), zC);
                        } else {
                            z3 = true;
                        }
                        v().P(lhkVar.b);
                        v().Q(str15);
                        v().Y();
                        z = z3;
                    }
                    v().S();
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
            }
        } catch (Throwable th4) {
            v().S();
            throw th4;
        }
    }

    final boolean ae(String str, String str2) {
        lbd lbdVarH = v().h(str);
        if (lbdVarH != null && r().ak(str, lbdVarH.F())) {
            this.t.remove(str2);
            return true;
        }
        lfu lfuVar = (lfu) this.t.get(str2);
        if (lfuVar == null) {
            return true;
        }
        lfuVar.a.aV();
        return System.currentTimeMillis() >= lfuVar.c;
    }

    final boolean af() {
        A();
        return this.q != null;
    }

    final boolean ag() {
        A();
        FileLock fileLock = this.D;
        if (fileLock != null && fileLock.isValid()) {
            aT().k.a("Storage concurrent access okay");
            return true;
        }
        File filesDir = aS().getFilesDir();
        ksy ksyVar = kya.a;
        int i = kyd.a;
        try {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(new File(ksy.ao(filesDir, "google_app_measurement.db")), "rw").getChannel());
            this.E = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            FileLock fileLockTryLock = fileChannelConvertMaybeLegacyFileChannelFromLibrary.tryLock();
            this.D = fileLockTryLock;
            if (fileLockTryLock != null) {
                aT().k.a("Storage concurrent access okay");
                return true;
            }
            aT().c.a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            aT().c.b("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            aT().c.b("Failed to access storage lock file", e2);
        } catch (OverlappingFileLockException e3) {
            aT().f.b("Storage lock already acquired", e3);
        }
    }

    final void aj(aihf aihfVar, String str) {
        if ("_iap".equals(((lin) aihfVar.instance).d)) {
            aJ(aihfVar, "value", str);
            aJ(aihfVar, "price", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01a5  */
    final void ak(String str, aihf aihfVar) {
        int iW;
        int iIndexOf;
        ldo ldoVarO = o();
        ldoVarO.o();
        ldoVarO.h(str);
        Set set = (Set) ldoVarO.b.get(str);
        if (set != null) {
            aihfVar.copyOnWrite();
            lir lirVar = (lir) aihfVar.instance;
            lir lirVar2 = lir.a;
            aiie aiieVar = lirVar.Q;
            if (!aiieVar.c()) {
                lirVar.Q = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(set, lirVar.Q);
        }
        ldo ldoVarO2 = o();
        ldoVarO2.o();
        ldoVarO2.h(str);
        Map map = ldoVarO2.b;
        if (map.get(str) != null && (((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info"))) {
            aihfVar.copyOnWrite();
            lir lirVar3 = (lir) aihfVar.instance;
            lir lirVar4 = lir.a;
            lirVar3.b &= -257;
            lirVar3.n = lir.a.n;
        }
        ldo ldoVarO3 = o();
        ldoVarO3.o();
        ldoVarO3.h(str);
        Map map2 = ldoVarO3.b;
        if (map2.get(str) != null && (((Set) map2.get(str)).contains("os_version") || ((Set) map2.get(str)).contains("device_info"))) {
            String str2 = ((lir) aihfVar.instance).m;
            if (!TextUtils.isEmpty(str2) && (iIndexOf = str2.indexOf(".")) != -1) {
                String strSubstring = str2.substring(0, iIndexOf);
                aihfVar.copyOnWrite();
                lir lirVar5 = (lir) aihfVar.instance;
                strSubstring.getClass();
                lirVar5.b |= SemanticState.Focused;
                lirVar5.m = strSubstring;
            }
        }
        ldo ldoVarO4 = o();
        ldoVarO4.o();
        ldoVarO4.h(str);
        Map map3 = ldoVarO4.b;
        if (map3.get(str) != null && ((Set) map3.get(str)).contains("user_id") && (iW = lfx.W(aihfVar, "_id")) != -1) {
            aihfVar.M(iW);
        }
        ldo ldoVarO5 = o();
        ldoVarO5.o();
        ldoVarO5.h(str);
        Map map4 = ldoVarO5.b;
        if (map4.get(str) != null && ((Set) map4.get(str)).contains("google_signals")) {
            if (!((lir) aihfVar.instance).I.isEmpty()) {
                aT().k.b("dsid is cleared due to data control", str);
            }
            aihfVar.copyOnWrite();
            lir lirVar6 = (lir) aihfVar.instance;
            lirVar6.b &= Alert.DURATION_SHOW_INDEFINITELY;
            lirVar6.I = lir.a.I;
        }
        ldo ldoVarO6 = o();
        ldoVarO6.o();
        ldoVarO6.h(str);
        Map map5 = ldoVarO6.b;
        if (map5.get(str) != null && ((Set) map5.get(str)).contains("app_instance_id")) {
            aihfVar.copyOnWrite();
            lir lirVar7 = (lir) aihfVar.instance;
            lir lirVar8 = lir.a;
            lirVar7.b &= -262145;
            lirVar7.x = lir.a.x;
            if (u(str).o()) {
                Map map6 = this.H;
                axmq axmqVar = (axmq) map6.get(str);
                if (axmqVar != null) {
                    long jE = axmqVar.a + i().E(str, lcl.au);
                    aV();
                    if (jE < SystemClock.elapsedRealtime()) {
                        axmqVar = new axmq(this, r().x());
                        map6.put(str, axmqVar);
                    }
                } else {
                    axmqVar = new axmq(this, r().x());
                    map6.put(str, axmqVar);
                }
                aihfVar.copyOnWrite();
                lir lirVar9 = (lir) aihfVar.instance;
                Object obj = axmqVar.b;
                obj.getClass();
                lirVar9.c |= 16384;
                lirVar9.R = (String) obj;
            }
        }
        ldo ldoVarO7 = o();
        ldoVarO7.o();
        ldoVarO7.h(str);
        Map map7 = ldoVarO7.b;
        if (map7.get(str) == null || !((Set) map7.get(str)).contains("enhanced_user_id")) {
            return;
        }
        aihfVar.copyOnWrite();
        lir lirVar10 = (lir) aihfVar.instance;
        lir lirVar11 = lir.a;
        lirVar10.c &= -8193;
        lirVar10.P = lir.a.P;
    }

    final void al(lbd lbdVar, aihf aihfVar) {
        lgc lgcVar;
        lix lixVar;
        int i;
        lgb lgbVar;
        A();
        D();
        String str = ((lir) aihfVar.instance).T;
        EnumMap enumMap = new EnumMap(lgg.class);
        int i2 = 0;
        if (str.length() < lgg.values().length || str.charAt(0) != '1') {
            lgcVar = new lgc();
        } else {
            lgg[] lggVarArrValues = lgg.values();
            int length = lggVarArrValues.length;
            int i3 = 0;
            int i4 = 1;
            while (i3 < length) {
                lgg lggVar = lggVarArrValues[i3];
                int i5 = i4 + 1;
                char cCharAt = str.charAt(i4);
                lgb[] lgbVarArrValues = lgb.values();
                int length2 = lgbVarArrValues.length;
                int i6 = i2;
                while (true) {
                    if (i6 >= length2) {
                        lgbVar = lgb.UNSET;
                        break;
                    }
                    lgbVar = lgbVarArrValues[i6];
                    if (lgbVar.k == cCharAt) {
                        break;
                    } else {
                        i6++;
                    }
                }
                enumMap.put(lggVar, lgbVar);
                i3++;
                i4 = i5;
                i2 = 0;
            }
            lgcVar = new lgc(enumMap);
        }
        String strW = lbdVar.w();
        A();
        D();
        lgh lghVarU = u(strW);
        lge lgeVar = lge.UNINITIALIZED;
        int iOrdinal = lghVarU.c().ordinal();
        if (iOrdinal == 1) {
            lgcVar.b(lgg.AD_STORAGE, lgb.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            lgcVar.a(lgg.AD_STORAGE, lghVarU.d);
        } else {
            lgcVar.b(lgg.AD_STORAGE, lgb.FAILSAFE);
        }
        int iOrdinal2 = lghVarU.d().ordinal();
        if (iOrdinal2 == 1) {
            lgcVar.b(lgg.ANALYTICS_STORAGE, lgb.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            lgcVar.a(lgg.ANALYTICS_STORAGE, lghVarU.d);
        } else {
            lgcVar.b(lgg.ANALYTICS_STORAGE, lgb.FAILSAFE);
        }
        String strW2 = lbdVar.w();
        A();
        D();
        lgd lgdVarS = s(strW2, t(strW2), u(strW2), lgcVar);
        Boolean bool = lgdVarS.d;
        kro.l(bool);
        boolean zBooleanValue = bool.booleanValue();
        aihfVar.copyOnWrite();
        lir lirVar = (lir) aihfVar.instance;
        lirVar.c |= 262144;
        lirVar.U = zBooleanValue;
        String str2 = lgdVarS.e;
        if (!TextUtils.isEmpty(str2)) {
            aihfVar.copyOnWrite();
            lir lirVar2 = (lir) aihfVar.instance;
            str2.getClass();
            lirVar2.c |= 524288;
            lirVar2.V = str2;
        }
        A();
        D();
        Iterator it = DesugarCollections.unmodifiableList(((lir) aihfVar.instance).f).iterator();
        do {
            if (!it.hasNext()) {
                lixVar = null;
                break;
            }
            lixVar = (lix) it.next();
        } while (!"_npa".equals(lixVar.d));
        if (lixVar != null) {
            EnumMap enumMap2 = lgcVar.a;
            lgg lggVar2 = lgg.AD_PERSONALIZATION;
            lgb lgbVar2 = (lgb) enumMap2.get(lggVar2);
            if (lgbVar2 == null) {
                lgbVar2 = lgb.UNSET;
            }
            if (lgbVar2 == lgb.UNSET) {
                aaqp aaqpVarAp = v().ap(lbdVar.w(), "_npa");
                if (aaqpVarAp != null) {
                    Object obj = aaqpVarAp.e;
                    if ("tcf".equals(obj)) {
                        lgcVar.b(lggVar2, lgb.TCF);
                    } else if ("app".equals(obj)) {
                        lgcVar.b(lggVar2, lgb.API);
                    } else {
                        lgcVar.b(lggVar2, lgb.MANIFEST);
                    }
                } else {
                    Boolean boolS = lbdVar.s();
                    if (boolS == null || ((boolS.booleanValue() && lixVar.f != 1) || !(boolS.booleanValue() || lixVar.f == 0))) {
                        lgcVar.b(lggVar2, lgb.API);
                    } else {
                        lgcVar.b(lggVar2, lgb.MANIFEST);
                    }
                }
            }
        } else {
            int iAv = av(lbdVar.w(), lgcVar);
            aihf aihfVarCreateBuilder = lix.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            lix lixVar2 = (lix) aihfVarCreateBuilder.instance;
            lixVar2.b |= 2;
            lixVar2.d = "_npa";
            aV();
            long jCurrentTimeMillis = System.currentTimeMillis();
            aihfVarCreateBuilder.copyOnWrite();
            lix lixVar3 = (lix) aihfVarCreateBuilder.instance;
            lixVar3.b |= 1;
            lixVar3.c = jCurrentTimeMillis;
            aihfVarCreateBuilder.copyOnWrite();
            lix lixVar4 = (lix) aihfVarCreateBuilder.instance;
            lixVar4.b |= 8;
            lixVar4.f = iAv;
            aihfVar.K((lix) aihfVarCreateBuilder.build());
            aT().k.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iAv));
        }
        String string = lgcVar.toString();
        aihfVar.copyOnWrite();
        lir lirVar3 = (lir) aihfVar.instance;
        lirVar3.c |= 131072;
        lirVar3.T = string;
        boolean zL = this.a.l(lbdVar.w());
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lir) aihfVar.instance).e);
        for (int i7 = 0; i7 < listUnmodifiableList.size(); i7++) {
            if ("_tcf".equals(((lin) listUnmodifiableList.get(i7)).d)) {
                aihf builder = ((lin) listUnmodifiableList.get(i7)).toBuilder();
                List listUnmodifiableList2 = DesugarCollections.unmodifiableList(((lin) builder.instance).c);
                for (int i8 = 0; i8 < listUnmodifiableList2.size(); i8++) {
                    if ("_tcfd".equals(((lip) listUnmodifiableList2.get(i8)).c)) {
                        String strValueOf = ((lip) listUnmodifiableList2.get(i8)).d;
                        if (zL && strValueOf.length() > 4) {
                            char[] charArray = strValueOf.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i = 0;
                                    break;
                                } else {
                                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                        i = i9;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            strValueOf = String.valueOf(charArray);
                        }
                        aihf aihfVarCreateBuilder2 = lip.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        lip lipVar = (lip) aihfVarCreateBuilder2.instance;
                        lipVar.b |= 1;
                        lipVar.c = "_tcfd";
                        aihfVarCreateBuilder2.copyOnWrite();
                        lip lipVar2 = (lip) aihfVarCreateBuilder2.instance;
                        strValueOf.getClass();
                        lipVar2.b |= 2;
                        lipVar2.d = strValueOf;
                        builder.bh(i8, aihfVarCreateBuilder2);
                        break;
                    }
                }
                aihfVar.bl(i7, builder);
                return;
            }
        }
    }

    final void am(lbd lbdVar, aihf aihfVar) {
        Object objU;
        A();
        D();
        aihf aihfVarCreateBuilder = lih.a.createBuilder();
        byte[] bArrAy = lbdVar.ay();
        if (bArrAy != null) {
            try {
                aihfVarCreateBuilder = (aihf) lfx.l(aihfVarCreateBuilder, bArrAy);
            } catch (aiik unused) {
                aT().f.b("Failed to parse locally stored ad campaign info. appId", lcz.a(lbdVar.w()));
            }
        }
        for (lin linVar : DesugarCollections.unmodifiableList(((lir) aihfVar.instance).e)) {
            if (linVar.d.equals("_cmp")) {
                String str = (String) lfx.af(linVar, "gclid", "");
                String str2 = (String) lfx.af(linVar, "gbraid", "");
                String str3 = (String) lfx.af(linVar, "gad_source", "");
                String str4 = (String) lfx.af(linVar, "deep_link_url", "");
                String[] strArrSplit = ((String) lcl.aQ.b(null)).split(",");
                q();
                HashMap map = new HashMap();
                for (lip lipVar : linVar.c) {
                    if (Arrays.asList(strArrSplit).contains(lipVar.c) && (objU = lfx.U(lipVar)) != null) {
                        map.put(lipVar.c, objU);
                    }
                }
                if (!map.isEmpty()) {
                    long jLongValue = ((Long) lfx.af(linVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = linVar.e;
                    }
                    if ("referrer API v2".equals(lfx.ac(linVar, "_cis"))) {
                        if (jLongValue > ((lih) aihfVarCreateBuilder.instance).j) {
                            if (str.isEmpty()) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lih lihVar = (lih) aihfVarCreateBuilder.instance;
                                lihVar.b &= -17;
                                lihVar.g = lih.a.g;
                            } else {
                                aihfVarCreateBuilder.copyOnWrite();
                                lih lihVar2 = (lih) aihfVarCreateBuilder.instance;
                                lihVar2.b |= 16;
                                lihVar2.g = str;
                            }
                            if (str2.isEmpty()) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lih lihVar3 = (lih) aihfVarCreateBuilder.instance;
                                lihVar3.b &= -33;
                                lihVar3.h = lih.a.h;
                            } else {
                                aihfVarCreateBuilder.copyOnWrite();
                                lih lihVar4 = (lih) aihfVarCreateBuilder.instance;
                                lihVar4.b |= 32;
                                lihVar4.h = str2;
                            }
                            if (str3.isEmpty()) {
                                aihfVarCreateBuilder.copyOnWrite();
                                lih lihVar5 = (lih) aihfVarCreateBuilder.instance;
                                lihVar5.b &= -65;
                                lihVar5.i = lih.a.i;
                            } else {
                                aihfVarCreateBuilder.copyOnWrite();
                                lih lihVar6 = (lih) aihfVarCreateBuilder.instance;
                                lihVar6.b |= 64;
                                lihVar6.i = str3;
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar7 = (lih) aihfVarCreateBuilder.instance;
                            lihVar7.b |= SemanticState.Focused;
                            lihVar7.j = jLongValue;
                            aihfVarCreateBuilder.copyOnWrite();
                            ((lih) aihfVarCreateBuilder.instance).b().clear();
                            Map mapAA = aA(linVar);
                            aihfVarCreateBuilder.copyOnWrite();
                            ((lih) aihfVarCreateBuilder.instance).b().putAll(mapAA);
                        }
                    } else if (jLongValue > ((lih) aihfVarCreateBuilder.instance).f) {
                        if (str.isEmpty()) {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar8 = (lih) aihfVarCreateBuilder.instance;
                            lihVar8.b &= -2;
                            lihVar8.c = lih.a.c;
                        } else {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar9 = (lih) aihfVarCreateBuilder.instance;
                            lihVar9.b |= 1;
                            lihVar9.c = str;
                        }
                        if (str2.isEmpty()) {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar10 = (lih) aihfVarCreateBuilder.instance;
                            lihVar10.b &= -3;
                            lihVar10.d = lih.a.d;
                        } else {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar11 = (lih) aihfVarCreateBuilder.instance;
                            lihVar11.b |= 2;
                            lihVar11.d = str2;
                        }
                        if (str3.isEmpty()) {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar12 = (lih) aihfVarCreateBuilder.instance;
                            lihVar12.b &= -5;
                            lihVar12.e = lih.a.e;
                        } else {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar13 = (lih) aihfVarCreateBuilder.instance;
                            lihVar13.b |= 4;
                            lihVar13.e = str3;
                        }
                        if (str4.isEmpty()) {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar14 = (lih) aihfVarCreateBuilder.instance;
                            lihVar14.b &= -257;
                            lihVar14.k = lih.a.k;
                        } else {
                            aihfVarCreateBuilder.copyOnWrite();
                            lih lihVar15 = (lih) aihfVarCreateBuilder.instance;
                            lihVar15.b |= SemanticState.Hidden;
                            lihVar15.k = str4;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        lih lihVar16 = (lih) aihfVarCreateBuilder.instance;
                        lihVar16.b |= 8;
                        lihVar16.f = jLongValue;
                        aihfVarCreateBuilder.copyOnWrite();
                        ((lih) aihfVarCreateBuilder.instance).a().clear();
                        Map mapAA2 = aA(linVar);
                        aihfVarCreateBuilder.copyOnWrite();
                        ((lih) aihfVarCreateBuilder.instance).a().putAll(mapAA2);
                    }
                }
            }
        }
        if (!((lih) aihfVarCreateBuilder.build()).equals(lih.a)) {
            lih lihVar17 = (lih) aihfVarCreateBuilder.build();
            aihfVar.copyOnWrite();
            lir lirVar = (lir) aihfVar.instance;
            lihVar17.getClass();
            lirVar.Z = lihVar17;
            lirVar.c |= 16777216;
        }
        lbdVar.I(((lih) aihfVarCreateBuilder.build()).toByteArray());
        if (lbdVar.av()) {
            v().an(lbdVar, false);
        }
        for (int i = 0; i < ((lir) aihfVar.instance).e.size(); i++) {
            lin linVarH = aihfVar.H(i);
            if ("_cmp".equals(linVarH.d)) {
                aihf builder = linVarH.toBuilder();
                List listUnmodifiableList = DesugarCollections.unmodifiableList(((lin) builder.instance).c);
                for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
                    if ("deep_link_url".equals(((lip) listUnmodifiableList.get(i2)).c)) {
                        builder.E(i2);
                        aihfVar.bl(i, builder);
                        break;
                    }
                }
            }
        }
        if (i().F(null, lcl.aP)) {
            v().W(lbdVar.w(), "_lgclid");
        }
    }

    final void an(String str, aihf aihfVar) {
        A();
        D();
        lbd lbdVarH = v().h(str);
        if (lbdVarH == null) {
            aT().f.b("Cannot populate ad_campaign_info without appInfo. appId", lcz.a(str));
        } else {
            am(lbdVarH, aihfVar);
        }
    }

    final void ao(String str, aihf aihfVar) {
        A();
        D();
        ldo ldoVarO = o();
        ldoVarO.o();
        ldoVarO.h(str);
        List list = (List) ldoVarO.e.get(str);
        if (list != null) {
            aihfVar.copyOnWrite();
            lir lirVar = (lir) aihfVar.instance;
            lir lirVar2 = lir.a;
            aihv aihvVar = lirVar.L;
            if (!aihvVar.c()) {
                lirVar.L = aihn.mutableCopy(aihvVar);
            }
            aifs.addAll(list, lirVar.L);
        }
    }

    final void ap(String str, aihf aihfVar, Bundle bundle, String str2) {
        List listE = ksy.e("_o", "_sn", "_sc", "_si", "deep_link_url");
        long jD = (lga.am(((lip) aihfVar.instance).c) || lga.am(str)) ? i().d(str2, true) : i().c(str2, true);
        String str3 = ((lip) aihfVar.instance).d;
        long jCodePointCount = str3.codePointCount(0, str3.length());
        r();
        String str4 = ((lip) aihfVar.instance).c;
        i();
        String strAA = lga.aA(str4, 40, true);
        if (jCodePointCount <= jD || listE.contains(((lip) aihfVar.instance).c)) {
            return;
        }
        if ("_ev".equals(((lip) aihfVar.instance).c)) {
            r();
            bundle.putString("_ev", lga.aA(((lip) aihfVar.instance).d, i().d(str2, true), true));
            return;
        }
        aT().h.c("Param value is too long; discarded. Name, value length", strAA, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strAA);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((lip) aihfVar.instance).c);
    }

    final boolean aq(aihf aihfVar) {
        ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(((lin) aihfVar.instance).c));
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("value".equals(((lip) arrayList.get(i3)).c)) {
                i = i3;
            } else if ("currency".equals(((lip) arrayList.get(i3)).c)) {
                i2 = i3;
            }
        }
        if (i != -1) {
            if ((((lip) arrayList.get(i)).b & 4) == 0 && (((lip) arrayList.get(i)).b & 16) == 0) {
                aT().h.a("Value must be specified with a numeric type.");
                aihfVar.E(i);
                au(aihfVar, "_c");
                as(aihfVar, 18, "value");
                return false;
            }
            if (i2 != -1) {
                String str = ((lip) arrayList.get(i2)).d;
                if (str.length() == 3) {
                    int iCharCount = 0;
                    while (iCharCount < str.length()) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (Character.isLetter(iCodePointAt)) {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                }
            }
            aT().h.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
            aihfVar.E(i);
            au(aihfVar, "_c");
            as(aihfVar, 19, "currency");
            return false;
        }
        if ("_iap".equals(((lin) aihfVar.instance).d)) {
            au(aihfVar, "_c");
            as(aihfVar, 18, "value");
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9 */
    final Bundle c(String str) {
        A();
        D();
        if (o().d(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        lgh lghVarU = u(str);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : lghVarU.c.entrySet()) {
            String strJ = lgh.j((lge) entry.getValue());
            if (strJ != null) {
                bundle2.putString(((lgg) entry.getKey()).e, strJ);
            }
        }
        bundle.putAll(bundle2);
        lgd lgdVarS = s(str, t(str), lghVarU, new lgc());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : lgdVarS.f.entrySet()) {
            String strJ2 = lgh.j((lge) entry2.getValue());
            if (strJ2 != null) {
                bundle3.putString(((lgg) entry2.getKey()).e, strJ2);
            }
        }
        Boolean bool = lgdVarS.d;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str2 = lgdVarS.e;
        if (str2 != null) {
            bundle3.putString("cps_display_str", str2);
        }
        bundle.putAll(bundle3);
        aaqp aaqpVarAp = v().ap(str, "_npa");
        bundle.putString("ad_personalization", 1 != (aaqpVarAp != null ? aaqpVarAp.c.equals(1L) : av(str, new lgc())) ? "granted" : "denied");
        return bundle;
    }

    final Bundle d(String str, lcd lcdVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", lcdVar.b.b("_sid").longValue());
        aaqp aaqpVarAp = v().ap(str, "_sno");
        if (aaqpVarAp != null) {
            Object obj = aaqpVarAp.c;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final lbd e(lbg lbgVar) {
        boolean z;
        A();
        D();
        kro.l(lbgVar);
        String str = lbgVar.a;
        kro.i(str);
        String str2 = lbgVar.t;
        if (!str2.isEmpty()) {
            this.H.put(str, new axmq(this, str2));
        }
        lbd lbdVarH = v().h(str);
        lgh lghVarH = u(str).h(lgh.g(lbgVar.s, 100));
        String strD = this.g.d(lbgVar, lghVarH);
        boolean z2 = true;
        boolean z3 = false;
        if (lbdVarH == null) {
            lbdVarH = new lbd(this.j, str);
            if (lghVarH.o()) {
                lbdVarH.M(x(lghVarH));
            }
            if (lghVarH.m()) {
                lbdVarH.ag(strD);
            }
        } else if (lghVarH.m() && strD != null && !strD.equals(lbdVarH.C())) {
            boolean zIsEmpty = TextUtils.isEmpty(lbdVarH.C());
            lbdVarH.ag(strD);
            if (lbgVar.n && !"00000000-0000-0000-0000-000000000000".equals(this.g.c(lbgVar, lghVarH).first) && !zIsEmpty) {
                if (lghVarH.o()) {
                    lbdVarH.M(x(lghVarH));
                    z = false;
                } else {
                    z = true;
                }
                if (v().ap(str, "_id") != null && v().ap(str, "_lair") == null) {
                    aV();
                    v().aq(new aaqp(str, "auto", "_lair", System.currentTimeMillis(), (Object) 1L));
                }
                z3 = z;
            } else if (TextUtils.isEmpty(lbdVarH.x()) && lghVarH.o()) {
                lbdVarH.M(x(lghVarH));
            }
        } else if (TextUtils.isEmpty(lbdVarH.x()) && lghVarH.o()) {
            lbdVarH.M(x(lghVarH));
        }
        lbdVarH.W(lbgVar.b);
        String str3 = lbgVar.k;
        if (!TextUtils.isEmpty(str3)) {
            lbdVarH.V(str3);
        }
        long j = lbgVar.e;
        if (j != 0) {
            lbdVarH.X(j);
        }
        String str4 = lbgVar.c;
        if (!TextUtils.isEmpty(str4)) {
            lbdVarH.O(str4);
        }
        lbdVarH.P(lbgVar.j);
        String str5 = lbgVar.d;
        if (str5 != null) {
            lbdVarH.N(str5);
        }
        lbdVarH.S(lbgVar.f);
        lbdVarH.ae(lbgVar.h);
        String str6 = lbgVar.g;
        if (!TextUtils.isEmpty(str6)) {
            lbdVarH.Y(str6);
        }
        lbdVarH.K(lbgVar.n);
        lbdVarH.af(lbgVar.p);
        lbdVarH.T(lbgVar.q);
        lbdVarH.aj(lbgVar.u);
        ausf.c();
        if (i().F(null, lcl.aL)) {
            lbdVarH.ah(lbgVar.r);
        } else {
            ausf.c();
            if (i().F(null, lcl.aK)) {
                lbdVarH.ah(null);
            }
        }
        lbdVarH.an(lbgVar.v);
        lbdVarH.am(lbgVar.B);
        autd.c();
        if (i().F(null, lcl.aN)) {
            lbdVarH.J(lbgVar.z);
        }
        lbdVarH.ao(lbgVar.w);
        lbdVarH.ai(lbgVar.C);
        lbdVarH.Q(lbgVar.E);
        if (((Boolean) lcl.bg.b(null)).booleanValue()) {
            lbdVarH.ad(lbgVar.G);
            lbdVarH.L(lbgVar.H);
            lbdVarH.al(lbgVar.I);
        }
        if (!lbdVarH.av()) {
            if (z3) {
            }
            return lbdVarH;
        }
        z2 = z3;
        v().an(lbdVarH, z2);
        return lbdVarH;
    }

    public final lbg g(String str) {
        lbd lbdVarH = v().h(str);
        if (lbdVarH == null || TextUtils.isEmpty(lbdVarH.z())) {
            aT().j.b("No app data available; dropping", str);
            return null;
        }
        Boolean boolAz = az(lbdVarH);
        if (boolAz == null || boolAz.booleanValue()) {
            return new lbg(str, lbdVarH.B(), lbdVarH.z(), lbdVarH.c(), lbdVarH.y(), lbdVarH.i(), lbdVarH.f(), (String) null, lbdVarH.au(), false, lbdVarH.A(), 0L, 0, lbdVarH.as(), false, lbdVarH.s(), lbdVarH.g(), lbdVarH.G(), u(str).l(), "", (String) null, lbdVarH.aw(), lbdVarH.r(), u(str).d, t(str).c, lbdVarH.a(), lbdVarH.d(), lbdVarH.F(), lbdVarH.D(), 0L, lbdVarH.b(), 0L, lbdVarH.o(), lbdVarH.at(), lbdVarH.q());
        }
        aT().c.b("App version does not match; dropping. appId", lcz.a(str));
        return null;
    }

    public final lbo h() {
        lbo lboVar = this.e;
        ai(lboVar);
        return lboVar;
    }

    public final lbt i() {
        ldr ldrVar = this.j;
        kro.l(ldrVar);
        return ldrVar.c;
    }

    public final lby j() {
        return this.j.d();
    }

    public final lcu k() {
        return this.j.h;
    }

    public final lde l() {
        lde ldeVar = this.x;
        ai(ldeVar);
        return ldeVar;
    }

    public final ldf m() {
        ldf ldfVar = this.c;
        if (ldfVar != null) {
            return ldfVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final ldo o() {
        ldo ldoVar = this.a;
        ai(ldoVar);
        return ldoVar;
    }

    public final lfx q() {
        lfx lfxVar = this.y;
        ai(lfxVar);
        return lfxVar;
    }

    public final lga r() {
        ldr ldrVar = this.j;
        kro.l(ldrVar);
        return ldrVar.l();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:1: B:22:0x006b->B:66:?, LOOP_END, SYNTHETIC] */
    final lgd s(String str, lgd lgdVar, lgh lghVar, lgc lgcVar) {
        lge lgeVar;
        ldo ldoVar;
        lgg lggVar;
        lib libVarD;
        lgg lggVarR;
        lge lgeVarC;
        boolean z;
        int iBc;
        int iBc2;
        int i = 90;
        if (o().d(str) == null) {
            if (lgdVar.c() == lge.DENIED) {
                i = lgdVar.b;
                lgcVar.a(lgg.AD_USER_DATA, i);
            } else {
                lgcVar.b(lgg.AD_USER_DATA, lgb.FAILSAFE);
            }
            return new lgd(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        lge lgeVarC2 = lgdVar.c();
        lge lgeVar2 = lge.GRANTED;
        if (lgeVarC2 == lgeVar2 || lgeVarC2 == (lgeVar = lge.DENIED)) {
            i = lgdVar.b;
            lgcVar.a(lgg.AD_USER_DATA, i);
        } else if (lgeVarC2 == lge.POLICY) {
            ldo ldoVar2 = this.a;
            lgg lggVar2 = lgg.AD_USER_DATA;
            lge lgeVarC3 = ldoVar2.c(str, lggVar2);
            if (lgeVarC3 != lge.UNINITIALIZED) {
                lgcVar.b(lggVar2, lgb.REMOTE_ENFORCED_DEFAULT);
                lgeVarC2 = lgeVarC3;
            } else {
                ldoVar = this.a;
                lggVar = lgg.AD_USER_DATA;
                ldoVar.o();
                ldoVar.h(str);
                libVarD = ldoVar.d(str);
                lggVarR = null;
                if (libVarD != null) {
                    for (lhz lhzVar : libVarD.d) {
                        iBc = a.bc(lhzVar.b);
                        if (iBc == 0) {
                            iBc = 1;
                        }
                        if (lggVar == ldoVar.r(iBc)) {
                            iBc2 = a.bc(lhzVar.c);
                            if (iBc2 == 0) {
                                iBc2 = 1;
                            }
                            lggVarR = ldoVar.r(iBc2);
                            break;
                        }
                    }
                }
                lgeVarC = lghVar.c();
                if (lgeVarC != lgeVar2 || lgeVarC == lgeVar) {
                    z = true;
                } else {
                    z = false;
                }
                if (lggVarR == lgg.AD_STORAGE || !z) {
                    lgcVar.b(lggVar, lgb.REMOTE_DEFAULT);
                    if (true != ldoVar.k(str, lggVar)) {
                        lgeVarC2 = lgeVar;
                    } else {
                        lgeVarC2 = lgeVar2;
                    }
                } else {
                    lgcVar.b(lggVar, lgb.REMOTE_DELEGATION);
                    lgeVarC2 = lgeVarC;
                }
            }
        } else {
            ldoVar = this.a;
            lggVar = lgg.AD_USER_DATA;
            ldoVar.o();
            ldoVar.h(str);
            libVarD = ldoVar.d(str);
            lggVarR = null;
            if (libVarD != null) {
                while (r5.hasNext()) {
                    iBc = a.bc(lhzVar.b);
                    if (iBc == 0) {
                        iBc = 1;
                    }
                    if (lggVar == ldoVar.r(iBc)) {
                        iBc2 = a.bc(lhzVar.c);
                        if (iBc2 == 0) {
                            iBc2 = 1;
                        }
                        lggVarR = ldoVar.r(iBc2);
                        break;
                    }
                }
            }
            lgeVarC = lghVar.c();
            if (lgeVarC != lgeVar2) {
                z = true;
            } else {
                z = true;
            }
            if (lggVarR == lgg.AD_STORAGE) {
                lgcVar.b(lggVar, lgb.REMOTE_DEFAULT);
                if (true != ldoVar.k(str, lggVar)) {
                    lgeVarC2 = lgeVar;
                } else {
                    lgeVarC2 = lgeVar2;
                }
            } else {
                lgcVar.b(lggVar, lgb.REMOTE_DEFAULT);
                if (true != ldoVar.k(str, lggVar)) {
                    lgeVarC2 = lgeVar;
                } else {
                    lgeVarC2 = lgeVar2;
                }
            }
        }
        boolean zL = this.a.l(str);
        ldo ldoVarO = o();
        ldoVarO.o();
        ldoVarO.h(str);
        TreeSet treeSet = new TreeSet();
        lib libVarD2 = ldoVarO.d(str);
        if (libVarD2 != null) {
            Iterator it = libVarD2.e.iterator();
            while (it.hasNext()) {
                treeSet.add(((lia) it.next()).b);
            }
        }
        if (lgeVarC2 == lge.DENIED || treeSet.isEmpty()) {
            return new lgd(Boolean.FALSE, i, Boolean.valueOf(zL), "-");
        }
        return new lgd(Boolean.TRUE, i, Boolean.valueOf(zL), zL ? TextUtils.join("", treeSet) : "");
    }

    final lgd t(String str) {
        A();
        D();
        Map map = this.G;
        lgd lgdVar = (lgd) map.get(str);
        if (lgdVar != null) {
            return lgdVar;
        }
        lgp lgpVarV = v();
        kro.l(str);
        lgpVarV.o();
        lgpVarV.w();
        lgd lgdVarB = lgd.b(lgpVarV.am("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, lgdVarB);
        return lgdVarB;
    }

    public final lgh u(String str) {
        lgh lghVar = lgh.a;
        A();
        D();
        lgh lghVarM = (lgh) this.F.get(str);
        if (lghVarM == null) {
            lghVarM = v().m(str);
            if (lghVarM == null) {
                lghVarM = lgh.a;
            }
            W(str, lghVarM);
        }
        return lghVarM;
    }

    public final lgp v() {
        lgp lgpVar = this.b;
        ai(lgpVar);
        return lgpVar;
    }

    public final lhq w() {
        lhq lhqVar = this.d;
        ai(lhqVar);
        return lhqVar;
    }

    final String x(lgh lghVar) {
        if (!lghVar.o()) {
            return null;
        }
        byte[] bArr = new byte[16];
        r().B().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String y(lbg lbgVar) {
        try {
            return (String) aU().c(new ldy(this, lbgVar, 2)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aT().c.c("Failed to get app instance id. appId", lcz.a(lbgVar.a), e);
            return null;
        }
    }
}
