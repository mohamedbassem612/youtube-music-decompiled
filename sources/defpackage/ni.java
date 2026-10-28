package defpackage;

import android.database.Observable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ni extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qa) this.mObservers.get(size)).fQ();
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qa) this.mObservers.get(size)).fU(i, i2);
            }
        }
    }

    public final void c(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qa) this.mObservers.get(size)).fR(i, i2, obj);
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qa) this.mObservers.get(size)).fS(i, i2);
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qa) this.mObservers.get(size)).fT(i, i2);
            }
        }
    }

    public final boolean f() {
        return !this.mObservers.isEmpty();
    }
}
