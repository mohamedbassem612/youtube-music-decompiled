package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vtu implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vtu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tut] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tut] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.accounts.AccountManagerFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [absr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.avnd
    public final void a() {
        switch (this.$cid) {
            case 0:
                this.a.a();
                break;
            case 1:
                this.a.a();
                break;
            case 2:
                ((avmm) this.a).b();
                break;
            case 3:
                avnr.b((AtomicReference) this.a);
                break;
            case 4:
                avnr.b((AtomicReference) this.a);
                break;
            case 5:
                avnr.b((AtomicReference) this.a);
                break;
            case 6:
                yqo yqoVar = (yqo) this.a;
                if (!yqoVar.j.get()) {
                    yqoVar.o.W();
                    yqoVar.d();
                }
                break;
            case 7:
                yqo yqoVar2 = (yqo) this.a;
                if (!yqoVar2.j.get()) {
                    yqoVar2.o.W();
                    yqoVar2.d();
                }
                break;
            case 8:
                Object obj = ((ysf) this.a).h;
                if (obj != null) {
                    avnr.b((AtomicReference) obj);
                }
                break;
            case 9:
                this.a.a();
                break;
            case 10:
                this.a.cancel(true);
                break;
            case 11:
                ((aany) this.a).c();
                break;
            case 12:
                this.a.b(3);
                break;
            case 13:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((zgj) obj2).e();
                }
                break;
            case 14:
                ((acft) this.a).a();
                break;
            case 15:
                Object obj3 = this.a;
                ((acoi) obj3).W.kk(Boolean.TRUE);
                break;
            case 16:
                this.a.invoke();
                break;
            case 17:
                ((aczv) this.a).A(true);
                break;
            case 18:
                this.a.run();
                break;
            case 19:
                ((ResourceLoader) ahng.v(this.a)).cacheResources();
                break;
            default:
                ((adbr) this.a).c.clear();
                break;
        }
    }
}
