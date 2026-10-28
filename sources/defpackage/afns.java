package defpackage;

import com.google.android.libraries.blocks.Container;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afns implements bnu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public afns(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        int i = this.$cid;
        if (i == 0) {
            ((auor) this.a).a();
            return;
        }
        if (i == 1) {
            bogVar.getLifecycle().c(this);
            ((Container) this.a).d();
            return;
        }
        Object obj = this.a;
        if (i != 2) {
            ((auor) obj).a();
        } else {
            ((auor) obj).a();
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
