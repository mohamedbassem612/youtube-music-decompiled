package defpackage;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.protobuf.MessageLite;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class olh implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ olh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r12v31, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r13v69, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabaseF;
        String str = "";
        switch (this.$cid) {
            case 0:
                boolean z = olp.a;
                this.a.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                break;
            case 1:
                this.a.addAll((List) obj);
                break;
            case 2:
                return aguu.u((List) obj, new hys(15));
            case 3:
                int i = oni.e;
                return (List) ((AtomicReference) this.a).get();
            case 4:
                oiy oiyVar = (oiy) obj;
                oja ojaVar = oiyVar.f;
                if (ojaVar == null) {
                    ojaVar = oja.a;
                }
                if ((ojaVar.b & 1) != 0) {
                    return oiyVar;
                }
                oni oniVar = (oni) this.a;
                long jNextLong = oniVar.b.nextLong();
                aihf builder = oiyVar.toBuilder();
                oja ojaVar2 = oiyVar.f;
                if (ojaVar2 == null) {
                    ojaVar2 = oja.a;
                }
                aihf builder2 = ojaVar2.toBuilder();
                builder2.copyOnWrite();
                oja ojaVar3 = (oja) builder2.instance;
                ojaVar3.b |= 1;
                ojaVar3.c = jNextLong;
                long jF = oniVar.d.f();
                aijp aijpVarC = aikz.c(jF / 1000, (int) ((jF % 1000) * 1000000));
                builder2.copyOnWrite();
                oja ojaVar4 = (oja) builder2.instance;
                aijpVarC.getClass();
                ojaVar4.d = aijpVarC;
                ojaVar4.b |= 2;
                builder.copyOnWrite();
                oiy oiyVar2 = (oiy) builder.instance;
                oja ojaVar5 = (oja) builder2.build();
                ojaVar5.getClass();
                oiyVar2.f = ojaVar5;
                oiyVar2.b |= 4;
                return (oiy) builder.build();
            case 5:
                int i2 = oni.e;
                return (agev) ((AtomicReference) this.a).get();
            case 6:
                oiy oiyVar3 = (oiy) obj;
                int i3 = oni.e;
                ((AtomicReference) this.a).set(oiyVar3.d);
                aihf builder3 = oiyVar3.toBuilder();
                builder3.copyOnWrite();
                ((oiy) builder3.instance).d = oiy.emptyProtobufList();
                return (oiy) builder3.build();
            case 7:
                String str2 = (String) obj;
                return axfd.S("", str2, (byte[]) ((axfd) this.a).a.get(str2));
            case 8:
                return this.a;
            case 9:
                ?? r12 = this.a;
                qso qsoVar = (qso) r12;
                Context context = qsoVar.b;
                File databasePath = context.getDatabasePath((String) obj);
                if (!qsoVar.l) {
                    omj omjVar = qsoVar.p;
                    String path = databasePath.getPath();
                    if (!omjVar.a.add(path)) {
                        throw new IllegalStateException(a.bT(path, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                    }
                    qsoVar.l = true;
                    boolean zG = qso.g(context, qsoVar.n);
                    qsoVar.m = zG;
                    if (zG) {
                        try {
                            File cacheDir = context.getCacheDir();
                            if (cacheDir != null) {
                                ((qso) r12).m = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                            }
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                Set set = qsoVar.g;
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it.next()).get();
                        if (sQLiteDatabase == null) {
                            it.remove();
                        } else if (sQLiteDatabase.isOpen()) {
                            throw new IllegalStateException("Open database reference to " + sQLiteDatabase.getPath() + " already exists. Follow instructions in source to file a bug against TikTok.");
                        }
                    }
                }
                try {
                    try {
                        sQLiteDatabaseF = qso.f(((qso) r12).b, databasePath, ((qso) r12).n, ((qso) r12).d, ((qso) r12).e, ((qso) r12).f);
                        break;
                    } catch (qsk | qsm | qsn unused2) {
                        sQLiteDatabaseF = qso.f(((qso) r12).b, databasePath, ((qso) r12).n, ((qso) r12).d, ((qso) r12).e, ((qso) r12).f);
                        break;
                    }
                    qsoVar.g.add(new WeakReference(sQLiteDatabaseF));
                    qsoVar.b.registerComponentCallbacks(r12);
                    return sQLiteDatabaseF;
                } catch (qsm e) {
                    ((agrc) ((agrc) ((agrc) qso.a.b()).j(e)).k("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", (char) 447, "AsyncSQLiteOpenHelper.java")).t("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                    try {
                        qso.e(databasePath);
                        throw new qsk("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e);
                    } catch (Throwable th) {
                        throw new qsk("Recovery by deletion failed.", th);
                    }
                } catch (qsn e2) {
                    throw new qsk("Probably-recoverable database upgrade failure.", e2);
                }
            case 10:
                String strD = rmp.d(this.a);
                for (afhn afhnVar : (List) obj) {
                    if (strD.equals(afhnVar.b.c)) {
                        return afhnVar.a;
                    }
                }
                throw new rqv("UserId didn't map to Account: ".concat(strD));
            case 11:
                afhq afhqVar = ((afhn) obj).b;
                String str3 = afhqVar.f;
                if (!str3.equals("pseudonymous")) {
                    if (!str3.equals("youtube-delegated") && !str3.equals("youtube-direct") && !str3.equals("youtube-incognito")) {
                        throw new IllegalArgumentException();
                    }
                    str = afhqVar.c;
                }
                return ((rqx) this.a).a.y(str);
            case 12:
                return this.a;
            case 13:
                afhq afhqVar2 = ((afhn) obj).b;
                ?? r13 = this.a;
                if (rmp.d(r13).equals(afhqVar2.c) && rmp.c(r13).equals(afhqVar2.f)) {
                    return afhm.a();
                }
                throw new afga(new rra());
            case 14:
                return Long.valueOf(Math.min(((sek) this.a).d, ((atoq) obj).c));
            case 15:
                ((sym) this.a).c.ap();
                return obj;
            case 16:
                ((dov) ((syn) this.a).c).ap();
                return obj;
            case 17:
                tja tjaVar = (tja) this.a;
                Void r14 = (Void) obj;
                tjaVar.b.x();
                tjaVar.a();
                return r14;
            case 18:
                ((tpm) this.a).a.kk((MessageLite) obj);
                break;
            case 19:
                ((tpn) this.a).a.kk((MessageLite) obj);
                break;
            default:
                Object objP = tym.P((Application) obj);
                Class cls = (Class) this.a;
                return agev.h(cls.isInstance(objP) ? cls.cast(objP) : null);
        }
        return null;
    }
}
