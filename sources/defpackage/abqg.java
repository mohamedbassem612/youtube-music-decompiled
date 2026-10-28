package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abqg implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abqg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [absr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                break;
            case 1:
                this.a.invoke(obj);
                break;
            case 2:
                this.a.invoke(obj);
                break;
            case 3:
                aazo aazoVar = (aazo) this.a;
                alyi alyiVar = (alyi) obj;
                agqr it = ((agqj) aazoVar.a).iterator();
                while (it.hasNext()) {
                    xsc xscVar = (xsc) it.next();
                    aqdr aqdrVarA = aqdr.a(alyiVar.h);
                    if (aqdrVarA == null) {
                        aqdrVarA = aqdr.STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN;
                    }
                    if (aqdrVarA == aqdr.STREAMING_WATCH_RESPONSE_TYPE_AD_WATCH_NEXT_RESPONSE) {
                        ahno.ao(new abaq(xscVar, alyiVar, 19), aazoVar.b);
                    }
                }
                break;
            case 4:
                ((AtomicBoolean) this.a).set(true);
                break;
            case 5:
                ((ahgr) this.a).g((avmn) obj);
                break;
            case 6:
                xgj xgjVar = new xgj(xhb.b(74726));
                xgn xgnVar = ((abry) this.a).a;
                xgnVar.l(xgjVar);
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
                break;
            case 7:
                ((abry) this.a).b = ((aayp) obj).b;
                break;
            default:
                this.a.b(2);
                break;
        }
    }
}
