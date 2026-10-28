package defpackage;

import android.graphics.drawable.GradientDrawable;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adzy implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ adzy(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            GradientDrawable gradientDrawable = (GradientDrawable) obj;
            gradientDrawable.mutate();
            gradientDrawable.setCornerRadius(this.a / 2.0f);
        } else if (i == 1) {
            ((sgi) obj).t(this.a);
        } else {
            int[] iArr = aeqd.a;
            ((aeqt) ((aunn) obj).io()).b(this.a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
