package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.ClientCreator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afyw implements ClientCreator {
    private final /* synthetic */ int $cid;

    public afyw(int i) {
        this.$cid = i;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final int a() {
        int i = this.$cid;
        if (i == 0) {
            return 627236065;
        }
        if (i != 1) {
            return i != 2 ? 396874703 : 824631238;
        }
        return 636620586;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ String b(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((asco) obj).b;
        }
        if (i != 1) {
            return i != 2 ? ((asuk) obj).b : ((asdo) obj).b;
        }
        return ((asbo) obj).c;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ BaseClient c(long j) {
        int i = this.$cid;
        if (i == 0) {
            return new afyx(j);
        }
        if (i != 1) {
            return i != 2 ? new agcu(j) : new afzg(j);
        }
        return new afyj(j);
    }
}
