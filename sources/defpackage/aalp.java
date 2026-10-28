package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aalp implements aalm {
    public final mbc a;
    public final Executor b;
    public final awmd c;
    public final wco d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final aany j;
    public final aauk k;
    public final abxv l;

    public aalp(mbc mbcVar, Executor executor, awmd awmdVar, wco wcoVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, abxv abxvVar, aany aanyVar, aauk aaukVar) {
        this.a = mbcVar;
        this.b = executor;
        this.c = awmdVar;
        this.d = wcoVar;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = optional5;
        this.l = abxvVar;
        this.j = aanyVar;
        this.k = aaukVar;
    }

    public static ListenableFuture b(wcn wcnVar, int i, Class cls) {
        return tzk.b(wcnVar.c(i, cls).u(new aalc(2)));
    }

    public static final void c(List list, agkj agkjVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aihf aihfVar = (aihf) it.next();
            aamt aamtVar = (aamt) agkjVar.get(((aoei) aihfVar.instance).c);
            if (aamtVar != null) {
                aals.c(aihfVar, aamtVar);
            }
        }
    }

    public static final agkz d(Set set) {
        return (agkz) Collection.EL.stream(set).map(new aakc(9)).collect(aghu.b);
    }

    @Override // defpackage.aalm
    public final /* synthetic */ aoec a() {
        byte[] bArr = null;
        try {
            aaqn aaqnVarB = ((aanb) this.c.io()).b();
            wcn wcnVarB = this.d.b(aaqnVarB.b());
            Optional optionalOfNullable = Optional.ofNullable(aaqnVarB.d());
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(agke.n(((aaew) optionalOfNullable.get()).l()));
            }
            agke agkeVar = agpi.a;
            agke agkeVar2 = (agke) optionalOfNullable.orElse(agkeVar);
            Optional optionalOfNullable2 = Optional.ofNullable(aaqnVarB.d());
            if (true == optionalOfNullable2.isPresent()) {
                optionalOfNullable2 = Optional.ofNullable(agke.n(((aaew) optionalOfNullable2.get()).j()));
            }
            agke agkeVar3 = (agke) optionalOfNullable2.orElse(agkeVar);
            aihf aihfVarCreateBuilder = aoec.a.createBuilder();
            Optional optionalOfNullable3 = Optional.ofNullable(aaqnVarB.c());
            if (true == optionalOfNullable3.isPresent()) {
                optionalOfNullable3 = Optional.ofNullable(((aadc) optionalOfNullable3.get()).i());
            }
            List list = (List) optionalOfNullable3.orElse(agkeVar);
            HashSet hashSet = new HashSet();
            Optional optional = this.e;
            optional.isPresent();
            ListenableFuture listenableFuture = (ListenableFuture) optional.orElse(ahng.n(agkeVar));
            aaat aaatVar = new aaat(agkeVar2, hashSet, 9, bArr);
            Executor executor = this.b;
            ListenableFuture listenableFutureAr = ahno.ar(ahno.as(ahno.as(ahno.ar(listenableFuture, aaatVar, executor), new qmw(this, wcnVarB, (AbstractCollection) agkeVar2, (Object) list, 7), executor), new aakn(this, wcnVarB, hashSet, 2), executor), new aagw(aihfVarCreateBuilder, 14), executor);
            int i = 4;
            return (aoec) mci.a(ahno.ar(ahno.as(ahno.as(ahno.as(listenableFutureAr, new aakn(this, aaqnVarB, agkeVar3, i), executor), new aajs(this, 3), executor), new aajs(this, i), executor), new aakt(5), executor));
        } catch (InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) aall.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/logging/OfflineClientStateProvider", "getOfflineClientState", ')', "OfflineClientStateProvider.java")).t("[Offline] Error getting offline client state!");
            return null;
        }
    }
}
