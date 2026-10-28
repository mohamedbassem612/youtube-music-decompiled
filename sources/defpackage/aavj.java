package defpackage;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aavj implements Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aavj(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [aglz, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$cid) {
            case 0:
                ((igp) obj).c();
                break;
            case 1:
                ((ygu) obj).k();
                break;
            case 2:
                ((ytv) ((abep) obj).a).q();
                break;
            case 3:
                long j = achr.a;
                ((achv) obj).g();
                break;
            case 4:
                snu snuVar = (snu) obj;
                ArrayList arrayList = new ArrayList();
                Object obj2 = snuVar.b;
                Iterator it = ((scx) obj2).d.at().iterator();
                while (it.hasNext()) {
                    aizs aizsVar = ((snl) it.next()).b;
                    int i = aizsVar.e;
                    aixr aixrVarA = aixr.a(i);
                    if (aixrVarA == null) {
                        aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                    }
                    if (aixrVarA != aixr.TRIGGER_TYPE_MINI_APP_ABANDONED) {
                        aixr aixrVarA2 = aixr.a(i);
                        if (aixrVarA2 == null) {
                            aixrVarA2 = aixr.TRIGGER_TYPE_UNSPECIFIED;
                        }
                        if (aixrVarA2 == aixr.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED) {
                        }
                    }
                    arrayList.add(aizsVar);
                }
                ((scr) obj2).t(arrayList);
                snuVar.a.r();
                break;
            case 5:
                ((acnj) obj).g();
                break;
            case 6:
                ((aeqv) obj).b();
                break;
            case 7:
                ((aeqv) obj).c();
                break;
            case 8:
                ((aeqv) obj).a();
                break;
            case 9:
                ((aeqv) obj).d();
                break;
            case 10:
                ((afkc) obj).a();
                break;
            case 11:
                int i2 = afuf.b;
                ((afvw) obj).a();
                break;
            default:
                ((afvw) obj).a();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
