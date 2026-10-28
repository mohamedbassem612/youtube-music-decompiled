package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhq extends aihf implements auht {
    public auhq() {
        super(auhs.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        auhs auhsVar = (auhs) this.instance;
        auhs auhsVar2 = auhs.a;
        auhsVar.a();
        aifs.addAll(iterable, auhsVar.e);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        auhs auhsVar = (auhs) this.instance;
        auhs auhsVar2 = auhs.a;
        auhsVar.d();
        aifs.addAll(iterable, auhsVar.d);
    }

    public final void c(Iterable iterable) {
        copyOnWrite();
        auhs auhsVar = (auhs) this.instance;
        auhs auhsVar2 = auhs.a;
        auhsVar.e();
        aifs.addAll(iterable, auhsVar.f);
    }

    public final void d(augy augyVar) {
        copyOnWrite();
        auhs auhsVar = (auhs) this.instance;
        auhs auhsVar2 = auhs.a;
        augyVar.getClass();
        auhsVar.d();
        auhsVar.d.add(augyVar);
    }

    public final void e(aufs aufsVar) {
        copyOnWrite();
        auhs auhsVar = (auhs) this.instance;
        auhs auhsVar2 = auhs.a;
        aufsVar.getClass();
        auhsVar.e();
        auhsVar.f.add(aufsVar);
    }
}
