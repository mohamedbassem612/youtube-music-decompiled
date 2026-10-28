package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmt extends ttl {
    private final int a;

    public vmt(Drawable drawable, int i) {
        super(drawable.mutate());
        this.a = i;
        mutate();
        setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable.ConstantState constantState = getCurrent().getConstantState();
        if (constantState == null) {
            return null;
        }
        return new vms(constantState, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        super.mutate();
        getCurrent().setTint(this.a);
        return this;
    }
}
