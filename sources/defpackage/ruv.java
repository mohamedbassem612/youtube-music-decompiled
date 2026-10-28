package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ruv implements rsq, sah {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = new CopyOnWriteArraySet();
    public final rmp e;
    private final rsr f;
    private String g;
    private boolean h;

    public ruv(rmp rmpVar, rsr rsrVar) {
        this.f = rsrVar;
        this.e = rmpVar;
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        b();
        Set set = this.c;
        String str = skoVar.a;
        set.add(str);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ryl) it.next()).d(str);
        }
    }

    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.e(this);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar != abob.a) {
            if (abobVar != abob.c || ahno.aa(str)) {
                return;
            }
            this.g = str;
            return;
        }
        String str3 = this.g;
        if (str3 != null) {
            if (!ahno.aa(str3)) {
                this.a.remove(str3);
                this.b.remove(str3);
                this.c.clear();
            }
            this.g = null;
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
