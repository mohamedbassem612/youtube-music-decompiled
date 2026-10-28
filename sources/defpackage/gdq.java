package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gdq implements adme {
    private final /* synthetic */ int $cid;
    public WeakReference a;
    private final awmd b;

    public gdq(awmd awmdVar, int i) {
        this.$cid = i;
        this.b = awmdVar;
    }

    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        int i = this.$cid;
        awmd awmdVar = this.b;
        if (i != 0) {
            rpe rpeVar = (rpe) awmdVar.io();
            rpeVar.a.setOnClickListener(new gdp(rpeVar, this.a, 1));
            return rpeVar;
        }
        rpg rpgVar = (rpg) awmdVar.io();
        rpgVar.a.setOnClickListener(new gdp(rpgVar, this.a, 0));
        return rpgVar;
    }
}
