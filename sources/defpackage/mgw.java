package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.JavaRuntime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgw implements JavaRuntime.InstanceProxyFactory {
    private final /* synthetic */ int $cid;

    public mgw(int i) {
        this.$cid = i;
    }

    @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.InstanceProxyFactory
    public final InstanceProxy a(may mayVar) {
        int i = this.$cid;
        if (i == 0) {
            return new agbz(new agcg());
        }
        if (i == 1) {
            return new agby(new agca(mayVar));
        }
        if (i == 2) {
            return new afzi(new afzh(mayVar), vqk.a);
        }
        if (i != 3) {
            return i != 4 ? new agbr(new agcl(mayVar, (byte[]) null)) : new agck(new agcl(mayVar));
        }
        return new agai();
    }

    @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.InstanceProxyFactory
    public final InstanceProxy b(may mayVar) {
        int i = this.$cid;
        if (i == 0) {
            return new agbz(new agcg());
        }
        if (i == 1) {
            return new agby(new agca(mayVar));
        }
        if (i == 2) {
            return new afzi(new afzh(mayVar), vqk.a);
        }
        if (i != 3) {
            return i != 4 ? new agbr(new agcl(mayVar, (byte[]) null)) : new agck(new agcl(mayVar));
        }
        return new agai();
    }
}
