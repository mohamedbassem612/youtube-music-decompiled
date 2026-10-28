package defpackage;

import android.widget.ListAdapter;
import android.widget.TextView;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abfu implements IntConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abfu(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.$cid;
        Object obj = this.a;
        if (i2 != 0) {
            ((TextView) obj).setTextAppearance(i);
            ((TextView) this.b).setTextAppearance(i);
            return;
        }
        hyh hyhVar = (hyh) ((abfv) obj).b;
        hxs hxsVar = hyhVar.c;
        Object obj2 = hxsVar.k;
        Object obj3 = this.b;
        if (obj2 != obj3 || hxsVar.l != i) {
            hxsVar.k = (wgo[]) obj3;
            hxsVar.l = i;
            ListAdapter listAdapter = hxsVar.r;
            if (listAdapter != null) {
                ((adyd) listAdapter).notifyDataSetChanged();
            }
        }
        String str = null;
        if (obj3 != null && i >= 0) {
            wgo[] wgoVarArr = (wgo[]) obj3;
            if (i < wgoVarArr.length) {
                str = wgoVarArr[i].b;
            }
        }
        hyhVar.d.f(str);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return this.$cid != 0 ? IntConsumer$CC.$default$andThen(this, intConsumer) : IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
