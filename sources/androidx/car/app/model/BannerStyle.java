package androidx.car.app.model;

import defpackage.aac;
import defpackage.aad;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class BannerStyle {
    private final Background mBackground;
    private final Shape mShape;

    private BannerStyle(aac aacVar) {
        Shape shape = aacVar.a;
        this.mShape = null;
        Background background = aacVar.b;
        this.mBackground = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerStyle) {
            BannerStyle bannerStyle = (BannerStyle) obj;
            if (Objects.equals(this.mShape, bannerStyle.mShape) && Objects.equals(this.mBackground, bannerStyle.mBackground)) {
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
        return "BannerStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ BannerStyle(aac aacVar, aad aadVar) {
        this(aacVar);
    }

    private BannerStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
