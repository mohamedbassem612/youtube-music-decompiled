package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.ConcreteClientCreator;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afzb implements ConcreteClientCreator {
    private final /* synthetic */ int $cid;

    public afzb(int i) {
        this.$cid = i;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final int a() {
        switch (this.$cid) {
            case 0:
                return 733596004;
            case 1:
                return 628512363;
            case 2:
                return 379736582;
            case 3:
                return 378759481;
            case 4:
                return 485924853;
            case 5:
                return 379756180;
            case 6:
                return 484588918;
            case 7:
                return 777393138;
            case 8:
                return 654867126;
            default:
                return 505726614;
        }
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ String b(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((asdh) obj).b;
            case 1:
                return ((arfz) obj).c;
            case 2:
                return ((asgi) obj).c;
            case 3:
                return ((asgu) obj).b;
            case 4:
                return ((asgv) obj).c;
            case 5:
                return ((ashi) obj).c;
            case 6:
                return ((ashj) obj).c;
            case 7:
                return ((asid) obj).c;
            case 8:
                return ((asin) obj).c;
            default:
                return ((aspf) obj).b;
        }
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* synthetic */ BaseClient c(long j) {
        switch (this.$cid) {
            case 0:
                return new afzc(j);
            case 1:
                return new afyh(j);
            case 2:
                return new agal(j);
            case 3:
                return new agan(j);
            case 4:
                return new agap(j);
            case 5:
                return new agar(j);
            case 6:
                return new agau(j);
            case 7:
                return new agbc(j);
            case 8:
                return new agbm(j);
            default:
                return new agcc(j);
        }
    }

    @Override // com.google.android.libraries.blocks.runtime.ConcreteClientCreator
    public final /* synthetic */ InstanceProxy d(Object obj) {
        switch (this.$cid) {
            case 0:
                return new afze((vcl) obj);
            case 1:
                return new afyi((qcb) obj);
            case 2:
                return new agam((aamo) obj);
            case 3:
                return new agao((aazy) obj);
            case 4:
                return new agaq((aazz) obj);
            case 5:
                return new agas((agat) obj);
            case 6:
                return new agav((agaw) obj);
            case 7:
                return new agbd((ahud) obj);
            case 8:
                return new agbn((auym) obj);
            default:
                return new agcd((agce) obj);
        }
    }
}
