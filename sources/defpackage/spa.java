package defpackage;

import android.os.Looper;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class spa {
    public boolean a;
    public final Object b;

    public spa(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a() {
        b(false);
        ((TextView) this.b).setText("");
    }

    public final void b(boolean z) {
        this.a = z;
        TextView textView = (TextView) this.b;
        textView.setClickable(z);
        textView.setEnabled(z);
        textView.setCompoundDrawablePadding(z ? (int) (textView.getResources().getDisplayMetrics().density * 6.0f) : 0);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, z ? R.drawable.ad_choices_instream_icon : 0, 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final szu c() {
        return new szu(this.b, this.a);
    }

    public final void d() {
        this.a = true;
    }

    public final void e() {
        ((AtomicInteger) this.b).decrementAndGet();
    }

    public final void f() {
        if (this.a && Looper.myLooper() != Looper.getMainLooper()) {
            zvp.a(zvn.b, zvm.f, "Medialib event happened off main thread");
        }
        ((AtomicInteger) this.b).incrementAndGet();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void g(boolean z) {
        if (this.a != z) {
            this.a = z;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((tap) it.next()).a();
            }
        }
    }

    public spa(TextView textView) {
        this.b = textView;
        a();
    }

    public spa(Executor executor) {
        this.a = false;
        this.b = executor;
    }

    public spa() {
        this.b = new AtomicInteger();
    }
}
