package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adsk implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adsk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [aunn, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((mav) obj).b(((adsr) this.a).G);
            return;
        }
        if (i == 1) {
            ((mav) obj).b(((adsr) this.a).K);
            return;
        }
        if (i == 2) {
            amjx amjxVar = ((aech) obj).a;
            ((aecj) this.a).h(null);
            return;
        }
        if (i == 3) {
            ((mav) obj).b((BaseClient) this.a);
            return;
        }
        if (i == 4) {
            agkz agkzVar = aeho.a;
            ((abte) this.a).d((xfh) obj, alai.FLOW_TYPE_WEB_VIEW);
            return;
        }
        if (i == 5) {
            agkz agkzVar2 = aeho.a;
            ((abte) this.a).b((xfh) obj, alai.FLOW_TYPE_WEB_VIEW);
            return;
        }
        adyu adyuVar = new adyu((apft) obj, 8);
        Optional optional = ((aeqd) this.a).s;
        optional.isPresent();
        ((aeqt) optional.get().io()).d((apft) adyuVar.a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 3) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 4) {
            return i != 5 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
