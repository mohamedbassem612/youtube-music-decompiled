package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adp implements bnu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public adp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [awwd, java.lang.Object] */
    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        int i = this.$cid;
        if (i == 0) {
            afi.a();
            ((boc) this.a).c(this);
            return;
        }
        if (i == 1) {
            ((boc) this.a).c(this);
            return;
        }
        if (i == 2) {
            ((boc) this.a).c(this);
            return;
        }
        if (i == 3) {
            Object obj = this.a;
            synchronized (obj) {
                if (bogVar.equals(((mfu) obj).a)) {
                    ((mfu) obj).a(null);
                    ((mfu) obj).a(null);
                }
            }
            return;
        }
        if (i != 4) {
            ?? r4 = this.a;
            if (i != 5) {
                ((afqq) r4).a = null;
                return;
            } else {
                r4.p(null);
                return;
            }
        }
        vaq vaqVar = (vaq) this.a;
        vaqVar.b.dispose();
        List list = vaqVar.c;
        agke agkeVarN = agke.n(list);
        int size = agkeVarN.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((uzl) agkeVarN.get(i2)).a();
        }
        list.clear();
        uyb uybVar = vaqVar.d;
        if (uybVar != null) {
            uybVar.c();
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
