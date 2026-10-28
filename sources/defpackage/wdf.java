package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wdf implements wcn, wek, wfb {
    public final web c;
    public final Executor d;
    public final wfl e;
    public final zik g;
    private final boolean h;
    private final wcl i;
    private final wjr j;
    private final hhb k;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public volatile boolean f = false;

    public wdf(Executor executor, hhb hhbVar, hhb hhbVar2, awmd awmdVar, wfl wflVar, wcl wclVar, zik zikVar, zwa zwaVar, vxz vxzVar) {
        this.d = new ahfg(executor);
        this.k = hhbVar;
        this.e = wflVar;
        wjr wjrVar = new wjr(awmdVar, this);
        this.j = wjrVar;
        this.i = wclVar;
        ght ghtVar = ((ghs) hhbVar2.a).a;
        this.c = new web((wjr) ghtVar.jm.io(), ghtVar.jr, zwaVar, wjrVar, (vxz) ghtVar.aL.io());
        this.g = zikVar;
        this.h = vxzVar.l(51, 45721123L, false);
    }

    public static wcm t() {
        return wcm.a(new IllegalStateException("Store has been disposed."), -1, 1, 5);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agfr, java.lang.Object] */
    @Override // defpackage.wcn
    public final avmc a(String str) {
        return this.f ? avmc.q(t()) : tzk.c(((omj) this.c.f.io()).S(new iut(str, 5))).o(new vub(this, 13)).l();
    }

    @Override // defpackage.wcn
    public final avmc b(int i) {
        if (this.f) {
            return avmc.q(t());
        }
        awgn awgnVar = new awgn(new tzh(this.c.c(i, Function$CC.identity())));
        avnn avnnVar = atqp.o;
        return awgnVar.o(new vub(this, 13)).l();
    }

    @Override // defpackage.wcn
    public final avmc c(int i, Class cls) {
        return this.f ? avmc.q(t()) : tzk.c(this.c.c(i, new woi(cls, 1))).o(new vub(this, 13)).l();
    }

    @Override // defpackage.wek
    public final weh d(String str) {
        return (weh) g(str).E();
    }

    @Override // defpackage.wfb
    public final wfa f(aijp aijpVar) {
        wdb wdbVarE = e();
        wdbVarE.a = aijpVar;
        return wdbVarE;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [agfr, java.lang.Object] */
    @Override // defpackage.wek
    public final avlm g(final String str) {
        if (this.f) {
            return avlm.m(t());
        }
        boolean z = this.h;
        final web webVar = this.c;
        int i = 13;
        int i2 = 2;
        if (z) {
            avye avyeVar = new avye(new hkh(afxd.f(TextUtils.isEmpty(str) ? new aher(Optional.empty()) : ((omj) webVar.f.io()).Z(web.l(str, wea.b).p()).c(new ahdf() { // from class: wdr
                @Override // defpackage.ahdf
                public final Object a(ahud ahudVar, Object obj) {
                    return web.f((Cursor) obj, str, new wdx(webVar, 1));
                }
            }, MoreExecutors.directExecutor()).g()).g(new qmd(11), MoreExecutors.directExecutor()), i2));
            avnn avnnVar = atqp.n;
            avlm avlmVarJ = avyeVar.j(new vub(this, i));
            this.g.getClass();
            return avlmVarJ.i(new hwu(3)).f();
        }
        avye avyeVar2 = new avye(new hkh(afxd.f(webVar.d(str)).g(new vxq(2), MoreExecutors.directExecutor()), i2));
        avnn avnnVar2 = atqp.n;
        avlm avlmVarJ2 = avyeVar2.j(new vub(this, i));
        this.g.getClass();
        return avlmVarJ2.i(new hwu(3)).f();
    }

    @Override // defpackage.wek
    public final avlm h(String str) {
        return this.f ? avlm.m(t()) : tzk.c(this.c.d(str)).i(new uxe(17)).j(new vub(this, 13));
    }

    @Override // defpackage.wek
    public final avlr i(Class cls) {
        return w(cls).H();
    }

    @Override // defpackage.wek
    public final avlr j(String str, boolean z) {
        avlr avlrVarH = x(str).H();
        return z ? avlr.q(new vtq(this, str, avlrVarH, 5, (char[]) null)) : avlrVarH;
    }

    @Override // defpackage.wek
    public final avlr k(String str) {
        awbp awbpVar = new awbp(new iqb(this, str, x(str).K(new vup(19)), 9, null));
        avnn avnnVar = atqp.l;
        return awbpVar;
    }

    @Override // defpackage.wek
    public final avmc l() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agfr, java.lang.Object] */
    @Override // defpackage.wek
    public final avmc m(String str) {
        omr omrVar = new omr();
        omrVar.i("SELECT 1 FROM ");
        omrVar.i("entity_table");
        omrVar.i(" WHERE ");
        omrVar.i("key");
        omrVar.i(" = ?");
        omrVar.k(str);
        return tzk.c(((omj) this.c.f.io()).S(new iut(omrVar.p(), 4))).o(new vub(this, 13));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [agfr, java.lang.Object] */
    @Override // defpackage.wek
    public final avmc n(Collection collection) {
        ListenableFuture listenableFutureS;
        if (this.f) {
            return avmc.q(t());
        }
        web webVar = this.c;
        if (collection.isEmpty()) {
            listenableFutureS = ahng.n(agpr.a);
        } else {
            listenableFutureS = ((omj) webVar.f.io()).S(new wdu(webVar, (webVar.a ? webVar.k(collection, wea.b) : webVar.k(collection, wea.e)).p(), 0));
        }
        int i = 13;
        return tzk.c(listenableFutureS).o(new vub(this, i)).p(new vva(collection, i)).l();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [agfr, java.lang.Object] */
    @Override // defpackage.wek
    public final avmc o(Collection collection) {
        if (this.f) {
            return avmc.q(t());
        }
        web webVar = this.c;
        return tzk.c(collection.isEmpty() ? ahng.n(agpr.a) : ((omj) webVar.f.io()).S(new wdu(webVar, collection, 2))).u(new uxe(19)).o(new vub(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [agfr, java.lang.Object] */
    @Override // defpackage.wek
    public final avmc p(String str) {
        if (this.f) {
            return avmc.q(t());
        }
        boolean z = this.h;
        web webVar = this.c;
        int i = 13;
        if (z) {
            return tzk.c(TextUtils.isEmpty(str) ? ahng.n(Optional.empty()) : ((omj) webVar.f.io()).Z(web.l(str, wea.c).p()).c(new itx(str, 4), MoreExecutors.directExecutor()).g()).u(new uxe(18)).o(new vub(this, i));
        }
        return tzk.c(afxd.f(webVar.d(str)).g(new vxq(3), MoreExecutors.directExecutor())).o(new vub(this, i));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agfr, java.lang.Object] */
    @Override // defpackage.wcn
    public final avmc q(int i) {
        if (this.f) {
            return avmc.q(t());
        }
        web webVar = this.c;
        final omr omrVarP = webVar.j(i, wea.a).p();
        awgn awgnVar = new awgn(new tzh(((omj) webVar.f.io()).S(new qsx() { // from class: wds
            @Override // defpackage.qsx
            public final Object a(omr omrVar) {
                return (agke) web.m(omrVar, omrVarP, new wdv()).collect(aghu.a);
            }
        })));
        avnn avnnVar = atqp.o;
        return awgnVar.o(new vub(this, 13)).l();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agfr, java.lang.Object] */
    @Override // defpackage.wcn
    public final avmc r(int i) {
        if (this.f) {
            return avmc.q(t());
        }
        web webVar = this.c;
        omr omrVarJ = webVar.j(i, wea.a);
        omrVarJ.i(" EXCEPT SELECT child_entity_key FROM entity_associations");
        return tzk.c(((omj) webVar.f.io()).S(new iut(omrVarJ.p(), 6))).o(new vub(this, 13)).l();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agfr, java.lang.Object] */
    @Override // defpackage.wcn
    public final avmc s(final wjr wjrVar) {
        if (this.f) {
            return avmc.q(t());
        }
        final wdl wdlVar = (wdl) this.c.g.io();
        awgn awgnVar = new awgn(new tzh(wdlVar.d.S(new qsx() { // from class: wdh
            @Override // defpackage.qsx
            public final Object a(omr omrVar) {
                wdl wdlVar2 = wdlVar;
                wdlVar2.a(omrVar);
                agkz agkzVar = wdlVar2.a;
                wjr wjrVar2 = wjrVar;
                if (!agkzVar.contains(wjrVar2.a)) {
                    throw new IllegalArgumentException("QueryTable missing, did you forget to inject it?");
                }
                agjz agjzVar = new agjz(4);
                Cursor cursorN = omrVar.n((omr) wjrVar2.b);
                while (cursorN.moveToNext()) {
                    try {
                        agjzVar.h(cursorN.getString(0));
                    } catch (Throwable th) {
                        if (cursorN != null) {
                            try {
                                cursorN.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (cursorN != null) {
                    cursorN.close();
                }
                return agjzVar.g();
            }
        })));
        avnn avnnVar = atqp.o;
        return awgnVar.o(new vub(this, 13)).l();
    }

    @Override // defpackage.wek
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final wdb e() {
        hws hwsVar = new hws(this);
        hws hwsVar2 = new hws(this);
        xqy xqyVar = new xqy(this);
        ght ghtVar = ((ghs) this.k.a).a;
        mbc mbcVar = (mbc) ghtVar.l.io();
        Map mapCT = ghtVar.cT();
        wey weyVar = new wey();
        return new wdb(mbcVar, mapCT, weyVar, this.c, hwsVar, hwsVar2, xqyVar, this.j);
    }

    public final void v(Throwable th) {
        int i = agfv.a;
        Throwable cause = th;
        boolean z = false;
        while (true) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                if (!(th instanceof wcm)) {
                    wcl wclVar = this.i;
                    if (wclVar.a) {
                        aihf aihfVarCreateBuilder = akuy.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        akuy akuyVar = (akuy) aihfVarCreateBuilder.instance;
                        akuyVar.f = 0;
                        akuyVar.b |= 8;
                        aihfVarCreateBuilder.copyOnWrite();
                        akuy akuyVar2 = (akuy) aihfVarCreateBuilder.instance;
                        akuyVar2.c = 2;
                        akuyVar2.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        akuy akuyVar3 = (akuy) aihfVarCreateBuilder.instance;
                        akuyVar3.e = 0;
                        akuyVar3.b |= 4;
                        wclVar.a((akuy) aihfVarCreateBuilder.build());
                        return;
                    }
                    return;
                }
                wcm wcmVar = (wcm) th;
                wcl wclVar2 = this.i;
                if (wcmVar.b) {
                    return;
                }
                wcmVar.b = true;
                if (wclVar2.a) {
                    aihf aihfVarCreateBuilder2 = akuy.a.createBuilder();
                    int i2 = wcmVar.d;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akuy akuyVar4 = (akuy) aihfVarCreateBuilder2.instance;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    akuyVar4.f = i3;
                    akuyVar4.b |= 8;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akuy akuyVar5 = (akuy) aihfVarCreateBuilder2.instance;
                    akuyVar5.c = 2;
                    akuyVar5.b |= 1;
                    int i4 = wcmVar.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akuy akuyVar6 = (akuy) aihfVarCreateBuilder2.instance;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    akuyVar6.e = i5;
                    akuyVar6.b |= 4;
                    Throwable cause3 = wcmVar.getCause();
                    if (cause3 instanceof SQLiteAbortException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar7 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar7.g = 17;
                        akuyVar7.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar8 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar8.f = 3;
                        akuyVar8.b |= 8;
                    } else if (cause3 instanceof SQLiteAccessPermException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar9 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar9.g = 2;
                        akuyVar9.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar10 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar10.f = 3;
                        akuyVar10.b |= 8;
                    } else if (cause3 instanceof SQLiteBindOrColumnIndexOutOfRangeException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar11 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar11.g = 3;
                        akuyVar11.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar12 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar12.f = 3;
                        akuyVar12.b |= 8;
                    } else if (cause3 instanceof SQLiteBlobTooBigException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar13 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar13.g = 4;
                        akuyVar13.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar14 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar14.f = 3;
                        akuyVar14.b |= 8;
                    } else if (cause3 instanceof SQLiteCantOpenDatabaseException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar15 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar15.g = 5;
                        akuyVar15.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar16 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar16.f = 3;
                        akuyVar16.b |= 8;
                    } else if (cause3 instanceof SQLiteConstraintException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar17 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar17.g = 6;
                        akuyVar17.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar18 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar18.f = 3;
                        akuyVar18.b |= 8;
                    } else if (cause3 instanceof SQLiteDatabaseCorruptException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar19 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar19.g = 7;
                        akuyVar19.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar20 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar20.f = 3;
                        akuyVar20.b |= 8;
                    } else if (cause3 instanceof SQLiteDatabaseLockedException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar21 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar21.g = 8;
                        akuyVar21.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar22 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar22.f = 3;
                        akuyVar22.b |= 8;
                    } else if (cause3 instanceof SQLiteDatatypeMismatchException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar23 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar23.g = 9;
                        akuyVar23.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar24 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar24.f = 3;
                        akuyVar24.b |= 8;
                    } else if (cause3 instanceof SQLiteDiskIOException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar25 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar25.g = 10;
                        akuyVar25.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar26 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar26.f = 3;
                        akuyVar26.b |= 8;
                    } else if (cause3 instanceof SQLiteDoneException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar27 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar27.g = 11;
                        akuyVar27.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar28 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar28.f = 3;
                        akuyVar28.b |= 8;
                    } else if (cause3 instanceof SQLiteFullException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar29 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar29.g = 12;
                        akuyVar29.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar30 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar30.f = 3;
                        akuyVar30.b |= 8;
                    } else if (cause3 instanceof SQLiteMisuseException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar31 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar31.g = 13;
                        akuyVar31.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar32 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar32.f = 3;
                        akuyVar32.b |= 8;
                    } else if (cause3 instanceof SQLiteOutOfMemoryException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar33 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar33.g = 14;
                        akuyVar33.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar34 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar34.f = 3;
                        akuyVar34.b |= 8;
                    } else if (cause3 instanceof SQLiteReadOnlyDatabaseException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar35 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar35.g = 15;
                        akuyVar35.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar36 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar36.f = 3;
                        akuyVar36.b |= 8;
                    } else if (cause3 instanceof SQLiteTableLockedException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar37 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar37.g = 16;
                        akuyVar37.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar38 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar38.f = 3;
                        akuyVar38.b |= 8;
                    } else if (cause3 instanceof SQLiteException) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar39 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar39.g = 1;
                        akuyVar39.b |= 64;
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar40 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar40.f = 3;
                        akuyVar40.b |= 8;
                    }
                    int i6 = wcmVar.a;
                    if (i6 > 0) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        akuy akuyVar41 = (akuy) aihfVarCreateBuilder2.instance;
                        akuyVar41.b |= 2;
                        akuyVar41.d = i6;
                    }
                    wclVar2.a((akuy) aihfVarCreateBuilder2.build());
                    return;
                }
                return;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            th = cause2;
        }
    }

    public final wex w(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.b;
        wex wexVar = (wex) concurrentHashMap.get(cls);
        if (wexVar == null) {
            synchronized (concurrentHashMap) {
                wexVar = (wex) concurrentHashMap.get(cls);
                if (wexVar == null) {
                    wex wexVar2 = new wex(new wdd(this, cls, 0));
                    concurrentHashMap.put(cls, wexVar2);
                    wexVar = wexVar2;
                }
            }
        }
        return wexVar;
    }

    public final wex x(String str) {
        ConcurrentHashMap concurrentHashMap = this.a;
        wex wexVar = (wex) concurrentHashMap.get(str);
        if (wexVar == null) {
            synchronized (concurrentHashMap) {
                wexVar = (wex) concurrentHashMap.get(str);
                if (wexVar == null) {
                    wex wexVar2 = new wex(new wdd(this, str, 2));
                    concurrentHashMap.put(str, wexVar2);
                    wexVar = wexVar2;
                }
            }
        }
        return wexVar;
    }
}
