package androidx.car.app.model;

import defpackage.aap;
import defpackage.aaq;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CondensedItemStyle {
    private final Background mBackground;
    private final Shape mShape;

    private CondensedItemStyle(aap aapVar) {
        Shape shape = aapVar.a;
        this.mShape = null;
        Background background = aapVar.b;
        this.mBackground = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedItemStyle) {
            CondensedItemStyle condensedItemStyle = (CondensedItemStyle) obj;
            if (Objects.equals(this.mShape, condensedItemStyle.mShape) && Objects.equals(this.mBackground, condensedItemStyle.mBackground)) {
                return true;
            }
        }
        return false;
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mBackground);
    }

    public String toString() {
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ CondensedItemStyle(aap aapVar, aaq aaqVar) {
        this(aapVar);
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
