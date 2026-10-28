package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hsx implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hsx(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.Object, qrc] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ola] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 4;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                int i3 = this.a;
                return ((ayq) ((iqk) obj).a.io()).j(new iqh(i3 > 0 ? ((hsz) this.b).b.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(i3) : 0L, i));
            case 1:
                kyr kyrVar = (kyr) obj;
                if (this.a == 1) {
                    return aher.a;
                }
                return ((qrx) kyrVar.b).a(new gmv(this.b, 6), kyrVar.a);
            case 2:
                final List list = (List) obj;
                final int iSum = Collection.EL.stream(list).mapToInt(new ddc(3)).sum();
                boolean zAnyMatch = Collection.EL.stream(list).anyMatch(new hud(20));
                final int i4 = this.a;
                final Object obj2 = this.b;
                if (zAnyMatch) {
                    ((hfn) ((iuf) obj2).f.io()).al(i4, false, list.size(), iSum);
                    return ahng.n(Boolean.FALSE);
                }
                iuf iufVar = (iuf) obj2;
                ((hfn) iufVar.f.io()).al(i4, true, list.size(), iSum);
                final int i5 = 1;
                return ahno.ar(((hfn) iufVar.g.io()).Z(agke.n(list)), new agek() { // from class: iuj
                    @Override // defpackage.agek
                    public final Object apply(Object obj3) {
                        if (i5 != 0) {
                            Boolean bool = (Boolean) obj3;
                            ((hfn) ((iuf) obj2).f.io()).ak(i4, Objects.equals(bool, Boolean.TRUE), list.size(), iSum);
                            return bool;
                        }
                        Boolean bool2 = (Boolean) obj3;
                        boolean zEquals = Objects.equals(bool2, Boolean.TRUE);
                        List list2 = list;
                        Object obj4 = obj2;
                        int size = list2.size();
                        ((iuo) obj4).o.ak(i4, zEquals, size, iSum);
                        return bool2;
                    }
                }, iufVar.c);
            case 3:
                agkj agkjVar = (agkj) obj;
                Stream stream = Collection.EL.stream(agkjVar.keySet());
                Object obj3 = this.b;
                return ahno.as(ahng.k((agke) stream.map(new hph(obj3, agkjVar, 9)).collect(aghu.a)), new hsx(obj3, this.a, 2), ((iuf) obj3).d);
            case 4:
                final List list2 = (List) obj;
                final int iSum2 = Collection.EL.stream(list2).mapToInt(new ddc(4)).sum();
                boolean zAnyMatch2 = Collection.EL.stream(list2).anyMatch(new iui(i2));
                final int i6 = this.a;
                final Object obj4 = this.b;
                if (zAnyMatch2) {
                    ((iuo) obj4).o.al(i6, false, list2.size(), iSum2);
                    return ahng.n(Boolean.FALSE);
                }
                iuo iuoVar = (iuo) obj4;
                iuoVar.o.al(i6, true, list2.size(), iSum2);
                final int i7 = 0;
                return ahno.ar(iuoVar.k.Z(agke.n(list2)), new agek() { // from class: iuj
                    @Override // defpackage.agek
                    public final Object apply(Object obj5) {
                        if (i7 != 0) {
                            Boolean bool = (Boolean) obj5;
                            ((hfn) ((iuf) obj4).f.io()).ak(i6, Objects.equals(bool, Boolean.TRUE), list2.size(), iSum2);
                            return bool;
                        }
                        Boolean bool2 = (Boolean) obj5;
                        boolean zEquals = Objects.equals(bool2, Boolean.TRUE);
                        List list3 = list2;
                        Object obj6 = obj4;
                        int size = list3.size();
                        ((iuo) obj6).o.ak(i6, zEquals, size, iSum2);
                        return bool2;
                    }
                }, iuoVar.c);
            case 5:
                agkj agkjVar2 = (agkj) obj;
                Stream stream2 = Collection.EL.stream(agkjVar2.keySet());
                Object obj5 = this.b;
                return ahno.as(ahng.k((agke) stream2.map(new hph(obj5, agkjVar2, 10)).collect(aghu.a)), new hsx(obj5, this.a, i), ((iuo) obj5).d);
            case 6:
                onp onpVar = (onp) this.b;
                return ahno.as(onpVar.a.e(), new onk(onpVar, (List) obj, this.a, i2), onpVar.f);
            default:
                aihf aihfVarCreateBuilder = afiu.a.createBuilder();
                int i8 = this.a;
                int i9 = i8 == -1 ? 1 : i8 + 1;
                ?? r10 = this.b;
                aihfVarCreateBuilder.copyOnWrite();
                afiu afiuVar = (afiu) aihfVarCreateBuilder.instance;
                afiuVar.b |= 1;
                afiuVar.c = i9;
                return r10.a(ahng.n((afiu) aihfVarCreateBuilder.build()));
        }
    }
}
