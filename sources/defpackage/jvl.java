package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvl {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final List n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        jvk jvkVar = (jvk) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - jvkVar.g()) - i);
        this.b = Math.min(this.b, (view.getTop() - jvkVar.i()) - i2);
        this.c = Math.max(this.c, view.getRight() + jvkVar.h() + i3);
        this.d = Math.max(this.d, view.getBottom() + jvkVar.f() + i4);
    }
}
