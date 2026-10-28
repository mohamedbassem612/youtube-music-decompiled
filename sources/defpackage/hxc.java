package defpackage;

import java.util.Observable;
import java.util.Observer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxc implements Observer {
    final /* synthetic */ hxd a;

    public hxc(hxd hxdVar) {
        this.a = hxdVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        this.a.b();
    }
}
