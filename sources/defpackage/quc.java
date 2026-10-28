package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quc extends qvu {
    public static final /* synthetic */ int c = 0;
    public final Set a;
    public int b;
    private final Set d;
    private final nrc e;

    public quc(quc qucVar) {
        super(qucVar);
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        HashSet hashSet2 = new HashSet();
        this.a = hashSet2;
        this.b = -16777216;
        this.e = new nrc();
        this.b = qucVar.b;
        int i = 10;
        Collection.EL.stream(qucVar.d).map(new qdi(i)).forEach(new kjk(hashSet, i));
        int i2 = 11;
        Collection.EL.stream(qucVar.a).map(new qdi(i2)).forEach(new kjk(hashSet2, i2));
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new quc(this);
    }

    public final agkz b() {
        Stream stream = Collection.EL.stream(this.d);
        nrc nrcVar = this.e;
        nrcVar.getClass();
        return (agkz) stream.map(new iuk(nrcVar, 14)).collect(aghu.b);
    }

    @Deprecated
    public final agkz c() {
        return agkz.n(this.d);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new quc(this);
    }

    public final agkz d() {
        return agkz.n(this.a);
    }

    public final Duration f() {
        Set set = this.d;
        Optional optionalMin = Collection.EL.stream(set).filter(new jor(5)).map(new qdi(8)).min(Comparator$CC.naturalOrder());
        return optionalMin.isPresent() ? ((Duration) Collection.EL.stream(set).filter(new jor(6)).map(new qdi(12)).max(Comparator$CC.naturalOrder()).get()).minus((Duration) optionalMin.get()) : Duration.ZERO;
    }

    public final void g(qvu qvuVar) {
        this.d.add(qvuVar);
    }

    public final void h(qvu qvuVar) {
        this.d.remove(qvuVar);
    }

    @Override // defpackage.qvu, defpackage.rjq
    public final Duration iu() {
        Set set = this.d;
        Optional optionalMin = Collection.EL.stream(set).map(new qdi(8)).min(Comparator$CC.naturalOrder());
        return optionalMin.isPresent() ? ((Duration) Collection.EL.stream(set).map(new qdi(9)).max(Comparator$CC.naturalOrder()).get()).minus((Duration) optionalMin.get()) : Duration.ZERO;
    }

    public quc() {
        this.d = new HashSet();
        this.a = new HashSet();
        this.b = -16777216;
        this.e = new nrc();
    }
}
