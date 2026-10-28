package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooc implements ont {
    private final /* synthetic */ int $cid;
    final /* synthetic */ agev a;
    final /* synthetic */ Context b;

    public ooc(agev agevVar, Context context, int i) {
        this.$cid = i;
        this.a = agevVar;
        this.b = context;
    }

    @Override // defpackage.ont
    public final void a(String str, int i) {
        if (this.$cid != 0) {
            if (i == 1) {
                qnl.bk(this.b, (Class) ((agfa) this.a).a, str);
                return;
            }
            return;
        }
        if (i == 1) {
            qnl.bk(this.b, (Class) ((agfa) this.a).a, str);
        }
    }

    @Override // defpackage.ont
    public final void b(String str, int i) {
        if (this.$cid != 0) {
            if (i == 0) {
                qnl.bl(this.b, (Class) ((agfa) this.a).a, str);
                return;
            }
            return;
        }
        if (i == 0) {
            qnl.bl(this.b, (Class) ((agfa) this.a).a, str);
        }
    }
}
