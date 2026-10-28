package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class bre extends Service {
    public bqp d;
    public MediaSessionCompat$Token f;
    public bqs g;
    public final qcb h = new qcb(this);
    final bqp a = new bqp(this, "android.media.session.MediaController", -1, -1, null);
    final ArrayList b = new ArrayList();
    public final afv c = new afv();
    public final brd e = new brd(this);

    static final List f(List list, Bundle bundle) {
        int i;
        if (list == null) {
            return null;
        }
        int i2 = -1;
        int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i3 != -1) {
            i2 = i3;
        } else if (i4 == -1) {
            return list;
        }
        if (i2 < 0 || i4 <= 0 || (i = i2 * i4) >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        int size = i4 + i;
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i, size);
    }

    public abstract bqo a(String str, int i, Bundle bundle);

    public abstract void b(String str, bra braVar);

    public void c(String str, bra braVar, Bundle bundle) {
        throw null;
    }

    public void d(String str, bra braVar) {
        throw null;
    }

    public void e(String str, Bundle bundle, bra braVar) {
        throw null;
    }

    public final void g(String str, bqp bqpVar, Bundle bundle) {
        bqk bqkVar = new bqk(this, str, bqpVar, str, bundle);
        this.d = bqpVar;
        if (bundle == null) {
            b(str, bqkVar);
        } else {
            c(str, bqkVar, bundle);
        }
        this.d = null;
        if (bqkVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + bqpVar.a + " id=" + str);
    }

    public void h(Bundle bundle, bra braVar) {
        throw null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.g.b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.g = new bqz(this);
        } else {
            this.g = new bqy(this);
        }
        this.g.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.e.a = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
