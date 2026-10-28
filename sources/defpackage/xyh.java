package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyh {
    private boolean a;
    private boolean b;
    private byte c;

    public final xzt a() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = ~this.c;
        return new xzt(1 == (((i & 1) ^ 1) & (z ? 1 : 0)), ((i & 4) == 0) & z2, 1);
    }

    public final void b() {
        this.a = true;
        this.c = (byte) (this.c | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 4);
    }

    public final umt d() {
        if (this.c == 3) {
            return new umt(this.b, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" initFiltersForEditorV2");
        }
        if ((this.c & 2) == 0) {
            sb.append(" getAssetBasedFilterPickerEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e() {
        this.a = true;
        this.c = (byte) (this.c | 2);
    }

    public final void f() {
        this.b = true;
        this.c = (byte) (this.c | 1);
    }
}
