package defpackage;

import com.google.android.material.appbar.AppBarLayout;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ivz implements aeum {
    public int a;
    private final BiConsumer b;
    private int c = 3;

    public ivz(BiConsumer biConsumer) {
        this.b = biConsumer;
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        int i2;
        int i3 = this.a - i;
        this.a = i;
        int i4 = this.c;
        if (i == 0) {
            i2 = 1;
            this.c = 1;
        } else if (i >= appBarLayout.f()) {
            i2 = 2;
            this.c = 2;
        } else {
            this.c = 3;
            i2 = 3;
        }
        if (i4 == 3 || i2 == 3 || i2 != i4) {
            this.b.accept(Integer.valueOf(i), Integer.valueOf(i3));
        }
    }
}
