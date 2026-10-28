package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adli implements adlz {
    private final int a;
    private final int b;

    public adli(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        adlyVar.f("grid_row_presenter_horizontal_row_padding", Integer.valueOf(this.a));
        if (i == 0) {
            adlyVar.f("grid_row_presenter_top_padding", Integer.valueOf(this.b));
            i = 0;
        }
        if (i == adkzVar.a() - 1) {
            adlyVar.f("grid_row_presenter_bottom_padding", Integer.valueOf(this.b));
        }
    }
}
