package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.TemplateMetadataRepository;
import com.google.android.libraries.elements.interfaces.TemplateResolver;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.io.File;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mda {
    public mda(Context context) {
        qkh.c(context);
    }

    public static dzv b(Set set) {
        dys dysVar = new dys();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dzv dzvVar = (dzv) it.next();
            dzvVar.getClass();
            dysVar.a.add(dzvVar);
        }
        return dysVar;
    }

    public static nso c(agev agevVar) {
        return nxz.d(((Boolean) agevVar.e(Boolean.FALSE)).booleanValue());
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    public static agev d(agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5) {
        Boolean bool = Boolean.FALSE;
        if (((Boolean) agevVar.e(bool)).booleanValue() || ((Boolean) agevVar2.e(bool)).booleanValue()) {
            return agev.h(TemplateMetadataRepository.create((((Boolean) agevVar3.e(bool)).booleanValue() || ((Boolean) agevVar4.e(bool)).booleanValue()) ? (WasmTemplateProvider) ((agfa) agevVar5).a.io() : null, ((Boolean) agevVar2.e(bool)).booleanValue()));
        }
        return agdf.a;
    }

    public static boolean e(Context context, agev agevVar) {
        int iOrdinal = ((nui) ((agfa) agevVar).a).ordinal();
        if (iOrdinal != 1) {
            return iOrdinal == 2;
        }
        if (men.b) {
            return true;
        }
        synchronized (men.a) {
            if (!men.b) {
                if (!(context.getApplicationContext() instanceof Application)) {
                    throw new IllegalArgumentException("The Context instance doesn't provide Application which is required by EmojiCompat init process");
                }
                blu bluVar = new blu(context, new awy("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs));
                bluVar.a();
                bluVar.c(new blt(2000L));
                bll.e(bluVar);
                bll bllVarB = bll.b();
                bllVarB.h(new mem(bllVarB));
            }
        }
        return true;
    }

    public static ComponentSharedResources f(agev agevVar, Map map, agev agevVar2, agev agevVar3) {
        HashMap map2 = new HashMap(map);
        ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
        return new ComponentSharedResources(map2, null, (TemplateMetadataRepository) agevVar2.f(), (TemplateResolver) ((agfa) agevVar3).a);
    }

    public static /* synthetic */ boolean g(CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command == null) {
            return false;
        }
        aihl aihlVar = asqo.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        commandOuterClass$Command.c(aihlVarCheckIsLite);
        if (!commandOuterClass$Command.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVar2 = asok.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar2);
            commandOuterClass$Command.c(aihlVarCheckIsLite2);
            if (!commandOuterClass$Command.j.n(aihlVarCheckIsLite2.d)) {
                return false;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
            commandOuterClass$Command.c(aihlVarCheckIsLite3);
            Object objK = commandOuterClass$Command.j.k(aihlVarCheckIsLite3.d);
            for (CommandOuterClass$Command commandOuterClass$Command2 : ((asok) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK))).c) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                commandOuterClass$Command2.c(aihlVarCheckIsLite4);
                if (commandOuterClass$Command2.j.n(aihlVarCheckIsLite4.d)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean h(nar narVar) {
        return narVar.i() == 1 || !(narVar.I() == 9 || narVar.I() == 2 || narVar.I() == 1);
    }

    public static ntv i(mla mlaVar, nvp nvpVar, final nry nryVar, final nxl nxlVar, final nuc nucVar, agev agevVar, agev agevVar2, agev agevVar3, final agev agevVar4) {
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) agevVar.e(bool)).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) agevVar2.e(bool)).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) agevVar3.e(bool)).booleanValue();
        return mlaVar.a(nvpVar, new mky() { // from class: mhs
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                mww mwwVar = (mww) obj;
                boolean z = mwwVar.u() && (mwwVar.l().j() || mwwVar.l().l() || mwwVar.l().k());
                boolean z2 = mwwVar.t() && (mwwVar.k().j() || mwwVar.k().l() || mwwVar.k().k());
                if (!z && !z2) {
                    throw new nud("AnimatedVectorType doesn't have valid animation or animation_legacy.");
                }
                agev agevVar5 = agevVar4;
                boolean z3 = zBooleanValue3;
                boolean z4 = zBooleanValue2;
                boolean z5 = zBooleanValue;
                nxl nxlVar2 = nxlVar;
                nry nryVar2 = nryVar;
                nuc nucVar2 = nucVar;
                omj omjVar = new omj(nucVar2);
                mhq mhqVar = new mhq(fhdVar, new mhr());
                mhr mhrVar = mhqVar.a;
                mhrVar.a = nryVar2;
                BitSet bitSet = mhqVar.d;
                bitSet.set(0);
                mhrVar.b = nslVar;
                bitSet.set(1);
                mhrVar.r = mwwVar;
                bitSet.set(5);
                mhrVar.g = nucVar2;
                bitSet.set(2);
                mhrVar.s = nxlVar2;
                bitSet.set(6);
                mhrVar.t = mipVar;
                mhrVar.f = z5;
                mhrVar.d = z4;
                mhrVar.e = z3;
                mhrVar.q = agevVar5;
                mhrVar.u = mwwVar.x() ? omjVar.B(mwwVar.m(), nslVar) : null;
                bitSet.set(3);
                mhrVar.x = mwwVar.A() ? omjVar.B(mwwVar.p(), nslVar) : null;
                bitSet.set(4);
                mhrVar.c = str;
                mhrVar.v = mwwVar.y() ? omjVar.B(mwwVar.n(), nslVar) : null;
                mhrVar.w = mwwVar.z() ? omjVar.B(mwwVar.o(), nslVar) : null;
                return mhqVar;
            }
        }, null, mww.C, false);
    }

    public static final mhk j(aunn aunnVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        JSEnvironment jSEnvironment = (JSEnvironment) awmdVar.io();
        jSEnvironment.getClass();
        aunnVar.getClass();
        agev agevVar = (agev) awmdVar3.io();
        agevVar.getClass();
        agev agevVar2 = (agev) awmdVar4.io();
        agevVar2.getClass();
        agev agevVar3 = (agev) awmdVar5.io();
        agevVar3.getClass();
        return new mhk(jSEnvironment, awmdVar2, aunnVar, agevVar, agevVar2, agevVar3);
    }

    @Deprecated
    public static lpa k(Executor executor, Callable callable) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        lpf lpfVar = new lpf();
        executor.execute(new lph(lpfVar, callable, 0));
        return lpfVar;
    }

    public static lpa l(Exception exc) {
        lpf lpfVar = new lpf();
        lpfVar.s(exc);
        return lpfVar;
    }

    public static lpa m(Object obj) {
        lpf lpfVar = new lpf();
        lpfVar.t(obj);
        return lpfVar;
    }

    public static Object n(lpa lpaVar) {
        kro.g("Must not be called on the main application thread");
        kro.k();
        if (lpaVar.i()) {
            return y(lpaVar);
        }
        lpi lpiVar = new lpi();
        Executor executor = lpd.b;
        lpaVar.n(executor, lpiVar);
        lpaVar.m(executor, lpiVar);
        lpaVar.k(executor, lpiVar);
        lpiVar.a.await();
        return y(lpaVar);
    }

    public static Object o(lpa lpaVar, long j, TimeUnit timeUnit) throws TimeoutException {
        kro.g("Must not be called on the main application thread");
        kro.k();
        if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        }
        if (lpaVar.i()) {
            return y(lpaVar);
        }
        lpi lpiVar = new lpi();
        Executor executor = lpd.b;
        lpaVar.n(executor, lpiVar);
        lpaVar.m(executor, lpiVar);
        lpaVar.k(executor, lpiVar);
        if (lpiVar.a.await(j, timeUnit)) {
            return y(lpaVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static llw p(int i, int i2) {
        int iAS = a.aS(i);
        if (iAS == 0) {
            iAS = 1;
        }
        aihf aihfVarCreateBuilder = lly.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        lly llyVar = (lly) aihfVarCreateBuilder.instance;
        llyVar.d = i2 - 1;
        llyVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        lly llyVar2 = (lly) aihfVarCreateBuilder.instance;
        llyVar2.c = iAS - 1;
        llyVar2.b |= 1;
        lly llyVar3 = (lly) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = lmb.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        lmb lmbVar = (lmb) aihfVarCreateBuilder2.instance;
        llyVar3.getClass();
        lmbVar.c = llyVar3;
        lmbVar.b = 7;
        return new llw(((lmb) aihfVarCreateBuilder2.build()).toByteArray(), null);
    }

    public static llq q(Context context) {
        khn khnVar = lll.a;
        return new llq(context);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: SQLiteException -> 0x00b4, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:60:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[Catch: SQLiteException -> 0x00b4, LOOP:0: B:30:0x0068->B:33:0x0072, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:60:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[Catch: SQLiteException -> 0x00b4, LOOP:1: B:37:0x0085->B:42:0x0097, LOOP_START, PHI: r0
      0x0085: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:36:0x0083, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:60:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[Catch: SQLiteException -> 0x00b4, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:60:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[Catch: SQLiteException -> 0x00b4, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:60:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[Catch: SQLiteException -> 0x00b4, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:60:0x0044, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void r(lcz lczVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        Throwable th;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (lczVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    sQLiteDatabase2 = sQLiteDatabase;
                    try {
                        cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                        try {
                            try {
                                boolean zMoveToFirst = cursorQuery.moveToFirst();
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (!zMoveToFirst) {
                                    sQLiteDatabase2.execSQL(str2);
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                lczVar.f.c("Error querying for table", str, e);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorQuery = null;
                        lczVar.f.c("Error querying for table", str, e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        sQLiteDatabase2.execSQL(str2);
                        hashSet = new HashSet();
                        cursorRawQuery = sQLiteDatabase2.rawQuery(a.bT(str, "SELECT * FROM ", " LIMIT 0"), null);
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                throw new SQLiteException(a.ca(str4, str, "Table ", " is missing required column: "));
                            }
                        }
                        if (strArr != null) {
                            for (i = 0; i < strArr.length; i += 2) {
                                if (!hashSet.remove(strArr[i])) {
                                    sQLiteDatabase2.execSQL(strArr[i + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        lczVar.f.c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
                hashSet = new HashSet();
                cursorRawQuery = sQLiteDatabase2.rawQuery(a.bT(str, "SELECT * FROM ", " LIMIT 0"), null);
                try {
                    Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                    cursorRawQuery.close();
                    while (i2 < r14) {
                        if (hashSet.remove(str4)) {
                            throw new SQLiteException(a.ca(str4, str, "Table ", " is missing required column: "));
                        }
                    }
                    if (strArr != null) {
                        while (i < strArr.length) {
                            if (!hashSet.remove(strArr[i])) {
                                sQLiteDatabase2.execSQL(strArr[i + 1]);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        lczVar.f.c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    }
                } catch (Throwable th3) {
                    cursorRawQuery.close();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                lczVar.c.b("Failed to verify columns on table that was just created", str);
                throw e4;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public static void s(lcz lczVar, SQLiteDatabase sQLiteDatabase) {
        if (lczVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        ksy ksyVar = kya.a;
        String path = sQLiteDatabase.getPath();
        int i = kyd.a;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            lczVar.f.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            lczVar.f.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            lczVar.f.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        lczVar.f.a("Failed to turn on database write permission for owner");
    }

    public static String t(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if (str == null) {
                if (str2 == null) {
                    return strArr2[i];
                }
            } else {
                if (str.equals(str2)) {
                    return strArr2[i];
                }
            }
        }
        return null;
    }

    public static String u(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final Boolean v(Resources resources, String str) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final String w(Resources resources, String str) {
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void x(fof fofVar, List list, ci ciVar, int i, boolean z) {
        int i2;
        int i3;
        Iterator it = list.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            fgy fgyVar = (fgy) it.next();
            i4++;
            if (z) {
                i2 = i4 % i;
                i3 = i4 / i;
            } else {
                i2 = i4 / i;
                i3 = i4 % i;
            }
            mmy mmyVar = new mmy(fofVar, new mmz());
            mmz mmzVar = mmyVar.a;
            mmzVar.b = fgyVar == null ? null : fgyVar.l();
            BitSet bitSet = mmyVar.d;
            bitSet.set(1);
            mmzVar.c = i2;
            bitSet.set(2);
            mmzVar.a = i3;
            bitSet.set(0);
            mmz mmzVarB = mmyVar.a();
            fov fovVar = new fov(fofVar, new fow());
            fovVar.b(mmzVarB);
            ciVar.F(fovVar);
        }
    }

    private static Object y(lpa lpaVar) throws ExecutionException {
        if (lpaVar.j()) {
            return lpaVar.f();
        }
        if (lpaVar.h()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lpaVar.e());
    }

    public final mcz a() {
        mcz mczVar = new mcz(mdc.b, Process.myTid(), true, -21, false, false);
        mdc.c = mczVar;
        return mczVar;
    }

    public mda() {
    }
}
