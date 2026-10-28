package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yuj implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yuj(Object obj, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            zlm zlmVar = ((yuk) this.c).a.n;
            if (zlmVar != null) {
                zlmVar.k(this.a, this.b);
                return;
            }
            return;
        }
        if (i == 1) {
            int i2 = this.b;
            ((ytv) this.c).x(this.a, i2);
            return;
        }
        if (i == 2) {
            Object obj = this.c;
            try {
                int i3 = ((zae) obj).k;
                int i4 = this.b;
                int i5 = this.a;
                if (i3 == i5 && ((zae) obj).j == i4) {
                    return;
                }
                ((zae) obj).k = i5;
                ((zae) obj).j = i4;
                ((zae) obj).n = true;
                ((zae) obj).h();
                return;
            } catch (Exception e) {
                ((zae) obj).i(e);
                return;
            }
        }
        if (i == 3) {
            int i6 = this.b;
            ((abfc) this.c).g(this.a, i6);
        } else {
            if (i == 4) {
                int i7 = this.b;
                ((abfc) this.c).g(this.a, i7);
                return;
            }
            RecyclerView recyclerView = (RecyclerView) ((adsr) this.c).l;
            Object obj2 = recyclerView.n;
            boolean z = obj2 instanceof adwy;
            int i8 = this.a;
            if (!z) {
                recyclerView.aj(i8);
            } else {
                ((adwy) obj2).c(recyclerView, i8, this.b);
            }
        }
    }
}
