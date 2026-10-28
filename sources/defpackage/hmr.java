package defpackage;

import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hmr implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hmr(hmt hmtVar, String str, int i) {
        this.$cid = i;
        this.a = hmtVar;
        this.b = str;
        this.c = "FEoffline_songs";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [abun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                boolean zContains = ((annv) ((weh) obj)).f().contains(this.b);
                Object obj2 = this.c;
                if (true == zContains) {
                    obj2 = "FEoffline_nma_tracks";
                }
                ajwo ajwoVarB = vxh.b((String) obj2);
                Object obj3 = this.a;
                jio jioVarE = jin.e();
                gmj gmjVar = ((hmt) obj3).n;
                cf cfVar = (cf) gmjVar.f;
                ((jik) jioVarE).k(cfVar.getText(R.string.snackbar_adding_to_offline));
                jioVarE.l(cfVar.getText(R.string.action_view), new gdp(gmjVar, ajwoVarB, 7));
                ((jin) gmjVar.b).d(jioVarE.b());
                break;
            case 1:
                ((gvy) this.a).g((aofx) this.b, this.c, (aoia) obj);
                break;
            case 2:
                ((aha) ((ahgb) this.a).e).put(obj, Integer.valueOf(hmy.p((String) this.b, obj) - 1));
                this.c.add(obj);
                break;
            case 3:
                ((sac) this.a).d((sgp) this.b, (smr) this.c, (sko) obj);
                break;
            case 4:
                ((sac) this.a).c((sgp) this.b, (smr) this.c, (sko) obj);
                break;
            case 5:
                aftj aftjVar = (aftj) this.c;
                aftjVar.g((String) obj);
                ((xiv) this.b).c.c(aftjVar.e(), ((xiu) this.a).c);
                break;
            case 6:
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                ?? r0 = this.b;
                Object obj4 = this.c;
                abvs abvsVar = (abvs) obj4;
                abvsVar.g.put(r0.e(), listenableFuture);
                abvsVar.c("prefetch_triggered", (abul) this.a, r0);
                if (!r0.d().equals(abvz.class)) {
                    taf.i(listenableFuture, abvsVar.f.aS() ? MoreExecutors.directExecutor() : abvsVar.e, new ztb(17), new yqj(obj4, 12), null);
                }
                abvsVar.l = false;
                break;
            default:
                Object obj5 = this.a;
                Object obj6 = this.c;
                ((actr) ((hqd) this.b).a).c(Optional.of(obj5), (ajwo) obj, (String) obj6);
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
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hmr(abvs abvsVar, abun abunVar, abul abulVar, int i) {
        this.$cid = i;
        this.c = abvsVar;
        this.b = abunVar;
        this.a = abulVar;
    }

    public /* synthetic */ hmr(hqd hqdVar, acqz acqzVar, String str, int i) {
        this.$cid = i;
        this.b = hqdVar;
        this.a = acqzVar;
        this.c = str;
    }

    public /* synthetic */ hmr(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hmr(xiv xivVar, aftj aftjVar, xiu xiuVar, int i) {
        this.$cid = i;
        this.b = xivVar;
        this.c = aftjVar;
        this.a = xiuVar;
    }
}
