package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class duz implements Runnable {
    private final /* synthetic */ int $cid;
    private final int a;
    private final Object b;

    public duz(Collection collection, int i, int i2) {
        this.$cid = i2;
        azs.m(collection, "initCallbacks cannot be null");
        this.b = new ArrayList(collection);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((RecyclerView) this.b).aj(this.a);
            return;
        }
        ?? r1 = this.b;
        if (i != 1) {
            ((TextView) r1).setText(this.a);
            return;
        }
        int i2 = this.a;
        int size = r1.size();
        int i3 = 0;
        if (i2 != 1) {
            while (i3 < size) {
                ((ato) r1.get(i3)).i();
                i3++;
            }
        } else {
            while (i3 < size) {
                ((ato) r1.get(i3)).h();
                i3++;
            }
        }
    }

    public duz(TextView textView, int i, int i2) {
        this.$cid = i2;
        this.b = textView;
        this.a = i;
    }

    public duz(int i, RecyclerView recyclerView, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = recyclerView;
    }
}
