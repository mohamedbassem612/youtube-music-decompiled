package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.JavaRuntime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hop implements JavaRuntime.InstanceProxyFactory {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public hop(hoq hoqVar, int i) {
        this.$cid = i;
        this.a = hoqVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.InstanceProxyFactory
    public final InstanceProxy a(may mayVar) {
        InstanceProxy agaaVar;
        int i = this.$cid;
        if (i == 0) {
            agaaVar = new agaa(((jmm) ((hoq) this.a).a).a(mayVar));
        } else if (i == 1) {
            agaaVar = new afyn(((abzi) ((hoq) this.a).a).c(mayVar));
        } else {
            if (i == 2) {
                return new agbu(((xsc) ((hoq) this.a).a).I());
            }
            Object obj = this.a;
            if (i != 3) {
                return new afzo(((elq) ((hoq) obj).a).C());
            }
            agaaVar = new afzn(((qcb) ((hoq) obj).a).u(mayVar));
        }
        return agaaVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.InstanceProxyFactory
    public final InstanceProxy b(may mayVar) {
        InstanceProxy agaaVar;
        int i = this.$cid;
        if (i == 0) {
            agaaVar = new agaa(((jmm) ((hoq) this.a).a).a(mayVar));
        } else if (i == 1) {
            agaaVar = new afyn(((abzi) ((hoq) this.a).a).c(mayVar));
        } else {
            if (i == 2) {
                return new agbu(((xsc) ((hoq) this.a).a).I());
            }
            Object obj = this.a;
            if (i != 3) {
                return new afzo(((elq) ((hoq) obj).a).C());
            }
            agaaVar = new afzn(((qcb) ((hoq) obj).a).u(mayVar));
        }
        return agaaVar;
    }
}
