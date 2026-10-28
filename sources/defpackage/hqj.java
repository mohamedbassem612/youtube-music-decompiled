package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqj implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hqj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v65, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 18;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                return ((aaqm) obj).c((String) this.a);
            case 1:
                return ((hpd) this.a).h((agke) obj);
            case 2:
                return ((aaqt) obj).e((String) this.a);
            case 3:
                hsn hsnVar = (hsn) this.a;
                return ((wnh) hsnVar.u.c).b((wog) obj, hsnVar.r, null);
            case 4:
                return ((ayq) ((iqk) obj).a.io()).j(new iqh(((hsz) this.a).b.f().toEpochMilli(), i2));
            case 5:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                Object obj2 = this.a;
                int i5 = 12;
                List list2 = (List) Collection.EL.stream(list).map(new hqs(obj2, i5)).collect(Collectors.toCollection(new hcd(19)));
                return ahno.au(list2).k(new egz(obj2, list, list2, i5), ((jgc) obj2).k);
            case 6:
                return ((htm) aguu.aw(((htp) this.a).b, htm.class, (affd) obj)).f().a();
            case 7:
                List list3 = (List) obj;
                boolean zIsEmpty = list3.isEmpty();
                Object obj3 = this.a;
                if (zIsEmpty) {
                    return ((hur) obj3).e();
                }
                hur hurVar = (hur) obj3;
                ListenableFuture listenableFutureI = hurVar.i();
                ListenableFuture listenableFutureH = hurVar.h();
                hqj hqjVar = new hqj(obj3, 11);
                Executor executor = hurVar.f;
                ListenableFuture listenableFutureAs = ahno.as(listenableFutureH, hqjVar, executor);
                return ahno.ax(listenableFutureI, listenableFutureAs).k(new hlm(obj3, listenableFutureAs, listenableFutureI, list3, 5), executor);
            case 8:
                List list4 = (List) obj;
                boolean zIsEmpty2 = list4.isEmpty();
                Object obj4 = this.a;
                if (zIsEmpty2) {
                    return ((hur) obj4).e();
                }
                hur hurVar2 = (hur) obj4;
                ListenableFuture listenableFutureI2 = hurVar2.i();
                ListenableFuture listenableFutureH2 = hurVar2.h();
                hqj hqjVar2 = new hqj(obj4, 9);
                Executor executor2 = hurVar2.f;
                ListenableFuture listenableFutureAs2 = ahno.as(listenableFutureH2, hqjVar2, executor2);
                return ahno.ax(listenableFutureI2, listenableFutureAs2).k(new hlm(obj4, listenableFutureAs2, listenableFutureI2, list4, 4), executor2);
            case 9:
                return ((hur) this.a).f(((Boolean) obj).booleanValue());
            case 10:
                return ((hup) aguu.aw(((hur) this.a).d, hup.class, (affd) obj)).f().b();
            case 11:
                return ((hur) this.a).f(((Boolean) obj).booleanValue());
            case 12:
                return ((hpd) this.a).h((agke) obj);
            case 13:
                return ((iad) this.a).b.h((List) Collection.EL.stream((agke) obj).map(new iaa(i2)).collect(aghu.a));
            case 14:
                return this.a;
            case 15:
                int i6 = 16;
                List list5 = (List) Collection.EL.stream((List) Collection.EL.stream((List) obj).map(new iaa(15)).collect(Collectors.toCollection(new ieu(0)))).map(new hfw(((iev) this.a).c, i6)).collect(Collectors.toList());
                return ahno.au(list5).k(afwl.j(new ub(list5, i6)), MoreExecutors.directExecutor());
            case 16:
                return ((iqg) obj).a((String) this.a);
            case 17:
                return ((ird) aguu.aw(((ire) this.a).b, ird.class, (affd) obj)).N().ax();
            case 18:
                boolean zEquals = Objects.equals((Boolean) obj, Boolean.TRUE);
                Object obj5 = this.a;
                if (!zEquals) {
                    return ((isu) obj5).b();
                }
                isu isuVar = (isu) obj5;
                isuVar.f.am(isuVar.d, true);
                return ahno.ar(isuVar.e.h(aimp.SUCCESSFUL), new ist(i4), isuVar.b);
            case 19:
                Object obj6 = this.a;
                isu isuVar2 = (isu) obj6;
                return ahno.as(isuVar2.a.B(isuVar2.c), new hqj(obj6, i), isuVar2.b);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                if (!zBooleanValue) {
                    return ((isu) obj7).c();
                }
                isu isuVar3 = (isu) obj7;
                klc klcVar = isuVar3.e;
                return ahno.ar(((qrx) klcVar.b).a(new iqj(i), klcVar.c), new ist(i3), isuVar3.b);
        }
    }
}
