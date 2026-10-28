package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.AbstractList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rme implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rme(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v37, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agjz) this.a).h((afhq) obj);
                break;
            case 1:
                Iterable$EL.forEach(((rjg) obj).a, new rcp(this.a, 20));
                break;
            case 2:
                ((rqt) this.a).l(obj);
                break;
            case 3:
                ((rqt) this.a).c().addAll((List) obj);
                break;
            case 4:
                ((AbstractList) this.a).add(obj);
                break;
            case 5:
                ((tbm) this.a).addAll(((wns) obj).d());
                break;
            case 6:
                ((tbm) this.a).addAll((List) obj);
                break;
            case 7:
                ((rsq) obj).h((aazs) this.a);
                break;
            case 8:
                ((rsq) obj).e((aaxa) this.a);
                break;
            case 9:
                ((rsq) obj).e((aaxa) this.a);
                break;
            case 10:
                aazj aazjVar = (aazj) this.a;
                String str = aazjVar.h;
                String str2 = aazjVar.g;
                ((rsq) obj).l(aazjVar.a, aazjVar.b, aazjVar.f, str2, str);
                break;
            case 11:
                ((rsq) obj).k((aayw) this.a);
                break;
            case 12:
                ((rsq) obj).j((aayt) this.a);
                break;
            case 13:
                ((rsq) obj).f((zhz) this.a);
                break;
            case 14:
                ((rsq) obj).i((String) this.a);
                break;
            case 15:
                ((rsq) obj).g((aazp) this.a);
                break;
            case 16:
                apji apjiVar = (apji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aisw.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                ((ryi) this.a).b = (aisu) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                break;
            case 17:
                ((ruk) this.a).a((ajwo) obj, null);
                break;
            case 18:
                this.a.cancel(false);
                break;
            case 19:
                agrf agrfVar = tsl.a;
                this.a.invoke(obj);
                break;
            default:
                agrf agrfVar2 = tsl.a;
                this.a.invoke(obj);
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
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
