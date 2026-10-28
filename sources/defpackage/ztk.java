package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.cardboard.sdk.R;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ztk {
    public final Queue a = new ConcurrentLinkedQueue();
    public final tag b;
    public final vxz c;
    private final awmd d;
    private final mbc e;
    private final ztj f;
    private volatile Future g;
    private final boolean h;
    private long i;
    private volatile boolean j;
    private final vxz k;

    public ztk(awmd awmdVar, mbc mbcVar, ztj ztjVar, tag tagVar, vxz vxzVar, vxz vxzVar2, tqj tqjVar) {
        this.d = awmdVar;
        this.e = mbcVar;
        this.f = ztjVar;
        this.b = tagVar;
        this.k = vxzVar;
        this.c = vxzVar2;
        int i = tqr.a;
        this.h = tqjVar.k(1073814161);
    }

    public static void l(aihf aihfVar) {
        String string = UUID.randomUUID().toString();
        aihfVar.copyOnWrite();
        jrc jrcVar = (jrc) aihfVar.instance;
        jrc jrcVar2 = jrc.a;
        string.getClass();
        jrcVar.b |= 1;
        jrcVar.c = string;
    }

    private final List o(int i, Function function) {
        aihf aihfVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if ((i != -1 && i2 >= i) || (aihfVar = (aihf) this.a.poll()) == null) {
                break;
            }
            if (!r(aihfVar)) {
                arrayList.add(function.apply(aihfVar));
                i2++;
            }
        }
        return arrayList;
    }

    private final synchronized void p(Set set) {
        if (this.j) {
            return;
        }
        if (this.c.l(88, 45460738L, false)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jrc jrcVar = (jrc) ((aihf) it.next()).instance;
                if ((jrcVar.b & 1) != 0) {
                    arrayList.add(jrcVar.c);
                }
            }
            this.f.k(arrayList);
            return;
        }
        taq.c();
        ztj ztjVar = this.f;
        ztjVar.c(true);
        try {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                jrc jrcVar2 = (jrc) ((aihf) it2.next()).instance;
                if ((jrcVar2.b & 1) != 0) {
                    ztjVar.j(jrcVar2.c);
                }
            }
            ztjVar.f(true);
            ztjVar.d(true);
        } catch (Throwable th) {
            this.f.d(true);
            throw th;
        }
    }

    private final void q(aihf aihfVar) {
        l(aihfVar);
        m(aihfVar);
    }

    private final boolean r(aihf aihfVar) {
        int i = ((zrs) this.d.io()).c().h;
        if (i > 0) {
            return (this.k.l(25, 45380409L, false) ? ((jrc) aihfVar.build()).getSerializedSize() : ((jrc) aihfVar.build()).toByteArray().length) > i;
        }
        return false;
    }

    public final synchronized tbf a() {
        tbf tbfVarL;
        taq.c();
        if (this.j) {
            tbfVarL = new tbe();
        } else {
            d();
            tbfVarL = this.f.l(0);
        }
        return tbfVarL;
    }

    public final synchronized List b(int i) {
        ArrayList arrayList;
        int size;
        int iMax;
        tbf tbfVarL;
        taq.c();
        arrayList = new ArrayList();
        if (!this.j) {
            boolean zL = this.c.l(R.styleable.AppCompatTheme_windowMinWidthMinor, 45622669L, false);
            if (i <= 0) {
                size = -1;
                iMax = -1;
            } else if (zL) {
                iMax = i;
                size = 0;
            } else {
                size = this.a.size();
                iMax = Math.max(0, i - size);
            }
            if (iMax == -1 || iMax > 0) {
                try {
                    ztj ztjVar = this.f;
                    if (iMax <= 0) {
                        iMax = 0;
                    }
                    tbfVarL = ztjVar.l(iMax);
                    try {
                        aguu.F(arrayList, tbfVarL);
                        tbfVarL.a();
                    } catch (Throwable th) {
                        th = th;
                        if (tbfVarL != null) {
                            tbfVarL.a();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    tbfVarL = null;
                }
            }
            if (zL && size != -1) {
                size = Math.max(0, i - arrayList.size());
            }
            if (size == -1 || size > 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(o(size, new yom(14)));
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final synchronized void c() {
        if (this.j) {
            return;
        }
        this.j = true;
        tbc tbcVar = this.f.b;
        tbcVar.getWritableDatabase().close();
        if (!(tbcVar instanceof taw)) {
            throw new UnsupportedOperationException("dbProvider is not a BaseSQLiteOpenHelper.");
        }
        SQLiteDatabase.deleteDatabase(((taw) tbcVar).b());
    }

    public final synchronized void d() {
        List<tld> listO;
        taq.c();
        if (!this.j) {
            this.i++;
            Queue queue = this.a;
            if (!queue.isEmpty()) {
                vxz vxzVar = this.c;
                if (vxzVar.l(90, 45461032L, false)) {
                    listO = o(-1, new woi(this, 10));
                } else {
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        aihf aihfVar = (aihf) queue.poll();
                        if (aihfVar == null) {
                            break;
                        }
                        if (!r(aihfVar)) {
                            if (vxzVar.l(115, 45617948L, false) && (((jrc) aihfVar.instance).b & 1) == 0) {
                                l(aihfVar);
                            }
                            arrayList.add(new tld(((jrc) aihfVar.instance).c, aihfVar));
                        }
                    }
                    listO = arrayList;
                }
                try {
                    ztj ztjVar = this.f;
                    taq.c();
                    ztjVar.c(true);
                    try {
                        taq.c();
                        String str = (String) Collection.EL.stream(listO).map(new snm(4)).collect(Collectors.joining("','"));
                        Cursor cursorRawQuery = ztjVar.b.getReadableDatabase().rawQuery("SELECT key FROM " + ztjVar.c + " WHERE key IN ('" + str + "')", null);
                        agkx agkxVar = new agkx();
                        int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("key");
                        while (cursorRawQuery.moveToNext()) {
                            String string = cursorRawQuery.getString(columnIndexOrThrow);
                            string.getClass();
                            agkxVar.c(string);
                        }
                        cursorRawQuery.close();
                        agkz agkzVarG = agkxVar.g();
                        for (tld tldVar : listO) {
                            ContentValues contentValuesN = ztjVar.n(tldVar);
                            Object obj = tldVar.a;
                            if (agkzVarG.contains(obj)) {
                                ztjVar.h((String) obj, contentValuesN);
                            } else {
                                ztjVar.e(contentValuesN);
                            }
                        }
                        ztjVar.f(true);
                        ztjVar.d(true);
                    } catch (Throwable th) {
                        ztjVar.d(true);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    f("Failed storing multiple delayed events when flushing buffer to disk.", e);
                }
            }
            if (this.g != null) {
                this.g.cancel(false);
            }
        }
    }

    final synchronized void e() {
        if (!this.j) {
            awmd awmdVar = this.d;
            if (!((zrs) awmdVar.io()).b().c) {
                d();
            } else if (this.g == null || this.g.isDone()) {
                this.g = this.b.a(tai.a, new ztg(this, 2), ((zrs) awmdVar.io()).b().e, TimeUnit.SECONDS);
            }
        }
    }

    public final void f(String str, Exception exc) {
        twu.d("GEL_DELAYED_EVENT_DEBUG", 6, str, exc);
        awmd awmdVar = this.d;
        if (((zrs) awmdVar.io()).k()) {
            zvp.f(zvn.a, zvm.m, "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(str), exc, ((zrs) awmdVar.io()).a());
        }
    }

    public final synchronized void g(Set set) {
        try {
            p(set);
        } catch (RuntimeException e) {
            if (!this.h) {
                throw e;
            }
            f("Failed to delete DelayedEvents from disk.", e);
        }
    }

    public final synchronized void h() {
        if (this.j) {
            return;
        }
        try {
            ztj ztjVar = this.f;
            taq.c();
            ztjVar.b.getWritableDatabase().execSQL("delete from ".concat(ztjVar.c));
        } catch (RuntimeException e) {
            if (!this.h) {
                throw e;
            }
            f("Failed to delete all DelayedEvents from disk.", e);
        }
    }

    public final synchronized void i(List list) {
        taq.c();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q((aihf) it.next());
        }
        this.a.addAll(list);
        e();
    }

    public final synchronized boolean j() {
        if (!this.j) {
            ztj ztjVar = this.f;
            taq.c();
            if (DatabaseUtils.queryNumEntries(ztjVar.b.getReadableDatabase(), ztjVar.c) != 0) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void k(aihf aihfVar) {
        taq.c();
        q(aihfVar);
        try {
            this.a.add(aihfVar);
        } catch (RuntimeException e) {
            f("Could not add DelayedEvent of type" + ((jrc) aihfVar.instance).d + " to bufferQueue.", e);
        }
        e();
    }

    public final void m(aihf aihfVar) {
        if ((((jrc) aihfVar.instance).b & 8) == 0) {
            long epochMilli = this.e.f().toEpochMilli();
            aihfVar.copyOnWrite();
            jrc jrcVar = (jrc) aihfVar.instance;
            jrcVar.b |= 8;
            jrcVar.f = epochMilli;
        }
    }

    public final synchronized void n(aihf aihfVar) {
        if (this.j || r(aihfVar)) {
            return;
        }
        q(aihfVar);
        try {
            this.f.o(new tld(((jrc) aihfVar.instance).c, aihfVar), false);
        } catch (RuntimeException e) {
            f("Failed to save DelayedEvent to disk with type: ".concat(String.valueOf(((jrc) aihfVar.instance).d)), e);
        }
    }
}
