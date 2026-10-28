package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bqg {
    public int c;
    public final Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;
    public bpz j;

    public bqg(Context context) {
        this.d = context.getApplicationContext();
    }

    public static final String o(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append('}');
        }
        return sb.toString();
    }

    @Deprecated
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void j(Object obj) {
        bpz bpzVar = this.j;
        if (bpzVar != null) {
            if (bpy.c(2)) {
                Objects.toString(bpzVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                bpzVar.h(obj);
            } else {
                bpzVar.i(obj);
            }
        }
    }

    public final void n() {
        if (this.e) {
            g();
        } else {
            this.h = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }

    protected void g() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }
}
