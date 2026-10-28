package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hql implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hql(gqh gqhVar, woo wooVar, Optional optional, gnl gnlVar, int i) {
        this.$cid = i;
        this.b = gqhVar;
        this.c = wooVar;
        this.d = optional;
        this.a = gnlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, nxl] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$cid;
        int i2 = 8;
        int i3 = 4;
        int i4 = 1;
        if (i == 0) {
            ?? r0 = this.b;
            ahno.R(r0.isDone(), "Future was expected to be done: %s", r0);
            List list = (List) a.i(r0);
            ?? r4 = this.c;
            ahno.R(r4.isDone(), "Future was expected to be done: %s", r4);
            Collection collection = (Collection) a.i(r4);
            ?? r6 = this.d;
            ahno.R(r6.isDone(), "Future was expected to be done: %s", r6);
            Map map = (Map) a.i(r6);
            List list2 = (List) j$.util.Collection.EL.stream(list).map(new hds(14)).collect(Collectors.toCollection(new idl(i4)));
            Collection collection2 = (Collection) j$.util.Collection.EL.stream(collection).map(new hds(15)).collect(Collectors.toCollection(new idl(i4)));
            Map map2 = (Map) j$.util.Collection.EL.stream(collection).filter(new gqn(i3)).collect(aghu.a(new hds(i2), new hds(9)));
            Map map3 = (Map) j$.util.Collection.EL.stream(collection).collect(aghu.a(new hds(10), new hds(11)));
            jnm jnmVar = (jnm) ((jan) this.a).a;
            return Optional.of(jnmVar.k(list2, collection2, map2, map, map3).I(jnmVar.d.e(jnmVar.b.e())));
        }
        if (i == 1) {
            return ((gqh) this.b).h((woo) this.c, (Optional) this.d, ((gnl) this.a).b);
        }
        if (i == 2) {
            ?? r1 = this.c;
            Object obj = this.a;
            Object obj2 = this.d;
            int i5 = msf.a;
            String str = (String) obj2;
            Typeface typefaceA = r1.a((Context) obj, str);
            if (typefaceA == null) {
                typefaceA = rpi.r(str);
            }
            return afxw.n((Resources) this.b, typefaceA);
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        int i6 = atomicInteger.get();
        Object obj3 = this.a;
        if (i6 > 0) {
            ((ong) ((omn) obj3).a).l(4, atomicInteger.get());
        }
        ?? r2 = this.b;
        omn omnVar = (omn) obj3;
        Uri uriBa = qnl.ba((Context) omnVar.g, (agev) omnVar.e);
        Iterator it = r2.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            try {
                ((ayq) ((omn) obj3).k).aa((Uri) it.next());
                i7++;
                ((ong) ((omn) obj3).a).j(1086);
            } catch (IOException e) {
                ((ong) omnVar.a).j(1076);
                onb.g(e, "%s: Failed to release unaccounted file!", "ExpirationHandler");
            }
        }
        ?? r11 = this.c;
        int i8 = onb.a;
        int iK = omnVar.k(uriBa, r11);
        if (iK > 0) {
            ((ong) omnVar.a).l(5, iK);
        }
        if (i7 <= 0) {
            return null;
        }
        ((ong) omnVar.a).l(8, i7);
        return null;
    }

    public /* synthetic */ hql(jan janVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, int i) {
        this.$cid = i;
        this.a = janVar;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.d = listenableFuture3;
    }

    public /* synthetic */ hql(nxl nxlVar, Context context, String str, Resources resources, int i) {
        this.$cid = i;
        this.c = nxlVar;
        this.a = context;
        this.d = str;
        this.b = resources;
    }

    public /* synthetic */ hql(omn omnVar, AtomicInteger atomicInteger, List list, List list2, int i) {
        this.$cid = i;
        this.a = omnVar;
        this.d = atomicInteger;
        this.b = list;
        this.c = list2;
    }
}
