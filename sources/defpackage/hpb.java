package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hpb {
    public static final aigj a = alvt.a.toByteString();
    public final hpy b;
    public final hpd c;
    public final Executor d;
    private final Executor e;

    public hpb(hpy hpyVar, hpd hpdVar, Executor executor, Executor executor2) {
        this.b = hpyVar;
        this.c = hpdVar;
        this.d = executor;
        this.e = executor2;
    }

    public static int a(weh wehVar) {
        if (wehVar instanceof anjx) {
            anjx anjxVar = (anjx) wehVar;
            return (anjxVar.c.b & SemanticState.LiveRegion) != 0 ? anjxVar.getTrackCount().intValue() : anjxVar.e().size();
        }
        if (!(wehVar instanceof anuk)) {
            throw new IllegalArgumentException(String.format("List Entity key is not associated with a %s or %s", anjx.class.getSimpleName(), anuk.class.getSimpleName()));
        }
        anuk anukVar = (anuk) wehVar;
        return anukVar.l() ? anukVar.getTrackCount().intValue() : anukVar.j().size();
    }

    public static long b(weh wehVar) {
        if (wehVar instanceof anuc) {
            return ((anuc) wehVar).getAddedTimestampMillis().longValue();
        }
        if (wehVar instanceof anjq) {
            return ((anjq) wehVar).getAddedTimestampMillis().longValue();
        }
        return 0L;
    }

    public static agke c(weh wehVar) {
        List listJ;
        if (wehVar instanceof anjx) {
            listJ = ((anjx) wehVar).e();
        } else {
            if (!(wehVar instanceof anuk)) {
                throw new IllegalArgumentException(String.format("List Entity key is not associated with a %s or %s", anjx.class.getSimpleName(), anuk.class.getSimpleName()));
            }
            listJ = ((anuk) wehVar).j();
        }
        return (agke) Collection.EL.stream(listJ).map(new hnv(17)).collect(aghu.a);
    }

    public static agke d(List list) {
        return (agke) Collection.EL.stream(list).filter(new hod(4)).map(new hpa(1)).collect(aghu.a);
    }

    public static agke e(List list) {
        return (agke) Collection.EL.stream(list).filter(new hod(4)).map(new hnv(18)).collect(aghu.a);
    }

    public static ListenableFuture k(hpy hpyVar, String str, boolean z) {
        ListenableFuture listenableFutureA;
        ListenableFuture listenableFutureA2;
        if (z) {
            listenableFutureA = hpyVar.d(kro.am(str));
            listenableFutureA2 = hpyVar.d(kro.ay(str));
        } else {
            listenableFutureA = hpyVar.a(kro.am(str));
            listenableFutureA2 = hpyVar.a(kro.ay(str));
        }
        return ahno.ax(listenableFutureA, listenableFutureA2).k(new uf(listenableFutureA, listenableFutureA2, 13, null), MoreExecutors.directExecutor());
    }

    public static Optional q(weh wehVar) {
        if (wehVar instanceof anjq) {
            anjq anjqVar = (anjq) wehVar;
            return anjqVar.f() ? Optional.of(anjqVar.getSmartDownloadMetadata()) : Optional.empty();
        }
        if (!(wehVar instanceof anuc)) {
            return Optional.empty();
        }
        anuc anucVar = (anuc) wehVar;
        return anucVar.f() ? Optional.of(anucVar.getSmartDownloadMetadata()) : Optional.empty();
    }

    public static boolean r(annv annvVar, String str) {
        return (Objects.equals(str, "PPSV") && !annvVar.h().isEmpty()) || (Objects.equals(str, "PPSE") && !annvVar.f().isEmpty()) || annvVar.e().contains(kro.am(str)) || annvVar.g().contains(kro.ay(str));
    }

    public static boolean s(weh wehVar) {
        return (wehVar instanceof anuk) && (((anuk) wehVar).getPodcastShowAdditionalMetadata().b & 1) != 0;
    }

    public static boolean t(annv annvVar, String str) {
        return annvVar.i().contains(kro.am(str)) || annvVar.j().contains(kro.ay(str));
    }

    public final ListenableFuture f(List list) {
        return ahno.ar(this.b.b((List) Collection.EL.stream(list).map(new hnv(16)).collect(aghu.a)), new hoh(6), MoreExecutors.directExecutor());
    }

    public final ListenableFuture g(String str) {
        return ahno.as(this.b.a(str), new hba(this, 19), MoreExecutors.directExecutor());
    }

    public final ListenableFuture h(weh wehVar) {
        agke agkeVarC = c(wehVar);
        return agkeVarC.isEmpty() ? ahng.n(hte.a(Collections.nCopies(a(wehVar), Optional.empty()))) : ahno.ar(this.b.b(agkeVarC), new hoh(8), this.d);
    }

    public final ListenableFuture i(String str, boolean z) {
        return ahno.as(k(this.b, str, z), new hoy(this, z, 0), this.d);
    }

    public final ListenableFuture j(hpy hpyVar, String str) {
        ListenableFuture listenableFutureA = hpyVar.a(kro.an(str));
        ListenableFuture listenableFutureA2 = hpyVar.a(kro.az(str));
        return ahno.ax(listenableFutureA, listenableFutureA2).k(new uf(listenableFutureA, listenableFutureA2, 14, null), this.d);
    }

    public final ListenableFuture l(final weh wehVar, List list, String str, final boolean z, boolean z2) {
        ListenableFuture listenableFutureB;
        ListenableFuture listenableFutureB2;
        ListenableFuture listenableFutureA;
        List list2 = (List) Collection.EL.stream(list).map(new hpa(0)).collect(Collectors.toList());
        hpy hpyVar = this.b;
        if (z2) {
            listenableFutureB = hpyVar.c(list);
            listenableFutureB2 = this.b.c(list2);
            listenableFutureA = this.b.d(str);
        } else {
            listenableFutureB = hpyVar.b(list);
            listenableFutureB2 = this.b.b(list2);
            listenableFutureA = this.b.a(str);
        }
        final ListenableFuture listenableFuture = listenableFutureB;
        final ListenableFuture listenableFuture2 = listenableFutureA;
        final ListenableFuture listenableFuture3 = listenableFutureB2;
        return ahno.av(listenableFuture, listenableFuture3, listenableFuture2).k(new Callable() { // from class: hox
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aigj aigjVar = hpb.a;
                ListenableFuture listenableFuture4 = listenableFuture3;
                ListenableFuture listenableFuture5 = listenableFuture;
                ListenableFuture listenableFuture6 = listenableFuture2;
                weh wehVar2 = wehVar;
                if (z) {
                    anjx anjxVar = (anjx) wehVar2;
                    anjq anjqVar = (anjq) ((Optional) ahng.v(listenableFuture6)).orElse(null);
                    agke agkeVarD = hpb.d((List) ahng.v(listenableFuture5));
                    agke agkeVarE = hpb.e((List) ahng.v(listenableFuture4));
                    hcf hcfVarA = hcg.a();
                    hcfVarA.d(anjxVar);
                    hcfVarA.c(anjqVar);
                    hcfVarA.f(agkeVarD);
                    hcfVarA.e(agkeVarE);
                    hcfVarA.b(anjxVar.getAudioPlaylistId());
                    hcfVarA.b = anjxVar.getTitle();
                    hcfVarA.c = anjxVar.getThumbnailDetails();
                    return Optional.of(hcfVarA.a());
                }
                anuk anukVar = (anuk) wehVar2;
                anuc anucVar = (anuc) ((Optional) ahng.v(listenableFuture6)).orElse(null);
                agke agkeVarD2 = hpb.d((List) ahng.v(listenableFuture5));
                agke agkeVarE2 = hpb.e((List) ahng.v(listenableFuture4));
                hcf hcfVarA2 = hcg.a();
                hcfVarA2.d(anukVar);
                hcfVarA2.c(anucVar);
                hcfVarA2.f(agkeVarD2);
                hcfVarA2.e(agkeVarE2);
                hcfVarA2.b(anukVar.getPlaylistId());
                hcfVarA2.b = anukVar.getTitle();
                hcfVarA2.c = anukVar.getThumbnailDetails();
                return Optional.of(hcfVarA2.a());
            }
        }, this.d);
    }

    public final ListenableFuture m(List list, boolean z) {
        List list2 = (List) Collection.EL.stream(list).map(new hpi(this, z, 1)).collect(Collectors.toList());
        return ahno.au(list2).k(new ub(list2, 14), this.d);
    }

    public final ListenableFuture n(String str) {
        return ahno.as(this.b.a(str), new hba(this, 18), this.e);
    }

    public final ListenableFuture o(hpy hpyVar, String str) {
        return ahno.ar(hpyVar.a(kro.aq()), new hnd(str, 5), this.d);
    }

    public final ListenableFuture p(hpy hpyVar, String str) {
        return ahno.ar(hpyVar.a(kro.aq()), new hnd(str, 6), this.d);
    }
}
