package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avnb extends avlh {
    public final avlh b(int i, avni avniVar) {
        if (i <= 0) {
            e(avniVar);
            avnn avnnVar = atqp.k;
            return this;
        }
        avrn avrnVar = new avrn(this, avniVar);
        avnn avnnVar2 = atqp.j;
        return avrnVar;
    }

    public final avlh c() {
        if (this instanceof avvw) {
            avvw avvwVar = (avvw) this;
            avvz avvzVar = new avvz(avvwVar.b, avvwVar.d);
            avnn avnnVar = atqp.k;
            this = avvzVar;
        }
        avwc avwcVar = new avwc(this);
        avnn avnnVar2 = atqp.j;
        return avwcVar;
    }

    public abstract void e(avni avniVar);

    public final avlh kq(int i) {
        return b(i, avoi.d);
    }
}
