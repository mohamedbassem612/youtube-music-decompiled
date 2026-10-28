package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dts {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public Parcelable a() {
        return null;
    }

    public abstract boolean d(View view, Object obj);

    public abstract int g();

    public int h(Object obj) {
        return -1;
    }

    public CharSequence i(int i) {
        return null;
    }

    public Object j(ViewGroup viewGroup, int i) {
        throw null;
    }

    public void k(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    public final void l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void m(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    final void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public final void o(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    public void e() {
    }

    public void c(ViewGroup viewGroup) {
    }

    public void f(Object obj) {
    }

    public void b(Parcelable parcelable, ClassLoader classLoader) {
    }
}
