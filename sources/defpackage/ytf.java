package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ytf {
    public final Object a;
    public final List b;
    public final List c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ytf() {
        lqa lqaVar = new lqa((char[]) null, (byte[]) null, (byte[]) null);
        this.g = lqaVar;
        this.d = Optional.empty();
        this.e = new ArrayList();
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.f = new ArrayList();
        lqaVar.N(0);
    }

    private static ywn i(zgm zgmVar, String str, zjr zjrVar) {
        zgj zgjVarC = zgmVar.c(str);
        if (zgjVarC == null) {
            return null;
        }
        return ywl.B(new Handler(Looper.getMainLooper()), zgjVarC, ywj.c, zjrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ywn] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final ywn a() {
        ?? r1;
        synchronized (this.a) {
            Object obj = this.d;
            r1 = obj;
            if (obj == null) {
                r1 = ywn.b;
            }
        }
        return r1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ywn] */
    public final void b(zjr zjrVar) {
        synchronized (this.a) {
            if (this.d != null) {
                return;
            }
            ywn ywnVarI = i((zgm) this.f, (String) this.e, zjrVar);
            this.d = ywnVarI;
            if (ywnVarI == null) {
                yti.b("OnesieQoeReporter: No Qoe Client.");
                return;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                this.d.k((zhz) it.next());
            }
            for (yte yteVar : this.b) {
                this.d.l(yteVar.a, yteVar.b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ywn] */
    public final void c(zhz zhzVar) {
        synchronized (this.a) {
            ?? r1 = this.d;
            if (r1 != 0) {
                r1.k(zhzVar);
            } else {
                this.c.add(zhzVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ywn] */
    public final void d(IOException iOException) {
        synchronized (this.a) {
            zhz zhzVarP = ((hed) this.g).p(zhw.b, iOException, null, null, null, 0L, false, false);
            zhzVarP.p();
            ?? r0 = this.d;
            if (r0 != 0) {
                r0.k(zhzVarP);
            } else {
                this.c.add(zhzVarP);
            }
        }
    }

    public final void e(String str, Exception exc) {
        synchronized (this.a) {
            zhz zhzVar = new zhz(zhw.b, str, 0L, exc);
            zhzVar.p();
            c(zhzVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ywn] */
    public final void f(String str, String str2) {
        synchronized (this.a) {
            ?? r1 = this.d;
            if (r1 != 0) {
                r1.w(str, str2);
            } else {
                this.b.add(new yte(str, str2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final YouTubeTextView g(int i) {
        return (YouTubeTextView) ((View) this.a.get(i)).findViewById(R.id.term_text);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final List h(int i) {
        ?? r1 = this.e;
        return i < r1.size() ? (List) r1.get(i) : new ArrayList();
    }

    public ytf(zgm zgmVar, String str, hed hedVar, zjr zjrVar) {
        this.a = new Object();
        this.f = zgmVar;
        this.e = str;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = hedVar;
        this.d = i(zgmVar, str, zjrVar);
    }
}
