package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.ConcreteClientCreator;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agcq implements ConcreteClientCreator {
    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final int a() {
        return 413795664;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ String b(Object obj) {
        return ((asub) obj).b;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ BaseClient c(long j) {
        return new agcr(j);
    }

    @Override // com.google.android.libraries.blocks.runtime.ConcreteClientCreator
    public final /* synthetic */ InstanceProxy d(Object obj) {
        return new agcs((ci) obj);
    }
}
