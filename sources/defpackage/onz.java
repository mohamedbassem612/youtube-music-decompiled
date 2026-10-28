package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class onz implements qqz, oyz {
    public final HashMap a = new HashMap();

    public onz(Executor executor) {
        new ahfg(executor);
    }

    @Override // defpackage.qqz
    public final qqy a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.qqz
    public final qqy b(Uri uri) {
        synchronized (onz.class) {
            HashMap map = this.a;
            if (map.get(uri) == null) {
                return null;
            }
            return (qqy) map.get(uri);
        }
    }

    @Override // defpackage.oyz
    public final void e() {
        synchronized (onz.class) {
            Iterator it = this.a.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    @Override // defpackage.oyz
    public final void c() {
    }

    @Override // defpackage.oyz
    public final void d() {
    }

    @Override // defpackage.qqz
    public final void f() {
    }
}
