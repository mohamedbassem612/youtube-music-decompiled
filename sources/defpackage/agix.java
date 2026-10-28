package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agix implements Iterable {
    private final Iterable a;

    public agix(Iterable iterable) {
        iterable.getClass();
        this.a = iterable;
    }

    public static agix a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new agiw(iterableArr);
    }

    public static agix b(Iterable iterable) {
        return iterable instanceof agix ? (agix) iterable : new agiu(iterable, iterable);
    }

    public final agix c(agek agekVar) {
        return b(new aglo(d(), agekVar));
    }

    public final Iterable d() {
        Iterable iterable = this.a;
        return iterable != null ? iterable : this;
    }

    public final String toString() {
        return aguu.N(d());
    }

    protected agix() {
        this.a = null;
    }
}
