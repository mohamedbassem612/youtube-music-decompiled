package defpackage;

import com.google.android.apps.youtube.music.watch.WatchFragment;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hwp implements hyy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hwp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.hyy
    public final void a(hyw hywVar) {
        int i = this.$cid;
        if (i == 0) {
            ((hwr) this.a).b(hywVar);
        } else if (i == 1) {
            ((hwm) this.a).b(hywVar);
        } else {
            ((WatchFragment) this.a).j(Optional.ofNullable(hywVar));
        }
    }
}
