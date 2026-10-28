package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xkg implements xkf {
    private final Iterable a;

    public xkg(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.xkf
    public final void a() {
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xkf) agqsVarListIterator.next()).a();
        }
    }

    @Override // defpackage.xkf
    public final void b() {
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xkf) agqsVarListIterator.next()).b();
        }
    }

    @Override // defpackage.xkf
    public final void c(amiu amiuVar) {
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xkf) agqsVarListIterator.next()).c(amiuVar);
        }
    }

    @Override // defpackage.xkf
    public final void d(amix amixVar) {
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xkf) agqsVarListIterator.next()).d(amixVar);
        }
    }

    @Override // defpackage.xkf
    public final void e(long j) {
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xkf) agqsVarListIterator.next()).e(j);
        }
    }

    @Override // defpackage.xkf
    public final void f(String str, long j) {
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ((xkf) agqsVarListIterator.next()).f(str, j);
        }
    }
}
