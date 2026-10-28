package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avjp extends avjn {
    @Override // defpackage.avjn
    public final boolean a(avjq avjqVar) {
        synchronized (avjqVar) {
            if (avjqVar.a != 0) {
                return false;
            }
            avjqVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.avjn
    public final void b(avjq avjqVar) {
        synchronized (avjqVar) {
            avjqVar.a = 0;
        }
    }
}
