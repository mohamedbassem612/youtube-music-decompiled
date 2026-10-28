package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zxc implements zxs {
    protected final tbb a;
    public final Executor b;
    public final mbc c;
    private final zrw e;
    private final tgg f;
    private final zwb g;
    private final Set h;
    private final vxz i;
    private final vxz j;
    private final vxz k;

    public zxc(tbb tbbVar, Executor executor, zrw zrwVar, mbc mbcVar, tgg tggVar, zwb zwbVar, Set set, vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        tbbVar.getClass();
        this.a = tbbVar;
        executor.getClass();
        this.b = executor;
        zrwVar.getClass();
        this.e = zrwVar;
        mbcVar.getClass();
        this.c = mbcVar;
        tggVar.getClass();
        this.f = tggVar;
        zwbVar.getClass();
        this.g = zwbVar;
        set.getClass();
        this.h = set;
        this.i = vxzVar;
        this.j = vxzVar2;
        this.k = vxzVar3;
    }

    @Override // defpackage.zxs
    public final synchronized void a(Optional optional) {
        int size;
        taq.c();
        mbc mbcVar = this.c;
        long epochMilli = mbcVar.f().toEpochMilli();
        boolean zIsPresent = optional.isPresent();
        zrw zrwVar = this.e;
        int iA = zIsPresent ? zrwVar.a() - 1 : zrwVar.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        tbb tbbVar = this.a;
        tbf tbfVarM = tbbVar.m();
        while (tbfVarM.hasNext()) {
            jrh jrhVar = (jrh) tbfVarM.next();
            if (jrhVar.k <= epochMilli || (jrhVar.l > 0 && jrhVar.n + jrhVar.o <= epochMilli)) {
                arrayList2.add(jrhVar.c);
            } else {
                arrayList.add(jrhVar.toBuilder());
            }
        }
        tbfVarM.a();
        int size2 = arrayList.size();
        zrw zrwVar2 = this.e;
        int i = 0;
        if (size2 > zrwVar2.c()) {
            size = arrayList.size() - zrwVar2.c();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((jrh) ((aihf) arrayList.get(i2)).instance).c);
            }
        } else {
            size = 0;
        }
        ArrayList<aihf> arrayList3 = new ArrayList();
        for (int i3 = 0; size < arrayList.size() && i3 < iA; i3++) {
            arrayList2.add(((jrh) ((aihf) arrayList.get(size)).instance).c);
            arrayList3.add((aihf) arrayList.get(size));
            size++;
        }
        if (!arrayList2.isEmpty()) {
            if (this.i.l(88, 45460738L, false)) {
                tbbVar.k(arrayList2);
            } else {
                tbbVar.c(true);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    tbbVar.j((String) it.next());
                }
                tbbVar.f(true);
                tbbVar.d(true);
            }
        }
        if (optional.isPresent()) {
            arrayList3.add(((zxf) optional.get()).T());
        }
        for (aihf aihfVar : arrayList3) {
            jrh jrhVar2 = (jrh) aihfVar.instance;
            int i4 = jrhVar2.l;
            if (i4 > 0) {
                if (i4 <= jrhVar2.p.size()) {
                    jrh jrhVar3 = (jrh) aihfVar.instance;
                    if (epochMilli >= jrhVar3.m + jrhVar3.p.a(i4 - 1)) {
                    }
                }
                f(aihfVar);
            }
            zzc zzcVar = new zzc(new zzb(1), new zxb(this, aihfVar, i));
            if (((jrh) aihfVar.instance).n == 0) {
                aihfVar.copyOnWrite();
                jrh jrhVar4 = (jrh) aihfVar.instance;
                jrhVar4.b |= SemanticState.ReadOnly;
                jrhVar4.n = epochMilli;
            }
            if ((((jrh) aihfVar.instance).b & 8) != 0) {
                zxe zxeVar = new zxe((jrh) aihfVar.build(), zzcVar, mbcVar, zrwVar2, this.g, this.h, this.k);
                if (this.j.m(14, 45627566L)) {
                    zxeVar.B(tok.DELAYED_PING_VOLLEY_REQUEST);
                }
                this.f.b(zxeVar);
            } else {
                zzcVar.jj(new zxa("malformed request proto"));
            }
        }
    }

    @Override // defpackage.zxs
    public final /* synthetic */ void b() {
        yno.ab(this);
    }

    public final synchronized void c(jrh jrhVar) {
        tbb tbbVar = this.a;
        tbbVar.c(true);
        try {
            tbbVar.g(jrhVar.c, jrhVar);
            tbbVar.f(true);
            this.a.d(true);
        } catch (Throwable th) {
            this.a.d(true);
            throw th;
        }
    }

    @Override // defpackage.zxs
    public final boolean d() {
        return !this.a.m().hasNext();
    }

    @Override // defpackage.zxs
    public final synchronized void e(zxf zxfVar) {
        taq.c();
        jrh jrhVarS = zxfVar.S();
        this.a.g(jrhVarS.c, jrhVarS);
    }

    public final void f(aihf aihfVar) {
        this.b.execute(afwl.i(new zgc(this, aihfVar, 12)));
    }
}
