package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avwc extends avlh {
    final avnb b;
    avwa c;

    public avwc(avnb avnbVar) {
        this.b = avnbVar;
    }

    final void a(avwa avwaVar) {
        Object obj = this.b;
        if (obj instanceof avmn) {
            ((avmn) obj).dispose();
        } else if (obj instanceof avnu) {
            ((avnu) obj).kr((avmn) avwaVar.get());
        }
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        avwa avwaVar;
        boolean z;
        synchronized (this) {
            avwaVar = this.c;
            if (avwaVar == null) {
                avwaVar = new avwa(this);
                this.c = avwaVar;
            }
            long j = avwaVar.c;
            if (j == 0) {
                j = 0;
            }
            long j2 = j + 1;
            avwaVar.c = j2;
            z = false;
            if (!avwaVar.d && j2 == 1) {
                z = true;
                avwaVar.d = true;
            }
        }
        avnb avnbVar = this.b;
        avnbVar.ap(new avwb(axspVar, this, avwaVar));
        if (z) {
            avnbVar.e(avwaVar);
        }
    }

    final void b(avwa avwaVar) {
        synchronized (this) {
            boolean z = this.b instanceof avvw;
            avwa avwaVar2 = this.c;
            if (z) {
                if (avwaVar2 != null && avwaVar2 == avwaVar) {
                    this.c = null;
                    avmn avmnVar = avwaVar.b;
                }
                long j = avwaVar.c - 1;
                avwaVar.c = j;
                if (j == 0) {
                    a(avwaVar);
                }
            } else if (avwaVar2 != null && avwaVar2 == avwaVar) {
                avmn avmnVar2 = avwaVar.b;
                long j2 = avwaVar.c - 1;
                avwaVar.c = j2;
                if (j2 == 0) {
                    this.c = null;
                    a(avwaVar);
                }
            }
        }
    }

    final void c(avwa avwaVar) {
        synchronized (this) {
            if (avwaVar.c == 0 && avwaVar == this.c) {
                this.c = null;
                avmn avmnVar = (avmn) avwaVar.get();
                avnr.b(avwaVar);
                Object obj = this.b;
                if (obj instanceof avmn) {
                    ((avmn) obj).dispose();
                } else if (obj instanceof avnu) {
                    if (avmnVar == null) {
                        avwaVar.e = true;
                    } else {
                        ((avnu) obj).kr(avmnVar);
                    }
                }
            }
        }
    }
}
