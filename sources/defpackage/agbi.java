package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.ConcreteClientCreator;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agbi implements ConcreteClientCreator {
    private final /* synthetic */ int $cid;
    private final asiu a;

    public agbi(asiu asiuVar, int i) {
        this.$cid = i;
        this.a = asiuVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final int a() {
        return this.$cid != 0 ? 635949799 : 646200271;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ String b(Object obj) {
        return this.$cid != 0 ? ((asil) obj).c : ((asim) obj).b;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ BaseClient c(long j) {
        return this.$cid != 0 ? new agbe(j) : new agbj(j);
    }

    @Override // com.google.android.libraries.blocks.runtime.ConcreteClientCreator
    public final /* synthetic */ InstanceProxy d(Object obj) {
        int i = this.$cid;
        asiu asiuVar = this.a;
        return i != 0 ? new agbh((adxp) obj, asiuVar) : new agbl((adxr) obj, asiuVar);
    }
}
