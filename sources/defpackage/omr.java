package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omr {
    public final Object a;
    public final Object b;

    public omr() {
        this.b = new StringBuilder();
        this.a = new ArrayList();
    }

    public static void f() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pny] */
    private final void r(ahyy ahyyVar, plx plxVar, int i, pku pkuVar) {
        pnz pnzVarB = ((pob) this.a).b(ahyyVar);
        pnzVarB.b(plxVar);
        poc pocVar = (poc) pnzVarB;
        pocVar.y = i;
        String simpleName = pkuVar.b().getClass().getSimpleName();
        simpleName.getClass();
        pocVar.p = simpleName;
        this.b.a(pnzVarB);
    }

    private static final int s(pku pkuVar) {
        Objects.checkIndex(0, 7);
        if ((pkuVar instanceof puf) || (pkuVar instanceof pue)) {
            return 2;
        }
        if ((pkuVar instanceof puk) || (pkuVar instanceof pug)) {
            return 4;
        }
        if (pkuVar instanceof pqs) {
            return 3;
        }
        if (pkuVar instanceof pta) {
            return ((pta) pkuVar).k() ? 6 : 5;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [awou, java.lang.Object] */
    public final Object a(Map map, pqr pqrVar, plv plvVar, awoq awoqVar) {
        return awro.p(this.a, new psr(map, pqrVar, this, plvVar, null), awoqVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pny] */
    public final void b(pky pkyVar, Set set) {
        pkyVar.getClass();
        int iD = a.D(pkyVar);
        if (iD != 0) {
            if (iD != 1) {
                throw new awmj();
            }
            pku pkuVar = (pku) pkyVar;
            int iS = s(pkuVar);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                r(ahyy.FAILED_TO_REGISTER, (plx) it.next(), iS, pkuVar);
            }
            return;
        }
        for (Map.Entry entry : ((Map) ((pla) pkyVar).a).entrySet()) {
            if (entry.getValue() instanceof pla) {
                plx plxVar = (plx) entry.getKey();
                ?? r0 = this.b;
                pnz pnzVarC = ((pob) this.a).c(ahzv.TARGET_REGISTERED);
                pnzVarC.b(plxVar);
                r0.a(pnzVarC);
            } else {
                Object value = entry.getValue();
                value.getClass();
                pku pkuVar2 = (pku) value;
                r(ahyy.FAILED_TO_REGISTER, (plx) entry.getKey(), s(pkuVar2), pkuVar2);
            }
        }
    }

    @SafeVarargs
    public final int c(String str, ContentValues contentValues, String str2, String... strArr) throws InterruptedException {
        f();
        afuu afuuVarF = afwt.f(46, "UPDATE WHERE ".concat(str2));
        try {
            int iUpdate = ((SQLiteDatabase) this.b).update(str, contentValues, str2, strArr);
            afuuVarF.close();
            return iUpdate;
        } catch (Throwable th) {
            try {
                afuuVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long d(String str, ContentValues contentValues, int i) {
        f();
        afuu afuuVarD = afwt.d(42, "INSERT WITH ON CONFLICT ".concat(str), afux.a, true);
        try {
            long jInsertWithOnConflict = ((SQLiteDatabase) this.b).insertWithOnConflict(str, null, contentValues, i);
            afuuVarD.close();
            return jInsertWithOnConflict;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SafeVarargs
    public final Cursor e(String str, String... strArr) throws InterruptedException {
        f();
        afuu afuuVarD = afwt.d(44, "Query: ".concat(str), afux.a, true);
        try {
            Cursor cursorRawQuery = ((SQLiteDatabase) this.b).rawQuery(str, strArr, (CancellationSignal) this.a);
            afuuVarD.close();
            return cursorRawQuery;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SafeVarargs
    public final void g(String str, String... strArr) {
        f();
        afuu afuuVarD = afwt.d(41, "execSQL: ".concat(str), afux.a, true);
        try {
            ((SQLiteDatabase) this.b).execSQL(str, strArr);
            afuuVarD.close();
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(String str) throws InterruptedException {
        f();
        afuu afuuVarF = afwt.f(45, "execSQL: ".concat(str));
        try {
            ((SQLiteDatabase) this.b).execSQL(str);
            afuuVarF.close();
        } catch (Throwable th) {
            try {
                afuuVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(String str) {
        ((StringBuilder) this.b).append(str);
    }

    public final void j(Long l) {
        ((ArrayList) this.a).add(l);
    }

    public final void k(String str) {
        ((ArrayList) this.a).add(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final String l() {
        ?? r0 = this.a;
        int size = r0.size();
        if (size == 0) {
            return ((Context) this.b).getPackageName();
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String strA = ((qnm) aguu.C(((agpl) r0).iterator())).a();
        ahno.K(strA.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA);
        return String.valueOf(((Context) this.b).getPackageName()).concat(String.valueOf(strA));
    }

    public final boolean m() {
        if (!qnl.m()) {
            return false;
        }
        String strL = qnl.l((Context) this.b);
        if (strL == null) {
            return true;
        }
        return strL.equals(l());
    }

    public final Cursor n(omr omrVar) {
        f();
        Object obj = omrVar.b;
        afuu afuuVarD = afwt.d(43, "Query: ".concat((String) obj), afux.a, true);
        try {
            Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) this.b).rawQueryWithFactory(new qsw((Object[]) omrVar.a), (String) obj, null, null, (CancellationSignal) this.a);
            afuuVarD.close();
            return cursorRawQueryWithFactory;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void o(omr omrVar) {
        f();
        Object obj = omrVar.b;
        afuu afuuVarD = afwt.d(40, "execSQL: ".concat((String) obj), afux.a, true);
        try {
            ((SQLiteDatabase) this.b).execSQL((String) obj, (Object[]) omrVar.a);
            afuuVarD.close();
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final omr p() {
        String string = ((StringBuilder) this.b).toString();
        ArrayList arrayList = (ArrayList) this.a;
        return new omr(string, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final int q(xsc xscVar) throws InterruptedException {
        f();
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        Object obj = xscVar.c;
        sb.append((String) obj);
        sb.append(" WHERE ");
        Object obj2 = xscVar.b;
        sb.append((String) obj2);
        afuu afuuVarF = afwt.f(38, sb.toString());
        try {
            String str = (String) obj;
            int iDelete = ((SQLiteDatabase) this.b).delete(str, (String) obj2, (String[]) xscVar.a);
            afuuVarF.close();
            return iDelete;
        } catch (Throwable th) {
            try {
                afuuVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public omr(String str, Object[] objArr) {
        this.b = str;
        this.a = objArr;
    }

    public omr(ahex ahexVar, rrq rrqVar) {
        this.a = ahexVar;
        this.b = rrqVar;
    }

    public omr(pls plsVar, pun punVar) {
        plsVar.getClass();
        punVar.getClass();
        this.b = plsVar;
        this.a = punVar;
    }

    public omr(pny pnyVar, pob pobVar) {
        pnyVar.getClass();
        pobVar.getClass();
        this.b = pnyVar;
        this.a = pobVar;
    }

    public omr(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.a = new CancellationSignal();
    }

    public omr(oml omlVar, awou awouVar) {
        awouVar.getClass();
        this.b = omlVar;
        this.a = awouVar;
    }

    public omr(Context context, Map map) {
        this.b = context;
        this.a = ((agpn) map).keySet();
    }
}
