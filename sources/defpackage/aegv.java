package defpackage;

import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aegv implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aegv(Object obj, String str, int i, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        if (this.$cid == 0) {
            int i = this.b;
            ((aehd) this.c).l(this.a, null, i);
            return;
        }
        zfp zfpVar = (zfp) obj;
        Object obj2 = this.c;
        zfj zfjVar = (zfj) obj2;
        Lock lock = zfjVar.a;
        lock.lock();
        int i2 = this.b;
        String str = this.a;
        try {
            zfi zfiVar = (zfi) ((zfj) obj2).i.get(str);
            if (zfiVar == null) {
                lock.unlock();
                return;
            }
            zfiVar.d = null;
            if (zfpVar.a()) {
                zfiVar.f = 3;
                zfiVar.c.incrementAndGet();
                if (zfiVar.b.a()) {
                    zfiVar.b = zfpVar;
                }
            } else {
                zfiVar.f = 2;
                zfiVar.c.set(0);
                zfiVar.b = zfpVar;
            }
            ((zfj) obj2).k(zik.aB(((zfj) obj2).b.aa(), zfiVar.c.get(), ((zfj) obj2).h), zfiVar, str, i2);
            zfjVar.a.unlock();
        } catch (Throwable th) {
            zfjVar.a.unlock();
            throw th;
        }
    }
}
