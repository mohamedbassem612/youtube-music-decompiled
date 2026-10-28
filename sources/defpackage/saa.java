package defpackage;

import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class saa implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ saa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object, rbi] */
    /* JADX WARN: Type inference failed for: r4v54, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v55, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = 16;
        switch (this.$cid) {
            case 0:
                ((ruk) ((sac) this.a).b.io()).a((ajwo) obj, null);
                break;
            case 1:
                ((ruk) ((sac) this.a).b.io()).a((ajwo) obj, null);
                break;
            case 2:
                aehs.l(this.a, (aisu) obj);
                break;
            case 3:
                aehs.l(this.a, (aisu) obj);
                break;
            case 4:
                aehs.l(this.a, (aisu) obj);
                break;
            case 5:
                aehs.l(this.a, (aisu) obj);
                break;
            case 6:
                aehs.l(this.a, (aisu) obj);
                break;
            case 7:
                this.a.add(new sio((aivt) obj));
                break;
            case 8:
                if ((((wgj) obj).a.b & SemanticState.Obscured) == 0) {
                    rmp.k((smr) this.a, "Forecasting SASDE not found and no raw ei due to non-existent forecastAd");
                }
                break;
            case 9:
                int i2 = spv.c;
                aigj aigjVar = ((aivr) obj).b;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                aiya aiyaVar = (aiya) aihfVar.instance;
                aiya aiyaVar2 = aiya.a;
                aigjVar.getClass();
                aiyaVar.b |= 16;
                aiyaVar.g = aigjVar;
                break;
            case 10:
                ((ViewGroup) obj).addView(((sqr) this.a).a.a());
                break;
            case 11:
                ((tur) obj).a(((tus) this.a).c);
                break;
            case 12:
                ((jfk) obj).a(0, ((SwipeLayout) this.a).f);
                break;
            case 13:
                ((jfk) obj).a(0, ((SwipeLayout) this.a).f);
                break;
            case 14:
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                askg askgVar = (askg) aihfVar2.instance;
                askg askgVar2 = askg.a;
                askgVar.f = ((apsc) obj).j;
                askgVar.b |= 8;
                break;
            case 15:
                saa saaVar = new saa((UUID) obj, i);
                Optional optional = ((ufr) this.a).g;
                if (true == optional.isPresent()) {
                    optional.get().b((UUID) saaVar.a);
                }
                break;
            case 16:
                ((rbi) obj).b((UUID) this.a);
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                asjy asjyVar = (asjy) aihfVar3.instance;
                asjy asjyVar2 = asjy.a;
                asjyVar.b |= 2;
                asjyVar.d = jLongValue;
                break;
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                aoar aoarVar = (aoar) aihfVar4.instance;
                aoar aoarVar2 = aoar.a;
                aoarVar.b |= 2;
                aoarVar.d = iIntValue;
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
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
