package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class iaz {
    public final abhk a;
    public final abhl b;
    public final int c;
    public ablt d;
    public final iba e;

    public iaz(abhk abhkVar, iba ibaVar) {
        abhl abhlVar = new abhl();
        abhkVar.getClass();
        this.a = abhkVar;
        ibaVar.getClass();
        this.e = ibaVar;
        this.b = abhlVar;
        this.c = abhkVar.getContext().getColor(R.color.inline_time_bar_progress_color);
        abhlVar.e = abhkVar.getContext().getColor(R.color.inline_time_bar_empty_color);
        abhlVar.f = abhkVar.getContext().getColor(R.color.inline_time_bar_buffered_color);
    }

    public static CharSequence a(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return typ.i((j + 500) / 1000, 3);
    }

    public void b() {
        throw null;
    }

    public final void c() {
        if (this.b.a > 0) {
            iba ibaVar = this.e;
            abhk abhkVar = this.a;
            ibaVar.c(a(abhkVar.w() ? abhkVar.k() : abhkVar.l(abhkVar.k.f())), a(abhkVar.p()));
        }
    }

    public final void d() {
        this.a.u(false);
        ablt abltVar = this.d;
        if (abltVar != null) {
            abltVar.b(false);
        }
    }
}
