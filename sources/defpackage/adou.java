package defpackage;

import app.rive.ImageAsset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adou implements adox {
    public final ImageAsset a;

    public /* synthetic */ adou(ImageAsset imageAsset) {
        this.a = imageAsset;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof adou) && awrc.c(this.a, ((adou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Image(asset=" + this.a + ')';
    }
}
